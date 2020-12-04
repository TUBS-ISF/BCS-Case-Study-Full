/**
 * Generated with Acceleo
 */
package de.tubs.sse.spl.deltambt.featuremodel.parts;

// Start of user code for imports
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.jface.viewers.ViewerFilter;



// End of user code

/**
 * 
 * 
 */
@SuppressWarnings("rawtypes")
public interface FeaturePropertiesEditionPart {

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
	 * @return the type
	 * 
	 */
	public Enumerator getType();

	/**
	 * Init the type
	 * @param eenum the enum to manage
	 * @param current the current value
	 */
	public void initType(EEnum eenum, Enumerator current);

	/**
	 * Defines a new type
	 * @param newValue the new type to set
	 * 
	 */
	public void setType(Enumerator newValue);


	/**
	 * @return the description
	 * 
	 */
	public String getDescription();

	/**
	 * Defines a new description
	 * @param newValue the new description to set
	 * 
	 */
	public void setDescription(String newValue);


	/**
	 * @return the sub to add
	 * 
	 */
	public List getSubToAdd();

	/**
	 * @return the sub to remove
	 * 
	 */
	public List getSubToRemove();

	/**
	 * @return the sub to move
	 * 
	 */
	public List getSubToMove();

	/**
	 * @return the sub to edit
	 * 
	 */
	public Map getSubToEdit();

	/**
	 * @return the current sub table
	 * 
	 */
	public List getSubTable();

	/**
	 * Init the sub
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initSub(EObject current, EReference containingFeature, EReference feature);

	/**
	 * Update the sub
	 * @param newValue the sub to update
	 * 
	 */
	public void updateSub(EObject newValue);

	/**
	 * Adds the given filter to the sub edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToSub(ViewerFilter filter);

	/**
	 * Adds the given filter to the sub edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToSub(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the sub table
	 * 
	 */
	public boolean isContainedInSubTable(EObject element);


	/**
	 * @return the or to add
	 * 
	 */
	public List getOrToAdd();

	/**
	 * @return the or to remove
	 * 
	 */
	public List getOrToRemove();

	/**
	 * @return the or to move
	 * 
	 */
	public List getOrToMove();

	/**
	 * @return the or to edit
	 * 
	 */
	public Map getOrToEdit();

	/**
	 * @return the current or table
	 * 
	 */
	public List getOrTable();

	/**
	 * Init the or
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initOr(EObject current, EReference containingFeature, EReference feature);

	/**
	 * Update the or
	 * @param newValue the or to update
	 * 
	 */
	public void updateOr(EObject newValue);

	/**
	 * Adds the given filter to the or edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToOr(ViewerFilter filter);

	/**
	 * Adds the given filter to the or edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToOr(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the or table
	 * 
	 */
	public boolean isContainedInOrTable(EObject element);


	/**
	 * @return the alternative to add
	 * 
	 */
	public List getAlternativeToAdd();

	/**
	 * @return the alternative to remove
	 * 
	 */
	public List getAlternativeToRemove();

	/**
	 * @return the alternative to move
	 * 
	 */
	public List getAlternativeToMove();

	/**
	 * @return the alternative to edit
	 * 
	 */
	public Map getAlternativeToEdit();

	/**
	 * @return the current alternative table
	 * 
	 */
	public List getAlternativeTable();

	/**
	 * Init the alternative
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initAlternative(EObject current, EReference containingFeature, EReference feature);

	/**
	 * Update the alternative
	 * @param newValue the alternative to update
	 * 
	 */
	public void updateAlternative(EObject newValue);

	/**
	 * Adds the given filter to the alternative edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToAlternative(ViewerFilter filter);

	/**
	 * Adds the given filter to the alternative edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToAlternative(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the alternative table
	 * 
	 */
	public boolean isContainedInAlternativeTable(EObject element);


	/**
	 * @return the require to add
	 * 
	 */
	public List getRequireToAdd();

	/**
	 * @return the require to remove
	 * 
	 */
	public List getRequireToRemove();

	/**
	 * @return the current require table
	 * 
	 */
	public List getRequireTable();

	/**
	 * Init the require
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initRequire(EObject current, EReference containingFeature, EReference feature);

	/**
	 * Update the require
	 * @param newValue the require to update
	 * 
	 */
	public void updateRequire(EObject newValue);

	/**
	 * Adds the given filter to the require edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToRequire(ViewerFilter filter);

	/**
	 * Adds the given filter to the require edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToRequire(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the require table
	 * 
	 */
	public boolean isContainedInRequireTable(EObject element);


	/**
	 * @return the exclude to add
	 * 
	 */
	public List getExcludeToAdd();

	/**
	 * @return the exclude to remove
	 * 
	 */
	public List getExcludeToRemove();

	/**
	 * @return the current exclude table
	 * 
	 */
	public List getExcludeTable();

	/**
	 * Init the exclude
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initExclude(EObject current, EReference containingFeature, EReference feature);

	/**
	 * Update the exclude
	 * @param newValue the exclude to update
	 * 
	 */
	public void updateExclude(EObject newValue);

	/**
	 * Adds the given filter to the exclude edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToExclude(ViewerFilter filter);

	/**
	 * Adds the given filter to the exclude edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToExclude(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the exclude table
	 * 
	 */
	public boolean isContainedInExcludeTable(EObject element);


	/**
	 * @return the interact with to add
	 * 
	 */
	public List getInteractWithToAdd();

	/**
	 * @return the interact with to remove
	 * 
	 */
	public List getInteractWithToRemove();

	/**
	 * @return the current interact with table
	 * 
	 */
	public List getInteractWithTable();

	/**
	 * Init the interact with
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initInteractWith(EObject current, EReference containingFeature, EReference feature);

	/**
	 * Update the interact with
	 * @param newValue the interact with to update
	 * 
	 */
	public void updateInteractWith(EObject newValue);

	/**
	 * Adds the given filter to the interact with edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToInteractWith(ViewerFilter filter);

	/**
	 * Adds the given filter to the interact with edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToInteractWith(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the interact with table
	 * 
	 */
	public boolean isContainedInInteractWithTable(EObject element);





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
