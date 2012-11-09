package iTrace.presentation;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.edit.command.CreateChildCommand;
import org.eclipse.emf.edit.command.DragAndDropCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.ui.dnd.EditingDomainViewerDropAdapter;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.dnd.DND;
import org.eclipse.swt.dnd.DropTargetEvent;

import iTrace.Artefact;
import iTrace.M2MLink;
import iTrace.SourceElement;
import iTrace.TargetElement;
import iTrace.TraceLinkElement;
import iTrace.SourceElement;
import iTrace.Model;
import iTrace.TargetElement;
import iTrace.TraceLink;
import iTrace.iTraceModel;
import iTrace.ITracePackage;
import iTrace.impl.TraceLinkImpl;
import iTrace.impl.ITraceFactoryImpl;

public class ITraceDragDrop extends EditingDomainViewerDropAdapter {
	
	final static int NULL_SELECTION = -1;
	final static int DEFAULT_SELECTION = 0;
	final static int SOURCE_ELEMENT = 1;
	final static int TARGET_ELEMENT = 2;
	
	private ResourceSet sourceRs;
	private ResourceSet targetRs;
	private EObject aTargetObj = null;
	private EObject aSource = null;
	private String elementModel;
	private int selectionType;
	private ITraceFactoryImpl iTraceFactory;

	public ITraceDragDrop(EditingDomain domain, Viewer viewer, ResourceSet sourceRs, ResourceSet targetRs) {
		super(domain, viewer);
		this.sourceRs = sourceRs;
		this.targetRs = targetRs;
		this.iTraceFactory = new ITraceFactoryImpl();
	}
	
	/**
	   * This method is called the same way for each of the
	   * {@link org.eclipse.swt.dnd.DropTargetListener} methods, except for leave
	   * and drop.  If the source is available early, it creates or revalidates
	   * the {@link DragAndDropCommand}, and updates the event's detail (operation)
	   * and feedback (drag under effect), appropriately.
	   */
	  protected void helper(DropTargetEvent event)
	  {
		event.detail = DND.DROP_NONE;
		selectionType = DEFAULT_SELECTION;
		// If we can't do anything else, we'll provide the default select
		// feedback and enable auto-scroll and auto-expand effects.
		event.feedback = DND.FEEDBACK_SELECT | getAutoFeedback();
		// gets the source
		source = getDragSource(event);
		aSource = (EObject) source.iterator().next();
		// gets the target
		Object aObj = extractDropTarget(event.item);
		if (aObj instanceof EObject){        	
			aTargetObj = (EObject)aObj;
			//Different elements:
			if (!aSource.eResource().getURI().equals(aTargetObj.eResource().getURI())){	
				if(aTargetObj instanceof TraceLinkImpl){
					boolean input = false;
					for (int i=0;i<sourceRs.getResources().size();i++){
						if (aSource.eResource().equals(sourceRs.getResources().get(i))){
							input = true;
							elementModel = sourceRs.getResources().get(i).getURI().toString();
						}
					}
					if(input){
						selectionType = SOURCE_ELEMENT;
					}else{
						for (int i=0;i<targetRs.getResources().size();i++){
							if (aSource.eResource().equals(targetRs.getResources().get(i))){
								elementModel = targetRs.getResources().get(i).getURI().toString();
							}
						}
						selectionType = TARGET_ELEMENT;
					}
					event.detail=DND.DROP_LINK;
				}
			}
		}   
	  }
	  
	  /**
		 * the drop action
		 *  @param event
		 */
		public void drop(DropTargetEvent event){
			if (selectionType == DEFAULT_SELECTION )//just enter into the selection code if an object is selected
				super.drop(event);
			else if((selectionType == SOURCE_ELEMENT)||(selectionType == TARGET_ELEMENT)){
				if (viewer !=null){
					viewer.setSelection(new StructuredSelection(aTargetObj), true);
					createTraceElement(aSource,aTargetObj,selectionType); 
				}
			}else{
				command = null;
			    commandTarget = null;
			    source = null;
			    dragAndDropCommandInformation = null;
			}
		}
		

