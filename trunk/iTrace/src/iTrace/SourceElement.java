/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package iTrace;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Source Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link iTrace.SourceElement#getTraceLink <em>Trace Link</em>}</li>
 * </ul>
 * </p>
 *
 * @see iTrace.ITracePackage#getSourceElement()
 * @model
 * @generated
 */
public interface SourceElement extends TraceLinkElement {
	/**
	 * Returns the value of the '<em><b>Trace Link</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link iTrace.TraceLink#getSourceElements <em>Source Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trace Link</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trace Link</em>' container reference.
	 * @see #setTraceLink(TraceLink)
	 * @see iTrace.ITracePackage#getSourceElement_TraceLink()
	 * @see iTrace.TraceLink#getSourceElements
	 * @model opposite="sourceElements" required="true" transient="false"
	 * @generated
	 */
	TraceLink getTraceLink();

	/**
	 * Sets the value of the '{@link iTrace.SourceElement#getTraceLink <em>Trace Link</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trace Link</em>' container reference.
	 * @see #getTraceLink()
	 * @generated
	 */
	void setTraceLink(TraceLink value);

} // SourceElement
