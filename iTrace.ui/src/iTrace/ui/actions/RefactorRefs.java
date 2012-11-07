package iTrace.ui.actions;


import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;

import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

import iTrace.Artefact;
import iTrace.ITracePackage;
import iTrace.Model;
import iTrace.TraceLinkElement;
import iTrace.iTraceModel;

import org.eclipse.core.resources.IFile;

public class RefactorRefs implements IObjectActionDelegate {
	
	private ISelection currSelection;
	private IFile currentFile;
	private String modelName;
	
	public RefactorRefs(){
		super();
	}
	
	@Override
	public void run(IAction action) {
		IStructuredSelection iss = (IStructuredSelection) currSelection;
		currentFile = (IFile) iss.getFirstElement();
		modelName = currentFile.getFullPath().toString();
		refactor();
		
	}
	
	public void refactor(String modelName){
		this.modelName = modelName;
		refactor();
	}
	
	
	private void refactor() {

		

// ---- Leemos el modelo existente --------
			
		ITracePackage.eINSTANCE.eClass();
		
		// Registramos el recurso factoria XMI para la extension iTRACE
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map <String, Object> model = reg.getExtensionToFactoryMap();
		model.put("iTrace", new XMIResourceFactoryImpl());
				
		// Obtenemos un nuevo resource set
		ResourceSet resourceSet = new ResourceSetImpl();
		
		// Obtenemos el recurso
		//System.out.println("URI file: " + EcoreUtil.getURI((EObject) currentFile);
		Resource resource = resourceSet.getResource(URI.createURI(modelName), true);	
		// Resource resource = resourceSet.getResource(URI.createURI(modelName), true);
		
		
		// Obtenemos el primer modelo y hacemos casting del tipo
		iTraceModel itm = (iTraceModel) resource.getContents().get(0);
		
// ---- Fin: Leemos el modelo existente --------		
		
				
		// Obtenemos los Artefactos
	 	for (Iterator <Artefact> iter_Art = itm.getArtefacts().iterator(); iter_Art.hasNext();) {
	 		Artefact art = iter_Art.next();
	 		
	 		if (art instanceof Model) {
	 			
				Model mod = (Model) art;
	 		
	 			for (Iterator <TraceLinkElement> iter_tle = mod.getElements().iterator(); iter_tle.hasNext();) {
			 		TraceLinkElement tle = iter_tle.next();
			 		if (tle.getObject() != null) {
			 			String [] newRef = EcoreUtil.getURI(tle.getObject()).toString().split("#");
			 			
			 			tle.setRef(newRef[1]);
			 			tle.setObject(null);
			 		
			 			//System.out.println(" Valor del ref: " + tle.getRef().toString());
			 			//System.out.println(" Valor del obj: " +  EcoreUtil.getURI(tle.getObject()).toString());
			 		
			 			// Now save the content.
			 			try {
			 				resource.save(Collections.EMPTY_MAP);
			 			} catch (IOException e) {
			 				e.printStackTrace();
			 			}
			 		}
	 			}
	 		}
	 	}
	 	System.out.println("Referencias del modelo actualizadas del modelo " + modelName);
	 	
	}

	
	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		currSelection = selection;
		
	}

	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		
	}
}



