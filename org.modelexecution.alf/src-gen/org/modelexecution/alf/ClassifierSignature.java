/**
 */
package org.modelexecution.alf;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Classifier Signature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.modelexecution.alf.ClassifierSignature#getName <em>Name</em>}</li>
 *   <li>{@link org.modelexecution.alf.ClassifierSignature#getTemplateParameters <em>Template Parameters</em>}</li>
 *   <li>{@link org.modelexecution.alf.ClassifierSignature#getSpecializationClause <em>Specialization Clause</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.modelexecution.alf.AlfPackage#getClassifierSignature()
 * @model
 * @generated
 */
public interface ClassifierSignature extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' containment reference.
   * @see #setName(Name)
   * @see org.modelexecution.alf.AlfPackage#getClassifierSignature_Name()
   * @model containment="true"
   * @generated
   */
  Name getName();

  /**
   * Sets the value of the '{@link org.modelexecution.alf.ClassifierSignature#getName <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' containment reference.
   * @see #getName()
   * @generated
   */
  void setName(Name value);

  /**
   * Returns the value of the '<em><b>Template Parameters</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Template Parameters</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Template Parameters</em>' containment reference.
   * @see #setTemplateParameters(TemplateParameters)
   * @see org.modelexecution.alf.AlfPackage#getClassifierSignature_TemplateParameters()
   * @model containment="true"
   * @generated
   */
  TemplateParameters getTemplateParameters();

  /**
   * Sets the value of the '{@link org.modelexecution.alf.ClassifierSignature#getTemplateParameters <em>Template Parameters</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Template Parameters</em>' containment reference.
   * @see #getTemplateParameters()
   * @generated
   */
  void setTemplateParameters(TemplateParameters value);

  /**
   * Returns the value of the '<em><b>Specialization Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Specialization Clause</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Specialization Clause</em>' containment reference.
   * @see #setSpecializationClause(SpecializationClause)
   * @see org.modelexecution.alf.AlfPackage#getClassifierSignature_SpecializationClause()
   * @model containment="true"
   * @generated
   */
  SpecializationClause getSpecializationClause();

  /**
   * Sets the value of the '{@link org.modelexecution.alf.ClassifierSignature#getSpecializationClause <em>Specialization Clause</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Specialization Clause</em>' containment reference.
   * @see #getSpecializationClause()
   * @generated
   */
  void setSpecializationClause(SpecializationClause value);

} // ClassifierSignature