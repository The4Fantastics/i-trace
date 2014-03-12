/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package iTrace.impl;

import iTrace.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ITraceFactoryImpl extends EFactoryImpl implements ITraceFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ITraceFactory init() {
		try {
			ITraceFactory theITraceFactory = (ITraceFactory)EPackage.Registry.INSTANCE.getEFactory("org.eclipse.kybele.iTrace"); 
			if (theITraceFactory != null) {
				return theITraceFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ITraceFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ITraceFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ITracePackage.ITRACE_MODEL: return (EObject)createiTraceModel();
			case ITracePackage.M2M_LINK: return (EObject)createM2MLink();
			case ITracePackage.M2T_LINK: return (EObject)createM2TLink();
			case ITracePackage.CODE: return (EObject)createCode();
			case ITracePackage.BLOCK: return (EObject)createBlock();
			case ITracePackage.MODEL: return (EObject)createModel();
			case ITracePackage.SOURCE_ELEMENT: return (EObject)createSourceElement();
			case ITracePackage.TARGET_ELEMENT: return (EObject)createTargetElement();
			case ITracePackage.FEATURE: return (EObject)createFeature();
			case ITracePackage.SPECIFIC_FEATURE: return (EObject)createSpecificFeature();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ITracePackage.ABSTRACTION_LEVEL:
				return createAbstractionLevelFromString(eDataType, initialValue);
			case ITracePackage.ASPECT:
				return createAspectFromString(eDataType, initialValue);
			case ITracePackage.MODE:
				return createModeFromString(eDataType, initialValue);
			case ITracePackage.TYPE:
				return createTypeFromString(eDataType, initialValue);
			case ITracePackage.MODEL_TYPE:
				return createModelTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ITracePackage.ABSTRACTION_LEVEL:
				return convertAbstractionLevelToString(eDataType, instanceValue);
			case ITracePackage.ASPECT:
				return convertAspectToString(eDataType, instanceValue);
			case ITracePackage.MODE:
				return convertModeToString(eDataType, instanceValue);
			case ITracePackage.TYPE:
				return convertTypeToString(eDataType, instanceValue);
			case ITracePackage.MODEL_TYPE:
				return convertModelTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public iTraceModel createiTraceModel() {
		iTraceModelImpl iTraceModel = new iTraceModelImpl();
		return iTraceModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public M2MLink createM2MLink() {
		M2MLinkImpl m2MLink = new M2MLinkImpl();
		return m2MLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public M2TLink createM2TLink() {
		M2TLinkImpl m2TLink = new M2TLinkImpl();
		return m2TLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code createCode() {
		CodeImpl code = new CodeImpl();
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block createBlock() {
		BlockImpl block = new BlockImpl();
		return block;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model createModel() {
		ModelImpl model = new ModelImpl();
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceElement createSourceElement() {
		SourceElementImpl sourceElement = new SourceElementImpl();
		return sourceElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetElement createTargetElement() {
		TargetElementImpl targetElement = new TargetElementImpl();
		return targetElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature createFeature() {
		FeatureImpl feature = new FeatureImpl();
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecificFeature createSpecificFeature() {
		SpecificFeatureImpl specificFeature = new SpecificFeatureImpl();
		return specificFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractionLevel createAbstractionLevelFromString(EDataType eDataType, String initialValue) {
		AbstractionLevel result = AbstractionLevel.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAbstractionLevelToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Aspect createAspectFromString(EDataType eDataType, String initialValue) {
		Aspect result = Aspect.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAspectToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mode createModeFromString(EDataType eDataType, String initialValue) {
		Mode result = Mode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type createTypeFromString(EDataType eDataType, String initialValue) {
		Type result = Type.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelType createModelTypeFromString(EDataType eDataType, String initialValue) {
		ModelType result = ModelType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertModelTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ITracePackage getITracePackage() {
		return (ITracePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ITracePackage getPackage() {
		return ITracePackage.eINSTANCE;
	}

} //ITraceFactoryImpl
