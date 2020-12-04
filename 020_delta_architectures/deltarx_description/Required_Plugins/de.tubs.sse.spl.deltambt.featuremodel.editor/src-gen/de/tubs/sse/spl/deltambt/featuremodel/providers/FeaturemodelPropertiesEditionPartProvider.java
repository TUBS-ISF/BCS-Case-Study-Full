/**
 * Generated with Acceleo
 */
package de.tubs.sse.spl.deltambt.featuremodel.providers;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPartProvider;

import de.tubs.sse.spl.deltambt.featuremodel.parts.FeaturemodelViewsRepository;
import de.tubs.sse.spl.deltambt.featuremodel.parts.forms.FeatureModelPropertiesEditionPartForm;
import de.tubs.sse.spl.deltambt.featuremodel.parts.forms.FeaturePropertiesEditionPartForm;
import de.tubs.sse.spl.deltambt.featuremodel.parts.impl.FeatureModelPropertiesEditionPartImpl;
import de.tubs.sse.spl.deltambt.featuremodel.parts.impl.FeaturePropertiesEditionPartImpl;

/**
 * 
 * 
 */
@SuppressWarnings("rawtypes")
public class FeaturemodelPropertiesEditionPartProvider implements IPropertiesEditionPartProvider {

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#provides(java.lang.Class)
	 * 
	 */
	public boolean provides(java.lang.Class key) {
		return key == FeaturemodelViewsRepository.class;
	}

	
	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#getPropertiesEditionPart(java.lang.Class, int, org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent)
	 * 
	 */
	public IPropertiesEditionPart getPropertiesEditionPart(java.lang.Class key, int kind, IPropertiesEditionComponent component) {
		if (key == FeaturemodelViewsRepository.FeatureModel.class) {
			if (kind == FeaturemodelViewsRepository.SWT_KIND)
				return new FeatureModelPropertiesEditionPartImpl(component);
			if (kind == FeaturemodelViewsRepository.FORM_KIND)
				return new FeatureModelPropertiesEditionPartForm(component);
		}
		if (key == FeaturemodelViewsRepository.Feature.class) {
			if (kind == FeaturemodelViewsRepository.SWT_KIND)
				return new FeaturePropertiesEditionPartImpl(component);
			if (kind == FeaturemodelViewsRepository.FORM_KIND)
				return new FeaturePropertiesEditionPartForm(component);
		}
		return null;
	}

}
