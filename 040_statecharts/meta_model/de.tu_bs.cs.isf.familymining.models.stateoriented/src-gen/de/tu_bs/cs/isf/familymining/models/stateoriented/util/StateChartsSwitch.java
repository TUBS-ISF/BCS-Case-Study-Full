/**
 */
package de.tu_bs.cs.isf.familymining.models.stateoriented.util;

import de.tu_bs.cs.isf.familymining.models.base.ContainerEntity;
import de.tu_bs.cs.isf.familymining.models.base.EdgeEntity;
import de.tu_bs.cs.isf.familymining.models.base.Entity;
import de.tu_bs.cs.isf.familymining.models.base.ModelEntity;
import de.tu_bs.cs.isf.familymining.models.base.NodeEntity;
import de.tu_bs.cs.isf.familymining.models.base.ParameterizedElement;
import de.tu_bs.cs.isf.familymining.models.base.VariableElement;
import de.tu_bs.cs.isf.familymining.models.base.VariableModel;
import de.tu_bs.cs.isf.familymining.models.base.VariableValueElement;

import de.tu_bs.cs.isf.familymining.models.stateoriented.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.StateChartsPackage
 * @generated
 */
public class StateChartsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static StateChartsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateChartsSwitch() {
		if (modelPackage == null) {
			modelPackage = StateChartsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case StateChartsPackage.STATE_CHART: {
				StateChart stateChart = (StateChart)theEObject;
				T result = caseStateChart(stateChart);
				if (result == null) result = caseModelEntity(stateChart);
				if (result == null) result = caseParameterizedElement(stateChart);
				if (result == null) result = caseEntity(stateChart);
				if (result == null) result = caseVariableModel(stateChart);
				if (result == null) result = caseVariableValueElement(stateChart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StateChartsPackage.ABSTRACT_STATE: {
				AbstractState abstractState = (AbstractState)theEObject;
				T result = caseAbstractState(abstractState);
				if (result == null) result = caseNodeEntity(abstractState);
				if (result == null) result = caseParameterizedElement(abstractState);
				if (result == null) result = caseEntity(abstractState);
				if (result == null) result = caseVariableElement(abstractState);
				if (result == null) result = caseVariableValueElement(abstractState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StateChartsPackage.INITIAL_STATE: {
				InitialState initialState = (InitialState)theEObject;
				T result = caseInitialState(initialState);
				if (result == null) result = caseState(initialState);
				if (result == null) result = caseIncomingState(initialState);
				if (result == null) result = caseOutgoingState(initialState);
				if (result == null) result = caseAbstractState(initialState);
				if (result == null) result = caseNodeEntity(initialState);
				if (result == null) result = caseParameterizedElement(initialState);
				if (result == null) result = caseEntity(initialState);
				if (result == null) result = caseVariableElement(initialState);
				if (result == null) result = caseVariableValueElement(initialState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StateChartsPackage.END_STATE: {
				EndState endState = (EndState)theEObject;
				T result = caseEndState(endState);
				if (result == null) result = caseIncomingState(endState);
				if (result == null) result = caseAbstractState(endState);
				if (result == null) result = caseNodeEntity(endState);
				if (result == null) result = caseParameterizedElement(endState);
				if (result == null) result = caseEntity(endState);
				if (result == null) result = caseVariableElement(endState);
				if (result == null) result = caseVariableValueElement(endState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StateChartsPackage.FINAL_STATE: {
				FinalState finalState = (FinalState)theEObject;
				T result = caseFinalState(finalState);
				if (result == null) result = caseEndState(finalState);
				if (result == null) result = caseIncomingState(finalState);
				if (result == null) result = caseAbstractState(finalState);
				if (result == null) result = caseNodeEntity(finalState);
				if (result == null) result = caseParameterizedElement(finalState);
				if (result == null) result = caseEntity(finalState);
				if (result == null) result = caseVariableElement(finalState);
				if (result == null) result = caseVariableValueElement(finalState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StateChartsPackage.TERMINATION_CONNECTOR: {
				TerminationConnector terminationConnector = (TerminationConnector)theEObject;
				T result = caseTerminationConnector(terminationConnector);
				if (result == null) result = caseEndState(terminationConnector);
				if (result == null) result = caseIncomingState(terminationConnector);
				if (result == null) result = caseAbstractState(terminationConnector);
				if (result == null) result = caseNodeEntity(terminationConnector);
				if (result == null) result = caseParameterizedElement(terminationConnector);
				if (result == null) result = caseEntity(terminationConnector);
				if (result == null) result = caseVariableElement(terminationConnector);
				if (result == null) result = caseVariableValueElement(terminationConnector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StateChartsPackage.INCOMING_STATE: {
				IncomingState incomingState = (IncomingState)theEObject;
				T result = caseIncomingState(incomingState);
				if (result == null) result = caseAbstractState(incomingState);
				if (result == null) result = caseNodeEntity(incomingState);
				if (result == null) result = caseParameterizedElement(incomingState);
				if (result == null) result = caseEntity(incomingState);
				if (result == null) result = caseVariableElement(incomingState);
				if (result == null) result = caseVariableValueElement(incomingState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StateChartsPackage.OUTGOING_STATE: {
				OutgoingState outgoingState = (OutgoingState)theEObject;
				T result = caseOutgoingState(outgoingState);
				if (result == null) result = caseAbstractState(outgoingState);
				if (result == null) result = caseNodeEntity(outgoingState);
				if (result == null) result = caseParameterizedElement(outgoingState);
				if (result == null) result = caseEntity(outgoingState);
				if (result == null) result = caseVariableElement(outgoingState);
				if (result == null) result = caseVariableValueElement(outgoingState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StateChartsPackage.STATE: {
				State state = (State)theEObject;
				T result = caseState(state);
				if (result == null) result = caseIncomingState(state);
				if (result == null) result = caseOutgoingState(state);
				if (result == null) result = caseAbstractState(state);
				if (result == null) result = caseNodeEntity(state);
				if (result == null) result = caseParameterizedElement(state);
				if (result == null) result = caseEntity(state);
				if (result == null) result = caseVariableElement(state);
				if (result == null) result = caseVariableValueElement(state);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StateChartsPackage.REGION: {
				Region region = (Region)theEObject;
				T result = caseRegion(region);
				if (result == null) result = caseContainerEntity(region);
				if (result == null) result = caseParameterizedElement(region);
				if (result == null) result = caseEntity(region);
				if (result == null) result = caseVariableElement(region);
				if (result == null) result = caseVariableValueElement(region);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StateChartsPackage.TRANSITION: {
				Transition transition = (Transition)theEObject;
				T result = caseTransition(transition);
				if (result == null) result = caseEdgeEntity(transition);
				if (result == null) result = caseParameterizedElement(transition);
				if (result == null) result = caseEntity(transition);
				if (result == null) result = caseVariableElement(transition);
				if (result == null) result = caseVariableValueElement(transition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StateChartsPackage.TRANSITION_LABEL: {
				TransitionLabel transitionLabel = (TransitionLabel)theEObject;
				T result = caseTransitionLabel(transitionLabel);
				if (result == null) result = caseVariableElement(transitionLabel);
				if (result == null) result = caseEntity(transitionLabel);
				if (result == null) result = caseVariableValueElement(transitionLabel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StateChartsPackage.ACTION: {
				Action action = (Action)theEObject;
				T result = caseAction(action);
				if (result == null) result = caseVariableElement(action);
				if (result == null) result = caseEntity(action);
				if (result == null) result = caseVariableValueElement(action);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StateChartsPackage.STATE_ACTION: {
				StateAction stateAction = (StateAction)theEObject;
				T result = caseStateAction(stateAction);
				if (result == null) result = caseAction(stateAction);
				if (result == null) result = caseVariableElement(stateAction);
				if (result == null) result = caseEntity(stateAction);
				if (result == null) result = caseVariableValueElement(stateAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StateChartsPackage.ENTRY_ACTION: {
				EntryAction entryAction = (EntryAction)theEObject;
				T result = caseEntryAction(entryAction);
				if (result == null) result = caseStateAction(entryAction);
				if (result == null) result = caseAction(entryAction);
				if (result == null) result = caseVariableElement(entryAction);
				if (result == null) result = caseEntity(entryAction);
				if (result == null) result = caseVariableValueElement(entryAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StateChartsPackage.EXIT_ACTION: {
				ExitAction exitAction = (ExitAction)theEObject;
				T result = caseExitAction(exitAction);
				if (result == null) result = caseStateAction(exitAction);
				if (result == null) result = caseAction(exitAction);
				if (result == null) result = caseVariableElement(exitAction);
				if (result == null) result = caseEntity(exitAction);
				if (result == null) result = caseVariableValueElement(exitAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StateChartsPackage.DURING_ACTION: {
				DuringAction duringAction = (DuringAction)theEObject;
				T result = caseDuringAction(duringAction);
				if (result == null) result = caseStateAction(duringAction);
				if (result == null) result = caseAction(duringAction);
				if (result == null) result = caseVariableElement(duringAction);
				if (result == null) result = caseEntity(duringAction);
				if (result == null) result = caseVariableValueElement(duringAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StateChartsPackage.BIND_ACTION: {
				BindAction bindAction = (BindAction)theEObject;
				T result = caseBindAction(bindAction);
				if (result == null) result = caseStateAction(bindAction);
				if (result == null) result = caseAction(bindAction);
				if (result == null) result = caseVariableElement(bindAction);
				if (result == null) result = caseEntity(bindAction);
				if (result == null) result = caseVariableValueElement(bindAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StateChartsPackage.ON_ACTION: {
				OnAction onAction = (OnAction)theEObject;
				T result = caseOnAction(onAction);
				if (result == null) result = caseStateAction(onAction);
				if (result == null) result = caseAction(onAction);
				if (result == null) result = caseVariableElement(onAction);
				if (result == null) result = caseEntity(onAction);
				if (result == null) result = caseVariableValueElement(onAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StateChartsPackage.LABEL_ACTION: {
				LabelAction labelAction = (LabelAction)theEObject;
				T result = caseLabelAction(labelAction);
				if (result == null) result = caseAction(labelAction);
				if (result == null) result = caseVariableElement(labelAction);
				if (result == null) result = caseEntity(labelAction);
				if (result == null) result = caseVariableValueElement(labelAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StateChartsPackage.CONDITION_ACTION: {
				ConditionAction conditionAction = (ConditionAction)theEObject;
				T result = caseConditionAction(conditionAction);
				if (result == null) result = caseLabelAction(conditionAction);
				if (result == null) result = caseAction(conditionAction);
				if (result == null) result = caseVariableElement(conditionAction);
				if (result == null) result = caseEntity(conditionAction);
				if (result == null) result = caseVariableValueElement(conditionAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StateChartsPackage.TRANSITION_ACTION: {
				TransitionAction transitionAction = (TransitionAction)theEObject;
				T result = caseTransitionAction(transitionAction);
				if (result == null) result = caseLabelAction(transitionAction);
				if (result == null) result = caseAction(transitionAction);
				if (result == null) result = caseVariableElement(transitionAction);
				if (result == null) result = caseEntity(transitionAction);
				if (result == null) result = caseVariableValueElement(transitionAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State Chart</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State Chart</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStateChart(StateChart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractState(AbstractState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Initial State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Initial State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInitialState(InitialState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>End State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>End State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEndState(EndState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Final State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Final State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFinalState(FinalState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Termination Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Termination Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTerminationConnector(TerminationConnector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Incoming State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Incoming State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIncomingState(IncomingState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Outgoing State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Outgoing State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutgoingState(OutgoingState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseState(State object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Region</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Region</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegion(Region object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransition(Transition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transition Label</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transition Label</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransitionLabel(TransitionLabel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAction(Action object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStateAction(StateAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entry Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entry Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntryAction(EntryAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exit Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exit Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExitAction(ExitAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>During Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>During Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDuringAction(DuringAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bind Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bind Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBindAction(BindAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>On Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>On Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOnAction(OnAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Label Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Label Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLabelAction(LabelAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionAction(ConditionAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transition Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transition Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransitionAction(TransitionAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntity(Entity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Value Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Value Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableValueElement(VariableValueElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableModel(VariableModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelEntity(ModelEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameterized Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameterized Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterizedElement(ParameterizedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableElement(VariableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodeEntity(NodeEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainerEntity(ContainerEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Edge Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Edge Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEdgeEntity(EdgeEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //StateChartsSwitch
