/**
 */
package forms;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Form Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link forms.FormGroup#getName <em>Name</em>}</li>
 *   <li>{@link forms.FormGroup#getSubtitle <em>Subtitle</em>}</li>
 *   <li>{@link forms.FormGroup#getFormElement <em>Form Element</em>}</li>
 * </ul>
 *
 * @see forms.FormsPackage#getFormGroup()
 * @model
 * @generated
 */
public interface FormGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see forms.FormsPackage#getFormGroup_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link forms.FormGroup#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Subtitle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subtitle</em>' attribute.
	 * @see #setSubtitle(String)
	 * @see forms.FormsPackage#getFormGroup_Subtitle()
	 * @model
	 * @generated
	 */
	String getSubtitle();

	/**
	 * Sets the value of the '{@link forms.FormGroup#getSubtitle <em>Subtitle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subtitle</em>' attribute.
	 * @see #getSubtitle()
	 * @generated
	 */
	void setSubtitle(String value);

	/**
	 * Returns the value of the '<em><b>Form Element</b></em>' containment reference list.
	 * The list contents are of type {@link forms.FormElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Form Element</em>' containment reference list.
	 * @see forms.FormsPackage#getFormGroup_FormElement()
	 * @model containment="true"
	 * @generated
	 */
	EList<FormElement> getFormElement();

} // FormGroup
