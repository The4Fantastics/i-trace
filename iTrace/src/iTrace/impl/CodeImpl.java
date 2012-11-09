/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package iTrace.impl;

import iTrace.Block;
import iTrace.Code;
import iTrace.File;
import iTrace.ITracePackage;
import iTrace.M2TLink;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Code</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link iTrace.impl.CodeImpl#getBlocks <em>Blocks</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CodeImpl extends ArtefactImpl implements Code {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ITracePackage.Literals.CODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Block> getBlocks() {
		return (EList<Block>)eGet(ITracePackage.Literals.CODE__BLOCKS, true);
	}

} //CodeImpl
