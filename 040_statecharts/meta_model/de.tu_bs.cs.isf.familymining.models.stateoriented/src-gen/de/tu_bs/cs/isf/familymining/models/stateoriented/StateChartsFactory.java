/**
 */
package de.tu_bs.cs.isf.familymining.models.stateoriented;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.StateChartsPackage
 * @generated
 */
public interface StateChartsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	StateChartsFactory eINSTANCE = de.tu_bs.cs.isf.familymining.models.stateoriented.impl.custom.StateChartsFactoryImplCustom.init();

	/**
	 * Returns a new object of class '<em>State Chart</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>State Chart</em>'.
	 * @generated
	 */
	StateChart createStateChart();

	/**
	 * Returns a new object of class '<em>Initial State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Initial State</em>'.
	 * @generated
	 */
	InitialState createInitialState();

	/**
	 * Returns a new object of class '<em>Final State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Final State</em>'.
	 * @generated
	 */
	FinalState createFinalState();

	/**
	 * Returns a new object of class '<em>Termination Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Termination Connector</em>'.
	 * @generated
	 */
	TerminationConnector createTerminationConnector();

	/**
	 * Returns a new object of class '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>State</em>'.
	 * @generated
	 */
	State createState();

	/**
	 * Returns a new object of class '<em>Region</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Region</em>'.
	 * @generated
	 */
	Region createRegion();

	/**
	 * Returns a new object of class '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transition</em>'.
	 * @generated
	 */
	Transition createTransition();

	/**
	 * Returns a new object of class '<em>Transition Label</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transition Label</em>'.
	 * @generated
	 */
	TransitionLabel createTransitionLabel();

	/**
	 * Returns a new object of class '<em>Entry Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entry Action</em>'.
	 * @generated
	 */
	EntryAction createEntryAction();

	/**
	 * Returns a new object of class '<em>Exit Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exit Action</em>'.
	 * @generated
	 */
	ExitAction createExitAction();

	/**
	 * Returns a new object of class '<em>During Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>During Action</em>'.
	 * @generated
	 */
	DuringAction createDuringAction();

	/**
	 * Returns a new object of class '<em>Bind Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bind Action</em>'.
	 * @generated
	 */
	BindAction createBindAction();

	/**
	 * Returns a new object of class '<em>On Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>On Action</em>'.
	 * @generated
	 */
	OnAction createOnAction();

	/**
	 * Returns a new object of class '<em>Condition Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Condition Action</em>'.
	 * @generated
	 */
	ConditionAction createConditionAction();

	/**
	 * Returns a new object of class '<em>Transition Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transition Action</em>'.
	 * @generated
	 */
	TransitionAction createTransitionAction();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	StateChartsPackage getStateChartsPackage();

} //StateChartsFactory
