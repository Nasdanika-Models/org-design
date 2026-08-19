/**
 */
package org.nasdanika.models.orgdesign.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.nxcore.impl.NamedElementImpl;

import org.nasdanika.models.orgdesign.Capability;
import org.nasdanika.models.orgdesign.Organization;
import org.nasdanika.models.orgdesign.OrganizationalUnit;
import org.nasdanika.models.orgdesign.OrgdesignPackage;
import org.nasdanika.models.orgdesign.Role;
import org.nasdanika.models.orgdesign.UnitType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Organizational Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.orgdesign.impl.OrganizationalUnitImpl#getOrganization <em>Organization</em>}</li>
 *   <li>{@link org.nasdanika.models.orgdesign.impl.OrganizationalUnitImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.nasdanika.models.orgdesign.impl.OrganizationalUnitImpl#getSubUnits <em>Sub Units</em>}</li>
 *   <li>{@link org.nasdanika.models.orgdesign.impl.OrganizationalUnitImpl#getRoles <em>Roles</em>}</li>
 *   <li>{@link org.nasdanika.models.orgdesign.impl.OrganizationalUnitImpl#getDeliveredCapabilities <em>Delivered Capabilities</em>}</li>
 *   <li>{@link org.nasdanika.models.orgdesign.impl.OrganizationalUnitImpl#getUnitType <em>Unit Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrganizationalUnitImpl extends NamedElementImpl implements OrganizationalUnit {
	/**
	 * The default value of the '{@link #getUnitType() <em>Unit Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitType()
	 * @generated
	 * @ordered
	 */
	protected static final UnitType UNIT_TYPE_EDEFAULT = UnitType.FUNCTIONAL;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrganizationalUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrgdesignPackage.Literals.ORGANIZATIONAL_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Organization getOrganization() {
		return (Organization)eDynamicGet(OrgdesignPackage.ORGANIZATIONAL_UNIT__ORGANIZATION, OrgdesignPackage.Literals.ORGANIZATIONAL_UNIT__ORGANIZATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organization basicGetOrganization() {
		return (Organization)eDynamicGet(OrgdesignPackage.ORGANIZATIONAL_UNIT__ORGANIZATION, OrgdesignPackage.Literals.ORGANIZATIONAL_UNIT__ORGANIZATION, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrganization(Organization newOrganization, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOrganization, OrgdesignPackage.ORGANIZATIONAL_UNIT__ORGANIZATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrganization(Organization newOrganization) {
		eDynamicSet(OrgdesignPackage.ORGANIZATIONAL_UNIT__ORGANIZATION, OrgdesignPackage.Literals.ORGANIZATIONAL_UNIT__ORGANIZATION, newOrganization);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrganizationalUnit getParent() {
		return (OrganizationalUnit)eDynamicGet(OrgdesignPackage.ORGANIZATIONAL_UNIT__PARENT, OrgdesignPackage.Literals.ORGANIZATIONAL_UNIT__PARENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrganizationalUnit basicGetParent() {
		return (OrganizationalUnit)eDynamicGet(OrgdesignPackage.ORGANIZATIONAL_UNIT__PARENT, OrgdesignPackage.Literals.ORGANIZATIONAL_UNIT__PARENT, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(OrganizationalUnit newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, OrgdesignPackage.ORGANIZATIONAL_UNIT__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParent(OrganizationalUnit newParent) {
		eDynamicSet(OrgdesignPackage.ORGANIZATIONAL_UNIT__PARENT, OrgdesignPackage.Literals.ORGANIZATIONAL_UNIT__PARENT, newParent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<OrganizationalUnit> getSubUnits() {
		return (EList<OrganizationalUnit>)eDynamicGet(OrgdesignPackage.ORGANIZATIONAL_UNIT__SUB_UNITS, OrgdesignPackage.Literals.ORGANIZATIONAL_UNIT__SUB_UNITS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Role> getRoles() {
		return (EList<Role>)eDynamicGet(OrgdesignPackage.ORGANIZATIONAL_UNIT__ROLES, OrgdesignPackage.Literals.ORGANIZATIONAL_UNIT__ROLES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Capability> getDeliveredCapabilities() {
		return (EList<Capability>)eDynamicGet(OrgdesignPackage.ORGANIZATIONAL_UNIT__DELIVERED_CAPABILITIES, OrgdesignPackage.Literals.ORGANIZATIONAL_UNIT__DELIVERED_CAPABILITIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnitType getUnitType() {
		return (UnitType)eDynamicGet(OrgdesignPackage.ORGANIZATIONAL_UNIT__UNIT_TYPE, OrgdesignPackage.Literals.ORGANIZATIONAL_UNIT__UNIT_TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnitType(UnitType newUnitType) {
		eDynamicSet(OrgdesignPackage.ORGANIZATIONAL_UNIT__UNIT_TYPE, OrgdesignPackage.Literals.ORGANIZATIONAL_UNIT__UNIT_TYPE, newUnitType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OrgdesignPackage.ORGANIZATIONAL_UNIT__ORGANIZATION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOrganization((Organization)otherEnd, msgs);
			case OrgdesignPackage.ORGANIZATIONAL_UNIT__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((OrganizationalUnit)otherEnd, msgs);
			case OrgdesignPackage.ORGANIZATIONAL_UNIT__SUB_UNITS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubUnits()).basicAdd(otherEnd, msgs);
			case OrgdesignPackage.ORGANIZATIONAL_UNIT__ROLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRoles()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OrgdesignPackage.ORGANIZATIONAL_UNIT__ORGANIZATION:
				return basicSetOrganization(null, msgs);
			case OrgdesignPackage.ORGANIZATIONAL_UNIT__PARENT:
				return basicSetParent(null, msgs);
			case OrgdesignPackage.ORGANIZATIONAL_UNIT__SUB_UNITS:
				return ((InternalEList<?>)getSubUnits()).basicRemove(otherEnd, msgs);
			case OrgdesignPackage.ORGANIZATIONAL_UNIT__ROLES:
				return ((InternalEList<?>)getRoles()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case OrgdesignPackage.ORGANIZATIONAL_UNIT__ORGANIZATION:
				return eInternalContainer().eInverseRemove(this, OrgdesignPackage.ORGANIZATION__TOP_LEVEL_UNITS, Organization.class, msgs);
			case OrgdesignPackage.ORGANIZATIONAL_UNIT__PARENT:
				return eInternalContainer().eInverseRemove(this, OrgdesignPackage.ORGANIZATIONAL_UNIT__SUB_UNITS, OrganizationalUnit.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OrgdesignPackage.ORGANIZATIONAL_UNIT__ORGANIZATION:
				if (resolve) return getOrganization();
				return basicGetOrganization();
			case OrgdesignPackage.ORGANIZATIONAL_UNIT__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case OrgdesignPackage.ORGANIZATIONAL_UNIT__SUB_UNITS:
				return getSubUnits();
			case OrgdesignPackage.ORGANIZATIONAL_UNIT__ROLES:
				return getRoles();
			case OrgdesignPackage.ORGANIZATIONAL_UNIT__DELIVERED_CAPABILITIES:
				return getDeliveredCapabilities();
			case OrgdesignPackage.ORGANIZATIONAL_UNIT__UNIT_TYPE:
				return getUnitType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OrgdesignPackage.ORGANIZATIONAL_UNIT__ORGANIZATION:
				setOrganization((Organization)newValue);
				return;
			case OrgdesignPackage.ORGANIZATIONAL_UNIT__PARENT:
				setParent((OrganizationalUnit)newValue);
				return;
			case OrgdesignPackage.ORGANIZATIONAL_UNIT__SUB_UNITS:
				getSubUnits().clear();
				getSubUnits().addAll((Collection<? extends OrganizationalUnit>)newValue);
				return;
			case OrgdesignPackage.ORGANIZATIONAL_UNIT__ROLES:
				getRoles().clear();
				getRoles().addAll((Collection<? extends Role>)newValue);
				return;
			case OrgdesignPackage.ORGANIZATIONAL_UNIT__DELIVERED_CAPABILITIES:
				getDeliveredCapabilities().clear();
				getDeliveredCapabilities().addAll((Collection<? extends Capability>)newValue);
				return;
			case OrgdesignPackage.ORGANIZATIONAL_UNIT__UNIT_TYPE:
				setUnitType((UnitType)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case OrgdesignPackage.ORGANIZATIONAL_UNIT__ORGANIZATION:
				setOrganization((Organization)null);
				return;
			case OrgdesignPackage.ORGANIZATIONAL_UNIT__PARENT:
				setParent((OrganizationalUnit)null);
				return;
			case OrgdesignPackage.ORGANIZATIONAL_UNIT__SUB_UNITS:
				getSubUnits().clear();
				return;
			case OrgdesignPackage.ORGANIZATIONAL_UNIT__ROLES:
				getRoles().clear();
				return;
			case OrgdesignPackage.ORGANIZATIONAL_UNIT__DELIVERED_CAPABILITIES:
				getDeliveredCapabilities().clear();
				return;
			case OrgdesignPackage.ORGANIZATIONAL_UNIT__UNIT_TYPE:
				setUnitType(UNIT_TYPE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case OrgdesignPackage.ORGANIZATIONAL_UNIT__ORGANIZATION:
				return basicGetOrganization() != null;
			case OrgdesignPackage.ORGANIZATIONAL_UNIT__PARENT:
				return basicGetParent() != null;
			case OrgdesignPackage.ORGANIZATIONAL_UNIT__SUB_UNITS:
				return !getSubUnits().isEmpty();
			case OrgdesignPackage.ORGANIZATIONAL_UNIT__ROLES:
				return !getRoles().isEmpty();
			case OrgdesignPackage.ORGANIZATIONAL_UNIT__DELIVERED_CAPABILITIES:
				return !getDeliveredCapabilities().isEmpty();
			case OrgdesignPackage.ORGANIZATIONAL_UNIT__UNIT_TYPE:
				return getUnitType() != UNIT_TYPE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //OrganizationalUnitImpl
