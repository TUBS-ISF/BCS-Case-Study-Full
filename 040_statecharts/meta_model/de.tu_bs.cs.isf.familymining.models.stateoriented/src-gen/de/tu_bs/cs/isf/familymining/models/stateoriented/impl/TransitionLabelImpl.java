/**
 */
package de.tu_bs.cs.isf.familymining.models.stateoriented.impl;

import de.tu_bs.cs.isf.familymining.models.base.BasePackage;
import de.tu_bs.cs.isf.familymining.models.base.Entity;

import de.tu_bs.cs.isf.familymining.models.base.impl.VariableElementImpl;

import de.tu_bs.cs.isf.familymining.models.stateoriented.ConditionAction;
import de.tu_bs.cs.isf.familymining.models.stateoriented.StateChartsPackage;
import de.tu_bs.cs.isf.familymining.models.stateoriented.TransitionAction;
import de.tu_bs.cs.isf.familymining.models.stateoriented.TransitionLabel;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition Label</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.familymining.models.stateoriented.impl.TransitionLabelImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.models.stateoriented.impl.TransitionLabelImpl#getEvents <em>Events</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.models.stateoriented.impl.TransitionLabelImpl#getConditions <em>Conditions</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.models.stateoriented.impl.TransitionLabelImpl#getConditionActions <em>Condition Actions</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.models.stateoriented.impl.TransitionLabelImpl#getTransitionActions <em>Transition Actions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionLabelImpl extends VariableElementImpl implements TransitionLabel {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEvents() <em>Events</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<String> events;

	/**
	 * The cached value of the '{@link #getConditions() <em>Conditions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditions()
	 * @generated
	 * @ordered
	 */
	protected EList<String> conditions;

	/**
	 * The cached value of the '{@link #getConditionActions() <em>Condition Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionActions()
	 * @generated
	 * @ordered
	 */
	protected EList<ConditionAction> conditionActions;

	/**
	 * The cached value of the '{@link #getTransitionActions() <em>Transition Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitionActions()
	 * @generated
	 * @ordered
	 */
	protected EList<TransitionAction> transitionActions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionLabelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StateChartsPackage.Literals.TRANSITION_LABEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StateChartsPackage.TRANSITION_LABEL__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getEvents() {
		if (events == null) {
			events = new EDataTypeUniqueEList<String>(String.class, this, StateChartsPackage.TRANSITION_LABEL__EVENTS);
		}
		return events;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getConditions() {
		if (conditions == null) {
			conditions = new EDataTypeUniqueEList<String>(String.class, this, StateChartsPackage.TRANSITION_LABEL__CONDITIONS);
		}
		return conditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConditionAction> getConditionActions() {
		if (conditionActions == null) {
			conditionActions = new EObjectContainmentEList<ConditionAction>(ConditionAction.class, this, StateChartsPackage.TRANSITION_LABEL__CONDITION_ACTIONS);
		}
		return conditionActions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TransitionAction> getTransitionActions() {
		if (transitionActions == null) {
			transitionActions = new EObjectContainmentEList<TransitionAction>(TransitionAction.class, this, StateChartsPackage.TRANSITION_LABEL__TRANSITION_ACTIONS);
		}
		return transitionActions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StateChartsPackage.TRANSITION_LABEL__CONDITION_ACTIONS:
				return ((InternalEList<?>)getConditionActions()).basicRemove(otherEnd, msgs);
			case StateChartsPackage.TRANSITION_LABEL__TRANSITION_ACTIONS:
				return ((InternalEList<?>)getTransitionActions()).basicRemove(otherEnd, msgs);
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
			case StateChartsPackage.TRANSITION_LABEL__ID:
				return getId();
			case StateChartsPackage.TRANSITION_LABEL__EVENTS:
				return getEvents();
			case StateChartsPackage.TRANSITION_LABEL__CONDITIONS:
				return getConditions();
			case StateChartsPackage.TRANSITION_LABEL__CONDITION_ACTIONS:
				return getConditionActions();
			case StateChartsPackage.TRANSITION_LABEL__TRANSITION_ACTIONS:
				return getTransitionActions();
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
			case StateChartsPackage.TRANSITION_LABEL__ID:
				setId((String)newValue);
				return;
			case StateChartsPackage.TRANSITION_LABEL__EVENTS:
				getEvents().clear();
				getEvents().addAll((Collection<? extends String>)newValue);
				return;
			case StateChartsPackage.TRANSITION_LABEL__CONDITIONS:
				getConditions().clear();
				getConditions().addAll((Collection<? extends String>)newValue);
				return;
			case StateChartsPackage.TRANSITION_LABEL__CONDITION_ACTIONS:
				getConditionActions().clear();
				getConditionActions().addAll((Collection<? extends ConditionAction>)newValue);
				return;
			case StateChartsPackage.TRANSITION_LABEL__TRANSITION_ACTIONS:
				getTransitionActions().clear();
				getTransitionActions().addAll((Collection<? extends TransitionAction>)newValue);
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
			case StateChartsPackage.TRANSITION_LABEL__ID:
				setId(ID_EDEFAULT);
				return;
			case StateChartsPackage.TRANSITION_LABEL__EVENTS:
				getEvents().clear();
				return;
			case StateChartsPackage.TRANSITION_LABEL__CONDITIONS:
				getConditions().clear();
				return;
			case StateChartsPackage.TRANSITION_LABEL__CONDITION_ACTIONS:
				getConditionActions().clear();
				return;
			case StateChartsPackage.TRANSITION_LABEL__TRANSITION_ACTIONS:
				getTransitionActions().clear();
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
			case StateChartsPackage.TRANSITION_LABEL__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case StateChartsPackage.TRANSITION_LABEL__EVENTS:
				return events != null && !events.isEmpty();
			case StateChartsPackage.TRANSITION_LABEL__CONDITIONS:
				return conditions != null && !conditions.isEmpty();
			case StateChartsPackage.TRANSITION_LABEL__CONDITION_ACTIONS:
				return conditionActions != null && !conditionActions.isEmpty();
			case StateChartsPackage.TRANSITION_LABEL__TRANSITION_ACTIONS:
				return transitionActions != null && !transitionActions.isEmpty();
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
		if (baseClass == Entity.class) {
			switch (derivedFeatureID) {
				case StateChartsPackage.TRANSITION_LABEL__ID: return BasePackage.ENTITY__ID;
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
		if (baseClass == Entity.class) {
			switch (baseFeatureID) {
				case BasePackage.ENTITY__ID: return StateChartsPackage.TRANSITION_LABEL__ID;
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
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", events: ");
		result.append(events);
		result.append(", conditions: ");
		result.append(conditions);
		result.append(')');
		return result.toString();
	}

} //TransitionLabelImpl
