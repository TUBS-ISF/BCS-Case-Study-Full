/**
 */
package de.tu_bs.cs.isf.familymining.models.stateoriented;

import de.tu_bs.cs.isf.familymining.models.base.ContainerEntity;
import de.tu_bs.cs.isf.familymining.models.base.ParameterizedElement;
import de.tu_bs.cs.isf.familymining.models.base.VariableElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Region</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.familymining.models.stateoriented.Region#getParent <em>Parent</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.models.stateoriented.Region#getInitialStates <em>Initial States</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.models.stateoriented.Region#getStates <em>States</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.models.stateoriented.Region#getEndStates <em>End States</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.models.stateoriented.Region#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.StateChartsPackage#getRegion()
 * @model
 * @generated
 */
public interface Region extends ContainerEntity, VariableElement, ParameterizedElement {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(AbstractState)
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.StateChartsPackage#getRegion_Parent()
	 * @model required="true"
	 * @generated
	 */
	AbstractState getParent();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.Region#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(AbstractState value);

	/**
	 * Returns the value of the '<em><b>Initial States</b></em>' containment reference list.
	 * The list contents are of type {@link de.tu_bs.cs.isf.familymining.models.stateoriented.InitialState}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial States</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial States</em>' containment reference list.
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.StateChartsPackage#getRegion_InitialStates()
	 * @model containment="true"
	 * @generated
	 */
	EList<InitialState> getInitialStates();

	/**
	 * Returns the value of the '<em><b>States</b></em>' containment reference list.
	 * The list contents are of type {@link de.tu_bs.cs.isf.familymining.models.stateoriented.State}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' containment reference list.
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.StateChartsPackage#getRegion_States()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<State> getStates();

	/**
	 * Returns the value of the '<em><b>End States</b></em>' containment reference list.
	 * The list contents are of type {@link de.tu_bs.cs.isf.familymining.models.stateoriented.EndState}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End States</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End States</em>' containment reference list.
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.StateChartsPackage#getRegion_EndStates()
	 * @model containment="true"
	 * @generated
	 */
	EList<EndState> getEndStates();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.StateChartsPackage#getRegion_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.Region#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Region
