
package org.xtext.deltarx;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class DeltarxStandaloneSetup extends DeltarxStandaloneSetupGenerated{

	public static void doSetup() {
		new DeltarxStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

