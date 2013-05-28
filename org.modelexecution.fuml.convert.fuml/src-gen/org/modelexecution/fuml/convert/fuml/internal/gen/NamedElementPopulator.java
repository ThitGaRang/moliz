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
public class NamedElementPopulator implements IElementPopulator {

	@Override
	public void populate(fUML.Syntax.Classes.Kernel.Element fumlElement,
		org.modelexecution.fuml.Syntax.Classes.Kernel.Element fumlElement_, 
		ConversionResultImpl result
		) {
			
		if (!(fumlElement_ instanceof org.modelexecution.fuml.Syntax.Classes.Kernel.NamedElement) ||
			!(fumlElement instanceof fUML.Syntax.Classes.Kernel.NamedElement)) {
			return;
		}
		
		fUML.Syntax.Classes.Kernel.NamedElement fumlNamedElement = (fUML.Syntax.Classes.Kernel.NamedElement) fumlElement;
		org.modelexecution.fuml.Syntax.Classes.Kernel.NamedElement fumlNamedElement_ = (org.modelexecution.fuml.Syntax.Classes.Kernel.NamedElement) fumlElement_;
		
		fumlNamedElement.setName(fumlNamedElement_.getName());
		fumlNamedElement.visibility = castVisibilityKind(fumlNamedElement_.getVisibility());
		fumlNamedElement.qualifiedName = fumlNamedElement_.getQualifiedName();
		fumlNamedElement.namespace = (fUML.Syntax.Classes.Kernel.Namespace) result.getFUMLElement(fumlNamedElement_.getNamespace());
							
	}
	
	private fUML.Syntax.Classes.Kernel.VisibilityKind castVisibilityKind(org.modelexecution.fuml.Syntax.Classes.Kernel.VisibilityKind enumVal) {
		switch (enumVal.getValue()) {
			case org.modelexecution.fuml.Syntax.Classes.Kernel.VisibilityKind.PUBLIC_VALUE:
				return fUML.Syntax.Classes.Kernel.VisibilityKind.public_;
			case org.modelexecution.fuml.Syntax.Classes.Kernel.VisibilityKind.PRIVATE_VALUE:
				return fUML.Syntax.Classes.Kernel.VisibilityKind.private_;
			case org.modelexecution.fuml.Syntax.Classes.Kernel.VisibilityKind.PROTECTED_VALUE:
				return fUML.Syntax.Classes.Kernel.VisibilityKind.protected_;
			case org.modelexecution.fuml.Syntax.Classes.Kernel.VisibilityKind.PACKAGE_VALUE:
				return fUML.Syntax.Classes.Kernel.VisibilityKind.package_;
		}
		return null;
	}
}
