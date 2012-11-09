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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>M2T Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link iTrace.impl.M2TLinkImpl#getTargetBlocks <em>Target Blocks</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class M2TLinkImpl extends TraceLinkImpl implements M2TLink {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected M2TLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ITracePackage.Literals.M2T_LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Block> getTargetBlocks() {
		return (EList<Block>)eGet(ITracePackage.Literals.M2T_LINK__TARGET_BLOCKS, true);
	}

} //M2TLinkImpl
