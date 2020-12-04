/**
 */
package de.tu_bs.cs.isf.familymining.models.stateoriented.impl;

import de.tu_bs.cs.isf.familymining.models.stateoriented.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StateChartsFactoryImpl extends EFactoryImpl implements StateChartsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StateChartsFactory init() {
		try {
			StateChartsFactory theStateChartsFactory = (StateChartsFactory)EPackage.Registry.INSTANCE.getEFactory(StateChartsPackage.eNS_URI);
			if (theStateChartsFactory != null) {
				return theStateChartsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new StateChartsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateChartsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case StateChartsPackage.STATE_CHART: return createStateChart();
			case StateChartsPackage.INITIAL_STATE: return createInitialState();
			case StateChartsPackage.FINAL_STATE: return createFinalState();
			case StateChartsPackage.TERMINATION_CONNECTOR: return createTerminationConnector();
			case StateChartsPackage.STATE: return createState();
			case StateChartsPackage.REGION: return createRegion();
			case StateChartsPackage.TRANSITION: return createTransition();
			case StateChartsPackage.TRANSITION_LABEL: return createTransitionLabel();
			case StateChartsPackage.ENTRY_ACTION: return createEntryAction();
			case StateChartsPackage.EXIT_ACTION: return createExitAction();
			case StateChartsPackage.DURING_ACTION: return createDuringAction();
			case StateChartsPackage.BIND_ACTION: return createBindAction();
			case StateChartsPackage.ON_ACTION: return createOnAction();
			case StateChartsPackage.CONDITION_ACTION: return createConditionAction();
			case StateChartsPackage.TRANSITION_ACTION: return createTransitionAction();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case StateChartsPackage.HISTORY_OPERATOR:
				return createHistoryOperatorFromString(eDataType, initialValue);
			case StateChartsPackage.TEMPORAL_OPERATOR:
				return createTemporalOperatorFromString(eDataType, initialValue);
			case StateChartsPackage.TRANSITION_TYPE:
				return createTransitionTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case StateChartsPackage.HISTORY_OPERATOR:
				return convertHistoryOperatorToString(eDataType, instanceValue);
			case StateChartsPackage.TEMPORAL_OPERATOR:
				return convertTemporalOperatorToString(eDataType, instanceValue);
			case StateChartsPackage.TRANSITION_TYPE:
				return convertTransitionTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateChart createStateChart() {
		StateChartImpl stateChart = new StateChartImpl();
		return stateChart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitialState createInitialState() {
		InitialStateImpl initialState = new InitialStateImpl();
		return initialState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinalState createFinalState() {
		FinalStateImpl finalState = new FinalStateImpl();
		return finalState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TerminationConnector createTerminationConnector() {
		TerminationConnectorImpl terminationConnector = new TerminationConnectorImpl();
		return terminationConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State createState() {
		StateImpl state = new StateImpl();
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Region createRegion() {
		RegionImpl region = new RegionImpl();
		return region;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition createTransition() {
		TransitionImpl transition = new TransitionImpl();
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionLabel createTransitionLabel() {
		TransitionLabelImpl transitionLabel = new TransitionLabelImpl();
		return transitionLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntryAction createEntryAction() {
		EntryActionImpl entryAction = new EntryActionImpl();
		return entryAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExitAction createExitAction() {
		ExitActionImpl exitAction = new ExitActionImpl();
		return exitAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DuringAction createDuringAction() {
		DuringActionImpl duringAction = new DuringActionImpl();
		return duringAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindAction createBindAction() {
		BindActionImpl bindAction = new BindActionImpl();
		return bindAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OnAction createOnAction() {
		OnActionImpl onAction = new OnActionImpl();
		return onAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionAction createConditionAction() {
		ConditionActionImpl conditionAction = new ConditionActionImpl();
		return conditionAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionAction createTransitionAction() {
		TransitionActionImpl transitionAction = new TransitionActionImpl();
		return transitionAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HistoryOperator createHistoryOperatorFromString(EDataType eDataType, String initialValue) {
		HistoryOperator result = HistoryOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHistoryOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemporalOperator createTemporalOperatorFromString(EDataType eDataType, String initialValue) {
		TemporalOperator result = TemporalOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTemporalOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionType createTransitionTypeFromString(EDataType eDataType, String initialValue) {
		TransitionType result = TransitionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTransitionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateChartsPackage getStateChartsPackage() {
		return (StateChartsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static StateChartsPackage getPackage() {
		return StateChartsPackage.eINSTANCE;
	}

} //StateChartsFactoryImpl
