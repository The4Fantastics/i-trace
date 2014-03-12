/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package iTrace;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specific Features</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link iTrace.SpecificFeatures#getFeature <em>Feature</em>}</li>
 *   <li>{@link iTrace.SpecificFeatures#getGroupName <em>Group Name</em>}</li>
 *   <li>{@link iTrace.SpecificFeatures#getITraceModel <em>ITrace Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see iTrace.ITracePackage#getSpecificFeatures()
 * @model abstract="true"
 * @extends CDOObject
 * @generated
 */
public interface SpecificFeatures extends CDOObject {
	/**
	 * Returns the value of the '<em><b>ITrace Model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link iTrace.iTraceModel#getSpecificFeatures <em>Specific Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ITrace Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ITrace Model</em>' container reference.
	 * @see #setITraceModel(iTraceModel)
	 * @see iTrace.ITracePackage#getSpecificFeatures_ITraceModel()
	 * @see iTrace.iTraceModel#getSpecificFeatures
	 * @model opposite="specificFeatures" required="true" transient="false"
	 * @generated
	 */
	iTraceModel getITraceModel();

	/**
	 * Sets the value of the '{@link iTrace.SpecificFeatures#getITraceModel <em>ITrace Model</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ITrace Model</em>' container reference.
	 * @see #getITraceModel()
	 * @generated
	 */
	void setITraceModel(iTraceModel value);

	/**
	 * Returns the value of the '<em><b>Feature</b></em>' containment reference list.
	 * The list contents are of type {@link iTrace.Feature}.
	 * It is bidirectional and its opposite is '{@link iTrace.Feature#getSpecificFeatures <em>Specific Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' containment reference list.
	 * @see iTrace.ITracePackage#getSpecificFeatures_Feature()
	 * @see iTrace.Feature#getSpecificFeatures
	 * @model opposite="specificFeatures" containment="true" required="true"
	 * @generated
	 */
	EList<Feature> getFeature();

	/**
	 * Returns the value of the '<em><b>Group Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group Name</em>' attribute.
	 * @see #setGroupName(String)
	 * @see iTrace.ITracePackage#getSpecificFeatures_GroupName()
	 * @model
	 * @generated
	 */
	String getGroupName();

	/**
	 * Sets the value of the '{@link iTrace.SpecificFeatures#getGroupName <em>Group Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group Name</em>' attribute.
	 * @see #getGroupName()
	 * @generated
	 */
	void setGroupName(String value);

} // SpecificFeatures
