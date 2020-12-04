/**
 * Generated with Acceleo
 */
package de.tubs.sse.spl.deltambt.featuremodel.providers;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.runtime.impl.providers.StandardPropertiesEditionPolicyProvider;

import de.tubs.sse.spl.deltambt.featuremodel.FeaturemodelPackage;

/**
 * 
 * 
 */
public class FeaturemodelPackagePropertiesEditionPolicyProvider extends StandardPropertiesEditionPolicyProvider {

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPolicyProvider#provides(org.eclipse.emf.ecore.EObject)
	 * 
	 */
	public boolean provides(EObject eObject) {
		return FeaturemodelPackage.eINSTANCE.equals(eObject.eClass().getEPackage()) || FeaturemodelPackage.eINSTANCE.getESubpackages().contains(eObject.eClass().getEPackage());
	}

}
