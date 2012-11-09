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
 * A representation of the model object '<em><b>M2M Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link iTrace.M2MLink#getTargetElements <em>Target Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see iTrace.ITracePackage#getM2MLink()
 * @model
 * @generated
 */
public interface M2MLink extends TraceLink {
	/**
	 * Returns the value of the '<em><b>Target Elements</b></em>' containment reference list.
	 * The list contents are of type {@link iTrace.TargetElement}.
	 * It is bidirectional and its opposite is '{@link iTrace.TargetElement#getTraceLink <em>Trace Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Elements</em>' containment reference list.
	 * @see iTrace.ITracePackage#getM2MLink_TargetElements()
	 * @see iTrace.TargetElement#getTraceLink
	 * @model opposite="traceLink" containment="true"
	 * @generated
	 */
	EList<TargetElement> getTargetElements();

} // M2MLink
