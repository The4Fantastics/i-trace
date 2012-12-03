/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package iTrace.impl;

import iTrace.Feature;
import iTrace.ITracePackage;
import iTrace.SpecificFeature;
import iTrace.iTraceModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specific Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link iTrace.impl.SpecificFeatureImpl#getFeatures <em>Features</em>}</li>
 *   <li>{@link iTrace.impl.SpecificFeatureImpl#getGroupName <em>Group Name</em>}</li>
 *   <li>{@link iTrace.impl.SpecificFeatureImpl#getITraceModel <em>ITrace Model</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SpecificFeatureImpl extends CDOObjectImpl implements SpecificFeature {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecificFeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ITracePackage.Literals.SPECIFIC_FEATURE;
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
	public EList<Feature> getFeatures() {
		return (EList<Feature>)eGet(ITracePackage.Literals.SPECIFIC_FEATURE__FEATURES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGroupName() {
		return (String)eGet(ITracePackage.Literals.SPECIFIC_FEATURE__GROUP_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroupName(String newGroupName) {
		eSet(ITracePackage.Literals.SPECIFIC_FEATURE__GROUP_NAME, newGroupName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public iTraceModel getITraceModel() {
		return (iTraceModel)eGet(ITracePackage.Literals.SPECIFIC_FEATURE__ITRACE_MODEL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setITraceModel(iTraceModel newITraceModel) {
		eSet(ITracePackage.Literals.SPECIFIC_FEATURE__ITRACE_MODEL, newITraceModel);
	}

} //SpecificFeatureImpl
