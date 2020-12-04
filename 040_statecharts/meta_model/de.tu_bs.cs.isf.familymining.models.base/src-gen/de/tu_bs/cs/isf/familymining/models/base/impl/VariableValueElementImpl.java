/**
 */
package de.tu_bs.cs.isf.familymining.models.base.impl;

import de.tu_bs.cs.isf.familymining.models.base.BasePackage;
import de.tu_bs.cs.isf.familymining.models.base.VariableValueElement;
import de.tu_bs.cs.isf.familymining.models.base.WrappedType;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Value Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.familymining.models.base.impl.VariableValueElementImpl#getAlternativeValues <em>Alternative Values</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class VariableValueElementImpl extends MinimalEObjectImpl.Container implements VariableValueElement {
	/**
	 * The cached value of the '{@link #getAlternativeValues() <em>Alternative Values</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlternativeValues()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, EMap<EStructuralFeature, WrappedType>> alternativeValues;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableValueElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasePackage.Literals.VARIABLE_VALUE_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, EMap<EStructuralFeature, WrappedType>> getAlternativeValues() {
		if (alternativeValues == null) {
			alternativeValues = new EcoreEMap<String,EMap<EStructuralFeature, WrappedType>>(BasePackage.Literals.STRING_TO_ALTERNATIVE_VALUES_MAP, StringToAlternativeValuesMapImpl.class, this, BasePackage.VARIABLE_VALUE_ELEMENT__ALTERNATIVE_VALUES);
		}
		return alternativeValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addAlternativeValuesMap(final String model) {
		org.eclipse.emf.ecore.util.EcoreEMap<EStructuralFeature, WrappedType> map = new org.eclipse.emf.ecore.util.EcoreEMap<EStructuralFeature, WrappedType>(BasePackage.Literals.ESTRUCTURAL_FEATURE_TO_WRAPPED_TYPE_MAP_ENTRY, de.tu_bs.cs.isf.familymining.models.base.impl.EStructuralFeatureToWrappedTypeMapEntryImpl.class, this, BasePackage.PARAMETERIZED_ELEMENT__PARAMETERS);
		this.getAlternativeValues().put(model, map);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BasePackage.VARIABLE_VALUE_ELEMENT__ALTERNATIVE_VALUES:
				return ((InternalEList<?>)getAlternativeValues()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BasePackage.VARIABLE_VALUE_ELEMENT__ALTERNATIVE_VALUES:
				if (coreType) return getAlternativeValues();
				else return getAlternativeValues().map();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BasePackage.VARIABLE_VALUE_ELEMENT__ALTERNATIVE_VALUES:
				((EStructuralFeature.Setting)getAlternativeValues()).set(newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case BasePackage.VARIABLE_VALUE_ELEMENT__ALTERNATIVE_VALUES:
				getAlternativeValues().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case BasePackage.VARIABLE_VALUE_ELEMENT__ALTERNATIVE_VALUES:
				return alternativeValues != null && !alternativeValues.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case BasePackage.VARIABLE_VALUE_ELEMENT___ADD_ALTERNATIVE_VALUES_MAP__STRING:
				addAlternativeValuesMap((String)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //VariableValueElementImpl
