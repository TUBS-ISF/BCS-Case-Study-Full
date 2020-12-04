/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.tubs.sse.spl.deltambt.configmanagement;

import de.tubs.sse.spl.deltambt.featuremodel.FeatureModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.tubs.sse.spl.deltambt.configmanagement.ConfigurationRepository#getName <em>Name</em>}</li>
 *   <li>{@link de.tubs.sse.spl.deltambt.configmanagement.ConfigurationRepository#getBelongToSPL <em>Belong To SPL</em>}</li>
 *   <li>{@link de.tubs.sse.spl.deltambt.configmanagement.ConfigurationRepository#getLinkedToFM <em>Linked To FM</em>}</li>
 *   <li>{@link de.tubs.sse.spl.deltambt.configmanagement.ConfigurationRepository#getConfigs <em>Configs</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.tubs.sse.spl.deltambt.configmanagement.ConfigmanagementPackage#getConfigurationRepository()
 * @model
 * @generated
 */
public interface ConfigurationRepository extends EObject {
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
	 * @see de.tubs.sse.spl.deltambt.configmanagement.ConfigmanagementPackage#getConfigurationRepository_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.tubs.sse.spl.deltambt.configmanagement.ConfigurationRepository#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see de.tubs.sse.spl.deltambt.configmanagement.ConfigmanagementPackage#getConfigurationRepository_BelongToSPL()
	 * @model
	 * @generated
	 */
	String getBelongToSPL();

	/**
	 * Sets the value of the '{@link de.tubs.sse.spl.deltambt.configmanagement.ConfigurationRepository#getBelongToSPL <em>Belong To SPL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Belong To SPL</em>' attribute.
	 * @see #getBelongToSPL()
	 * @generated
	 */
	void setBelongToSPL(String value);

	/**
	 * Returns the value of the '<em><b>Linked To FM</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Linked To FM</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linked To FM</em>' reference.
	 * @see #setLinkedToFM(FeatureModel)
	 * @see de.tubs.sse.spl.deltambt.configmanagement.ConfigmanagementPackage#getConfigurationRepository_LinkedToFM()
	 * @model keys="name" required="true"
	 * @generated
	 */
	FeatureModel getLinkedToFM();

	/**
	 * Sets the value of the '{@link de.tubs.sse.spl.deltambt.configmanagement.ConfigurationRepository#getLinkedToFM <em>Linked To FM</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linked To FM</em>' reference.
	 * @see #getLinkedToFM()
	 * @generated
	 */
	void setLinkedToFM(FeatureModel value);

	/**
	 * Returns the value of the '<em><b>Configs</b></em>' containment reference list.
	 * The list contents are of type {@link de.tubs.sse.spl.deltambt.configmanagement.Configuration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configs</em>' containment reference list.
	 * @see de.tubs.sse.spl.deltambt.configmanagement.ConfigmanagementPackage#getConfigurationRepository_Configs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Configuration> getConfigs();

} // ConfigurationRepository
