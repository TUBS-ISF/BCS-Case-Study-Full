/**
 */
package de.tu_bs.cs.isf.familymining.models.stateoriented.impl;

import de.tu_bs.cs.isf.familymining.models.base.BasePackage;

import de.tu_bs.cs.isf.familymining.models.stateoriented.AbstractState;
import de.tu_bs.cs.isf.familymining.models.stateoriented.Action;
import de.tu_bs.cs.isf.familymining.models.stateoriented.BindAction;
import de.tu_bs.cs.isf.familymining.models.stateoriented.ConditionAction;
import de.tu_bs.cs.isf.familymining.models.stateoriented.DuringAction;
import de.tu_bs.cs.isf.familymining.models.stateoriented.EndState;
import de.tu_bs.cs.isf.familymining.models.stateoriented.EntryAction;
import de.tu_bs.cs.isf.familymining.models.stateoriented.ExitAction;
import de.tu_bs.cs.isf.familymining.models.stateoriented.FinalState;
import de.tu_bs.cs.isf.familymining.models.stateoriented.HistoryOperator;
import de.tu_bs.cs.isf.familymining.models.stateoriented.IncomingState;
import de.tu_bs.cs.isf.familymining.models.stateoriented.InitialState;
import de.tu_bs.cs.isf.familymining.models.stateoriented.LabelAction;
import de.tu_bs.cs.isf.familymining.models.stateoriented.OnAction;
import de.tu_bs.cs.isf.familymining.models.stateoriented.OutgoingState;
import de.tu_bs.cs.isf.familymining.models.stateoriented.Region;
import de.tu_bs.cs.isf.familymining.models.stateoriented.State;
import de.tu_bs.cs.isf.familymining.models.stateoriented.StateAction;
import de.tu_bs.cs.isf.familymining.models.stateoriented.StateChart;
import de.tu_bs.cs.isf.familymining.models.stateoriented.StateChartsFactory;
import de.tu_bs.cs.isf.familymining.models.stateoriented.StateChartsPackage;
import de.tu_bs.cs.isf.familymining.models.stateoriented.TemporalOperator;
import de.tu_bs.cs.isf.familymining.models.stateoriented.TerminationConnector;
import de.tu_bs.cs.isf.familymining.models.stateoriented.Transition;
import de.tu_bs.cs.isf.familymining.models.stateoriented.TransitionAction;
import de.tu_bs.cs.isf.familymining.models.stateoriented.TransitionLabel;
import de.tu_bs.cs.isf.familymining.models.stateoriented.TransitionType;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StateChartsPackageImpl extends EPackageImpl implements StateChartsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateChartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initialStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass endStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass finalStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass terminationConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass incomingStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outgoingStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass regionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionLabelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entryActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exitActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass duringActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bindActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass onActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labelActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum historyOperatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum temporalOperatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum transitionTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.StateChartsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private StateChartsPackageImpl() {
		super(eNS_URI, StateChartsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link StateChartsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static StateChartsPackage init() {
		if (isInited) return (StateChartsPackage)EPackage.Registry.INSTANCE.getEPackage(StateChartsPackage.eNS_URI);

		// Obtain or create and register package
		StateChartsPackageImpl theStateChartsPackage = (StateChartsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof StateChartsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new StateChartsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		BasePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theStateChartsPackage.createPackageContents();

		// Initialize created meta-data
		theStateChartsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theStateChartsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(StateChartsPackage.eNS_URI, theStateChartsPackage);
		return theStateChartsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStateChart() {
		return stateChartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStateChart_StateCount() {
		return (EAttribute)stateChartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStateChart_RegionCount() {
		return (EAttribute)stateChartEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStateChart_TransitionCount() {
		return (EAttribute)stateChartEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStateChart_RootRegion() {
		return (EReference)stateChartEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractState() {
		return abstractStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractState_Parent() {
		return (EReference)abstractStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractState_Stereotypes() {
		return (EAttribute)abstractStateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractState_Name() {
		return (EAttribute)abstractStateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractState__IsHierarchical() {
		return abstractStateEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractState__IsParallel() {
		return abstractStateEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInitialState() {
		return initialStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEndState() {
		return endStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFinalState() {
		return finalStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTerminationConnector() {
		return terminationConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIncomingState() {
		return incomingStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIncomingState_IncomingTransitions() {
		return (EReference)incomingStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutgoingState() {
		return outgoingStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutgoingState_OutgoingTransitions() {
		return (EReference)outgoingStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getState() {
		return stateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getState_History() {
		return (EAttribute)stateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_Actions() {
		return (EReference)stateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_Regions() {
		return (EReference)stateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegion() {
		return regionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegion_Parent() {
		return (EReference)regionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegion_InitialStates() {
		return (EReference)regionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegion_States() {
		return (EReference)regionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegion_EndStates() {
		return (EReference)regionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegion_Name() {
		return (EAttribute)regionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransition() {
		return transitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransition_Priority() {
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransition_Type() {
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransition_Stereotypes() {
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Source() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Target() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Label() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransition_Name() {
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransitionLabel() {
		return transitionLabelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransitionLabel_Events() {
		return (EAttribute)transitionLabelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransitionLabel_Conditions() {
		return (EAttribute)transitionLabelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransitionLabel_ConditionActions() {
		return (EReference)transitionLabelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransitionLabel_TransitionActions() {
		return (EReference)transitionLabelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAction() {
		return actionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAction_Code() {
		return (EAttribute)actionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStateAction() {
		return stateActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntryAction() {
		return entryActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExitAction() {
		return exitActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDuringAction() {
		return duringActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBindAction() {
		return bindActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOnAction() {
		return onActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOnAction_TemporalValue() {
		return (EAttribute)onActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOnAction_TemporalOperator() {
		return (EAttribute)onActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLabelAction() {
		return labelActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionAction() {
		return conditionActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransitionAction() {
		return transitionActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getHistoryOperator() {
		return historyOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTemporalOperator() {
		return temporalOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTransitionType() {
		return transitionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateChartsFactory getStateChartsFactory() {
		return (StateChartsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		stateChartEClass = createEClass(STATE_CHART);
		createEAttribute(stateChartEClass, STATE_CHART__STATE_COUNT);
		createEAttribute(stateChartEClass, STATE_CHART__REGION_COUNT);
		createEAttribute(stateChartEClass, STATE_CHART__TRANSITION_COUNT);
		createEReference(stateChartEClass, STATE_CHART__ROOT_REGION);

		abstractStateEClass = createEClass(ABSTRACT_STATE);
		createEReference(abstractStateEClass, ABSTRACT_STATE__PARENT);
		createEAttribute(abstractStateEClass, ABSTRACT_STATE__STEREOTYPES);
		createEAttribute(abstractStateEClass, ABSTRACT_STATE__NAME);
		createEOperation(abstractStateEClass, ABSTRACT_STATE___IS_HIERARCHICAL);
		createEOperation(abstractStateEClass, ABSTRACT_STATE___IS_PARALLEL);

		initialStateEClass = createEClass(INITIAL_STATE);

		endStateEClass = createEClass(END_STATE);

		finalStateEClass = createEClass(FINAL_STATE);

		terminationConnectorEClass = createEClass(TERMINATION_CONNECTOR);

		incomingStateEClass = createEClass(INCOMING_STATE);
		createEReference(incomingStateEClass, INCOMING_STATE__INCOMING_TRANSITIONS);

		outgoingStateEClass = createEClass(OUTGOING_STATE);
		createEReference(outgoingStateEClass, OUTGOING_STATE__OUTGOING_TRANSITIONS);

		stateEClass = createEClass(STATE);
		createEAttribute(stateEClass, STATE__HISTORY);
		createEReference(stateEClass, STATE__ACTIONS);
		createEReference(stateEClass, STATE__REGIONS);

		regionEClass = createEClass(REGION);
		createEReference(regionEClass, REGION__PARENT);
		createEReference(regionEClass, REGION__INITIAL_STATES);
		createEReference(regionEClass, REGION__STATES);
		createEReference(regionEClass, REGION__END_STATES);
		createEAttribute(regionEClass, REGION__NAME);

		transitionEClass = createEClass(TRANSITION);
		createEAttribute(transitionEClass, TRANSITION__PRIORITY);
		createEAttribute(transitionEClass, TRANSITION__TYPE);
		createEAttribute(transitionEClass, TRANSITION__STEREOTYPES);
		createEReference(transitionEClass, TRANSITION__SOURCE);
		createEReference(transitionEClass, TRANSITION__TARGET);
		createEReference(transitionEClass, TRANSITION__LABEL);
		createEAttribute(transitionEClass, TRANSITION__NAME);

		transitionLabelEClass = createEClass(TRANSITION_LABEL);
		createEAttribute(transitionLabelEClass, TRANSITION_LABEL__EVENTS);
		createEAttribute(transitionLabelEClass, TRANSITION_LABEL__CONDITIONS);
		createEReference(transitionLabelEClass, TRANSITION_LABEL__CONDITION_ACTIONS);
		createEReference(transitionLabelEClass, TRANSITION_LABEL__TRANSITION_ACTIONS);

		actionEClass = createEClass(ACTION);
		createEAttribute(actionEClass, ACTION__CODE);

		stateActionEClass = createEClass(STATE_ACTION);

		entryActionEClass = createEClass(ENTRY_ACTION);

		exitActionEClass = createEClass(EXIT_ACTION);

		duringActionEClass = createEClass(DURING_ACTION);

		bindActionEClass = createEClass(BIND_ACTION);

		onActionEClass = createEClass(ON_ACTION);
		createEAttribute(onActionEClass, ON_ACTION__TEMPORAL_VALUE);
		createEAttribute(onActionEClass, ON_ACTION__TEMPORAL_OPERATOR);

		labelActionEClass = createEClass(LABEL_ACTION);

		conditionActionEClass = createEClass(CONDITION_ACTION);

		transitionActionEClass = createEClass(TRANSITION_ACTION);

		// Create enums
		historyOperatorEEnum = createEEnum(HISTORY_OPERATOR);
		temporalOperatorEEnum = createEEnum(TEMPORAL_OPERATOR);
		transitionTypeEEnum = createEEnum(TRANSITION_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		BasePackage theBasePackage = (BasePackage)EPackage.Registry.INSTANCE.getEPackage(BasePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		stateChartEClass.getESuperTypes().add(theBasePackage.getModelEntity());
		stateChartEClass.getESuperTypes().add(theBasePackage.getVariableModel());
		stateChartEClass.getESuperTypes().add(theBasePackage.getParameterizedElement());
		abstractStateEClass.getESuperTypes().add(theBasePackage.getNodeEntity());
		abstractStateEClass.getESuperTypes().add(theBasePackage.getVariableElement());
		abstractStateEClass.getESuperTypes().add(theBasePackage.getParameterizedElement());
		initialStateEClass.getESuperTypes().add(this.getState());
		endStateEClass.getESuperTypes().add(this.getIncomingState());
		finalStateEClass.getESuperTypes().add(this.getEndState());
		terminationConnectorEClass.getESuperTypes().add(this.getEndState());
		incomingStateEClass.getESuperTypes().add(this.getAbstractState());
		outgoingStateEClass.getESuperTypes().add(this.getAbstractState());
		stateEClass.getESuperTypes().add(this.getIncomingState());
		stateEClass.getESuperTypes().add(this.getOutgoingState());
		regionEClass.getESuperTypes().add(theBasePackage.getContainerEntity());
		regionEClass.getESuperTypes().add(theBasePackage.getVariableElement());
		regionEClass.getESuperTypes().add(theBasePackage.getParameterizedElement());
		transitionEClass.getESuperTypes().add(theBasePackage.getEdgeEntity());
		transitionEClass.getESuperTypes().add(theBasePackage.getVariableElement());
		transitionEClass.getESuperTypes().add(theBasePackage.getParameterizedElement());
		transitionLabelEClass.getESuperTypes().add(theBasePackage.getVariableElement());
		transitionLabelEClass.getESuperTypes().add(theBasePackage.getEntity());
		actionEClass.getESuperTypes().add(theBasePackage.getVariableElement());
		actionEClass.getESuperTypes().add(theBasePackage.getEntity());
		stateActionEClass.getESuperTypes().add(this.getAction());
		entryActionEClass.getESuperTypes().add(this.getStateAction());
		exitActionEClass.getESuperTypes().add(this.getStateAction());
		duringActionEClass.getESuperTypes().add(this.getStateAction());
		bindActionEClass.getESuperTypes().add(this.getStateAction());
		onActionEClass.getESuperTypes().add(this.getStateAction());
		labelActionEClass.getESuperTypes().add(this.getAction());
		conditionActionEClass.getESuperTypes().add(this.getLabelAction());
		transitionActionEClass.getESuperTypes().add(this.getLabelAction());

		// Initialize classes, features, and operations; add parameters
		initEClass(stateChartEClass, StateChart.class, "StateChart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStateChart_StateCount(), ecorePackage.getEInt(), "stateCount", "0", 1, 1, StateChart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStateChart_RegionCount(), ecorePackage.getEInt(), "regionCount", "0", 1, 1, StateChart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStateChart_TransitionCount(), ecorePackage.getEInt(), "transitionCount", "0", 1, 1, StateChart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStateChart_RootRegion(), this.getRegion(), null, "rootRegion", null, 1, 1, StateChart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractStateEClass, AbstractState.class, "AbstractState", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractState_Parent(), this.getRegion(), null, "parent", null, 1, 1, AbstractState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractState_Stereotypes(), ecorePackage.getEString(), "stereotypes", null, 0, -1, AbstractState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractState_Name(), ecorePackage.getEString(), "name", null, 1, 1, AbstractState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getAbstractState__IsHierarchical(), ecorePackage.getEBoolean(), "isHierarchical", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getAbstractState__IsParallel(), ecorePackage.getEBoolean(), "isParallel", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(initialStateEClass, InitialState.class, "InitialState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(endStateEClass, EndState.class, "EndState", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(finalStateEClass, FinalState.class, "FinalState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(terminationConnectorEClass, TerminationConnector.class, "TerminationConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(incomingStateEClass, IncomingState.class, "IncomingState", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIncomingState_IncomingTransitions(), this.getTransition(), null, "incomingTransitions", null, 0, -1, IncomingState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(outgoingStateEClass, OutgoingState.class, "OutgoingState", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOutgoingState_OutgoingTransitions(), this.getTransition(), null, "outgoingTransitions", null, 0, -1, OutgoingState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stateEClass, State.class, "State", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getState_History(), this.getHistoryOperator(), "history", "NONE", 1, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getState_Actions(), this.getStateAction(), null, "actions", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getState_Regions(), this.getRegion(), null, "regions", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(regionEClass, Region.class, "Region", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRegion_Parent(), this.getAbstractState(), null, "parent", null, 1, 1, Region.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRegion_InitialStates(), this.getInitialState(), null, "initialStates", null, 0, -1, Region.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRegion_States(), this.getState(), null, "states", null, 1, -1, Region.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRegion_EndStates(), this.getEndState(), null, "endStates", null, 0, -1, Region.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegion_Name(), ecorePackage.getEString(), "name", null, 1, 1, Region.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransition_Priority(), ecorePackage.getEInt(), "priority", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_Type(), this.getTransitionType(), "type", "NORMAL", 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_Stereotypes(), ecorePackage.getEString(), "stereotypes", null, 0, -1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Source(), this.getOutgoingState(), null, "source", null, 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Target(), this.getIncomingState(), null, "target", null, 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Label(), this.getTransitionLabel(), null, "label", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_Name(), ecorePackage.getEString(), "name", null, 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transitionLabelEClass, TransitionLabel.class, "TransitionLabel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransitionLabel_Events(), ecorePackage.getEString(), "events", null, 0, -1, TransitionLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransitionLabel_Conditions(), ecorePackage.getEString(), "conditions", null, 0, -1, TransitionLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransitionLabel_ConditionActions(), this.getConditionAction(), null, "conditionActions", null, 0, -1, TransitionLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransitionLabel_TransitionActions(), this.getTransitionAction(), null, "transitionActions", null, 0, -1, TransitionLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actionEClass, Action.class, "Action", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAction_Code(), ecorePackage.getEString(), "code", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stateActionEClass, StateAction.class, "StateAction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(entryActionEClass, EntryAction.class, "EntryAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(exitActionEClass, ExitAction.class, "ExitAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(duringActionEClass, DuringAction.class, "DuringAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bindActionEClass, BindAction.class, "BindAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(onActionEClass, OnAction.class, "OnAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOnAction_TemporalValue(), ecorePackage.getEInt(), "temporalValue", null, 1, 1, OnAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOnAction_TemporalOperator(), this.getTemporalOperator(), "temporalOperator", "AFTER", 1, 1, OnAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(labelActionEClass, LabelAction.class, "LabelAction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(conditionActionEClass, ConditionAction.class, "ConditionAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(transitionActionEClass, TransitionAction.class, "TransitionAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(historyOperatorEEnum, HistoryOperator.class, "HistoryOperator");
		addEEnumLiteral(historyOperatorEEnum, HistoryOperator.NONE);
		addEEnumLiteral(historyOperatorEEnum, HistoryOperator.SHALLOW);
		addEEnumLiteral(historyOperatorEEnum, HistoryOperator.DEEP);

		initEEnum(temporalOperatorEEnum, TemporalOperator.class, "TemporalOperator");
		addEEnumLiteral(temporalOperatorEEnum, TemporalOperator.AFTER);
		addEEnumLiteral(temporalOperatorEEnum, TemporalOperator.BEFORE);
		addEEnumLiteral(temporalOperatorEEnum, TemporalOperator.EVERY);
		addEEnumLiteral(temporalOperatorEEnum, TemporalOperator.AT);

		initEEnum(transitionTypeEEnum, TransitionType.class, "TransitionType");
		addEEnumLiteral(transitionTypeEEnum, TransitionType.NORMAL);
		addEEnumLiteral(transitionTypeEEnum, TransitionType.WEAK);
		addEEnumLiteral(transitionTypeEEnum, TransitionType.STRONG);
		addEEnumLiteral(transitionTypeEEnum, TransitionType.SYNCHRO);
		addEEnumLiteral(transitionTypeEEnum, TransitionType.RESUMING);

		// Create resource
		createResource(eNS_URI);
	}

} //StateChartsPackageImpl
