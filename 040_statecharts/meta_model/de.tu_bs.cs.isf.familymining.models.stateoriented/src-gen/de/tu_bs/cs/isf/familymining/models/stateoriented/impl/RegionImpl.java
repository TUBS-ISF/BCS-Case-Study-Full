/**
 */
package de.tu_bs.cs.isf.familymining.models.stateoriented.impl;

import de.tu_bs.cs.isf.familymining.models.base.BasePackage;
import de.tu_bs.cs.isf.familymining.models.base.ParameterizedElement;

import de.tu_bs.cs.isf.familymining.models.base.impl.ContainerEntityImpl;
import de.tu_bs.cs.isf.familymining.models.base.impl.StringToStringMapEntryImpl;

import de.tu_bs.cs.isf.familymining.models.stateoriented.AbstractState;
import de.tu_bs.cs.isf.familymining.models.stateoriented.EndState;
import de.tu_bs.cs.isf.familymining.models.stateoriented.InitialState;
import de.tu_bs.cs.isf.familymining.models.stateoriented.Region;
import de.tu_bs.cs.isf.familymining.models.stateoriented.State;
import de.tu_bs.cs.isf.familymining.models.stateoriented.StateChartsPackage;

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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Region</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.familymining.models.stateoriented.impl.RegionImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.models.stateoriented.impl.RegionImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.models.stateoriented.impl.RegionImpl#getInitialStates <em>Initial States</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.models.stateoriented.impl.RegionImpl#getStates <em>States</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.models.stateoriented.impl.RegionImpl#getEndStates <em>End States</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.models.stateoriented.impl.RegionImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RegionImpl extends ContainerEntityImpl implements Region {
	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> parameters;

	/**
	 * The cached value of the '{@link #getParent() <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParent()
	 * @generated
	 * @ordered
	 */
	protected AbstractState parent;

	/**
	 * The cached value of the '{@link #getInitialStates() <em>Initial States</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialStates()
	 * @generated
	 * @ordered
	 */
	protected EList<InitialState> initialStates;

	/**
	 * The cached value of the '{@link #getStates() <em>States</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStates()
	 * @generated
	 * @ordered
	 */
	protected EList<State> states;

	/**
	 * The cached value of the '{@link #getEndStates() <em>End States</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndStates()
	 * @generated
	 * @ordered
	 */
	protected EList<EndState> endStates;

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
	protected RegionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StateChartsPackage.Literals.REGION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getParameters() {
		if (parameters == null) {
			parameters = new EcoreEMap<String,String>(BasePackage.Literals.STRING_TO_STRING_MAP_ENTRY, StringToStringMapEntryImpl.class, this, StateChartsPackage.REGION__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractState getParent() {
		if (parent != null && parent.eIsProxy()) {
			InternalEObject oldParent = (InternalEObject)parent;
			parent = (AbstractState)eResolveProxy(oldParent);
			if (parent != oldParent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StateChartsPackage.REGION__PARENT, oldParent, parent));
			}
		}
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractState basicGetParent() {
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(AbstractState newParent) {
		AbstractState oldParent = parent;
		parent = newParent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StateChartsPackage.REGION__PARENT, oldParent, parent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InitialState> getInitialStates() {
		if (initialStates == null) {
			initialStates = new EObjectContainmentEList<InitialState>(InitialState.class, this, StateChartsPackage.REGION__INITIAL_STATES);
		}
		return initialStates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getStates() {
		if (states == null) {
			states = new EObjectContainmentEList<State>(State.class, this, StateChartsPackage.REGION__STATES);
		}
		return states;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EndState> getEndStates() {
		if (endStates == null) {
			endStates = new EObjectContainmentEList<EndState>(EndState.class, this, StateChartsPackage.REGION__END_STATES);
		}
		return endStates;
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
			eNotify(new ENotificationImpl(this, Notification.SET, StateChartsPackage.REGION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter(final String key, final String value) {
		this.getParameters().put(key, value);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getParameter(final String key) {
		return this.getParameters().get(key);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeParameter(final String key) {
		this.getParameters().removeKey(key);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean containsParameter(final String key) {
		return this.getParameters().containsKey(key);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StateChartsPackage.REGION__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case StateChartsPackage.REGION__INITIAL_STATES:
				return ((InternalEList<?>)getInitialStates()).basicRemove(otherEnd, msgs);
			case StateChartsPackage.REGION__STATES:
				return ((InternalEList<?>)getStates()).basicRemove(otherEnd, msgs);
			case StateChartsPackage.REGION__END_STATES:
				return ((InternalEList<?>)getEndStates()).basicRemove(otherEnd, msgs);
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
			case StateChartsPackage.REGION__PARAMETERS:
				if (coreType) return getParameters();
				else return getParameters().map();
			case StateChartsPackage.REGION__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case StateChartsPackage.REGION__INITIAL_STATES:
				return getInitialStates();
			case StateChartsPackage.REGION__STATES:
				return getStates();
			case StateChartsPackage.REGION__END_STATES:
				return getEndStates();
			case StateChartsPackage.REGION__NAME:
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
			case StateChartsPackage.REGION__PARAMETERS:
				((EStructuralFeature.Setting)getParameters()).set(newValue);
				return;
			case StateChartsPackage.REGION__PARENT:
				setParent((AbstractState)newValue);
				return;
			case StateChartsPackage.REGION__INITIAL_STATES:
				getInitialStates().clear();
				getInitialStates().addAll((Collection<? extends InitialState>)newValue);
				return;
			case StateChartsPackage.REGION__STATES:
				getStates().clear();
				getStates().addAll((Collection<? extends State>)newValue);
				return;
			case StateChartsPackage.REGION__END_STATES:
				getEndStates().clear();
				getEndStates().addAll((Collection<? extends EndState>)newValue);
				return;
			case StateChartsPackage.REGION__NAME:
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
			case StateChartsPackage.REGION__PARAMETERS:
				getParameters().clear();
				return;
			case StateChartsPackage.REGION__PARENT:
				setParent((AbstractState)null);
				return;
			case StateChartsPackage.REGION__INITIAL_STATES:
				getInitialStates().clear();
				return;
			case StateChartsPackage.REGION__STATES:
				getStates().clear();
				return;
			case StateChartsPackage.REGION__END_STATES:
				getEndStates().clear();
				return;
			case StateChartsPackage.REGION__NAME:
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
			case StateChartsPackage.REGION__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case StateChartsPackage.REGION__PARENT:
				return parent != null;
			case StateChartsPackage.REGION__INITIAL_STATES:
				return initialStates != null && !initialStates.isEmpty();
			case StateChartsPackage.REGION__STATES:
				return states != null && !states.isEmpty();
			case StateChartsPackage.REGION__END_STATES:
				return endStates != null && !endStates.isEmpty();
			case StateChartsPackage.REGION__NAME:
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
		if (baseClass == ParameterizedElement.class) {
			switch (derivedFeatureID) {
				case StateChartsPackage.REGION__PARAMETERS: return BasePackage.PARAMETERIZED_ELEMENT__PARAMETERS;
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
		if (baseClass == ParameterizedElement.class) {
			switch (baseFeatureID) {
				case BasePackage.PARAMETERIZED_ELEMENT__PARAMETERS: return StateChartsPackage.REGION__PARAMETERS;
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
		if (baseClass == ParameterizedElement.class) {
			switch (baseOperationID) {
				case BasePackage.PARAMETERIZED_ELEMENT___SET_PARAMETER__STRING_STRING: return StateChartsPackage.REGION___SET_PARAMETER__STRING_STRING;
				case BasePackage.PARAMETERIZED_ELEMENT___GET_PARAMETER__STRING: return StateChartsPackage.REGION___GET_PARAMETER__STRING;
				case BasePackage.PARAMETERIZED_ELEMENT___REMOVE_PARAMETER__STRING: return StateChartsPackage.REGION___REMOVE_PARAMETER__STRING;
				case BasePackage.PARAMETERIZED_ELEMENT___CONTAINS_PARAMETER__STRING: return StateChartsPackage.REGION___CONTAINS_PARAMETER__STRING;
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
			case StateChartsPackage.REGION___SET_PARAMETER__STRING_STRING:
				setParameter((String)arguments.get(0), (String)arguments.get(1));
				return null;
			case StateChartsPackage.REGION___GET_PARAMETER__STRING:
				return getParameter((String)arguments.get(0));
			case StateChartsPackage.REGION___REMOVE_PARAMETER__STRING:
				removeParameter((String)arguments.get(0));
				return null;
			case StateChartsPackage.REGION___CONTAINS_PARAMETER__STRING:
				return containsParameter((String)arguments.get(0));
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //RegionImpl
