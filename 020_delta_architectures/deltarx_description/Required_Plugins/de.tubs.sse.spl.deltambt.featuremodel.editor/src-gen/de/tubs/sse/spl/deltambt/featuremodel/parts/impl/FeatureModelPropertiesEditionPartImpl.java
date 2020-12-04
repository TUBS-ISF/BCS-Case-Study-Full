/**
 * Generated with Acceleo
 */
package de.tubs.sse.spl.deltambt.featuremodel.parts.impl;

// Start of user code for imports
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;

import de.tubs.sse.spl.deltambt.featuremodel.parts.FeatureModelPropertiesEditionPart;
import de.tubs.sse.spl.deltambt.featuremodel.parts.FeaturemodelViewsRepository;
import de.tubs.sse.spl.deltambt.featuremodel.providers.FeaturemodelMessages;



// End of user code	

/**
 * 
 * 
 */
public class FeatureModelPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, FeatureModelPropertiesEditionPart {

	protected Text name;
	protected Text belongToSPL;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public FeatureModelPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart#
	 * 			createFigure(org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public Composite createFigure(final Composite parent) {
		view = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		view.setLayout(layout);
		createControls(view);
		return view;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart#
	 * 			createControls(org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public void createControls(Composite view) { 
		createPropertiesGroup(view);


		// Start of user code for additional ui definition
		
		// End of user code
	}

	/**
	 * 
	 */
	protected void createPropertiesGroup(Composite parent) {
		Group propertiesGroup = new Group(parent, SWT.NONE);
		propertiesGroup.setText(FeaturemodelMessages.FeatureModelPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		createNameText(propertiesGroup);
		createBelongToSPLText(propertiesGroup);
	}

	
	protected void createNameText(Composite parent) {
		SWTUtils.createPartLabel(parent, FeaturemodelMessages.FeatureModelPropertiesEditionPart_NameLabel, propertiesEditionComponent.isRequired(FeaturemodelViewsRepository.FeatureModel.name, FeaturemodelViewsRepository.SWT_KIND));
		name = new Text(parent, SWT.BORDER);
		GridData nameData = new GridData(GridData.FILL_HORIZONTAL);
		name.setLayoutData(nameData);
		name.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FeatureModelPropertiesEditionPartImpl.this, FeaturemodelViewsRepository.FeatureModel.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
			}

		});
		name.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FeatureModelPropertiesEditionPartImpl.this, FeaturemodelViewsRepository.FeatureModel.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, FeaturemodelViewsRepository.FeatureModel.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(FeaturemodelViewsRepository.FeatureModel.name, FeaturemodelViewsRepository.SWT_KIND), null); //$NON-NLS-1$
	}

	
	protected void createBelongToSPLText(Composite parent) {
		SWTUtils.createPartLabel(parent, FeaturemodelMessages.FeatureModelPropertiesEditionPart_BelongToSPLLabel, propertiesEditionComponent.isRequired(FeaturemodelViewsRepository.FeatureModel.belongToSPL, FeaturemodelViewsRepository.SWT_KIND));
		belongToSPL = new Text(parent, SWT.BORDER);
		GridData belongToSPLData = new GridData(GridData.FILL_HORIZONTAL);
		belongToSPL.setLayoutData(belongToSPLData);
		belongToSPL.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FeatureModelPropertiesEditionPartImpl.this, FeaturemodelViewsRepository.FeatureModel.belongToSPL, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, belongToSPL.getText()));
			}

		});
		belongToSPL.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FeatureModelPropertiesEditionPartImpl.this, FeaturemodelViewsRepository.FeatureModel.belongToSPL, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, belongToSPL.getText()));
				}
			}

		});
		EditingUtils.setID(belongToSPL, FeaturemodelViewsRepository.FeatureModel.belongToSPL);
		EditingUtils.setEEFtype(belongToSPL, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(FeaturemodelViewsRepository.FeatureModel.belongToSPL, FeaturemodelViewsRepository.SWT_KIND), null); //$NON-NLS-1$
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionListener#firePropertiesChanged(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void firePropertiesChanged(IPropertiesEditionEvent event) {
		// Start of user code for tab synchronization
		
		// End of user code
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.tubs.sse.spl.deltambt.featuremodel.parts.FeatureModelPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.tubs.sse.spl.deltambt.featuremodel.parts.FeatureModelPropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see de.tubs.sse.spl.deltambt.featuremodel.parts.FeatureModelPropertiesEditionPart#getBelongToSPL()
	 * 
	 */
	public String getBelongToSPL() {
		return belongToSPL.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.tubs.sse.spl.deltambt.featuremodel.parts.FeatureModelPropertiesEditionPart#setBelongToSPL(String newValue)
	 * 
	 */
	public void setBelongToSPL(String newValue) {
		if (newValue != null) {
			belongToSPL.setText(newValue);
		} else {
			belongToSPL.setText(""); //$NON-NLS-1$
		}
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return FeaturemodelMessages.FeatureModel_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
