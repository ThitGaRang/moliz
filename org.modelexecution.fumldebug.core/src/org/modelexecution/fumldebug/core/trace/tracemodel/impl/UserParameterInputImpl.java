/**
 * Copyright (c) 2012 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License v1.0 which accompanies 
 * this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Tanja Mayerhofer - initial API and implementation
 */
package org.modelexecution.fumldebug.core.trace.tracemodel.impl;

import fUML.Syntax.Activities.IntermediateActivities.ActivityParameterNode;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.modelexecution.fumldebug.core.trace.tracemodel.ObjectTokenInstance;
import org.modelexecution.fumldebug.core.trace.tracemodel.UserParameterInput;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User Parameter Input</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.modelexecution.fumldebug.core.trace.tracemodel.impl.UserParameterInputImpl#getUserInputTokens <em>User Input Tokens</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UserParameterInputImpl extends ParameterInputImpl implements UserParameterInput {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2012 Vienna University of Technology.\r\nAll rights reserved. This program and the accompanying materials are made \r\navailable under the terms of the Eclipse Public License v1.0 which accompanies \r\nthis distribution, and is available at http://www.eclipse.org/legal/epl-v10.html\r\n\r\nContributors:\r\nTanja Mayerhofer - initial API and implementation";

	/**
	 * The cached value of the '{@link #getUserInputTokens() <em>User Input Tokens</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserInputTokens()
	 * @generated
	 * @ordered
	 */
	protected EList<ObjectTokenInstance> userInputTokens;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserParameterInputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TracemodelPackageImpl.Literals.USER_PARAMETER_INPUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<ObjectTokenInstance> getUserInputTokens() {
		if (userInputTokens == null) {
			userInputTokens = new BasicInternalEList<ObjectTokenInstance>(ObjectTokenInstance.class);
		}
		return userInputTokens;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TracemodelPackageImpl.USER_PARAMETER_INPUT__USER_INPUT_TOKENS:
				return ((InternalEList<?>)getUserInputTokens()).basicRemove(otherEnd, msgs);
		}
		return eDynamicInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TracemodelPackageImpl.USER_PARAMETER_INPUT__PARAMETER_INPUT_TOKENS:
				return getParameterInputTokens();
			case TracemodelPackageImpl.USER_PARAMETER_INPUT__INPUT_PARAMETER_NODE:
				return getInputParameterNode();
			case TracemodelPackageImpl.USER_PARAMETER_INPUT__USER_INPUT_TOKENS:
				return getUserInputTokens();
		}
		return eDynamicGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TracemodelPackageImpl.USER_PARAMETER_INPUT__PARAMETER_INPUT_TOKENS:
				getParameterInputTokens().clear();
				getParameterInputTokens().addAll((Collection<? extends ObjectTokenInstance>)newValue);
				return;
			case TracemodelPackageImpl.USER_PARAMETER_INPUT__INPUT_PARAMETER_NODE:
				setInputParameterNode((ActivityParameterNode)newValue);
				return;
			case TracemodelPackageImpl.USER_PARAMETER_INPUT__USER_INPUT_TOKENS:
				getUserInputTokens().clear();
				getUserInputTokens().addAll((Collection<? extends ObjectTokenInstance>)newValue);
				return;
		}
		eDynamicSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TracemodelPackageImpl.USER_PARAMETER_INPUT__PARAMETER_INPUT_TOKENS:
				getParameterInputTokens().clear();
				return;
			case TracemodelPackageImpl.USER_PARAMETER_INPUT__INPUT_PARAMETER_NODE:
				setInputParameterNode(INPUT_PARAMETER_NODE_EDEFAULT);
				return;
			case TracemodelPackageImpl.USER_PARAMETER_INPUT__USER_INPUT_TOKENS:
				getUserInputTokens().clear();
				return;
		}
		eDynamicUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TracemodelPackageImpl.USER_PARAMETER_INPUT__PARAMETER_INPUT_TOKENS:
				return parameterInputTokens != null && !parameterInputTokens.isEmpty();
			case TracemodelPackageImpl.USER_PARAMETER_INPUT__INPUT_PARAMETER_NODE:
				return INPUT_PARAMETER_NODE_EDEFAULT == null ? inputParameterNode != null : !INPUT_PARAMETER_NODE_EDEFAULT.equals(inputParameterNode);
			case TracemodelPackageImpl.USER_PARAMETER_INPUT__USER_INPUT_TOKENS:
				return userInputTokens != null && !userInputTokens.isEmpty();
		}
		return eDynamicIsSet(featureID);
	}

} //UserParameterInputImpl