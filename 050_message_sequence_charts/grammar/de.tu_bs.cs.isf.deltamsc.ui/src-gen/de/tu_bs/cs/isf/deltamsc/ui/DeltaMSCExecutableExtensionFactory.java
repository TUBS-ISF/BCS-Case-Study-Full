/*
 * generated by Xtext
 */
package de.tu_bs.cs.isf.deltamsc.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import de.tu_bs.cs.isf.deltamsc.ui.internal.DeltaMSCActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class DeltaMSCExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return DeltaMSCActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return DeltaMSCActivator.getInstance().getInjector(DeltaMSCActivator.DE_TU_BS_CS_ISF_DELTAMSC_DELTAMSC);
	}
	
}
