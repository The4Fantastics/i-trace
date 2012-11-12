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
import iTrace.Block;
import iTrace.Code;
import iTrace.Feature;
import iTrace.ITraceFactory;
import iTrace.ITracePackage;
import iTrace.M2MLink;
import iTrace.M2TLink;
import iTrace.Mode;
import iTrace.Model;
import iTrace.ModelType;
import iTrace.SourceElement;
import iTrace.SpecificFeature;
import iTrace.TargetElement;
import iTrace.TraceLink;
import iTrace.TraceLinkElement;
import iTrace.Type;
import iTrace.iTraceModel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ITracePackageImpl extends EPackageImpl implements ITracePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iTraceModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass traceLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass traceLinkElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass m2MLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass m2TLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass artefactEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourceElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass targetElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specificFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum abstractionLevelEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum aspectEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum modeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum modelTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see iTrace.ITracePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ITracePackageImpl() {
		super(eNS_URI, ITraceFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ITracePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ITracePackage init() {
		if (isInited) return (ITracePackage)EPackage.Registry.INSTANCE.getEPackage(ITracePackage.eNS_URI);

		// Obtain or create and register package
		ITracePackageImpl theITracePackage = (ITracePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ITracePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ITracePackageImpl());

		isInited = true;

		// Create package meta-data objects
		theITracePackage.createPackageContents();

		// Initialize created meta-data
		theITracePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theITracePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ITracePackage.eNS_URI, theITracePackage);
		return theITracePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getiTraceModel() {
		return iTraceModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getiTraceModel_TraceLinks() {
		return (EReference)iTraceModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getiTraceModel_Artefacts() {
		return (EReference)iTraceModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getiTraceModel_Version() {
		return (EAttribute)iTraceModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getiTraceModel_ProjectName() {
		return (EAttribute)iTraceModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getiTraceModel_SpecificFeatures() {
		return (EReference)iTraceModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTraceLink() {
		return traceLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTraceLink_CreatedOn() {
		return (EAttribute)traceLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTraceLink_Type() {
		return (EAttribute)traceLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTraceLink_FromFileName() {
		return (EAttribute)traceLinkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTraceLink_Comment() {
		return (EAttribute)traceLinkEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTraceLink_SourceElements() {
		return (EReference)traceLinkEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTraceLink_ITraceModel() {
		return (EReference)traceLinkEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTraceLink_CreatedBy() {
		return (EAttribute)traceLinkEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTraceLink_Mode() {
		return (EAttribute)traceLinkEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTraceLink_TechnicalBinding() {
		return (EAttribute)traceLinkEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTraceLink_RuleName() {
		return (EAttribute)traceLinkEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTraceLinkElement() {
		return traceLinkElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTraceLinkElement_Ref() {
		return (EAttribute)traceLinkElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTraceLinkElement_Model() {
		return (EReference)traceLinkElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTraceLinkElement_Type() {
		return (EAttribute)traceLinkElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTraceLinkElement_Object() {
		return (EReference)traceLinkElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getM2MLink() {
		return m2MLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getM2MLink_TargetElements() {
		return (EReference)m2MLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getM2TLink() {
		return m2TLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getM2TLink_TargetBlocks() {
		return (EReference)m2TLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArtefact() {
		return artefactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArtefact_Aspect() {
		return (EAttribute)artefactEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArtefact_ITraceModel() {
		return (EReference)artefactEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArtefact_Name() {
		return (EAttribute)artefactEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArtefact_AbstractionLevel() {
		return (EAttribute)artefactEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArtefact_Path() {
		return (EAttribute)artefactEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCode() {
		return codeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCode_Blocks() {
		return (EReference)codeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBlock() {
		return blockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBlock_BlockNumber() {
		return (EAttribute)blockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBlock_StartLine() {
		return (EAttribute)blockEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBlock_EndLine() {
		return (EAttribute)blockEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBlock_StartColumn() {
		return (EAttribute)blockEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBlock_EndColumn() {
		return (EAttribute)blockEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlock_Code() {
		return (EReference)blockEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlock_TraceLink() {
		return (EReference)blockEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModel() {
		return modelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModel_Metamodel() {
		return (EAttribute)modelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_Elements() {
		return (EReference)modelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSourceElement() {
		return sourceElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSourceElement_TraceLink() {
		return (EReference)sourceElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTargetElement() {
		return targetElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTargetElement_TraceLink() {
		return (EReference)targetElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeature() {
		return featureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeature_Attribute() {
		return (EAttribute)featureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeature_Value() {
		return (EAttribute)featureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeature_SpecificFeature() {
		return (EReference)featureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecificFeature() {
		return specificFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificFeature_Features() {
		return (EReference)specificFeatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpecificFeature_GroupName() {
		return (EAttribute)specificFeatureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificFeature_ITraceModel() {
		return (EReference)specificFeatureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAbstractionLevel() {
		return abstractionLevelEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAspect() {
		return aspectEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMode() {
		return modeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getType() {
		return typeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getModelType() {
		return modelTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ITraceFactory getITraceFactory() {
		return (ITraceFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		iTraceModelEClass = createEClass(ITRACE_MODEL);
		createEReference(iTraceModelEClass, ITRACE_MODEL__TRACE_LINKS);
		createEReference(iTraceModelEClass, ITRACE_MODEL__ARTEFACTS);
		createEAttribute(iTraceModelEClass, ITRACE_MODEL__VERSION);
		createEAttribute(iTraceModelEClass, ITRACE_MODEL__PROJECT_NAME);
		createEReference(iTraceModelEClass, ITRACE_MODEL__SPECIFIC_FEATURES);

		traceLinkEClass = createEClass(TRACE_LINK);
		createEAttribute(traceLinkEClass, TRACE_LINK__CREATED_ON);
		createEAttribute(traceLinkEClass, TRACE_LINK__TYPE);
		createEAttribute(traceLinkEClass, TRACE_LINK__FROM_FILE_NAME);
		createEAttribute(traceLinkEClass, TRACE_LINK__COMMENT);
		createEReference(traceLinkEClass, TRACE_LINK__SOURCE_ELEMENTS);
		createEReference(traceLinkEClass, TRACE_LINK__ITRACE_MODEL);
		createEAttribute(traceLinkEClass, TRACE_LINK__CREATED_BY);
		createEAttribute(traceLinkEClass, TRACE_LINK__MODE);
		createEAttribute(traceLinkEClass, TRACE_LINK__TECHNICAL_BINDING);
		createEAttribute(traceLinkEClass, TRACE_LINK__RULE_NAME);

		traceLinkElementEClass = createEClass(TRACE_LINK_ELEMENT);
		createEAttribute(traceLinkElementEClass, TRACE_LINK_ELEMENT__REF);
		createEReference(traceLinkElementEClass, TRACE_LINK_ELEMENT__MODEL);
		createEAttribute(traceLinkElementEClass, TRACE_LINK_ELEMENT__TYPE);
		createEReference(traceLinkElementEClass, TRACE_LINK_ELEMENT__OBJECT);

		m2MLinkEClass = createEClass(M2M_LINK);
		createEReference(m2MLinkEClass, M2M_LINK__TARGET_ELEMENTS);

		m2TLinkEClass = createEClass(M2T_LINK);
		createEReference(m2TLinkEClass, M2T_LINK__TARGET_BLOCKS);

		artefactEClass = createEClass(ARTEFACT);
		createEAttribute(artefactEClass, ARTEFACT__ASPECT);
		createEReference(artefactEClass, ARTEFACT__ITRACE_MODEL);
		createEAttribute(artefactEClass, ARTEFACT__NAME);
		createEAttribute(artefactEClass, ARTEFACT__ABSTRACTION_LEVEL);
		createEAttribute(artefactEClass, ARTEFACT__PATH);

		codeEClass = createEClass(CODE);
		createEReference(codeEClass, CODE__BLOCKS);

		blockEClass = createEClass(BLOCK);
		createEAttribute(blockEClass, BLOCK__BLOCK_NUMBER);
		createEAttribute(blockEClass, BLOCK__START_LINE);
		createEAttribute(blockEClass, BLOCK__END_LINE);
		createEAttribute(blockEClass, BLOCK__START_COLUMN);
		createEAttribute(blockEClass, BLOCK__END_COLUMN);
		createEReference(blockEClass, BLOCK__CODE);
		createEReference(blockEClass, BLOCK__TRACE_LINK);

		modelEClass = createEClass(MODEL);
		createEReference(modelEClass, MODEL__ELEMENTS);
		createEAttribute(modelEClass, MODEL__METAMODEL);

		sourceElementEClass = createEClass(SOURCE_ELEMENT);
		createEReference(sourceElementEClass, SOURCE_ELEMENT__TRACE_LINK);

		targetElementEClass = createEClass(TARGET_ELEMENT);
		createEReference(targetElementEClass, TARGET_ELEMENT__TRACE_LINK);

		featureEClass = createEClass(FEATURE);
		createEAttribute(featureEClass, FEATURE__ATTRIBUTE);
		createEAttribute(featureEClass, FEATURE__VALUE);
		createEReference(featureEClass, FEATURE__SPECIFIC_FEATURE);

		specificFeatureEClass = createEClass(SPECIFIC_FEATURE);
		createEReference(specificFeatureEClass, SPECIFIC_FEATURE__FEATURES);
		createEAttribute(specificFeatureEClass, SPECIFIC_FEATURE__GROUP_NAME);
		createEReference(specificFeatureEClass, SPECIFIC_FEATURE__ITRACE_MODEL);

		// Create enums
		abstractionLevelEEnum = createEEnum(ABSTRACTION_LEVEL);
		aspectEEnum = createEEnum(ASPECT);
		modeEEnum = createEEnum(MODE);
		typeEEnum = createEEnum(TYPE);
		modelTypeEEnum = createEEnum(MODEL_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		m2MLinkEClass.getESuperTypes().add(this.getTraceLink());
		m2TLinkEClass.getESuperTypes().add(this.getTraceLink());
		codeEClass.getESuperTypes().add(this.getArtefact());
		modelEClass.getESuperTypes().add(this.getArtefact());
		sourceElementEClass.getESuperTypes().add(this.getTraceLinkElement());
		targetElementEClass.getESuperTypes().add(this.getTraceLinkElement());

		// Initialize classes and features; add operations and parameters
		initEClass(iTraceModelEClass, iTraceModel.class, "iTraceModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getiTraceModel_TraceLinks(), this.getTraceLink(), this.getTraceLink_ITraceModel(), "traceLinks", null, 1, -1, iTraceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getiTraceModel_Artefacts(), this.getArtefact(), this.getArtefact_ITraceModel(), "artefacts", null, 1, -1, iTraceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getiTraceModel_Version(), ecorePackage.getEString(), "version", null, 1, 1, iTraceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getiTraceModel_ProjectName(), ecorePackage.getEString(), "projectName", null, 1, 1, iTraceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getiTraceModel_SpecificFeatures(), this.getSpecificFeature(), this.getSpecificFeature_ITraceModel(), "specificFeatures", null, 0, 1, iTraceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(traceLinkEClass, TraceLink.class, "TraceLink", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTraceLink_CreatedOn(), ecorePackage.getEString(), "createdOn", "2011-09-01", 1, 1, TraceLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTraceLink_Type(), this.getType(), "type", null, 1, 1, TraceLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTraceLink_FromFileName(), ecorePackage.getEString(), "fromFileName", null, 0, 1, TraceLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTraceLink_Comment(), ecorePackage.getEString(), "comment", null, 0, 1, TraceLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTraceLink_SourceElements(), this.getSourceElement(), this.getSourceElement_TraceLink(), "sourceElements", null, 0, -1, TraceLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTraceLink_ITraceModel(), this.getiTraceModel(), this.getiTraceModel_TraceLinks(), "iTraceModel", null, 1, 1, TraceLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTraceLink_CreatedBy(), ecorePackage.getEString(), "createdBy", null, 0, 1, TraceLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTraceLink_Mode(), this.getMode(), "mode", null, 1, 1, TraceLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTraceLink_TechnicalBinding(), ecorePackage.getEString(), "technicalBinding", null, 0, 1, TraceLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTraceLink_RuleName(), ecorePackage.getEString(), "ruleName", null, 0, 1, TraceLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(traceLinkElementEClass, TraceLinkElement.class, "TraceLinkElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTraceLinkElement_Ref(), ecorePackage.getEString(), "ref", null, 1, 1, TraceLinkElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTraceLinkElement_Model(), this.getModel(), this.getModel_Elements(), "model", null, 1, 1, TraceLinkElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTraceLinkElement_Type(), ecorePackage.getEString(), "type", null, 0, 1, TraceLinkElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTraceLinkElement_Object(), ecorePackage.getEObject(), null, "object", null, 0, 1, TraceLinkElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(m2MLinkEClass, M2MLink.class, "M2MLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getM2MLink_TargetElements(), this.getTargetElement(), this.getTargetElement_TraceLink(), "targetElements", null, 0, -1, M2MLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(m2TLinkEClass, M2TLink.class, "M2TLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getM2TLink_TargetBlocks(), this.getBlock(), this.getBlock_TraceLink(), "targetBlocks", null, 0, -1, M2TLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(artefactEClass, Artefact.class, "Artefact", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArtefact_Aspect(), this.getAspect(), "aspect", null, 1, 1, Artefact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArtefact_ITraceModel(), this.getiTraceModel(), this.getiTraceModel_Artefacts(), "iTraceModel", null, 1, 1, Artefact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArtefact_Name(), ecorePackage.getEString(), "name", null, 1, 1, Artefact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArtefact_AbstractionLevel(), this.getAbstractionLevel(), "abstractionLevel", null, 1, 1, Artefact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArtefact_Path(), ecorePackage.getEString(), "path", null, 1, 1, Artefact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(codeEClass, Code.class, "Code", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCode_Blocks(), this.getBlock(), this.getBlock_Code(), "blocks", null, 0, -1, Code.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(blockEClass, Block.class, "Block", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBlock_BlockNumber(), ecorePackage.getEInt(), "blockNumber", null, 1, 1, Block.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBlock_StartLine(), ecorePackage.getEInt(), "startLine", null, 1, 1, Block.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBlock_EndLine(), ecorePackage.getEInt(), "endLine", null, 1, 1, Block.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBlock_StartColumn(), ecorePackage.getEInt(), "startColumn", null, 1, 1, Block.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBlock_EndColumn(), ecorePackage.getEInt(), "endColumn", null, 1, 1, Block.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBlock_Code(), this.getCode(), this.getCode_Blocks(), "code", null, 1, 1, Block.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBlock_TraceLink(), this.getM2TLink(), this.getM2TLink_TargetBlocks(), "traceLink", null, 1, 1, Block.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModel_Elements(), this.getTraceLinkElement(), this.getTraceLinkElement_Model(), "elements", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModel_Metamodel(), ecorePackage.getEString(), "metamodel", null, 1, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(modelEClass, this.getModelType(), "getModelType", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(sourceElementEClass, SourceElement.class, "SourceElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSourceElement_TraceLink(), this.getTraceLink(), this.getTraceLink_SourceElements(), "traceLink", null, 1, 1, SourceElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(targetElementEClass, TargetElement.class, "TargetElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTargetElement_TraceLink(), this.getM2MLink(), this.getM2MLink_TargetElements(), "traceLink", null, 1, 1, TargetElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featureEClass, Feature.class, "Feature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFeature_Attribute(), ecorePackage.getEString(), "attribute", null, 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeature_Value(), ecorePackage.getEString(), "value", null, 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeature_SpecificFeature(), this.getSpecificFeature(), this.getSpecificFeature_Features(), "specificFeature", null, 1, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(specificFeatureEClass, SpecificFeature.class, "SpecificFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSpecificFeature_Features(), this.getFeature(), this.getFeature_SpecificFeature(), "features", null, 1, -1, SpecificFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpecificFeature_GroupName(), ecorePackage.getEString(), "groupName", null, 0, 1, SpecificFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecificFeature_ITraceModel(), this.getiTraceModel(), this.getiTraceModel_SpecificFeatures(), "iTraceModel", null, 1, 1, SpecificFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(abstractionLevelEEnum, AbstractionLevel.class, "AbstractionLevel");
		addEEnumLiteral(abstractionLevelEEnum, AbstractionLevel.UNSPECIFIED);
		addEEnumLiteral(abstractionLevelEEnum, AbstractionLevel.CIM);
		addEEnumLiteral(abstractionLevelEEnum, AbstractionLevel.PIM);
		addEEnumLiteral(abstractionLevelEEnum, AbstractionLevel.PSM);
		addEEnumLiteral(abstractionLevelEEnum, AbstractionLevel.PDM);
		addEEnumLiteral(abstractionLevelEEnum, AbstractionLevel.CODE);
		addEEnumLiteral(abstractionLevelEEnum, AbstractionLevel.ANNOTATION);

		initEEnum(aspectEEnum, Aspect.class, "Aspect");
		addEEnumLiteral(aspectEEnum, Aspect.UNSPECIFIED);
		addEEnumLiteral(aspectEEnum, Aspect.ARCHITECTURE);
		addEEnumLiteral(aspectEEnum, Aspect.BEHAVIOUR);
		addEEnumLiteral(aspectEEnum, Aspect.CONTENT);
		addEEnumLiteral(aspectEEnum, Aspect.INTERFACE);
		addEEnumLiteral(aspectEEnum, Aspect.QUALITY);
		addEEnumLiteral(aspectEEnum, Aspect.SEMANTICS);

		initEEnum(modeEEnum, Mode.class, "Mode");
		addEEnumLiteral(modeEEnum, Mode.MANUAL);
		addEEnumLiteral(modeEEnum, Mode.AUTOMATIC);

		initEEnum(typeEEnum, Type.class, "Type");
		addEEnumLiteral(typeEEnum, Type.TRANSFORMATION);
		addEEnumLiteral(typeEEnum, Type.ANNOTATION);

		initEEnum(modelTypeEEnum, ModelType.class, "ModelType");
		addEEnumLiteral(modelTypeEEnum, ModelType.SOURCE);
		addEEnumLiteral(modelTypeEEnum, ModelType.TARGET);
		addEEnumLiteral(modelTypeEEnum, ModelType.BOTH);
		addEEnumLiteral(modelTypeEEnum, ModelType.NONE);

		// Create resource
		createResource(eNS_URI);
	}

} //ITracePackageImpl
