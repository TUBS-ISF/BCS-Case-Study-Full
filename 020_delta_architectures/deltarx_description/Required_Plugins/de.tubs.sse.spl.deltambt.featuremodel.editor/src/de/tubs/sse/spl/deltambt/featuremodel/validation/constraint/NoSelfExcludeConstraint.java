package de.tubs.sse.spl.deltambt.featuremodel.validation.constraint;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.EMFEventType;
import org.eclipse.emf.validation.IValidationContext;

import de.tubs.sse.spl.deltambt.featuremodel.Feature;

/**
 * This class represents the constraint which checks if a feature don't exclude itself.
 * @author Sascha Lity
 */
public class NoSelfExcludeConstraint
	extends AbstractModelConstraint {

	/* (non-Javadoc)
	 * @see org.eclipse.emf.validation.AbstractModelConstraint#validate(org.eclipse.emf.validation.IValidationContext)
	 */
	@Override
	public IStatus validate(IValidationContext ctx) {
		EObject eObj = ctx.getTarget();
		EMFEventType eType = ctx.getEventType();
		
		// In the case of batch mode.
		if (eType == EMFEventType.NULL) 
		{
			if(eObj instanceof Feature)
			{
				Feature feat = (Feature)eObj;
				if(feat.getExclude().size() > 0)
				{
					for(Feature exclude: feat.getExclude())
					{
						if(exclude.getName().equals(feat.getName()))
							return ctx.createFailureStatus(feat.getName());
					}
				}
			}
		} 
				
		return ctx.createSuccessStatus();
	}
}
