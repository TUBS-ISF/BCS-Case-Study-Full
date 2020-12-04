package de.tubs.sse.spl.deltambt.featuremodel.validation.constraint;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.EMFEventType;
import org.eclipse.emf.validation.IValidationContext;

import de.tubs.sse.spl.deltambt.featuremodel.Feature;

/**
 * This class represents the constraint which checks if a exclude relation is bidirectional.
 * @author Sascha Lity
 */
public class BidirectionalExcludeConstraint
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
					boolean exists = false;
					String features = "";
					for(Feature exclude: feat.getExclude())
					{
						exists = false;
						for(Feature exFeat: exclude.getExclude())
						{
							if(exFeat.getName().equals(feat.getName()))
								exists = true;
						}
						if(!exists)
						{
							if(!features.equals(""))
								features += ", " + exclude.getName();
							else
								features += exclude.getName();
						}
					}						
					if(!features.equals(""))
					{
						return ctx.createFailureStatus(feat.getName(), features);
					}
				}
			}
		} 
				
		return ctx.createSuccessStatus();
	}
}
