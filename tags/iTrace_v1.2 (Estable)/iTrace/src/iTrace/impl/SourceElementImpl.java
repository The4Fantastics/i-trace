/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package iTrace.impl;

import iTrace.ITracePackage;
import iTrace.SourceElement;
import iTrace.TraceLink;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Source Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link iTrace.impl.SourceElementImpl#getTraceLink <em>Trace Link</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SourceElementImpl extends TraceLinkElementImpl implements SourceElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SourceElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ITracePackage.Literals.SOURCE_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraceLink getTraceLink() {
		return (TraceLink)eGet(ITracePackage.Literals.SOURCE_ELEMENT__TRACE_LINK, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTraceLink(TraceLink newTraceLink) {
		eSet(ITracePackage.Literals.SOURCE_ELEMENT__TRACE_LINK, newTraceLink);
	}

} //SourceElementImpl
