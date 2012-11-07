/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package iTrace;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link iTrace.Model#getElements <em>Elements</em>}</li>
 *   <li>{@link iTrace.Model#getMetamodel <em>Metamodel</em>}</li>
 * </ul>
 * </p>
 *
 * @see iTrace.ITracePackage#getModel()
 * @model
 * @generated
 */
public interface Model extends Artefact {
	/**
	 * Returns the value of the '<em><b>Metamodel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metamodel</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metamodel</em>' attribute.
	 * @see #setMetamodel(String)
	 * @see iTrace.ITracePackage#getModel_Metamodel()
	 * @model required="true"
	 * @generated
	 */
	String getMetamodel();

	/**
	 * Sets the value of the '{@link iTrace.Model#getMetamodel <em>Metamodel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metamodel</em>' attribute.
	 * @see #getMetamodel()
	 * @generated
	 */
	void setMetamodel(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	ModelType getModelType();

	/**
	 * Returns the value of the '<em><b>Elements</b></em>' reference list.
	 * The list contents are of type {@link iTrace.TraceLinkElement}.
	 * It is bidirectional and its opposite is '{@link iTrace.TraceLinkElement#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' reference list.
	 * @see iTrace.ITracePackage#getModel_Elements()
	 * @see iTrace.TraceLinkElement#getModel
	 * @model opposite="model"
	 * @generated
	 */
	EList<TraceLinkElement> getElements();

} // Model
