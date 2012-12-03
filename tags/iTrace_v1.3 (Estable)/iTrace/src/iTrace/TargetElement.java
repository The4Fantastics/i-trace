/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package iTrace;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Target Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link iTrace.TargetElement#getTraceLink <em>Trace Link</em>}</li>
 * </ul>
 * </p>
 *
 * @see iTrace.ITracePackage#getTargetElement()
 * @model
 * @generated
 */
public interface TargetElement extends TraceLinkElement {
	/**
	 * Returns the value of the '<em><b>Trace Link</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link iTrace.M2MLink#getTargetElements <em>Target Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trace Link</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trace Link</em>' container reference.
	 * @see #setTraceLink(M2MLink)
	 * @see iTrace.ITracePackage#getTargetElement_TraceLink()
	 * @see iTrace.M2MLink#getTargetElements
	 * @model opposite="targetElements" required="true" transient="false"
	 * @generated
	 */
	M2MLink getTraceLink();

	/**
	 * Sets the value of the '{@link iTrace.TargetElement#getTraceLink <em>Trace Link</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trace Link</em>' container reference.
	 * @see #getTraceLink()
	 * @generated
	 */
	void setTraceLink(M2MLink value);

} // TargetElement
