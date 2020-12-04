/**
 */
package de.tu_bs.cs.isf.familymining.models.stateoriented.impl;

import de.tu_bs.cs.isf.familymining.models.stateoriented.EndState;
import de.tu_bs.cs.isf.familymining.models.stateoriented.StateChartsPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>End State</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class EndStateImpl extends IncomingStateImpl implements EndState {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EndStateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StateChartsPackage.Literals.END_STATE;
	}

} //EndStateImpl
