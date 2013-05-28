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
public class ActivityEdgePopulator implements IElementPopulator {

	@Override
	public void populate(fUML.Syntax.Classes.Kernel.Element fumlElement,
		org.modelexecution.fuml.Syntax.Classes.Kernel.Element fumlElement_, 
		ConversionResultImpl result
		) {
			
		if (!(fumlElement_ instanceof org.modelexecution.fuml.Syntax.Activities.IntermediateActivities.ActivityEdge) ||
			!(fumlElement instanceof fUML.Syntax.Activities.IntermediateActivities.ActivityEdge)) {
			return;
		}
		
		fUML.Syntax.Activities.IntermediateActivities.ActivityEdge fumlNamedElement = (fUML.Syntax.Activities.IntermediateActivities.ActivityEdge) fumlElement;
		org.modelexecution.fuml.Syntax.Activities.IntermediateActivities.ActivityEdge fumlNamedElement_ = (org.modelexecution.fuml.Syntax.Activities.IntermediateActivities.ActivityEdge) fumlElement_;
		
		fumlNamedElement.activity = (fUML.Syntax.Activities.IntermediateActivities.Activity) result.getFUMLElement(fumlNamedElement_.getActivity());
		fumlNamedElement.source = (fUML.Syntax.Activities.IntermediateActivities.ActivityNode) result.getFUMLElement(fumlNamedElement_.getSource());
		fumlNamedElement.target = (fUML.Syntax.Activities.IntermediateActivities.ActivityNode) result.getFUMLElement(fumlNamedElement_.getTarget());
		fumlNamedElement.inStructuredNode = (fUML.Syntax.Activities.CompleteStructuredActivities.StructuredActivityNode) result.getFUMLElement(fumlNamedElement_.getInStructuredNode());
		fumlNamedElement.guard = (fUML.Syntax.Classes.Kernel.ValueSpecification) result.getFUMLElement(fumlNamedElement_.getGuard());
							
	}
	
}
