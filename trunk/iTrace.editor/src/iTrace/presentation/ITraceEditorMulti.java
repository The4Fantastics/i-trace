package iTrace.presentation;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EventObject;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.ResourcesPlugin;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;

import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IStatusLineManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.text.Document;
import org.eclipse.jface.text.TextPresentation;
import org.eclipse.jface.text.TextViewer;
import org.eclipse.swt.SWT;

import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.custom.StyleRange;

import org.eclipse.swt.dnd.DND;
import org.eclipse.swt.dnd.Transfer;

import org.eclipse.swt.events.ControlAdapter;
import org.eclipse.swt.events.ControlEvent;

import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Point;



import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Menu;

import org.eclipse.swt.widgets.Tree;


import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IPartListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PartInitException;

import org.eclipse.ui.dialogs.SaveAsDialog;

import org.eclipse.ui.ide.IGotoMarker;

import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.part.MultiPageEditorPart;

import org.eclipse.ui.views.contentoutline.ContentOutline;
import org.eclipse.ui.views.contentoutline.ContentOutlinePage;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;

import org.eclipse.ui.views.properties.IPropertySheetPage;
import org.eclipse.ui.views.properties.PropertySheet;
import org.eclipse.ui.views.properties.PropertySheetPage;

import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.common.command.CommandStackListener;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.ui.MarkerHelper;
import org.eclipse.emf.common.ui.ViewerPane;

import org.eclipse.emf.common.ui.editor.ProblemEditorPart;

import org.eclipse.emf.common.ui.viewer.IViewerProvider;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMIResource;

import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;

import org.eclipse.emf.edit.provider.AdapterFactoryItemDelegator;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;

import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;

import org.eclipse.emf.edit.ui.action.EditingDomainActionBarContributor;

import org.eclipse.emf.edit.ui.celleditor.AdapterFactoryTreeEditor;

import org.eclipse.emf.edit.ui.dnd.LocalTransfer;
import org.eclipse.emf.edit.ui.dnd.ViewerDragAdapter;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.edit.ui.provider.UnwrappingSelectionProvider;

import org.eclipse.emf.edit.ui.util.EditUIMarkerHelper;
import org.eclipse.emf.edit.ui.util.EditUIUtil;

import org.eclipse.emf.edit.ui.view.ExtendedPropertySheetPage;

import iTrace.Artefact;
import iTrace.M2MLink;
import iTrace.TargetElement;
import iTrace.TraceLink;
import iTrace.TraceLinkElement;
import iTrace.impl.ArtefactImpl;
import iTrace.impl.M2MLinkImpl;

import iTrace.impl.ModelImpl;
import iTrace.impl.SourceElementImpl;
import iTrace.impl.TargetElementImpl;
import iTrace.impl.TraceLinkImpl;
import iTrace.provider.ITraceItemProviderAdapterFactoryMulti;

import org.eclipse.ui.actions.WorkspaceModifyOperation;


