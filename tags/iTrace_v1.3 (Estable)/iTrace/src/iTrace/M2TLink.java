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
 * A representation of the model object '<em><b>M2T Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link iTrace.M2TLink#getTargetBlocks <em>Target Blocks</em>}</li>
 * </ul>
 * </p>
 *
 * @see iTrace.ITracePackage#getM2TLink()
 * @model
 * @generated
 */
public interface M2TLink extends TraceLink {
	/**
	 * Returns the value of the '<em><b>Target Blocks</b></em>' containment reference list.
	 * The list contents are of type {@link iTrace.Block}.
	 * It is bidirectional and its opposite is '{@link iTrace.Block#getTraceLink <em>Trace Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Blocks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Blocks</em>' containment reference list.
	 * @see iTrace.ITracePackage#getM2TLink_TargetBlocks()
	 * @see iTrace.Block#getTraceLink
	 * @model opposite="traceLink" containment="true"
	 * @generated
	 */
	EList<Block> getTargetBlocks();

} // M2TLink
