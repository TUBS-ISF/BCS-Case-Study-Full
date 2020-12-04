package de.tubs.sse.spl.deltambt.configmanagement.presentation.action;

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate2;
import org.eclipse.ui.IEditorActionDelegate;
import org.eclipse.ui.IEditorPart;

import de.tubs.sse.spl.deltambt.configmanagement.ConfigurationRepository;
import de.tubs.sse.spl.deltambt.configmanagement.presentation.ConfigmanagementEditor;
import de.tubs.sse.spl.deltambt.configmanagement.presentation.dialog.FeatureConfigurationDialog;


/**
 * This action delegate calls upon the creation of new feature configurations.
 */
public class CreateConfigurationAction
	implements IEditorActionDelegate, IActionDelegate2 {

	/**
	 * Error message to display when an exception occured
	 */
	protected static final String MESSAGE_EXCEPTION = "An unexpected exception occurs. The operation can't complete successfully.  See Error Log View for details.";

	/**
	 * The shell this action is hosted in
	 */
	protected Shell shell = null;

	/**
	 * The active editor
	 */
	protected ConfigmanagementEditor editor = null;

	/**
	 * Selected EObjects
	 */
	protected Collection<EObject> selectedEObjects = null;

	/**
	 * The InputDialog title
	 */
	private final String title = "Configuration Creation Dialog";

	/*
	 * @see org.eclipse.ui.IActionDelegate#selectionChanged(org.eclipse.jface.action.IAction,
	 *      org.eclipse.jface.viewers.ISelection)
	 */
	@SuppressWarnings("unchecked")
	public void selectionChanged(IAction action, final ISelection selection) {
		this.selectedEObjects = null;
		try {
			if (selection instanceof IStructuredSelection) {
				IStructuredSelection structuredSelection = (IStructuredSelection) selection;
				this.selectedEObjects = structuredSelection.toList();
			}
		} catch (Exception e) {
			// Exceptions are not expected
			MessageDialog.openInformation(shell, title, MESSAGE_EXCEPTION);
			throw new RuntimeException(e);
		} finally {
			action.setEnabled((null != selectedEObjects));
		}
		
		for (Object next : selectedEObjects) {
			if (!(next instanceof EObject)) {
				action.setEnabled(false);
			}
		}
	}

	/*
	 * @see org.eclipse.ui.IActionDelegate2#dispose()
	 */
	public void dispose() {
		//No-op
	}

	/*
	 * @see org.eclipse.ui.IEditorActionDelegate#setActiveEditor(org.eclipse.jface.action.IAction,
	 *      org.eclipse.ui.IEditorPart)
	 */
	public void setActiveEditor(IAction action, IEditorPart targetEditor) {
		this.editor = (ConfigmanagementEditor) targetEditor;
		if ( targetEditor != null ) {
			this.shell = targetEditor.getSite().getShell();
		}
	}

	/*
	 * @see org.eclipse.ui.IActionDelegate2#init(org.eclipse.jface.action.IAction)
	 */
	public void init(IAction action) {
		// No-op
	}

	/*
	 * @see org.eclipse.ui.IActionDelegate2#runWithEvent(org.eclipse.jface.action.IAction,
	 *      org.eclipse.swt.widgets.Event)
	 */
	public void runWithEvent(IAction action, Event event) {
		run(action);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IActionDelegate#run(org.eclipse.jface.action.IAction)
	 */
	public void run(IAction action) {
		FeatureConfigurationDialog featureConfigDialog = new FeatureConfigurationDialog(new Shell(), 
				SWT.DIALOG_TRIM | SWT.APPLICATION_MODAL, "Define a Feature Configuration");
		Resource res = null;
		ConfigurationRepository repo = null;
		for(EObject obj: selectedEObjects)
		{
			if(obj instanceof ConfigurationRepository)
			{
				repo = (ConfigurationRepository)obj;
				res = repo.eResource();
			}
		}
		if(res != null)
		{
			String path = res.getURI().toPlatformString(true);
			featureConfigDialog.setFeatureModel(repo.getLinkedToFM());
			featureConfigDialog.setConfigurationRepository(path);
			featureConfigDialog.openDialog();
		}
		else
		{
			MessageDialog.openWarning(shell, "Selection Warning", "Please select a ConfigurationRepository for creating a new feature configuration.");			
		} 
	}
}
