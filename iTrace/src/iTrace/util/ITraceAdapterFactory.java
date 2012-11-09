/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package iTrace.util;

import iTrace.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see iTrace.ITracePackage
 * @generated
 */
public class ITraceAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ITracePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ITraceAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ITracePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ITraceSwitch<Adapter> modelSwitch =
		new ITraceSwitch<Adapter>() {
			@Override
			public Adapter caseiTraceModel(iTraceModel object) {
				return createiTraceModelAdapter();
			}
			@Override
			public Adapter caseTraceLink(TraceLink object) {
				return createTraceLinkAdapter();
			}
			@Override
			public Adapter caseTraceLinkElement(TraceLinkElement object) {
				return createTraceLinkElementAdapter();
			}
			@Override
			public Adapter caseM2MLink(M2MLink object) {
				return createM2MLinkAdapter();
			}
			@Override
			public Adapter caseM2TLink(M2TLink object) {
				return createM2TLinkAdapter();
			}
			@Override
			public Adapter caseArtefact(Artefact object) {
				return createArtefactAdapter();
			}
			@Override
			public Adapter caseCode(Code object) {
				return createCodeAdapter();
			}
			@Override
			public Adapter caseBlock(Block object) {
				return createBlockAdapter();
			}
			@Override
			public Adapter caseModel(Model object) {
				return createModelAdapter();
			}
			@Override
			public Adapter caseSourceElement(SourceElement object) {
				return createSourceElementAdapter();
			}
			@Override
			public Adapter caseTargetElement(TargetElement object) {
				return createTargetElementAdapter();
			}
			@Override
			public Adapter caseFeature(Feature object) {
				return createFeatureAdapter();
			}
			@Override
			public Adapter caseSpecificFeature(SpecificFeature object) {
				return createSpecificFeatureAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link iTrace.iTraceModel <em>iTrace Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iTrace.iTraceModel
	 * @generated
	 */
	public Adapter createiTraceModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iTrace.TraceLink <em>Trace Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iTrace.TraceLink
	 * @generated
	 */
	public Adapter createTraceLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iTrace.TraceLinkElement <em>Trace Link Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iTrace.TraceLinkElement
	 * @generated
	 */
	public Adapter createTraceLinkElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iTrace.M2MLink <em>M2M Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iTrace.M2MLink
	 * @generated
	 */
	public Adapter createM2MLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iTrace.M2TLink <em>M2T Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iTrace.M2TLink
	 * @generated
	 */
	public Adapter createM2TLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iTrace.Artefact <em>Artefact</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iTrace.Artefact
	 * @generated
	 */
	public Adapter createArtefactAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iTrace.Code <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iTrace.Code
	 * @generated
	 */
	public Adapter createCodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iTrace.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iTrace.Block
	 * @generated
	 */
	public Adapter createBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iTrace.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iTrace.Model
	 * @generated
	 */
	public Adapter createModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iTrace.SourceElement <em>Source Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iTrace.SourceElement
	 * @generated
	 */
	public Adapter createSourceElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iTrace.TargetElement <em>Target Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iTrace.TargetElement
	 * @generated
	 */
	public Adapter createTargetElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iTrace.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iTrace.Feature
	 * @generated
	 */
	public Adapter createFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iTrace.SpecificFeature <em>Specific Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iTrace.SpecificFeature
	 * @generated
	 */
	public Adapter createSpecificFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ITraceAdapterFactory
