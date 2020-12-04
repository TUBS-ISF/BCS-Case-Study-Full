package de.tubs.sse.spl.deltambt.configmanagement.providers;

import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.PlatformUI;

import de.tubs.sse.spl.deltambt.configmanagement.Configuration;
import de.tubs.sse.spl.deltambt.configmanagement.ConfigurationRepository;
import de.tubs.sse.spl.deltambt.configmanagement.presentation.ConfigmanagementEditor;

/**
 * Label provider for the title bar for the tabbed property sheet 
 * page of the members of configuration management.
 * 
 * This class is based on the HockeyleagueLabelProvider class by Anthony Hunter 
 * of the EMF Hockey League Example.
 * {@link http://dev.eclipse.org/viewcvs/viewvc.cgi/org.eclipse.ui.examples.views.properties.tabbed/org.eclipse.ui.examples.views.properties.tabbed.hockeyleague/}
 * 
 * @author Sascha Lity
 *
 */
public class ConfigManagementLabelProvider extends LabelProvider {
	
	private AdapterFactoryLabelProvider adapterFactoryLabelProvider;

	/**
	 * @see org.eclipse.jface.viewers.ILabelProvider#getImage(java.lang.Object)
	 */
	public Image getImage(Object element) {
		if (element == null || element.equals(StructuredSelection.EMPTY)) {
			return null;
		}
		if (element instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) element;
			if (areDifferentTypes(structuredSelection)) {
				return null;
			}
			element = structuredSelection.getFirstElement();
		}
		if (element instanceof EObject || element instanceof Resource) {
			return getAdapterFactoryLabelProvider().getImage(element);
		}
		return null;
	}

	/**
	 * @see org.eclipse.jface.viewers.ILabelProvider#getText(java.lang.Object)
	 */
	public String getText(Object element) {
		if (element == null || element.equals(StructuredSelection.EMPTY)) {
			return null;
		}

		if (element instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) element;
			if (areDifferentTypes(structuredSelection)) {
				return structuredSelection.size() + " items selected";//$NON-NLS-1$
			}
			element = structuredSelection.getFirstElement();
		}
		if (element instanceof ConfigurationRepository) 
		{
			return "Configuration Repository: " +  ((ConfigurationRepository)element).getName();
		}
		else if (element instanceof Configuration) 
		{
			return "Configuration: " +  ((Configuration)element).getName();	
		}
		
		return null;
	}

	/**
	 * @return
	 */
	private AdapterFactoryLabelProvider getAdapterFactoryLabelProvider() {
		if (adapterFactoryLabelProvider == null) {
			adapterFactoryLabelProvider = new AdapterFactoryLabelProvider(
				((ConfigmanagementEditor) PlatformUI.getWorkbench()
					.getActiveWorkbenchWindow().getActivePage()
					.getActiveEditor()).getAdapterFactory());
		}
		return adapterFactoryLabelProvider;
	}

	/**
	 * Determine there are objects in the structured selection of different
	 * types.
	 * 
	 * @param structuredSelection
	 *            the structured selection.
	 * @return true if there are objects of different types in the selection.
	 */
	private boolean areDifferentTypes(IStructuredSelection structuredSelection) {
		if (structuredSelection.size() == 1) {
			return false;
		}
		Iterator<?> i = structuredSelection.iterator();
		Object element = i.next();
		for (; i.hasNext();) {
			if (i.next().getClass() != element.getClass()) {
				return true;
			}
		}

		return false;
	}
}
