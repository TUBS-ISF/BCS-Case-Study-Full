/**
 */
package de.tu_bs.cs.isf.familymining.models.stateoriented.impl;

import de.tu_bs.cs.isf.familymining.models.stateoriented.HistoryOperator;
import de.tu_bs.cs.isf.familymining.models.stateoriented.OutgoingState;
import de.tu_bs.cs.isf.familymining.models.stateoriented.Region;
import de.tu_bs.cs.isf.familymining.models.stateoriented.State;
import de.tu_bs.cs.isf.familymining.models.stateoriented.StateAction;
import de.tu_bs.cs.isf.familymining.models.stateoriented.StateChartsPackage;
import de.tu_bs.cs.isf.familymining.models.stateoriented.Transition;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.familymining.models.stateoriented.impl.StateImpl#getOutgoingTransitions <em>Outgoing Transitions</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.models.stateoriented.impl.StateImpl#getHistory <em>History</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.models.stateoriented.impl.StateImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.models.stateoriented.impl.StateImpl#getRegions <em>Regions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateImpl extends IncomingStateImpl implements State {
	/**
	 * The cached value of the '{@link #getOutgoingTransitions() <em>Outgoing Transitions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoingTransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> outgoingTransitions;

	/**
	 * The default value of the '{@link #getHistory() <em>History</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHistory()
	 * @generated
	 * @ordered
	 */
	protected static final HistoryOperator HISTORY_EDEFAULT = HistoryOperator.NONE;

	/**
	 * The cached value of the '{@link #getHistory() <em>History</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHistory()
	 * @generated
	 * @ordered
	 */
	protected HistoryOperator history = HISTORY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getActions() <em>Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected EList<StateAction> actions;

	/**
	 * The cached value of the '{@link #getRegions() <em>Regions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegions()
	 * @generated
	 * @ordered
	 */
	protected EList<Region> regions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StateChartsPackage.Literals.STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getOutgoingTransitions() {
		if (outgoingTransitions == null) {
			outgoingTransitions = new EObjectResolvingEList<Transition>(Transition.class, this, StateChartsPackage.STATE__OUTGOING_TRANSITIONS);
		}
		return outgoingTransitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HistoryOperator getHistory() {
		return history;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHistory(HistoryOperator newHistory) {
		HistoryOperator oldHistory = history;
		history = newHistory == null ? HISTORY_EDEFAULT : newHistory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StateChartsPackage.STATE__HISTORY, oldHistory, history));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StateAction> getActions() {
		if (actions == null) {
			actions = new EObjectContainmentEList<StateAction>(StateAction.class, this, StateChartsPackage.STATE__ACTIONS);
		}
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Region> getRegions() {
		if (regions == null) {
			regions = new EObjectContainmentEList<Region>(Region.class, this, StateChartsPackage.STATE__REGIONS);
		}
		return regions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StateChartsPackage.STATE__ACTIONS:
				return ((InternalEList<?>)getActions()).basicRemove(otherEnd, msgs);
			case StateChartsPackage.STATE__REGIONS:
				return ((InternalEList<?>)getRegions()).basicRemove(otherEnd, msgs);
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
			case StateChartsPackage.STATE__OUTGOING_TRANSITIONS:
				return getOutgoingTransitions();
			case StateChartsPackage.STATE__HISTORY:
				return getHistory();
			case StateChartsPackage.STATE__ACTIONS:
				return getActions();
			case StateChartsPackage.STATE__REGIONS:
				return getRegions();
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
			case StateChartsPackage.STATE__OUTGOING_TRANSITIONS:
				getOutgoingTransitions().clear();
				getOutgoingTransitions().addAll((Collection<? extends Transition>)newValue);
				return;
			case StateChartsPackage.STATE__HISTORY:
				setHistory((HistoryOperator)newValue);
				return;
			case StateChartsPackage.STATE__ACTIONS:
				getActions().clear();
				getActions().addAll((Collection<? extends StateAction>)newValue);
				return;
			case StateChartsPackage.STATE__REGIONS:
				getRegions().clear();
				getRegions().addAll((Collection<? extends Region>)newValue);
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
			case StateChartsPackage.STATE__OUTGOING_TRANSITIONS:
				getOutgoingTransitions().clear();
				return;
			case StateChartsPackage.STATE__HISTORY:
				setHistory(HISTORY_EDEFAULT);
				return;
			case StateChartsPackage.STATE__ACTIONS:
				getActions().clear();
				return;
			case StateChartsPackage.STATE__REGIONS:
				getRegions().clear();
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
			case StateChartsPackage.STATE__OUTGOING_TRANSITIONS:
				return outgoingTransitions != null && !outgoingTransitions.isEmpty();
			case StateChartsPackage.STATE__HISTORY:
				return history != HISTORY_EDEFAULT;
			case StateChartsPackage.STATE__ACTIONS:
				return actions != null && !actions.isEmpty();
			case StateChartsPackage.STATE__REGIONS:
				return regions != null && !regions.isEmpty();
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
		if (baseClass == OutgoingState.class) {
			switch (derivedFeatureID) {
				case StateChartsPackage.STATE__OUTGOING_TRANSITIONS: return StateChartsPackage.OUTGOING_STATE__OUTGOING_TRANSITIONS;
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
		if (baseClass == OutgoingState.class) {
			switch (baseFeatureID) {
				case StateChartsPackage.OUTGOING_STATE__OUTGOING_TRANSITIONS: return StateChartsPackage.STATE__OUTGOING_TRANSITIONS;
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
		result.append(" (history: ");
		result.append(history);
		result.append(')');
		return result.toString();
	}

} //StateImpl
