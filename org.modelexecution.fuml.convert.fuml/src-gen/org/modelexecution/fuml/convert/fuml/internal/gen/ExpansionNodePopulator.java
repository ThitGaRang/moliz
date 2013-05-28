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
public class ExpansionNodePopulator implements IElementPopulator {

	@Override
	public void populate(fUML.Syntax.Classes.Kernel.Element fumlElement,
		org.modelexecution.fuml.Syntax.Classes.Kernel.Element fumlElement_, 
		ConversionResultImpl result
		) {
			
		if (!(fumlElement_ instanceof org.modelexecution.fuml.Syntax.Activities.ExtraStructuredActivities.ExpansionNode) ||
			!(fumlElement instanceof fUML.Syntax.Activities.ExtraStructuredActivities.ExpansionNode)) {
			return;
		}
		
		fUML.Syntax.Activities.ExtraStructuredActivities.ExpansionNode fumlNamedElement = (fUML.Syntax.Activities.ExtraStructuredActivities.ExpansionNode) fumlElement;
		org.modelexecution.fuml.Syntax.Activities.ExtraStructuredActivities.ExpansionNode fumlNamedElement_ = (org.modelexecution.fuml.Syntax.Activities.ExtraStructuredActivities.ExpansionNode) fumlElement_;
		
		fumlNamedElement.regionAsOutput = (fUML.Syntax.Activities.ExtraStructuredActivities.ExpansionRegion) result.getFUMLElement(fumlNamedElement_.getRegionAsOutput());
		fumlNamedElement.regionAsInput = (fUML.Syntax.Activities.ExtraStructuredActivities.ExpansionRegion) result.getFUMLElement(fumlNamedElement_.getRegionAsInput());
							
	}
	
}
