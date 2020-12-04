/**
 * Generated with Acceleo
 */
package de.tubs.sse.spl.deltambt.configmanagement.providers;

import org.eclipse.emf.eef.runtime.impl.providers.ComposedPropertiesEditionProvider;

/**
 * 
 * 
 */
public class ConfigmanagementPackagePropertiesEditionProvider extends ComposedPropertiesEditionProvider {

	/**
	 * Default Constructor
	 * 
	 */
	public ConfigmanagementPackagePropertiesEditionProvider() {
		super();
		append(createConfigurationRepositoryPropertiesEditionProvider());
		append(createConfigurationPropertiesEditionProvider());
	}

	/**
	 * This keeps track of the one PropertiesEditionProvider used for all
	 * ConfigurationRepository instances.
	 * 
	 */
	protected ConfigurationRepositoryPropertiesEditionProvider configurationRepositoryPropertiesEditionProvider;

	/**
	 * This creates an PropertiesEditionProvider for a ConfigurationRepository
	 * 
	 */
	public ConfigurationRepositoryPropertiesEditionProvider createConfigurationRepositoryPropertiesEditionProvider() {
		if (configurationRepositoryPropertiesEditionProvider == null)
			configurationRepositoryPropertiesEditionProvider = new ConfigurationRepositoryPropertiesEditionProvider();
		return configurationRepositoryPropertiesEditionProvider;
	}

	/**
	 * This keeps track of the one PropertiesEditionProvider used for all
	 * Configuration instances.
	 * 
	 */
	protected ConfigurationPropertiesEditionProvider configurationPropertiesEditionProvider;

	/**
	 * This creates an PropertiesEditionProvider for a Configuration
	 * 
	 */
	public ConfigurationPropertiesEditionProvider createConfigurationPropertiesEditionProvider() {
		if (configurationPropertiesEditionProvider == null)
			configurationPropertiesEditionProvider = new ConfigurationPropertiesEditionProvider();
		return configurationPropertiesEditionProvider;
	}

}
