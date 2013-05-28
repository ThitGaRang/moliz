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

import org.modelexecution.fuml.convert.fuml.internal.IElementPopulator;
import org.modelexecution.fuml.convert.impl.ConversionResultImpl;

@Generated(value="Generated by org.modelexecution.fuml.convert.fuml.gen.ElementPopulatorGenerator.xtend")
public class CallActionPopulator implements IElementPopulator {

	@Override
	public void populate(fUML.Syntax.Classes.Kernel.Element fumlElement,
		org.modelexecution.fuml.Syntax.Classes.Kernel.Element fumlElement_, 
		ConversionResultImpl result
		) {
			
		if (!(fumlElement_ instanceof org.modelexecution.fuml.Syntax.Actions.BasicActions.CallAction) ||
			!(fumlElement instanceof fUML.Syntax.Actions.BasicActions.CallAction)) {
			return;
		}
		
		fUML.Syntax.Actions.BasicActions.CallAction fumlNamedElement = (fUML.Syntax.Actions.BasicActions.CallAction) fumlElement;
		org.modelexecution.fuml.Syntax.Actions.BasicActions.CallAction fumlNamedElement_ = (org.modelexecution.fuml.Syntax.Actions.BasicActions.CallAction) fumlElement_;
		
		fumlNamedElement.isSynchronous = fumlNamedElement_.isSynchronous();
		
		for (org.modelexecution.fuml.Syntax.Actions.BasicActions.OutputPin value : fumlNamedElement_.getResult()) {
					fumlNamedElement.result.add((fUML.Syntax.Actions.BasicActions.OutputPin) result.getFUMLElement(value));
		}
		
							
	}
	
}
