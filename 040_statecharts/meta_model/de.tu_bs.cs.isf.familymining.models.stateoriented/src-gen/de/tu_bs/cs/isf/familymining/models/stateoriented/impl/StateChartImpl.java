/**
 */
package de.tu_bs.cs.isf.familymining.models.stateoriented.impl;

import de.tu_bs.cs.isf.familymining.models.base.BasePackage;
import de.tu_bs.cs.isf.familymining.models.base.ParameterizedElement;

import de.tu_bs.cs.isf.familymining.models.base.impl.ModelEntityImpl;
import de.tu_bs.cs.isf.familymining.models.base.impl.StringToStringMapEntryImpl;

import de.tu_bs.cs.isf.familymining.models.stateoriented.Region;
import de.tu_bs.cs.isf.familymining.models.stateoriented.StateChart;
import de.tu_bs.cs.isf.familymining.models.stateoriented.StateChartsPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State Chart</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.familymining.models.stateoriented.impl.StateChartImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.models.stateoriented.impl.StateChartImpl#getStateCount <em>State Count</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.models.stateoriented.impl.StateChartImpl#getRegionCount <em>Region Count</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.models.stateoriented.impl.StateChartImpl#getTransitionCount <em>Transition Count</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.models.stateoriented.impl.StateChartImpl#getRootRegion <em>Root Region</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateChartImpl extends ModelEntityImpl implements StateChart {
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
	 * The default value of the '{@link #getStateCount() <em>State Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateCount()
	 * @generated
	 * @ordered
	 */
	protected static final int STATE_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStateCount() <em>State Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateCount()
	 * @generated
	 * @ordered
	 */
	protected int stateCount = STATE_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getRegionCount() <em>Region Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegionCount()
	 * @generated
	 * @ordered
	 */
	protected static final int REGION_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRegionCount() <em>Region Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegionCount()
	 * @generated
	 * @ordered
	 */
	protected int regionCount = REGION_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTransitionCount() <em>Transition Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitionCount()
	 * @generated
	 * @ordered
	 */
	protected static final int TRANSITION_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTransitionCount() <em>Transition Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitionCount()
	 * @generated
	 * @ordered
	 */
	protected int transitionCount = TRANSITION_COUNT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRootRegion() <em>Root Region</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootRegion()
	 * @generated
	 * @ordered
	 */
	protected Region rootRegion;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateChartImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StateChartsPackage.Literals.STATE_CHART;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getParameters() {
		if (parameters == null) {
			parameters = new EcoreEMap<String,String>(BasePackage.Literals.STRING_TO_STRING_MAP_ENTRY, StringToStringMapEntryImpl.class, this, StateChartsPackage.STATE_CHART__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getStateCount() {
		return stateCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStateCount(int newStateCount) {
		int oldStateCount = stateCount;
		stateCount = newStateCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StateChartsPackage.STATE_CHART__STATE_COUNT, oldStateCount, stateCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRegionCount() {
		return regionCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegionCount(int newRegionCount) {
		int oldRegionCount = regionCount;
		regionCount = newRegionCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StateChartsPackage.STATE_CHART__REGION_COUNT, oldRegionCount, regionCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTransitionCount() {
		return transitionCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransitionCount(int newTransitionCount) {
		int oldTransitionCount = transitionCount;
		transitionCount = newTransitionCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StateChartsPackage.STATE_CHART__TRANSITION_COUNT, oldTransitionCount, transitionCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Region getRootRegion() {
		return rootRegion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRootRegion(Region newRootRegion, NotificationChain msgs) {
		Region oldRootRegion = rootRegion;
		rootRegion = newRootRegion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StateChartsPackage.STATE_CHART__ROOT_REGION, oldRootRegion, newRootRegion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRootRegion(Region newRootRegion) {
		if (newRootRegion != rootRegion) {
			NotificationChain msgs = null;
			if (rootRegion != null)
				msgs = ((InternalEObject)rootRegion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StateChartsPackage.STATE_CHART__ROOT_REGION, null, msgs);
			if (newRootRegion != null)
				msgs = ((InternalEObject)newRootRegion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StateChartsPackage.STATE_CHART__ROOT_REGION, null, msgs);
			msgs = basicSetRootRegion(newRootRegion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StateChartsPackage.STATE_CHART__ROOT_REGION, newRootRegion, newRootRegion));
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
			case StateChartsPackage.STATE_CHART__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case StateChartsPackage.STATE_CHART__ROOT_REGION:
				return basicSetRootRegion(null, msgs);
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
			case StateChartsPackage.STATE_CHART__PARAMETERS:
				if (coreType) return getParameters();
				else return getParameters().map();
			case StateChartsPackage.STATE_CHART__STATE_COUNT:
				return getStateCount();
			case StateChartsPackage.STATE_CHART__REGION_COUNT:
				return getRegionCount();
			case StateChartsPackage.STATE_CHART__TRANSITION_COUNT:
				return getTransitionCount();
			case StateChartsPackage.STATE_CHART__ROOT_REGION:
				return getRootRegion();
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
			case StateChartsPackage.STATE_CHART__PARAMETERS:
				((EStructuralFeature.Setting)getParameters()).set(newValue);
				return;
			case StateChartsPackage.STATE_CHART__STATE_COUNT:
				setStateCount((Integer)newValue);
				return;
			case StateChartsPackage.STATE_CHART__REGION_COUNT:
				setRegionCount((Integer)newValue);
				return;
			case StateChartsPackage.STATE_CHART__TRANSITION_COUNT:
				setTransitionCount((Integer)newValue);
				return;
			case StateChartsPackage.STATE_CHART__ROOT_REGION:
				setRootRegion((Region)newValue);
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
			case StateChartsPackage.STATE_CHART__PARAMETERS:
				getParameters().clear();
				return;
			case StateChartsPackage.STATE_CHART__STATE_COUNT:
				setStateCount(STATE_COUNT_EDEFAULT);
				return;
			case StateChartsPackage.STATE_CHART__REGION_COUNT:
				setRegionCount(REGION_COUNT_EDEFAULT);
				return;
			case StateChartsPackage.STATE_CHART__TRANSITION_COUNT:
				setTransitionCount(TRANSITION_COUNT_EDEFAULT);
				return;
			case StateChartsPackage.STATE_CHART__ROOT_REGION:
				setRootRegion((Region)null);
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
			case StateChartsPackage.STATE_CHART__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case StateChartsPackage.STATE_CHART__STATE_COUNT:
				return stateCount != STATE_COUNT_EDEFAULT;
			case StateChartsPackage.STATE_CHART__REGION_COUNT:
				return regionCount != REGION_COUNT_EDEFAULT;
			case StateChartsPackage.STATE_CHART__TRANSITION_COUNT:
				return transitionCount != TRANSITION_COUNT_EDEFAULT;
			case StateChartsPackage.STATE_CHART__ROOT_REGION:
				return rootRegion != null;
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
				case StateChartsPackage.STATE_CHART__PARAMETERS: return BasePackage.PARAMETERIZED_ELEMENT__PARAMETERS;
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
				case BasePackage.PARAMETERIZED_ELEMENT__PARAMETERS: return StateChartsPackage.STATE_CHART__PARAMETERS;
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
				case BasePackage.PARAMETERIZED_ELEMENT___SET_PARAMETER__STRING_STRING: return StateChartsPackage.STATE_CHART___SET_PARAMETER__STRING_STRING;
				case BasePackage.PARAMETERIZED_ELEMENT___GET_PARAMETER__STRING: return StateChartsPackage.STATE_CHART___GET_PARAMETER__STRING;
				case BasePackage.PARAMETERIZED_ELEMENT___REMOVE_PARAMETER__STRING: return StateChartsPackage.STATE_CHART___REMOVE_PARAMETER__STRING;
				case BasePackage.PARAMETERIZED_ELEMENT___CONTAINS_PARAMETER__STRING: return StateChartsPackage.STATE_CHART___CONTAINS_PARAMETER__STRING;
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
			case StateChartsPackage.STATE_CHART___SET_PARAMETER__STRING_STRING:
				setParameter((String)arguments.get(0), (String)arguments.get(1));
				return null;
			case StateChartsPackage.STATE_CHART___GET_PARAMETER__STRING:
				return getParameter((String)arguments.get(0));
			case StateChartsPackage.STATE_CHART___REMOVE_PARAMETER__STRING:
				removeParameter((String)arguments.get(0));
				return null;
			case StateChartsPackage.STATE_CHART___CONTAINS_PARAMETER__STRING:
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
		result.append(" (stateCount: ");
		result.append(stateCount);
		result.append(", regionCount: ");
		result.append(regionCount);
		result.append(", transitionCount: ");
		result.append(transitionCount);
		result.append(')');
		return result.toString();
	}

} //StateChartImpl
