/**
 */
package de.tu_bs.cs.isf.splregtest.xtext.mapping.mapsCompSm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.splregtest.xtext.mapping.mapsCompSm.Mapping#getName <em>Name</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.splregtest.xtext.mapping.mapsCompSm.Mapping#getComponents <em>Components</em>}</li>
 * </ul>
 *
 * @see de.tu_bs.cs.isf.splregtest.xtext.mapping.mapsCompSm.MapsCompSmPackage#getMapping()
 * @model
 * @generated
 */
public interface Mapping extends EObject
{
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
   * @see de.tu_bs.cs.isf.splregtest.xtext.mapping.mapsCompSm.MapsCompSmPackage#getMapping_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.tu_bs.cs.isf.splregtest.xtext.mapping.mapsCompSm.Mapping#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Components</b></em>' containment reference list.
   * The list contents are of type {@link de.tu_bs.cs.isf.splregtest.xtext.mapping.mapsCompSm.Component}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Components</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Components</em>' containment reference list.
   * @see de.tu_bs.cs.isf.splregtest.xtext.mapping.mapsCompSm.MapsCompSmPackage#getMapping_Components()
   * @model containment="true"
   * @generated
   */
  EList<Component> getComponents();

} // Mapping
