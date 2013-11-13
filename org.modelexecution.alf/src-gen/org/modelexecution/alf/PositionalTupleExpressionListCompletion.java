/**
 */
package org.modelexecution.alf;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Positional Tuple Expression List Completion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.modelexecution.alf.PositionalTupleExpressionListCompletion#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.modelexecution.alf.AlfPackage#getPositionalTupleExpressionListCompletion()
 * @model
 * @generated
 */
public interface PositionalTupleExpressionListCompletion extends EObject
{
  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference list.
   * The list contents are of type {@link org.modelexecution.alf.Expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference list.
   * @see org.modelexecution.alf.AlfPackage#getPositionalTupleExpressionListCompletion_Expression()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getExpression();

} // PositionalTupleExpressionListCompletion
