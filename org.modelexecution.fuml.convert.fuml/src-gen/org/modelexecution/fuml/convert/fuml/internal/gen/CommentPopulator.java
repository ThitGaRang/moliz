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
public class CommentPopulator implements IElementPopulator {

	@Override
	public void populate(Object fumlElement,
		Object fumlElement_, ConversionResultImpl result) {
			
		if (!(fumlElement_ instanceof org.modelexecution.fuml.Syntax.Classes.Kernel.Comment) ||
			!(fumlElement instanceof fUML.Syntax.Classes.Kernel.Comment)) {
			return;
		}
		
		fUML.Syntax.Classes.Kernel.Comment fumlNamedElement = (fUML.Syntax.Classes.Kernel.Comment) fumlElement;
		org.modelexecution.fuml.Syntax.Classes.Kernel.Comment fumlNamedElement_ = (org.modelexecution.fuml.Syntax.Classes.Kernel.Comment) fumlElement_;
		
		
		for (org.modelexecution.fuml.Syntax.Classes.Kernel.Element value : fumlNamedElement_.getAnnotatedElement()) {
					fumlNamedElement.annotatedElement.add((fUML.Syntax.Classes.Kernel.Element) result.getFUMLElement(value));
		}
		
		fumlNamedElement.body = fumlNamedElement_.getBody();
	}
	
}
