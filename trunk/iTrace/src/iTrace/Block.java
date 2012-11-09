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
 * A representation of the model object '<em><b>Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link iTrace.Block#getBlockNumber <em>Block Number</em>}</li>
 *   <li>{@link iTrace.Block#getStartLine <em>Start Line</em>}</li>
 *   <li>{@link iTrace.Block#getEndLine <em>End Line</em>}</li>
 *   <li>{@link iTrace.Block#getStartColumn <em>Start Column</em>}</li>
 *   <li>{@link iTrace.Block#getEndColumn <em>End Column</em>}</li>
 *   <li>{@link iTrace.Block#getCode <em>Code</em>}</li>
 *   <li>{@link iTrace.Block#getTraceLink <em>Trace Link</em>}</li>
 * </ul>
 * </p>
 *
 * @see iTrace.ITracePackage#getBlock()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface Block extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Block Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Block Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block Number</em>' attribute.
	 * @see #setBlockNumber(int)
	 * @see iTrace.ITracePackage#getBlock_BlockNumber()
	 * @model required="true"
	 * @generated
	 */
	int getBlockNumber();

	/**
	 * Sets the value of the '{@link iTrace.Block#getBlockNumber <em>Block Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Block Number</em>' attribute.
	 * @see #getBlockNumber()
	 * @generated
	 */
	void setBlockNumber(int value);

	/**
	 * Returns the value of the '<em><b>Start Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Line</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Line</em>' attribute.
	 * @see #setStartLine(int)
	 * @see iTrace.ITracePackage#getBlock_StartLine()
	 * @model required="true"
	 * @generated
	 */
	int getStartLine();

	/**
	 * Sets the value of the '{@link iTrace.Block#getStartLine <em>Start Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Line</em>' attribute.
	 * @see #getStartLine()
	 * @generated
	 */
	void setStartLine(int value);

	/**
	 * Returns the value of the '<em><b>End Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Line</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Line</em>' attribute.
	 * @see #setEndLine(int)
	 * @see iTrace.ITracePackage#getBlock_EndLine()
	 * @model required="true"
	 * @generated
	 */
	int getEndLine();

	/**
	 * Sets the value of the '{@link iTrace.Block#getEndLine <em>End Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Line</em>' attribute.
	 * @see #getEndLine()
	 * @generated
	 */
	void setEndLine(int value);

	/**
	 * Returns the value of the '<em><b>Start Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Column</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Column</em>' attribute.
	 * @see #setStartColumn(int)
	 * @see iTrace.ITracePackage#getBlock_StartColumn()
	 * @model required="true"
	 * @generated
	 */
	int getStartColumn();

	/**
	 * Sets the value of the '{@link iTrace.Block#getStartColumn <em>Start Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Column</em>' attribute.
	 * @see #getStartColumn()
	 * @generated
	 */
	void setStartColumn(int value);

	/**
	 * Returns the value of the '<em><b>End Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Column</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Column</em>' attribute.
	 * @see #setEndColumn(int)
	 * @see iTrace.ITracePackage#getBlock_EndColumn()
	 * @model required="true"
	 * @generated
	 */
	int getEndColumn();

	/**
	 * Sets the value of the '{@link iTrace.Block#getEndColumn <em>End Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Column</em>' attribute.
	 * @see #getEndColumn()
	 * @generated
	 */
	void setEndColumn(int value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link iTrace.Code#getBlocks <em>Blocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' reference.
	 * @see #setCode(Code)
	 * @see iTrace.ITracePackage#getBlock_Code()
	 * @see iTrace.Code#getBlocks
	 * @model opposite="blocks" required="true"
	 * @generated
	 */
	Code getCode();

	/**
	 * Sets the value of the '{@link iTrace.Block#getCode <em>Code</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(Code value);

	/**
	 * Returns the value of the '<em><b>Trace Link</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link iTrace.M2TLink#getTargetBlocks <em>Target Blocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trace Link</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trace Link</em>' container reference.
	 * @see #setTraceLink(M2TLink)
	 * @see iTrace.ITracePackage#getBlock_TraceLink()
	 * @see iTrace.M2TLink#getTargetBlocks
	 * @model opposite="targetBlocks" required="true" transient="false"
	 * @generated
	 */
	M2TLink getTraceLink();

	/**
	 * Sets the value of the '{@link iTrace.Block#getTraceLink <em>Trace Link</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trace Link</em>' container reference.
	 * @see #getTraceLink()
	 * @generated
	 */
	void setTraceLink(M2TLink value);

} // Block
