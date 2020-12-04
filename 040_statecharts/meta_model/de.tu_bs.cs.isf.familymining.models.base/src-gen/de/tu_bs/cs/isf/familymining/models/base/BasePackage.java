/**
 */
package de.tu_bs.cs.isf.familymining.models.base;

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
 * @see de.tu_bs.cs.isf.familymining.models.base.BaseFactory
 * @model kind="package"
 * @generated
 */
public interface BasePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "base";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.tu-braunschweig.de/isf/familymining/base";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "base";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BasePackage eINSTANCE = de.tu_bs.cs.isf.familymining.models.base.impl.BasePackageImpl.init();

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.familymining.models.base.impl.StringToStringMapEntryImpl <em>String To String Map Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.familymining.models.base.impl.StringToStringMapEntryImpl
	 * @see de.tu_bs.cs.isf.familymining.models.base.impl.BasePackageImpl#getStringToStringMapEntry()
	 * @generated
	 */
	int STRING_TO_STRING_MAP_ENTRY = 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_STRING_MAP_ENTRY__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_STRING_MAP_ENTRY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>String To String Map Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_STRING_MAP_ENTRY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>String To String Map Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_STRING_MAP_ENTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.familymining.models.base.impl.EStructuralFeatureToWrappedTypeMapEntryImpl <em>EStructural Feature To Wrapped Type Map Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.familymining.models.base.impl.EStructuralFeatureToWrappedTypeMapEntryImpl
	 * @see de.tu_bs.cs.isf.familymining.models.base.impl.BasePackageImpl#getEStructuralFeatureToWrappedTypeMapEntry()
	 * @generated
	 */
	int ESTRUCTURAL_FEATURE_TO_WRAPPED_TYPE_MAP_ENTRY = 1;

	/**
	 * The feature id for the '<em><b>Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE_TO_WRAPPED_TYPE_MAP_ENTRY__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE_TO_WRAPPED_TYPE_MAP_ENTRY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>EStructural Feature To Wrapped Type Map Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE_TO_WRAPPED_TYPE_MAP_ENTRY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>EStructural Feature To Wrapped Type Map Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE_TO_WRAPPED_TYPE_MAP_ENTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.familymining.models.base.impl.StringToAlternativeValuesMapImpl <em>String To Alternative Values Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.familymining.models.base.impl.StringToAlternativeValuesMapImpl
	 * @see de.tu_bs.cs.isf.familymining.models.base.impl.BasePackageImpl#getStringToAlternativeValuesMap()
	 * @generated
	 */
	int STRING_TO_ALTERNATIVE_VALUES_MAP = 2;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_ALTERNATIVE_VALUES_MAP__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_ALTERNATIVE_VALUES_MAP__VALUE = 1;

	/**
	 * The number of structural features of the '<em>String To Alternative Values Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_ALTERNATIVE_VALUES_MAP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>String To Alternative Values Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_ALTERNATIVE_VALUES_MAP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.familymining.models.base.impl.ParameterizedElementImpl <em>Parameterized Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.familymining.models.base.impl.ParameterizedElementImpl
	 * @see de.tu_bs.cs.isf.familymining.models.base.impl.BasePackageImpl#getParameterizedElement()
	 * @generated
	 */
	int PARAMETERIZED_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_ELEMENT__PARAMETERS = 0;

	/**
	 * The number of structural features of the '<em>Parameterized Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Set Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_ELEMENT___SET_PARAMETER__STRING_STRING = 0;

	/**
	 * The operation id for the '<em>Get Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_ELEMENT___GET_PARAMETER__STRING = 1;

	/**
	 * The operation id for the '<em>Remove Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_ELEMENT___REMOVE_PARAMETER__STRING = 2;

	/**
	 * The operation id for the '<em>Contains Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_ELEMENT___CONTAINS_PARAMETER__STRING = 3;

	/**
	 * The number of operations of the '<em>Parameterized Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_ELEMENT_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.familymining.models.base.impl.VariableValueElementImpl <em>Variable Value Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.familymining.models.base.impl.VariableValueElementImpl
	 * @see de.tu_bs.cs.isf.familymining.models.base.impl.BasePackageImpl#getVariableValueElement()
	 * @generated
	 */
	int VARIABLE_VALUE_ELEMENT = 4;

	/**
	 * The feature id for the '<em><b>Alternative Values</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_VALUE_ELEMENT__ALTERNATIVE_VALUES = 0;

	/**
	 * The number of structural features of the '<em>Variable Value Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_VALUE_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Add Alternative Values Map</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_VALUE_ELEMENT___ADD_ALTERNATIVE_VALUES_MAP__STRING = 0;

	/**
	 * The number of operations of the '<em>Variable Value Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_VALUE_ELEMENT_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.familymining.models.base.impl.VariableModelImpl <em>Variable Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.familymining.models.base.impl.VariableModelImpl
	 * @see de.tu_bs.cs.isf.familymining.models.base.impl.BasePackageImpl#getVariableModel()
	 * @generated
	 */
	int VARIABLE_MODEL = 5;

	/**
	 * The feature id for the '<em><b>Alternative Values</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_MODEL__ALTERNATIVE_VALUES = VARIABLE_VALUE_ELEMENT__ALTERNATIVE_VALUES;

	/**
	 * The feature id for the '<em><b>Base Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_MODEL__BASE_MODEL = VARIABLE_VALUE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Compare Models</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_MODEL__COMPARE_MODELS = VARIABLE_VALUE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Containing Models</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_MODEL__CONTAINING_MODELS = VARIABLE_VALUE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Variable Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_MODEL_FEATURE_COUNT = VARIABLE_VALUE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Add Alternative Values Map</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_MODEL___ADD_ALTERNATIVE_VALUES_MAP__STRING = VARIABLE_VALUE_ELEMENT___ADD_ALTERNATIVE_VALUES_MAP__STRING;

	/**
	 * The number of operations of the '<em>Variable Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_MODEL_OPERATION_COUNT = VARIABLE_VALUE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.familymining.models.base.impl.VariableElementImpl <em>Variable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.familymining.models.base.impl.VariableElementImpl
	 * @see de.tu_bs.cs.isf.familymining.models.base.impl.BasePackageImpl#getVariableElement()
	 * @generated
	 */
	int VARIABLE_ELEMENT = 6;

	/**
	 * The feature id for the '<em><b>Alternative Values</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ELEMENT__ALTERNATIVE_VALUES = VARIABLE_VALUE_ELEMENT__ALTERNATIVE_VALUES;

	/**
	 * The feature id for the '<em><b>Variability Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ELEMENT__VARIABILITY_GROUP_ID = VARIABLE_VALUE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Containing Models</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ELEMENT__CONTAINING_MODELS = VARIABLE_VALUE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Related Variability Group Ids</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ELEMENT__RELATED_VARIABILITY_GROUP_IDS = VARIABLE_VALUE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Variability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ELEMENT__VARIABILITY = VARIABLE_VALUE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Variable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ELEMENT_FEATURE_COUNT = VARIABLE_VALUE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Add Alternative Values Map</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ELEMENT___ADD_ALTERNATIVE_VALUES_MAP__STRING = VARIABLE_VALUE_ELEMENT___ADD_ALTERNATIVE_VALUES_MAP__STRING;

	/**
	 * The operation id for the '<em>Is Contained In Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ELEMENT___IS_CONTAINED_IN_MODEL__STRING = VARIABLE_VALUE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Mandatory</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ELEMENT___IS_MANDATORY = VARIABLE_VALUE_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Alternative</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ELEMENT___IS_ALTERNATIVE = VARIABLE_VALUE_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Is Optional</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ELEMENT___IS_OPTIONAL = VARIABLE_VALUE_ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Optional Alternative</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ELEMENT___IS_OPTIONAL_ALTERNATIVE = VARIABLE_VALUE_ELEMENT_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Is Variability Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ELEMENT___IS_VARIABILITY_SET = VARIABLE_VALUE_ELEMENT_OPERATION_COUNT + 5;

	/**
	 * The number of operations of the '<em>Variable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ELEMENT_OPERATION_COUNT = VARIABLE_VALUE_ELEMENT_OPERATION_COUNT + 6;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.familymining.models.base.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.familymining.models.base.impl.EntityImpl
	 * @see de.tu_bs.cs.isf.familymining.models.base.impl.BasePackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ID = 0;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.familymining.models.base.impl.ModelEntityImpl <em>Model Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.familymining.models.base.impl.ModelEntityImpl
	 * @see de.tu_bs.cs.isf.familymining.models.base.impl.BasePackageImpl#getModelEntity()
	 * @generated
	 */
	int MODEL_ENTITY = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ENTITY__ID = ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Alternative Values</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ENTITY__ALTERNATIVE_VALUES = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Base Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ENTITY__BASE_MODEL = ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Compare Models</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ENTITY__COMPARE_MODELS = ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Containing Models</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ENTITY__CONTAINING_MODELS = ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ENTITY__NAME = ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Model Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ENTITY_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Add Alternative Values Map</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ENTITY___ADD_ALTERNATIVE_VALUES_MAP__STRING = ENTITY_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Model File Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ENTITY___GET_MODEL_FILE_EXTENSION = ENTITY_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Model Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ENTITY_OPERATION_COUNT = ENTITY_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.familymining.models.base.impl.ContainerEntityImpl <em>Container Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.familymining.models.base.impl.ContainerEntityImpl
	 * @see de.tu_bs.cs.isf.familymining.models.base.impl.BasePackageImpl#getContainerEntity()
	 * @generated
	 */
	int CONTAINER_ENTITY = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ENTITY__ID = ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Alternative Values</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ENTITY__ALTERNATIVE_VALUES = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Variability Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ENTITY__VARIABILITY_GROUP_ID = ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Containing Models</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ENTITY__CONTAINING_MODELS = ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Related Variability Group Ids</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ENTITY__RELATED_VARIABILITY_GROUP_IDS = ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Variability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ENTITY__VARIABILITY = ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Container Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ENTITY_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Add Alternative Values Map</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ENTITY___ADD_ALTERNATIVE_VALUES_MAP__STRING = ENTITY_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Contained In Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ENTITY___IS_CONTAINED_IN_MODEL__STRING = ENTITY_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Mandatory</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ENTITY___IS_MANDATORY = ENTITY_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Is Alternative</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ENTITY___IS_ALTERNATIVE = ENTITY_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Optional</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ENTITY___IS_OPTIONAL = ENTITY_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Is Optional Alternative</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ENTITY___IS_OPTIONAL_ALTERNATIVE = ENTITY_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Variability Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ENTITY___IS_VARIABILITY_SET = ENTITY_OPERATION_COUNT + 6;

	/**
	 * The number of operations of the '<em>Container Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ENTITY_OPERATION_COUNT = ENTITY_OPERATION_COUNT + 7;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.familymining.models.base.impl.NodeEntityImpl <em>Node Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.familymining.models.base.impl.NodeEntityImpl
	 * @see de.tu_bs.cs.isf.familymining.models.base.impl.BasePackageImpl#getNodeEntity()
	 * @generated
	 */
	int NODE_ENTITY = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ENTITY__ID = ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Alternative Values</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ENTITY__ALTERNATIVE_VALUES = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Variability Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ENTITY__VARIABILITY_GROUP_ID = ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Containing Models</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ENTITY__CONTAINING_MODELS = ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Related Variability Group Ids</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ENTITY__RELATED_VARIABILITY_GROUP_IDS = ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Variability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ENTITY__VARIABILITY = ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Node Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ENTITY_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Add Alternative Values Map</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ENTITY___ADD_ALTERNATIVE_VALUES_MAP__STRING = ENTITY_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Contained In Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ENTITY___IS_CONTAINED_IN_MODEL__STRING = ENTITY_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Mandatory</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ENTITY___IS_MANDATORY = ENTITY_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Is Alternative</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ENTITY___IS_ALTERNATIVE = ENTITY_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Optional</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ENTITY___IS_OPTIONAL = ENTITY_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Is Optional Alternative</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ENTITY___IS_OPTIONAL_ALTERNATIVE = ENTITY_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Variability Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ENTITY___IS_VARIABILITY_SET = ENTITY_OPERATION_COUNT + 6;

	/**
	 * The number of operations of the '<em>Node Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ENTITY_OPERATION_COUNT = ENTITY_OPERATION_COUNT + 7;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.familymining.models.base.impl.EdgeEntityImpl <em>Edge Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.familymining.models.base.impl.EdgeEntityImpl
	 * @see de.tu_bs.cs.isf.familymining.models.base.impl.BasePackageImpl#getEdgeEntity()
	 * @generated
	 */
	int EDGE_ENTITY = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_ENTITY__ID = ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Alternative Values</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_ENTITY__ALTERNATIVE_VALUES = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Variability Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_ENTITY__VARIABILITY_GROUP_ID = ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Containing Models</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_ENTITY__CONTAINING_MODELS = ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Related Variability Group Ids</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_ENTITY__RELATED_VARIABILITY_GROUP_IDS = ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Variability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_ENTITY__VARIABILITY = ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Edge Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_ENTITY_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Add Alternative Values Map</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_ENTITY___ADD_ALTERNATIVE_VALUES_MAP__STRING = ENTITY_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Contained In Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_ENTITY___IS_CONTAINED_IN_MODEL__STRING = ENTITY_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Mandatory</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_ENTITY___IS_MANDATORY = ENTITY_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Is Alternative</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_ENTITY___IS_ALTERNATIVE = ENTITY_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Optional</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_ENTITY___IS_OPTIONAL = ENTITY_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Is Optional Alternative</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_ENTITY___IS_OPTIONAL_ALTERNATIVE = ENTITY_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Variability Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_ENTITY___IS_VARIABILITY_SET = ENTITY_OPERATION_COUNT + 6;

	/**
	 * The number of operations of the '<em>Edge Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_ENTITY_OPERATION_COUNT = ENTITY_OPERATION_COUNT + 7;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.familymining.models.base.impl.WrappedTypeImpl <em>Wrapped Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.familymining.models.base.impl.WrappedTypeImpl
	 * @see de.tu_bs.cs.isf.familymining.models.base.impl.BasePackageImpl#getWrappedType()
	 * @generated
	 */
	int WRAPPED_TYPE = 12;

	/**
	 * The number of structural features of the '<em>Wrapped Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRAPPED_TYPE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Wrapped Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRAPPED_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.familymining.models.base.impl.WrappedStringImpl <em>Wrapped String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.familymining.models.base.impl.WrappedStringImpl
	 * @see de.tu_bs.cs.isf.familymining.models.base.impl.BasePackageImpl#getWrappedString()
	 * @generated
	 */
	int WRAPPED_STRING = 13;

	/**
	 * The feature id for the '<em><b>Wrapped String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRAPPED_STRING__WRAPPED_STRING = WRAPPED_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Wrapped String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRAPPED_STRING_FEATURE_COUNT = WRAPPED_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Wrapped String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRAPPED_STRING_OPERATION_COUNT = WRAPPED_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.familymining.models.base.impl.WrappedEObjectImpl <em>Wrapped EObject</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.familymining.models.base.impl.WrappedEObjectImpl
	 * @see de.tu_bs.cs.isf.familymining.models.base.impl.BasePackageImpl#getWrappedEObject()
	 * @generated
	 */
	int WRAPPED_EOBJECT = 14;

	/**
	 * The feature id for the '<em><b>Wrapped EObject</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRAPPED_EOBJECT__WRAPPED_EOBJECT = WRAPPED_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Wrapped EObject</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRAPPED_EOBJECT_FEATURE_COUNT = WRAPPED_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Wrapped EObject</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRAPPED_EOBJECT_OPERATION_COUNT = WRAPPED_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.familymining.models.base.Variability <em>Variability</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.familymining.models.base.Variability
	 * @see de.tu_bs.cs.isf.familymining.models.base.impl.BasePackageImpl#getVariability()
	 * @generated
	 */
	int VARIABILITY = 15;


	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>String To String Map Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String To String Map Entry</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueDataType="org.eclipse.emf.ecore.EString"
	 * @generated
	 */
	EClass getStringToStringMapEntry();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToStringMapEntry()
	 * @generated
	 */
	EAttribute getStringToStringMapEntry_Key();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToStringMapEntry()
	 * @generated
	 */
	EAttribute getStringToStringMapEntry_Value();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>EStructural Feature To Wrapped Type Map Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EStructural Feature To Wrapped Type Map Entry</em>'.
	 * @see java.util.Map.Entry
	 * @model keyType="org.eclipse.emf.ecore.EStructuralFeature"
	 *        valueType="de.tu_bs.cs.isf.familymining.models.base.WrappedType" valueContainment="true"
	 * @generated
	 */
	EClass getEStructuralFeatureToWrappedTypeMapEntry();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getEStructuralFeatureToWrappedTypeMapEntry()
	 * @generated
	 */
	EReference getEStructuralFeatureToWrappedTypeMapEntry_Key();

	/**
	 * Returns the meta object for the containment reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getEStructuralFeatureToWrappedTypeMapEntry()
	 * @generated
	 */
	EReference getEStructuralFeatureToWrappedTypeMapEntry_Value();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>String To Alternative Values Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String To Alternative Values Map</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueMapType="de.tu_bs.cs.isf.familymining.models.base.EStructuralFeatureToWrappedTypeMapEntry<org.eclipse.emf.ecore.EStructuralFeature, de.tu_bs.cs.isf.familymining.models.base.WrappedType>"
	 * @generated
	 */
	EClass getStringToAlternativeValuesMap();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToAlternativeValuesMap()
	 * @generated
	 */
	EAttribute getStringToAlternativeValuesMap_Key();

	/**
	 * Returns the meta object for the map '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToAlternativeValuesMap()
	 * @generated
	 */
	EReference getStringToAlternativeValuesMap_Value();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.familymining.models.base.ParameterizedElement <em>Parameterized Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameterized Element</em>'.
	 * @see de.tu_bs.cs.isf.familymining.models.base.ParameterizedElement
	 * @generated
	 */
	EClass getParameterizedElement();

	/**
	 * Returns the meta object for the map '{@link de.tu_bs.cs.isf.familymining.models.base.ParameterizedElement#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Parameters</em>'.
	 * @see de.tu_bs.cs.isf.familymining.models.base.ParameterizedElement#getParameters()
	 * @see #getParameterizedElement()
	 * @generated
	 */
	EReference getParameterizedElement_Parameters();

	/**
	 * Returns the meta object for the '{@link de.tu_bs.cs.isf.familymining.models.base.ParameterizedElement#setParameter(java.lang.String, java.lang.String) <em>Set Parameter</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Parameter</em>' operation.
	 * @see de.tu_bs.cs.isf.familymining.models.base.ParameterizedElement#setParameter(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getParameterizedElement__SetParameter__String_String();

	/**
	 * Returns the meta object for the '{@link de.tu_bs.cs.isf.familymining.models.base.ParameterizedElement#getParameter(java.lang.String) <em>Get Parameter</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Parameter</em>' operation.
	 * @see de.tu_bs.cs.isf.familymining.models.base.ParameterizedElement#getParameter(java.lang.String)
	 * @generated
	 */
	EOperation getParameterizedElement__GetParameter__String();

	/**
	 * Returns the meta object for the '{@link de.tu_bs.cs.isf.familymining.models.base.ParameterizedElement#removeParameter(java.lang.String) <em>Remove Parameter</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Parameter</em>' operation.
	 * @see de.tu_bs.cs.isf.familymining.models.base.ParameterizedElement#removeParameter(java.lang.String)
	 * @generated
	 */
	EOperation getParameterizedElement__RemoveParameter__String();

	/**
	 * Returns the meta object for the '{@link de.tu_bs.cs.isf.familymining.models.base.ParameterizedElement#containsParameter(java.lang.String) <em>Contains Parameter</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Contains Parameter</em>' operation.
	 * @see de.tu_bs.cs.isf.familymining.models.base.ParameterizedElement#containsParameter(java.lang.String)
	 * @generated
	 */
	EOperation getParameterizedElement__ContainsParameter__String();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.familymining.models.base.VariableValueElement <em>Variable Value Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Value Element</em>'.
	 * @see de.tu_bs.cs.isf.familymining.models.base.VariableValueElement
	 * @generated
	 */
	EClass getVariableValueElement();

	/**
	 * Returns the meta object for the map '{@link de.tu_bs.cs.isf.familymining.models.base.VariableValueElement#getAlternativeValues <em>Alternative Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Alternative Values</em>'.
	 * @see de.tu_bs.cs.isf.familymining.models.base.VariableValueElement#getAlternativeValues()
	 * @see #getVariableValueElement()
	 * @generated
	 */
	EReference getVariableValueElement_AlternativeValues();

	/**
	 * Returns the meta object for the '{@link de.tu_bs.cs.isf.familymining.models.base.VariableValueElement#addAlternativeValuesMap(java.lang.String) <em>Add Alternative Values Map</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Alternative Values Map</em>' operation.
	 * @see de.tu_bs.cs.isf.familymining.models.base.VariableValueElement#addAlternativeValuesMap(java.lang.String)
	 * @generated
	 */
	EOperation getVariableValueElement__AddAlternativeValuesMap__String();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.familymining.models.base.VariableModel <em>Variable Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Model</em>'.
	 * @see de.tu_bs.cs.isf.familymining.models.base.VariableModel
	 * @generated
	 */
	EClass getVariableModel();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.familymining.models.base.VariableModel#getBaseModel <em>Base Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Model</em>'.
	 * @see de.tu_bs.cs.isf.familymining.models.base.VariableModel#getBaseModel()
	 * @see #getVariableModel()
	 * @generated
	 */
	EAttribute getVariableModel_BaseModel();

	/**
	 * Returns the meta object for the attribute list '{@link de.tu_bs.cs.isf.familymining.models.base.VariableModel#getCompareModels <em>Compare Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Compare Models</em>'.
	 * @see de.tu_bs.cs.isf.familymining.models.base.VariableModel#getCompareModels()
	 * @see #getVariableModel()
	 * @generated
	 */
	EAttribute getVariableModel_CompareModels();

	/**
	 * Returns the meta object for the attribute list '{@link de.tu_bs.cs.isf.familymining.models.base.VariableModel#getContainingModels <em>Containing Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Containing Models</em>'.
	 * @see de.tu_bs.cs.isf.familymining.models.base.VariableModel#getContainingModels()
	 * @see #getVariableModel()
	 * @generated
	 */
	EAttribute getVariableModel_ContainingModels();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.familymining.models.base.VariableElement <em>Variable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Element</em>'.
	 * @see de.tu_bs.cs.isf.familymining.models.base.VariableElement
	 * @generated
	 */
	EClass getVariableElement();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.familymining.models.base.VariableElement#getVariabilityGroupId <em>Variability Group Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variability Group Id</em>'.
	 * @see de.tu_bs.cs.isf.familymining.models.base.VariableElement#getVariabilityGroupId()
	 * @see #getVariableElement()
	 * @generated
	 */
	EAttribute getVariableElement_VariabilityGroupId();

	/**
	 * Returns the meta object for the attribute list '{@link de.tu_bs.cs.isf.familymining.models.base.VariableElement#getContainingModels <em>Containing Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Containing Models</em>'.
	 * @see de.tu_bs.cs.isf.familymining.models.base.VariableElement#getContainingModels()
	 * @see #getVariableElement()
	 * @generated
	 */
	EAttribute getVariableElement_ContainingModels();

	/**
	 * Returns the meta object for the attribute list '{@link de.tu_bs.cs.isf.familymining.models.base.VariableElement#getRelatedVariabilityGroupIds <em>Related Variability Group Ids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Related Variability Group Ids</em>'.
	 * @see de.tu_bs.cs.isf.familymining.models.base.VariableElement#getRelatedVariabilityGroupIds()
	 * @see #getVariableElement()
	 * @generated
	 */
	EAttribute getVariableElement_RelatedVariabilityGroupIds();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.familymining.models.base.VariableElement#getVariability <em>Variability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variability</em>'.
	 * @see de.tu_bs.cs.isf.familymining.models.base.VariableElement#getVariability()
	 * @see #getVariableElement()
	 * @generated
	 */
	EAttribute getVariableElement_Variability();

	/**
	 * Returns the meta object for the '{@link de.tu_bs.cs.isf.familymining.models.base.VariableElement#isContainedInModel(java.lang.String) <em>Is Contained In Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Contained In Model</em>' operation.
	 * @see de.tu_bs.cs.isf.familymining.models.base.VariableElement#isContainedInModel(java.lang.String)
	 * @generated
	 */
	EOperation getVariableElement__IsContainedInModel__String();

	/**
	 * Returns the meta object for the '{@link de.tu_bs.cs.isf.familymining.models.base.VariableElement#isMandatory() <em>Is Mandatory</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Mandatory</em>' operation.
	 * @see de.tu_bs.cs.isf.familymining.models.base.VariableElement#isMandatory()
	 * @generated
	 */
	EOperation getVariableElement__IsMandatory();

	/**
	 * Returns the meta object for the '{@link de.tu_bs.cs.isf.familymining.models.base.VariableElement#isAlternative() <em>Is Alternative</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Alternative</em>' operation.
	 * @see de.tu_bs.cs.isf.familymining.models.base.VariableElement#isAlternative()
	 * @generated
	 */
	EOperation getVariableElement__IsAlternative();

	/**
	 * Returns the meta object for the '{@link de.tu_bs.cs.isf.familymining.models.base.VariableElement#isOptional() <em>Is Optional</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Optional</em>' operation.
	 * @see de.tu_bs.cs.isf.familymining.models.base.VariableElement#isOptional()
	 * @generated
	 */
	EOperation getVariableElement__IsOptional();

	/**
	 * Returns the meta object for the '{@link de.tu_bs.cs.isf.familymining.models.base.VariableElement#isOptionalAlternative() <em>Is Optional Alternative</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Optional Alternative</em>' operation.
	 * @see de.tu_bs.cs.isf.familymining.models.base.VariableElement#isOptionalAlternative()
	 * @generated
	 */
	EOperation getVariableElement__IsOptionalAlternative();

	/**
	 * Returns the meta object for the '{@link de.tu_bs.cs.isf.familymining.models.base.VariableElement#isVariabilitySet() <em>Is Variability Set</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Variability Set</em>' operation.
	 * @see de.tu_bs.cs.isf.familymining.models.base.VariableElement#isVariabilitySet()
	 * @generated
	 */
	EOperation getVariableElement__IsVariabilitySet();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.familymining.models.base.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see de.tu_bs.cs.isf.familymining.models.base.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.familymining.models.base.Entity#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.tu_bs.cs.isf.familymining.models.base.Entity#getId()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_Id();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.familymining.models.base.ModelEntity <em>Model Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Entity</em>'.
	 * @see de.tu_bs.cs.isf.familymining.models.base.ModelEntity
	 * @generated
	 */
	EClass getModelEntity();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.familymining.models.base.ModelEntity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.tu_bs.cs.isf.familymining.models.base.ModelEntity#getName()
	 * @see #getModelEntity()
	 * @generated
	 */
	EAttribute getModelEntity_Name();

	/**
	 * Returns the meta object for the '{@link de.tu_bs.cs.isf.familymining.models.base.ModelEntity#getModelFileExtension() <em>Get Model File Extension</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Model File Extension</em>' operation.
	 * @see de.tu_bs.cs.isf.familymining.models.base.ModelEntity#getModelFileExtension()
	 * @generated
	 */
	EOperation getModelEntity__GetModelFileExtension();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.familymining.models.base.ContainerEntity <em>Container Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container Entity</em>'.
	 * @see de.tu_bs.cs.isf.familymining.models.base.ContainerEntity
	 * @generated
	 */
	EClass getContainerEntity();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.familymining.models.base.NodeEntity <em>Node Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Entity</em>'.
	 * @see de.tu_bs.cs.isf.familymining.models.base.NodeEntity
	 * @generated
	 */
	EClass getNodeEntity();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.familymining.models.base.EdgeEntity <em>Edge Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edge Entity</em>'.
	 * @see de.tu_bs.cs.isf.familymining.models.base.EdgeEntity
	 * @generated
	 */
	EClass getEdgeEntity();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.familymining.models.base.WrappedType <em>Wrapped Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wrapped Type</em>'.
	 * @see de.tu_bs.cs.isf.familymining.models.base.WrappedType
	 * @generated
	 */
	EClass getWrappedType();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.familymining.models.base.WrappedString <em>Wrapped String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wrapped String</em>'.
	 * @see de.tu_bs.cs.isf.familymining.models.base.WrappedString
	 * @generated
	 */
	EClass getWrappedString();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.familymining.models.base.WrappedString#getWrappedString <em>Wrapped String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wrapped String</em>'.
	 * @see de.tu_bs.cs.isf.familymining.models.base.WrappedString#getWrappedString()
	 * @see #getWrappedString()
	 * @generated
	 */
	EAttribute getWrappedString_WrappedString();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.familymining.models.base.WrappedEObject <em>Wrapped EObject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wrapped EObject</em>'.
	 * @see de.tu_bs.cs.isf.familymining.models.base.WrappedEObject
	 * @generated
	 */
	EClass getWrappedEObject();

	/**
	 * Returns the meta object for the reference '{@link de.tu_bs.cs.isf.familymining.models.base.WrappedEObject#getWrappedEObject <em>Wrapped EObject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Wrapped EObject</em>'.
	 * @see de.tu_bs.cs.isf.familymining.models.base.WrappedEObject#getWrappedEObject()
	 * @see #getWrappedEObject()
	 * @generated
	 */
	EReference getWrappedEObject_WrappedEObject();

	/**
	 * Returns the meta object for enum '{@link de.tu_bs.cs.isf.familymining.models.base.Variability <em>Variability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Variability</em>'.
	 * @see de.tu_bs.cs.isf.familymining.models.base.Variability
	 * @generated
	 */
	EEnum getVariability();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BaseFactory getBaseFactory();

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
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.familymining.models.base.impl.StringToStringMapEntryImpl <em>String To String Map Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.familymining.models.base.impl.StringToStringMapEntryImpl
		 * @see de.tu_bs.cs.isf.familymining.models.base.impl.BasePackageImpl#getStringToStringMapEntry()
		 * @generated
		 */
		EClass STRING_TO_STRING_MAP_ENTRY = eINSTANCE.getStringToStringMapEntry();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TO_STRING_MAP_ENTRY__KEY = eINSTANCE.getStringToStringMapEntry_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TO_STRING_MAP_ENTRY__VALUE = eINSTANCE.getStringToStringMapEntry_Value();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.familymining.models.base.impl.EStructuralFeatureToWrappedTypeMapEntryImpl <em>EStructural Feature To Wrapped Type Map Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.familymining.models.base.impl.EStructuralFeatureToWrappedTypeMapEntryImpl
		 * @see de.tu_bs.cs.isf.familymining.models.base.impl.BasePackageImpl#getEStructuralFeatureToWrappedTypeMapEntry()
		 * @generated
		 */
		EClass ESTRUCTURAL_FEATURE_TO_WRAPPED_TYPE_MAP_ENTRY = eINSTANCE.getEStructuralFeatureToWrappedTypeMapEntry();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESTRUCTURAL_FEATURE_TO_WRAPPED_TYPE_MAP_ENTRY__KEY = eINSTANCE.getEStructuralFeatureToWrappedTypeMapEntry_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESTRUCTURAL_FEATURE_TO_WRAPPED_TYPE_MAP_ENTRY__VALUE = eINSTANCE.getEStructuralFeatureToWrappedTypeMapEntry_Value();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.familymining.models.base.impl.StringToAlternativeValuesMapImpl <em>String To Alternative Values Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.familymining.models.base.impl.StringToAlternativeValuesMapImpl
		 * @see de.tu_bs.cs.isf.familymining.models.base.impl.BasePackageImpl#getStringToAlternativeValuesMap()
		 * @generated
		 */
		EClass STRING_TO_ALTERNATIVE_VALUES_MAP = eINSTANCE.getStringToAlternativeValuesMap();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TO_ALTERNATIVE_VALUES_MAP__KEY = eINSTANCE.getStringToAlternativeValuesMap_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRING_TO_ALTERNATIVE_VALUES_MAP__VALUE = eINSTANCE.getStringToAlternativeValuesMap_Value();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.familymining.models.base.impl.ParameterizedElementImpl <em>Parameterized Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.familymining.models.base.impl.ParameterizedElementImpl
		 * @see de.tu_bs.cs.isf.familymining.models.base.impl.BasePackageImpl#getParameterizedElement()
		 * @generated
		 */
		EClass PARAMETERIZED_ELEMENT = eINSTANCE.getParameterizedElement();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETERIZED_ELEMENT__PARAMETERS = eINSTANCE.getParameterizedElement_Parameters();

		/**
		 * The meta object literal for the '<em><b>Set Parameter</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARAMETERIZED_ELEMENT___SET_PARAMETER__STRING_STRING = eINSTANCE.getParameterizedElement__SetParameter__String_String();

		/**
		 * The meta object literal for the '<em><b>Get Parameter</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARAMETERIZED_ELEMENT___GET_PARAMETER__STRING = eINSTANCE.getParameterizedElement__GetParameter__String();

		/**
		 * The meta object literal for the '<em><b>Remove Parameter</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARAMETERIZED_ELEMENT___REMOVE_PARAMETER__STRING = eINSTANCE.getParameterizedElement__RemoveParameter__String();

		/**
		 * The meta object literal for the '<em><b>Contains Parameter</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARAMETERIZED_ELEMENT___CONTAINS_PARAMETER__STRING = eINSTANCE.getParameterizedElement__ContainsParameter__String();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.familymining.models.base.impl.VariableValueElementImpl <em>Variable Value Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.familymining.models.base.impl.VariableValueElementImpl
		 * @see de.tu_bs.cs.isf.familymining.models.base.impl.BasePackageImpl#getVariableValueElement()
		 * @generated
		 */
		EClass VARIABLE_VALUE_ELEMENT = eINSTANCE.getVariableValueElement();

		/**
		 * The meta object literal for the '<em><b>Alternative Values</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_VALUE_ELEMENT__ALTERNATIVE_VALUES = eINSTANCE.getVariableValueElement_AlternativeValues();

		/**
		 * The meta object literal for the '<em><b>Add Alternative Values Map</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VARIABLE_VALUE_ELEMENT___ADD_ALTERNATIVE_VALUES_MAP__STRING = eINSTANCE.getVariableValueElement__AddAlternativeValuesMap__String();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.familymining.models.base.impl.VariableModelImpl <em>Variable Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.familymining.models.base.impl.VariableModelImpl
		 * @see de.tu_bs.cs.isf.familymining.models.base.impl.BasePackageImpl#getVariableModel()
		 * @generated
		 */
		EClass VARIABLE_MODEL = eINSTANCE.getVariableModel();

		/**
		 * The meta object literal for the '<em><b>Base Model</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE_MODEL__BASE_MODEL = eINSTANCE.getVariableModel_BaseModel();

		/**
		 * The meta object literal for the '<em><b>Compare Models</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE_MODEL__COMPARE_MODELS = eINSTANCE.getVariableModel_CompareModels();

		/**
		 * The meta object literal for the '<em><b>Containing Models</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE_MODEL__CONTAINING_MODELS = eINSTANCE.getVariableModel_ContainingModels();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.familymining.models.base.impl.VariableElementImpl <em>Variable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.familymining.models.base.impl.VariableElementImpl
		 * @see de.tu_bs.cs.isf.familymining.models.base.impl.BasePackageImpl#getVariableElement()
		 * @generated
		 */
		EClass VARIABLE_ELEMENT = eINSTANCE.getVariableElement();

		/**
		 * The meta object literal for the '<em><b>Variability Group Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE_ELEMENT__VARIABILITY_GROUP_ID = eINSTANCE.getVariableElement_VariabilityGroupId();

		/**
		 * The meta object literal for the '<em><b>Containing Models</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE_ELEMENT__CONTAINING_MODELS = eINSTANCE.getVariableElement_ContainingModels();

		/**
		 * The meta object literal for the '<em><b>Related Variability Group Ids</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE_ELEMENT__RELATED_VARIABILITY_GROUP_IDS = eINSTANCE.getVariableElement_RelatedVariabilityGroupIds();

		/**
		 * The meta object literal for the '<em><b>Variability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE_ELEMENT__VARIABILITY = eINSTANCE.getVariableElement_Variability();

		/**
		 * The meta object literal for the '<em><b>Is Contained In Model</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VARIABLE_ELEMENT___IS_CONTAINED_IN_MODEL__STRING = eINSTANCE.getVariableElement__IsContainedInModel__String();

		/**
		 * The meta object literal for the '<em><b>Is Mandatory</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VARIABLE_ELEMENT___IS_MANDATORY = eINSTANCE.getVariableElement__IsMandatory();

		/**
		 * The meta object literal for the '<em><b>Is Alternative</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VARIABLE_ELEMENT___IS_ALTERNATIVE = eINSTANCE.getVariableElement__IsAlternative();

		/**
		 * The meta object literal for the '<em><b>Is Optional</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VARIABLE_ELEMENT___IS_OPTIONAL = eINSTANCE.getVariableElement__IsOptional();

		/**
		 * The meta object literal for the '<em><b>Is Optional Alternative</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VARIABLE_ELEMENT___IS_OPTIONAL_ALTERNATIVE = eINSTANCE.getVariableElement__IsOptionalAlternative();

		/**
		 * The meta object literal for the '<em><b>Is Variability Set</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VARIABLE_ELEMENT___IS_VARIABILITY_SET = eINSTANCE.getVariableElement__IsVariabilitySet();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.familymining.models.base.impl.EntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.familymining.models.base.impl.EntityImpl
		 * @see de.tu_bs.cs.isf.familymining.models.base.impl.BasePackageImpl#getEntity()
		 * @generated
		 */
		EClass ENTITY = eINSTANCE.getEntity();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__ID = eINSTANCE.getEntity_Id();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.familymining.models.base.impl.ModelEntityImpl <em>Model Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.familymining.models.base.impl.ModelEntityImpl
		 * @see de.tu_bs.cs.isf.familymining.models.base.impl.BasePackageImpl#getModelEntity()
		 * @generated
		 */
		EClass MODEL_ENTITY = eINSTANCE.getModelEntity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ENTITY__NAME = eINSTANCE.getModelEntity_Name();

		/**
		 * The meta object literal for the '<em><b>Get Model File Extension</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL_ENTITY___GET_MODEL_FILE_EXTENSION = eINSTANCE.getModelEntity__GetModelFileExtension();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.familymining.models.base.impl.ContainerEntityImpl <em>Container Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.familymining.models.base.impl.ContainerEntityImpl
		 * @see de.tu_bs.cs.isf.familymining.models.base.impl.BasePackageImpl#getContainerEntity()
		 * @generated
		 */
		EClass CONTAINER_ENTITY = eINSTANCE.getContainerEntity();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.familymining.models.base.impl.NodeEntityImpl <em>Node Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.familymining.models.base.impl.NodeEntityImpl
		 * @see de.tu_bs.cs.isf.familymining.models.base.impl.BasePackageImpl#getNodeEntity()
		 * @generated
		 */
		EClass NODE_ENTITY = eINSTANCE.getNodeEntity();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.familymining.models.base.impl.EdgeEntityImpl <em>Edge Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.familymining.models.base.impl.EdgeEntityImpl
		 * @see de.tu_bs.cs.isf.familymining.models.base.impl.BasePackageImpl#getEdgeEntity()
		 * @generated
		 */
		EClass EDGE_ENTITY = eINSTANCE.getEdgeEntity();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.familymining.models.base.impl.WrappedTypeImpl <em>Wrapped Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.familymining.models.base.impl.WrappedTypeImpl
		 * @see de.tu_bs.cs.isf.familymining.models.base.impl.BasePackageImpl#getWrappedType()
		 * @generated
		 */
		EClass WRAPPED_TYPE = eINSTANCE.getWrappedType();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.familymining.models.base.impl.WrappedStringImpl <em>Wrapped String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.familymining.models.base.impl.WrappedStringImpl
		 * @see de.tu_bs.cs.isf.familymining.models.base.impl.BasePackageImpl#getWrappedString()
		 * @generated
		 */
		EClass WRAPPED_STRING = eINSTANCE.getWrappedString();

		/**
		 * The meta object literal for the '<em><b>Wrapped String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WRAPPED_STRING__WRAPPED_STRING = eINSTANCE.getWrappedString_WrappedString();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.familymining.models.base.impl.WrappedEObjectImpl <em>Wrapped EObject</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.familymining.models.base.impl.WrappedEObjectImpl
		 * @see de.tu_bs.cs.isf.familymining.models.base.impl.BasePackageImpl#getWrappedEObject()
		 * @generated
		 */
		EClass WRAPPED_EOBJECT = eINSTANCE.getWrappedEObject();

		/**
		 * The meta object literal for the '<em><b>Wrapped EObject</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WRAPPED_EOBJECT__WRAPPED_EOBJECT = eINSTANCE.getWrappedEObject_WrappedEObject();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.familymining.models.base.Variability <em>Variability</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.familymining.models.base.Variability
		 * @see de.tu_bs.cs.isf.familymining.models.base.impl.BasePackageImpl#getVariability()
		 * @generated
		 */
		EEnum VARIABILITY = eINSTANCE.getVariability();

	}

} //BasePackage
