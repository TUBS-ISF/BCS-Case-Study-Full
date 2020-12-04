/**
 */
package de.tu_bs.cs.isf.familymining.models.base.impl;

import de.tu_bs.cs.isf.familymining.models.base.BasePackage;
import de.tu_bs.cs.isf.familymining.models.base.Variability;
import de.tu_bs.cs.isf.familymining.models.base.VariableElement;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.familymining.models.base.impl.VariableElementImpl#getVariabilityGroupId <em>Variability Group Id</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.models.base.impl.VariableElementImpl#getContainingModels <em>Containing Models</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.models.base.impl.VariableElementImpl#getRelatedVariabilityGroupIds <em>Related Variability Group Ids</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.models.base.impl.VariableElementImpl#getVariability <em>Variability</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class VariableElementImpl extends VariableValueElementImpl implements VariableElement {
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
	protected VariableElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasePackage.Literals.VARIABLE_ELEMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.VARIABLE_ELEMENT__VARIABILITY_GROUP_ID, oldVariabilityGroupId, variabilityGroupId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getContainingModels() {
		if (containingModels == null) {
			containingModels = new EDataTypeUniqueEList<String>(String.class, this, BasePackage.VARIABLE_ELEMENT__CONTAINING_MODELS);
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
			relatedVariabilityGroupIds = new EDataTypeUniqueEList<String>(String.class, this, BasePackage.VARIABLE_ELEMENT__RELATED_VARIABILITY_GROUP_IDS);
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
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.VARIABLE_ELEMENT__VARIABILITY, oldVariability, variability));
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BasePackage.VARIABLE_ELEMENT__VARIABILITY_GROUP_ID:
				return getVariabilityGroupId();
			case BasePackage.VARIABLE_ELEMENT__CONTAINING_MODELS:
				return getContainingModels();
			case BasePackage.VARIABLE_ELEMENT__RELATED_VARIABILITY_GROUP_IDS:
				return getRelatedVariabilityGroupIds();
			case BasePackage.VARIABLE_ELEMENT__VARIABILITY:
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
			case BasePackage.VARIABLE_ELEMENT__VARIABILITY_GROUP_ID:
				setVariabilityGroupId((String)newValue);
				return;
			case BasePackage.VARIABLE_ELEMENT__CONTAINING_MODELS:
				getContainingModels().clear();
				getContainingModels().addAll((Collection<? extends String>)newValue);
				return;
			case BasePackage.VARIABLE_ELEMENT__RELATED_VARIABILITY_GROUP_IDS:
				getRelatedVariabilityGroupIds().clear();
				getRelatedVariabilityGroupIds().addAll((Collection<? extends String>)newValue);
				return;
			case BasePackage.VARIABLE_ELEMENT__VARIABILITY:
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
			case BasePackage.VARIABLE_ELEMENT__VARIABILITY_GROUP_ID:
				setVariabilityGroupId(VARIABILITY_GROUP_ID_EDEFAULT);
				return;
			case BasePackage.VARIABLE_ELEMENT__CONTAINING_MODELS:
				getContainingModels().clear();
				return;
			case BasePackage.VARIABLE_ELEMENT__RELATED_VARIABILITY_GROUP_IDS:
				getRelatedVariabilityGroupIds().clear();
				return;
			case BasePackage.VARIABLE_ELEMENT__VARIABILITY:
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
			case BasePackage.VARIABLE_ELEMENT__VARIABILITY_GROUP_ID:
				return VARIABILITY_GROUP_ID_EDEFAULT == null ? variabilityGroupId != null : !VARIABILITY_GROUP_ID_EDEFAULT.equals(variabilityGroupId);
			case BasePackage.VARIABLE_ELEMENT__CONTAINING_MODELS:
				return containingModels != null && !containingModels.isEmpty();
			case BasePackage.VARIABLE_ELEMENT__RELATED_VARIABILITY_GROUP_IDS:
				return relatedVariabilityGroupIds != null && !relatedVariabilityGroupIds.isEmpty();
			case BasePackage.VARIABLE_ELEMENT__VARIABILITY:
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case BasePackage.VARIABLE_ELEMENT___IS_CONTAINED_IN_MODEL__STRING:
				return isContainedInModel((String)arguments.get(0));
			case BasePackage.VARIABLE_ELEMENT___IS_MANDATORY:
				return isMandatory();
			case BasePackage.VARIABLE_ELEMENT___IS_ALTERNATIVE:
				return isAlternative();
			case BasePackage.VARIABLE_ELEMENT___IS_OPTIONAL:
				return isOptional();
			case BasePackage.VARIABLE_ELEMENT___IS_OPTIONAL_ALTERNATIVE:
				return isOptionalAlternative();
			case BasePackage.VARIABLE_ELEMENT___IS_VARIABILITY_SET:
				return isVariabilitySet();
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

} //VariableElementImpl
