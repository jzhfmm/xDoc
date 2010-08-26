/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.xtext.xdoc.xdoc;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.xtext.xdoc.xdoc.Document#getContents <em>Contents</em>}</li>
 *   <li>{@link org.eclipse.xtext.xdoc.xdoc.Document#getChapters <em>Chapters</em>}</li>
 *   <li>{@link org.eclipse.xtext.xdoc.xdoc.Document#getSections <em>Sections</em>}</li>
 *   <li>{@link org.eclipse.xtext.xdoc.xdoc.Document#getSubsections <em>Subsections</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.xtext.xdoc.xdoc.XdocPackage#getDocument()
 * @model
 * @generated
 */
public interface Document extends EObject
{
  /**
   * Returns the value of the '<em><b>Contents</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.xtext.xdoc.xdoc.ParBreak}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Contents</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Contents</em>' containment reference list.
   * @see org.eclipse.xtext.xdoc.xdoc.XdocPackage#getDocument_Contents()
   * @model containment="true"
   * @generated
   */
  EList<ParBreak> getContents();

  /**
   * Returns the value of the '<em><b>Chapters</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.xtext.xdoc.xdoc.Chapter}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Chapters</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Chapters</em>' containment reference list.
   * @see org.eclipse.xtext.xdoc.xdoc.XdocPackage#getDocument_Chapters()
   * @model containment="true"
   * @generated
   */
  EList<Chapter> getChapters();

  /**
   * Returns the value of the '<em><b>Sections</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.xtext.xdoc.xdoc.Section}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sections</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sections</em>' containment reference list.
   * @see org.eclipse.xtext.xdoc.xdoc.XdocPackage#getDocument_Sections()
   * @model containment="true"
   * @generated
   */
  EList<Section> getSections();

  /**
   * Returns the value of the '<em><b>Subsections</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.xtext.xdoc.xdoc.SubSection}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Subsections</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Subsections</em>' containment reference list.
   * @see org.eclipse.xtext.xdoc.xdoc.XdocPackage#getDocument_Subsections()
   * @model containment="true"
   * @generated
   */
  EList<SubSection> getSubsections();

} // Document