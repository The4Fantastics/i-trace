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
 * A representation of the model object '<em><b>iTrace Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link iTrace.iTraceModel#getTraceLinks <em>Trace Links</em>}</li>
 *   <li>{@link iTrace.iTraceModel#getArtefacts <em>Artefacts</em>}</li>
 *   <li>{@link iTrace.iTraceModel#getVersion <em>Version</em>}</li>
 *   <li>{@link iTrace.iTraceModel#getProjectName <em>Project Name</em>}</li>
 *   <li>{@link iTrace.iTraceModel#getSpecificFeatures <em>Specific Features</em>}</li>
 * </ul>
 * </p>
 *
 * @see iTrace.ITracePackage#getiTraceModel()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface iTraceModel extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Trace Links</b></em>' containment reference list.
	 * The list contents are of type {@link iTrace.TraceLink}.
	 * It is bidirectional and its opposite is '{@link iTrace.TraceLink#getITraceModel <em>ITrace Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trace Links</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trace Links</em>' containment reference list.
	 * @see iTrace.ITracePackage#getiTraceModel_TraceLinks()
	 * @see iTrace.TraceLink#getITraceModel
	 * @model opposite="iTraceModel" containment="true" required="true"
	 * @generated
	 */
	EList<TraceLink> getTraceLinks();

	/**
	 * Returns the value of the '<em><b>Artefacts</b></em>' containment reference list.
	 * The list contents are of type {@link iTrace.Artefact}.
	 * It is bidirectional and its opposite is '{@link iTrace.Artefact#getITraceModel <em>ITrace Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Artefacts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artefacts</em>' containment reference list.
	 * @see iTrace.ITracePackage#getiTraceModel_Artefacts()
	 * @see iTrace.Artefact#getITraceModel
	 * @model opposite="iTraceModel" containment="true" required="true"
	 * @generated
	 */
	EList<Artefact> getArtefacts();

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see iTrace.ITracePackage#getiTraceModel_Version()
	 * @model required="true"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link iTrace.iTraceModel#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Project Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Project Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project Name</em>' attribute.
	 * @see #setProjectName(String)
	 * @see iTrace.ITracePackage#getiTraceModel_ProjectName()
	 * @model required="true"
	 * @generated
	 */
	String getProjectName();

	/**
	 * Sets the value of the '{@link iTrace.iTraceModel#getProjectName <em>Project Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project Name</em>' attribute.
	 * @see #getProjectName()
	 * @generated
	 */
	void setProjectName(String value);

	/**
	 * Returns the value of the '<em><b>Specific Features</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link iTrace.SpecificFeature#getITraceModel <em>ITrace Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specific Features</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specific Features</em>' containment reference.
	 * @see #setSpecificFeatures(SpecificFeature)
	 * @see iTrace.ITracePackage#getiTraceModel_SpecificFeatures()
	 * @see iTrace.SpecificFeature#getITraceModel
	 * @model opposite="iTraceModel" containment="true"
	 * @generated
	 */
	SpecificFeature getSpecificFeatures();

	/**
	 * Sets the value of the '{@link iTrace.iTraceModel#getSpecificFeatures <em>Specific Features</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specific Features</em>' containment reference.
	 * @see #getSpecificFeatures()
	 * @generated
	 */
	void setSpecificFeatures(SpecificFeature value);

} // iTraceModel
