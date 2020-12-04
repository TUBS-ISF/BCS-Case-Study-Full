/**
 * Generated with Acceleo
 */
package de.tubs.sse.spl.deltambt.featuremodel.providers;

import org.eclipse.emf.eef.runtime.impl.providers.ComposedPropertiesEditionProvider;

/**
 * 
 * 
 */
public class FeaturemodelPackagePropertiesEditionProvider extends ComposedPropertiesEditionProvider {

	/**
	 * Default Constructor
	 * 
	 */
	public FeaturemodelPackagePropertiesEditionProvider() {
		super();
		append(createFeatureModelPropertiesEditionProvider());
		append(createFeaturePropertiesEditionProvider());
	}

	/**
	 * This keeps track of the one PropertiesEditionProvider used for all
	 * FeatureModel instances.
	 * 
	 */
	protected FeatureModelPropertiesEditionProvider featureModelPropertiesEditionProvider;

	/**
	 * This creates an PropertiesEditionProvider for a FeatureModel
	 * 
	 */
	public FeatureModelPropertiesEditionProvider createFeatureModelPropertiesEditionProvider() {
		if (featureModelPropertiesEditionProvider == null)
			featureModelPropertiesEditionProvider = new FeatureModelPropertiesEditionProvider();
		return featureModelPropertiesEditionProvider;
	}

	/**
	 * This keeps track of the one PropertiesEditionProvider used for all
	 * Feature instances.
	 * 
	 */
	protected FeaturePropertiesEditionProvider featurePropertiesEditionProvider;

	/**
	 * This creates an PropertiesEditionProvider for a Feature
	 * 
	 */
	public FeaturePropertiesEditionProvider createFeaturePropertiesEditionProvider() {
		if (featurePropertiesEditionProvider == null)
			featurePropertiesEditionProvider = new FeaturePropertiesEditionProvider();
		return featurePropertiesEditionProvider;
	}

}
