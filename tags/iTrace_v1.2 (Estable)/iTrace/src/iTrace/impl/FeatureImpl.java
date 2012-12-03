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


import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link iTrace.impl.FeatureImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link iTrace.impl.FeatureImpl#getValue <em>Value</em>}</li>
 *   <li>{@link iTrace.impl.FeatureImpl#getSpecificFeature <em>Specific Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FeatureImpl extends CDOObjectImpl implements Feature {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ITracePackage.Literals.FEATURE;
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
	public String getAttribute() {
		return (String)eGet(ITracePackage.Literals.FEATURE__ATTRIBUTE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttribute(String newAttribute) {
		eSet(ITracePackage.Literals.FEATURE__ATTRIBUTE, newAttribute);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return (String)eGet(ITracePackage.Literals.FEATURE__VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		eSet(ITracePackage.Literals.FEATURE__VALUE, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecificFeature getSpecificFeature() {
		return (SpecificFeature)eGet(ITracePackage.Literals.FEATURE__SPECIFIC_FEATURE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecificFeature(SpecificFeature newSpecificFeature) {
		eSet(ITracePackage.Literals.FEATURE__SPECIFIC_FEATURE, newSpecificFeature);
	}

} //FeatureImpl
