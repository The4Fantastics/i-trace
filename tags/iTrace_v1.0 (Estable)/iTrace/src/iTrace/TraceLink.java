/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package iTrace;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trace Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link iTrace.TraceLink#getCreatedOn <em>Created On</em>}</li>
 *   <li>{@link iTrace.TraceLink#getType <em>Type</em>}</li>
 *   <li>{@link iTrace.TraceLink#getFromFileName <em>From File Name</em>}</li>
 *   <li>{@link iTrace.TraceLink#getComment <em>Comment</em>}</li>
 *   <li>{@link iTrace.TraceLink#getSourceElements <em>Source Elements</em>}</li>
 *   <li>{@link iTrace.TraceLink#getITraceModel <em>ITrace Model</em>}</li>
 *   <li>{@link iTrace.TraceLink#getCreatedBy <em>Created By</em>}</li>
 *   <li>{@link iTrace.TraceLink#getMode <em>Mode</em>}</li>
 *   <li>{@link iTrace.TraceLink#getTechnicalBinding <em>Technical Binding</em>}</li>
 *   <li>{@link iTrace.TraceLink#getRuleName <em>Rule Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see iTrace.ITracePackage#getTraceLink()
 * @model abstract="true"
 * @extends CDOObject
 * @generated
 */
public interface TraceLink extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Created On</b></em>' attribute.
	 * The default value is <code>"2011-09-01"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Created On</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created On</em>' attribute.
	 * @see #setCreatedOn(String)
	 * @see iTrace.ITracePackage#getTraceLink_CreatedOn()
	 * @model default="2011-09-01" required="true"
	 * @generated
	 */
	String getCreatedOn();

	/**
	 * Sets the value of the '{@link iTrace.TraceLink#getCreatedOn <em>Created On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created On</em>' attribute.
	 * @see #getCreatedOn()
	 * @generated
	 */
	void setCreatedOn(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link iTrace.Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see iTrace.Type
	 * @see #setType(Type)
	 * @see iTrace.ITracePackage#getTraceLink_Type()
	 * @model required="true"
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link iTrace.TraceLink#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see iTrace.Type
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);

	/**
	 * Returns the value of the '<em><b>From File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From File Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From File Name</em>' attribute.
	 * @see #setFromFileName(String)
	 * @see iTrace.ITracePackage#getTraceLink_FromFileName()
	 * @model
	 * @generated
	 */
	String getFromFileName();

	/**
	 * Sets the value of the '{@link iTrace.TraceLink#getFromFileName <em>From File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From File Name</em>' attribute.
	 * @see #getFromFileName()
	 * @generated
	 */
	void setFromFileName(String value);

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' attribute.
	 * @see #setComment(String)
	 * @see iTrace.ITracePackage#getTraceLink_Comment()
	 * @model
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link iTrace.TraceLink#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

	/**
	 * Returns the value of the '<em><b>Source Elements</b></em>' containment reference list.
	 * The list contents are of type {@link iTrace.SourceElement}.
	 * It is bidirectional and its opposite is '{@link iTrace.SourceElement#getTraceLink <em>Trace Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Elements</em>' containment reference list.
	 * @see iTrace.ITracePackage#getTraceLink_SourceElements()
	 * @see iTrace.SourceElement#getTraceLink
	 * @model opposite="traceLink" containment="true"
	 * @generated
	 */
	EList<SourceElement> getSourceElements();

	/**
	 * Returns the value of the '<em><b>ITrace Model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link iTrace.iTraceModel#getTraceLinks <em>Trace Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ITrace Model</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ITrace Model</em>' container reference.
	 * @see #setITraceModel(iTraceModel)
	 * @see iTrace.ITracePackage#getTraceLink_ITraceModel()
	 * @see iTrace.iTraceModel#getTraceLinks
	 * @model opposite="traceLinks" required="true" transient="false"
	 * @generated
	 */
	iTraceModel getITraceModel();

	/**
	 * Sets the value of the '{@link iTrace.TraceLink#getITraceModel <em>ITrace Model</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ITrace Model</em>' container reference.
	 * @see #getITraceModel()
	 * @generated
	 */
	void setITraceModel(iTraceModel value);

	/**
	 * Returns the value of the '<em><b>Created By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Created By</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created By</em>' attribute.
	 * @see #setCreatedBy(String)
	 * @see iTrace.ITracePackage#getTraceLink_CreatedBy()
	 * @model
	 * @generated
	 */
	String getCreatedBy();

	/**
	 * Sets the value of the '{@link iTrace.TraceLink#getCreatedBy <em>Created By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created By</em>' attribute.
	 * @see #getCreatedBy()
	 * @generated
	 */
	void setCreatedBy(String value);

	/**
	 * Returns the value of the '<em><b>Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link iTrace.Mode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode</em>' attribute.
	 * @see iTrace.Mode
	 * @see #setMode(Mode)
	 * @see iTrace.ITracePackage#getTraceLink_Mode()
	 * @model required="true"
	 * @generated
	 */
	Mode getMode();

	/**
	 * Sets the value of the '{@link iTrace.TraceLink#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' attribute.
	 * @see iTrace.Mode
	 * @see #getMode()
	 * @generated
	 */
	void setMode(Mode value);

	/**
	 * Returns the value of the '<em><b>Technical Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Technical Binding</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Technical Binding</em>' attribute.
	 * @see #setTechnicalBinding(String)
	 * @see iTrace.ITracePackage#getTraceLink_TechnicalBinding()
	 * @model
	 * @generated
	 */
	String getTechnicalBinding();

	/**
	 * Sets the value of the '{@link iTrace.TraceLink#getTechnicalBinding <em>Technical Binding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Technical Binding</em>' attribute.
	 * @see #getTechnicalBinding()
	 * @generated
	 */
	void setTechnicalBinding(String value);

	/**
	 * Returns the value of the '<em><b>Rule Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rule Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Name</em>' attribute.
	 * @see #setRuleName(String)
	 * @see iTrace.ITracePackage#getTraceLink_RuleName()
	 * @model
	 * @generated
	 */
	String getRuleName();

	/**
	 * Sets the value of the '{@link iTrace.TraceLink#getRuleName <em>Rule Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rule Name</em>' attribute.
	 * @see #getRuleName()
	 * @generated
	 */
	void setRuleName(String value);

} // TraceLink
