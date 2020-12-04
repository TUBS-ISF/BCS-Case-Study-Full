/**
 */
package de.tu_bs.cs.isf.familymining.models.base.impl;

import de.tu_bs.cs.isf.familymining.models.base.BasePackage;
import de.tu_bs.cs.isf.familymining.models.base.VariableModel;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.familymining.models.base.impl.VariableModelImpl#getBaseModel <em>Base Model</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.models.base.impl.VariableModelImpl#getCompareModels <em>Compare Models</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.models.base.impl.VariableModelImpl#getContainingModels <em>Containing Models</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class VariableModelImpl extends VariableValueElementImpl implements VariableModel {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasePackage.Literals.VARIABLE_MODEL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.VARIABLE_MODEL__BASE_MODEL, oldBaseModel, baseModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getCompareModels() {
		if (compareModels == null) {
			compareModels = new EDataTypeUniqueEList<String>(String.class, this, BasePackage.VARIABLE_MODEL__COMPARE_MODELS);
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
			containingModels = new EDataTypeUniqueEList<String>(String.class, this, BasePackage.VARIABLE_MODEL__CONTAINING_MODELS);
		}
		return containingModels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BasePackage.VARIABLE_MODEL__BASE_MODEL:
				return getBaseModel();
			case BasePackage.VARIABLE_MODEL__COMPARE_MODELS:
				return getCompareModels();
			case BasePackage.VARIABLE_MODEL__CONTAINING_MODELS:
				return getContainingModels();
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
			case BasePackage.VARIABLE_MODEL__BASE_MODEL:
				setBaseModel((String)newValue);
				return;
			case BasePackage.VARIABLE_MODEL__COMPARE_MODELS:
				getCompareModels().clear();
				getCompareModels().addAll((Collection<? extends String>)newValue);
				return;
			case BasePackage.VARIABLE_MODEL__CONTAINING_MODELS:
				getContainingModels().clear();
				getContainingModels().addAll((Collection<? extends String>)newValue);
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
			case BasePackage.VARIABLE_MODEL__BASE_MODEL:
				setBaseModel(BASE_MODEL_EDEFAULT);
				return;
			case BasePackage.VARIABLE_MODEL__COMPARE_MODELS:
				getCompareModels().clear();
				return;
			case BasePackage.VARIABLE_MODEL__CONTAINING_MODELS:
				getContainingModels().clear();
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
			case BasePackage.VARIABLE_MODEL__BASE_MODEL:
				return BASE_MODEL_EDEFAULT == null ? baseModel != null : !BASE_MODEL_EDEFAULT.equals(baseModel);
			case BasePackage.VARIABLE_MODEL__COMPARE_MODELS:
				return compareModels != null && !compareModels.isEmpty();
			case BasePackage.VARIABLE_MODEL__CONTAINING_MODELS:
				return containingModels != null && !containingModels.isEmpty();
		}
		return super.eIsSet(featureID);
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
		result.append(')');
		return result.toString();
	}

} //VariableModelImpl
