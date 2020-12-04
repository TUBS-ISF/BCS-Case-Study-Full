package de.tubs.sse.spl.deltambt.featuremodel.validation.constraint;

import org.eclipse.emf.validation.model.IClientSelector;

/**
 * Selects constraints for the constraint binding when the {@link de.tubs.sse.spl.featuremodel.actions.BatchValidationDelegate} 
 * was the entry point into validation.
 * 
 * This implementation based on the EMF Validation Framework Example org.eclipse.emf.validation.examples.general
 */
public class ValidationFeatureDelegateClientSelector
	implements IClientSelector {

	public static boolean running = false;
	
	/* (non-Javadoc)
	 * @see org.eclipse.emf.validation.model.IClientSelector#selects(java.lang.Object)
	 */
	public boolean selects(Object object) {
		return running;
	}
}
