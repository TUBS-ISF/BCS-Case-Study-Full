/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.tubs.sse.spl.deltambt.featuremodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.tubs.sse.spl.deltambt.featuremodel.FeatureModel#getName <em>Name</em>}</li>
 *   <li>{@link de.tubs.sse.spl.deltambt.featuremodel.FeatureModel#getRoot <em>Root</em>}</li>
 *   <li>{@link de.tubs.sse.spl.deltambt.featuremodel.FeatureModel#getBelongToSPL <em>Belong To SPL</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.tubs.sse.spl.deltambt.featuremodel.FeaturemodelPackage#getFeatureModel()
 * @model
 * @generated
 */
public interface FeatureModel extends EObject {
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
	 * @see de.tubs.sse.spl.deltambt.featuremodel.FeaturemodelPackage#getFeatureModel_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.tubs.sse.spl.deltambt.featuremodel.FeatureModel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Root</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root</em>' containment reference.
	 * @see #setRoot(Feature)
	 * @see de.tubs.sse.spl.deltambt.featuremodel.FeaturemodelPackage#getFeatureModel_Root()
	 * @model containment="true" keys="name" required="true"
	 * @generated
	 */
	Feature getRoot();

	/**
	 * Sets the value of the '{@link de.tubs.sse.spl.deltambt.featuremodel.FeatureModel#getRoot <em>Root</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root</em>' containment reference.
	 * @see #getRoot()
	 * @generated
	 */
	void setRoot(Feature value);

	/**
	 * Returns the value of the '<em><b>Belong To SPL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Belong To SPL</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Belong To SPL</em>' attribute.
	 * @see #setBelongToSPL(String)
	 * @see de.tubs.sse.spl.deltambt.featuremodel.FeaturemodelPackage#getFeatureModel_BelongToSPL()
	 * @model
	 * @generated
	 */
	String getBelongToSPL();

	/**
	 * Sets the value of the '{@link de.tubs.sse.spl.deltambt.featuremodel.FeatureModel#getBelongToSPL <em>Belong To SPL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Belong To SPL</em>' attribute.
	 * @see #getBelongToSPL()
	 * @generated
	 */
	void setBelongToSPL(String value);

} // FeatureModel
