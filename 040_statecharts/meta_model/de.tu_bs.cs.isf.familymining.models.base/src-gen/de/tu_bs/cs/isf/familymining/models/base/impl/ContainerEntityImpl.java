/**
 */
package de.tu_bs.cs.isf.familymining.models.base.impl;

import de.tu_bs.cs.isf.familymining.models.base.BasePackage;
import de.tu_bs.cs.isf.familymining.models.base.ContainerEntity;

import de.tu_bs.cs.isf.familymining.models.base.Variability;
import de.tu_bs.cs.isf.familymining.models.base.VariableElement;
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
 * An implementation of the model object '<em><b>Container Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.familymining.models.base.impl.ContainerEntityImpl#getAlternativeValues <em>Alternative Values</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.models.base.impl.ContainerEntityImpl#getVariabilityGroupId <em>Variability Group Id</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.models.base.impl.ContainerEntityImpl#getContainingModels <em>Containing Models</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.models.base.impl.ContainerEntityImpl#getRelatedVariabilityGroupIds <em>Related Variability Group Ids</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.models.base.impl.ContainerEntityImpl#getVariability <em>Variability</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ContainerEntityImpl extends EntityImpl implements ContainerEntity {
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
	 * The default value of the '{@link #getVariabilityGroupId() <em>Variability Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariabilityGroupId()
	 * @generated
	 * @ordered
	 */
	protected static final String VARIABILITY_GROUP_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getVariabilityGroupId() <em>Variability Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariabilityGroupId()
	 * @generated
	 * @ordered
	 */
	protected String variabilityGroupId = VARIABILITY_GROUP_ID_EDEFAULT;
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
	 * The cached value of the '{@link #getRelatedVariabilityGroupIds() <em>Related Variability Group Ids</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedVariabilityGroupIds()
	 * @generated
	 * @ordered
	 */
	protected EList<String> relatedVariabilityGroupIds;
	/**
	 * The default value of the '{@link #getVariability() <em>Variability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariability()
	 * @generated
	 * @ordered
	 */
	protected static final Variability VARIABILITY_EDEFAULT = Variability.NONE;
	/**
	 * The cached value of the '{@link #getVariability() <em>Variability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariability()
	 * @generated
	 * @ordered
	 */
	protected Variability variability = VARIABILITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainerEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasePackage.Literals.CONTAINER_ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, EMap<EStructuralFeature, WrappedType>> getAlternativeValues() {
		if (alternativeValues == null) {
			alternativeValues = new EcoreEMap<String,EMap<EStructuralFeature, WrappedType>>(BasePackage.Literals.STRING_TO_ALTERNATIVE_VALUES_MAP, StringToAlternativeValuesMapImpl.class, this, BasePackage.CONTAINER_ENTITY__ALTERNATIVE_VALUES);
		}
		return alternativeValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVariabilityGroupId() {
		return variabilityGroupId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariabilityGroupId(String newVariabilityGroupId) {
		String oldVariabilityGroupId = variabilityGroupId;
		variabilityGroupId = newVariabilityGroupId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.CONTAINER_ENTITY__VARIABILITY_GROUP_ID, oldVariabilityGroupId, variabilityGroupId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getContainingModels() {
		if (containingModels == null) {
			containingModels = new EDataTypeUniqueEList<String>(String.class, this, BasePackage.CONTAINER_ENTITY__CONTAINING_MODELS);
		}
		return containingModels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getRelatedVariabilityGroupIds() {
		if (relatedVariabilityGroupIds == null) {
			relatedVariabilityGroupIds = new EDataTypeUniqueEList<String>(String.class, this, BasePackage.CONTAINER_ENTITY__RELATED_VARIABILITY_GROUP_IDS);
		}
		return relatedVariabilityGroupIds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variability getVariability() {
		return variability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariability(Variability newVariability) {
		Variability oldVariability = variability;
		variability = newVariability == null ? VARIABILITY_EDEFAULT : newVariability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.CONTAINER_ENTITY__VARIABILITY, oldVariability, variability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isContainedInModel(final String model) {
		return getContainingModels().contains(model);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMandatory() {
		if (getVariability() == Variability.MANDATORY) {
			return true;
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAlternative() {
		if (getVariability() == Variability.ALTERNATIVE) {
			return true;
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOptional() {
		if (getVariability() == Variability.OPTIONAL) {
			return true;
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOptionalAlternative() {
		if (getVariability() == Variability.OPTIONAL_ALTERNATIVE) {
			return true;
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isVariabilitySet() {
		if (getVariability() != Variability.NONE) {
			return true;
		}
		return false;
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
			case BasePackage.CONTAINER_ENTITY__ALTERNATIVE_VALUES:
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
			case BasePackage.CONTAINER_ENTITY__ALTERNATIVE_VALUES:
				if (coreType) return getAlternativeValues();
				else return getAlternativeValues().map();
			case BasePackage.CONTAINER_ENTITY__VARIABILITY_GROUP_ID:
				return getVariabilityGroupId();
			case BasePackage.CONTAINER_ENTITY__CONTAINING_MODELS:
				return getContainingModels();
			case BasePackage.CONTAINER_ENTITY__RELATED_VARIABILITY_GROUP_IDS:
				return getRelatedVariabilityGroupIds();
			case BasePackage.CONTAINER_ENTITY__VARIABILITY:
				return getVariability();
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
			case BasePackage.CONTAINER_ENTITY__ALTERNATIVE_VALUES:
				((EStructuralFeature.Setting)getAlternativeValues()).set(newValue);
				return;
			case BasePackage.CONTAINER_ENTITY__VARIABILITY_GROUP_ID:
				setVariabilityGroupId((String)newValue);
				return;
			case BasePackage.CONTAINER_ENTITY__CONTAINING_MODELS:
				getContainingModels().clear();
				getContainingModels().addAll((Collection<? extends String>)newValue);
				return;
			case BasePackage.CONTAINER_ENTITY__RELATED_VARIABILITY_GROUP_IDS:
				getRelatedVariabilityGroupIds().clear();
				getRelatedVariabilityGroupIds().addAll((Collection<? extends String>)newValue);
				return;
			case BasePackage.CONTAINER_ENTITY__VARIABILITY:
				setVariability((Variability)newValue);
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
			case BasePackage.CONTAINER_ENTITY__ALTERNATIVE_VALUES:
				getAlternativeValues().clear();
				return;
			case BasePackage.CONTAINER_ENTITY__VARIABILITY_GROUP_ID:
				setVariabilityGroupId(VARIABILITY_GROUP_ID_EDEFAULT);
				return;
			case BasePackage.CONTAINER_ENTITY__CONTAINING_MODELS:
				getContainingModels().clear();
				return;
			case BasePackage.CONTAINER_ENTITY__RELATED_VARIABILITY_GROUP_IDS:
				getRelatedVariabilityGroupIds().clear();
				return;
			case BasePackage.CONTAINER_ENTITY__VARIABILITY:
				setVariability(VARIABILITY_EDEFAULT);
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
			case BasePackage.CONTAINER_ENTITY__ALTERNATIVE_VALUES:
				return alternativeValues != null && !alternativeValues.isEmpty();
			case BasePackage.CONTAINER_ENTITY__VARIABILITY_GROUP_ID:
				return VARIABILITY_GROUP_ID_EDEFAULT == null ? variabilityGroupId != null : !VARIABILITY_GROUP_ID_EDEFAULT.equals(variabilityGroupId);
			case BasePackage.CONTAINER_ENTITY__CONTAINING_MODELS:
				return containingModels != null && !containingModels.isEmpty();
			case BasePackage.CONTAINER_ENTITY__RELATED_VARIABILITY_GROUP_IDS:
				return relatedVariabilityGroupIds != null && !relatedVariabilityGroupIds.isEmpty();
			case BasePackage.CONTAINER_ENTITY__VARIABILITY:
				return variability != VARIABILITY_EDEFAULT;
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
				case BasePackage.CONTAINER_ENTITY__ALTERNATIVE_VALUES: return BasePackage.VARIABLE_VALUE_ELEMENT__ALTERNATIVE_VALUES;
				default: return -1;
			}
		}
		if (baseClass == VariableElement.class) {
			switch (derivedFeatureID) {
				case BasePackage.CONTAINER_ENTITY__VARIABILITY_GROUP_ID: return BasePackage.VARIABLE_ELEMENT__VARIABILITY_GROUP_ID;
				case BasePackage.CONTAINER_ENTITY__CONTAINING_MODELS: return BasePackage.VARIABLE_ELEMENT__CONTAINING_MODELS;
				case BasePackage.CONTAINER_ENTITY__RELATED_VARIABILITY_GROUP_IDS: return BasePackage.VARIABLE_ELEMENT__RELATED_VARIABILITY_GROUP_IDS;
				case BasePackage.CONTAINER_ENTITY__VARIABILITY: return BasePackage.VARIABLE_ELEMENT__VARIABILITY;
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
				case BasePackage.VARIABLE_VALUE_ELEMENT__ALTERNATIVE_VALUES: return BasePackage.CONTAINER_ENTITY__ALTERNATIVE_VALUES;
				default: return -1;
			}
		}
		if (baseClass == VariableElement.class) {
			switch (baseFeatureID) {
				case BasePackage.VARIABLE_ELEMENT__VARIABILITY_GROUP_ID: return BasePackage.CONTAINER_ENTITY__VARIABILITY_GROUP_ID;
				case BasePackage.VARIABLE_ELEMENT__CONTAINING_MODELS: return BasePackage.CONTAINER_ENTITY__CONTAINING_MODELS;
				case BasePackage.VARIABLE_ELEMENT__RELATED_VARIABILITY_GROUP_IDS: return BasePackage.CONTAINER_ENTITY__RELATED_VARIABILITY_GROUP_IDS;
				case BasePackage.VARIABLE_ELEMENT__VARIABILITY: return BasePackage.CONTAINER_ENTITY__VARIABILITY;
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
				case BasePackage.VARIABLE_VALUE_ELEMENT___ADD_ALTERNATIVE_VALUES_MAP__STRING: return BasePackage.CONTAINER_ENTITY___ADD_ALTERNATIVE_VALUES_MAP__STRING;
				default: return -1;
			}
		}
		if (baseClass == VariableElement.class) {
			switch (baseOperationID) {
				case BasePackage.VARIABLE_ELEMENT___IS_CONTAINED_IN_MODEL__STRING: return BasePackage.CONTAINER_ENTITY___IS_CONTAINED_IN_MODEL__STRING;
				case BasePackage.VARIABLE_ELEMENT___IS_MANDATORY: return BasePackage.CONTAINER_ENTITY___IS_MANDATORY;
				case BasePackage.VARIABLE_ELEMENT___IS_ALTERNATIVE: return BasePackage.CONTAINER_ENTITY___IS_ALTERNATIVE;
				case BasePackage.VARIABLE_ELEMENT___IS_OPTIONAL: return BasePackage.CONTAINER_ENTITY___IS_OPTIONAL;
				case BasePackage.VARIABLE_ELEMENT___IS_OPTIONAL_ALTERNATIVE: return BasePackage.CONTAINER_ENTITY___IS_OPTIONAL_ALTERNATIVE;
				case BasePackage.VARIABLE_ELEMENT___IS_VARIABILITY_SET: return BasePackage.CONTAINER_ENTITY___IS_VARIABILITY_SET;
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
			case BasePackage.CONTAINER_ENTITY___IS_CONTAINED_IN_MODEL__STRING:
				return isContainedInModel((String)arguments.get(0));
			case BasePackage.CONTAINER_ENTITY___IS_MANDATORY:
				return isMandatory();
			case BasePackage.CONTAINER_ENTITY___IS_ALTERNATIVE:
				return isAlternative();
			case BasePackage.CONTAINER_ENTITY___IS_OPTIONAL:
				return isOptional();
			case BasePackage.CONTAINER_ENTITY___IS_OPTIONAL_ALTERNATIVE:
				return isOptionalAlternative();
			case BasePackage.CONTAINER_ENTITY___IS_VARIABILITY_SET:
				return isVariabilitySet();
			case BasePackage.CONTAINER_ENTITY___ADD_ALTERNATIVE_VALUES_MAP__STRING:
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
		result.append(" (variabilityGroupId: ");
		result.append(variabilityGroupId);
		result.append(", containingModels: ");
		result.append(containingModels);
		result.append(", relatedVariabilityGroupIds: ");
		result.append(relatedVariabilityGroupIds);
		result.append(", variability: ");
		result.append(variability);
		result.append(')');
		return result.toString();
	}

} //ContainerEntityImpl
