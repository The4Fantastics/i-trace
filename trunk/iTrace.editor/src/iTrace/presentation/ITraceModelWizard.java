/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package iTrace.presentation;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.StringTokenizer;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.CommonPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.part.ISetSelectionTarget;

import iTrace.Model;
import iTrace.ITraceFactory;
import iTrace.ITracePackage;
import iTrace.impl.iTraceModelImpl;
import iTrace.impl.ITraceFactoryImpl;
import iTrace.provider.ITraceEditPlugin;


/**
 * This is a simple wizard for creating a new model file.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ITraceModelWizard extends Wizard implements INewWizard {
	/**
	 * The supported extensions for created files.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<String> FILE_EXTENSIONS =
		Collections.unmodifiableList(Arrays.asList(ITraceEditorPlugin.INSTANCE.getString("_UI_ITraceEditorFilenameExtensions").split("\\s*,\\s*")));

	/**
	 * A formatted list of supported file extensions, suitable for display.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String FORMATTED_FILE_EXTENSIONS =
		ITraceEditorPlugin.INSTANCE.getString("_UI_ITraceEditorFilenameExtensions").replaceAll("\\s*,\\s*", ", ");

	/**
	 * This caches an instance of the model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ITracePackage iTracePackage = ITracePackage.eINSTANCE;

	/**
	 * This caches an instance of the model factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ITraceFactory iTraceFactory = iTracePackage.getITraceFactory();

	/**
	 * This is the file creation page.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ITraceModelWizardNewFileCreationPage newFileCreationPage;

	/**
	 * This is the initial object creation page.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ITraceModelWizardInitialObjectCreationPage initialObjectCreationPage;

	/**
	 * This is the source models creation page.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @NOT generated
	 */
	//protected ITraceModelWizardSourceModelsCreationPage sourceModelsCreationPage;
	
	protected ITraceModelWizardModelsCreationPage modelsCreationPage;
	
	/**
	 * This is the source models creation page.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @NOT generated
	 */
	//protected ITraceModelWizardTargetModelsCreationPage targetModelsCreationPage;

	/**
	 * Remember the selection during initialization for populating the default container.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IStructuredSelection selection;

	/**
	 * Remember the workbench during initialization.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IWorkbench workbench;

	/**
	 * Caches the names of the types that can be created as the root object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected List<String> initialObjectNames;
	
	protected ArrayList<ArtefactData> sourceModels;
	protected ArrayList<ArtefactData> targetModels;

	/**
	 * This just records the information.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @NOT generated
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;
		setWindowTitle(ITraceEditorPlugin.INSTANCE.getString("_UI_Wizard_label"));
		setDefaultPageImageDescriptor(ExtendedImageRegistry.INSTANCE.getImageDescriptor(ITraceEditorPlugin.INSTANCE.getImage("full/wizban/NewITrace.png")));
		sourceModels = new ArrayList<ArtefactData>();
		targetModels = new ArrayList<ArtefactData>();
	}

	/**
	 * Returns the names of the types that can be created as the root object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<String> getInitialObjectNames() {
		if (initialObjectNames == null) {
			initialObjectNames = new ArrayList<String>();
			for (EClassifier eClassifier : iTracePackage.getEClassifiers()) {
				if (eClassifier instanceof EClass) {
					EClass eClass = (EClass)eClassifier;
					if (!eClass.isAbstract()) {
						initialObjectNames.add(eClass.getName());
					}
				}
			}
			Collections.sort(initialObjectNames, CommonPlugin.INSTANCE.getComparator());
		}
		return initialObjectNames;
	}

	/**
	 * Create a new model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @NOT generated
	 */
	protected EObject createInitialModel() {
		EClass eClass = (EClass)iTracePackage.getEClassifier("iTraceModel");
		EObject rootObject = iTraceFactory.create(eClass);
		return rootObject;
	}

	/**
	 * Do the work after everything is specified.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @NOT generated
	 */
	@Override
	public boolean performFinish() {
		try {
			// Remember the file.
			//
			final IFile modelFile = getModelFile();

			// Do the work within an operation.
			//
			WorkspaceModifyOperation operation =
				new WorkspaceModifyOperation() {
					@Override
					protected void execute(IProgressMonitor progressMonitor) {
						try {
							// Create a resource set
							//
							ResourceSet resourceSet = new ResourceSetImpl();

							// Get the URI of the model file.
							//
							URI fileURI = URI.createPlatformResourceURI(modelFile.getFullPath().toString(), true);

							// Create a resource for this file.
							//
							Resource resource = resourceSet.createResource(fileURI);

							// Add the initial model object to the contents.
							//
							EObject rootObject = createInitialModel();
							if (rootObject != null) {
								resource.getContents().add(rootObject);
							}
							if(rootObject instanceof iTraceModelImpl){
								iTraceModelImpl traceModel = (iTraceModelImpl) rootObject;
								ITraceFactoryImpl iTraceFactory = new ITraceFactoryImpl();
								//creates source models in the new traceability model
								for(int c1=0;c1<sourceModels.size();c1++){
									ArtefactData artefact = sourceModels.get(c1);
									Model sModel = iTraceFactory.createModel();
									sModel.setName(artefact.getName());
									sModel.setPath(artefact.getPath());
									sModel.setITraceModel(traceModel);
									if(!artefact.isMetamodel()){
										sModel.setMetamodel(artefact.getMetamodel());
									}
									sModel.eResource().save(new HashMap<Object, Object>());
								}
								
								//creates target models in the new traceability model
								for(int c2=0;c2<targetModels.size();c2++){
									ArtefactData artefact = targetModels.get(c2);
									Model tModel = iTraceFactory.createModel();
									tModel.setName(artefact.getName());
									tModel.setPath(artefact.getPath());
									tModel.setITraceModel(traceModel);
									if(!artefact.isMetamodel()){
										tModel.setMetamodel(artefact.getMetamodel());
									}
									tModel.eResource().save(new HashMap<Object, Object>());
								}
							}

							// Save the contents of the resource to the file system.
							//
							Map<Object, Object> options = new HashMap<Object, Object>();
							//options.put(XMLResource.OPTION_ENCODING, initialObjectCreationPage.getEncoding());
							resource.save(options);
						}
						catch (Exception exception) {
							ITraceEditorPlugin.INSTANCE.log(exception);
						}
						finally {
							progressMonitor.done();
						}
					}
				};

			getContainer().run(false, false, operation);

			// Select the new file resource in the current view.
			//
			IWorkbenchWindow workbenchWindow = workbench.getActiveWorkbenchWindow();
			IWorkbenchPage page = workbenchWindow.getActivePage();
			final IWorkbenchPart activePart = page.getActivePart();
			if (activePart instanceof ISetSelectionTarget) {
				final ISelection targetSelection = new StructuredSelection(modelFile);
				getShell().getDisplay().asyncExec
					(new Runnable() {
						 public void run() {
							 ((ISetSelectionTarget)activePart).selectReveal(targetSelection);
						 }
					 });
			}

			// Open an editor on the new file.
			//
			try {
				page.openEditor
					(new FileEditorInput(modelFile),
					 workbench.getEditorRegistry().getDefaultEditor(modelFile.getFullPath().toString()).getId());					 	 
			}
			catch (PartInitException exception) {
				MessageDialog.openError(workbenchWindow.getShell(), ITraceEditorPlugin.INSTANCE.getString("_UI_OpenEditorError_label"), exception.getMessage());
				return false;
			}

			return true;
		}
		catch (Exception exception) {
			ITraceEditorPlugin.INSTANCE.log(exception);
			return false;
		}
	}

	/**
	 * This is the one page of the wizard.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @NOT generated
	 */
	public class ITraceModelWizardNewFileCreationPage extends WizardNewFileCreationPage {
		/**
		 * Pass in the selection.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public ITraceModelWizardNewFileCreationPage(String pageId, IStructuredSelection selection) {
			super(pageId, selection);
		}

		/**
		 * The framework calls this to see if the file is correct.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @NOT generated
		 */
		@Override
		protected boolean validatePage() {
			if (super.validatePage()) {
				String extension = new Path(getFileName()).getFileExtension();
				if (extension == null || !FILE_EXTENSIONS.contains(extension)) {
					String key = FILE_EXTENSIONS.size() > 1 ? "_WARN_FilenameExtensions" : "_WARN_FilenameExtension";
					setErrorMessage(ITraceEditorPlugin.INSTANCE.getString(key, new Object [] { FORMATTED_FILE_EXTENSIONS }));
					return false;
				}
				return true;
			}
			return false;
		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public IFile getModelFile() {
			return ResourcesPlugin.getWorkspace().getRoot().getFile(getContainerFullPath().append(getFileName()));
		}
	}
	
	/**
	 * This is the page where the type of object to create is selected.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public class ITraceModelWizardInitialObjectCreationPage extends WizardPage {
		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		protected Combo initialObjectField;

		/**
		 * @generated
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 */
		protected List<String> encodings;

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		protected Combo encodingField;

		/**
		 * Pass in the selection.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public ITraceModelWizardInitialObjectCreationPage(String pageId) {
			super(pageId);
		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public void createControl(Composite parent) {
			Composite composite = new Composite(parent, SWT.NONE); {
				GridLayout layout = new GridLayout();
				layout.numColumns = 1;
				layout.verticalSpacing = 12;
				composite.setLayout(layout);

				GridData data = new GridData();
				data.verticalAlignment = GridData.FILL;
				data.grabExcessVerticalSpace = true;
				data.horizontalAlignment = GridData.FILL;
				composite.setLayoutData(data);
			}

			Label containerLabel = new Label(composite, SWT.LEFT);
			{
				containerLabel.setText(ITraceEditorPlugin.INSTANCE.getString("_UI_ModelObject"));

				GridData data = new GridData();
				data.horizontalAlignment = GridData.FILL;
				containerLabel.setLayoutData(data);
			}

			initialObjectField = new Combo(composite, SWT.BORDER);
			{
				GridData data = new GridData();
				data.horizontalAlignment = GridData.FILL;
				data.grabExcessHorizontalSpace = true;
				initialObjectField.setLayoutData(data);
			}

			for (String objectName : getInitialObjectNames()) {
				initialObjectField.add(getLabel(objectName));
			}

			if (initialObjectField.getItemCount() == 1) {
				initialObjectField.select(0);
			}
			initialObjectField.addModifyListener(validator);

			Label encodingLabel = new Label(composite, SWT.LEFT);
			{
				encodingLabel.setText(ITraceEditorPlugin.INSTANCE.getString("_UI_XMLEncoding"));

				GridData data = new GridData();
				data.horizontalAlignment = GridData.FILL;
				encodingLabel.setLayoutData(data);
			}
			encodingField = new Combo(composite, SWT.BORDER);
			{
				GridData data = new GridData();
				data.horizontalAlignment = GridData.FILL;
				data.grabExcessHorizontalSpace = true;
				encodingField.setLayoutData(data);
			}

			for (String encoding : getEncodings()) {
				encodingField.add(encoding);
			}

			encodingField.select(0);
			encodingField.addModifyListener(validator);

			setPageComplete(validatePage());
			setControl(composite);
		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		protected ModifyListener validator =
			new ModifyListener() {
				public void modifyText(ModifyEvent e) {
					setPageComplete(validatePage());
				}
			};

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		protected boolean validatePage() {
			return getInitialObjectName() != null && getEncodings().contains(encodingField.getText());
		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		@Override
		public void setVisible(boolean visible) {
			super.setVisible(visible);
			if (visible) {
				if (initialObjectField.getItemCount() == 1) {
					initialObjectField.clearSelection();
					encodingField.setFocus();
				}
				else {
					encodingField.clearSelection();
					initialObjectField.setFocus();
				}
			}
		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public String getInitialObjectName() {
			String label = initialObjectField.getText();

			for (String name : getInitialObjectNames()) {
				if (getLabel(name).equals(label)) {
					return name;
				}
			}
			return null;
		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public String getEncoding() {
			return encodingField.getText();
		}

		/**
		 * Returns the label for the specified type name.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		protected String getLabel(String typeName) {
			try {
				return ITraceEditPlugin.INSTANCE.getString("_UI_" + typeName + "_type");
			}
			catch(MissingResourceException mre) {
				ITraceEditorPlugin.INSTANCE.log(mre);
			}
			return typeName;
		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		protected Collection<String> getEncodings() {
			if (encodings == null) {
				encodings = new ArrayList<String>();
				for (StringTokenizer stringTokenizer = new StringTokenizer(ITraceEditorPlugin.INSTANCE.getString("_UI_XMLEncodingChoices")); stringTokenizer.hasMoreTokens(); ) {
					encodings.add(stringTokenizer.nextToken());
				}
			}
			return encodings;
		}
	}



	
	/**
	 * This is the page where the models are selected.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @NOT generated
	 */
	public  class ITraceModelWizardModelsCreationPage extends WizardPage {
		
		private Button addSourceModel;
		private Button editSourceModel;
		private Button removeSourceModel;
		private Button addTargetModel;
		private Button editTargetModel;
		private Button removeTargetModel;
		private Table modelSourceTable;
		private Table modelTargetTable;
		private ArrayList<ArtefactData> sourceModels;
		private ArrayList<ArtefactData> targetModels;

		protected ITraceModelWizardModelsCreationPage(
				String pageName, ArrayList<ArtefactData> sourceModels, ArrayList<ArtefactData> targetModels) {
			super(pageName);
			this.sourceModels=sourceModels;
			this.targetModels=targetModels;
		}
		
		
		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @NOT generated
		 */
		public void createControl(Composite parent) {
						
			Composite composite = new Composite(parent, SWT.NULL); {
				GridLayout layout = new GridLayout();
				layout.numColumns = 3;
				composite.setLayout(layout);

				GridData data = new GridData();
				data.verticalAlignment = GridData.FILL;
				data.grabExcessVerticalSpace = true;
				data.horizontalAlignment = GridData.FILL;
				composite.setLayoutData(data);
			}
			
			Label containerLabel = new Label(composite, SWT.LEFT);
			{
				containerLabel.setText(ITraceEditorPlugin.INSTANCE.getString("_UI_SourceModels"));
				GridData data = new GridData();
				data.horizontalAlignment = GridData.FILL;
				data.horizontalSpan = 3;
				containerLabel.setLayoutData(data);
			}

			modelSourceTable = new Table(composite, SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL |SWT.FULL_SELECTION );
			{
				GridData data = new GridData();
				data.verticalAlignment = GridData.FILL;
				data.grabExcessHorizontalSpace = true;
				data.grabExcessVerticalSpace = true;
				data.horizontalAlignment = GridData.FILL;
				data.horizontalSpan = 3;
				data.heightHint = 100;
				data.widthHint = 250;
				modelSourceTable.setLayoutData(data);
			}
			modelSourceTable.setHeaderVisible(true);
			modelSourceTable.setLinesVisible(true);
			{

				TableColumn modelColumn = new TableColumn(modelSourceTable,
						SWT.NONE);
				modelColumn.setWidth(100);
				modelColumn.setText("Model");
				modelColumn.setResizable(true);

				TableColumn pathColumn = new TableColumn(modelSourceTable, SWT.NONE);
				pathColumn.setText("Path");
				pathColumn.setWidth(193);
				pathColumn.setResizable(true);
				
				TableColumn metamodelColumn = new TableColumn(modelSourceTable, SWT.NONE);
				metamodelColumn.setText("Metamodel");
				metamodelColumn.setWidth(175);
				metamodelColumn.setResizable(true);

			}
			modelSourceTable.addSelectionListener(new SelectionAdapter() {
				public void widgetSelected(SelectionEvent e) {
					editSourceModel.setEnabled(true);
					removeSourceModel.setEnabled(true);
				}
			});
			
			addSourceModel = new Button(composite,SWT.PUSH);
			addSourceModel.setText(ITraceEditorPlugin.INSTANCE.getString("_UI_AddModel"));
			addSourceModel.addSelectionListener(new SelectionAdapter() {
				public void widgetSelected(SelectionEvent e) {
					ITraceWizardHandleModel dialogModel=new ITraceWizardHandleModel(getShell(),sourceModels,getCreationPage(),getModelFile().getProject().getName());
					dialogModel.open();
					setPageComplete(validatePage());
				}
			});
			
			editSourceModel = new Button(composite,SWT.PUSH);
			editSourceModel.setText(ITraceEditorPlugin.INSTANCE.getString("_UI_EditModel"));
			editSourceModel.addSelectionListener(new SelectionAdapter() {
				public void widgetSelected(SelectionEvent e) {
					int index = modelSourceTable.getSelectionIndex();
					if(index>-1){
						ITraceWizardHandleModel dialogModel=new ITraceWizardHandleModel(getShell(),sourceModels,getCreationPage(),index, getModelFile().getProject().getName());
						dialogModel.open();
					}
					setPageComplete(validatePage());
				}
			});
			editSourceModel.setEnabled(false);
			
			removeSourceModel = new Button(composite,SWT.PUSH);
			removeSourceModel.setText(ITraceEditorPlugin.INSTANCE.getString("_UI_RemoveModel"));
			removeSourceModel.addSelectionListener(new SelectionAdapter() {
				public void widgetSelected(SelectionEvent e) {
					int index = modelSourceTable.getSelectionIndex();
					if(index>-1){
						sourceModels.remove(index);
					}
					if(sourceModels.size()==0){
						editSourceModel.setEnabled(false);
						removeSourceModel.setEnabled(false);
					}
					rewriteTable();
					setPageComplete(validatePage());
				}
			});
			removeSourceModel.setEnabled(false);
			
			
			Label separator = new Label (composite, SWT.SEPARATOR | SWT.HORIZONTAL);
			{	GridData data = new GridData();
				data.horizontalAlignment = GridData.FILL;
				data.horizontalSpan = 3;
				data.verticalSpan = 5;
				separator.setLayoutData(data);
			}
			
			
			Label containerLabel2 = new Label(composite, SWT.LEFT);
			{
				containerLabel2.setText(ITraceEditorPlugin.INSTANCE.getString("_UI_TargetModels"));
				GridData data = new GridData();
				data.horizontalAlignment = GridData.FILL;
				data.horizontalSpan = 3;
				containerLabel.setLayoutData(data);
			}

			modelTargetTable = new Table(composite, SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL |SWT.FULL_SELECTION );
			{
				GridData data = new GridData();
				data.verticalAlignment = GridData.FILL;
				data.grabExcessHorizontalSpace = true;
				data.grabExcessVerticalSpace = true;
				data.horizontalAlignment = GridData.FILL;
				data.horizontalSpan = 3;
				data.heightHint = 100;
				data.widthHint = 250;
				modelTargetTable.setLayoutData(data);
			}
			modelTargetTable.setHeaderVisible(true);
			modelTargetTable.setLinesVisible(true);
			{

				TableColumn modelColumn = new TableColumn(modelTargetTable,
						SWT.NONE);
				modelColumn.setWidth(100);
				modelColumn.setText("Model");
				modelColumn.setResizable(true);

				TableColumn pathColumn = new TableColumn(modelTargetTable, SWT.NONE);
				pathColumn.setText("Path");
				pathColumn.setWidth(193);
				pathColumn.setResizable(true);
				
				TableColumn metamodelColumn = new TableColumn(modelTargetTable, SWT.NONE);
				metamodelColumn.setText("Metamodel");
				metamodelColumn.setWidth(175);
				metamodelColumn.setResizable(true);

			}
			modelTargetTable.addSelectionListener(new SelectionAdapter() {
				public void widgetSelected(SelectionEvent e) {
					editTargetModel.setEnabled(true);
					removeTargetModel.setEnabled(true);
				}
			});
			
			
			
			addTargetModel = new Button(composite,SWT.PUSH);
			addTargetModel.setText(ITraceEditorPlugin.INSTANCE.getString("_UI_AddModel"));
			addTargetModel.addSelectionListener(new SelectionAdapter() {
				public void widgetSelected(SelectionEvent e) {
					ITraceWizardHandleModel dialogModel=new ITraceWizardHandleModel(getShell(),targetModels,getCreationPage(),getModelFile().getProject().getName());
					dialogModel.open();
					setPageComplete(validatePage());
				}
			});
			
			editTargetModel = new Button(composite,SWT.PUSH);
			editTargetModel.setText(ITraceEditorPlugin.INSTANCE.getString("_UI_EditModel"));
			editTargetModel.addSelectionListener(new SelectionAdapter() {
				public void widgetSelected(SelectionEvent e) {
					int index = modelTargetTable.getSelectionIndex();
					if(index>-1){
						ITraceWizardHandleModel dialogModel=new ITraceWizardHandleModel(getShell(),targetModels,getCreationPage(),index, getModelFile().getProject().getName());
						dialogModel.open();
					}
					setPageComplete(validatePage());
				}
			});
			editTargetModel.setEnabled(false);
			
			removeTargetModel = new Button(composite,SWT.PUSH);
			removeTargetModel.setText(ITraceEditorPlugin.INSTANCE.getString("_UI_RemoveModel"));
			removeTargetModel.addSelectionListener(new SelectionAdapter() {
				public void widgetSelected(SelectionEvent e) {
					int index = modelTargetTable.getSelectionIndex();
					if(index>-1){
						targetModels.remove(index);
					}
					if(targetModels.size()==0){
						editTargetModel.setEnabled(false);
						removeTargetModel.setEnabled(false);
					}
					rewriteTable();
					setPageComplete(validatePage());
				}
			});
			removeTargetModel.setEnabled(false);
			
			rewriteTable();
			setPageComplete(validatePage());
			setControl(composite);
		}




		private ITraceModelWizardModelsCreationPage getCreationPage(){
			return this;
		}
		

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @NOT generated
		 */
		protected boolean validatePage() {
			if((sourceModels.size()>0)&&(targetModels.size()>0)){
				return true;
			}else{
				return false;
			}
		}

		protected void rewriteTable(){
			modelSourceTable.removeAll();
			for(int cont1=0;cont1<sourceModels.size();cont1++){
				TableItem item = new TableItem(modelSourceTable,SWT.NONE);
				item.setText(0,sourceModels.get(cont1).getName());
				item.setText(1,sourceModels.get(cont1).getPath());
				if(sourceModels.get(cont1).isMetamodel()){
					item.setText(2,"-");
				}else{
					item.setText(2,sourceModels.get(cont1).getMetamodel());
				}
			}
			
			modelTargetTable.removeAll();
			for(int cont1=0;cont1<targetModels.size();cont1++){
				TableItem item = new TableItem(modelTargetTable,SWT.NONE);
				item.setText(0,targetModels.get(cont1).getName());
				item.setText(1,targetModels.get(cont1).getPath());
				if(targetModels.get(cont1).isMetamodel()){
					item.setText(2,"-");
				}else{
					item.setText(2,targetModels.get(cont1).getMetamodel());
				}
			}
		}
	}

	/**
	 * The framework calls this to create the contents of the wizard.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @NOT generated
	 */
		@Override
	public void addPages() {
		// Create a page, set the title, and the initial model file name.
		//
		newFileCreationPage = new ITraceModelWizardNewFileCreationPage("Whatever", selection);
		newFileCreationPage.setTitle(ITraceEditorPlugin.INSTANCE.getString("_UI_ITraceModelWizard_label"));
		newFileCreationPage.setDescription(ITraceEditorPlugin.INSTANCE.getString("_UI_ITraceModelWizard_description"));
		newFileCreationPage.setFileName(ITraceEditorPlugin.INSTANCE.getString("_UI_ITraceEditorFilenameDefaultBase") + "." + FILE_EXTENSIONS.get(0));
		addPage(newFileCreationPage);

		// Try and get the resource selection to determine a current directory for the file dialog.
		//
		if (selection != null && !selection.isEmpty()) {
			// Get the resource...
			//
			Object selectedElement = selection.iterator().next();
			if (selectedElement instanceof IResource) {
				// Get the resource parent, if its a file.
				//
				IResource selectedResource = (IResource)selectedElement;
				if (selectedResource.getType() == IResource.FILE) {
					selectedResource = selectedResource.getParent();
				}

				// This gives us a directory...
				//
				if (selectedResource instanceof IFolder || selectedResource instanceof IProject) {
					// Set this for the container.
					//
					newFileCreationPage.setContainerFullPath(selectedResource.getFullPath());
					

					// Make up a unique new name here.
					//
					String defaultModelBaseFilename = ITraceEditorPlugin.INSTANCE.getString("_UI_ITraceEditorFilenameDefaultBase");
					String defaultModelFilenameExtension = FILE_EXTENSIONS.get(0);
					String modelFilename = defaultModelBaseFilename + "." + defaultModelFilenameExtension;
					for (int i = 1; ((IContainer)selectedResource).findMember(modelFilename) != null; ++i) {
						modelFilename = defaultModelBaseFilename + i + "." + defaultModelFilenameExtension;
					}
					newFileCreationPage.setFileName(modelFilename);
				}
			}
		}

		modelsCreationPage = new ITraceModelWizardModelsCreationPage("Models",sourceModels,targetModels);
		modelsCreationPage.setTitle(ITraceEditorPlugin.INSTANCE.getString("_UI_ITraceModelWizard_label"));
		modelsCreationPage.setDescription(ITraceEditorPlugin.INSTANCE.getString("_UI_Wizard_models_description"));
		addPage(modelsCreationPage);
		
	}

	/**
	 * Get the file from the page.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IFile getModelFile() {
		return newFileCreationPage.getModelFile();
	}




}