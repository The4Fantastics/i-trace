/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package iTrace.impl;

import iTrace.ITracePackage;
import iTrace.Mode;
import iTrace.SourceElement;
import iTrace.TraceLink;
import iTrace.Type;
import iTrace.iTraceModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trace Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link iTrace.impl.TraceLinkImpl#getCreatedOn <em>Created On</em>}</li>
 *   <li>{@link iTrace.impl.TraceLinkImpl#getType <em>Type</em>}</li>
 *   <li>{@link iTrace.impl.TraceLinkImpl#getFromFileName <em>From File Name</em>}</li>
 *   <li>{@link iTrace.impl.TraceLinkImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link iTrace.impl.TraceLinkImpl#getSourceElements <em>Source Elements</em>}</li>
 *   <li>{@link iTrace.impl.TraceLinkImpl#getITraceModel <em>ITrace Model</em>}</li>
 *   <li>{@link iTrace.impl.TraceLinkImpl#getCreatedBy <em>Created By</em>}</li>
 *   <li>{@link iTrace.impl.TraceLinkImpl#getMode <em>Mode</em>}</li>
 *   <li>{@link iTrace.impl.TraceLinkImpl#getTechnicalBinding <em>Technical Binding</em>}</li>
 *   <li>{@link iTrace.impl.TraceLinkImpl#getRuleName <em>Rule Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class TraceLinkImpl extends CDOObjectImpl implements TraceLink {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TraceLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ITracePackage.Literals.TRACE_LINK;
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
	public String getCreatedOn() {
		return (String)eGet(ITracePackage.Literals.TRACE_LINK__CREATED_ON, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreatedOn(String newCreatedOn) {
		eSet(ITracePackage.Literals.TRACE_LINK__CREATED_ON, newCreatedOn);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getType() {
		return (Type)eGet(ITracePackage.Literals.TRACE_LINK__TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Type newType) {
		eSet(ITracePackage.Literals.TRACE_LINK__TYPE, newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFromFileName() {
		return (String)eGet(ITracePackage.Literals.TRACE_LINK__FROM_FILE_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromFileName(String newFromFileName) {
		eSet(ITracePackage.Literals.TRACE_LINK__FROM_FILE_NAME, newFromFileName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComment() {
		return (String)eGet(ITracePackage.Literals.TRACE_LINK__COMMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComment(String newComment) {
		eSet(ITracePackage.Literals.TRACE_LINK__COMMENT, newComment);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<SourceElement> getSourceElements() {
		return (EList<SourceElement>)eGet(ITracePackage.Literals.TRACE_LINK__SOURCE_ELEMENTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public iTraceModel getITraceModel() {
		return (iTraceModel)eGet(ITracePackage.Literals.TRACE_LINK__ITRACE_MODEL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setITraceModel(iTraceModel newITraceModel) {
		eSet(ITracePackage.Literals.TRACE_LINK__ITRACE_MODEL, newITraceModel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCreatedBy() {
		return (String)eGet(ITracePackage.Literals.TRACE_LINK__CREATED_BY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreatedBy(String newCreatedBy) {
		eSet(ITracePackage.Literals.TRACE_LINK__CREATED_BY, newCreatedBy);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mode getMode() {
		return (Mode)eGet(ITracePackage.Literals.TRACE_LINK__MODE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMode(Mode newMode) {
		eSet(ITracePackage.Literals.TRACE_LINK__MODE, newMode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTechnicalBinding() {
		return (String)eGet(ITracePackage.Literals.TRACE_LINK__TECHNICAL_BINDING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTechnicalBinding(String newTechnicalBinding) {
		eSet(ITracePackage.Literals.TRACE_LINK__TECHNICAL_BINDING, newTechnicalBinding);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRuleName() {
		return (String)eGet(ITracePackage.Literals.TRACE_LINK__RULE_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRuleName(String newRuleName) {
		eSet(ITracePackage.Literals.TRACE_LINK__RULE_NAME, newRuleName);
	}

} //TraceLinkImpl
