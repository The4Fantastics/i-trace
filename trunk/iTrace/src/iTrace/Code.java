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
 * A representation of the model object '<em><b>Code</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link iTrace.Code#getBlocks <em>Blocks</em>}</li>
 * </ul>
 * </p>
 *
 * @see iTrace.ITracePackage#getCode()
 * @model
 * @generated
 */
public interface Code extends Artefact {
	/**
	 * Returns the value of the '<em><b>Blocks</b></em>' reference list.
	 * The list contents are of type {@link iTrace.Block}.
	 * It is bidirectional and its opposite is '{@link iTrace.Block#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Blocks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blocks</em>' reference list.
	 * @see iTrace.ITracePackage#getCode_Blocks()
	 * @see iTrace.Block#getCode
	 * @model opposite="code"
	 * @generated
	 */
	EList<Block> getBlocks();

} // Code
