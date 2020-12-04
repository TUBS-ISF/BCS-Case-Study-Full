/**
 */
package de.tu_bs.cs.isf.familymining.models.base.impl;

import de.tu_bs.cs.isf.familymining.models.base.BasePackage;
import de.tu_bs.cs.isf.familymining.models.base.ModelEntity;

import de.tu_bs.cs.isf.familymining.models.base.VariableModel;
import de.tu_bs.cs.isf.familymining.models.base.VariableValueElement;
import de.tu_bs.cs.isf.familymining.models.base.WrappedType;
import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.familymining.models.base.impl.ModelEntityImpl#getAlternativeValues <em>Alternative Values</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.models.base.impl.ModelEntityImpl#getBaseModel <em>Base Model</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.models.base.impl.ModelEntityImpl#getCompareModels <em>Compare Models</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.models.base.impl.ModelEntityImpl#getContainingModels <em>Containing Models</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.models.base.impl.ModelEntityImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ModelEntityImpl extends EntityImpl implements ModelEntity {
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
	 * The default value of the '{@link #getBaseModel() <em>Base Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseModel()
	 * @generated
	 * @ordered
	 */
	protected static final String BASE_MODEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBaseModel() <em>Base Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseModel()
	 * @generated
	 * @ordered
	 */
	protected String baseModel = BASE_MODEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCompareModels() <em>Compare Models</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompareModels()
	 * @generated
	 * @ordered
	 */
	protected EList<String> compareModels;

	/**
	 * The cached value of the '{@link #getContainingModels() <em>Containing Models</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainingModels()
	 * @generated
	 * @ordered
	 */
	protected EList<String> containingModels;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasePackage.Literals.MODEL_ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, EMap<EStructuralFeature, WrappedType>> getAlternativeValues() {
		if (alternativeValues == null) {
			alternativeValues = new EcoreEMap<String,EMap<EStructuralFeature, WrappedType>>(BasePackage.Literals.STRING_TO_ALTERNATIVE_VALUES_MAP, StringToAlternativeValuesMapImpl.class, this, BasePackage.MODEL_ENTITY__ALTERNATIVE_VALUES);
		}
		return alternativeValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBaseModel() {
		return baseModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseModel(String newBaseModel) {
		String oldBaseModel = baseModel;
		baseModel = newBaseModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.MODEL_ENTITY__BASE_MODEL, oldBaseModel, baseModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getCompareModels() {
		if (compareModels == null) {
			compareModels = new EDataTypeUniqueEList<String>(String.class, this, BasePackage.MODEL_ENTITY__COMPARE_MODELS);
		}
		return compareModels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getContainingModels() {
		if (containingModels == null) {
			containingModels = new EDataTypeUniqueEList<String>(String.class, this, BasePackage.MODEL_ENTITY__CONTAINING_MODELS);
		}
		return containingModels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.MODEL_ENTITY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModelFileExtension() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
			case BasePackage.MODEL_ENTITY__ALTERNATIVE_VALUES:
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
			case BasePackage.MODEL_ENTITY__ALTERNATIVE_VALUES:
				if (coreType) return getAlternativeValues();
				else return getAlternativeValues().map();
			case BasePackage.MODEL_ENTITY__BASE_MODEL:
				return getBaseModel();
			case BasePackage.MODEL_ENTITY__COMPARE_MODELS:
				return getCompareModels();
			case BasePackage.MODEL_ENTITY__CONTAINING_MODELS:
				return getContainingModels();
			case BasePackage.MODEL_ENTITY__NAME:
				return getName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BasePackage.MODEL_ENTITY__ALTERNATIVE_VALUES:
				((EStructuralFeature.Setting)getAlternativeValues()).set(newValue);
				return;
			case BasePackage.MODEL_ENTITY__BASE_MODEL:
				setBaseModel((String)newValue);
				return;
			case BasePackage.MODEL_ENTITY__COMPARE_MODELS:
				getCompareModels().clear();
				getCompareModels().addAll((Collection<? extends String>)newValue);
				return;
			case BasePackage.MODEL_ENTITY__CONTAINING_MODELS:
				getContainingModels().clear();
				getContainingModels().addAll((Collection<? extends String>)newValue);
				return;
			case BasePackage.MODEL_ENTITY__NAME:
				setName((String)newValue);
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
			case BasePackage.MODEL_ENTITY__ALTERNATIVE_VALUES:
				getAlternativeValues().clear();
				return;
			case BasePackage.MODEL_ENTITY__BASE_MODEL:
				setBaseModel(BASE_MODEL_EDEFAULT);
				return;
			case BasePackage.MODEL_ENTITY__COMPARE_MODELS:
				getCompareModels().clear();
				return;
			case BasePackage.MODEL_ENTITY__CONTAINING_MODELS:
				getContainingModels().clear();
				return;
			case BasePackage.MODEL_ENTITY__NAME:
				setName(NAME_EDEFAULT);
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
			case BasePackage.MODEL_ENTITY__ALTERNATIVE_VALUES:
				return alternativeValues != null && !alternativeValues.isEmpty();
			case BasePackage.MODEL_ENTITY__BASE_MODEL:
				return BASE_MODEL_EDEFAULT == null ? baseModel != null : !BASE_MODEL_EDEFAULT.equals(baseModel);
			case BasePackage.MODEL_ENTITY__COMPARE_MODELS:
				return compareModels != null && !compareModels.isEmpty();
			case BasePackage.MODEL_ENTITY__CONTAINING_MODELS:
				return containingModels != null && !containingModels.isEmpty();
			case BasePackage.MODEL_ENTITY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == VariableValueElement.class) {
			switch (derivedFeatureID) {
				case BasePackage.MODEL_ENTITY__ALTERNATIVE_VALUES: return BasePackage.VARIABLE_VALUE_ELEMENT__ALTERNATIVE_VALUES;
				default: return -1;
			}
		}
		if (baseClass == VariableModel.class) {
			switch (derivedFeatureID) {
				case BasePackage.MODEL_ENTITY__BASE_MODEL: return BasePackage.VARIABLE_MODEL__BASE_MODEL;
				case BasePackage.MODEL_ENTITY__COMPARE_MODELS: return BasePackage.VARIABLE_MODEL__COMPARE_MODELS;
				case BasePackage.MODEL_ENTITY__CONTAINING_MODELS: return BasePackage.VARIABLE_MODEL__CONTAINING_MODELS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == VariableValueElement.class) {
			switch (baseFeatureID) {
				case BasePackage.VARIABLE_VALUE_ELEMENT__ALTERNATIVE_VALUES: return BasePackage.MODEL_ENTITY__ALTERNATIVE_VALUES;
				default: return -1;
			}
		}
		if (baseClass == VariableModel.class) {
			switch (baseFeatureID) {
				case BasePackage.VARIABLE_MODEL__BASE_MODEL: return BasePackage.MODEL_ENTITY__BASE_MODEL;
				case BasePackage.VARIABLE_MODEL__COMPARE_MODELS: return BasePackage.MODEL_ENTITY__COMPARE_MODELS;
				case BasePackage.VARIABLE_MODEL__CONTAINING_MODELS: return BasePackage.MODEL_ENTITY__CONTAINING_MODELS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == VariableValueElement.class) {
			switch (baseOperationID) {
				case BasePackage.VARIABLE_VALUE_ELEMENT___ADD_ALTERNATIVE_VALUES_MAP__STRING: return BasePackage.MODEL_ENTITY___ADD_ALTERNATIVE_VALUES_MAP__STRING;
				default: return -1;
			}
		}
		if (baseClass == VariableModel.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case BasePackage.MODEL_ENTITY___GET_MODEL_FILE_EXTENSION:
				return getModelFileExtension();
			case BasePackage.MODEL_ENTITY___ADD_ALTERNATIVE_VALUES_MAP__STRING:
				addAlternativeValuesMap((String)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (baseModel: ");
		result.append(baseModel);
		result.append(", compareModels: ");
		result.append(compareModels);
		result.append(", containingModels: ");
		result.append(containingModels);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ModelEntityImpl
