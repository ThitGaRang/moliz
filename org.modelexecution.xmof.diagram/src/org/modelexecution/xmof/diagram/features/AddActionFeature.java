/*
 * Copyright (c) 2012 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License v1.0 which accompanies 
 * this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Philip Langer - initial API and implementation
 */
package org.modelexecution.xmof.diagram.features;

import static org.modelexecution.xmof.diagram.DiagramColors.BACKGROUND;
import static org.modelexecution.xmof.diagram.DiagramColors.FOREGROUND;
import static org.modelexecution.xmof.diagram.DiagramColors.TEXT_FOREGROUND;
import static org.modelexecution.xmof.diagram.DiagramDimensions.ACTION_CORNER_HEIGHT;
import static org.modelexecution.xmof.diagram.DiagramDimensions.ACTION_CORNER_WIDTH;
import static org.modelexecution.xmof.diagram.DiagramDimensions.ACTION_LINE_WIDTH;
import static org.modelexecution.xmof.diagram.DiagramDimensions.PIN_HEIGHT;
import static org.modelexecution.xmof.diagram.DiagramDimensions.PIN_LABEL_HEIGHT;
import static org.modelexecution.xmof.diagram.DiagramDimensions.PIN_LABEL_MARGIN;
import static org.modelexecution.xmof.diagram.DiagramDimensions.PIN_WIDTH;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.impl.AbstractAddFeature;
import org.eclipse.graphiti.mm.algorithms.Rectangle;
import org.eclipse.graphiti.mm.algorithms.RoundedRectangle;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.algorithms.styles.Font;
import org.eclipse.graphiti.mm.algorithms.styles.Orientation;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;
import org.modelexecution.xmof.Syntax.Actions.BasicActions.Action;
import org.modelexecution.xmof.Syntax.Actions.BasicActions.InputPin;
import org.modelexecution.xmof.Syntax.Actions.BasicActions.OutputPin;
import org.modelexecution.xmof.diagram.DiagramFonts;

public class AddActionFeature extends AbstractAddFeature {

	public AddActionFeature(IFeatureProvider fp) {
		super(fp);
	}

	@Override
	public boolean canAdd(IAddContext context) {
		return context.getNewObject() instanceof Action
				&& context.getTargetContainer() instanceof Diagram;
	}

	@Override
	public PictogramElement add(IAddContext context) {
		Action addedAction = getAddedAction(context);
		Diagram targetDiagram = (Diagram) context.getTargetContainer();

		ContainerShape containerShape = getPeCreateService()
				.createContainerShape(targetDiagram, true);
		createActionRectangle(context, containerShape);
		addActionLabels(addedAction, containerShape);
		addOutputPins(context);
		addInputPins(context);

		getPeCreateService().createChopboxAnchor(containerShape);
		layoutPictogramElement(containerShape);

		return containerShape;
	}

	private Action getAddedAction(IAddContext context) {
		Action addedAction = (Action) context.getNewObject();
		return addedAction;
	}

	private void createActionRectangle(IAddContext context,
			ContainerShape containerShape) {

		Action addedAction = getAddedAction(context);
		ActionDimensionCalculator calculator = new ActionDimensionCalculator(
				addedAction, getDiagram());

		RoundedRectangle roundedRectangle = getGaService()
				.createRoundedRectangle(containerShape, ACTION_CORNER_WIDTH,
						ACTION_CORNER_HEIGHT);
		roundedRectangle.setForeground(manageColor(FOREGROUND));
		roundedRectangle.setBackground(manageColor(BACKGROUND));
		roundedRectangle.setLineWidth(ACTION_LINE_WIDTH);
		getGaService().setLocationAndSize(roundedRectangle, context.getX(),
				context.getY(), calculator.getActionRectangleWidth(),
				calculator.getActionRectangleHeight());

		link(containerShape, addedAction);
	}

	private Font getActionNameFont() {
		return DiagramFonts.getActionNameFont(getDiagram());
	}

	private Font getActionTypeNameFont() {
		return DiagramFonts.getActionTypeNameFont(getDiagram());
	}

	private void addActionLabels(Action addedAction,
			ContainerShape containerShape) {
		Shape actionTypeTextShape = getPeCreateService().createShape(
				containerShape, false);

		ActionDimensionCalculator calculator = new ActionDimensionCalculator(
				addedAction, getDiagram(), getActionTypeName(addedAction));

		Text actionTypeText = getGaService().createText(actionTypeTextShape,
				getActionTypeName(addedAction));
		actionTypeText.setForeground(manageColor(TEXT_FOREGROUND));
		actionTypeText.setHorizontalAlignment(Orientation.ALIGNMENT_RIGHT);
		actionTypeText.setFont(getActionTypeNameFont());
		getGaService().setLocationAndSize(actionTypeText, 5, 0,
				calculator.getActionTypeNameTextWidth(),
				calculator.getActionTypeNameTextHeight());

		Shape actionNameShape = getPeCreateService().createShape(
				containerShape, false);
		Text actionNameText = getGaService().createText(actionNameShape,
				addedAction.getName());
		actionNameText.setForeground(manageColor(TEXT_FOREGROUND));
		actionNameText.setHorizontalAlignment(Orientation.ALIGNMENT_CENTER);
		actionNameText.setVerticalAlignment(Orientation.ALIGNMENT_MIDDLE);
		actionNameText.setFont(getActionNameFont());
		getGaService().setLocationAndSize(actionNameText, 0, 0,
				calculator.getActionNameTextWidth(),
				calculator.getActionNameTextHeight());

		link(actionTypeTextShape, addedAction);
		link(actionNameShape, addedAction);
	}

