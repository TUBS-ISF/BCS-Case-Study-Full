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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.StateChartsPackage
 * @generated
 */
public class StateChartsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static StateChartsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateChartsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = StateChartsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateChartsSwitch<Adapter> modelSwitch =
		new StateChartsSwitch<Adapter>() {
			@Override
			public Adapter caseStateChart(StateChart object) {
				return createStateChartAdapter();
			}
			@Override
			public Adapter caseAbstractState(AbstractState object) {
				return createAbstractStateAdapter();
			}
			@Override
			public Adapter caseInitialState(InitialState object) {
				return createInitialStateAdapter();
			}
			@Override
			public Adapter caseEndState(EndState object) {
				return createEndStateAdapter();
			}
			@Override
			public Adapter caseFinalState(FinalState object) {
				return createFinalStateAdapter();
			}
			@Override
			public Adapter caseTerminationConnector(TerminationConnector object) {
				return createTerminationConnectorAdapter();
			}
			@Override
			public Adapter caseIncomingState(IncomingState object) {
				return createIncomingStateAdapter();
			}
			@Override
			public Adapter caseOutgoingState(OutgoingState object) {
				return createOutgoingStateAdapter();
			}
			@Override
			public Adapter caseState(State object) {
				return createStateAdapter();
			}
			@Override
			public Adapter caseRegion(Region object) {
				return createRegionAdapter();
			}
			@Override
			public Adapter caseTransition(Transition object) {
				return createTransitionAdapter();
			}
			@Override
			public Adapter caseTransitionLabel(TransitionLabel object) {
				return createTransitionLabelAdapter();
			}
			@Override
			public Adapter caseAction(Action object) {
				return createActionAdapter();
			}
			@Override
			public Adapter caseStateAction(StateAction object) {
				return createStateActionAdapter();
			}
			@Override
			public Adapter caseEntryAction(EntryAction object) {
				return createEntryActionAdapter();
			}
			@Override
			public Adapter caseExitAction(ExitAction object) {
				return createExitActionAdapter();
			}
			@Override
			public Adapter caseDuringAction(DuringAction object) {
				return createDuringActionAdapter();
			}
			@Override
			public Adapter caseBindAction(BindAction object) {
				return createBindActionAdapter();
			}
			@Override
			public Adapter caseOnAction(OnAction object) {
				return createOnActionAdapter();
			}
			@Override
			public Adapter caseLabelAction(LabelAction object) {
				return createLabelActionAdapter();
			}
			@Override
			public Adapter caseConditionAction(ConditionAction object) {
				return createConditionActionAdapter();
			}
			@Override
			public Adapter caseTransitionAction(TransitionAction object) {
				return createTransitionActionAdapter();
			}
			@Override
			public Adapter caseEntity(Entity object) {
				return createEntityAdapter();
			}
			@Override
			public Adapter caseVariableValueElement(VariableValueElement object) {
				return createVariableValueElementAdapter();
			}
			@Override
			public Adapter caseVariableModel(VariableModel object) {
				return createVariableModelAdapter();
			}
			@Override
			public Adapter caseModelEntity(ModelEntity object) {
				return createModelEntityAdapter();
			}
			@Override
			public Adapter caseParameterizedElement(ParameterizedElement object) {
				return createParameterizedElementAdapter();
			}
			@Override
			public Adapter caseVariableElement(VariableElement object) {
				return createVariableElementAdapter();
			}
			@Override
			public Adapter caseNodeEntity(NodeEntity object) {
				return createNodeEntityAdapter();
			}
			@Override
			public Adapter caseContainerEntity(ContainerEntity object) {
				return createContainerEntityAdapter();
			}
			@Override
			public Adapter caseEdgeEntity(EdgeEntity object) {
				return createEdgeEntityAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.StateChart <em>State Chart</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.StateChart
	 * @generated
	 */
	public Adapter createStateChartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.AbstractState <em>Abstract State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.AbstractState
	 * @generated
	 */
	public Adapter createAbstractStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.InitialState <em>Initial State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.InitialState
	 * @generated
	 */
	public Adapter createInitialStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.EndState <em>End State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.EndState
	 * @generated
	 */
	public Adapter createEndStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.FinalState <em>Final State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.FinalState
	 * @generated
	 */
	public Adapter createFinalStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.TerminationConnector <em>Termination Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.TerminationConnector
	 * @generated
	 */
	public Adapter createTerminationConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.IncomingState <em>Incoming State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.IncomingState
	 * @generated
	 */
	public Adapter createIncomingStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.OutgoingState <em>Outgoing State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.OutgoingState
	 * @generated
	 */
	public Adapter createOutgoingStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.State
	 * @generated
	 */
	public Adapter createStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.Region <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.Region
	 * @generated
	 */
	public Adapter createRegionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.Transition
	 * @generated
	 */
	public Adapter createTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.TransitionLabel <em>Transition Label</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.TransitionLabel
	 * @generated
	 */
	public Adapter createTransitionLabelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.Action
	 * @generated
	 */
	public Adapter createActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.StateAction <em>State Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.StateAction
	 * @generated
	 */
	public Adapter createStateActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.EntryAction <em>Entry Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.EntryAction
	 * @generated
	 */
	public Adapter createEntryActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.ExitAction <em>Exit Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.ExitAction
	 * @generated
	 */
	public Adapter createExitActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.DuringAction <em>During Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.DuringAction
	 * @generated
	 */
	public Adapter createDuringActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.BindAction <em>Bind Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.BindAction
	 * @generated
	 */
	public Adapter createBindActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.OnAction <em>On Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.OnAction
	 * @generated
	 */
	public Adapter createOnActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.LabelAction <em>Label Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.LabelAction
	 * @generated
	 */
	public Adapter createLabelActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.ConditionAction <em>Condition Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.ConditionAction
	 * @generated
	 */
	public Adapter createConditionActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.TransitionAction <em>Transition Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.TransitionAction
	 * @generated
	 */
	public Adapter createTransitionActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.tu_bs.cs.isf.familymining.models.base.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.tu_bs.cs.isf.familymining.models.base.Entity
	 * @generated
	 */
	public Adapter createEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.tu_bs.cs.isf.familymining.models.base.VariableValueElement <em>Variable Value Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.tu_bs.cs.isf.familymining.models.base.VariableValueElement
	 * @generated
	 */
	public Adapter createVariableValueElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.tu_bs.cs.isf.familymining.models.base.VariableModel <em>Variable Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.tu_bs.cs.isf.familymining.models.base.VariableModel
	 * @generated
	 */
	public Adapter createVariableModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.tu_bs.cs.isf.familymining.models.base.ModelEntity <em>Model Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.tu_bs.cs.isf.familymining.models.base.ModelEntity
	 * @generated
	 */
	public Adapter createModelEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.tu_bs.cs.isf.familymining.models.base.ParameterizedElement <em>Parameterized Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.tu_bs.cs.isf.familymining.models.base.ParameterizedElement
	 * @generated
	 */
	public Adapter createParameterizedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.tu_bs.cs.isf.familymining.models.base.VariableElement <em>Variable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.tu_bs.cs.isf.familymining.models.base.VariableElement
	 * @generated
	 */
	public Adapter createVariableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.tu_bs.cs.isf.familymining.models.base.NodeEntity <em>Node Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.tu_bs.cs.isf.familymining.models.base.NodeEntity
	 * @generated
	 */
	public Adapter createNodeEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.tu_bs.cs.isf.familymining.models.base.ContainerEntity <em>Container Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.tu_bs.cs.isf.familymining.models.base.ContainerEntity
	 * @generated
	 */
	public Adapter createContainerEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.tu_bs.cs.isf.familymining.models.base.EdgeEntity <em>Edge Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.tu_bs.cs.isf.familymining.models.base.EdgeEntity
	 * @generated
	 */
	public Adapter createEdgeEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //StateChartsAdapterFactory
