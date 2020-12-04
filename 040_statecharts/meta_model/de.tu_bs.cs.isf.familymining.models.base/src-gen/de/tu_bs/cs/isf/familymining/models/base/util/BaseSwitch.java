/**
 */
package de.tu_bs.cs.isf.familymining.models.base.util;

import de.tu_bs.cs.isf.familymining.models.base.*;

import java.util.Map;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.tu_bs.cs.isf.familymining.models.base.BasePackage
 * @generated
 */
public class BaseSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BasePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseSwitch() {
		if (modelPackage == null) {
			modelPackage = BasePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case BasePackage.STRING_TO_STRING_MAP_ENTRY: {
				@SuppressWarnings("unchecked") Map.Entry<String, String> stringToStringMapEntry = (Map.Entry<String, String>)theEObject;
				T result = caseStringToStringMapEntry(stringToStringMapEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasePackage.ESTRUCTURAL_FEATURE_TO_WRAPPED_TYPE_MAP_ENTRY: {
				@SuppressWarnings("unchecked") Map.Entry<EStructuralFeature, WrappedType> eStructuralFeatureToWrappedTypeMapEntry = (Map.Entry<EStructuralFeature, WrappedType>)theEObject;
				T result = caseEStructuralFeatureToWrappedTypeMapEntry(eStructuralFeatureToWrappedTypeMapEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasePackage.STRING_TO_ALTERNATIVE_VALUES_MAP: {
				@SuppressWarnings("unchecked") Map.Entry<String, EMap<EStructuralFeature, WrappedType>> stringToAlternativeValuesMap = (Map.Entry<String, EMap<EStructuralFeature, WrappedType>>)theEObject;
				T result = caseStringToAlternativeValuesMap(stringToAlternativeValuesMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasePackage.PARAMETERIZED_ELEMENT: {
				ParameterizedElement parameterizedElement = (ParameterizedElement)theEObject;
				T result = caseParameterizedElement(parameterizedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasePackage.VARIABLE_VALUE_ELEMENT: {
				VariableValueElement variableValueElement = (VariableValueElement)theEObject;
				T result = caseVariableValueElement(variableValueElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasePackage.VARIABLE_MODEL: {
				VariableModel variableModel = (VariableModel)theEObject;
				T result = caseVariableModel(variableModel);
				if (result == null) result = caseVariableValueElement(variableModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasePackage.VARIABLE_ELEMENT: {
				VariableElement variableElement = (VariableElement)theEObject;
				T result = caseVariableElement(variableElement);
				if (result == null) result = caseVariableValueElement(variableElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasePackage.ENTITY: {
				Entity entity = (Entity)theEObject;
				T result = caseEntity(entity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasePackage.MODEL_ENTITY: {
				ModelEntity modelEntity = (ModelEntity)theEObject;
				T result = caseModelEntity(modelEntity);
				if (result == null) result = caseEntity(modelEntity);
				if (result == null) result = caseVariableModel(modelEntity);
				if (result == null) result = caseVariableValueElement(modelEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasePackage.CONTAINER_ENTITY: {
				ContainerEntity containerEntity = (ContainerEntity)theEObject;
				T result = caseContainerEntity(containerEntity);
				if (result == null) result = caseEntity(containerEntity);
				if (result == null) result = caseVariableElement(containerEntity);
				if (result == null) result = caseVariableValueElement(containerEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasePackage.NODE_ENTITY: {
				NodeEntity nodeEntity = (NodeEntity)theEObject;
				T result = caseNodeEntity(nodeEntity);
				if (result == null) result = caseEntity(nodeEntity);
				if (result == null) result = caseVariableElement(nodeEntity);
				if (result == null) result = caseVariableValueElement(nodeEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasePackage.EDGE_ENTITY: {
				EdgeEntity edgeEntity = (EdgeEntity)theEObject;
				T result = caseEdgeEntity(edgeEntity);
				if (result == null) result = caseEntity(edgeEntity);
				if (result == null) result = caseVariableElement(edgeEntity);
				if (result == null) result = caseVariableValueElement(edgeEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasePackage.WRAPPED_TYPE: {
				WrappedType wrappedType = (WrappedType)theEObject;
				T result = caseWrappedType(wrappedType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasePackage.WRAPPED_STRING: {
				WrappedString wrappedString = (WrappedString)theEObject;
				T result = caseWrappedString(wrappedString);
				if (result == null) result = caseWrappedType(wrappedString);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasePackage.WRAPPED_EOBJECT: {
				WrappedEObject wrappedEObject = (WrappedEObject)theEObject;
				T result = caseWrappedEObject(wrappedEObject);
				if (result == null) result = caseWrappedType(wrappedEObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String To String Map Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String To String Map Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringToStringMapEntry(Map.Entry<String, String> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EStructural Feature To Wrapped Type Map Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EStructural Feature To Wrapped Type Map Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEStructuralFeatureToWrappedTypeMapEntry(Map.Entry<EStructuralFeature, WrappedType> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String To Alternative Values Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String To Alternative Values Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringToAlternativeValuesMap(Map.Entry<String, EMap<EStructuralFeature, WrappedType>> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameterized Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameterized Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterizedElement(ParameterizedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Value Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Value Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableValueElement(VariableValueElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableModel(VariableModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableElement(VariableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntity(Entity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelEntity(ModelEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainerEntity(ContainerEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodeEntity(NodeEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Edge Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Edge Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEdgeEntity(EdgeEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wrapped Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wrapped Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWrappedType(WrappedType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wrapped String</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wrapped String</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWrappedString(WrappedString object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wrapped EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wrapped EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWrappedEObject(WrappedEObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //BaseSwitch
