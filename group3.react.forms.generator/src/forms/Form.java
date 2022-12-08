/**
 */
package forms;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Form</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link forms.Form#getFormElement <em>Form Element</em>}</li>
 *   <li>{@link forms.Form#getFormGroup <em>Form Group</em>}</li>
 *   <li>{@link forms.Form#getName <em>Name</em>}</li>
 *   <li>{@link forms.Form#getTitle <em>Title</em>}</li>
 * </ul>
 *
 * @see forms.FormsPackage#getForm()
 * @model
 * @generated
 */
public interface Form extends EObject {
	/**
	 * Returns the value of the '<em><b>Form Element</b></em>' containment reference list.
	 * The list contents are of type {@link forms.FormElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Form Element</em>' containment reference list.
	 * @see forms.FormsPackage#getForm_FormElement()
	 * @model containment="true"
	 * @generated
	 */
	EList<FormElement> getFormElement();

	/**
	 * Returns the value of the '<em><b>Form Group</b></em>' containment reference list.
	 * The list contents are of type {@link forms.FormGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Form Group</em>' containment reference list.
	 * @see forms.FormsPackage#getForm_FormGroup()
	 * @model containment="true"
	 * @generated
	 */
	EList<FormGroup> getFormGroup();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see forms.FormsPackage#getForm_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link forms.Form#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see forms.FormsPackage#getForm_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link forms.Form#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

} // Form
