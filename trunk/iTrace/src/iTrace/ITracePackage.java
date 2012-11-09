/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package iTrace;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see iTrace.ITraceFactory
 * @model kind="package"
 * @generated
 */
public interface ITracePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "iTrace";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "org.eclipse.kybele.iTrace";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "iTrace";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ITracePackage eINSTANCE = iTrace.impl.ITracePackageImpl.init();

	/**
	 * The meta object id for the '{@link iTrace.impl.iTraceModelImpl <em>iTrace Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iTrace.impl.iTraceModelImpl
	 * @see iTrace.impl.ITracePackageImpl#getiTraceModel()
	 * @generated
	 */
	int ITRACE_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Trace Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITRACE_MODEL__TRACE_LINKS = 0;

	/**
	 * The feature id for the '<em><b>Artefacts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITRACE_MODEL__ARTEFACTS = 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITRACE_MODEL__VERSION = 2;

	/**
	 * The feature id for the '<em><b>Project Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITRACE_MODEL__PROJECT_NAME = 3;

	/**
	 * The feature id for the '<em><b>Specific Features</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITRACE_MODEL__SPECIFIC_FEATURES = 4;

	/**
	 * The number of structural features of the '<em>iTrace Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITRACE_MODEL_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link iTrace.impl.TraceLinkImpl <em>Trace Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iTrace.impl.TraceLinkImpl
	 * @see iTrace.impl.ITracePackageImpl#getTraceLink()
	 * @generated
	 */
	int TRACE_LINK = 1;

	/**
	 * The feature id for the '<em><b>Created On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_LINK__CREATED_ON = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_LINK__TYPE = 1;

	/**
	 * The feature id for the '<em><b>From File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_LINK__FROM_FILE_NAME = 2;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_LINK__COMMENT = 3;

	/**
	 * The feature id for the '<em><b>Source Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_LINK__SOURCE_ELEMENTS = 4;

	/**
	 * The feature id for the '<em><b>ITrace Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_LINK__ITRACE_MODEL = 5;

	/**
	 * The feature id for the '<em><b>Created By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_LINK__CREATED_BY = 6;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_LINK__MODE = 7;

	/**
	 * The feature id for the '<em><b>Technical Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_LINK__TECHNICAL_BINDING = 8;

	/**
	 * The feature id for the '<em><b>Rule Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_LINK__RULE_NAME = 9;

	/**
	 * The number of structural features of the '<em>Trace Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_LINK_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link iTrace.impl.TraceLinkElementImpl <em>Trace Link Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iTrace.impl.TraceLinkElementImpl
	 * @see iTrace.impl.ITracePackageImpl#getTraceLinkElement()
	 * @generated
	 */
	int TRACE_LINK_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_LINK_ELEMENT__REF = 0;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_LINK_ELEMENT__MODEL = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_LINK_ELEMENT__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_LINK_ELEMENT__OBJECT = 3;

	/**
	 * The number of structural features of the '<em>Trace Link Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_LINK_ELEMENT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link iTrace.impl.M2MLinkImpl <em>M2M Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iTrace.impl.M2MLinkImpl
	 * @see iTrace.impl.ITracePackageImpl#getM2MLink()
	 * @generated
	 */
	int M2M_LINK = 3;

	/**
	 * The feature id for the '<em><b>Created On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M2M_LINK__CREATED_ON = TRACE_LINK__CREATED_ON;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M2M_LINK__TYPE = TRACE_LINK__TYPE;

	/**
	 * The feature id for the '<em><b>From File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M2M_LINK__FROM_FILE_NAME = TRACE_LINK__FROM_FILE_NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M2M_LINK__COMMENT = TRACE_LINK__COMMENT;

	/**
	 * The feature id for the '<em><b>Source Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M2M_LINK__SOURCE_ELEMENTS = TRACE_LINK__SOURCE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>ITrace Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M2M_LINK__ITRACE_MODEL = TRACE_LINK__ITRACE_MODEL;

	/**
	 * The feature id for the '<em><b>Created By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M2M_LINK__CREATED_BY = TRACE_LINK__CREATED_BY;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M2M_LINK__MODE = TRACE_LINK__MODE;

	/**
	 * The feature id for the '<em><b>Technical Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M2M_LINK__TECHNICAL_BINDING = TRACE_LINK__TECHNICAL_BINDING;

	/**
	 * The feature id for the '<em><b>Rule Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M2M_LINK__RULE_NAME = TRACE_LINK__RULE_NAME;

	/**
	 * The feature id for the '<em><b>Target Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M2M_LINK__TARGET_ELEMENTS = TRACE_LINK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>M2M Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M2M_LINK_FEATURE_COUNT = TRACE_LINK_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link iTrace.impl.M2TLinkImpl <em>M2T Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iTrace.impl.M2TLinkImpl
	 * @see iTrace.impl.ITracePackageImpl#getM2TLink()
	 * @generated
	 */
	int M2T_LINK = 4;

	/**
	 * The feature id for the '<em><b>Created On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M2T_LINK__CREATED_ON = TRACE_LINK__CREATED_ON;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M2T_LINK__TYPE = TRACE_LINK__TYPE;

	/**
	 * The feature id for the '<em><b>From File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M2T_LINK__FROM_FILE_NAME = TRACE_LINK__FROM_FILE_NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M2T_LINK__COMMENT = TRACE_LINK__COMMENT;

	/**
	 * The feature id for the '<em><b>Source Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M2T_LINK__SOURCE_ELEMENTS = TRACE_LINK__SOURCE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>ITrace Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M2T_LINK__ITRACE_MODEL = TRACE_LINK__ITRACE_MODEL;

	/**
	 * The feature id for the '<em><b>Created By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M2T_LINK__CREATED_BY = TRACE_LINK__CREATED_BY;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M2T_LINK__MODE = TRACE_LINK__MODE;

	/**
	 * The feature id for the '<em><b>Technical Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M2T_LINK__TECHNICAL_BINDING = TRACE_LINK__TECHNICAL_BINDING;

	/**
	 * The feature id for the '<em><b>Rule Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M2T_LINK__RULE_NAME = TRACE_LINK__RULE_NAME;

	/**
	 * The feature id for the '<em><b>Target Blocks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M2T_LINK__TARGET_BLOCKS = TRACE_LINK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>M2T Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M2T_LINK_FEATURE_COUNT = TRACE_LINK_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link iTrace.impl.ArtefactImpl <em>Artefact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iTrace.impl.ArtefactImpl
	 * @see iTrace.impl.ITracePackageImpl#getArtefact()
	 * @generated
	 */
	int ARTEFACT = 5;

	/**
	 * The feature id for the '<em><b>Aspect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTEFACT__ASPECT = 0;

	/**
	 * The feature id for the '<em><b>ITrace Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTEFACT__ITRACE_MODEL = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTEFACT__NAME = 2;

	/**
	 * The feature id for the '<em><b>Abstraction Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTEFACT__ABSTRACTION_LEVEL = 3;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTEFACT__PATH = 4;

	/**
	 * The number of structural features of the '<em>Artefact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTEFACT_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link iTrace.impl.CodeImpl <em>Code</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iTrace.impl.CodeImpl
	 * @see iTrace.impl.ITracePackageImpl#getCode()
	 * @generated
	 */
	int CODE = 6;

	/**
	 * The feature id for the '<em><b>Aspect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__ASPECT = ARTEFACT__ASPECT;

	/**
	 * The feature id for the '<em><b>ITrace Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__ITRACE_MODEL = ARTEFACT__ITRACE_MODEL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__NAME = ARTEFACT__NAME;

	/**
	 * The feature id for the '<em><b>Abstraction Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__ABSTRACTION_LEVEL = ARTEFACT__ABSTRACTION_LEVEL;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__PATH = ARTEFACT__PATH;

	/**
	 * The feature id for the '<em><b>Blocks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__BLOCKS = ARTEFACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Code</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_FEATURE_COUNT = ARTEFACT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link iTrace.impl.BlockImpl <em>Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iTrace.impl.BlockImpl
	 * @see iTrace.impl.ITracePackageImpl#getBlock()
	 * @generated
	 */
	int BLOCK = 7;

	/**
	 * The feature id for the '<em><b>Block Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__BLOCK_NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Start Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__START_LINE = 1;

	/**
	 * The feature id for the '<em><b>End Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__END_LINE = 2;

	/**
	 * The feature id for the '<em><b>Start Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__START_COLUMN = 3;

	/**
	 * The feature id for the '<em><b>End Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__END_COLUMN = 4;

	/**
	 * The feature id for the '<em><b>Code</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__CODE = 5;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__TRACE_LINK = 6;

	/**
	 * The number of structural features of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link iTrace.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iTrace.impl.ModelImpl
	 * @see iTrace.impl.ITracePackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 8;

	/**
	 * The feature id for the '<em><b>Aspect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__ASPECT = ARTEFACT__ASPECT;

	/**
	 * The feature id for the '<em><b>ITrace Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__ITRACE_MODEL = ARTEFACT__ITRACE_MODEL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__NAME = ARTEFACT__NAME;

	/**
	 * The feature id for the '<em><b>Abstraction Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__ABSTRACTION_LEVEL = ARTEFACT__ABSTRACTION_LEVEL;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__PATH = ARTEFACT__PATH;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__ELEMENTS = ARTEFACT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Metamodel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__METAMODEL = ARTEFACT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = ARTEFACT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link iTrace.impl.SourceElementImpl <em>Source Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iTrace.impl.SourceElementImpl
	 * @see iTrace.impl.ITracePackageImpl#getSourceElement()
	 * @generated
	 */
	int SOURCE_ELEMENT = 9;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_ELEMENT__REF = TRACE_LINK_ELEMENT__REF;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_ELEMENT__MODEL = TRACE_LINK_ELEMENT__MODEL;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_ELEMENT__TYPE = TRACE_LINK_ELEMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_ELEMENT__OBJECT = TRACE_LINK_ELEMENT__OBJECT;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_ELEMENT__TRACE_LINK = TRACE_LINK_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Source Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_ELEMENT_FEATURE_COUNT = TRACE_LINK_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link iTrace.impl.TargetElementImpl <em>Target Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iTrace.impl.TargetElementImpl
	 * @see iTrace.impl.ITracePackageImpl#getTargetElement()
	 * @generated
	 */
	int TARGET_ELEMENT = 10;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_ELEMENT__REF = TRACE_LINK_ELEMENT__REF;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_ELEMENT__MODEL = TRACE_LINK_ELEMENT__MODEL;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_ELEMENT__TYPE = TRACE_LINK_ELEMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_ELEMENT__OBJECT = TRACE_LINK_ELEMENT__OBJECT;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_ELEMENT__TRACE_LINK = TRACE_LINK_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Target Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_ELEMENT_FEATURE_COUNT = TRACE_LINK_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link iTrace.impl.FeatureImpl <em>Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iTrace.impl.FeatureImpl
	 * @see iTrace.impl.ITracePackageImpl#getFeature()
	 * @generated
	 */
	int FEATURE = 11;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__ATTRIBUTE = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Specific Feature</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__SPECIFIC_FEATURE = 2;

	/**
	 * The number of structural features of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link iTrace.impl.SpecificFeatureImpl <em>Specific Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iTrace.impl.SpecificFeatureImpl
	 * @see iTrace.impl.ITracePackageImpl#getSpecificFeature()
	 * @generated
	 */
	int SPECIFIC_FEATURE = 12;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_FEATURE__FEATURES = 0;

	/**
	 * The feature id for the '<em><b>Group Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_FEATURE__GROUP_NAME = 1;

	/**
	 * The feature id for the '<em><b>ITrace Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_FEATURE__ITRACE_MODEL = 2;

	/**
	 * The number of structural features of the '<em>Specific Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_FEATURE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link iTrace.AbstractionLevel <em>Abstraction Level</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iTrace.AbstractionLevel
	 * @see iTrace.impl.ITracePackageImpl#getAbstractionLevel()
	 * @generated
	 */
	int ABSTRACTION_LEVEL = 13;

	/**
	 * The meta object id for the '{@link iTrace.Aspect <em>Aspect</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iTrace.Aspect
	 * @see iTrace.impl.ITracePackageImpl#getAspect()
	 * @generated
	 */
	int ASPECT = 14;

	/**
	 * The meta object id for the '{@link iTrace.Mode <em>Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iTrace.Mode
	 * @see iTrace.impl.ITracePackageImpl#getMode()
	 * @generated
	 */
	int MODE = 15;

	/**
	 * The meta object id for the '{@link iTrace.Type <em>Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iTrace.Type
	 * @see iTrace.impl.ITracePackageImpl#getType()
	 * @generated
	 */
	int TYPE = 16;


	/**
	 * The meta object id for the '{@link iTrace.ModelType <em>Model Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iTrace.ModelType
	 * @see iTrace.impl.ITracePackageImpl#getModelType()
	 * @generated
	 */
	int MODEL_TYPE = 17;


	/**
	 * Returns the meta object for class '{@link iTrace.iTraceModel <em>iTrace Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>iTrace Model</em>'.
	 * @see iTrace.iTraceModel
	 * @generated
	 */
	EClass getiTraceModel();

	/**
	 * Returns the meta object for the containment reference list '{@link iTrace.iTraceModel#getTraceLinks <em>Trace Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Trace Links</em>'.
	 * @see iTrace.iTraceModel#getTraceLinks()
	 * @see #getiTraceModel()
	 * @generated
	 */
	EReference getiTraceModel_TraceLinks();

	/**
	 * Returns the meta object for the containment reference list '{@link iTrace.iTraceModel#getArtefacts <em>Artefacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Artefacts</em>'.
	 * @see iTrace.iTraceModel#getArtefacts()
	 * @see #getiTraceModel()
	 * @generated
	 */
	EReference getiTraceModel_Artefacts();

	/**
	 * Returns the meta object for the attribute '{@link iTrace.iTraceModel#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see iTrace.iTraceModel#getVersion()
	 * @see #getiTraceModel()
	 * @generated
	 */
	EAttribute getiTraceModel_Version();

	/**
	 * Returns the meta object for the attribute '{@link iTrace.iTraceModel#getProjectName <em>Project Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Project Name</em>'.
	 * @see iTrace.iTraceModel#getProjectName()
	 * @see #getiTraceModel()
	 * @generated
	 */
	EAttribute getiTraceModel_ProjectName();

	/**
	 * Returns the meta object for the containment reference '{@link iTrace.iTraceModel#getSpecificFeatures <em>Specific Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Specific Features</em>'.
	 * @see iTrace.iTraceModel#getSpecificFeatures()
	 * @see #getiTraceModel()
	 * @generated
	 */
	EReference getiTraceModel_SpecificFeatures();

	/**
	 * Returns the meta object for class '{@link iTrace.TraceLink <em>Trace Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trace Link</em>'.
	 * @see iTrace.TraceLink
	 * @generated
	 */
	EClass getTraceLink();

	/**
	 * Returns the meta object for the attribute '{@link iTrace.TraceLink#getCreatedOn <em>Created On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created On</em>'.
	 * @see iTrace.TraceLink#getCreatedOn()
	 * @see #getTraceLink()
	 * @generated
	 */
	EAttribute getTraceLink_CreatedOn();

	/**
	 * Returns the meta object for the attribute '{@link iTrace.TraceLink#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see iTrace.TraceLink#getType()
	 * @see #getTraceLink()
	 * @generated
	 */
	EAttribute getTraceLink_Type();

	/**
	 * Returns the meta object for the attribute '{@link iTrace.TraceLink#getFromFileName <em>From File Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From File Name</em>'.
	 * @see iTrace.TraceLink#getFromFileName()
	 * @see #getTraceLink()
	 * @generated
	 */
	EAttribute getTraceLink_FromFileName();

	/**
	 * Returns the meta object for the attribute '{@link iTrace.TraceLink#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see iTrace.TraceLink#getComment()
	 * @see #getTraceLink()
	 * @generated
	 */
	EAttribute getTraceLink_Comment();

	/**
	 * Returns the meta object for the containment reference list '{@link iTrace.TraceLink#getSourceElements <em>Source Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Source Elements</em>'.
	 * @see iTrace.TraceLink#getSourceElements()
	 * @see #getTraceLink()
	 * @generated
	 */
	EReference getTraceLink_SourceElements();

	/**
	 * Returns the meta object for the container reference '{@link iTrace.TraceLink#getITraceModel <em>ITrace Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>ITrace Model</em>'.
	 * @see iTrace.TraceLink#getITraceModel()
	 * @see #getTraceLink()
	 * @generated
	 */
	EReference getTraceLink_ITraceModel();

	/**
	 * Returns the meta object for the attribute '{@link iTrace.TraceLink#getCreatedBy <em>Created By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created By</em>'.
	 * @see iTrace.TraceLink#getCreatedBy()
	 * @see #getTraceLink()
	 * @generated
	 */
	EAttribute getTraceLink_CreatedBy();

	/**
	 * Returns the meta object for the attribute '{@link iTrace.TraceLink#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see iTrace.TraceLink#getMode()
	 * @see #getTraceLink()
	 * @generated
	 */
	EAttribute getTraceLink_Mode();

	/**
	 * Returns the meta object for the attribute '{@link iTrace.TraceLink#getTechnicalBinding <em>Technical Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Technical Binding</em>'.
	 * @see iTrace.TraceLink#getTechnicalBinding()
	 * @see #getTraceLink()
	 * @generated
	 */
	EAttribute getTraceLink_TechnicalBinding();

	/**
	 * Returns the meta object for the attribute '{@link iTrace.TraceLink#getRuleName <em>Rule Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rule Name</em>'.
	 * @see iTrace.TraceLink#getRuleName()
	 * @see #getTraceLink()
	 * @generated
	 */
	EAttribute getTraceLink_RuleName();

	/**
	 * Returns the meta object for class '{@link iTrace.TraceLinkElement <em>Trace Link Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trace Link Element</em>'.
	 * @see iTrace.TraceLinkElement
	 * @generated
	 */
	EClass getTraceLinkElement();

	/**
	 * Returns the meta object for the attribute '{@link iTrace.TraceLinkElement#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref</em>'.
	 * @see iTrace.TraceLinkElement#getRef()
	 * @see #getTraceLinkElement()
	 * @generated
	 */
	EAttribute getTraceLinkElement_Ref();

	/**
	 * Returns the meta object for the reference '{@link iTrace.TraceLinkElement#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Model</em>'.
	 * @see iTrace.TraceLinkElement#getModel()
	 * @see #getTraceLinkElement()
	 * @generated
	 */
	EReference getTraceLinkElement_Model();

	/**
	 * Returns the meta object for the attribute '{@link iTrace.TraceLinkElement#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see iTrace.TraceLinkElement#getType()
	 * @see #getTraceLinkElement()
	 * @generated
	 */
	EAttribute getTraceLinkElement_Type();

	/**
	 * Returns the meta object for the reference '{@link iTrace.TraceLinkElement#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Object</em>'.
	 * @see iTrace.TraceLinkElement#getObject()
	 * @see #getTraceLinkElement()
	 * @generated
	 */
	EReference getTraceLinkElement_Object();

	/**
	 * Returns the meta object for class '{@link iTrace.M2MLink <em>M2M Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>M2M Link</em>'.
	 * @see iTrace.M2MLink
	 * @generated
	 */
	EClass getM2MLink();

	/**
	 * Returns the meta object for the containment reference list '{@link iTrace.M2MLink#getTargetElements <em>Target Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Target Elements</em>'.
	 * @see iTrace.M2MLink#getTargetElements()
	 * @see #getM2MLink()
	 * @generated
	 */
	EReference getM2MLink_TargetElements();

	/**
	 * Returns the meta object for class '{@link iTrace.M2TLink <em>M2T Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>M2T Link</em>'.
	 * @see iTrace.M2TLink
	 * @generated
	 */
	EClass getM2TLink();

	/**
	 * Returns the meta object for the containment reference list '{@link iTrace.M2TLink#getTargetBlocks <em>Target Blocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Target Blocks</em>'.
	 * @see iTrace.M2TLink#getTargetBlocks()
	 * @see #getM2TLink()
	 * @generated
	 */
	EReference getM2TLink_TargetBlocks();

	/**
	 * Returns the meta object for class '{@link iTrace.Artefact <em>Artefact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Artefact</em>'.
	 * @see iTrace.Artefact
	 * @generated
	 */
	EClass getArtefact();

	/**
	 * Returns the meta object for the attribute '{@link iTrace.Artefact#getAspect <em>Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aspect</em>'.
	 * @see iTrace.Artefact#getAspect()
	 * @see #getArtefact()
	 * @generated
	 */
	EAttribute getArtefact_Aspect();

	/**
	 * Returns the meta object for the container reference '{@link iTrace.Artefact#getITraceModel <em>ITrace Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>ITrace Model</em>'.
	 * @see iTrace.Artefact#getITraceModel()
	 * @see #getArtefact()
	 * @generated
	 */
	EReference getArtefact_ITraceModel();

	/**
	 * Returns the meta object for the attribute '{@link iTrace.Artefact#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see iTrace.Artefact#getName()
	 * @see #getArtefact()
	 * @generated
	 */
	EAttribute getArtefact_Name();

	/**
	 * Returns the meta object for the attribute '{@link iTrace.Artefact#getAbstractionLevel <em>Abstraction Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstraction Level</em>'.
	 * @see iTrace.Artefact#getAbstractionLevel()
	 * @see #getArtefact()
	 * @generated
	 */
	EAttribute getArtefact_AbstractionLevel();

	/**
	 * Returns the meta object for the attribute '{@link iTrace.Artefact#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see iTrace.Artefact#getPath()
	 * @see #getArtefact()
	 * @generated
	 */
	EAttribute getArtefact_Path();

	/**
	 * Returns the meta object for class '{@link iTrace.Code <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code</em>'.
	 * @see iTrace.Code
	 * @generated
	 */
	EClass getCode();

	/**
	 * Returns the meta object for the reference list '{@link iTrace.Code#getBlocks <em>Blocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Blocks</em>'.
	 * @see iTrace.Code#getBlocks()
	 * @see #getCode()
	 * @generated
	 */
	EReference getCode_Blocks();

	/**
	 * Returns the meta object for class '{@link iTrace.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block</em>'.
	 * @see iTrace.Block
	 * @generated
	 */
	EClass getBlock();

	/**
	 * Returns the meta object for the attribute '{@link iTrace.Block#getBlockNumber <em>Block Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Block Number</em>'.
	 * @see iTrace.Block#getBlockNumber()
	 * @see #getBlock()
	 * @generated
	 */
	EAttribute getBlock_BlockNumber();

	/**
	 * Returns the meta object for the attribute '{@link iTrace.Block#getStartLine <em>Start Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Line</em>'.
	 * @see iTrace.Block#getStartLine()
	 * @see #getBlock()
	 * @generated
	 */
	EAttribute getBlock_StartLine();

	/**
	 * Returns the meta object for the attribute '{@link iTrace.Block#getEndLine <em>End Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Line</em>'.
	 * @see iTrace.Block#getEndLine()
	 * @see #getBlock()
	 * @generated
	 */
	EAttribute getBlock_EndLine();

	/**
	 * Returns the meta object for the attribute '{@link iTrace.Block#getStartColumn <em>Start Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Column</em>'.
	 * @see iTrace.Block#getStartColumn()
	 * @see #getBlock()
	 * @generated
	 */
	EAttribute getBlock_StartColumn();

	/**
	 * Returns the meta object for the attribute '{@link iTrace.Block#getEndColumn <em>End Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Column</em>'.
	 * @see iTrace.Block#getEndColumn()
	 * @see #getBlock()
	 * @generated
	 */
	EAttribute getBlock_EndColumn();

	/**
	 * Returns the meta object for the reference '{@link iTrace.Block#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Code</em>'.
	 * @see iTrace.Block#getCode()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_Code();

	/**
	 * Returns the meta object for the container reference '{@link iTrace.Block#getTraceLink <em>Trace Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Trace Link</em>'.
	 * @see iTrace.Block#getTraceLink()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_TraceLink();

	/**
	 * Returns the meta object for class '{@link iTrace.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see iTrace.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the attribute '{@link iTrace.Model#getMetamodel <em>Metamodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metamodel</em>'.
	 * @see iTrace.Model#getMetamodel()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_Metamodel();

	/**
	 * Returns the meta object for the reference list '{@link iTrace.Model#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Elements</em>'.
	 * @see iTrace.Model#getElements()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Elements();

	/**
	 * Returns the meta object for class '{@link iTrace.SourceElement <em>Source Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source Element</em>'.
	 * @see iTrace.SourceElement
	 * @generated
	 */
	EClass getSourceElement();

	/**
	 * Returns the meta object for the container reference '{@link iTrace.SourceElement#getTraceLink <em>Trace Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Trace Link</em>'.
	 * @see iTrace.SourceElement#getTraceLink()
	 * @see #getSourceElement()
	 * @generated
	 */
	EReference getSourceElement_TraceLink();

	/**
	 * Returns the meta object for class '{@link iTrace.TargetElement <em>Target Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Target Element</em>'.
	 * @see iTrace.TargetElement
	 * @generated
	 */
	EClass getTargetElement();

	/**
	 * Returns the meta object for the container reference '{@link iTrace.TargetElement#getTraceLink <em>Trace Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Trace Link</em>'.
	 * @see iTrace.TargetElement#getTraceLink()
	 * @see #getTargetElement()
	 * @generated
	 */
	EReference getTargetElement_TraceLink();

	/**
	 * Returns the meta object for class '{@link iTrace.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature</em>'.
	 * @see iTrace.Feature
	 * @generated
	 */
	EClass getFeature();

	/**
	 * Returns the meta object for the attribute '{@link iTrace.Feature#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attribute</em>'.
	 * @see iTrace.Feature#getAttribute()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Attribute();

	/**
	 * Returns the meta object for the attribute '{@link iTrace.Feature#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see iTrace.Feature#getValue()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Value();

	/**
	 * Returns the meta object for the container reference '{@link iTrace.Feature#getSpecificFeature <em>Specific Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Specific Feature</em>'.
	 * @see iTrace.Feature#getSpecificFeature()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_SpecificFeature();

	/**
	 * Returns the meta object for class '{@link iTrace.SpecificFeature <em>Specific Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specific Feature</em>'.
	 * @see iTrace.SpecificFeature
	 * @generated
	 */
	EClass getSpecificFeature();

	/**
	 * Returns the meta object for the containment reference list '{@link iTrace.SpecificFeature#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Features</em>'.
	 * @see iTrace.SpecificFeature#getFeatures()
	 * @see #getSpecificFeature()
	 * @generated
	 */
	EReference getSpecificFeature_Features();

	/**
	 * Returns the meta object for the attribute '{@link iTrace.SpecificFeature#getGroupName <em>Group Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group Name</em>'.
	 * @see iTrace.SpecificFeature#getGroupName()
	 * @see #getSpecificFeature()
	 * @generated
	 */
	EAttribute getSpecificFeature_GroupName();

	/**
	 * Returns the meta object for the container reference '{@link iTrace.SpecificFeature#getITraceModel <em>ITrace Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>ITrace Model</em>'.
	 * @see iTrace.SpecificFeature#getITraceModel()
	 * @see #getSpecificFeature()
	 * @generated
	 */
	EReference getSpecificFeature_ITraceModel();

	/**
	 * Returns the meta object for enum '{@link iTrace.AbstractionLevel <em>Abstraction Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Abstraction Level</em>'.
	 * @see iTrace.AbstractionLevel
	 * @generated
	 */
	EEnum getAbstractionLevel();

	/**
	 * Returns the meta object for enum '{@link iTrace.Aspect <em>Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Aspect</em>'.
	 * @see iTrace.Aspect
	 * @generated
	 */
	EEnum getAspect();

	/**
	 * Returns the meta object for enum '{@link iTrace.Mode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Mode</em>'.
	 * @see iTrace.Mode
	 * @generated
	 */
	EEnum getMode();

	/**
	 * Returns the meta object for enum '{@link iTrace.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type</em>'.
	 * @see iTrace.Type
	 * @generated
	 */
	EEnum getType();

	/**
	 * Returns the meta object for enum '{@link iTrace.ModelType <em>Model Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Model Type</em>'.
	 * @see iTrace.ModelType
	 * @generated
	 */
	EEnum getModelType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ITraceFactory getITraceFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link iTrace.impl.iTraceModelImpl <em>iTrace Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iTrace.impl.iTraceModelImpl
		 * @see iTrace.impl.ITracePackageImpl#getiTraceModel()
		 * @generated
		 */
		EClass ITRACE_MODEL = eINSTANCE.getiTraceModel();

		/**
		 * The meta object literal for the '<em><b>Trace Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITRACE_MODEL__TRACE_LINKS = eINSTANCE.getiTraceModel_TraceLinks();

		/**
		 * The meta object literal for the '<em><b>Artefacts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITRACE_MODEL__ARTEFACTS = eINSTANCE.getiTraceModel_Artefacts();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITRACE_MODEL__VERSION = eINSTANCE.getiTraceModel_Version();

		/**
		 * The meta object literal for the '<em><b>Project Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITRACE_MODEL__PROJECT_NAME = eINSTANCE.getiTraceModel_ProjectName();

		/**
		 * The meta object literal for the '<em><b>Specific Features</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITRACE_MODEL__SPECIFIC_FEATURES = eINSTANCE.getiTraceModel_SpecificFeatures();

		/**
		 * The meta object literal for the '{@link iTrace.impl.TraceLinkImpl <em>Trace Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iTrace.impl.TraceLinkImpl
		 * @see iTrace.impl.ITracePackageImpl#getTraceLink()
		 * @generated
		 */
		EClass TRACE_LINK = eINSTANCE.getTraceLink();

		/**
		 * The meta object literal for the '<em><b>Created On</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACE_LINK__CREATED_ON = eINSTANCE.getTraceLink_CreatedOn();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACE_LINK__TYPE = eINSTANCE.getTraceLink_Type();

		/**
		 * The meta object literal for the '<em><b>From File Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACE_LINK__FROM_FILE_NAME = eINSTANCE.getTraceLink_FromFileName();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACE_LINK__COMMENT = eINSTANCE.getTraceLink_Comment();

		/**
		 * The meta object literal for the '<em><b>Source Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE_LINK__SOURCE_ELEMENTS = eINSTANCE.getTraceLink_SourceElements();

		/**
		 * The meta object literal for the '<em><b>ITrace Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE_LINK__ITRACE_MODEL = eINSTANCE.getTraceLink_ITraceModel();

		/**
		 * The meta object literal for the '<em><b>Created By</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACE_LINK__CREATED_BY = eINSTANCE.getTraceLink_CreatedBy();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACE_LINK__MODE = eINSTANCE.getTraceLink_Mode();

		/**
		 * The meta object literal for the '<em><b>Technical Binding</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACE_LINK__TECHNICAL_BINDING = eINSTANCE.getTraceLink_TechnicalBinding();

		/**
		 * The meta object literal for the '<em><b>Rule Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACE_LINK__RULE_NAME = eINSTANCE.getTraceLink_RuleName();

		/**
		 * The meta object literal for the '{@link iTrace.impl.TraceLinkElementImpl <em>Trace Link Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iTrace.impl.TraceLinkElementImpl
		 * @see iTrace.impl.ITracePackageImpl#getTraceLinkElement()
		 * @generated
		 */
		EClass TRACE_LINK_ELEMENT = eINSTANCE.getTraceLinkElement();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACE_LINK_ELEMENT__REF = eINSTANCE.getTraceLinkElement_Ref();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE_LINK_ELEMENT__MODEL = eINSTANCE.getTraceLinkElement_Model();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACE_LINK_ELEMENT__TYPE = eINSTANCE.getTraceLinkElement_Type();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE_LINK_ELEMENT__OBJECT = eINSTANCE.getTraceLinkElement_Object();

		/**
		 * The meta object literal for the '{@link iTrace.impl.M2MLinkImpl <em>M2M Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iTrace.impl.M2MLinkImpl
		 * @see iTrace.impl.ITracePackageImpl#getM2MLink()
		 * @generated
		 */
		EClass M2M_LINK = eINSTANCE.getM2MLink();

		/**
		 * The meta object literal for the '<em><b>Target Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference M2M_LINK__TARGET_ELEMENTS = eINSTANCE.getM2MLink_TargetElements();

		/**
		 * The meta object literal for the '{@link iTrace.impl.M2TLinkImpl <em>M2T Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iTrace.impl.M2TLinkImpl
		 * @see iTrace.impl.ITracePackageImpl#getM2TLink()
		 * @generated
		 */
		EClass M2T_LINK = eINSTANCE.getM2TLink();

		/**
		 * The meta object literal for the '<em><b>Target Blocks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference M2T_LINK__TARGET_BLOCKS = eINSTANCE.getM2TLink_TargetBlocks();

		/**
		 * The meta object literal for the '{@link iTrace.impl.ArtefactImpl <em>Artefact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iTrace.impl.ArtefactImpl
		 * @see iTrace.impl.ITracePackageImpl#getArtefact()
		 * @generated
		 */
		EClass ARTEFACT = eINSTANCE.getArtefact();

		/**
		 * The meta object literal for the '<em><b>Aspect</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTEFACT__ASPECT = eINSTANCE.getArtefact_Aspect();

		/**
		 * The meta object literal for the '<em><b>ITrace Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARTEFACT__ITRACE_MODEL = eINSTANCE.getArtefact_ITraceModel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTEFACT__NAME = eINSTANCE.getArtefact_Name();

		/**
		 * The meta object literal for the '<em><b>Abstraction Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTEFACT__ABSTRACTION_LEVEL = eINSTANCE.getArtefact_AbstractionLevel();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTEFACT__PATH = eINSTANCE.getArtefact_Path();

		/**
		 * The meta object literal for the '{@link iTrace.impl.CodeImpl <em>Code</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iTrace.impl.CodeImpl
		 * @see iTrace.impl.ITracePackageImpl#getCode()
		 * @generated
		 */
		EClass CODE = eINSTANCE.getCode();

		/**
		 * The meta object literal for the '<em><b>Blocks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODE__BLOCKS = eINSTANCE.getCode_Blocks();

		/**
		 * The meta object literal for the '{@link iTrace.impl.BlockImpl <em>Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iTrace.impl.BlockImpl
		 * @see iTrace.impl.ITracePackageImpl#getBlock()
		 * @generated
		 */
		EClass BLOCK = eINSTANCE.getBlock();

		/**
		 * The meta object literal for the '<em><b>Block Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCK__BLOCK_NUMBER = eINSTANCE.getBlock_BlockNumber();

		/**
		 * The meta object literal for the '<em><b>Start Line</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCK__START_LINE = eINSTANCE.getBlock_StartLine();

		/**
		 * The meta object literal for the '<em><b>End Line</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCK__END_LINE = eINSTANCE.getBlock_EndLine();

		/**
		 * The meta object literal for the '<em><b>Start Column</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCK__START_COLUMN = eINSTANCE.getBlock_StartColumn();

		/**
		 * The meta object literal for the '<em><b>End Column</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCK__END_COLUMN = eINSTANCE.getBlock_EndColumn();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__CODE = eINSTANCE.getBlock_Code();

		/**
		 * The meta object literal for the '<em><b>Trace Link</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__TRACE_LINK = eINSTANCE.getBlock_TraceLink();

		/**
		 * The meta object literal for the '{@link iTrace.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iTrace.impl.ModelImpl
		 * @see iTrace.impl.ITracePackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Metamodel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__METAMODEL = eINSTANCE.getModel_Metamodel();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__ELEMENTS = eINSTANCE.getModel_Elements();

		/**
		 * The meta object literal for the '{@link iTrace.impl.SourceElementImpl <em>Source Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iTrace.impl.SourceElementImpl
		 * @see iTrace.impl.ITracePackageImpl#getSourceElement()
		 * @generated
		 */
		EClass SOURCE_ELEMENT = eINSTANCE.getSourceElement();

		/**
		 * The meta object literal for the '<em><b>Trace Link</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE_ELEMENT__TRACE_LINK = eINSTANCE.getSourceElement_TraceLink();

		/**
		 * The meta object literal for the '{@link iTrace.impl.TargetElementImpl <em>Target Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iTrace.impl.TargetElementImpl
		 * @see iTrace.impl.ITracePackageImpl#getTargetElement()
		 * @generated
		 */
		EClass TARGET_ELEMENT = eINSTANCE.getTargetElement();

		/**
		 * The meta object literal for the '<em><b>Trace Link</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGET_ELEMENT__TRACE_LINK = eINSTANCE.getTargetElement_TraceLink();

		/**
		 * The meta object literal for the '{@link iTrace.impl.FeatureImpl <em>Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iTrace.impl.FeatureImpl
		 * @see iTrace.impl.ITracePackageImpl#getFeature()
		 * @generated
		 */
		EClass FEATURE = eINSTANCE.getFeature();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__ATTRIBUTE = eINSTANCE.getFeature_Attribute();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__VALUE = eINSTANCE.getFeature_Value();

		/**
		 * The meta object literal for the '<em><b>Specific Feature</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__SPECIFIC_FEATURE = eINSTANCE.getFeature_SpecificFeature();

		/**
		 * The meta object literal for the '{@link iTrace.impl.SpecificFeatureImpl <em>Specific Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iTrace.impl.SpecificFeatureImpl
		 * @see iTrace.impl.ITracePackageImpl#getSpecificFeature()
		 * @generated
		 */
		EClass SPECIFIC_FEATURE = eINSTANCE.getSpecificFeature();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_FEATURE__FEATURES = eINSTANCE.getSpecificFeature_Features();

		/**
		 * The meta object literal for the '<em><b>Group Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIFIC_FEATURE__GROUP_NAME = eINSTANCE.getSpecificFeature_GroupName();

		/**
		 * The meta object literal for the '<em><b>ITrace Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_FEATURE__ITRACE_MODEL = eINSTANCE.getSpecificFeature_ITraceModel();

		/**
		 * The meta object literal for the '{@link iTrace.AbstractionLevel <em>Abstraction Level</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iTrace.AbstractionLevel
		 * @see iTrace.impl.ITracePackageImpl#getAbstractionLevel()
		 * @generated
		 */
		EEnum ABSTRACTION_LEVEL = eINSTANCE.getAbstractionLevel();

		/**
		 * The meta object literal for the '{@link iTrace.Aspect <em>Aspect</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iTrace.Aspect
		 * @see iTrace.impl.ITracePackageImpl#getAspect()
		 * @generated
		 */
		EEnum ASPECT = eINSTANCE.getAspect();

		/**
		 * The meta object literal for the '{@link iTrace.Mode <em>Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iTrace.Mode
		 * @see iTrace.impl.ITracePackageImpl#getMode()
		 * @generated
		 */
		EEnum MODE = eINSTANCE.getMode();

		/**
		 * The meta object literal for the '{@link iTrace.Type <em>Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iTrace.Type
		 * @see iTrace.impl.ITracePackageImpl#getType()
		 * @generated
		 */
		EEnum TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '{@link iTrace.ModelType <em>Model Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iTrace.ModelType
		 * @see iTrace.impl.ITracePackageImpl#getModelType()
		 * @generated
		 */
		EEnum MODEL_TYPE = eINSTANCE.getModelType();

	}

} //ITracePackage