	private String getActionTypeName(Action addedAction) {
		return addedAction.eClass().getName();
	}

	private IPeCreateService getPeCreateService() {
		return Graphiti.getPeCreateService();
	}

	private IGaService getGaService() {
		return Graphiti.getGaService();
	}

	private void addOutputPins(IAddContext context) {
		Action addedAction = getAddedAction(context);
		Diagram diagram = (Diagram) context.getTargetContainer();
		ActionDimensionCalculator calculator = new ActionDimensionCalculator(
				addedAction, getDiagram(), context.getX(), context.getY());

		int pinNumber = 1;
		for (OutputPin outputPin : addedAction.getOutput()) {
			Shape pinShape = getPeCreateService().createContainerShape(diagram,
					true);

			Rectangle invisibleRectangle = getGaService()
					.createInvisibleRectangle(pinShape);
			getGaService().setLocationAndSize(
					invisibleRectangle,
					calculator.getOutputPinAreaX(calculator
							.getActionRectangleWidth()),
					calculator.getOutputPinAreaY(pinNumber),
					calculator.getOutputPinAreaWidth(),
					calculator.getPinAreaHeight());

			Text text = getGaService().createText(invisibleRectangle,
					outputPin.getName());
			text.setForeground(manageColor(TEXT_FOREGROUND));
			text.setHorizontalAlignment(Orientation.ALIGNMENT_LEFT);
			text.setFont(getGaService().manageDefaultFont(getDiagram(), false,
					false));
			getGaService().setLocationAndSize(text, PIN_LABEL_MARGIN, 0,
					calculator.getOutputPinNameWidth(), PIN_LABEL_HEIGHT);

			Rectangle pinRectangle = getGaService().createRectangle(
					invisibleRectangle);
			pinRectangle.setForeground(manageColor(FOREGROUND));
			pinRectangle.setBackground(manageColor(BACKGROUND));
			pinRectangle.setLineWidth(ACTION_LINE_WIDTH);
			getGaService().setLocationAndSize(pinRectangle, 0, PIN_HEIGHT,
					PIN_WIDTH, PIN_HEIGHT);

			getPeCreateService().createChopboxAnchor(pinShape);

			link(pinShape, outputPin);
			pinNumber++;
		}
	}

	private void addInputPins(IAddContext context) {
		Action addedAction = getAddedAction(context);
		Diagram diagram = (Diagram) context.getTargetContainer();
		ActionDimensionCalculator calculator = new ActionDimensionCalculator(
				addedAction, getDiagram(), context.getX(), context.getY());

		int pinNumber = 1;

		for (InputPin inputPin : addedAction.getInput()) {
			Shape pinShape = getPeCreateService().createContainerShape(diagram,
					true);

			Rectangle invisibleRectangle = getGaService()
					.createInvisibleRectangle(pinShape);
			getGaService().setLocationAndSize(invisibleRectangle,
					calculator.getInputPinAreaX(),
					calculator.getInputPinAreaY(pinNumber),
					calculator.getInputPinAreaWidth(),
					calculator.getPinAreaHeight());

			Text text = getGaService().createText(invisibleRectangle,
					inputPin.getName());
			text.setForeground(manageColor(TEXT_FOREGROUND));
			text.setHorizontalAlignment(Orientation.ALIGNMENT_RIGHT);
			text.setFont(getGaService().manageDefaultFont(getDiagram(), false,
					false));
			getGaService().setLocationAndSize(text, -PIN_LABEL_MARGIN, 0,
					calculator.getInputPinNameWidth(), PIN_LABEL_HEIGHT);

			Rectangle pinRectangle = getGaService().createRectangle(
					invisibleRectangle);
			pinRectangle.setForeground(manageColor(FOREGROUND));
			pinRectangle.setBackground(manageColor(BACKGROUND));
			pinRectangle.setLineWidth(ACTION_LINE_WIDTH);
			getGaService().setLocationAndSize(pinRectangle,
					calculator.getInputPinNameWidth() - PIN_WIDTH, PIN_HEIGHT,
					PIN_WIDTH, PIN_HEIGHT);

			getPeCreateService().createChopboxAnchor(pinShape);

			link(pinShape, inputPin);
			pinNumber++;
		}
	}

}
