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
 * A representation of the model object '<em><b>Artefact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link iTrace.Artefact#getAspect <em>Aspect</em>}</li>
 *   <li>{@link iTrace.Artefact#getITraceModel <em>ITrace Model</em>}</li>
 *   <li>{@link iTrace.Artefact#getName <em>Name</em>}</li>
 *   <li>{@link iTrace.Artefact#getAbstractionLevel <em>Abstraction Level</em>}</li>
 *   <li>{@link iTrace.Artefact#getPath <em>Path</em>}</li>
 * </ul>
 * </p>
 *
 * @see iTrace.ITracePackage#getArtefact()
 * @model abstract="true"
 * @extends CDOObject
 * @generated
 */
public interface Artefact extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Aspect</b></em>' attribute.
	 * The literals are from the enumeration {@link iTrace.Aspect}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aspect</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aspect</em>' attribute.
	 * @see iTrace.Aspect
	 * @see #setAspect(Aspect)
	 * @see iTrace.ITracePackage#getArtefact_Aspect()
	 * @model required="true"
	 * @generated
	 */
	Aspect getAspect();

	/**
	 * Sets the value of the '{@link iTrace.Artefact#getAspect <em>Aspect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aspect</em>' attribute.
	 * @see iTrace.Aspect
	 * @see #getAspect()
	 * @generated
	 */
	void setAspect(Aspect value);

	/**
	 * Returns the value of the '<em><b>ITrace Model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link iTrace.iTraceModel#getArtefacts <em>Artefacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ITrace Model</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ITrace Model</em>' container reference.
	 * @see #setITraceModel(iTraceModel)
	 * @see iTrace.ITracePackage#getArtefact_ITraceModel()
	 * @see iTrace.iTraceModel#getArtefacts
	 * @model opposite="artefacts" required="true" transient="false"
	 * @generated
	 */
	iTraceModel getITraceModel();

	/**
	 * Sets the value of the '{@link iTrace.Artefact#getITraceModel <em>ITrace Model</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ITrace Model</em>' container reference.
	 * @see #getITraceModel()
	 * @generated
	 */
	void setITraceModel(iTraceModel value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see iTrace.ITracePackage#getArtefact_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link iTrace.Artefact#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Abstraction Level</b></em>' attribute.
	 * The literals are from the enumeration {@link iTrace.AbstractionLevel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstraction Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstraction Level</em>' attribute.
	 * @see iTrace.AbstractionLevel
	 * @see #setAbstractionLevel(AbstractionLevel)
	 * @see iTrace.ITracePackage#getArtefact_AbstractionLevel()
	 * @model required="true"
	 * @generated
	 */
	AbstractionLevel getAbstractionLevel();

	/**
	 * Sets the value of the '{@link iTrace.Artefact#getAbstractionLevel <em>Abstraction Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstraction Level</em>' attribute.
	 * @see iTrace.AbstractionLevel
	 * @see #getAbstractionLevel()
	 * @generated
	 */
	void setAbstractionLevel(AbstractionLevel value);

	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see iTrace.ITracePackage#getArtefact_Path()
	 * @model required="true"
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link iTrace.Artefact#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

} // Artefact
