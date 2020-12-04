package de.tubs.sse.spl.deltambt.featuremodel.validation.constraint;

import java.util.List;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.EMFEventType;
import org.eclipse.emf.validation.IValidationContext;

import de.tubs.sse.spl.deltambt.featuremodel.Feature;

/**
 * This class represents the constraint which checks if the size of the Or-Relation is 0 or bigger than one.
 * @author Sascha Lity
 */
public class MinTwoOrChildsConstraint
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
			List<Feature> childs = null;
			if (eObj instanceof Feature) {
				childs = ((Feature)eObj).getOr();
			} 			
			if(childs != null && (childs.size() < 0 || childs.size() == 1 ))
			{
				return ctx.createFailureStatus(eObj.eClass().getName());
			}
		} 
				
		return ctx.createSuccessStatus();
	}
}
