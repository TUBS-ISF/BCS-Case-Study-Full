/**
 */
package de.tu_bs.cs.isf.familymining.models.base;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Value Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.familymining.models.base.VariableValueElement#getAlternativeValues <em>Alternative Values</em>}</li>
 * </ul>
 *
 * @see de.tu_bs.cs.isf.familymining.models.base.BasePackage#getVariableValueElement()
 * @model abstract="true"
 * @generated
 */
public interface VariableValueElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Alternative Values</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type list of {@link java.util.Map.Entry<org.eclipse.emf.ecore.EStructuralFeature, de.tu_bs.cs.isf.familymining.models.base.WrappedType>},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alternative Values</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alternative Values</em>' map.
	 * @see de.tu_bs.cs.isf.familymining.models.base.BasePackage#getVariableValueElement_AlternativeValues()
	 * @model mapType="de.tu_bs.cs.isf.familymining.models.base.StringToAlternativeValuesMap<org.eclipse.emf.ecore.EString, de.tu_bs.cs.isf.familymining.models.base.EStructuralFeatureToWrappedTypeMapEntry>"
	 * @generated
	 */
	EMap<String, EMap<EStructuralFeature, WrappedType>> getAlternativeValues();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='org.eclipse.emf.ecore.util.EcoreEMap<EStructuralFeature, WrappedType> map = new org.eclipse.emf.ecore.util.EcoreEMap<EStructuralFeature, WrappedType>(BasePackage.Literals.ESTRUCTURAL_FEATURE_TO_WRAPPED_TYPE_MAP_ENTRY, de.tu_bs.cs.isf.familymining.models.base.impl.EStructuralFeatureToWrappedTypeMapEntryImpl.class, this, BasePackage.PARAMETERIZED_ELEMENT__PARAMETERS);\r\nthis.getAlternativeValues().put(model, map);'"
	 * @generated
	 */
	void addAlternativeValuesMap(String model);

} // VariableValueElement
