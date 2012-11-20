/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package iTrace;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link iTrace.Feature#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link iTrace.Feature#getValue <em>Value</em>}</li>
 *   <li>{@link iTrace.Feature#getSpecificFeature <em>Specific Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @see iTrace.ITracePackage#getFeature()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface Feature extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' attribute.
	 * @see #setAttribute(String)
	 * @see iTrace.ITracePackage#getFeature_Attribute()
	 * @model
	 * @generated
	 */
	String getAttribute();

	/**
	 * Sets the value of the '{@link iTrace.Feature#getAttribute <em>Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute</em>' attribute.
	 * @see #getAttribute()
	 * @generated
	 */
	void setAttribute(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see iTrace.ITracePackage#getFeature_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link iTrace.Feature#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Specific Feature</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link iTrace.SpecificFeature#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specific Feature</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specific Feature</em>' container reference.
	 * @see #setSpecificFeature(SpecificFeature)
	 * @see iTrace.ITracePackage#getFeature_SpecificFeature()
	 * @see iTrace.SpecificFeature#getFeatures
	 * @model opposite="features" required="true" transient="false"
	 * @generated
	 */
	SpecificFeature getSpecificFeature();

	/**
	 * Sets the value of the '{@link iTrace.Feature#getSpecificFeature <em>Specific Feature</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specific Feature</em>' container reference.
	 * @see #getSpecificFeature()
	 * @generated
	 */
	void setSpecificFeature(SpecificFeature value);

} // Feature
