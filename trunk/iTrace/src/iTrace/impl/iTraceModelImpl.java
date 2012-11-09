/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package iTrace.impl;

import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

import iTrace.Artefact;
import iTrace.ITracePackage;
import iTrace.Model;
import iTrace.SpecificFeature;
import iTrace.TraceLink;
import iTrace.TraceLinkElement;
import iTrace.iTraceModel;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>iTrace Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link iTrace.impl.iTraceModelImpl#getTraceLinks <em>Trace Links</em>}</li>
 *   <li>{@link iTrace.impl.iTraceModelImpl#getArtefacts <em>Artefacts</em>}</li>
 *   <li>{@link iTrace.impl.iTraceModelImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link iTrace.impl.iTraceModelImpl#getProjectName <em>Project Name</em>}</li>
 *   <li>{@link iTrace.impl.iTraceModelImpl#getSpecificFeatures <em>Specific Features</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class iTraceModelImpl extends CDOObjectImpl implements iTraceModel {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected iTraceModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ITracePackage.Literals.ITRACE_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<TraceLink> getTraceLinks() {
		return (EList<TraceLink>)eGet(ITracePackage.Literals.ITRACE_MODEL__TRACE_LINKS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Artefact> getArtefacts() {
		return (EList<Artefact>)eGet(ITracePackage.Literals.ITRACE_MODEL__ARTEFACTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return (String)eGet(ITracePackage.Literals.ITRACE_MODEL__VERSION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		eSet(ITracePackage.Literals.ITRACE_MODEL__VERSION, newVersion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProjectName() {
		return (String)eGet(ITracePackage.Literals.ITRACE_MODEL__PROJECT_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProjectName(String newProjectName) {
		eSet(ITracePackage.Literals.ITRACE_MODEL__PROJECT_NAME, newProjectName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	//@SuppressWarnings("unchecked")
	public SpecificFeature getSpecificFeatures() {
		return (SpecificFeature)eGet(ITracePackage.Literals.ITRACE_MODEL__SPECIFIC_FEATURES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecificFeatures(SpecificFeature newSpecificFeatures) {
		eSet(ITracePackage.Literals.ITRACE_MODEL__SPECIFIC_FEATURES, newSpecificFeatures);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @NOT generated
	 */
	public void refreshRefs() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		System.out.println("He ejecutado el método refreshRefs");
		
	//	ITracePackage.eINSTANCE.eClass();
		
		// Registramos el recurso factoria XMI para la extension iTRACE
	//	Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
	//	Map <String, Object> model = reg.getExtensionToFactoryMap();
	//	model.put("iTrace", new XMIResourceFactoryImpl());
				
		// Obtenemos un nuevo resource set
	//	ResourceSet resourceSet = new ResourceSetImpl();
		
	//	System.out.println(modelName);
		// Obtenemos el recurso
	//	Resource resource = resourceSet.getResource
			//(URI.createURI("model/uml2sql2003.iTrace"), true);
	//		(URI.createURI(modelName), true);
				
		// Obtenemos el primer modelo y hacemos casting del tipo
	//	iTraceModel itm = (iTraceModel) this.g.getContents().get(0);
		
// ---- Fin: Leemos el modelo existente --------		
		
				
		// Obtenemos los Artefactos
	 	for (Iterator <Artefact> iter_Art = this.getArtefacts().iterator(); iter_Art.hasNext();) {
	 		Artefact art = iter_Art.next();
	 		
	 		if (art instanceof Model) {
	 			
				Model mod = (Model) art;
	 		
	 			for (Iterator <TraceLinkElement> iter_tle = mod.getElements().iterator(); iter_tle.hasNext();) {
			 		TraceLinkElement tle = iter_tle.next();
			 		if (tle.getObject() != null) {
			 			String [] newRef = EcoreUtil.getURI(tle.getObject()).toString().split("#");

			 			System.out.println(EcoreUtil.getURI(tle.getObject()));
			 			
			 			tle.setRef(newRef[1]);
			 			tle.setObject(null);
			 		
			 			System.out.println(" Valor del ref: " + tle.getRef().toString());
			 			//System.out.println(" Valor del obj: " +  EcoreUtil.getURI(tle.getObject()).toString());
			 		
			 			// Now save the content.
			 		//	try {
			 		//		resource.save(Collections.EMPTY_MAP);
			 		//	} catch (IOException e) {
			 				// TODO Auto-generated catch block
			 		//		e.printStackTrace();
			 		//	}
			 		}
	 			}
	 		}
	 	}
	 	System.out.println("Referencias del modelo actualizadas");
		
		
		
		
		
		//throw new UnsupportedOperationException();
	}

} //iTraceModelImpl
