/**
 * Generated with Acceleo
 */
package de.tubs.sse.spl.deltambt.configmanagement.providers;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.runtime.impl.providers.StandardPropertiesEditionPolicyProvider;

import de.tubs.sse.spl.deltambt.configmanagement.ConfigmanagementPackage;

/**
 * 
 * 
 */
public class ConfigmanagementPackagePropertiesEditionPolicyProvider extends StandardPropertiesEditionPolicyProvider {

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPolicyProvider#provides(org.eclipse.emf.ecore.EObject)
	 * 
	 */
	public boolean provides(EObject eObject) {
		return ConfigmanagementPackage.eINSTANCE.equals(eObject.eClass().getEPackage()) || ConfigmanagementPackage.eINSTANCE.getESubpackages().contains(eObject.eClass().getEPackage());
	}

}
