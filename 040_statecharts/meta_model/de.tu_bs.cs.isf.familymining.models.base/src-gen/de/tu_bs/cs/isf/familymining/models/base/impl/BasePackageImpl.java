/**
 */
package de.tu_bs.cs.isf.familymining.models.base.impl;

import de.tu_bs.cs.isf.familymining.models.base.BaseFactory;
import de.tu_bs.cs.isf.familymining.models.base.BasePackage;
import de.tu_bs.cs.isf.familymining.models.base.ContainerEntity;
import de.tu_bs.cs.isf.familymining.models.base.EdgeEntity;
import de.tu_bs.cs.isf.familymining.models.base.Entity;
import de.tu_bs.cs.isf.familymining.models.base.ModelEntity;
import de.tu_bs.cs.isf.familymining.models.base.NodeEntity;
import de.tu_bs.cs.isf.familymining.models.base.ParameterizedElement;
import de.tu_bs.cs.isf.familymining.models.base.Variability;
import de.tu_bs.cs.isf.familymining.models.base.VariableElement;
import de.tu_bs.cs.isf.familymining.models.base.VariableModel;
import de.tu_bs.cs.isf.familymining.models.base.VariableValueElement;
import de.tu_bs.cs.isf.familymining.models.base.WrappedEObject;
import de.tu_bs.cs.isf.familymining.models.base.WrappedString;
import de.tu_bs.cs.isf.familymining.models.base.WrappedType;

