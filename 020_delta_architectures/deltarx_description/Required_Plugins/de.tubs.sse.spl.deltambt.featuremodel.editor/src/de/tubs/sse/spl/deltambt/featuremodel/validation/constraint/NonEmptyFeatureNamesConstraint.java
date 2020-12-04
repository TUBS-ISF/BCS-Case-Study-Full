package de.tubs.sse.spl.deltambt.featuremodel.validation.constraint;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.EMFEventType;
import org.eclipse.emf.validation.IValidationContext;

import de.tubs.sse.spl.deltambt.featuremodel.Feature;
import de.tubs.sse.spl.deltambt.featuremodel.FeatureModel;

/**
 * This class represents the constraint which checks if all elements of a feature model have name as not empty identifier.
 * @author Sascha Lity
 */
public class NonEmptyFeatureNamesConstraint
	extends AbstractModelConstraint {

	/* (non-Javadoc)
	 * @see org.eclipse.emf.validation.AbstractModelConstraint#validate(org.eclipse.emf.validation.IValidationContext)
	 */
	@Override
	public IStatus validate(IValidationContext ctx) {
		EObject eObj = ctx.getTarget();
		EMFEventType eType = ctx.getEventType();
		
		// In the case of batch mode.
		if (eType == EMFEventType.NULL) {
			String name = null;
			if (eObj instanceof FeatureModel) {
				name = ((FeatureModel)eObj).getName();
			} 
			else if (eObj instanceof Feature) {
				name = ((Feature)eObj).getName();
			}
			
			if (name == null || name.length() == 0) {
				return ctx.createFailureStatus(eObj.eClass().getName());
			}
		} 
		// In the case of live mode.
		else {
			Object newValue = ctx.getFeatureNewValue();
			
			if (newValue == null
				|| ((String)newValue).length() == 0) {
				return ctx.createFailureStatus(eObj.eClass().getName());
			}
		}
		
		return ctx.createSuccessStatus();
	}

}
