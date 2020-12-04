/**
 * Generated with Acceleo
 */
package de.tubs.sse.spl.deltambt.configmanagement.parts;

// Start of user code for imports
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.jface.viewers.ViewerFilter;



// End of user code

/**
 * 
 * 
 */
@SuppressWarnings("rawtypes")
public interface ConfigurationRepositoryPropertiesEditionPart {

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
	 * @return the belong to SPL
	 * 
	 */
	public String getBelongToSPL();

	/**
	 * Defines a new belong to SPL
	 * @param newValue the new belong to SPL to set
	 * 
	 */
	public void setBelongToSPL(String newValue);


	/**
	 * @return the linked to FM
	 * 
	 */
	public EObject getLinkedToFM();

	/**
	 * Init the linked to FM
	 * @param allResources the ResourceSet where the widget have to process
	 * @param current the current value
	 */
	public void initLinkedToFM(ResourceSet allResources, EObject current);

	/**
	 * Defines a new linked to FM
	 * @param newValue the new linked to FM to set
	 * 
	 */
	public void setLinkedToFM(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setLinkedToFMButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the linked to FM edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToLinkedToFM(ViewerFilter filter);

	/**
	 * Adds the given filter to the linked to FM edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToLinkedToFM(ViewerFilter filter);


	/**
	 * @return the configs to add
	 * 
	 */
	public List getConfigsToAdd();

	/**
	 * @return the configs to remove
	 * 
	 */
	public List getConfigsToRemove();

	/**
	 * @return the configs to move
	 * 
	 */
	public List getConfigsToMove();

	/**
	 * @return the configs to edit
	 * 
	 */
	public Map getConfigsToEdit();

	/**
	 * @return the current configs table
	 * 
	 */
	public List getConfigsTable();

	/**
	 * Init the configs
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initConfigs(EObject current, EReference containingFeature, EReference feature);

	/**
	 * Update the configs
	 * @param newValue the configs to update
	 * 
	 */
	public void updateConfigs(EObject newValue);

	/**
	 * Adds the given filter to the configs edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToConfigs(ViewerFilter filter);

	/**
	 * Adds the given filter to the configs edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToConfigs(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the configs table
	 * 
	 */
	public boolean isContainedInConfigsTable(EObject element);





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
