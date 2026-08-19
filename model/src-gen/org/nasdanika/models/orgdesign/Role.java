/**
 */
package org.nasdanika.models.orgdesign;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.models.nxcore.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A position defined within an organizational unit. Roles abstract from people - they describe what someone in this position is responsible for and decides on.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.orgdesign.Role#getUnit <em>Unit</em>}</li>
 *   <li>{@link org.nasdanika.models.orgdesign.Role#getCurrentHolder <em>Current Holder</em>}</li>
 *   <li>{@link org.nasdanika.models.orgdesign.Role#getRequiredCapabilities <em>Required Capabilities</em>}</li>
 *   <li>{@link org.nasdanika.models.orgdesign.Role#getDecisionRights <em>Decision Rights</em>}</li>
 *   <li>{@link org.nasdanika.models.orgdesign.Role#getReportsTo <em>Reports To</em>}</li>
 *   <li>{@link org.nasdanika.models.orgdesign.Role#getDirectReports <em>Direct Reports</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.orgdesign.OrgdesignPackage#getRole()
 * @model
 * @generated
 */
public interface Role extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Unit</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.orgdesign.OrganizationalUnit#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' container reference.
	 * @see #setUnit(OrganizationalUnit)
	 * @see org.nasdanika.models.orgdesign.OrgdesignPackage#getRole_Unit()
	 * @see org.nasdanika.models.orgdesign.OrganizationalUnit#getRoles
	 * @model opposite="roles" transient="false"
	 * @generated
	 */
	OrganizationalUnit getUnit();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.orgdesign.Role#getUnit <em>Unit</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' container reference.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(OrganizationalUnit value);

	/**
	 * Returns the value of the '<em><b>Current Holder</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.orgdesign.Person#getCurrentRoles <em>Current Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Person currently filling this role. Null if vacant.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Current Holder</em>' reference.
	 * @see #setCurrentHolder(Person)
	 * @see org.nasdanika.models.orgdesign.OrgdesignPackage#getRole_CurrentHolder()
	 * @see org.nasdanika.models.orgdesign.Person#getCurrentRoles
	 * @model opposite="currentRoles"
	 * @generated
	 */
	Person getCurrentHolder();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.orgdesign.Role#getCurrentHolder <em>Current Holder</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Holder</em>' reference.
	 * @see #getCurrentHolder()
	 * @generated
	 */
	void setCurrentHolder(Person value);

	/**
	 * Returns the value of the '<em><b>Required Capabilities</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.orgdesign.Capability}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Capabilities required to fill this role effectively.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Required Capabilities</em>' reference list.
	 * @see org.nasdanika.models.orgdesign.OrgdesignPackage#getRole_RequiredCapabilities()
	 * @model
	 * @generated
	 */
	EList<Capability> getRequiredCapabilities();

	/**
	 * Returns the value of the '<em><b>Decision Rights</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.orgdesign.DecisionRight}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Decision rights this role holds.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Decision Rights</em>' reference list.
	 * @see org.nasdanika.models.orgdesign.OrgdesignPackage#getRole_DecisionRights()
	 * @model
	 * @generated
	 */
	EList<DecisionRight> getDecisionRights();

	/**
	 * Returns the value of the '<em><b>Reports To</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.orgdesign.Role#getDirectReports <em>Direct Reports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reporting line - the role this role reports to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reports To</em>' reference.
	 * @see #setReportsTo(Role)
	 * @see org.nasdanika.models.orgdesign.OrgdesignPackage#getRole_ReportsTo()
	 * @see org.nasdanika.models.orgdesign.Role#getDirectReports
	 * @model opposite="directReports"
	 * @generated
	 */
	Role getReportsTo();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.orgdesign.Role#getReportsTo <em>Reports To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reports To</em>' reference.
	 * @see #getReportsTo()
	 * @generated
	 */
	void setReportsTo(Role value);

	/**
	 * Returns the value of the '<em><b>Direct Reports</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.orgdesign.Role}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.orgdesign.Role#getReportsTo <em>Reports To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Roles that report to this one.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Direct Reports</em>' reference list.
	 * @see org.nasdanika.models.orgdesign.OrgdesignPackage#getRole_DirectReports()
	 * @see org.nasdanika.models.orgdesign.Role#getReportsTo
	 * @model opposite="reportsTo"
	 * @generated
	 */
	EList<Role> getDirectReports();

} // Role
