/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package iTrace.impl;

import iTrace.Block;
import iTrace.Code;
import iTrace.ITracePackage;

import iTrace.M2TLink;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link iTrace.impl.BlockImpl#getBlockNumber <em>Block Number</em>}</li>
 *   <li>{@link iTrace.impl.BlockImpl#getStartLine <em>Start Line</em>}</li>
 *   <li>{@link iTrace.impl.BlockImpl#getEndLine <em>End Line</em>}</li>
 *   <li>{@link iTrace.impl.BlockImpl#getStartColumn <em>Start Column</em>}</li>
 *   <li>{@link iTrace.impl.BlockImpl#getEndColumn <em>End Column</em>}</li>
 *   <li>{@link iTrace.impl.BlockImpl#getCode <em>Code</em>}</li>
 *   <li>{@link iTrace.impl.BlockImpl#getTraceLink <em>Trace Link</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BlockImpl extends CDOObjectImpl implements Block {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BlockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ITracePackage.Literals.BLOCK;
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
	public int getBlockNumber() {
		return (Integer)eGet(ITracePackage.Literals.BLOCK__BLOCK_NUMBER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlockNumber(int newBlockNumber) {
		eSet(ITracePackage.Literals.BLOCK__BLOCK_NUMBER, newBlockNumber);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getStartLine() {
		return (Integer)eGet(ITracePackage.Literals.BLOCK__START_LINE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartLine(int newStartLine) {
		eSet(ITracePackage.Literals.BLOCK__START_LINE, newStartLine);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getEndLine() {
		return (Integer)eGet(ITracePackage.Literals.BLOCK__END_LINE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndLine(int newEndLine) {
		eSet(ITracePackage.Literals.BLOCK__END_LINE, newEndLine);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getStartColumn() {
		return (Integer)eGet(ITracePackage.Literals.BLOCK__START_COLUMN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartColumn(int newStartColumn) {
		eSet(ITracePackage.Literals.BLOCK__START_COLUMN, newStartColumn);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getEndColumn() {
		return (Integer)eGet(ITracePackage.Literals.BLOCK__END_COLUMN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndColumn(int newEndColumn) {
		eSet(ITracePackage.Literals.BLOCK__END_COLUMN, newEndColumn);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getCode() {
		return (Code)eGet(ITracePackage.Literals.BLOCK__CODE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(Code newCode) {
		eSet(ITracePackage.Literals.BLOCK__CODE, newCode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public M2TLink getTraceLink() {
		return (M2TLink)eGet(ITracePackage.Literals.BLOCK__TRACE_LINK, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTraceLink(M2TLink newTraceLink) {
		eSet(ITracePackage.Literals.BLOCK__TRACE_LINK, newTraceLink);
	}

} //BlockImpl
