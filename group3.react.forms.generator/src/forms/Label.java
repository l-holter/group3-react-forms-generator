/**
 */
package forms;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Label</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link forms.Label#getFor <em>For</em>}</li>
 * </ul>
 *
 * @see forms.FormsPackage#getLabel()
 * @model
 * @generated
 */
public interface Label extends FormElement {
	/**
	 * Returns the value of the '<em><b>For</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>For</em>' attribute.
	 * @see #setFor(String)
	 * @see forms.FormsPackage#getLabel_For()
	 * @model
	 * @generated
	 */
	String getFor();

	/**
	 * Sets the value of the '{@link forms.Label#getFor <em>For</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>For</em>' attribute.
	 * @see #getFor()
	 * @generated
	 */
	void setFor(String value);

} // Label
