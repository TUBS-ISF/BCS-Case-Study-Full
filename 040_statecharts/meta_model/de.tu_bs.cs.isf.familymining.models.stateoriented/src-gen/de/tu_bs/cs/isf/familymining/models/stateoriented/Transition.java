/**
 */
package de.tu_bs.cs.isf.familymining.models.stateoriented;

import de.tu_bs.cs.isf.familymining.models.base.EdgeEntity;
import de.tu_bs.cs.isf.familymining.models.base.ParameterizedElement;
import de.tu_bs.cs.isf.familymining.models.base.VariableElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.familymining.models.stateoriented.Transition#getPriority <em>Priority</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.models.stateoriented.Transition#getType <em>Type</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.models.stateoriented.Transition#getStereotypes <em>Stereotypes</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.models.stateoriented.Transition#getSource <em>Source</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.models.stateoriented.Transition#getTarget <em>Target</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.models.stateoriented.Transition#getLabel <em>Label</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.models.stateoriented.Transition#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.StateChartsPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends EdgeEntity, VariableElement, ParameterizedElement {
	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #setPriority(int)
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.StateChartsPackage#getTransition_Priority()
	 * @model
	 * @generated
	 */
	int getPriority();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.Transition#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(int value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"NORMAL"</code>.
	 * The literals are from the enumeration {@link de.tu_bs.cs.isf.familymining.models.stateoriented.TransitionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.TransitionType
	 * @see #setType(TransitionType)
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.StateChartsPackage#getTransition_Type()
	 * @model default="NORMAL"
	 * @generated
	 */
	TransitionType getType();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.Transition#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.TransitionType
	 * @see #getType()
	 * @generated
	 */
	void setType(TransitionType value);

	/**
	 * Returns the value of the '<em><b>Stereotypes</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stereotypes</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stereotypes</em>' attribute list.
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.StateChartsPackage#getTransition_Stereotypes()
	 * @model
	 * @generated
	 */
	EList<String> getStereotypes();

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(OutgoingState)
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.StateChartsPackage#getTransition_Source()
	 * @model required="true"
	 * @generated
	 */
	OutgoingState getSource();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.Transition#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(OutgoingState value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(IncomingState)
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.StateChartsPackage#getTransition_Target()
	 * @model required="true"
	 * @generated
	 */
	IncomingState getTarget();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.Transition#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(IncomingState value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' containment reference.
	 * @see #setLabel(TransitionLabel)
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.StateChartsPackage#getTransition_Label()
	 * @model containment="true"
	 * @generated
	 */
	TransitionLabel getLabel();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.Transition#getLabel <em>Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' containment reference.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(TransitionLabel value);

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
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.StateChartsPackage#getTransition_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.Transition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Transition
