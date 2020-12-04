package de.tubs.sse.spl.deltambt.featuremodel.validation.constraint;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.EMFEventType;
import org.eclipse.emf.validation.IValidationContext;

import de.tubs.sse.spl.deltambt.featuremodel.Feature;
import de.tubs.sse.spl.deltambt.featuremodel.FeatureModel;

/**
 * This class represents the constraint which checks if all elements have got a unique name.
 * @author Sascha Lity
 */
public class UniqueFeatureNamesConstraint
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
		
			if (eObj instanceof Feature) {
				name = ((Feature)eObj).getName();
				if(name != null)
				{
					FeatureModel model = null;
					EObject ancestor = eObj.eContainer();
					if(ancestor instanceof FeatureModel)
						model = (FeatureModel)ancestor;
					else
					{
						while(model == null && ancestor != null)
						{
							ancestor = ancestor.eContainer();
							if(ancestor instanceof FeatureModel)
								model = (FeatureModel)ancestor;
						}
					}
					
					TreeIterator<EObject> it = model.eAllContents();
					Feature feat = null;
					int count = -1;
					while(it.hasNext())
					{
						feat = (Feature)it.next();
						if(feat.getName().equals(name))
							count++;
					}
					if(count > 0)
						return ctx.createFailureStatus(name);
				}	
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
