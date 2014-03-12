/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package iTrace.impl;

import java.util.Iterator;

import iTrace.ITracePackage;
import iTrace.Model;
import iTrace.ModelType;
import iTrace.SourceElement;
import iTrace.TraceLinkElement;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link iTrace.impl.ModelImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link iTrace.impl.ModelImpl#getMetamodel <em>Metamodel</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelImpl extends ArtefactImpl implements Model {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ITracePackage.Literals.MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMetamodel() {
		return (String)eGet(ITracePackage.Literals.MODEL__METAMODEL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetamodel(String newMetamodel) {
		eSet(ITracePackage.Literals.MODEL__METAMODEL, newMetamodel);
	}

	/**
	 * <!-- begin-user-doc -->
	 *  -> Devuelve Source si todos los elementos del modelo son SourceElement
		-> Devuelve Target si todos los elementos del modelo son TargetElement
		-> Devuelve BOTH si el modelo tiene elementos tanto Source como Target
		-> En caso contrario devuelve NONE.
	 * <!-- end-user-doc -->
	 * @NOT generated
	 */
	public ModelType getModelType() {
		
		ModelType type = null;
		Boolean typeSource = false;
		Boolean typeTarget = false;
		
		for (Iterator <TraceLinkElement> iter_tle = this.getElements().iterator(); iter_tle.hasNext();) {
	 		TraceLinkElement tle = iter_tle.next();
	 		
	 		if (tle instanceof SourceElement) {
	 			typeSource=true;
	 		}else{
	 			typeTarget=true;
	 		}
	 		
		}	
		
		if (typeSource && typeTarget){
 			type = ModelType.BOTH;
 		}else if(typeSource && !typeTarget){
 			type = ModelType.SOURCE;
 		}else if(!typeSource && typeTarget) {
 			type = ModelType.TARGET;
 		}else{
 			type = ModelType.NONE;
 		}
					
 		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<TraceLinkElement> getElements() {
		return (EList<TraceLinkElement>)eGet(ITracePackage.Literals.MODEL__ELEMENTS, true);
	}

} //ModelImpl
