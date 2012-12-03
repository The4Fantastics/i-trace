/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package iTrace.impl;

import iTrace.ITracePackage;
import iTrace.M2MLink;
import iTrace.TargetElement;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>M2M Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link iTrace.impl.M2MLinkImpl#getTargetElements <em>Target Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class M2MLinkImpl extends TraceLinkImpl implements M2MLink {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected M2MLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ITracePackage.Literals.M2M_LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<TargetElement> getTargetElements() {
		return (EList<TargetElement>)eGet(ITracePackage.Literals.M2M_LINK__TARGET_ELEMENTS, true);
	}

} //M2MLinkImpl
