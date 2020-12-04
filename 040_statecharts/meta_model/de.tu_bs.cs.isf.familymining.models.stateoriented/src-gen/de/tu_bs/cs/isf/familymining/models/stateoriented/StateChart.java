/**
 */
package de.tu_bs.cs.isf.familymining.models.stateoriented;

import de.tu_bs.cs.isf.familymining.models.base.ModelEntity;
import de.tu_bs.cs.isf.familymining.models.base.ParameterizedElement;
import de.tu_bs.cs.isf.familymining.models.base.VariableModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Chart</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.familymining.models.stateoriented.StateChart#getStateCount <em>State Count</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.models.stateoriented.StateChart#getRegionCount <em>Region Count</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.models.stateoriented.StateChart#getTransitionCount <em>Transition Count</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.models.stateoriented.StateChart#getRootRegion <em>Root Region</em>}</li>
 * </ul>
 *
 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.StateChartsPackage#getStateChart()
 * @model
 * @generated
 */
public interface StateChart extends ModelEntity, VariableModel, ParameterizedElement {
	/**
	 * Returns the value of the '<em><b>State Count</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Count</em>' attribute.
	 * @see #setStateCount(int)
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.StateChartsPackage#getStateChart_StateCount()
	 * @model default="0" required="true"
	 * @generated
	 */
	int getStateCount();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.StateChart#getStateCount <em>State Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State Count</em>' attribute.
	 * @see #getStateCount()
	 * @generated
	 */
	void setStateCount(int value);

	/**
	 * Returns the value of the '<em><b>Region Count</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Region Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Region Count</em>' attribute.
	 * @see #setRegionCount(int)
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.StateChartsPackage#getStateChart_RegionCount()
	 * @model default="0" required="true"
	 * @generated
	 */
	int getRegionCount();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.StateChart#getRegionCount <em>Region Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Region Count</em>' attribute.
	 * @see #getRegionCount()
	 * @generated
	 */
	void setRegionCount(int value);

	/**
	 * Returns the value of the '<em><b>Transition Count</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transition Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition Count</em>' attribute.
	 * @see #setTransitionCount(int)
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.StateChartsPackage#getStateChart_TransitionCount()
	 * @model default="0" required="true"
	 * @generated
	 */
	int getTransitionCount();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.StateChart#getTransitionCount <em>Transition Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transition Count</em>' attribute.
	 * @see #getTransitionCount()
	 * @generated
	 */
	void setTransitionCount(int value);

	/**
	 * Returns the value of the '<em><b>Root Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root Region</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Region</em>' containment reference.
	 * @see #setRootRegion(Region)
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.StateChartsPackage#getStateChart_RootRegion()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Region getRootRegion();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.StateChart#getRootRegion <em>Root Region</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root Region</em>' containment reference.
	 * @see #getRootRegion()
	 * @generated
	 */
	void setRootRegion(Region value);

} // StateChart
