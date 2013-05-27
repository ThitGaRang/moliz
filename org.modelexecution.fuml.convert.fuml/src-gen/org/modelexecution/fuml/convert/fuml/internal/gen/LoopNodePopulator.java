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
public class LoopNodePopulator implements IElementPopulator {

	@Override
	public void populate(Object fumlElement,
		Object fumlElement_, ConversionResultImpl result) {
			
		if (!(fumlElement_ instanceof org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.LoopNode) ||
			!(fumlElement instanceof fUML.Syntax.Activities.CompleteStructuredActivities.LoopNode)) {
			return;
		}
		
		fUML.Syntax.Activities.CompleteStructuredActivities.LoopNode fumlNamedElement = (fUML.Syntax.Activities.CompleteStructuredActivities.LoopNode) fumlElement;
		org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.LoopNode fumlNamedElement_ = (org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.LoopNode) fumlElement_;
		
		fumlNamedElement.isTestedFirst = fumlNamedElement_.isTestedFirst();
		fumlNamedElement.decider = (fUML.Syntax.Actions.BasicActions.OutputPin) result
							.getFUMLElement(fumlNamedElement_.getDecider());
		
		for (org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.ExecutableNode value : fumlNamedElement_.getTest()) {
					fumlNamedElement.test.add((fUML.Syntax.Activities.CompleteStructuredActivities.ExecutableNode) result.getFUMLElement(value));
		}
		
		
		for (org.modelexecution.fuml.Syntax.Actions.BasicActions.OutputPin value : fumlNamedElement_.getBodyOutput()) {
					fumlNamedElement.bodyOutput.add((fUML.Syntax.Actions.BasicActions.OutputPin) result.getFUMLElement(value));
		}
		
		
		for (org.modelexecution.fuml.Syntax.Actions.BasicActions.InputPin value : fumlNamedElement_.getLoopVariableInput()) {
					fumlNamedElement.loopVariableInput.add((fUML.Syntax.Actions.BasicActions.InputPin) result.getFUMLElement(value));
		}
		
		
		for (org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.ExecutableNode value : fumlNamedElement_.getBodyPart()) {
					fumlNamedElement.bodyPart.add((fUML.Syntax.Activities.CompleteStructuredActivities.ExecutableNode) result.getFUMLElement(value));
		}
		
		
		for (org.modelexecution.fuml.Syntax.Actions.BasicActions.OutputPin value : fumlNamedElement_.getResult()) {
					fumlNamedElement.result.add((fUML.Syntax.Actions.BasicActions.OutputPin) result.getFUMLElement(value));
		}
		
		
		for (org.modelexecution.fuml.Syntax.Actions.BasicActions.OutputPin value : fumlNamedElement_.getLoopVariable()) {
					fumlNamedElement.loopVariable.add((fUML.Syntax.Actions.BasicActions.OutputPin) result.getFUMLElement(value));
		}
		
		
		for (org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.ExecutableNode value : fumlNamedElement_.getSetupPart()) {
					fumlNamedElement.setupPart.add((fUML.Syntax.Activities.CompleteStructuredActivities.ExecutableNode) result.getFUMLElement(value));
		}
		
	}
	
}
