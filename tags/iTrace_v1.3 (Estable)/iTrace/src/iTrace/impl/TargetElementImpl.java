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


import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Target Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link iTrace.impl.TargetElementImpl#getTraceLink <em>Trace Link</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TargetElementImpl extends TraceLinkElementImpl implements TargetElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TargetElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ITracePackage.Literals.TARGET_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public M2MLink getTraceLink() {
		return (M2MLink)eGet(ITracePackage.Literals.TARGET_ELEMENT__TRACE_LINK, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTraceLink(M2MLink newTraceLink) {
		eSet(ITracePackage.Literals.TARGET_ELEMENT__TRACE_LINK, newTraceLink);
	}

} //TargetElementImpl
