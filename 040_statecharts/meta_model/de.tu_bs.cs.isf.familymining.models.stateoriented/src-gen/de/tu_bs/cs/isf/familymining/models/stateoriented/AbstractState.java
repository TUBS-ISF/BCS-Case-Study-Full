/**
 */
package de.tu_bs.cs.isf.familymining.models.stateoriented;

import de.tu_bs.cs.isf.familymining.models.base.NodeEntity;
import de.tu_bs.cs.isf.familymining.models.base.ParameterizedElement;
import de.tu_bs.cs.isf.familymining.models.base.VariableElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.familymining.models.stateoriented.AbstractState#getParent <em>Parent</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.models.stateoriented.AbstractState#getStereotypes <em>Stereotypes</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.models.stateoriented.AbstractState#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.StateChartsPackage#getAbstractState()
 * @model abstract="true"
 * @generated
 */
public interface AbstractState extends NodeEntity, VariableElement, ParameterizedElement {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(Region)
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.StateChartsPackage#getAbstractState_Parent()
	 * @model required="true"
	 * @generated
	 */
	Region getParent();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.AbstractState#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Region value);

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
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.StateChartsPackage#getAbstractState_Stereotypes()
	 * @model
	 * @generated
	 */
	EList<String> getStereotypes();

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
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.StateChartsPackage#getAbstractState_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.AbstractState#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns whether this state is hierarchical.
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='if (this instanceof de.tu_bs.cs.isf.familymining.models.stateoriented.State) {\r\n\tif (((de.tu_bs.cs.isf.familymining.models.stateoriented.State) this).getRegions().size() == 1) {\r\n\t\treturn true;\r\n\t}\r\n}\r\nreturn false;'"
	 * @generated
	 */
	boolean isHierarchical();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns whether this state is a parallel state.
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='if (this instanceof de.tu_bs.cs.isf.familymining.models.stateoriented.State) {\r\n\tif (((de.tu_bs.cs.isf.familymining.models.stateoriented.State) this).getRegions().size() > 1) {\r\n\t\treturn true;\r\n\t}\r\n}\r\nreturn false;'"
	 * @generated
	 */
	boolean isParallel();

} // AbstractState
