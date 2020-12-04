/**
 */
package de.tu_bs.cs.isf.familymining.models.stateoriented.impl;

import de.tu_bs.cs.isf.familymining.models.stateoriented.OnAction;
import de.tu_bs.cs.isf.familymining.models.stateoriented.StateChartsPackage;
import de.tu_bs.cs.isf.familymining.models.stateoriented.TemporalOperator;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>On Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.familymining.models.stateoriented.impl.OnActionImpl#getTemporalValue <em>Temporal Value</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.models.stateoriented.impl.OnActionImpl#getTemporalOperator <em>Temporal Operator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OnActionImpl extends StateActionImpl implements OnAction {
	/**
	 * The default value of the '{@link #getTemporalValue() <em>Temporal Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemporalValue()
	 * @generated
	 * @ordered
	 */
	protected static final int TEMPORAL_VALUE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTemporalValue() <em>Temporal Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemporalValue()
	 * @generated
	 * @ordered
	 */
	protected int temporalValue = TEMPORAL_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTemporalOperator() <em>Temporal Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemporalOperator()
	 * @generated
	 * @ordered
	 */
	protected static final TemporalOperator TEMPORAL_OPERATOR_EDEFAULT = TemporalOperator.AFTER;

	/**
	 * The cached value of the '{@link #getTemporalOperator() <em>Temporal Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemporalOperator()
	 * @generated
	 * @ordered
	 */
	protected TemporalOperator temporalOperator = TEMPORAL_OPERATOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OnActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StateChartsPackage.Literals.ON_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTemporalValue() {
		return temporalValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemporalValue(int newTemporalValue) {
		int oldTemporalValue = temporalValue;
		temporalValue = newTemporalValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StateChartsPackage.ON_ACTION__TEMPORAL_VALUE, oldTemporalValue, temporalValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemporalOperator getTemporalOperator() {
		return temporalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemporalOperator(TemporalOperator newTemporalOperator) {
		TemporalOperator oldTemporalOperator = temporalOperator;
		temporalOperator = newTemporalOperator == null ? TEMPORAL_OPERATOR_EDEFAULT : newTemporalOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StateChartsPackage.ON_ACTION__TEMPORAL_OPERATOR, oldTemporalOperator, temporalOperator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StateChartsPackage.ON_ACTION__TEMPORAL_VALUE:
				return getTemporalValue();
			case StateChartsPackage.ON_ACTION__TEMPORAL_OPERATOR:
				return getTemporalOperator();
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
			case StateChartsPackage.ON_ACTION__TEMPORAL_VALUE:
				setTemporalValue((Integer)newValue);
				return;
			case StateChartsPackage.ON_ACTION__TEMPORAL_OPERATOR:
				setTemporalOperator((TemporalOperator)newValue);
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
			case StateChartsPackage.ON_ACTION__TEMPORAL_VALUE:
				setTemporalValue(TEMPORAL_VALUE_EDEFAULT);
				return;
			case StateChartsPackage.ON_ACTION__TEMPORAL_OPERATOR:
				setTemporalOperator(TEMPORAL_OPERATOR_EDEFAULT);
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
			case StateChartsPackage.ON_ACTION__TEMPORAL_VALUE:
				return temporalValue != TEMPORAL_VALUE_EDEFAULT;
			case StateChartsPackage.ON_ACTION__TEMPORAL_OPERATOR:
				return temporalOperator != TEMPORAL_OPERATOR_EDEFAULT;
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
		result.append(" (temporalValue: ");
		result.append(temporalValue);
		result.append(", temporalOperator: ");
		result.append(temporalOperator);
		result.append(')');
		return result.toString();
	}

} //OnActionImpl
