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
public class LinkEndCreationDataPopulator implements IElementPopulator {

	@Override
	public void populate(Object fumlElement,
		Object fumlElement_, ConversionResultImpl result) {
			
		if (!(fumlElement_ instanceof org.modelexecution.fuml.Syntax.Actions.IntermediateActions.LinkEndCreationData) ||
			!(fumlElement instanceof fUML.Syntax.Actions.IntermediateActions.LinkEndCreationData)) {
			return;
		}
		
		fUML.Syntax.Actions.IntermediateActions.LinkEndCreationData fumlNamedElement = (fUML.Syntax.Actions.IntermediateActions.LinkEndCreationData) fumlElement;
		org.modelexecution.fuml.Syntax.Actions.IntermediateActions.LinkEndCreationData fumlNamedElement_ = (org.modelexecution.fuml.Syntax.Actions.IntermediateActions.LinkEndCreationData) fumlElement_;
		
		fumlNamedElement.isReplaceAll = fumlNamedElement_.isReplaceAll();
		fumlNamedElement.insertAt = (fUML.Syntax.Actions.BasicActions.InputPin) result
							.getFUMLElement(fumlNamedElement_.getInsertAt());
	}
	
}