import java.util.Map;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BasePackageImpl extends EPackageImpl implements BasePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringToStringMapEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eStructuralFeatureToWrappedTypeMapEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringToAlternativeValuesMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterizedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableValueElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass edgeEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wrappedTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wrappedStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wrappedEObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum variabilityEEnum = null;

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
	 * @see de.tu_bs.cs.isf.familymining.models.base.BasePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BasePackageImpl() {
		super(eNS_URI, BaseFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link BasePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BasePackage init() {
		if (isInited) return (BasePackage)EPackage.Registry.INSTANCE.getEPackage(BasePackage.eNS_URI);

		// Obtain or create and register package
		BasePackageImpl theBasePackage = (BasePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof BasePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new BasePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theBasePackage.createPackageContents();

		// Initialize created meta-data
		theBasePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBasePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BasePackage.eNS_URI, theBasePackage);
		return theBasePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringToStringMapEntry() {
		return stringToStringMapEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringToStringMapEntry_Key() {
		return (EAttribute)stringToStringMapEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringToStringMapEntry_Value() {
		return (EAttribute)stringToStringMapEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEStructuralFeatureToWrappedTypeMapEntry() {
		return eStructuralFeatureToWrappedTypeMapEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEStructuralFeatureToWrappedTypeMapEntry_Key() {
		return (EReference)eStructuralFeatureToWrappedTypeMapEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEStructuralFeatureToWrappedTypeMapEntry_Value() {
		return (EReference)eStructuralFeatureToWrappedTypeMapEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringToAlternativeValuesMap() {
		return stringToAlternativeValuesMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringToAlternativeValuesMap_Key() {
		return (EAttribute)stringToAlternativeValuesMapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStringToAlternativeValuesMap_Value() {
		return (EReference)stringToAlternativeValuesMapEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterizedElement() {
		return parameterizedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterizedElement_Parameters() {
		return (EReference)parameterizedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterizedElement__SetParameter__String_String() {
		return parameterizedElementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterizedElement__GetParameter__String() {
		return parameterizedElementEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterizedElement__RemoveParameter__String() {
		return parameterizedElementEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterizedElement__ContainsParameter__String() {
		return parameterizedElementEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableValueElement() {
		return variableValueElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableValueElement_AlternativeValues() {
		return (EReference)variableValueElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVariableValueElement__AddAlternativeValuesMap__String() {
		return variableValueElementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableModel() {
		return variableModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariableModel_BaseModel() {
		return (EAttribute)variableModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariableModel_CompareModels() {
		return (EAttribute)variableModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariableModel_ContainingModels() {
		return (EAttribute)variableModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableElement() {
		return variableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariableElement_VariabilityGroupId() {
		return (EAttribute)variableElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariableElement_ContainingModels() {
		return (EAttribute)variableElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariableElement_RelatedVariabilityGroupIds() {
		return (EAttribute)variableElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariableElement_Variability() {
		return (EAttribute)variableElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVariableElement__IsContainedInModel__String() {
		return variableElementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVariableElement__IsMandatory() {
		return variableElementEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVariableElement__IsAlternative() {
		return variableElementEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVariableElement__IsOptional() {
		return variableElementEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVariableElement__IsOptionalAlternative() {
		return variableElementEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVariableElement__IsVariabilitySet() {
		return variableElementEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntity() {
		return entityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntity_Id() {
		return (EAttribute)entityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelEntity() {
		return modelEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelEntity_Name() {
		return (EAttribute)modelEntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getModelEntity__GetModelFileExtension() {
		return modelEntityEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainerEntity() {
		return containerEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNodeEntity() {
		return nodeEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEdgeEntity() {
		return edgeEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWrappedType() {
		return wrappedTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWrappedString() {
		return wrappedStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWrappedString_WrappedString() {
		return (EAttribute)wrappedStringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWrappedEObject() {
		return wrappedEObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWrappedEObject_WrappedEObject() {
		return (EReference)wrappedEObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVariability() {
		return variabilityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseFactory getBaseFactory() {
		return (BaseFactory)getEFactoryInstance();
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
		stringToStringMapEntryEClass = createEClass(STRING_TO_STRING_MAP_ENTRY);
		createEAttribute(stringToStringMapEntryEClass, STRING_TO_STRING_MAP_ENTRY__KEY);
		createEAttribute(stringToStringMapEntryEClass, STRING_TO_STRING_MAP_ENTRY__VALUE);

		eStructuralFeatureToWrappedTypeMapEntryEClass = createEClass(ESTRUCTURAL_FEATURE_TO_WRAPPED_TYPE_MAP_ENTRY);
		createEReference(eStructuralFeatureToWrappedTypeMapEntryEClass, ESTRUCTURAL_FEATURE_TO_WRAPPED_TYPE_MAP_ENTRY__KEY);
		createEReference(eStructuralFeatureToWrappedTypeMapEntryEClass, ESTRUCTURAL_FEATURE_TO_WRAPPED_TYPE_MAP_ENTRY__VALUE);

		stringToAlternativeValuesMapEClass = createEClass(STRING_TO_ALTERNATIVE_VALUES_MAP);
		createEAttribute(stringToAlternativeValuesMapEClass, STRING_TO_ALTERNATIVE_VALUES_MAP__KEY);
		createEReference(stringToAlternativeValuesMapEClass, STRING_TO_ALTERNATIVE_VALUES_MAP__VALUE);

		parameterizedElementEClass = createEClass(PARAMETERIZED_ELEMENT);
		createEReference(parameterizedElementEClass, PARAMETERIZED_ELEMENT__PARAMETERS);
		createEOperation(parameterizedElementEClass, PARAMETERIZED_ELEMENT___SET_PARAMETER__STRING_STRING);
		createEOperation(parameterizedElementEClass, PARAMETERIZED_ELEMENT___GET_PARAMETER__STRING);
		createEOperation(parameterizedElementEClass, PARAMETERIZED_ELEMENT___REMOVE_PARAMETER__STRING);
		createEOperation(parameterizedElementEClass, PARAMETERIZED_ELEMENT___CONTAINS_PARAMETER__STRING);

		variableValueElementEClass = createEClass(VARIABLE_VALUE_ELEMENT);
		createEReference(variableValueElementEClass, VARIABLE_VALUE_ELEMENT__ALTERNATIVE_VALUES);
		createEOperation(variableValueElementEClass, VARIABLE_VALUE_ELEMENT___ADD_ALTERNATIVE_VALUES_MAP__STRING);

		variableModelEClass = createEClass(VARIABLE_MODEL);
		createEAttribute(variableModelEClass, VARIABLE_MODEL__BASE_MODEL);
		createEAttribute(variableModelEClass, VARIABLE_MODEL__COMPARE_MODELS);
		createEAttribute(variableModelEClass, VARIABLE_MODEL__CONTAINING_MODELS);

		variableElementEClass = createEClass(VARIABLE_ELEMENT);
		createEAttribute(variableElementEClass, VARIABLE_ELEMENT__VARIABILITY_GROUP_ID);
		createEAttribute(variableElementEClass, VARIABLE_ELEMENT__CONTAINING_MODELS);
		createEAttribute(variableElementEClass, VARIABLE_ELEMENT__RELATED_VARIABILITY_GROUP_IDS);
		createEAttribute(variableElementEClass, VARIABLE_ELEMENT__VARIABILITY);
		createEOperation(variableElementEClass, VARIABLE_ELEMENT___IS_CONTAINED_IN_MODEL__STRING);
		createEOperation(variableElementEClass, VARIABLE_ELEMENT___IS_MANDATORY);
		createEOperation(variableElementEClass, VARIABLE_ELEMENT___IS_ALTERNATIVE);
		createEOperation(variableElementEClass, VARIABLE_ELEMENT___IS_OPTIONAL);
		createEOperation(variableElementEClass, VARIABLE_ELEMENT___IS_OPTIONAL_ALTERNATIVE);
		createEOperation(variableElementEClass, VARIABLE_ELEMENT___IS_VARIABILITY_SET);

		entityEClass = createEClass(ENTITY);
		createEAttribute(entityEClass, ENTITY__ID);

		modelEntityEClass = createEClass(MODEL_ENTITY);
		createEAttribute(modelEntityEClass, MODEL_ENTITY__NAME);
		createEOperation(modelEntityEClass, MODEL_ENTITY___GET_MODEL_FILE_EXTENSION);

		containerEntityEClass = createEClass(CONTAINER_ENTITY);

		nodeEntityEClass = createEClass(NODE_ENTITY);

		edgeEntityEClass = createEClass(EDGE_ENTITY);

		wrappedTypeEClass = createEClass(WRAPPED_TYPE);

		wrappedStringEClass = createEClass(WRAPPED_STRING);
		createEAttribute(wrappedStringEClass, WRAPPED_STRING__WRAPPED_STRING);

		wrappedEObjectEClass = createEClass(WRAPPED_EOBJECT);
		createEReference(wrappedEObjectEClass, WRAPPED_EOBJECT__WRAPPED_EOBJECT);

		// Create enums
		variabilityEEnum = createEEnum(VARIABILITY);
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

		// Obtain other dependent packages
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		variableModelEClass.getESuperTypes().add(this.getVariableValueElement());
		variableElementEClass.getESuperTypes().add(this.getVariableValueElement());
		modelEntityEClass.getESuperTypes().add(this.getEntity());
		modelEntityEClass.getESuperTypes().add(this.getVariableModel());
		containerEntityEClass.getESuperTypes().add(this.getEntity());
		containerEntityEClass.getESuperTypes().add(this.getVariableElement());
		nodeEntityEClass.getESuperTypes().add(this.getEntity());
		nodeEntityEClass.getESuperTypes().add(this.getVariableElement());
		edgeEntityEClass.getESuperTypes().add(this.getEntity());
		edgeEntityEClass.getESuperTypes().add(this.getVariableElement());
		wrappedStringEClass.getESuperTypes().add(this.getWrappedType());
		wrappedEObjectEClass.getESuperTypes().add(this.getWrappedType());

		// Initialize classes, features, and operations; add parameters
		initEClass(stringToStringMapEntryEClass, Map.Entry.class, "StringToStringMapEntry", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringToStringMapEntry_Key(), ecorePackage.getEString(), "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStringToStringMapEntry_Value(), ecorePackage.getEString(), "value", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eStructuralFeatureToWrappedTypeMapEntryEClass, Map.Entry.class, "EStructuralFeatureToWrappedTypeMapEntry", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEStructuralFeatureToWrappedTypeMapEntry_Key(), theEcorePackage.getEStructuralFeature(), null, "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEStructuralFeatureToWrappedTypeMapEntry_Value(), this.getWrappedType(), null, "value", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringToAlternativeValuesMapEClass, Map.Entry.class, "StringToAlternativeValuesMap", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringToAlternativeValuesMap_Key(), theEcorePackage.getEString(), "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStringToAlternativeValuesMap_Value(), this.getEStructuralFeatureToWrappedTypeMapEntry(), null, "value", null, 0, -1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterizedElementEClass, ParameterizedElement.class, "ParameterizedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameterizedElement_Parameters(), this.getStringToStringMapEntry(), null, "parameters", null, 0, -1, ParameterizedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getParameterizedElement__SetParameter__String_String(), null, "setParameter", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "key", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getParameterizedElement__GetParameter__String(), ecorePackage.getEString(), "getParameter", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "key", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getParameterizedElement__RemoveParameter__String(), null, "removeParameter", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "key", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getParameterizedElement__ContainsParameter__String(), ecorePackage.getEBoolean(), "containsParameter", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "key", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(variableValueElementEClass, VariableValueElement.class, "VariableValueElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariableValueElement_AlternativeValues(), this.getStringToAlternativeValuesMap(), null, "alternativeValues", null, 0, -1, VariableValueElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getVariableValueElement__AddAlternativeValuesMap__String(), null, "addAlternativeValuesMap", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "model", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(variableModelEClass, VariableModel.class, "VariableModel", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVariableModel_BaseModel(), ecorePackage.getEString(), "baseModel", null, 0, 1, VariableModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariableModel_CompareModels(), theEcorePackage.getEString(), "compareModels", null, 0, -1, VariableModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariableModel_ContainingModels(), ecorePackage.getEString(), "containingModels", null, 0, -1, VariableModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableElementEClass, VariableElement.class, "VariableElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVariableElement_VariabilityGroupId(), ecorePackage.getEString(), "variabilityGroupId", null, 0, 1, VariableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariableElement_ContainingModels(), ecorePackage.getEString(), "containingModels", null, 0, -1, VariableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariableElement_RelatedVariabilityGroupIds(), theEcorePackage.getEString(), "relatedVariabilityGroupIds", null, 0, -1, VariableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariableElement_Variability(), this.getVariability(), "variability", "NONE", 0, 1, VariableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getVariableElement__IsContainedInModel__String(), ecorePackage.getEBoolean(), "isContainedInModel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "model", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getVariableElement__IsMandatory(), ecorePackage.getEBoolean(), "isMandatory", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getVariableElement__IsAlternative(), ecorePackage.getEBoolean(), "isAlternative", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getVariableElement__IsOptional(), ecorePackage.getEBoolean(), "isOptional", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getVariableElement__IsOptionalAlternative(), ecorePackage.getEBoolean(), "isOptionalAlternative", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getVariableElement__IsVariabilitySet(), ecorePackage.getEBoolean(), "isVariabilitySet", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(entityEClass, Entity.class, "Entity", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEntity_Id(), ecorePackage.getEString(), "id", null, 1, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelEntityEClass, ModelEntity.class, "ModelEntity", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModelEntity_Name(), ecorePackage.getEString(), "name", null, 1, 1, ModelEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getModelEntity__GetModelFileExtension(), theEcorePackage.getEString(), "getModelFileExtension", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(containerEntityEClass, ContainerEntity.class, "ContainerEntity", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(nodeEntityEClass, NodeEntity.class, "NodeEntity", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(edgeEntityEClass, EdgeEntity.class, "EdgeEntity", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(wrappedTypeEClass, WrappedType.class, "WrappedType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(wrappedStringEClass, WrappedString.class, "WrappedString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWrappedString_WrappedString(), theEcorePackage.getEString(), "wrappedString", null, 0, 1, WrappedString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wrappedEObjectEClass, WrappedEObject.class, "WrappedEObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWrappedEObject_WrappedEObject(), theEcorePackage.getEObject(), null, "wrappedEObject", null, 0, 1, WrappedEObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(variabilityEEnum, Variability.class, "Variability");
		addEEnumLiteral(variabilityEEnum, Variability.NONE);
		addEEnumLiteral(variabilityEEnum, Variability.MANDATORY);
		addEEnumLiteral(variabilityEEnum, Variability.ALTERNATIVE);
		addEEnumLiteral(variabilityEEnum, Variability.OPTIONAL);
		addEEnumLiteral(variabilityEEnum, Variability.OPTIONAL_ALTERNATIVE);

		// Create resource
		createResource(eNS_URI);
	}

} //BasePackageImpl
