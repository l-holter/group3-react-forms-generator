/**
 */
package forms;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link forms.DataList#getOption <em>Option</em>}</li>
 * </ul>
 *
 * @see forms.FormsPackage#getDataList()
 * @model
 * @generated
 */
public interface DataList extends FormElement {
	/**
	 * Returns the value of the '<em><b>Option</b></em>' containment reference list.
	 * The list contents are of type {@link forms.Option}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Option</em>' containment reference list.
	 * @see forms.FormsPackage#getDataList_Option()
	 * @model containment="true"
	 * @generated
	 */
	EList<Option> getOption();

} // DataList
