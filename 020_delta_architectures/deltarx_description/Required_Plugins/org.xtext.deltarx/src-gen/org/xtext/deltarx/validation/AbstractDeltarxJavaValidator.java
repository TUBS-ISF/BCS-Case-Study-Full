/*
* generated by Xtext
*/
package org.xtext.deltarx.validation;
 
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EPackage;

public class AbstractDeltarxJavaValidator extends org.eclipse.xtext.validation.AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(org.xtext.deltarx.deltarx.DeltarxPackage.eINSTANCE);
		return result;
	}

}
