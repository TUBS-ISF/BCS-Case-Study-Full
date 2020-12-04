/**
 */
package de.tu_bs.cs.isf.familymining.models.stateoriented;

import de.tu_bs.cs.isf.familymining.models.base.BasePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.StateChartsFactory
 * @model kind="package"
 * @generated
 */
public interface StateChartsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "stateoriented";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.tu-braunschweig.de/isf/familymining/stateoriented";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "de.tu_bs.cs.isf.familymining.models";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StateChartsPackage eINSTANCE = de.tu_bs.cs.isf.familymining.models.stateoriented.impl.StateChartsPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.impl.StateChartImpl <em>State Chart</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.impl.StateChartImpl
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.impl.StateChartsPackageImpl#getStateChart()
	 * @generated
	 */
	int STATE_CHART = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_CHART__ID = BasePackage.MODEL_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Alternative Values</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_CHART__ALTERNATIVE_VALUES = BasePackage.MODEL_ENTITY__ALTERNATIVE_VALUES;

	/**
	 * The feature id for the '<em><b>Base Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_CHART__BASE_MODEL = BasePackage.MODEL_ENTITY__BASE_MODEL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_CHART__NAME = BasePackage.MODEL_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_CHART__PARAMETERS = BasePackage.MODEL_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>State Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_CHART__STATE_COUNT = BasePackage.MODEL_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Region Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_CHART__REGION_COUNT = BasePackage.MODEL_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Transition Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_CHART__TRANSITION_COUNT = BasePackage.MODEL_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Root Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_CHART__ROOT_REGION = BasePackage.MODEL_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>State Chart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_CHART_FEATURE_COUNT = BasePackage.MODEL_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Add Alternative Values Map</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_CHART___ADD_ALTERNATIVE_VALUES_MAP__STRING = BasePackage.MODEL_ENTITY___ADD_ALTERNATIVE_VALUES_MAP__STRING;

	/**
	 * The operation id for the '<em>Get Model File Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_CHART___GET_MODEL_FILE_EXTENSION = BasePackage.MODEL_ENTITY___GET_MODEL_FILE_EXTENSION;

	/**
	 * The operation id for the '<em>Set Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_CHART___SET_PARAMETER__STRING_STRING = BasePackage.MODEL_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_CHART___GET_PARAMETER__STRING = BasePackage.MODEL_ENTITY_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Remove Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_CHART___REMOVE_PARAMETER__STRING = BasePackage.MODEL_ENTITY_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Contains Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_CHART___CONTAINS_PARAMETER__STRING = BasePackage.MODEL_ENTITY_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>State Chart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_CHART_OPERATION_COUNT = BasePackage.MODEL_ENTITY_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.impl.AbstractStateImpl <em>Abstract State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.impl.AbstractStateImpl
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.impl.StateChartsPackageImpl#getAbstractState()
	 * @generated
	 */
	int ABSTRACT_STATE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STATE__ID = BasePackage.NODE_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Alternative Values</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STATE__ALTERNATIVE_VALUES = BasePackage.NODE_ENTITY__ALTERNATIVE_VALUES;

	/**
	 * The feature id for the '<em><b>Variability Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STATE__VARIABILITY_GROUP_ID = BasePackage.NODE_ENTITY__VARIABILITY_GROUP_ID;

	/**
	 * The feature id for the '<em><b>Containing Models</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STATE__CONTAINING_MODELS = BasePackage.NODE_ENTITY__CONTAINING_MODELS;

	/**
	 * The feature id for the '<em><b>Variability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STATE__VARIABILITY = BasePackage.NODE_ENTITY__VARIABILITY;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STATE__PARAMETERS = BasePackage.NODE_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STATE__PARENT = BasePackage.NODE_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Stereotypes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STATE__STEREOTYPES = BasePackage.NODE_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STATE__NAME = BasePackage.NODE_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Abstract State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STATE_FEATURE_COUNT = BasePackage.NODE_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Add Alternative Values Map</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STATE___ADD_ALTERNATIVE_VALUES_MAP__STRING = BasePackage.NODE_ENTITY___ADD_ALTERNATIVE_VALUES_MAP__STRING;

	/**
	 * The operation id for the '<em>Is Contained In Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STATE___IS_CONTAINED_IN_MODEL__STRING = BasePackage.NODE_ENTITY___IS_CONTAINED_IN_MODEL__STRING;

	/**
	 * The operation id for the '<em>Is Mandatory</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STATE___IS_MANDATORY = BasePackage.NODE_ENTITY___IS_MANDATORY;

	/**
	 * The operation id for the '<em>Is Alternative</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STATE___IS_ALTERNATIVE = BasePackage.NODE_ENTITY___IS_ALTERNATIVE;

	/**
	 * The operation id for the '<em>Is Optional</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STATE___IS_OPTIONAL = BasePackage.NODE_ENTITY___IS_OPTIONAL;

	/**
	 * The operation id for the '<em>Is Optional Alternative</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STATE___IS_OPTIONAL_ALTERNATIVE = BasePackage.NODE_ENTITY___IS_OPTIONAL_ALTERNATIVE;

	/**
	 * The operation id for the '<em>Is Variability Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STATE___IS_VARIABILITY_SET = BasePackage.NODE_ENTITY___IS_VARIABILITY_SET;

	/**
	 * The operation id for the '<em>Set Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STATE___SET_PARAMETER__STRING_STRING = BasePackage.NODE_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STATE___GET_PARAMETER__STRING = BasePackage.NODE_ENTITY_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Remove Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STATE___REMOVE_PARAMETER__STRING = BasePackage.NODE_ENTITY_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Contains Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STATE___CONTAINS_PARAMETER__STRING = BasePackage.NODE_ENTITY_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Hierarchical</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STATE___IS_HIERARCHICAL = BasePackage.NODE_ENTITY_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Is Parallel</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STATE___IS_PARALLEL = BasePackage.NODE_ENTITY_OPERATION_COUNT + 5;

	/**
	 * The number of operations of the '<em>Abstract State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STATE_OPERATION_COUNT = BasePackage.NODE_ENTITY_OPERATION_COUNT + 6;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.impl.IncomingStateImpl <em>Incoming State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.impl.IncomingStateImpl
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.impl.StateChartsPackageImpl#getIncomingState()
	 * @generated
	 */
	int INCOMING_STATE = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOMING_STATE__ID = ABSTRACT_STATE__ID;

	/**
	 * The feature id for the '<em><b>Alternative Values</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOMING_STATE__ALTERNATIVE_VALUES = ABSTRACT_STATE__ALTERNATIVE_VALUES;

	/**
	 * The feature id for the '<em><b>Variability Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOMING_STATE__VARIABILITY_GROUP_ID = ABSTRACT_STATE__VARIABILITY_GROUP_ID;

	/**
	 * The feature id for the '<em><b>Containing Models</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOMING_STATE__CONTAINING_MODELS = ABSTRACT_STATE__CONTAINING_MODELS;

	/**
	 * The feature id for the '<em><b>Variability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOMING_STATE__VARIABILITY = ABSTRACT_STATE__VARIABILITY;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOMING_STATE__PARAMETERS = ABSTRACT_STATE__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOMING_STATE__PARENT = ABSTRACT_STATE__PARENT;

	/**
	 * The feature id for the '<em><b>Stereotypes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOMING_STATE__STEREOTYPES = ABSTRACT_STATE__STEREOTYPES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOMING_STATE__NAME = ABSTRACT_STATE__NAME;

	/**
	 * The feature id for the '<em><b>Incoming Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOMING_STATE__INCOMING_TRANSITIONS = ABSTRACT_STATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Incoming State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOMING_STATE_FEATURE_COUNT = ABSTRACT_STATE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Add Alternative Values Map</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOMING_STATE___ADD_ALTERNATIVE_VALUES_MAP__STRING = ABSTRACT_STATE___ADD_ALTERNATIVE_VALUES_MAP__STRING;

	/**
	 * The operation id for the '<em>Is Contained In Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOMING_STATE___IS_CONTAINED_IN_MODEL__STRING = ABSTRACT_STATE___IS_CONTAINED_IN_MODEL__STRING;

	/**
	 * The operation id for the '<em>Is Mandatory</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOMING_STATE___IS_MANDATORY = ABSTRACT_STATE___IS_MANDATORY;

	/**
	 * The operation id for the '<em>Is Alternative</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOMING_STATE___IS_ALTERNATIVE = ABSTRACT_STATE___IS_ALTERNATIVE;

	/**
	 * The operation id for the '<em>Is Optional</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOMING_STATE___IS_OPTIONAL = ABSTRACT_STATE___IS_OPTIONAL;

	/**
	 * The operation id for the '<em>Is Optional Alternative</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOMING_STATE___IS_OPTIONAL_ALTERNATIVE = ABSTRACT_STATE___IS_OPTIONAL_ALTERNATIVE;

	/**
	 * The operation id for the '<em>Is Variability Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOMING_STATE___IS_VARIABILITY_SET = ABSTRACT_STATE___IS_VARIABILITY_SET;

	/**
	 * The operation id for the '<em>Set Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOMING_STATE___SET_PARAMETER__STRING_STRING = ABSTRACT_STATE___SET_PARAMETER__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOMING_STATE___GET_PARAMETER__STRING = ABSTRACT_STATE___GET_PARAMETER__STRING;

	/**
	 * The operation id for the '<em>Remove Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOMING_STATE___REMOVE_PARAMETER__STRING = ABSTRACT_STATE___REMOVE_PARAMETER__STRING;

	/**
	 * The operation id for the '<em>Contains Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOMING_STATE___CONTAINS_PARAMETER__STRING = ABSTRACT_STATE___CONTAINS_PARAMETER__STRING;

	/**
	 * The operation id for the '<em>Is Hierarchical</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOMING_STATE___IS_HIERARCHICAL = ABSTRACT_STATE___IS_HIERARCHICAL;

	/**
	 * The operation id for the '<em>Is Parallel</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOMING_STATE___IS_PARALLEL = ABSTRACT_STATE___IS_PARALLEL;

	/**
	 * The number of operations of the '<em>Incoming State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOMING_STATE_OPERATION_COUNT = ABSTRACT_STATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.impl.StateImpl
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.impl.StateChartsPackageImpl#getState()
	 * @generated
	 */
	int STATE = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__ID = INCOMING_STATE__ID;

	/**
	 * The feature id for the '<em><b>Alternative Values</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__ALTERNATIVE_VALUES = INCOMING_STATE__ALTERNATIVE_VALUES;

	/**
	 * The feature id for the '<em><b>Variability Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__VARIABILITY_GROUP_ID = INCOMING_STATE__VARIABILITY_GROUP_ID;

	/**
	 * The feature id for the '<em><b>Containing Models</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__CONTAINING_MODELS = INCOMING_STATE__CONTAINING_MODELS;

	/**
	 * The feature id for the '<em><b>Variability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__VARIABILITY = INCOMING_STATE__VARIABILITY;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__PARAMETERS = INCOMING_STATE__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__PARENT = INCOMING_STATE__PARENT;

	/**
	 * The feature id for the '<em><b>Stereotypes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__STEREOTYPES = INCOMING_STATE__STEREOTYPES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__NAME = INCOMING_STATE__NAME;

	/**
	 * The feature id for the '<em><b>Incoming Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__INCOMING_TRANSITIONS = INCOMING_STATE__INCOMING_TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Outgoing Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__OUTGOING_TRANSITIONS = INCOMING_STATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>History</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__HISTORY = INCOMING_STATE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__ACTIONS = INCOMING_STATE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Regions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__REGIONS = INCOMING_STATE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = INCOMING_STATE_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Add Alternative Values Map</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE___ADD_ALTERNATIVE_VALUES_MAP__STRING = INCOMING_STATE___ADD_ALTERNATIVE_VALUES_MAP__STRING;

	/**
	 * The operation id for the '<em>Is Contained In Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE___IS_CONTAINED_IN_MODEL__STRING = INCOMING_STATE___IS_CONTAINED_IN_MODEL__STRING;

	/**
	 * The operation id for the '<em>Is Mandatory</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE___IS_MANDATORY = INCOMING_STATE___IS_MANDATORY;

	/**
	 * The operation id for the '<em>Is Alternative</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE___IS_ALTERNATIVE = INCOMING_STATE___IS_ALTERNATIVE;

	/**
	 * The operation id for the '<em>Is Optional</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE___IS_OPTIONAL = INCOMING_STATE___IS_OPTIONAL;

	/**
	 * The operation id for the '<em>Is Optional Alternative</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE___IS_OPTIONAL_ALTERNATIVE = INCOMING_STATE___IS_OPTIONAL_ALTERNATIVE;

	/**
	 * The operation id for the '<em>Is Variability Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE___IS_VARIABILITY_SET = INCOMING_STATE___IS_VARIABILITY_SET;

	/**
	 * The operation id for the '<em>Set Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE___SET_PARAMETER__STRING_STRING = INCOMING_STATE___SET_PARAMETER__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE___GET_PARAMETER__STRING = INCOMING_STATE___GET_PARAMETER__STRING;

	/**
	 * The operation id for the '<em>Remove Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE___REMOVE_PARAMETER__STRING = INCOMING_STATE___REMOVE_PARAMETER__STRING;

	/**
	 * The operation id for the '<em>Contains Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE___CONTAINS_PARAMETER__STRING = INCOMING_STATE___CONTAINS_PARAMETER__STRING;

	/**
	 * The operation id for the '<em>Is Hierarchical</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE___IS_HIERARCHICAL = INCOMING_STATE___IS_HIERARCHICAL;

	/**
	 * The operation id for the '<em>Is Parallel</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE___IS_PARALLEL = INCOMING_STATE___IS_PARALLEL;

	/**
	 * The number of operations of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_OPERATION_COUNT = INCOMING_STATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.impl.InitialStateImpl <em>Initial State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.impl.InitialStateImpl
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.impl.StateChartsPackageImpl#getInitialState()
	 * @generated
	 */
	int INITIAL_STATE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE__ID = STATE__ID;

	/**
	 * The feature id for the '<em><b>Alternative Values</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE__ALTERNATIVE_VALUES = STATE__ALTERNATIVE_VALUES;

	/**
	 * The feature id for the '<em><b>Variability Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE__VARIABILITY_GROUP_ID = STATE__VARIABILITY_GROUP_ID;

	/**
	 * The feature id for the '<em><b>Containing Models</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE__CONTAINING_MODELS = STATE__CONTAINING_MODELS;

	/**
	 * The feature id for the '<em><b>Variability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE__VARIABILITY = STATE__VARIABILITY;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE__PARAMETERS = STATE__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE__PARENT = STATE__PARENT;

	/**
	 * The feature id for the '<em><b>Stereotypes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE__STEREOTYPES = STATE__STEREOTYPES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE__NAME = STATE__NAME;

	/**
	 * The feature id for the '<em><b>Incoming Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE__INCOMING_TRANSITIONS = STATE__INCOMING_TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Outgoing Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE__OUTGOING_TRANSITIONS = STATE__OUTGOING_TRANSITIONS;

	/**
	 * The feature id for the '<em><b>History</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE__HISTORY = STATE__HISTORY;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE__ACTIONS = STATE__ACTIONS;

	/**
	 * The feature id for the '<em><b>Regions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE__REGIONS = STATE__REGIONS;

	/**
	 * The number of structural features of the '<em>Initial State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE_FEATURE_COUNT = STATE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Add Alternative Values Map</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE___ADD_ALTERNATIVE_VALUES_MAP__STRING = STATE___ADD_ALTERNATIVE_VALUES_MAP__STRING;

	/**
	 * The operation id for the '<em>Is Contained In Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE___IS_CONTAINED_IN_MODEL__STRING = STATE___IS_CONTAINED_IN_MODEL__STRING;

	/**
	 * The operation id for the '<em>Is Mandatory</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE___IS_MANDATORY = STATE___IS_MANDATORY;

	/**
	 * The operation id for the '<em>Is Alternative</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE___IS_ALTERNATIVE = STATE___IS_ALTERNATIVE;

	/**
	 * The operation id for the '<em>Is Optional</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE___IS_OPTIONAL = STATE___IS_OPTIONAL;

	/**
	 * The operation id for the '<em>Is Optional Alternative</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE___IS_OPTIONAL_ALTERNATIVE = STATE___IS_OPTIONAL_ALTERNATIVE;

	/**
	 * The operation id for the '<em>Is Variability Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE___IS_VARIABILITY_SET = STATE___IS_VARIABILITY_SET;

	/**
	 * The operation id for the '<em>Set Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE___SET_PARAMETER__STRING_STRING = STATE___SET_PARAMETER__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE___GET_PARAMETER__STRING = STATE___GET_PARAMETER__STRING;

	/**
	 * The operation id for the '<em>Remove Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE___REMOVE_PARAMETER__STRING = STATE___REMOVE_PARAMETER__STRING;

	/**
	 * The operation id for the '<em>Contains Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE___CONTAINS_PARAMETER__STRING = STATE___CONTAINS_PARAMETER__STRING;

	/**
	 * The operation id for the '<em>Is Hierarchical</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE___IS_HIERARCHICAL = STATE___IS_HIERARCHICAL;

	/**
	 * The operation id for the '<em>Is Parallel</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE___IS_PARALLEL = STATE___IS_PARALLEL;

	/**
	 * The number of operations of the '<em>Initial State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE_OPERATION_COUNT = STATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.impl.EndStateImpl <em>End State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.impl.EndStateImpl
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.impl.StateChartsPackageImpl#getEndState()
	 * @generated
	 */
	int END_STATE = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_STATE__ID = INCOMING_STATE__ID;

	/**
	 * The feature id for the '<em><b>Alternative Values</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_STATE__ALTERNATIVE_VALUES = INCOMING_STATE__ALTERNATIVE_VALUES;

	/**
	 * The feature id for the '<em><b>Variability Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_STATE__VARIABILITY_GROUP_ID = INCOMING_STATE__VARIABILITY_GROUP_ID;

	/**
	 * The feature id for the '<em><b>Containing Models</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_STATE__CONTAINING_MODELS = INCOMING_STATE__CONTAINING_MODELS;

	/**
	 * The feature id for the '<em><b>Variability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_STATE__VARIABILITY = INCOMING_STATE__VARIABILITY;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_STATE__PARAMETERS = INCOMING_STATE__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_STATE__PARENT = INCOMING_STATE__PARENT;

	/**
	 * The feature id for the '<em><b>Stereotypes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_STATE__STEREOTYPES = INCOMING_STATE__STEREOTYPES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_STATE__NAME = INCOMING_STATE__NAME;

	/**
	 * The feature id for the '<em><b>Incoming Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_STATE__INCOMING_TRANSITIONS = INCOMING_STATE__INCOMING_TRANSITIONS;

	/**
	 * The number of structural features of the '<em>End State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_STATE_FEATURE_COUNT = INCOMING_STATE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Add Alternative Values Map</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_STATE___ADD_ALTERNATIVE_VALUES_MAP__STRING = INCOMING_STATE___ADD_ALTERNATIVE_VALUES_MAP__STRING;

	/**
	 * The operation id for the '<em>Is Contained In Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_STATE___IS_CONTAINED_IN_MODEL__STRING = INCOMING_STATE___IS_CONTAINED_IN_MODEL__STRING;

	/**
	 * The operation id for the '<em>Is Mandatory</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_STATE___IS_MANDATORY = INCOMING_STATE___IS_MANDATORY;

	/**
	 * The operation id for the '<em>Is Alternative</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_STATE___IS_ALTERNATIVE = INCOMING_STATE___IS_ALTERNATIVE;

	/**
	 * The operation id for the '<em>Is Optional</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_STATE___IS_OPTIONAL = INCOMING_STATE___IS_OPTIONAL;

	/**
	 * The operation id for the '<em>Is Optional Alternative</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_STATE___IS_OPTIONAL_ALTERNATIVE = INCOMING_STATE___IS_OPTIONAL_ALTERNATIVE;

	/**
	 * The operation id for the '<em>Is Variability Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_STATE___IS_VARIABILITY_SET = INCOMING_STATE___IS_VARIABILITY_SET;

	/**
	 * The operation id for the '<em>Set Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_STATE___SET_PARAMETER__STRING_STRING = INCOMING_STATE___SET_PARAMETER__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_STATE___GET_PARAMETER__STRING = INCOMING_STATE___GET_PARAMETER__STRING;

	/**
	 * The operation id for the '<em>Remove Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_STATE___REMOVE_PARAMETER__STRING = INCOMING_STATE___REMOVE_PARAMETER__STRING;

	/**
	 * The operation id for the '<em>Contains Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_STATE___CONTAINS_PARAMETER__STRING = INCOMING_STATE___CONTAINS_PARAMETER__STRING;

	/**
	 * The operation id for the '<em>Is Hierarchical</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_STATE___IS_HIERARCHICAL = INCOMING_STATE___IS_HIERARCHICAL;

	/**
	 * The operation id for the '<em>Is Parallel</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_STATE___IS_PARALLEL = INCOMING_STATE___IS_PARALLEL;

	/**
	 * The number of operations of the '<em>End State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_STATE_OPERATION_COUNT = INCOMING_STATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.impl.FinalStateImpl <em>Final State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.impl.FinalStateImpl
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.impl.StateChartsPackageImpl#getFinalState()
	 * @generated
	 */
	int FINAL_STATE = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__ID = END_STATE__ID;

	/**
	 * The feature id for the '<em><b>Alternative Values</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__ALTERNATIVE_VALUES = END_STATE__ALTERNATIVE_VALUES;

	/**
	 * The feature id for the '<em><b>Variability Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__VARIABILITY_GROUP_ID = END_STATE__VARIABILITY_GROUP_ID;

	/**
	 * The feature id for the '<em><b>Containing Models</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__CONTAINING_MODELS = END_STATE__CONTAINING_MODELS;

	/**
	 * The feature id for the '<em><b>Variability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__VARIABILITY = END_STATE__VARIABILITY;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__PARAMETERS = END_STATE__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__PARENT = END_STATE__PARENT;

	/**
	 * The feature id for the '<em><b>Stereotypes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__STEREOTYPES = END_STATE__STEREOTYPES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__NAME = END_STATE__NAME;

	/**
	 * The feature id for the '<em><b>Incoming Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__INCOMING_TRANSITIONS = END_STATE__INCOMING_TRANSITIONS;

	/**
	 * The number of structural features of the '<em>Final State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE_FEATURE_COUNT = END_STATE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Add Alternative Values Map</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE___ADD_ALTERNATIVE_VALUES_MAP__STRING = END_STATE___ADD_ALTERNATIVE_VALUES_MAP__STRING;

	/**
	 * The operation id for the '<em>Is Contained In Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE___IS_CONTAINED_IN_MODEL__STRING = END_STATE___IS_CONTAINED_IN_MODEL__STRING;

	/**
	 * The operation id for the '<em>Is Mandatory</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE___IS_MANDATORY = END_STATE___IS_MANDATORY;

	/**
	 * The operation id for the '<em>Is Alternative</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE___IS_ALTERNATIVE = END_STATE___IS_ALTERNATIVE;

	/**
	 * The operation id for the '<em>Is Optional</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE___IS_OPTIONAL = END_STATE___IS_OPTIONAL;

	/**
	 * The operation id for the '<em>Is Optional Alternative</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE___IS_OPTIONAL_ALTERNATIVE = END_STATE___IS_OPTIONAL_ALTERNATIVE;

	/**
	 * The operation id for the '<em>Is Variability Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE___IS_VARIABILITY_SET = END_STATE___IS_VARIABILITY_SET;

	/**
	 * The operation id for the '<em>Set Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE___SET_PARAMETER__STRING_STRING = END_STATE___SET_PARAMETER__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE___GET_PARAMETER__STRING = END_STATE___GET_PARAMETER__STRING;

	/**
	 * The operation id for the '<em>Remove Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE___REMOVE_PARAMETER__STRING = END_STATE___REMOVE_PARAMETER__STRING;

	/**
	 * The operation id for the '<em>Contains Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE___CONTAINS_PARAMETER__STRING = END_STATE___CONTAINS_PARAMETER__STRING;

	/**
	 * The operation id for the '<em>Is Hierarchical</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE___IS_HIERARCHICAL = END_STATE___IS_HIERARCHICAL;

	/**
	 * The operation id for the '<em>Is Parallel</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE___IS_PARALLEL = END_STATE___IS_PARALLEL;

	/**
	 * The number of operations of the '<em>Final State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE_OPERATION_COUNT = END_STATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.impl.TerminationConnectorImpl <em>Termination Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.impl.TerminationConnectorImpl
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.impl.StateChartsPackageImpl#getTerminationConnector()
	 * @generated
	 */
	int TERMINATION_CONNECTOR = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_CONNECTOR__ID = END_STATE__ID;

	/**
	 * The feature id for the '<em><b>Alternative Values</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_CONNECTOR__ALTERNATIVE_VALUES = END_STATE__ALTERNATIVE_VALUES;

	/**
	 * The feature id for the '<em><b>Variability Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_CONNECTOR__VARIABILITY_GROUP_ID = END_STATE__VARIABILITY_GROUP_ID;

	/**
	 * The feature id for the '<em><b>Containing Models</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_CONNECTOR__CONTAINING_MODELS = END_STATE__CONTAINING_MODELS;

	/**
	 * The feature id for the '<em><b>Variability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_CONNECTOR__VARIABILITY = END_STATE__VARIABILITY;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_CONNECTOR__PARAMETERS = END_STATE__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_CONNECTOR__PARENT = END_STATE__PARENT;

	/**
	 * The feature id for the '<em><b>Stereotypes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_CONNECTOR__STEREOTYPES = END_STATE__STEREOTYPES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_CONNECTOR__NAME = END_STATE__NAME;

	/**
	 * The feature id for the '<em><b>Incoming Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_CONNECTOR__INCOMING_TRANSITIONS = END_STATE__INCOMING_TRANSITIONS;

	/**
	 * The number of structural features of the '<em>Termination Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_CONNECTOR_FEATURE_COUNT = END_STATE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Add Alternative Values Map</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_CONNECTOR___ADD_ALTERNATIVE_VALUES_MAP__STRING = END_STATE___ADD_ALTERNATIVE_VALUES_MAP__STRING;

	/**
	 * The operation id for the '<em>Is Contained In Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_CONNECTOR___IS_CONTAINED_IN_MODEL__STRING = END_STATE___IS_CONTAINED_IN_MODEL__STRING;

	/**
	 * The operation id for the '<em>Is Mandatory</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_CONNECTOR___IS_MANDATORY = END_STATE___IS_MANDATORY;

	/**
	 * The operation id for the '<em>Is Alternative</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_CONNECTOR___IS_ALTERNATIVE = END_STATE___IS_ALTERNATIVE;

	/**
	 * The operation id for the '<em>Is Optional</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_CONNECTOR___IS_OPTIONAL = END_STATE___IS_OPTIONAL;

	/**
	 * The operation id for the '<em>Is Optional Alternative</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_CONNECTOR___IS_OPTIONAL_ALTERNATIVE = END_STATE___IS_OPTIONAL_ALTERNATIVE;

	/**
	 * The operation id for the '<em>Is Variability Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_CONNECTOR___IS_VARIABILITY_SET = END_STATE___IS_VARIABILITY_SET;

	/**
	 * The operation id for the '<em>Set Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_CONNECTOR___SET_PARAMETER__STRING_STRING = END_STATE___SET_PARAMETER__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_CONNECTOR___GET_PARAMETER__STRING = END_STATE___GET_PARAMETER__STRING;

	/**
	 * The operation id for the '<em>Remove Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_CONNECTOR___REMOVE_PARAMETER__STRING = END_STATE___REMOVE_PARAMETER__STRING;

	/**
	 * The operation id for the '<em>Contains Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_CONNECTOR___CONTAINS_PARAMETER__STRING = END_STATE___CONTAINS_PARAMETER__STRING;

	/**
	 * The operation id for the '<em>Is Hierarchical</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_CONNECTOR___IS_HIERARCHICAL = END_STATE___IS_HIERARCHICAL;

	/**
	 * The operation id for the '<em>Is Parallel</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_CONNECTOR___IS_PARALLEL = END_STATE___IS_PARALLEL;

	/**
	 * The number of operations of the '<em>Termination Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_CONNECTOR_OPERATION_COUNT = END_STATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.impl.OutgoingStateImpl <em>Outgoing State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.impl.OutgoingStateImpl
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.impl.StateChartsPackageImpl#getOutgoingState()
	 * @generated
	 */
	int OUTGOING_STATE = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTGOING_STATE__ID = ABSTRACT_STATE__ID;

	/**
	 * The feature id for the '<em><b>Alternative Values</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTGOING_STATE__ALTERNATIVE_VALUES = ABSTRACT_STATE__ALTERNATIVE_VALUES;

	/**
	 * The feature id for the '<em><b>Variability Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTGOING_STATE__VARIABILITY_GROUP_ID = ABSTRACT_STATE__VARIABILITY_GROUP_ID;

	/**
	 * The feature id for the '<em><b>Containing Models</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTGOING_STATE__CONTAINING_MODELS = ABSTRACT_STATE__CONTAINING_MODELS;

	/**
	 * The feature id for the '<em><b>Variability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTGOING_STATE__VARIABILITY = ABSTRACT_STATE__VARIABILITY;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTGOING_STATE__PARAMETERS = ABSTRACT_STATE__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTGOING_STATE__PARENT = ABSTRACT_STATE__PARENT;

	/**
	 * The feature id for the '<em><b>Stereotypes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTGOING_STATE__STEREOTYPES = ABSTRACT_STATE__STEREOTYPES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTGOING_STATE__NAME = ABSTRACT_STATE__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTGOING_STATE__OUTGOING_TRANSITIONS = ABSTRACT_STATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Outgoing State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTGOING_STATE_FEATURE_COUNT = ABSTRACT_STATE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Add Alternative Values Map</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTGOING_STATE___ADD_ALTERNATIVE_VALUES_MAP__STRING = ABSTRACT_STATE___ADD_ALTERNATIVE_VALUES_MAP__STRING;

	/**
	 * The operation id for the '<em>Is Contained In Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTGOING_STATE___IS_CONTAINED_IN_MODEL__STRING = ABSTRACT_STATE___IS_CONTAINED_IN_MODEL__STRING;

	/**
	 * The operation id for the '<em>Is Mandatory</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTGOING_STATE___IS_MANDATORY = ABSTRACT_STATE___IS_MANDATORY;

	/**
	 * The operation id for the '<em>Is Alternative</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTGOING_STATE___IS_ALTERNATIVE = ABSTRACT_STATE___IS_ALTERNATIVE;

	/**
	 * The operation id for the '<em>Is Optional</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTGOING_STATE___IS_OPTIONAL = ABSTRACT_STATE___IS_OPTIONAL;

	/**
	 * The operation id for the '<em>Is Optional Alternative</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTGOING_STATE___IS_OPTIONAL_ALTERNATIVE = ABSTRACT_STATE___IS_OPTIONAL_ALTERNATIVE;

	/**
	 * The operation id for the '<em>Is Variability Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTGOING_STATE___IS_VARIABILITY_SET = ABSTRACT_STATE___IS_VARIABILITY_SET;

	/**
	 * The operation id for the '<em>Set Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTGOING_STATE___SET_PARAMETER__STRING_STRING = ABSTRACT_STATE___SET_PARAMETER__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTGOING_STATE___GET_PARAMETER__STRING = ABSTRACT_STATE___GET_PARAMETER__STRING;

	/**
	 * The operation id for the '<em>Remove Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTGOING_STATE___REMOVE_PARAMETER__STRING = ABSTRACT_STATE___REMOVE_PARAMETER__STRING;

	/**
	 * The operation id for the '<em>Contains Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTGOING_STATE___CONTAINS_PARAMETER__STRING = ABSTRACT_STATE___CONTAINS_PARAMETER__STRING;

	/**
	 * The operation id for the '<em>Is Hierarchical</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTGOING_STATE___IS_HIERARCHICAL = ABSTRACT_STATE___IS_HIERARCHICAL;

	/**
	 * The operation id for the '<em>Is Parallel</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTGOING_STATE___IS_PARALLEL = ABSTRACT_STATE___IS_PARALLEL;

	/**
	 * The number of operations of the '<em>Outgoing State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTGOING_STATE_OPERATION_COUNT = ABSTRACT_STATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.impl.RegionImpl <em>Region</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.impl.RegionImpl
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.impl.StateChartsPackageImpl#getRegion()
	 * @generated
	 */
	int REGION = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__ID = BasePackage.CONTAINER_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Alternative Values</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__ALTERNATIVE_VALUES = BasePackage.CONTAINER_ENTITY__ALTERNATIVE_VALUES;

	/**
	 * The feature id for the '<em><b>Variability Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__VARIABILITY_GROUP_ID = BasePackage.CONTAINER_ENTITY__VARIABILITY_GROUP_ID;

	/**
	 * The feature id for the '<em><b>Containing Models</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__CONTAINING_MODELS = BasePackage.CONTAINER_ENTITY__CONTAINING_MODELS;

	/**
	 * The feature id for the '<em><b>Variability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__VARIABILITY = BasePackage.CONTAINER_ENTITY__VARIABILITY;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__PARAMETERS = BasePackage.CONTAINER_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__PARENT = BasePackage.CONTAINER_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Initial States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__INITIAL_STATES = BasePackage.CONTAINER_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__STATES = BasePackage.CONTAINER_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>End States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__END_STATES = BasePackage.CONTAINER_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__NAME = BasePackage.CONTAINER_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_FEATURE_COUNT = BasePackage.CONTAINER_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Add Alternative Values Map</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION___ADD_ALTERNATIVE_VALUES_MAP__STRING = BasePackage.CONTAINER_ENTITY___ADD_ALTERNATIVE_VALUES_MAP__STRING;

	/**
	 * The operation id for the '<em>Is Contained In Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION___IS_CONTAINED_IN_MODEL__STRING = BasePackage.CONTAINER_ENTITY___IS_CONTAINED_IN_MODEL__STRING;

	/**
	 * The operation id for the '<em>Is Mandatory</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION___IS_MANDATORY = BasePackage.CONTAINER_ENTITY___IS_MANDATORY;

	/**
	 * The operation id for the '<em>Is Alternative</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION___IS_ALTERNATIVE = BasePackage.CONTAINER_ENTITY___IS_ALTERNATIVE;

	/**
	 * The operation id for the '<em>Is Optional</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION___IS_OPTIONAL = BasePackage.CONTAINER_ENTITY___IS_OPTIONAL;

	/**
	 * The operation id for the '<em>Is Optional Alternative</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION___IS_OPTIONAL_ALTERNATIVE = BasePackage.CONTAINER_ENTITY___IS_OPTIONAL_ALTERNATIVE;

	/**
	 * The operation id for the '<em>Is Variability Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION___IS_VARIABILITY_SET = BasePackage.CONTAINER_ENTITY___IS_VARIABILITY_SET;

	/**
	 * The operation id for the '<em>Set Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION___SET_PARAMETER__STRING_STRING = BasePackage.CONTAINER_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION___GET_PARAMETER__STRING = BasePackage.CONTAINER_ENTITY_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Remove Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION___REMOVE_PARAMETER__STRING = BasePackage.CONTAINER_ENTITY_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Contains Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION___CONTAINS_PARAMETER__STRING = BasePackage.CONTAINER_ENTITY_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_OPERATION_COUNT = BasePackage.CONTAINER_ENTITY_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.impl.TransitionImpl
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.impl.StateChartsPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__ID = BasePackage.EDGE_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Alternative Values</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__ALTERNATIVE_VALUES = BasePackage.EDGE_ENTITY__ALTERNATIVE_VALUES;

	/**
	 * The feature id for the '<em><b>Variability Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__VARIABILITY_GROUP_ID = BasePackage.EDGE_ENTITY__VARIABILITY_GROUP_ID;

	/**
	 * The feature id for the '<em><b>Containing Models</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__CONTAINING_MODELS = BasePackage.EDGE_ENTITY__CONTAINING_MODELS;

	/**
	 * The feature id for the '<em><b>Variability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__VARIABILITY = BasePackage.EDGE_ENTITY__VARIABILITY;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__PARAMETERS = BasePackage.EDGE_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__PRIORITY = BasePackage.EDGE_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TYPE = BasePackage.EDGE_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Stereotypes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__STEREOTYPES = BasePackage.EDGE_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__SOURCE = BasePackage.EDGE_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TARGET = BasePackage.EDGE_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__LABEL = BasePackage.EDGE_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__NAME = BasePackage.EDGE_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = BasePackage.EDGE_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>Add Alternative Values Map</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION___ADD_ALTERNATIVE_VALUES_MAP__STRING = BasePackage.EDGE_ENTITY___ADD_ALTERNATIVE_VALUES_MAP__STRING;

	/**
	 * The operation id for the '<em>Is Contained In Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION___IS_CONTAINED_IN_MODEL__STRING = BasePackage.EDGE_ENTITY___IS_CONTAINED_IN_MODEL__STRING;

	/**
	 * The operation id for the '<em>Is Mandatory</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION___IS_MANDATORY = BasePackage.EDGE_ENTITY___IS_MANDATORY;

	/**
	 * The operation id for the '<em>Is Alternative</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION___IS_ALTERNATIVE = BasePackage.EDGE_ENTITY___IS_ALTERNATIVE;

	/**
	 * The operation id for the '<em>Is Optional</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION___IS_OPTIONAL = BasePackage.EDGE_ENTITY___IS_OPTIONAL;

	/**
	 * The operation id for the '<em>Is Optional Alternative</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION___IS_OPTIONAL_ALTERNATIVE = BasePackage.EDGE_ENTITY___IS_OPTIONAL_ALTERNATIVE;

	/**
	 * The operation id for the '<em>Is Variability Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION___IS_VARIABILITY_SET = BasePackage.EDGE_ENTITY___IS_VARIABILITY_SET;

	/**
	 * The operation id for the '<em>Set Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION___SET_PARAMETER__STRING_STRING = BasePackage.EDGE_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION___GET_PARAMETER__STRING = BasePackage.EDGE_ENTITY_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Remove Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION___REMOVE_PARAMETER__STRING = BasePackage.EDGE_ENTITY_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Contains Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION___CONTAINS_PARAMETER__STRING = BasePackage.EDGE_ENTITY_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_OPERATION_COUNT = BasePackage.EDGE_ENTITY_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.impl.TransitionLabelImpl <em>Transition Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.impl.TransitionLabelImpl
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.impl.StateChartsPackageImpl#getTransitionLabel()
	 * @generated
	 */
	int TRANSITION_LABEL = 11;

	/**
	 * The feature id for the '<em><b>Alternative Values</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_LABEL__ALTERNATIVE_VALUES = BasePackage.VARIABLE_ELEMENT__ALTERNATIVE_VALUES;

	/**
	 * The feature id for the '<em><b>Variability Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_LABEL__VARIABILITY_GROUP_ID = BasePackage.VARIABLE_ELEMENT__VARIABILITY_GROUP_ID;

	/**
	 * The feature id for the '<em><b>Containing Models</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_LABEL__CONTAINING_MODELS = BasePackage.VARIABLE_ELEMENT__CONTAINING_MODELS;

	/**
	 * The feature id for the '<em><b>Variability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_LABEL__VARIABILITY = BasePackage.VARIABLE_ELEMENT__VARIABILITY;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_LABEL__ID = BasePackage.VARIABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Events</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_LABEL__EVENTS = BasePackage.VARIABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Conditions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_LABEL__CONDITIONS = BasePackage.VARIABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Condition Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_LABEL__CONDITION_ACTIONS = BasePackage.VARIABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Transition Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_LABEL__TRANSITION_ACTIONS = BasePackage.VARIABLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Transition Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_LABEL_FEATURE_COUNT = BasePackage.VARIABLE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Add Alternative Values Map</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_LABEL___ADD_ALTERNATIVE_VALUES_MAP__STRING = BasePackage.VARIABLE_ELEMENT___ADD_ALTERNATIVE_VALUES_MAP__STRING;

	/**
	 * The operation id for the '<em>Is Contained In Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_LABEL___IS_CONTAINED_IN_MODEL__STRING = BasePackage.VARIABLE_ELEMENT___IS_CONTAINED_IN_MODEL__STRING;

	/**
	 * The operation id for the '<em>Is Mandatory</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_LABEL___IS_MANDATORY = BasePackage.VARIABLE_ELEMENT___IS_MANDATORY;

	/**
	 * The operation id for the '<em>Is Alternative</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_LABEL___IS_ALTERNATIVE = BasePackage.VARIABLE_ELEMENT___IS_ALTERNATIVE;

	/**
	 * The operation id for the '<em>Is Optional</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_LABEL___IS_OPTIONAL = BasePackage.VARIABLE_ELEMENT___IS_OPTIONAL;

	/**
	 * The operation id for the '<em>Is Optional Alternative</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_LABEL___IS_OPTIONAL_ALTERNATIVE = BasePackage.VARIABLE_ELEMENT___IS_OPTIONAL_ALTERNATIVE;

	/**
	 * The operation id for the '<em>Is Variability Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_LABEL___IS_VARIABILITY_SET = BasePackage.VARIABLE_ELEMENT___IS_VARIABILITY_SET;

	/**
	 * The number of operations of the '<em>Transition Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_LABEL_OPERATION_COUNT = BasePackage.VARIABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.impl.ActionImpl
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.impl.StateChartsPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 12;

	/**
	 * The feature id for the '<em><b>Alternative Values</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__ALTERNATIVE_VALUES = BasePackage.VARIABLE_ELEMENT__ALTERNATIVE_VALUES;

	/**
	 * The feature id for the '<em><b>Variability Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__VARIABILITY_GROUP_ID = BasePackage.VARIABLE_ELEMENT__VARIABILITY_GROUP_ID;

	/**
	 * The feature id for the '<em><b>Containing Models</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__CONTAINING_MODELS = BasePackage.VARIABLE_ELEMENT__CONTAINING_MODELS;

	/**
	 * The feature id for the '<em><b>Variability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__VARIABILITY = BasePackage.VARIABLE_ELEMENT__VARIABILITY;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__ID = BasePackage.VARIABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__CODE = BasePackage.VARIABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = BasePackage.VARIABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Add Alternative Values Map</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION___ADD_ALTERNATIVE_VALUES_MAP__STRING = BasePackage.VARIABLE_ELEMENT___ADD_ALTERNATIVE_VALUES_MAP__STRING;

	/**
	 * The operation id for the '<em>Is Contained In Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION___IS_CONTAINED_IN_MODEL__STRING = BasePackage.VARIABLE_ELEMENT___IS_CONTAINED_IN_MODEL__STRING;

	/**
	 * The operation id for the '<em>Is Mandatory</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION___IS_MANDATORY = BasePackage.VARIABLE_ELEMENT___IS_MANDATORY;

	/**
	 * The operation id for the '<em>Is Alternative</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION___IS_ALTERNATIVE = BasePackage.VARIABLE_ELEMENT___IS_ALTERNATIVE;

	/**
	 * The operation id for the '<em>Is Optional</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION___IS_OPTIONAL = BasePackage.VARIABLE_ELEMENT___IS_OPTIONAL;

	/**
	 * The operation id for the '<em>Is Optional Alternative</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION___IS_OPTIONAL_ALTERNATIVE = BasePackage.VARIABLE_ELEMENT___IS_OPTIONAL_ALTERNATIVE;

	/**
	 * The operation id for the '<em>Is Variability Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION___IS_VARIABILITY_SET = BasePackage.VARIABLE_ELEMENT___IS_VARIABILITY_SET;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = BasePackage.VARIABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.impl.StateActionImpl <em>State Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.impl.StateActionImpl
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.impl.StateChartsPackageImpl#getStateAction()
	 * @generated
	 */
	int STATE_ACTION = 13;

	/**
	 * The feature id for the '<em><b>Alternative Values</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_ACTION__ALTERNATIVE_VALUES = ACTION__ALTERNATIVE_VALUES;

	/**
	 * The feature id for the '<em><b>Variability Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_ACTION__VARIABILITY_GROUP_ID = ACTION__VARIABILITY_GROUP_ID;

	/**
	 * The feature id for the '<em><b>Containing Models</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_ACTION__CONTAINING_MODELS = ACTION__CONTAINING_MODELS;

	/**
	 * The feature id for the '<em><b>Variability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_ACTION__VARIABILITY = ACTION__VARIABILITY;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_ACTION__ID = ACTION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_ACTION__CODE = ACTION__CODE;

	/**
	 * The number of structural features of the '<em>State Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Add Alternative Values Map</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_ACTION___ADD_ALTERNATIVE_VALUES_MAP__STRING = ACTION___ADD_ALTERNATIVE_VALUES_MAP__STRING;

	/**
	 * The operation id for the '<em>Is Contained In Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_ACTION___IS_CONTAINED_IN_MODEL__STRING = ACTION___IS_CONTAINED_IN_MODEL__STRING;

	/**
	 * The operation id for the '<em>Is Mandatory</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_ACTION___IS_MANDATORY = ACTION___IS_MANDATORY;

	/**
	 * The operation id for the '<em>Is Alternative</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_ACTION___IS_ALTERNATIVE = ACTION___IS_ALTERNATIVE;

	/**
	 * The operation id for the '<em>Is Optional</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_ACTION___IS_OPTIONAL = ACTION___IS_OPTIONAL;

	/**
	 * The operation id for the '<em>Is Optional Alternative</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_ACTION___IS_OPTIONAL_ALTERNATIVE = ACTION___IS_OPTIONAL_ALTERNATIVE;

	/**
	 * The operation id for the '<em>Is Variability Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_ACTION___IS_VARIABILITY_SET = ACTION___IS_VARIABILITY_SET;

	/**
	 * The number of operations of the '<em>State Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_ACTION_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.impl.EntryActionImpl <em>Entry Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.impl.EntryActionImpl
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.impl.StateChartsPackageImpl#getEntryAction()
	 * @generated
	 */
	int ENTRY_ACTION = 14;

	/**
	 * The feature id for the '<em><b>Alternative Values</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_ACTION__ALTERNATIVE_VALUES = STATE_ACTION__ALTERNATIVE_VALUES;

	/**
	 * The feature id for the '<em><b>Variability Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_ACTION__VARIABILITY_GROUP_ID = STATE_ACTION__VARIABILITY_GROUP_ID;

	/**
	 * The feature id for the '<em><b>Containing Models</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_ACTION__CONTAINING_MODELS = STATE_ACTION__CONTAINING_MODELS;

	/**
	 * The feature id for the '<em><b>Variability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_ACTION__VARIABILITY = STATE_ACTION__VARIABILITY;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_ACTION__ID = STATE_ACTION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_ACTION__CODE = STATE_ACTION__CODE;

	/**
	 * The number of structural features of the '<em>Entry Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_ACTION_FEATURE_COUNT = STATE_ACTION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Add Alternative Values Map</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_ACTION___ADD_ALTERNATIVE_VALUES_MAP__STRING = STATE_ACTION___ADD_ALTERNATIVE_VALUES_MAP__STRING;

	/**
	 * The operation id for the '<em>Is Contained In Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_ACTION___IS_CONTAINED_IN_MODEL__STRING = STATE_ACTION___IS_CONTAINED_IN_MODEL__STRING;

	/**
	 * The operation id for the '<em>Is Mandatory</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_ACTION___IS_MANDATORY = STATE_ACTION___IS_MANDATORY;

	/**
	 * The operation id for the '<em>Is Alternative</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_ACTION___IS_ALTERNATIVE = STATE_ACTION___IS_ALTERNATIVE;

	/**
	 * The operation id for the '<em>Is Optional</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_ACTION___IS_OPTIONAL = STATE_ACTION___IS_OPTIONAL;

	/**
	 * The operation id for the '<em>Is Optional Alternative</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_ACTION___IS_OPTIONAL_ALTERNATIVE = STATE_ACTION___IS_OPTIONAL_ALTERNATIVE;

	/**
	 * The operation id for the '<em>Is Variability Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_ACTION___IS_VARIABILITY_SET = STATE_ACTION___IS_VARIABILITY_SET;

	/**
	 * The number of operations of the '<em>Entry Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_ACTION_OPERATION_COUNT = STATE_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.impl.ExitActionImpl <em>Exit Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.impl.ExitActionImpl
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.impl.StateChartsPackageImpl#getExitAction()
	 * @generated
	 */
	int EXIT_ACTION = 15;

	/**
	 * The feature id for the '<em><b>Alternative Values</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_ACTION__ALTERNATIVE_VALUES = STATE_ACTION__ALTERNATIVE_VALUES;

	/**
	 * The feature id for the '<em><b>Variability Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_ACTION__VARIABILITY_GROUP_ID = STATE_ACTION__VARIABILITY_GROUP_ID;

	/**
	 * The feature id for the '<em><b>Containing Models</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_ACTION__CONTAINING_MODELS = STATE_ACTION__CONTAINING_MODELS;

	/**
	 * The feature id for the '<em><b>Variability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_ACTION__VARIABILITY = STATE_ACTION__VARIABILITY;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_ACTION__ID = STATE_ACTION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_ACTION__CODE = STATE_ACTION__CODE;

	/**
	 * The number of structural features of the '<em>Exit Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_ACTION_FEATURE_COUNT = STATE_ACTION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Add Alternative Values Map</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_ACTION___ADD_ALTERNATIVE_VALUES_MAP__STRING = STATE_ACTION___ADD_ALTERNATIVE_VALUES_MAP__STRING;

	/**
	 * The operation id for the '<em>Is Contained In Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_ACTION___IS_CONTAINED_IN_MODEL__STRING = STATE_ACTION___IS_CONTAINED_IN_MODEL__STRING;

	/**
	 * The operation id for the '<em>Is Mandatory</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_ACTION___IS_MANDATORY = STATE_ACTION___IS_MANDATORY;

	/**
	 * The operation id for the '<em>Is Alternative</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_ACTION___IS_ALTERNATIVE = STATE_ACTION___IS_ALTERNATIVE;

	/**
	 * The operation id for the '<em>Is Optional</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_ACTION___IS_OPTIONAL = STATE_ACTION___IS_OPTIONAL;

	/**
	 * The operation id for the '<em>Is Optional Alternative</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_ACTION___IS_OPTIONAL_ALTERNATIVE = STATE_ACTION___IS_OPTIONAL_ALTERNATIVE;

	/**
	 * The operation id for the '<em>Is Variability Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_ACTION___IS_VARIABILITY_SET = STATE_ACTION___IS_VARIABILITY_SET;

	/**
	 * The number of operations of the '<em>Exit Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_ACTION_OPERATION_COUNT = STATE_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.impl.DuringActionImpl <em>During Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.impl.DuringActionImpl
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.impl.StateChartsPackageImpl#getDuringAction()
	 * @generated
	 */
	int DURING_ACTION = 16;

	/**
	 * The feature id for the '<em><b>Alternative Values</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURING_ACTION__ALTERNATIVE_VALUES = STATE_ACTION__ALTERNATIVE_VALUES;

	/**
	 * The feature id for the '<em><b>Variability Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURING_ACTION__VARIABILITY_GROUP_ID = STATE_ACTION__VARIABILITY_GROUP_ID;

	/**
	 * The feature id for the '<em><b>Containing Models</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURING_ACTION__CONTAINING_MODELS = STATE_ACTION__CONTAINING_MODELS;

	/**
	 * The feature id for the '<em><b>Variability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURING_ACTION__VARIABILITY = STATE_ACTION__VARIABILITY;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURING_ACTION__ID = STATE_ACTION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURING_ACTION__CODE = STATE_ACTION__CODE;

	/**
	 * The number of structural features of the '<em>During Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURING_ACTION_FEATURE_COUNT = STATE_ACTION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Add Alternative Values Map</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURING_ACTION___ADD_ALTERNATIVE_VALUES_MAP__STRING = STATE_ACTION___ADD_ALTERNATIVE_VALUES_MAP__STRING;

	/**
	 * The operation id for the '<em>Is Contained In Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURING_ACTION___IS_CONTAINED_IN_MODEL__STRING = STATE_ACTION___IS_CONTAINED_IN_MODEL__STRING;

	/**
	 * The operation id for the '<em>Is Mandatory</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURING_ACTION___IS_MANDATORY = STATE_ACTION___IS_MANDATORY;

	/**
	 * The operation id for the '<em>Is Alternative</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURING_ACTION___IS_ALTERNATIVE = STATE_ACTION___IS_ALTERNATIVE;

	/**
	 * The operation id for the '<em>Is Optional</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURING_ACTION___IS_OPTIONAL = STATE_ACTION___IS_OPTIONAL;

	/**
	 * The operation id for the '<em>Is Optional Alternative</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURING_ACTION___IS_OPTIONAL_ALTERNATIVE = STATE_ACTION___IS_OPTIONAL_ALTERNATIVE;

	/**
	 * The operation id for the '<em>Is Variability Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURING_ACTION___IS_VARIABILITY_SET = STATE_ACTION___IS_VARIABILITY_SET;

	/**
	 * The number of operations of the '<em>During Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURING_ACTION_OPERATION_COUNT = STATE_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.impl.BindActionImpl <em>Bind Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.impl.BindActionImpl
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.impl.StateChartsPackageImpl#getBindAction()
	 * @generated
	 */
	int BIND_ACTION = 17;

	/**
	 * The feature id for the '<em><b>Alternative Values</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIND_ACTION__ALTERNATIVE_VALUES = STATE_ACTION__ALTERNATIVE_VALUES;

	/**
	 * The feature id for the '<em><b>Variability Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIND_ACTION__VARIABILITY_GROUP_ID = STATE_ACTION__VARIABILITY_GROUP_ID;

	/**
	 * The feature id for the '<em><b>Containing Models</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIND_ACTION__CONTAINING_MODELS = STATE_ACTION__CONTAINING_MODELS;

	/**
	 * The feature id for the '<em><b>Variability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIND_ACTION__VARIABILITY = STATE_ACTION__VARIABILITY;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIND_ACTION__ID = STATE_ACTION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIND_ACTION__CODE = STATE_ACTION__CODE;

	/**
	 * The number of structural features of the '<em>Bind Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIND_ACTION_FEATURE_COUNT = STATE_ACTION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Add Alternative Values Map</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIND_ACTION___ADD_ALTERNATIVE_VALUES_MAP__STRING = STATE_ACTION___ADD_ALTERNATIVE_VALUES_MAP__STRING;

	/**
	 * The operation id for the '<em>Is Contained In Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIND_ACTION___IS_CONTAINED_IN_MODEL__STRING = STATE_ACTION___IS_CONTAINED_IN_MODEL__STRING;

	/**
	 * The operation id for the '<em>Is Mandatory</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIND_ACTION___IS_MANDATORY = STATE_ACTION___IS_MANDATORY;

	/**
	 * The operation id for the '<em>Is Alternative</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIND_ACTION___IS_ALTERNATIVE = STATE_ACTION___IS_ALTERNATIVE;

	/**
	 * The operation id for the '<em>Is Optional</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIND_ACTION___IS_OPTIONAL = STATE_ACTION___IS_OPTIONAL;

	/**
	 * The operation id for the '<em>Is Optional Alternative</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIND_ACTION___IS_OPTIONAL_ALTERNATIVE = STATE_ACTION___IS_OPTIONAL_ALTERNATIVE;

	/**
	 * The operation id for the '<em>Is Variability Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIND_ACTION___IS_VARIABILITY_SET = STATE_ACTION___IS_VARIABILITY_SET;

	/**
	 * The number of operations of the '<em>Bind Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIND_ACTION_OPERATION_COUNT = STATE_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.impl.OnActionImpl <em>On Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.impl.OnActionImpl
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.impl.StateChartsPackageImpl#getOnAction()
	 * @generated
	 */
	int ON_ACTION = 18;

	/**
	 * The feature id for the '<em><b>Alternative Values</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_ACTION__ALTERNATIVE_VALUES = STATE_ACTION__ALTERNATIVE_VALUES;

	/**
	 * The feature id for the '<em><b>Variability Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_ACTION__VARIABILITY_GROUP_ID = STATE_ACTION__VARIABILITY_GROUP_ID;

	/**
	 * The feature id for the '<em><b>Containing Models</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_ACTION__CONTAINING_MODELS = STATE_ACTION__CONTAINING_MODELS;

	/**
	 * The feature id for the '<em><b>Variability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_ACTION__VARIABILITY = STATE_ACTION__VARIABILITY;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_ACTION__ID = STATE_ACTION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_ACTION__CODE = STATE_ACTION__CODE;

	/**
	 * The feature id for the '<em><b>Temporal Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_ACTION__TEMPORAL_VALUE = STATE_ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Temporal Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_ACTION__TEMPORAL_OPERATOR = STATE_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>On Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_ACTION_FEATURE_COUNT = STATE_ACTION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Add Alternative Values Map</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_ACTION___ADD_ALTERNATIVE_VALUES_MAP__STRING = STATE_ACTION___ADD_ALTERNATIVE_VALUES_MAP__STRING;

	/**
	 * The operation id for the '<em>Is Contained In Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_ACTION___IS_CONTAINED_IN_MODEL__STRING = STATE_ACTION___IS_CONTAINED_IN_MODEL__STRING;

	/**
	 * The operation id for the '<em>Is Mandatory</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_ACTION___IS_MANDATORY = STATE_ACTION___IS_MANDATORY;

	/**
	 * The operation id for the '<em>Is Alternative</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_ACTION___IS_ALTERNATIVE = STATE_ACTION___IS_ALTERNATIVE;

	/**
	 * The operation id for the '<em>Is Optional</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_ACTION___IS_OPTIONAL = STATE_ACTION___IS_OPTIONAL;

	/**
	 * The operation id for the '<em>Is Optional Alternative</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_ACTION___IS_OPTIONAL_ALTERNATIVE = STATE_ACTION___IS_OPTIONAL_ALTERNATIVE;

	/**
	 * The operation id for the '<em>Is Variability Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_ACTION___IS_VARIABILITY_SET = STATE_ACTION___IS_VARIABILITY_SET;

	/**
	 * The number of operations of the '<em>On Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_ACTION_OPERATION_COUNT = STATE_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.impl.LabelActionImpl <em>Label Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.impl.LabelActionImpl
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.impl.StateChartsPackageImpl#getLabelAction()
	 * @generated
	 */
	int LABEL_ACTION = 19;

	/**
	 * The feature id for the '<em><b>Alternative Values</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_ACTION__ALTERNATIVE_VALUES = ACTION__ALTERNATIVE_VALUES;

	/**
	 * The feature id for the '<em><b>Variability Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_ACTION__VARIABILITY_GROUP_ID = ACTION__VARIABILITY_GROUP_ID;

	/**
	 * The feature id for the '<em><b>Containing Models</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_ACTION__CONTAINING_MODELS = ACTION__CONTAINING_MODELS;

	/**
	 * The feature id for the '<em><b>Variability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_ACTION__VARIABILITY = ACTION__VARIABILITY;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_ACTION__ID = ACTION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_ACTION__CODE = ACTION__CODE;

	/**
	 * The number of structural features of the '<em>Label Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Add Alternative Values Map</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_ACTION___ADD_ALTERNATIVE_VALUES_MAP__STRING = ACTION___ADD_ALTERNATIVE_VALUES_MAP__STRING;

	/**
	 * The operation id for the '<em>Is Contained In Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_ACTION___IS_CONTAINED_IN_MODEL__STRING = ACTION___IS_CONTAINED_IN_MODEL__STRING;

	/**
	 * The operation id for the '<em>Is Mandatory</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_ACTION___IS_MANDATORY = ACTION___IS_MANDATORY;

	/**
	 * The operation id for the '<em>Is Alternative</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_ACTION___IS_ALTERNATIVE = ACTION___IS_ALTERNATIVE;

	/**
	 * The operation id for the '<em>Is Optional</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_ACTION___IS_OPTIONAL = ACTION___IS_OPTIONAL;

	/**
	 * The operation id for the '<em>Is Optional Alternative</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_ACTION___IS_OPTIONAL_ALTERNATIVE = ACTION___IS_OPTIONAL_ALTERNATIVE;

	/**
	 * The operation id for the '<em>Is Variability Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_ACTION___IS_VARIABILITY_SET = ACTION___IS_VARIABILITY_SET;

	/**
	 * The number of operations of the '<em>Label Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_ACTION_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.impl.ConditionActionImpl <em>Condition Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.impl.ConditionActionImpl
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.impl.StateChartsPackageImpl#getConditionAction()
	 * @generated
	 */
	int CONDITION_ACTION = 20;

	/**
	 * The feature id for the '<em><b>Alternative Values</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ACTION__ALTERNATIVE_VALUES = LABEL_ACTION__ALTERNATIVE_VALUES;

	/**
	 * The feature id for the '<em><b>Variability Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ACTION__VARIABILITY_GROUP_ID = LABEL_ACTION__VARIABILITY_GROUP_ID;

	/**
	 * The feature id for the '<em><b>Containing Models</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ACTION__CONTAINING_MODELS = LABEL_ACTION__CONTAINING_MODELS;

	/**
	 * The feature id for the '<em><b>Variability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ACTION__VARIABILITY = LABEL_ACTION__VARIABILITY;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ACTION__ID = LABEL_ACTION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ACTION__CODE = LABEL_ACTION__CODE;

	/**
	 * The number of structural features of the '<em>Condition Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ACTION_FEATURE_COUNT = LABEL_ACTION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Add Alternative Values Map</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ACTION___ADD_ALTERNATIVE_VALUES_MAP__STRING = LABEL_ACTION___ADD_ALTERNATIVE_VALUES_MAP__STRING;

	/**
	 * The operation id for the '<em>Is Contained In Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ACTION___IS_CONTAINED_IN_MODEL__STRING = LABEL_ACTION___IS_CONTAINED_IN_MODEL__STRING;

	/**
	 * The operation id for the '<em>Is Mandatory</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ACTION___IS_MANDATORY = LABEL_ACTION___IS_MANDATORY;

	/**
	 * The operation id for the '<em>Is Alternative</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ACTION___IS_ALTERNATIVE = LABEL_ACTION___IS_ALTERNATIVE;

	/**
	 * The operation id for the '<em>Is Optional</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ACTION___IS_OPTIONAL = LABEL_ACTION___IS_OPTIONAL;

	/**
	 * The operation id for the '<em>Is Optional Alternative</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ACTION___IS_OPTIONAL_ALTERNATIVE = LABEL_ACTION___IS_OPTIONAL_ALTERNATIVE;

	/**
	 * The operation id for the '<em>Is Variability Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ACTION___IS_VARIABILITY_SET = LABEL_ACTION___IS_VARIABILITY_SET;

	/**
	 * The number of operations of the '<em>Condition Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ACTION_OPERATION_COUNT = LABEL_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.impl.TransitionActionImpl <em>Transition Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.impl.TransitionActionImpl
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.impl.StateChartsPackageImpl#getTransitionAction()
	 * @generated
	 */
	int TRANSITION_ACTION = 21;

	/**
	 * The feature id for the '<em><b>Alternative Values</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_ACTION__ALTERNATIVE_VALUES = LABEL_ACTION__ALTERNATIVE_VALUES;

	/**
	 * The feature id for the '<em><b>Variability Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_ACTION__VARIABILITY_GROUP_ID = LABEL_ACTION__VARIABILITY_GROUP_ID;

	/**
	 * The feature id for the '<em><b>Containing Models</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_ACTION__CONTAINING_MODELS = LABEL_ACTION__CONTAINING_MODELS;

	/**
	 * The feature id for the '<em><b>Variability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_ACTION__VARIABILITY = LABEL_ACTION__VARIABILITY;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_ACTION__ID = LABEL_ACTION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_ACTION__CODE = LABEL_ACTION__CODE;

	/**
	 * The number of structural features of the '<em>Transition Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_ACTION_FEATURE_COUNT = LABEL_ACTION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Add Alternative Values Map</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_ACTION___ADD_ALTERNATIVE_VALUES_MAP__STRING = LABEL_ACTION___ADD_ALTERNATIVE_VALUES_MAP__STRING;

	/**
	 * The operation id for the '<em>Is Contained In Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_ACTION___IS_CONTAINED_IN_MODEL__STRING = LABEL_ACTION___IS_CONTAINED_IN_MODEL__STRING;

	/**
	 * The operation id for the '<em>Is Mandatory</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_ACTION___IS_MANDATORY = LABEL_ACTION___IS_MANDATORY;

	/**
	 * The operation id for the '<em>Is Alternative</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_ACTION___IS_ALTERNATIVE = LABEL_ACTION___IS_ALTERNATIVE;

	/**
	 * The operation id for the '<em>Is Optional</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_ACTION___IS_OPTIONAL = LABEL_ACTION___IS_OPTIONAL;

	/**
	 * The operation id for the '<em>Is Optional Alternative</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_ACTION___IS_OPTIONAL_ALTERNATIVE = LABEL_ACTION___IS_OPTIONAL_ALTERNATIVE;

	/**
	 * The operation id for the '<em>Is Variability Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_ACTION___IS_VARIABILITY_SET = LABEL_ACTION___IS_VARIABILITY_SET;

	/**
	 * The number of operations of the '<em>Transition Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_ACTION_OPERATION_COUNT = LABEL_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.HistoryOperator <em>History Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.HistoryOperator
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.impl.StateChartsPackageImpl#getHistoryOperator()
	 * @generated
	 */
	int HISTORY_OPERATOR = 22;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.TemporalOperator <em>Temporal Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.TemporalOperator
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.impl.StateChartsPackageImpl#getTemporalOperator()
	 * @generated
	 */
	int TEMPORAL_OPERATOR = 23;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.TransitionType <em>Transition Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.TransitionType
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.impl.StateChartsPackageImpl#getTransitionType()
	 * @generated
	 */
	int TRANSITION_TYPE = 24;


	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.StateChart <em>State Chart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Chart</em>'.
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.StateChart
	 * @generated
	 */
	EClass getStateChart();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.StateChart#getStateCount <em>State Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State Count</em>'.
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.StateChart#getStateCount()
	 * @see #getStateChart()
	 * @generated
	 */
	EAttribute getStateChart_StateCount();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.StateChart#getRegionCount <em>Region Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Region Count</em>'.
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.StateChart#getRegionCount()
	 * @see #getStateChart()
	 * @generated
	 */
	EAttribute getStateChart_RegionCount();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.StateChart#getTransitionCount <em>Transition Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transition Count</em>'.
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.StateChart#getTransitionCount()
	 * @see #getStateChart()
	 * @generated
	 */
	EAttribute getStateChart_TransitionCount();

	/**
	 * Returns the meta object for the containment reference '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.StateChart#getRootRegion <em>Root Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Root Region</em>'.
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.StateChart#getRootRegion()
	 * @see #getStateChart()
	 * @generated
	 */
	EReference getStateChart_RootRegion();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.AbstractState <em>Abstract State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract State</em>'.
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.AbstractState
	 * @generated
	 */
	EClass getAbstractState();

	/**
	 * Returns the meta object for the reference '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.AbstractState#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.AbstractState#getParent()
	 * @see #getAbstractState()
	 * @generated
	 */
	EReference getAbstractState_Parent();

	/**
	 * Returns the meta object for the attribute list '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.AbstractState#getStereotypes <em>Stereotypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Stereotypes</em>'.
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.AbstractState#getStereotypes()
	 * @see #getAbstractState()
	 * @generated
	 */
	EAttribute getAbstractState_Stereotypes();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.AbstractState#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.AbstractState#getName()
	 * @see #getAbstractState()
	 * @generated
	 */
	EAttribute getAbstractState_Name();

	/**
	 * Returns the meta object for the '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.AbstractState#isHierarchical() <em>Is Hierarchical</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Hierarchical</em>' operation.
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.AbstractState#isHierarchical()
	 * @generated
	 */
	EOperation getAbstractState__IsHierarchical();

	/**
	 * Returns the meta object for the '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.AbstractState#isParallel() <em>Is Parallel</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Parallel</em>' operation.
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.AbstractState#isParallel()
	 * @generated
	 */
	EOperation getAbstractState__IsParallel();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.InitialState <em>Initial State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initial State</em>'.
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.InitialState
	 * @generated
	 */
	EClass getInitialState();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.EndState <em>End State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End State</em>'.
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.EndState
	 * @generated
	 */
	EClass getEndState();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.FinalState <em>Final State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Final State</em>'.
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.FinalState
	 * @generated
	 */
	EClass getFinalState();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.TerminationConnector <em>Termination Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Termination Connector</em>'.
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.TerminationConnector
	 * @generated
	 */
	EClass getTerminationConnector();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.IncomingState <em>Incoming State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Incoming State</em>'.
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.IncomingState
	 * @generated
	 */
	EClass getIncomingState();

	/**
	 * Returns the meta object for the containment reference list '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.IncomingState#getIncomingTransitions <em>Incoming Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Incoming Transitions</em>'.
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.IncomingState#getIncomingTransitions()
	 * @see #getIncomingState()
	 * @generated
	 */
	EReference getIncomingState_IncomingTransitions();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.OutgoingState <em>Outgoing State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Outgoing State</em>'.
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.OutgoingState
	 * @generated
	 */
	EClass getOutgoingState();

	/**
	 * Returns the meta object for the reference list '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.OutgoingState#getOutgoingTransitions <em>Outgoing Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing Transitions</em>'.
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.OutgoingState#getOutgoingTransitions()
	 * @see #getOutgoingState()
	 * @generated
	 */
	EReference getOutgoingState_OutgoingTransitions();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.State#getHistory <em>History</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>History</em>'.
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.State#getHistory()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_History();

	/**
	 * Returns the meta object for the containment reference list '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.State#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.State#getActions()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Actions();

	/**
	 * Returns the meta object for the containment reference list '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.State#getRegions <em>Regions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Regions</em>'.
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.State#getRegions()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Regions();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.Region <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Region</em>'.
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.Region
	 * @generated
	 */
	EClass getRegion();

	/**
	 * Returns the meta object for the reference '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.Region#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.Region#getParent()
	 * @see #getRegion()
	 * @generated
	 */
	EReference getRegion_Parent();

	/**
	 * Returns the meta object for the containment reference list '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.Region#getInitialStates <em>Initial States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Initial States</em>'.
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.Region#getInitialStates()
	 * @see #getRegion()
	 * @generated
	 */
	EReference getRegion_InitialStates();

	/**
	 * Returns the meta object for the containment reference list '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.Region#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>States</em>'.
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.Region#getStates()
	 * @see #getRegion()
	 * @generated
	 */
	EReference getRegion_States();

	/**
	 * Returns the meta object for the containment reference list '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.Region#getEndStates <em>End States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>End States</em>'.
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.Region#getEndStates()
	 * @see #getRegion()
	 * @generated
	 */
	EReference getRegion_EndStates();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.Region#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.Region#getName()
	 * @see #getRegion()
	 * @generated
	 */
	EAttribute getRegion_Name();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.Transition#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.Transition#getPriority()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Priority();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.Transition#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.Transition#getType()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Type();

	/**
	 * Returns the meta object for the attribute list '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.Transition#getStereotypes <em>Stereotypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Stereotypes</em>'.
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.Transition#getStereotypes()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Stereotypes();

	/**
	 * Returns the meta object for the reference '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.Transition#getSource()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Source();

	/**
	 * Returns the meta object for the reference '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.Transition#getTarget()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Target();

	/**
	 * Returns the meta object for the containment reference '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.Transition#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Label</em>'.
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.Transition#getLabel()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Label();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.Transition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.Transition#getName()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Name();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.TransitionLabel <em>Transition Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition Label</em>'.
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.TransitionLabel
	 * @generated
	 */
	EClass getTransitionLabel();

	/**
	 * Returns the meta object for the attribute list '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.TransitionLabel#getEvents <em>Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Events</em>'.
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.TransitionLabel#getEvents()
	 * @see #getTransitionLabel()
	 * @generated
	 */
	EAttribute getTransitionLabel_Events();

	/**
	 * Returns the meta object for the attribute list '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.TransitionLabel#getConditions <em>Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Conditions</em>'.
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.TransitionLabel#getConditions()
	 * @see #getTransitionLabel()
	 * @generated
	 */
	EAttribute getTransitionLabel_Conditions();

	/**
	 * Returns the meta object for the containment reference list '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.TransitionLabel#getConditionActions <em>Condition Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Condition Actions</em>'.
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.TransitionLabel#getConditionActions()
	 * @see #getTransitionLabel()
	 * @generated
	 */
	EReference getTransitionLabel_ConditionActions();

	/**
	 * Returns the meta object for the containment reference list '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.TransitionLabel#getTransitionActions <em>Transition Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transition Actions</em>'.
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.TransitionLabel#getTransitionActions()
	 * @see #getTransitionLabel()
	 * @generated
	 */
	EReference getTransitionLabel_TransitionActions();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.Action#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.Action#getCode()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Code();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.StateAction <em>State Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Action</em>'.
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.StateAction
	 * @generated
	 */
	EClass getStateAction();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.EntryAction <em>Entry Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entry Action</em>'.
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.EntryAction
	 * @generated
	 */
	EClass getEntryAction();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.ExitAction <em>Exit Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exit Action</em>'.
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.ExitAction
	 * @generated
	 */
	EClass getExitAction();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.DuringAction <em>During Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>During Action</em>'.
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.DuringAction
	 * @generated
	 */
	EClass getDuringAction();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.BindAction <em>Bind Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bind Action</em>'.
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.BindAction
	 * @generated
	 */
	EClass getBindAction();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.OnAction <em>On Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>On Action</em>'.
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.OnAction
	 * @generated
	 */
	EClass getOnAction();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.OnAction#getTemporalValue <em>Temporal Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Temporal Value</em>'.
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.OnAction#getTemporalValue()
	 * @see #getOnAction()
	 * @generated
	 */
	EAttribute getOnAction_TemporalValue();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.OnAction#getTemporalOperator <em>Temporal Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Temporal Operator</em>'.
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.OnAction#getTemporalOperator()
	 * @see #getOnAction()
	 * @generated
	 */
	EAttribute getOnAction_TemporalOperator();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.LabelAction <em>Label Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label Action</em>'.
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.LabelAction
	 * @generated
	 */
	EClass getLabelAction();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.ConditionAction <em>Condition Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition Action</em>'.
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.ConditionAction
	 * @generated
	 */
	EClass getConditionAction();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.TransitionAction <em>Transition Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition Action</em>'.
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.TransitionAction
	 * @generated
	 */
	EClass getTransitionAction();

	/**
	 * Returns the meta object for enum '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.HistoryOperator <em>History Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>History Operator</em>'.
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.HistoryOperator
	 * @generated
	 */
	EEnum getHistoryOperator();

	/**
	 * Returns the meta object for enum '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.TemporalOperator <em>Temporal Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Temporal Operator</em>'.
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.TemporalOperator
	 * @generated
	 */
	EEnum getTemporalOperator();

	/**
	 * Returns the meta object for enum '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.TransitionType <em>Transition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Transition Type</em>'.
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.TransitionType
	 * @generated
	 */
	EEnum getTransitionType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StateChartsFactory getStateChartsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.impl.StateChartImpl <em>State Chart</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.impl.StateChartImpl
		 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.impl.StateChartsPackageImpl#getStateChart()
		 * @generated
		 */
		EClass STATE_CHART = eINSTANCE.getStateChart();

		/**
		 * The meta object literal for the '<em><b>State Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE_CHART__STATE_COUNT = eINSTANCE.getStateChart_StateCount();

		/**
		 * The meta object literal for the '<em><b>Region Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE_CHART__REGION_COUNT = eINSTANCE.getStateChart_RegionCount();

		/**
		 * The meta object literal for the '<em><b>Transition Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE_CHART__TRANSITION_COUNT = eINSTANCE.getStateChart_TransitionCount();

		/**
		 * The meta object literal for the '<em><b>Root Region</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_CHART__ROOT_REGION = eINSTANCE.getStateChart_RootRegion();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.impl.AbstractStateImpl <em>Abstract State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.impl.AbstractStateImpl
		 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.impl.StateChartsPackageImpl#getAbstractState()
		 * @generated
		 */
		EClass ABSTRACT_STATE = eINSTANCE.getAbstractState();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_STATE__PARENT = eINSTANCE.getAbstractState_Parent();

		/**
		 * The meta object literal for the '<em><b>Stereotypes</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_STATE__STEREOTYPES = eINSTANCE.getAbstractState_Stereotypes();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_STATE__NAME = eINSTANCE.getAbstractState_Name();

		/**
		 * The meta object literal for the '<em><b>Is Hierarchical</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_STATE___IS_HIERARCHICAL = eINSTANCE.getAbstractState__IsHierarchical();

		/**
		 * The meta object literal for the '<em><b>Is Parallel</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_STATE___IS_PARALLEL = eINSTANCE.getAbstractState__IsParallel();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.impl.InitialStateImpl <em>Initial State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.impl.InitialStateImpl
		 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.impl.StateChartsPackageImpl#getInitialState()
		 * @generated
		 */
		EClass INITIAL_STATE = eINSTANCE.getInitialState();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.impl.EndStateImpl <em>End State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.impl.EndStateImpl
		 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.impl.StateChartsPackageImpl#getEndState()
		 * @generated
		 */
		EClass END_STATE = eINSTANCE.getEndState();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.impl.FinalStateImpl <em>Final State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.impl.FinalStateImpl
		 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.impl.StateChartsPackageImpl#getFinalState()
		 * @generated
		 */
		EClass FINAL_STATE = eINSTANCE.getFinalState();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.impl.TerminationConnectorImpl <em>Termination Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.impl.TerminationConnectorImpl
		 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.impl.StateChartsPackageImpl#getTerminationConnector()
		 * @generated
		 */
		EClass TERMINATION_CONNECTOR = eINSTANCE.getTerminationConnector();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.impl.IncomingStateImpl <em>Incoming State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.impl.IncomingStateImpl
		 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.impl.StateChartsPackageImpl#getIncomingState()
		 * @generated
		 */
		EClass INCOMING_STATE = eINSTANCE.getIncomingState();

		/**
		 * The meta object literal for the '<em><b>Incoming Transitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INCOMING_STATE__INCOMING_TRANSITIONS = eINSTANCE.getIncomingState_IncomingTransitions();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.impl.OutgoingStateImpl <em>Outgoing State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.impl.OutgoingStateImpl
		 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.impl.StateChartsPackageImpl#getOutgoingState()
		 * @generated
		 */
		EClass OUTGOING_STATE = eINSTANCE.getOutgoingState();

		/**
		 * The meta object literal for the '<em><b>Outgoing Transitions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTGOING_STATE__OUTGOING_TRANSITIONS = eINSTANCE.getOutgoingState_OutgoingTransitions();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.impl.StateImpl
		 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.impl.StateChartsPackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>History</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__HISTORY = eINSTANCE.getState_History();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__ACTIONS = eINSTANCE.getState_Actions();

		/**
		 * The meta object literal for the '<em><b>Regions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__REGIONS = eINSTANCE.getState_Regions();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.impl.RegionImpl <em>Region</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.impl.RegionImpl
		 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.impl.StateChartsPackageImpl#getRegion()
		 * @generated
		 */
		EClass REGION = eINSTANCE.getRegion();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGION__PARENT = eINSTANCE.getRegion_Parent();

		/**
		 * The meta object literal for the '<em><b>Initial States</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGION__INITIAL_STATES = eINSTANCE.getRegion_InitialStates();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGION__STATES = eINSTANCE.getRegion_States();

		/**
		 * The meta object literal for the '<em><b>End States</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGION__END_STATES = eINSTANCE.getRegion_EndStates();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGION__NAME = eINSTANCE.getRegion_Name();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.impl.TransitionImpl
		 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.impl.StateChartsPackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__PRIORITY = eINSTANCE.getTransition_Priority();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__TYPE = eINSTANCE.getTransition_Type();

		/**
		 * The meta object literal for the '<em><b>Stereotypes</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__STEREOTYPES = eINSTANCE.getTransition_Stereotypes();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__SOURCE = eINSTANCE.getTransition_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__TARGET = eINSTANCE.getTransition_Target();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__LABEL = eINSTANCE.getTransition_Label();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__NAME = eINSTANCE.getTransition_Name();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.impl.TransitionLabelImpl <em>Transition Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.impl.TransitionLabelImpl
		 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.impl.StateChartsPackageImpl#getTransitionLabel()
		 * @generated
		 */
		EClass TRANSITION_LABEL = eINSTANCE.getTransitionLabel();

		/**
		 * The meta object literal for the '<em><b>Events</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION_LABEL__EVENTS = eINSTANCE.getTransitionLabel_Events();

		/**
		 * The meta object literal for the '<em><b>Conditions</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION_LABEL__CONDITIONS = eINSTANCE.getTransitionLabel_Conditions();

		/**
		 * The meta object literal for the '<em><b>Condition Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION_LABEL__CONDITION_ACTIONS = eINSTANCE.getTransitionLabel_ConditionActions();

		/**
		 * The meta object literal for the '<em><b>Transition Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION_LABEL__TRANSITION_ACTIONS = eINSTANCE.getTransitionLabel_TransitionActions();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.impl.ActionImpl
		 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.impl.StateChartsPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__CODE = eINSTANCE.getAction_Code();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.impl.StateActionImpl <em>State Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.impl.StateActionImpl
		 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.impl.StateChartsPackageImpl#getStateAction()
		 * @generated
		 */
		EClass STATE_ACTION = eINSTANCE.getStateAction();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.impl.EntryActionImpl <em>Entry Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.impl.EntryActionImpl
		 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.impl.StateChartsPackageImpl#getEntryAction()
		 * @generated
		 */
		EClass ENTRY_ACTION = eINSTANCE.getEntryAction();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.impl.ExitActionImpl <em>Exit Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.impl.ExitActionImpl
		 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.impl.StateChartsPackageImpl#getExitAction()
		 * @generated
		 */
		EClass EXIT_ACTION = eINSTANCE.getExitAction();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.impl.DuringActionImpl <em>During Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.impl.DuringActionImpl
		 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.impl.StateChartsPackageImpl#getDuringAction()
		 * @generated
		 */
		EClass DURING_ACTION = eINSTANCE.getDuringAction();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.impl.BindActionImpl <em>Bind Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.impl.BindActionImpl
		 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.impl.StateChartsPackageImpl#getBindAction()
		 * @generated
		 */
		EClass BIND_ACTION = eINSTANCE.getBindAction();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.impl.OnActionImpl <em>On Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.impl.OnActionImpl
		 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.impl.StateChartsPackageImpl#getOnAction()
		 * @generated
		 */
		EClass ON_ACTION = eINSTANCE.getOnAction();

		/**
		 * The meta object literal for the '<em><b>Temporal Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ON_ACTION__TEMPORAL_VALUE = eINSTANCE.getOnAction_TemporalValue();

		/**
		 * The meta object literal for the '<em><b>Temporal Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ON_ACTION__TEMPORAL_OPERATOR = eINSTANCE.getOnAction_TemporalOperator();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.impl.LabelActionImpl <em>Label Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.impl.LabelActionImpl
		 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.impl.StateChartsPackageImpl#getLabelAction()
		 * @generated
		 */
		EClass LABEL_ACTION = eINSTANCE.getLabelAction();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.impl.ConditionActionImpl <em>Condition Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.impl.ConditionActionImpl
		 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.impl.StateChartsPackageImpl#getConditionAction()
		 * @generated
		 */
		EClass CONDITION_ACTION = eINSTANCE.getConditionAction();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.impl.TransitionActionImpl <em>Transition Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.impl.TransitionActionImpl
		 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.impl.StateChartsPackageImpl#getTransitionAction()
		 * @generated
		 */
		EClass TRANSITION_ACTION = eINSTANCE.getTransitionAction();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.HistoryOperator <em>History Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.HistoryOperator
		 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.impl.StateChartsPackageImpl#getHistoryOperator()
		 * @generated
		 */
		EEnum HISTORY_OPERATOR = eINSTANCE.getHistoryOperator();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.TemporalOperator <em>Temporal Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.TemporalOperator
		 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.impl.StateChartsPackageImpl#getTemporalOperator()
		 * @generated
		 */
		EEnum TEMPORAL_OPERATOR = eINSTANCE.getTemporalOperator();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.TransitionType <em>Transition Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.TransitionType
		 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.impl.StateChartsPackageImpl#getTransitionType()
		 * @generated
		 */
		EEnum TRANSITION_TYPE = eINSTANCE.getTransitionType();

	}

} //StateChartsPackage
