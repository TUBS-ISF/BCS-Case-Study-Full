/**
 * Generated with Acceleo
 */
package de.tubs.sse.spl.deltambt.configmanagement.parts;

// Start of user code for imports
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.jface.viewers.ViewerFilter;



// End of user code

/**
 * 
 * 
 */
@SuppressWarnings("rawtypes")
public interface ConfigurationPropertiesEditionPart {

	/**
	 * @return the name
	 * 
	 */
	public String getName();

	/**
	 * Defines a new name
	 * @param newValue the new name to set
	 * 
	 */
	public void setName(String newValue);


	/**
	 * @return the features to add
	 * 
	 */
	public List getFeaturesToAdd();

	/**
	 * @return the features to remove
	 * 
	 */
	public List getFeaturesToRemove();

	/**
	 * @return the current features table
	 * 
	 */
	public List getFeaturesTable();

	/**
	 * Init the features
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initFeatures(EObject current, EReference containingFeature, EReference feature);

	/**
	 * Update the features
	 * @param newValue the features to update
	 * 
	 */
	public void updateFeatures(EObject newValue);

	/**
	 * Adds the given filter to the features edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToFeatures(ViewerFilter filter);

	/**
	 * Adds the given filter to the features edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToFeatures(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the features table
	 * 
	 */
	public boolean isContainedInFeaturesTable(EObject element);





	/**
	 * Returns the internationalized title text.
	 * 
	 * @return the internationalized title text.
	 * 
	 */
	public String getTitle();

	// Start of user code for additional methods
	
	// End of user code

}