		/**
		 * This method creates a new object (oElement) in a TraceLink.
		 * @param oElement
		 * @param oTraceLink
		 * @param type: Indicates whether oElement will be a source or a target element in
		 * the trace link.
		 */
		private void createTraceElement(EObject oElement, EObject oTraceLink, int type){
			if(oTraceLink instanceof TraceLinkImpl){
				TraceLinkImpl traceLink = (TraceLinkImpl) oTraceLink;
				
				//Get the ID of the element
				XMIResource resource = (XMIResource) oElement.eResource();
				String id = resource.getID(oElement); // Get element id
				if(id==null)
					id=resource.getURIFragment(oElement);
				
				if(type==SOURCE_ELEMENT){
					handleSetSourceElement(traceLink,oElement,id);
				}else{ //TARGET_ELEMENT
					handleSetTargetElement(traceLink,oElement,id);
				}
			}
		}	
		
	/**
	 * Creates a Source element (oElement) in a Trace Link (traceLink)
	 * 
	 * @param traceLink
	 * @param oElement
	 * @param id
	 */
	private void handleSetSourceElement(TraceLinkImpl traceLink,
			EObject oElement, String id) {

		iTraceModel iTraceModel = traceLink.getITraceModel();
		TraceLink tl = traceLink;
		iTraceModel = tl.getITraceModel();
		
		SourceElement sourceElement = iTraceFactory.createSourceElement();
				
		EList<Artefact> artefacts = iTraceModel.getArtefacts();
		for (int i=0; i<artefacts.size(); i++){
			if (artefacts.get(i) instanceof Model){
				Model source_model = (Model) artefacts.get(i);
				if (("platform:/resource" + source_model.getPath())
						.equals(elementModel)) {
					sourceElement.setModel(source_model);
				}
			}	
		}
		
		//traceSourceLinkElement.setName(this.getName(oElement));
		sourceElement.setRef(id);

		CreateChildCommand cmdSet_element = new CreateChildCommand(domain,
				(EObject) traceLink,
				ITracePackage.eINSTANCE.getTraceLink_SourceElements(),
				sourceElement, null);
		domain.getCommandStack().execute(cmdSet_element);

		}
		
	/**
	 * Creates a Target element (oElement) in a Trace Link (traceLink)
	 * 
	 * @param traceLink
	 * @param oElement
	 * @param id
	 */
	private void handleSetTargetElement(TraceLinkImpl traceLink,
			EObject oElement, String id) {
		iTraceModel iTraceModel = traceLink.getITraceModel();
		M2MLink m2mLink = (M2MLink)traceLink;
		iTraceModel = m2mLink.getITraceModel();

		TargetElement targetElement = iTraceFactory.createTargetElement();

		EList<Artefact> artefacts = iTraceModel.getArtefacts();
		for (int i = 0; i < artefacts.size(); i++) {
			if (artefacts.get(i) instanceof Model){
				Model target_model = (Model) artefacts.get(i);
				if (("platform:/resource" + target_model.getPath())
					.equals(elementModel)) {
				targetElement.setModel(target_model);
				}
			}
		}
		
		//traceTargetLinkElement.setName(this.getName(oElement));
		targetElement.setRef(id);

		CreateChildCommand cmdSet_element = new CreateChildCommand(domain,
				(EObject) m2mLink,
				//ITracePackage.eINSTANCE.getTargetElement_TraceLink(),
				ITracePackage.eINSTANCE.getM2MLink_TargetElements(),
				targetElement, null);
		domain.getCommandStack().execute(cmdSet_element);
	}

	private String getName(EObject eModelElement){
		String name = null;
		EList<EStructuralFeature> allESF = eModelElement.eClass().getEAllStructuralFeatures();
		for(int c1=0;c1<allESF.size();c1++){
			EStructuralFeature feature = allESF.get(c1);
			if(eModelElement.eGet(feature) instanceof String){
				if((c1==0)|| (feature.getName().toUpperCase().contains("NAME"))){
					name = eModelElement.eGet(feature).toString();
				}
			}
		}
		if (name==null)
			name=eModelElement.eClass().getName();
		
		return name;
	}		
			
}