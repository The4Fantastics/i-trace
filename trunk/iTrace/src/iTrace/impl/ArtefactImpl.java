/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package iTrace.impl;

import iTrace.AbstractionLevel;
import iTrace.Artefact;
import iTrace.Aspect;
import iTrace.ITracePackage;
import iTrace.iTraceModel;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Artefact</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link iTrace.impl.ArtefactImpl#getAspect <em>Aspect</em>}</li>
 *   <li>{@link iTrace.impl.ArtefactImpl#getITraceModel <em>ITrace Model</em>}</li>
 *   <li>{@link iTrace.impl.ArtefactImpl#getName <em>Name</em>}</li>
 *   <li>{@link iTrace.impl.ArtefactImpl#getAbstractionLevel <em>Abstraction Level</em>}</li>
 *   <li>{@link iTrace.impl.ArtefactImpl#getPath <em>Path</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ArtefactImpl extends CDOObjectImpl implements Artefact {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArtefactImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ITracePackage.Literals.ARTEFACT;
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
	public Aspect getAspect() {
		return (Aspect)eGet(ITracePackage.Literals.ARTEFACT__ASPECT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAspect(Aspect newAspect) {
		eSet(ITracePackage.Literals.ARTEFACT__ASPECT, newAspect);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public iTraceModel getITraceModel() {
		return (iTraceModel)eGet(ITracePackage.Literals.ARTEFACT__ITRACE_MODEL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setITraceModel(iTraceModel newITraceModel) {
		eSet(ITracePackage.Literals.ARTEFACT__ITRACE_MODEL, newITraceModel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eGet(ITracePackage.Literals.ARTEFACT__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(ITracePackage.Literals.ARTEFACT__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractionLevel getAbstractionLevel() {
		return (AbstractionLevel)eGet(ITracePackage.Literals.ARTEFACT__ABSTRACTION_LEVEL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbstractionLevel(AbstractionLevel newAbstractionLevel) {
		eSet(ITracePackage.Literals.ARTEFACT__ABSTRACTION_LEVEL, newAbstractionLevel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPath() {
		return (String)eGet(ITracePackage.Literals.ARTEFACT__PATH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPath(String newPath) {
		eSet(ITracePackage.Literals.ARTEFACT__PATH, newPath);
	}

} //ArtefactImpl
