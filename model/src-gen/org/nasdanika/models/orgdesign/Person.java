/**
 */
package org.nasdanika.models.orgdesign;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.models.nxcore.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A person associated with the organization. People are referenced by roles; the same person may fill multiple roles or transition over time.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.orgdesign.Person#getEmail <em>Email</em>}</li>
 *   <li>{@link org.nasdanika.models.orgdesign.Person#getCapabilities <em>Capabilities</em>}</li>
 *   <li>{@link org.nasdanika.models.orgdesign.Person#getCurrentRoles <em>Current Roles</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.orgdesign.OrgdesignPackage#getPerson()
 * @model
 * @generated
 */
public interface Person extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Email address used as a secondary identifier and for documentation links.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Email</em>' attribute.
	 * @see #setEmail(String)
	 * @see org.nasdanika.models.orgdesign.OrgdesignPackage#getPerson_Email()
	 * @model unique="false"
	 * @generated
	 */
	String getEmail();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.orgdesign.Person#getEmail <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email</em>' attribute.
	 * @see #getEmail()
	 * @generated
	 */
	void setEmail(String value);

	/**
	 * Returns the value of the '<em><b>Capabilities</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.orgdesign.Capability}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Capabilities this person possesses. Comparing to required capabilities of the held roles surfaces gaps and overqualification.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Capabilities</em>' reference list.
	 * @see org.nasdanika.models.orgdesign.OrgdesignPackage#getPerson_Capabilities()
	 * @model
	 * @generated
	 */
	EList<Capability> getCapabilities();

	/**
	 * Returns the value of the '<em><b>Current Roles</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.orgdesign.Role}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.orgdesign.Role#getCurrentHolder <em>Current Holder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Roles this person currently holds.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Current Roles</em>' reference list.
	 * @see org.nasdanika.models.orgdesign.OrgdesignPackage#getPerson_CurrentRoles()
	 * @see org.nasdanika.models.orgdesign.Role#getCurrentHolder
	 * @model opposite="currentHolder"
	 * @generated
	 */
	EList<Role> getCurrentRoles();

} // Person
