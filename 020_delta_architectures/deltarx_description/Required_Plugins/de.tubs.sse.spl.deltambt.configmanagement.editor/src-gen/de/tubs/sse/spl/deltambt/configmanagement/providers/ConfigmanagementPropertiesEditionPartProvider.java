/**
 * Generated with Acceleo
 */
package de.tubs.sse.spl.deltambt.configmanagement.providers;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPartProvider;

import de.tubs.sse.spl.deltambt.configmanagement.parts.ConfigmanagementViewsRepository;
import de.tubs.sse.spl.deltambt.configmanagement.parts.forms.ConfigurationPropertiesEditionPartForm;
import de.tubs.sse.spl.deltambt.configmanagement.parts.forms.ConfigurationRepositoryPropertiesEditionPartForm;
import de.tubs.sse.spl.deltambt.configmanagement.parts.impl.ConfigurationPropertiesEditionPartImpl;
import de.tubs.sse.spl.deltambt.configmanagement.parts.impl.ConfigurationRepositoryPropertiesEditionPartImpl;

/**
 * 
 * 
 */
@SuppressWarnings("rawtypes")
public class ConfigmanagementPropertiesEditionPartProvider implements IPropertiesEditionPartProvider {

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#provides(java.lang.Class)
	 * 
	 */
	public boolean provides(java.lang.Class key) {
		return key == ConfigmanagementViewsRepository.class;
	}

	
	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#getPropertiesEditionPart(java.lang.Class, int, org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent)
	 * 
	 */
	public IPropertiesEditionPart getPropertiesEditionPart(java.lang.Class key, int kind, IPropertiesEditionComponent component) {
		if (key == ConfigmanagementViewsRepository.ConfigurationRepository.class) {
			if (kind == ConfigmanagementViewsRepository.SWT_KIND)
				return new ConfigurationRepositoryPropertiesEditionPartImpl(component);
			if (kind == ConfigmanagementViewsRepository.FORM_KIND)
				return new ConfigurationRepositoryPropertiesEditionPartForm(component);
		}
		if (key == ConfigmanagementViewsRepository.Configuration.class) {
			if (kind == ConfigmanagementViewsRepository.SWT_KIND)
				return new ConfigurationPropertiesEditionPartImpl(component);
			if (kind == ConfigmanagementViewsRepository.FORM_KIND)
				return new ConfigurationPropertiesEditionPartForm(component);
		}
		return null;
	}

}