/**
 * This is an example of a ITrace model editor.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ITraceEditorMulti
	extends MultiPageEditorPart
	implements IEditingDomainProvider, ISelectionProvider, IMenuListener, IViewerProvider, IGotoMarker {
	/**
	 * This keeps track of the editing domain that is used to track all changes to the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @NOT generated
	 */
	protected AdapterFactoryEditingDomain editingDomain;
	//
	// Nuevas propiedades
	protected ResourceSet sourceRs;
	protected ResourceSet targetRs;
	protected TreeViewer sourceViewer;
	protected TreeViewer iTraceViewer;
	protected TreeViewer targetViewer;
	protected TextViewer textViewer;

	// Save Last Block
	protected iTrace.impl.BlockImpl lastBlock = null;
	protected Boolean DataCharged = false;
	
	SashForm topSashForm = null;
	
	/**
	 * This is the one adapter factory used for providing views of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory adapterFactory;

	/**
	 * This is the content outline page.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IContentOutlinePage contentOutlinePage;

	/**
	 * This is a kludge...
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IStatusLineManager contentOutlineStatusLineManager;

	/**
	 * This is the content outline page's viewer.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TreeViewer contentOutlineViewer;

	/**
	 * This is the property sheet page.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertySheetPage propertySheetPage;

	/**
	 * This is the viewer that shadows the selection in the content outline.
	 * The parent relation must be correctly defined for this to work.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TreeViewer selectionViewer;

	/**
	 * This inverts the roll of parent and child in the content provider and show parents as a tree.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TreeViewer parentViewer;

	/**
	 * This shows how a tree view works.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TreeViewer treeViewer;

	/**
	 * This shows how a list view works.
	 * A list viewer doesn't support icons.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListViewer listViewer;

	/**
	 * This shows how a table view works.
	 * A table can be used as a list with icons.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableViewer tableViewer;

	/**
	 * This shows how a tree view with columns works.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TreeViewer treeViewerWithColumns;

	/**
	 * This keeps track of the active viewer pane, in the book.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewerPane currentViewerPane;

	/**
	 * This keeps track of the active content viewer, which may be either one of the viewers in the pages or the content outline viewer.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Viewer currentViewer;

	/**
	 * This listens to which ever viewer is active.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ISelectionChangedListener selectionChangedListener;

	/**
	 * This keeps track of all the {@link org.eclipse.jface.viewers.ISelectionChangedListener}s that are listening to this editor.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<ISelectionChangedListener> selectionChangedListeners = new ArrayList<ISelectionChangedListener>();

	/**
	 * This keeps track of the selection of the editor as a whole.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ISelection editorSelection = StructuredSelection.EMPTY;

	/**
	 * The MarkerHelper is responsible for creating workspace resource markers presented
	 * in Eclipse's Problems View.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MarkerHelper markerHelper = new EditUIMarkerHelper();

	/**
	 * This listens for when the outline becomes active
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IPartListener partListener =
		new IPartListener() {
			public void partActivated(IWorkbenchPart p) {
				if (p instanceof ContentOutline) {
					if (((ContentOutline)p).getCurrentPage() == contentOutlinePage) {
						getActionBarContributor().setActiveEditor(ITraceEditorMulti.this);

						setCurrentViewer(contentOutlineViewer);
					}
				}
				else if (p instanceof PropertySheet) {
					if (((PropertySheet)p).getCurrentPage() == propertySheetPage) {
						getActionBarContributor().setActiveEditor(ITraceEditorMulti.this);
						handleActivate();
					}
				}
				else if (p == ITraceEditorMulti.this) {
					handleActivate();
				}
			}
			public void partBroughtToTop(IWorkbenchPart p) {
				// Ignore.
			}
			public void partClosed(IWorkbenchPart p) {
				// Ignore.
			}
			public void partDeactivated(IWorkbenchPart p) {
				// Ignore.
			}
			public void partOpened(IWorkbenchPart p) {
				// Ignore.
			}
		};

	/**
	 * Resources that have been removed since last activation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Resource> removedResources = new ArrayList<Resource>();

	/**
	 * Resources that have been changed since last activation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Resource> changedResources = new ArrayList<Resource>();

	/**
	 * Resources that have been saved.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Resource> savedResources = new ArrayList<Resource>();

	/**
	 * Map to store the diagnostic associated with a resource.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Map<Resource, Diagnostic> resourceToDiagnosticMap = new LinkedHashMap<Resource, Diagnostic>();

	/**
	 * Controls whether the problem indication should be updated.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected boolean updateProblemIndication = true;

	/**
	 * Adapter used to update the problem indication when resources are demanded loaded.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EContentAdapter problemIndicationAdapter = 
		new EContentAdapter() {
			@Override
			public void notifyChanged(Notification notification) {
				if (notification.getNotifier() instanceof Resource) {
					switch (notification.getFeatureID(Resource.class)) {
						case Resource.RESOURCE__IS_LOADED:
						case Resource.RESOURCE__ERRORS:
						case Resource.RESOURCE__WARNINGS: {
							Resource resource = (Resource)notification.getNotifier();
							Diagnostic diagnostic = analyzeResourceProblems(resource, null);
							if (diagnostic.getSeverity() != Diagnostic.OK) {
								resourceToDiagnosticMap.put(resource, diagnostic);
							}
							else {
								resourceToDiagnosticMap.remove(resource);
							}

							if (updateProblemIndication) {
								getSite().getShell().getDisplay().asyncExec
									(new Runnable() {
										 public void run() {
											 updateProblemIndication();
										 }
									 });
							}
							break;
						}
					}
				}
				else {
					super.notifyChanged(notification);
				}
			}

			@Override
			protected void setTarget(Resource target) {
				basicSetTarget(target);
			}

			@Override
			protected void unsetTarget(Resource target) {
				basicUnsetTarget(target);
			}
		};

	/**
	 * This listens for workspace changes.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IResourceChangeListener resourceChangeListener =
		new IResourceChangeListener() {
			public void resourceChanged(IResourceChangeEvent event) {
				IResourceDelta delta = event.getDelta();
				try {
					class ResourceDeltaVisitor implements IResourceDeltaVisitor {
						protected ResourceSet resourceSet = editingDomain.getResourceSet();
						protected Collection<Resource> changedResources = new ArrayList<Resource>();
						protected Collection<Resource> removedResources = new ArrayList<Resource>();

						public boolean visit(IResourceDelta delta) {
							if (delta.getResource().getType() == IResource.FILE) {
								if (delta.getKind() == IResourceDelta.REMOVED ||
								    delta.getKind() == IResourceDelta.CHANGED && delta.getFlags() != IResourceDelta.MARKERS) {
									Resource resource = resourceSet.getResource(URI.createPlatformResourceURI(delta.getFullPath().toString(), true), false);
									if (resource != null) {
										if (delta.getKind() == IResourceDelta.REMOVED) {
											removedResources.add(resource);
										}
										else if (!savedResources.remove(resource)) {
											changedResources.add(resource);
										}
									}
								}
							}

							return true;
						}

						public Collection<Resource> getChangedResources() {
							return changedResources;
						}

						public Collection<Resource> getRemovedResources() {
							return removedResources;
						}
					}

					final ResourceDeltaVisitor visitor = new ResourceDeltaVisitor();
					delta.accept(visitor);

					if (!visitor.getRemovedResources().isEmpty()) {
						getSite().getShell().getDisplay().asyncExec
							(new Runnable() {
								 public void run() {
									 removedResources.addAll(visitor.getRemovedResources());
									 if (!isDirty()) {
										 getSite().getPage().closeEditor(ITraceEditorMulti.this, false);
									 }
								 }
							 });
					}

					if (!visitor.getChangedResources().isEmpty()) {
						getSite().getShell().getDisplay().asyncExec
							(new Runnable() {
								 public void run() {
									 changedResources.addAll(visitor.getChangedResources());
									 if (getSite().getPage().getActiveEditor() == ITraceEditorMulti.this) {
										 handleActivate();
									 }
								 }
							 });
					}
				}
				catch (CoreException exception) {
					ITraceEditorPlugin.INSTANCE.log(exception);
				}
			}
	};

	/**
	 * Handles activation of the editor or it's associated views.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void handleActivate() {
		// Recompute the read only state.
		//
		if (editingDomain.getResourceToReadOnlyMap() != null) {
		  editingDomain.getResourceToReadOnlyMap().clear();

		  // Refresh any actions that may become enabled or disabled.
		  //
		  setSelection(getSelection());
		}

		if (!removedResources.isEmpty()) {
			if (handleDirtyConflict()) {
				getSite().getPage().closeEditor(ITraceEditorMulti.this, false);
			}
			else {
				removedResources.clear();
				changedResources.clear();
				savedResources.clear();
			}
		}
		else if (!changedResources.isEmpty()) {
			changedResources.removeAll(savedResources);
			handleChangedResources();
			changedResources.clear();
			savedResources.clear();
		}
	}

	/**
	 * Handles what to do with changed resources on activation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void handleChangedResources() {
		if (!changedResources.isEmpty() && (!isDirty() || handleDirtyConflict())) {
			if (isDirty()) {
				changedResources.addAll(editingDomain.getResourceSet().getResources());
			}
			editingDomain.getCommandStack().flush();

			updateProblemIndication = false;
			for (Resource resource : changedResources) {
				if (resource.isLoaded()) {
					resource.unload();
					try {
						resource.load(Collections.EMPTY_MAP);
					}
					catch (IOException exception) {
						if (!resourceToDiagnosticMap.containsKey(resource)) {
							resourceToDiagnosticMap.put(resource, analyzeResourceProblems(resource, exception));
						}
					}
				}
			}

			if (AdapterFactoryEditingDomain.isStale(editorSelection)) {
				setSelection(StructuredSelection.EMPTY);
			}

			updateProblemIndication = true;
			updateProblemIndication();
		}
	}
  
	/**
	 * Updates the problems indication with the information described in the specified diagnostic.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void updateProblemIndication() {
		if (updateProblemIndication) {
			BasicDiagnostic diagnostic =
				new BasicDiagnostic
					(Diagnostic.OK,
					 "iTrace.editor",
					 0,
					 null,
					 new Object [] { editingDomain.getResourceSet() });
			for (Diagnostic childDiagnostic : resourceToDiagnosticMap.values()) {
				if (childDiagnostic.getSeverity() != Diagnostic.OK) {
					diagnostic.add(childDiagnostic);
				}
			}

			int lastEditorPage = getPageCount() - 1;
			if (lastEditorPage >= 0 && getEditor(lastEditorPage) instanceof ProblemEditorPart) {
				((ProblemEditorPart)getEditor(lastEditorPage)).setDiagnostic(diagnostic);
				if (diagnostic.getSeverity() != Diagnostic.OK) {
					setActivePage(lastEditorPage);
				}
			}
			else if (diagnostic.getSeverity() != Diagnostic.OK) {
				ProblemEditorPart problemEditorPart = new ProblemEditorPart();
				problemEditorPart.setDiagnostic(diagnostic);
				problemEditorPart.setMarkerHelper(markerHelper);
				try {
					addPage(++lastEditorPage, problemEditorPart, getEditorInput());
					setPageText(lastEditorPage, problemEditorPart.getPartName());
					setActivePage(lastEditorPage);
					showTabs();
				}
				catch (PartInitException exception) {
					ITraceEditorPlugin.INSTANCE.log(exception);
				}
			}

			if (markerHelper.hasMarkers(editingDomain.getResourceSet())) {
				markerHelper.deleteMarkers(editingDomain.getResourceSet());
				if (diagnostic.getSeverity() != Diagnostic.OK) {
					try {
						markerHelper.createMarkers(diagnostic);
					}
					catch (CoreException exception) {
						ITraceEditorPlugin.INSTANCE.log(exception);
					}
				}
			}
		}
	}

	/**
	 * Shows a dialog that asks if conflicting changes should be discarded.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected boolean handleDirtyConflict() {
		return
			MessageDialog.openQuestion
				(getSite().getShell(),
				 getString("_UI_FileConflict_label"),
				 getString("_WARN_FileConflict"));
	}

	/**
	 * This creates a model editor.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ITraceEditorMulti() {
		super();
		initializeEditingDomain();
	}

	/**
	 * This sets up the editing domain for the model editor.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void initializeEditingDomain() {
		// Create an adapter factory that yields item providers.
		//
		adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);

		adapterFactory.addAdapterFactory(new ResourceItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new ITraceItemProviderAdapterFactoryMulti());
		adapterFactory.addAdapterFactory(new ReflectiveItemProviderAdapterFactory());

		// Create the command stack that will notify this editor as commands are executed.
		//
		BasicCommandStack commandStack = new BasicCommandStack();

		// Add a listener to set the most recent command's affected objects to be the selection of the viewer with focus.
		//
		commandStack.addCommandStackListener
			(new CommandStackListener() {
				 public void commandStackChanged(final EventObject event) {
					 
					 getContainer().getDisplay().asyncExec
						 (new Runnable() {
							  public void run() {
								  firePropertyChange(IEditorPart.PROP_DIRTY);

								  // Try to select the affected objects.
								  //
								  Command mostRecentCommand = ((CommandStack)event.getSource()).getMostRecentCommand();
								  if (mostRecentCommand != null) {
									  setSelectionToViewer(mostRecentCommand.getAffectedObjects());
								  }
								  if (propertySheetPage != null && !propertySheetPage.getControl().isDisposed()) {
									  propertySheetPage.refresh();
								  }
							  }
						  });
				 }
			 });

		// Create the editing domain with a special command stack.
		//
		editingDomain = new AdapterFactoryEditingDomain(adapterFactory, commandStack, new HashMap<Resource, Boolean>());
	}

	/**
	 * This is here for the listener to be able to call it.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
			@Override
	protected void firePropertyChange(int action) {
		super.firePropertyChange(action);
	}

	/**
	 * This sets the selection into whichever viewer is active.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelectionToViewer(Collection<?> collection) {
		final Collection<?> theSelection = collection;
		// Make sure it's okay.
		//
		if (theSelection != null && !theSelection.isEmpty()) {
			Runnable runnable =
				new Runnable() {
					public void run() {
						// Try to select the items in the current content viewer of the editor.
						//
						if (currentViewer != null) {
							currentViewer.setSelection(new StructuredSelection(theSelection.toArray()), true);
						}
					}
				};
			getSite().getShell().getDisplay().asyncExec(runnable);
		}
	}

	/**
	 * This returns the editing domain as required by the {@link IEditingDomainProvider} interface.
	 * This is important for implementing the static methods of {@link AdapterFactoryEditingDomain}
	 * and for supporting {@link org.eclipse.emf.edit.ui.action.CommandAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EditingDomain getEditingDomain() {
		return editingDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public class ReverseAdapterFactoryContentProvider extends AdapterFactoryContentProvider {
		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public ReverseAdapterFactoryContentProvider(AdapterFactory adapterFactory) {
			super(adapterFactory);
		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		@Override
		public Object [] getElements(Object object) {
			Object parent = super.getParent(object);
			return (parent == null ? Collections.EMPTY_SET : Collections.singleton(parent)).toArray();
		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		@Override
		public Object [] getChildren(Object object) {
			Object parent = super.getParent(object);
			return (parent == null ? Collections.EMPTY_SET : Collections.singleton(parent)).toArray();
		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		@Override
		public boolean hasChildren(Object object) {
			Object parent = super.getParent(object);
			return parent != null;
		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		@Override
		public Object getParent(Object object) {
			return null;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentViewerPane(ViewerPane viewerPane) {
		if (currentViewerPane != viewerPane) {
			if (currentViewerPane != null) {
				currentViewerPane.showFocus(false);
			}
			currentViewerPane = viewerPane;
		}
		setCurrentViewer(currentViewerPane.getViewer());
	}

	/**
	 * This makes sure that one content viewer, either for the current page or the outline view, if it has focus,
	 * is the current one.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentViewer(Viewer viewer) {
		// If it is changing...
		//
		if (currentViewer != viewer) {
			if (selectionChangedListener == null) {
				// Create the listener on demand.
				//
				selectionChangedListener =
					new ISelectionChangedListener() {
						// This just notifies those things that are affected by the section.
						//
						public void selectionChanged(SelectionChangedEvent selectionChangedEvent) {
							setSelection(selectionChangedEvent.getSelection());
						}
					};
			}

			// Stop listening to the old one.
			//
			if (currentViewer != null) {
				currentViewer.removeSelectionChangedListener(selectionChangedListener);
			}

			// Start listening to the new one.
			//
			if (viewer != null) {
				viewer.addSelectionChangedListener(selectionChangedListener);
			}

			// Remember it.
			//
			currentViewer = viewer;

			// Set the editors selection based on the current viewer's selection.
			//
			setSelection(currentViewer == null ? StructuredSelection.EMPTY : currentViewer.getSelection());
		}
	}

	/**
	 * This returns the viewer as required by the {@link IViewerProvider} interface.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Viewer getViewer() {
		return currentViewer;
	}

	/**
	 * This creates a context menu for the viewer and adds a listener as well registering the menu for extension.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createContextMenuFor(StructuredViewer viewer) {
		MenuManager contextMenu = new MenuManager("#PopUp");
		contextMenu.add(new Separator("additions"));
		contextMenu.setRemoveAllWhenShown(true);
		contextMenu.addMenuListener(this);
		Menu menu= contextMenu.createContextMenu(viewer.getControl());
		viewer.getControl().setMenu(menu);
		getSite().registerContextMenu(contextMenu, new UnwrappingSelectionProvider(viewer));

		/*
		int dndOperations = DND.DROP_COPY | DND.DROP_MOVE | DND.DROP_LINK;
		Transfer[] transfers = new Transfer[] { LocalTransfer.getInstance() };
		viewer.addDragSupport(dndOperations, transfers, new ViewerDragAdapter(viewer));
		viewer.addDropSupport(dndOperations, transfers, new EditingDomainViewerDropAdapter(editingDomain, viewer));
		*/
	}

	/**
	 * This is the method called to load a resource into the editing domain's resource set based on the editor's input.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createModel() {
		URI resourceURI = EditUIUtil.getURI(getEditorInput());
		Exception exception = null;
		Resource resource = null;
		try {
			// Load the resource through the editing domain.
			//
			resource = editingDomain.getResourceSet().getResource(resourceURI, true);
		}
		catch (Exception e) {
			exception = e;
			resource = editingDomain.getResourceSet().getResource(resourceURI, false);
		}

		Diagnostic diagnostic = analyzeResourceProblems(resource, exception);
		if (diagnostic.getSeverity() != Diagnostic.OK) {
			resourceToDiagnosticMap.put(resource,  analyzeResourceProblems(resource, exception));
		}
		editingDomain.getResourceSet().eAdapters().add(problemIndicationAdapter);
	}

	/**
	 * Returns a diagnostic describing the errors and warnings listed in the resource
	 * and the specified exception (if any).
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Diagnostic analyzeResourceProblems(Resource resource, Exception exception) {
		if (!resource.getErrors().isEmpty() || !resource.getWarnings().isEmpty()) {
			BasicDiagnostic basicDiagnostic =
				new BasicDiagnostic
					(Diagnostic.ERROR,
					 "iTrace.editor",
					 0,
					 getString("_UI_CreateModelError_message", resource.getURI()),
					 new Object [] { exception == null ? (Object)resource : exception });
			basicDiagnostic.merge(EcoreUtil.computeDiagnostic(resource, true));
			return basicDiagnostic;
		}
		else if (exception != null) {
			return
				new BasicDiagnostic
					(Diagnostic.ERROR,
					 "iTrace.editor",
					 0,
					 getString("_UI_CreateModelError_message", resource.getURI()),
					 new Object[] { exception });
		}
		else {
			return Diagnostic.OK_INSTANCE;
		}
	}

	/**
	 * This is the method used by the framework to install your own controls.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @NOT generated
	 */
	@Override
	public void createPages() {
		// Creates the model from the editor input
		//
		createModel();

		//Nuevas/////////////////////////////////////////////////////////////
		Composite container = getContainer();
		topSashForm = new SashForm(container,SWT.HORIZONTAL);
		/////////////////////////////////////////////////////////////////////
		
		
		// Only creates the other pages if there is something that can be edited
		//
		if (!getEditingDomain().getResourceSet().getResources().isEmpty()) {
			
			//Nuevas/////////////////////////////////////////////////////////////
			ArrayList<ArtefactImpl> sources = Actions.getSourceArtefacts(getEditingDomain().getResourceSet());
			ArrayList<ArtefactImpl> targets = Actions.getTargetArtefacts(getEditingDomain().getResourceSet());
			/////////////////////////////////////////////////////////////////////
	
		
			//Nuevas/////////////////////////////////////////////////////////////
			// Se eliminan los visores existente y se crean los visores 
			//       origen y destino 
			// Create view for sources model.
			//
			ViewerPane viewerPane = new 
			ViewerPane(getSite().getPage(), ITraceEditorMulti.this) 
			{
			
			@Override
			public Viewer createViewer(Composite composite){
				Tree tree= new Tree(composite, SWT.MULTI);
				TreeViewer newTreeViewer = new TreeViewer(tree);
				return newTreeViewer;
			}
			
			@Override
			public void requestActivation(){
				super.requestActivation();
				setCurrentViewerPane(this);
				}
			};
			
			viewerPane.createControl(topSashForm);
			sourceViewer=(TreeViewer)viewerPane.getViewer();
			sourceViewer.setContentProvider(new AdapterFactoryContentProvider(adapterFactory));
			sourceViewer.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
			Transfer[] transfers = new Transfer[] { LocalTransfer.getInstance() };
			sourceViewer.addDragSupport(DND.DROP_LINK, transfers, new ViewerDragAdapter(sourceViewer));
			
			// para registrar el metamodelo
			//ArrayList<String> paths_source=new ArrayList<String>();
			/*
			for (int i=0; i<sources.size(); i++){
				if (sources.get(i).getMetamodel() != null) {
					// if metamodel attribute is not null
					if (!sources.get(i).getMetamodel().equals("")) {
						String metamodelRegistered = Actions.registerMetamodel(
								sources.get(i).getMetamodel(), sources.get(i).getName());
						sources.get(i).setMetamodel(metamodelRegistered);
					}
				}
				//paths_source.add(sources.get(i).getPath());

			}
			*/
			
			sourceRs= Actions.createResourceSet_Sources(sources);
		//	Actions.setSourceArtefacts(getEditingDomain().getResourceSet(),sources);
			
			sourceViewer.setInput(sourceRs);
		//	sourceViewer.setSelection(new StructuredSelection(sourceRs.getResources().get(0)), true);
		
	    // Permite la visualización del modelo de trazas cuando no tiene modelos origen
			
			if (sourceRs.getResources().size() >0){
				sourceViewer.setSelection(new StructuredSelection(sourceRs.getResources().get(0)), true);
			}
					
			viewerPane.setTitle("Source Models");
			sourceViewer.addSelectionChangedListener
			(new ISelectionChangedListener() {
				 // This ensures that we handle selections correctly.
				 //
				 public void selectionChanged(SelectionChangedEvent event) {
					 handleContentSourceSelection(event.getSelection());
				 }
			 });
			
			new AdapterFactoryTreeEditor(sourceViewer.getTree(), adapterFactory);

			//To show the contextual menu (disabled for input and output models)
			//createContextMenuFor(inputViewer.get(i));
			
			//View for iTrace model
			{
				ViewerPane viewerPane2 = new ViewerPane(getSite().getPage(), ITraceEditorMulti.this) {
					@Override
					public Viewer createViewer(Composite composite) {
						Tree tree = new Tree(composite, SWT.MULTI);
						TreeViewer newTreeViewer = new TreeViewer(tree);
						return newTreeViewer;
					}
					
					@Override
					public void requestActivation() {
						super.requestActivation();
						setCurrentViewerPane(this);
					}
				};
				
				viewerPane2.createControl(topSashForm);	
				iTraceViewer = (TreeViewer) viewerPane2.getViewer();
				iTraceViewer.addDragSupport(DND.DROP_COPY | DND.DROP_LINK, transfers, new ViewerDragAdapter(iTraceViewer));
				iTraceViewer.setContentProvider(new AdapterFactoryContentProvider(adapterFactory));

				iTraceViewer.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
				iTraceViewer.setInput(editingDomain.getResourceSet());
				iTraceViewer.setSelection(new StructuredSelection(editingDomain.getResourceSet().getResources().get(0)), true);
				viewerPane2.setTitle("iTrace Model",Actions.getImage("iTraceModel"));
				iTraceViewer.addSelectionChangedListener(new ISelectionChangedListener() {
					 // This ensures that we handle selections correctly.
					 //
					 public void selectionChanged(SelectionChangedEvent event) {
						 handleContentiTraceSelection(event.getSelection());
					 }
				 });	

				new AdapterFactoryTreeEditor(iTraceViewer.getTree(),adapterFactory);

				createContextMenuFor(iTraceViewer);
				}
			
			// Create view for output models.
			ViewerPane viewerPane3 = new ViewerPane(getSite().getPage(),ITraceEditorMulti.this){
				@Override
				public Viewer createViewer(Composite composite) {
					Tree tree = new Tree(composite, SWT.MULTI);
					TreeViewer newTreeViewer = new TreeViewer(tree);
					return newTreeViewer;
				}

				@Override
				public void requestActivation() {
					super.requestActivation();
					setCurrentViewerPane(this);
				}
			};
			viewerPane3.createControl(topSashForm);
			targetViewer=(TreeViewer)viewerPane3.getViewer();
			targetViewer.setContentProvider(new AdapterFactoryContentProvider(adapterFactory));
			targetViewer.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
			targetViewer.addDragSupport(DND.DROP_LINK , transfers, new ViewerDragAdapter(targetViewer));
			
		

			///////////////////////////////////////////////////////////////////////////
			///////////////////////////////////////////////////////////////////////////
			// EXTENSIÓN M2T														 //
			// ^^^^^^^^^^^^^                                                         //
			// Revisión : 2012.11.28.13.11											 //
			// Autor:     Ángel M.												     //
			///////////////////////////////////////////////////////////////////////////
			
			// Creamos un TextViewer para mostrar el código
			textViewer = new TextViewer(topSashForm, SWT.MULTI | SWT.V_SCROLL);
			
			// Le asignamos un documento vacío en un primer momento
			textViewer.setDocument(new Document(""));
			
			// Ocultamos el TextViewer hasta que sea usado.
			int []sizes = {33,33,34,0};
			this.topSashForm.setWeights(sizes);
			
			///////////////////////////////////////////////////////////////////////////
			///////////////////////////////////////////////////////////////////////////
			///////////////////////////////////////////////////////////////////////////
			///////////////////////////////////////////////////////////////////////////
			
			
			//ArrayList<String> paths_target=new ArrayList<String>();
			for(int i=0;i<targets.size();i++){
				if (targets.get(i) instanceof ModelImpl){
					ModelImpl target_model = (ModelImpl) targets.get(i);
								
					if (target_model.getMetamodel() != null) { //If metamodel attribute is not null
						if (!target_model.getMetamodel().equals("")) { //If metamodel is not empty 
							String metamodelRegistered = Actions.registerMetamodel(target_model.getMetamodel(), target_model.getName());
							target_model.setMetamodel(metamodelRegistered);
						}
					}
				}
				//paths_target.add(targets.get(i).getPath());
			}
					
			targetRs = Actions.createResourceSet_Targets(targets);
		//	Actions.setTargetArtefacts(getEditingDomain().getResourceSet(),targets);
			
			targetViewer.setInput(targetRs);
			//targetViewer.setSelection(new StructuredSelection(targetRs.getResources().get(0)), true);
			
			// Permite la visualización del modelo de trazas cuando no tiene modelos destino
			 if (targetRs.getResources().size() >0){
				targetViewer.setSelection(new StructuredSelection(targetRs.getResources().get(0)), true);
			}
			
			viewerPane3.setTitle("Target Models");

			targetViewer
					.addSelectionChangedListener(new ISelectionChangedListener() {
						// This ensures that we handle selections correctly.
						//
						public void selectionChanged(SelectionChangedEvent event) {
							handleContentTargetSelection(event.getSelection());
						}
					});

			new AdapterFactoryTreeEditor(targetViewer.getTree(), adapterFactory);

			// To show the contextual menu (disabled for input and output
			// models)
			// createContextMenuFor(outputViewer.get(i));

			ITraceDragDrop dragdrop = new ITraceDragDrop(
					getEditingDomain(), iTraceViewer, this.sourceRs,
					this.targetRs);
			iTraceViewer.addDropSupport(DND.DROP_COPY | DND.DROP_LINK,
					transfers, dragdrop);

			int pageIndex = addPage(topSashForm);
			setPageText(pageIndex, getString("_UI_SelectionPage_label"));
			getSite().getShell().getDisplay().asyncExec(new Runnable() {
				public void run() {
					setActivePage(0);
				}
			});
		}
		// Ensures that this editor will only display the page's tab
		// area if there are more than one page
		//
		getContainer().addControlListener
			(new ControlAdapter() {
				boolean guard = false;
				@Override
				public void controlResized(ControlEvent event) {
					if (!guard) {
						guard = true;
						hideTabs();
						guard = false;
					}
				}
			 });

		getSite().getShell().getDisplay().asyncExec
			(new Runnable() {
				 public void run() {
					 updateProblemIndication();
				 }
			 });
		

		
	}
			
	

	/**
	 * If there is just one page in the multi-page editor part,
	 * this hides the single tab at the bottom.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void hideTabs() {
		if (getPageCount() <= 1) {
			setPageText(0, "");
			if (getContainer() instanceof CTabFolder) {
				((CTabFolder)getContainer()).setTabHeight(1);
				Point point = getContainer().getSize();
				getContainer().setSize(point.x, point.y + 6);
			}
		}
	}

	/**
	 * If there is more than one page in the multi-page editor part,
	 * this shows the tabs at the bottom.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void showTabs() {
		if (getPageCount() > 1) {
			setPageText(0, getString("_UI_SelectionPage_label"));
			if (getContainer() instanceof CTabFolder) {
				((CTabFolder)getContainer()).setTabHeight(SWT.DEFAULT);
				Point point = getContainer().getSize();
				getContainer().setSize(point.x, point.y - 6);
			}
		}
	}

	/**
	 * This is used to track the active viewer.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void pageChange(int pageIndex) {
		super.pageChange(pageIndex);

		if (contentOutlinePage != null) {
			handleContentOutlineSelection(contentOutlinePage.getSelection());
		}
	}

	/**
	 * This is how the framework determines which interfaces we implement.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("rawtypes")
	@Override
	public Object getAdapter(Class key) {
		if (key.equals(IContentOutlinePage.class)) {
			return showOutlineView() ? getContentOutlinePage() : null;
		}
		else if (key.equals(IPropertySheetPage.class)) {
			return getPropertySheetPage();
		}
		else if (key.equals(IGotoMarker.class)) {
			return this;
		}
		else {
			return super.getAdapter(key);
		}
	}

	/**
	 * This accesses a cached version of the content outliner.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IContentOutlinePage getContentOutlinePage() {
		if (contentOutlinePage == null) {
			// The content outline is just a tree.
			//
			class MyContentOutlinePage extends ContentOutlinePage {
				@Override
				public void createControl(Composite parent) {
					super.createControl(parent);
					contentOutlineViewer = getTreeViewer();
					contentOutlineViewer.addSelectionChangedListener(this);

					// Set up the tree viewer.
					//
					contentOutlineViewer.setContentProvider(new AdapterFactoryContentProvider(adapterFactory));
					contentOutlineViewer.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
					contentOutlineViewer.setInput(editingDomain.getResourceSet());

					// Make sure our popups work.
					//
					createContextMenuFor(contentOutlineViewer);

					if (!editingDomain.getResourceSet().getResources().isEmpty()) {
					  // Select the root object in the view.
					  //
					  contentOutlineViewer.setSelection(new StructuredSelection(editingDomain.getResourceSet().getResources().get(0)), true);
					}
				}

				@Override
				public void makeContributions(IMenuManager menuManager, IToolBarManager toolBarManager, IStatusLineManager statusLineManager) {
					super.makeContributions(menuManager, toolBarManager, statusLineManager);
					contentOutlineStatusLineManager = statusLineManager;
				}

				@Override
				public void setActionBars(IActionBars actionBars) {
					super.setActionBars(actionBars);
					getActionBarContributor().shareGlobalActions(this, actionBars);
				}
			}

			contentOutlinePage = new MyContentOutlinePage();

			// Listen to selection so that we can handle it is a special way.
			//
			contentOutlinePage.addSelectionChangedListener
				(new ISelectionChangedListener() {
					 // This ensures that we handle selections correctly.
					 //
					 public void selectionChanged(SelectionChangedEvent event) {
						 handleContentOutlineSelection(event.getSelection());
					 }
				 });
		}

		return contentOutlinePage;
	}

	/**
	 * This accesses a cached version of the property sheet.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPropertySheetPage getPropertySheetPage() {
		if (propertySheetPage == null) {
			propertySheetPage =
				new ExtendedPropertySheetPage(editingDomain) {
					@Override
					public void setSelectionToViewer(List<?> selection) {
						ITraceEditorMulti.this.setSelectionToViewer(selection);
						ITraceEditorMulti.this.setFocus();
					}

					@Override
					public void setActionBars(IActionBars actionBars) {
						super.setActionBars(actionBars);
						getActionBarContributor().shareGlobalActions(this, actionBars);
					}
				};
			propertySheetPage.setPropertySourceProvider(new AdapterFactoryContentProvider(adapterFactory));
		}

		return propertySheetPage;
	}

	/**
	 * This deals with how we want selection in the outliner to affect the other views.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void handleContentOutlineSelection(ISelection selection) {
		if (currentViewerPane != null && !selection.isEmpty() && selection instanceof IStructuredSelection) {
			Iterator<?> selectedElements = ((IStructuredSelection)selection).iterator();
			if (selectedElements.hasNext()) {
				// Get the first selected element.
				//
				Object selectedElement = selectedElements.next();

				// If it's the selection viewer, then we want it to select the same selection as this selection.
				//
				//if (currentViewerPane.getViewer() == selectionViewer) {
					ArrayList<Object> selectionList = new ArrayList<Object>();
					selectionList.add(selectedElement);
					while (selectedElements.hasNext()) {
						selectionList.add(selectedElements.next());
					}

					// Set the selection to the widget.
					//
					//selectionViewer.setSelection(new StructuredSelection(selectionList));
					iTraceViewer.setSelection(new StructuredSelection(selectionList));
				/*
				}
				else {
					// Set the input to the widget.
					//
					if (currentViewerPane.getViewer().getInput() != selectedElement) {
						currentViewerPane.getViewer().setInput(selectedElement);
						currentViewerPane.setTitle(selectedElement);
					}
				}*/
			}
		}
	}

	/**
	 * This is for implementing {@link IEditorPart} and simply tests the command stack.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isDirty() {
		return ((BasicCommandStack)editingDomain.getCommandStack()).isSaveNeeded();
	}

	/**
	 * This is for implementing {@link IEditorPart} and simply saves the model file.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void doSave(IProgressMonitor progressMonitor) {
		// Save only resources that have actually changed.
		//
		final Map<Object, Object> saveOptions = new HashMap<Object, Object>();
		saveOptions.put(Resource.OPTION_SAVE_ONLY_IF_CHANGED, Resource.OPTION_SAVE_ONLY_IF_CHANGED_MEMORY_BUFFER);

		// Do the work within an operation because this is a long running activity that modifies the workbench.
		//
		WorkspaceModifyOperation operation =
			new WorkspaceModifyOperation() {
				// This is the method that gets invoked when the operation runs.
				//
				@Override
				public void execute(IProgressMonitor monitor) {
					// Save the resources to the file system.
					//
					boolean first = true;
					for (Resource resource : editingDomain.getResourceSet().getResources()) {
						if ((first || !resource.getContents().isEmpty() || isPersisted(resource)) && !editingDomain.isReadOnly(resource)) {
							try {
								long timeStamp = resource.getTimeStamp();
								resource.save(saveOptions);
								if (resource.getTimeStamp() != timeStamp) {
									savedResources.add(resource);
								}
							}
							catch (Exception exception) {
								resourceToDiagnosticMap.put(resource, analyzeResourceProblems(resource, exception));
							}
							first = false;
						}
					}
				}
			};

		updateProblemIndication = false;
		try {
			// This runs the options, and shows progress.
			//
			new ProgressMonitorDialog(getSite().getShell()).run(true, false, operation);

			// Refresh the necessary state.
			//
			((BasicCommandStack)editingDomain.getCommandStack()).saveIsDone();
			firePropertyChange(IEditorPart.PROP_DIRTY);
		}
		catch (Exception exception) {
			// Something went wrong that shouldn't.
			//
			ITraceEditorPlugin.INSTANCE.log(exception);
		}
		updateProblemIndication = true;
		updateProblemIndication();
	}

	/**
	 * This returns whether something has been persisted to the URI of the specified resource.
	 * The implementation uses the URI converter from the editor's resource set to try to open an input stream. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected boolean isPersisted(Resource resource) {
		boolean result = false;
		try {
			InputStream stream = editingDomain.getResourceSet().getURIConverter().createInputStream(resource.getURI());
			if (stream != null) {
				result = true;
				stream.close();
			}
		}
		catch (IOException e) {
			// Ignore
		}
		return result;
	}

	/**
	 * This always returns true because it is not currently supported.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSaveAsAllowed() {
		return true;
	}

	/**
	 * This also changes the editor's input.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void doSaveAs() {
		SaveAsDialog saveAsDialog = new SaveAsDialog(getSite().getShell());
		saveAsDialog.open();
		IPath path = saveAsDialog.getResult();
		if (path != null) {
			IFile file = ResourcesPlugin.getWorkspace().getRoot().getFile(path);
			if (file != null) {
				doSaveAs(URI.createPlatformResourceURI(file.getFullPath().toString(), true), new FileEditorInput(file));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void doSaveAs(URI uri, IEditorInput editorInput) {
		(editingDomain.getResourceSet().getResources().get(0)).setURI(uri);
		setInputWithNotify(editorInput);
		setPartName(editorInput.getName());
		IProgressMonitor progressMonitor =
			getActionBars().getStatusLineManager() != null ?
				getActionBars().getStatusLineManager().getProgressMonitor() :
				new NullProgressMonitor();
		doSave(progressMonitor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void gotoMarker(IMarker marker) {
		try {
			if (marker.getType().equals(EValidator.MARKER)) {
				String uriAttribute = marker.getAttribute(EValidator.URI_ATTRIBUTE, null);
				if (uriAttribute != null) {
					URI uri = URI.createURI(uriAttribute);
					EObject eObject = editingDomain.getResourceSet().getEObject(uri, true);
					if (eObject != null) {
					  setSelectionToViewer(Collections.singleton(editingDomain.getWrapper(eObject)));
					}
				}
			}
		}
		catch (CoreException exception) {
			ITraceEditorPlugin.INSTANCE.log(exception);
		}
	}

	/**
	 * This is called during startup.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void init(IEditorSite site, IEditorInput editorInput) {
		setSite(site);
		setInputWithNotify(editorInput);
		setPartName(editorInput.getName());
		site.setSelectionProvider(this);
		site.getPage().addPartListener(partListener);
		ResourcesPlugin.getWorkspace().addResourceChangeListener(resourceChangeListener, IResourceChangeEvent.POST_CHANGE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFocus() {
		if (currentViewerPane != null) {
			currentViewerPane.setFocus();
		}
		else {
			getControl(getActivePage()).setFocus();
		}
	}

	/**
	 * This implements {@link org.eclipse.jface.viewers.ISelectionProvider}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addSelectionChangedListener(ISelectionChangedListener listener) {
		selectionChangedListeners.add(listener);
	}

	/**
	 * This implements {@link org.eclipse.jface.viewers.ISelectionProvider}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeSelectionChangedListener(ISelectionChangedListener listener) {
		selectionChangedListeners.remove(listener);
	}

	/**
	 * This implements {@link org.eclipse.jface.viewers.ISelectionProvider} to return this editor's overall selection.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISelection getSelection() {
		return editorSelection;
	}

	/**
	 * This implements {@link org.eclipse.jface.viewers.ISelectionProvider} to set this editor's overall selection.
	 * Calling this result will notify the listeners.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelection(ISelection selection) {
		editorSelection = selection;
		for (ISelectionChangedListener listener : selectionChangedListeners) {
			listener.selectionChanged(new SelectionChangedEvent(this, selection));
		}
		setStatusLineManager(selection);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatusLineManager(ISelection selection) {
		IStatusLineManager statusLineManager = currentViewer != null && currentViewer == contentOutlineViewer ?
			contentOutlineStatusLineManager : getActionBars().getStatusLineManager();

		if (statusLineManager != null) {
			if (selection instanceof IStructuredSelection) {
				Collection<?> collection = ((IStructuredSelection)selection).toList();
				switch (collection.size()) {
					case 0: {
						statusLineManager.setMessage(getString("_UI_NoObjectSelected"));
						break;
					}
					case 1: {
						
						///////////////////////////////////////////////////////////////////////////
						///////////////////////////////////////////////////////////////////////////
						// EXTENSIÓN M2T														 //
						// ^^^^^^^^^^^^^                                                         //
						// Revisión : 2012.11.28.13.11											 //
						// Autor:     Ángel M.												     //
						///////////////////////////////////////////////////////////////////////////
						///////////////////////////////////////////////////////////////////////////		
						
						// 1º - Obtenemos el objeto que se selecciona en cualquiera de los árboles
						Object obj = collection.iterator().next();
						
						String text = new AdapterFactoryItemDelegator(adapterFactory).getText(obj);
						
						// 2º - Discriminamos en base al tipo del objeto que se selecciona,
						//      en nuestro caso, en base a un BlockImpl.
						if (obj instanceof iTrace.impl.BlockImpl)
						{
							// Creamos un nuevo Document, que usaremos posteriormente para asignárselo
							// al TextViewer
							Document d = new Document();
							
							// Desencapsulamos el obj dandaloe forma de BlockImpl
							// para poder acceder a los datos que contiene como objeto
							iTrace.impl.BlockImpl block = (iTrace.impl.BlockImpl) obj;

							// Verificamos si la información se ha cargado con anterioridad,
							// para evitar cargas reduntantes del fichero de código.
							if (!this.DataCharged)
							{
								// Visualizamos el TextViewer, para ello ocultamos el 3º TreeViewer, y
								// mostramos el TextViewer. Esta operación se realiza mediante porcentajes
								// sobre el contenedor principal, el topSashForm.
								int []sizes = {33,33,0,34};
								this.topSashForm.setWeights(sizes);

								// Procedemos a la carga del fichero asociado al BlockImpl
								FileReader fr = null;
								
								// Declaramos una variable String para guardar los datos leidos desde el fichero
								String file = "";
								try
								{									
									// Obtenemos el path del fichero, a través del objeto Code, que nos suministra
									// el método getCode()
									String path = block.getCode().getPath()+block.getCode().getName();
									
									// Leemos el fichero "caracter a caracter", para no afectar la integridad
									// del fichero orignial, y evitarnos problemas de offsets
									fr = new FileReader(path); 
									BufferedReader br = new BufferedReader(fr); 
									int s; 
									while((s = br.read()) > 0) { 
										file += (char) s;				
									}
									fr.close();
									
									// Asignamos el contenido leido al TextViewer a través de su Document
									this.textViewer.getDocument().set(file);

									// Ponemos el flag DataCharged a true para evitar lecturas redundantes
									this.DataCharged = true;
									
								}
								catch (Exception e)
								{


								}
								finally
								{
									// En caso de que surja algún problema controlamos la excepción
									try {
										fr.close();
									} catch (IOException e) {
										
										e.printStackTrace();
									}	
								}
							}

							// PERSONALIZACIÓN DEL EDITOR DE TEXTO EN BASE A LAS SELECCIONES DE BLOOQUES
							// ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
							
							// Definimos una serie de objetos Color, para tener a primera vista que colores
							// vamos a usar con el editor
							StyleRange Stylerng = null;
							
							// Color Blanco, para poner el texto seleccionado o el fondo en blanco
							Color whiteFont = new Color(null, 255,255,255);
							
							// Color Negro, para restaurar el color original de la fuente cuando se deselecciona
							Color blackFont = new Color(null, 0,0,0);			
							
							// Color Azul, para el fondo cuando se selecciona un bloque
							Color blueBackground = new Color(null, 3,13,126);

							// Obtenemos el document del TextViewer para personalizarlo
							d = (Document) this.textViewer.getDocument();
							
							// Creamos un TextPresentation para personalizar el Document
							TextPresentation tpp = new TextPresentation();

							// Si ya se ha realizado alguna seleccion previa, eliminamos el formato que tuviera
							if (this.lastBlock != null)
							{
								try
								{
									Stylerng = new StyleRange(d.getLineOffset(lastBlock.getStartLine()-1), lastBlock.getEndColumn(), blackFont, whiteFont, SWT.NORMAL);
									tpp.replaceStyleRange(Stylerng);
									this.textViewer.changeTextPresentation(tpp, false);
								}
								catch (Exception e)
								{
									
								}

							}
								
							// Estilizamos el Document, en base al Block que se ha seleccionado, y personalizamos texto
							try
							{
								Stylerng = new StyleRange(d.getLineOffset(block.getStartLine()-1), block.getEndColumn(), whiteFont, blueBackground, SWT.BOLD);
								tpp.replaceStyleRange(Stylerng);
								this.textViewer.changeTextPresentation(tpp, false);
							}
							catch (Exception e)
							{
								
							}

							// Salvamos el ultimo bloque seleccionado.
							this.lastBlock = block;
						} // Fin del IF
						
						///////////////////////////////////////////////////////////////////////////
						///////////////////////////////////////////////////////////////////////////
						///////////////////////////////////////////////////////////////////////////
						///////////////////////////////////////////////////////////////////////////
						
						statusLineManager.setMessage(getString("_UI_SingleObjectSelected", text));
						
						break;
					}
					default: {
						statusLineManager.setMessage(getString("_UI_MultiObjectSelected", Integer.toString(collection.size())));
						break;
					}
				}
			}
			else {
				statusLineManager.setMessage("");
			}
		}
	}

	/**
	 * This looks up a string in the plugin's plugin.properties file.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static String getString(String key) {
		return ITraceEditorPlugin.INSTANCE.getString(key);
	}

	/**
	 * This looks up a string in plugin.properties, making a substitution.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static String getString(String key, Object s1) {
		return ITraceEditorPlugin.INSTANCE.getString(key, new Object [] { s1 });
	}

	/**
	 * This implements {@link org.eclipse.jface.action.IMenuListener} to help fill the context menus with contributions from the Edit menu.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void menuAboutToShow(IMenuManager menuManager) {
		((IMenuListener)getEditorSite().getActionBarContributor()).menuAboutToShow(menuManager);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EditingDomainActionBarContributor getActionBarContributor() {
		return (EditingDomainActionBarContributor)getEditorSite().getActionBarContributor();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IActionBars getActionBars() {
		return getActionBarContributor().getActionBars();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdapterFactory getAdapterFactory() {
		return adapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void dispose() {
		updateProblemIndication = false;

		ResourcesPlugin.getWorkspace().removeResourceChangeListener(resourceChangeListener);

		getSite().getPage().removePartListener(partListener);

		adapterFactory.dispose();

		if (getActionBarContributor().getActiveEditor() == this) {
			getActionBarContributor().setActiveEditor(null);
		}

		if (propertySheetPage != null) {
			propertySheetPage.dispose();
		}

		if (contentOutlinePage != null) {
			contentOutlinePage.dispose();
		}

		super.dispose();
	}

	/**
	 * Returns whether the outline view should be presented to the user.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected boolean showOutlineView() {
		return true;
	}
	
	/**
	 * This deals with how we want selection in an input viewer to affect the other views.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @NOT generated
	 */
	public void handleContentSourceSelection(ISelection selection) {
		ArrayList<TraceLinkElement> traceElements = new ArrayList<TraceLinkElement>();
		String id = null;
		if(currentViewerPane != null
				&& getViewer().equals(sourceViewer)
				&&!selection.isEmpty()
				&& selection instanceof IStructuredSelection){
			Iterator<?> selectedElements = ((IStructuredSelection) selection).iterator();
			while (selectedElements.hasNext()) {
				Object selectedElement = selectedElements.next();
				if (selectedElement instanceof EObject) {
					EObject eoSelectedElement = (EObject) selectedElement;
					XMIResource resource = (XMIResource) eoSelectedElement.eResource();
					id = resource.getID(eoSelectedElement); // Get element id
					if(id==null)
						id=resource.getURIFragment(eoSelectedElement);
					TreeIterator<?> traceContents = editingDomain
					.getResourceSet().getResources().get(0)
					.getAllContents();
					while (traceContents.hasNext()) {
						// For each source element from a trace model
						EObject element = (EObject) traceContents.next();
						if (element instanceof SourceElementImpl) {
							SourceElementImpl source = (SourceElementImpl) element;
							if (source.getRef() != null && id != null
									&& source.getRef().equals(id)) {
								ArrayList<TraceLink> tracelinks = new ArrayList<TraceLink>();
								tracelinks.add(source.getTraceLink());
								for (int cont2 = 0; cont2 < tracelinks.size(); cont2++) {
									TraceLinkImpl traceLink = (TraceLinkImpl) tracelinks
											.get(cont2);
	//								traceElements.add(traceLink);
								}
								traceElements.add(source);
							}
						}
					}
				}
			}
			iTraceViewer.setSelection(new StructuredSelection(traceElements),true);
			targetViewer.setSelection(new StructuredSelection(new ArrayList<Object>()),true);
		}
	}
	
	/**
	 * This deals with how we want selection in an input viewer to affect the other views.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @NOT generated
	 */
	public void handleContentTargetSelection(ISelection selection) {
		ArrayList<TraceLinkElement> traceElements = new ArrayList<TraceLinkElement>();
		String id = null;
		
		if(currentViewerPane != null
				&& getViewer().equals(targetViewer)
				&&!selection.isEmpty()
				&& selection instanceof IStructuredSelection){
			Iterator<?> selectedElements = ((IStructuredSelection) selection).iterator();
			while (selectedElements.hasNext()) {
				Object selectedElement = selectedElements.next();
				if (selectedElement instanceof EObject) {
					EObject eoSelectedElement = (EObject) selectedElement;
					XMIResource resource = (XMIResource) eoSelectedElement.eResource();
					id = resource.getID(eoSelectedElement); // Get element id
					if(id==null)
						id=resource.getURIFragment(eoSelectedElement);
					TreeIterator<?> traceContents = editingDomain
					.getResourceSet().getResources().get(0)
					.getAllContents();
					while (traceContents.hasNext()) {
						// For each target element from a trace model
						EObject element = (EObject) traceContents.next();
						if (element instanceof TargetElementImpl) {
							TargetElementImpl target = (TargetElementImpl) element;
							if (target.getRef() != null && id != null
									&& target.getRef().equals(id)) {
								ArrayList<TraceLink> tracelinks = new ArrayList<TraceLink>();
								tracelinks.add(target.getTraceLink());
								for (int cont2 = 0; cont2 < tracelinks.size(); cont2++) {
									TraceLinkImpl traceLink = (TraceLinkImpl) tracelinks
											.get(cont2);
					//				traceElements.add(traceLink);
								}
								traceElements.add(target);
							}
						}
					}
				}
			}
			iTraceViewer.setSelection(new StructuredSelection(traceElements),true);
			sourceViewer.setSelection(new StructuredSelection(new ArrayList<Object>()),true);
		}
	}
	
	
	/**
	 * This deals with how we want selection in the iTrace viewer to affect the other views.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @NOT generated
	 */
	public void handleContentiTraceSelection(ISelection selection) {
		ArrayList<Object> sourceElements = new ArrayList<Object>();
		ArrayList<Object> targetElements = new ArrayList<Object>();
		////////////
		/// ANGEL
		///////////
		/*if (((TreeSelection)selection).getFirstElement().toString() == "M2MLink?")
		{
			M2MLink m2m = (M2MLink) ((TreeSelection)selection).getFirstElement();
			TargetElement Target = m2m.getTargetElements().get(0);

		}*/

		// Get source and target elements from traceability model
		if (currentViewerPane != null
				&& getViewer().equals(iTraceViewer)
				&& !selection.isEmpty()
				&& selection instanceof IStructuredSelection) {
			Iterator<?> selectedElements = ((IStructuredSelection) selection)
					.iterator();
			while (selectedElements.hasNext()) {
				Object selectedElement = selectedElements.next();
				if (selectedElement instanceof EObject) {
					EObject eoSelectedElement = (EObject) selectedElement;
					//a TraceLink has been selected
					if (eoSelectedElement instanceof TraceLinkImpl) { 
						TraceLinkImpl traceLink = (TraceLinkImpl) eoSelectedElement;
						// Source
						//System.out.println("Tamaño get source elements: "+ traceLink.getSourceElements().size());
						for (int i = 0; i < traceLink.getSourceElements().size(); i++) {
							// For each ResourceSet (Input)
							for (int j = 0; j < sourceRs.getResources().size(); j++) {
								TreeIterator<?> in_ti = sourceRs.getResources()
										.get(j).getAllContents();
								while (in_ti.hasNext()) {
									// For each element from a input model
									EObject element = (EObject) in_ti.next();
									XMIResource resource = (XMIResource) element
											.eResource();
									String id = resource.getID(element); // Get element id
									if (id == null)
										id = resource.getURIFragment(element);
									if (traceLink.getSourceElements().get(i)
											.getRef() != null
											&& id != null
											&& id.equals(traceLink
													.getSourceElements().get(i)
													.getRef())) {
										sourceElements.add(element);
									}
								}
							}
							
						}
						//System.out.println("Pasa por aqui *****************");
						// Target
						if (traceLink instanceof M2MLinkImpl) {
							M2MLinkImpl m2mLink = (M2MLinkImpl) traceLink;
							//System.out.println("**** y es un m2mlinkimpl *****************");
							for (int i = 0; i < m2mLink.getTargetElements().size(); i++) {
								// Get target elements from target models
								for (int j = 0; j < sourceRs.getResources().size(); j++) {
									TreeIterator<?> out_ti = targetRs.getResources().get(j)
										.getAllContents();
									while (out_ti.hasNext()) {
										// For each element from an output model
										EObject element = (EObject) out_ti.next();
										XMIResource resource = (XMIResource) element
												.eResource();
										String id = resource.getID(element); // Get element id
										if(id==null)
											id=resource.getURIFragment(element);							
										if (m2mLink.getTargetElements().get(i).getRef()!=null && 
												id != null && 
												id.equals(m2mLink.getTargetElements().get(i).getRef())) {
											targetElements.add(element);
										}
									}
								}
							}
						}
					} else // a sourceElement has been selected
					if (eoSelectedElement instanceof SourceElementImpl) {
						SourceElementImpl elementSelected = (SourceElementImpl) eoSelectedElement;
						// Get source element from input models
						for (int c1 = 0; c1 < sourceRs.getResources().size(); c1++) {
							// For each ResourceSet (Source)
							TreeIterator<?> in_ti = sourceRs.getResources().get(c1)
									.getAllContents();
							while (in_ti.hasNext()) {
								// For each element from a input model
								EObject element = (EObject) in_ti.next();
								XMIResource resource = (XMIResource) element
										.eResource();
								// Get element id
								String id = resource.getID(element); 
								if (id == null)
									id = resource.getURIFragment(element);
								if (elementSelected.getRef() != null
										&& id != null
										&& id.equals(elementSelected.getRef())) {
									sourceElements.add(element);
								}
							}
						}
						
					} else // a targetElement has been selected
					if (eoSelectedElement instanceof TargetElementImpl) {
						TargetElementImpl elementSelected = (TargetElementImpl) eoSelectedElement;
						// Get target element from output models
						for (int c1 = 0; c1 < targetRs.getResources().size(); c1++) {
							// For each ResourceSet (Target)
							TreeIterator<?> out_ti = targetRs.getResources().get(c1)
									.getAllContents();
							while (out_ti.hasNext()) {
								// For each element from a input model
								EObject element = (EObject) out_ti.next();
								XMIResource resource = (XMIResource) element
										.eResource();
								// Get element id
								String id = resource.getID(element); 
								if(id==null)
									id=resource.getURIFragment(element);
								if (elementSelected.getRef()!=null && 
										id!=null && 
										id.equals(elementSelected.getRef())) {
									targetElements.add(element);
								}
							}
						}
					}
				}
			}
			if (currentViewerPane != null){
				// Select elements in source and target models
				sourceViewer.setSelection(new StructuredSelection(sourceElements),true);
				targetViewer.setSelection(new StructuredSelection(targetElements),true);
			}
		}
	}
	
}