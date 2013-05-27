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
import org.modelexecution.fuml.convert.impl.ConversionResultImpl;
import org.modelexecution.fuml.convert.fuml.internal.IElementPopulator;

@Generated(value="Generated by org.modelexecution.fuml.convert.fuml.gen.ElementPopulatorGenerator.xtend")
public class IntegerValuePopulator implements IElementPopulator {

	@Override
	public void populate(Object fumlElement,
		Object fumlElement_, ConversionResultImpl result) {
			
		if (!(fumlElement_ instanceof org.modelexecution.fuml.Semantics.Classes.Kernel.IntegerValue) ||
			!(fumlElement instanceof fUML.Semantics.Classes.Kernel.IntegerValue)) {
			return;
		}
		
		fUML.Semantics.Classes.Kernel.IntegerValue fumlNamedElement = (fUML.Semantics.Classes.Kernel.IntegerValue) fumlElement;
		org.modelexecution.fuml.Semantics.Classes.Kernel.IntegerValue fumlNamedElement_ = (org.modelexecution.fuml.Semantics.Classes.Kernel.IntegerValue) fumlElement_;
		
		fumlNamedElement.value = fumlNamedElement_.getValue();
	}
	
}
