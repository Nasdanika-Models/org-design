/**
 */
package org.nasdanika.models.orgdesign;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.models.nxcore.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Organizational Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A unit of organization - division, department, team, working group, project, or any structural grouping. Units form a hierarchy.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.orgdesign.OrganizationalUnit#getOrganization <em>Organization</em>}</li>
 *   <li>{@link org.nasdanika.models.orgdesign.OrganizationalUnit#getParent <em>Parent</em>}</li>
 *   <li>{@link org.nasdanika.models.orgdesign.OrganizationalUnit#getSubUnits <em>Sub Units</em>}</li>
 *   <li>{@link org.nasdanika.models.orgdesign.OrganizationalUnit#getRoles <em>Roles</em>}</li>
 *   <li>{@link org.nasdanika.models.orgdesign.OrganizationalUnit#getDeliveredCapabilities <em>Delivered Capabilities</em>}</li>
 *   <li>{@link org.nasdanika.models.orgdesign.OrganizationalUnit#getUnitType <em>Unit Type</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.orgdesign.OrgdesignPackage#getOrganizationalUnit()
 * @model
 * @generated
 */
public interface OrganizationalUnit extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Organization</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.orgdesign.Organization#getTopLevelUnits <em>Top Level Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The organization this unit belongs to. Set on top-level units; null for sub-units, which inherit through their parent.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Organization</em>' container reference.
	 * @see #setOrganization(Organization)
	 * @see org.nasdanika.models.orgdesign.OrgdesignPackage#getOrganizationalUnit_Organization()
	 * @see org.nasdanika.models.orgdesign.Organization#getTopLevelUnits
	 * @model opposite="topLevelUnits" transient="false"
	 * @generated
	 */
	Organization getOrganization();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.orgdesign.OrganizationalUnit#getOrganization <em>Organization</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization</em>' container reference.
	 * @see #getOrganization()
	 * @generated
	 */
	void setOrganization(Organization value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.orgdesign.OrganizationalUnit#getSubUnits <em>Sub Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Parent unit, if this is a sub-unit.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(OrganizationalUnit)
	 * @see org.nasdanika.models.orgdesign.OrgdesignPackage#getOrganizationalUnit_Parent()
	 * @see org.nasdanika.models.orgdesign.OrganizationalUnit#getSubUnits
	 * @model opposite="subUnits" transient="false"
	 * @generated
	 */
	OrganizationalUnit getParent();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.orgdesign.OrganizationalUnit#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(OrganizationalUnit value);

	/**
	 * Returns the value of the '<em><b>Sub Units</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.orgdesign.OrganizationalUnit}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.orgdesign.OrganizationalUnit#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sub-units of this unit.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sub Units</em>' containment reference list.
	 * @see org.nasdanika.models.orgdesign.OrgdesignPackage#getOrganizationalUnit_SubUnits()
	 * @see org.nasdanika.models.orgdesign.OrganizationalUnit#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<OrganizationalUnit> getSubUnits();

	/**
	 * Returns the value of the '<em><b>Roles</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.orgdesign.Role}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.orgdesign.Role#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Roles defined within this unit.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Roles</em>' containment reference list.
	 * @see org.nasdanika.models.orgdesign.OrgdesignPackage#getOrganizationalUnit_Roles()
	 * @see org.nasdanika.models.orgdesign.Role#getUnit
	 * @model opposite="unit" containment="true"
	 * @generated
	 */
	EList<Role> getRoles();

	/**
	 * Returns the value of the '<em><b>Delivered Capabilities</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.orgdesign.Capability}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Capabilities this unit delivers. Capability overlap across units is often the structural signature of duplicated effort.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Delivered Capabilities</em>' reference list.
	 * @see org.nasdanika.models.orgdesign.OrgdesignPackage#getOrganizationalUnit_DeliveredCapabilities()
	 * @model
	 * @generated
	 */
	EList<Capability> getDeliveredCapabilities();

	/**
	 * Returns the value of the '<em><b>Unit Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.models.orgdesign.UnitType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Structural pattern this unit follows.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unit Type</em>' attribute.
	 * @see org.nasdanika.models.orgdesign.UnitType
	 * @see #setUnitType(UnitType)
	 * @see org.nasdanika.models.orgdesign.OrgdesignPackage#getOrganizationalUnit_UnitType()
	 * @model unique="false"
	 * @generated
	 */
	UnitType getUnitType();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.orgdesign.OrganizationalUnit#getUnitType <em>Unit Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit Type</em>' attribute.
	 * @see org.nasdanika.models.orgdesign.UnitType
	 * @see #getUnitType()
	 * @generated
	 */
	void setUnitType(UnitType value);

} // OrganizationalUnit
