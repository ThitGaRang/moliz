/*
* Copyright (c) 2013 Vienna University of Technology.
* All rights reserved. This program and the accompanying materials are made 
* available under the terms of the Eclipse Public License v1.0 which accompanies 
* this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
* 
* Contributors:
* Philip Langer - initial API and generator
* Tanja Mayerhofer - generator
*/
package org.modelexecution.fuml.convert.fuml.internal.gen;
    	
import javax.annotation.Generated;

import org.modelexecution.fuml.convert.IConversionResult;
import org.modelexecution.fuml.convert.IValueConversionResult;
import org.modelexecution.fuml.convert.fuml.internal.IValuePopulator;

@Generated(value="Generated by org.modelexecution.fuml.convert.fuml.gen.ElementPopulatorGenerator.xtend")
public class ReferencePopulator implements IValuePopulator {

	@Override
	public void populate(Object fumlElement,
		Object fumlElement_, 
		IConversionResult result
		, IValueConversionResult valueConversionResult) {
			
		if (!(fumlElement_ instanceof org.modelexecution.fuml.Semantics.Classes.Kernel.Reference) ||
			!(fumlElement instanceof fUML.Semantics.Classes.Kernel.Reference)) {
			return;
		}
		
		fUML.Semantics.Classes.Kernel.Reference fumlNamedElement = (fUML.Semantics.Classes.Kernel.Reference) fumlElement;
		org.modelexecution.fuml.Semantics.Classes.Kernel.Reference fumlNamedElement_ = (org.modelexecution.fuml.Semantics.Classes.Kernel.Reference) fumlElement_;
		
		fumlNamedElement.referent = (fUML.Semantics.Classes.Kernel.Object_) valueConversionResult.getFUMLElement(fumlNamedElement_.getReferent());
							
	}
	
}
