/**
 */
package forms;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link forms.Input#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see forms.FormsPackage#getInput()
 * @model
 * @generated
 */
public interface Input extends FormElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link forms.InputType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see forms.InputType
	 * @see #setType(InputType)
	 * @see forms.FormsPackage#getInput_Type()
	 * @model
	 * @generated
	 */
	InputType getType();

	/**
	 * Sets the value of the '{@link forms.Input#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see forms.InputType
	 * @see #getType()
	 * @generated
	 */
	void setType(InputType value);

} // Input
