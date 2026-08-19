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
import org.nasdanika.models.orgdesign.DecisionRight;
import org.nasdanika.models.orgdesign.OrganizationalUnit;
import org.nasdanika.models.orgdesign.OrgdesignPackage;
import org.nasdanika.models.orgdesign.Person;
import org.nasdanika.models.orgdesign.Role;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.orgdesign.impl.RoleImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link org.nasdanika.models.orgdesign.impl.RoleImpl#getCurrentHolder <em>Current Holder</em>}</li>
 *   <li>{@link org.nasdanika.models.orgdesign.impl.RoleImpl#getRequiredCapabilities <em>Required Capabilities</em>}</li>
 *   <li>{@link org.nasdanika.models.orgdesign.impl.RoleImpl#getDecisionRights <em>Decision Rights</em>}</li>
 *   <li>{@link org.nasdanika.models.orgdesign.impl.RoleImpl#getReportsTo <em>Reports To</em>}</li>
 *   <li>{@link org.nasdanika.models.orgdesign.impl.RoleImpl#getDirectReports <em>Direct Reports</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoleImpl extends NamedElementImpl implements Role {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrgdesignPackage.Literals.ROLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrganizationalUnit getUnit() {
		return (OrganizationalUnit)eDynamicGet(OrgdesignPackage.ROLE__UNIT, OrgdesignPackage.Literals.ROLE__UNIT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrganizationalUnit basicGetUnit() {
		return (OrganizationalUnit)eDynamicGet(OrgdesignPackage.ROLE__UNIT, OrgdesignPackage.Literals.ROLE__UNIT, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnit(OrganizationalUnit newUnit, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newUnit, OrgdesignPackage.ROLE__UNIT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnit(OrganizationalUnit newUnit) {
		eDynamicSet(OrgdesignPackage.ROLE__UNIT, OrgdesignPackage.Literals.ROLE__UNIT, newUnit);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Person getCurrentHolder() {
		return (Person)eDynamicGet(OrgdesignPackage.ROLE__CURRENT_HOLDER, OrgdesignPackage.Literals.ROLE__CURRENT_HOLDER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person basicGetCurrentHolder() {
		return (Person)eDynamicGet(OrgdesignPackage.ROLE__CURRENT_HOLDER, OrgdesignPackage.Literals.ROLE__CURRENT_HOLDER, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCurrentHolder(Person newCurrentHolder, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newCurrentHolder, OrgdesignPackage.ROLE__CURRENT_HOLDER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrentHolder(Person newCurrentHolder) {
		eDynamicSet(OrgdesignPackage.ROLE__CURRENT_HOLDER, OrgdesignPackage.Literals.ROLE__CURRENT_HOLDER, newCurrentHolder);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Capability> getRequiredCapabilities() {
		return (EList<Capability>)eDynamicGet(OrgdesignPackage.ROLE__REQUIRED_CAPABILITIES, OrgdesignPackage.Literals.ROLE__REQUIRED_CAPABILITIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<DecisionRight> getDecisionRights() {
		return (EList<DecisionRight>)eDynamicGet(OrgdesignPackage.ROLE__DECISION_RIGHTS, OrgdesignPackage.Literals.ROLE__DECISION_RIGHTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Role getReportsTo() {
		return (Role)eDynamicGet(OrgdesignPackage.ROLE__REPORTS_TO, OrgdesignPackage.Literals.ROLE__REPORTS_TO, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role basicGetReportsTo() {
		return (Role)eDynamicGet(OrgdesignPackage.ROLE__REPORTS_TO, OrgdesignPackage.Literals.ROLE__REPORTS_TO, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReportsTo(Role newReportsTo, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newReportsTo, OrgdesignPackage.ROLE__REPORTS_TO, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReportsTo(Role newReportsTo) {
		eDynamicSet(OrgdesignPackage.ROLE__REPORTS_TO, OrgdesignPackage.Literals.ROLE__REPORTS_TO, newReportsTo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Role> getDirectReports() {
		return (EList<Role>)eDynamicGet(OrgdesignPackage.ROLE__DIRECT_REPORTS, OrgdesignPackage.Literals.ROLE__DIRECT_REPORTS, true, true);
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
			case OrgdesignPackage.ROLE__UNIT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetUnit((OrganizationalUnit)otherEnd, msgs);
			case OrgdesignPackage.ROLE__CURRENT_HOLDER:
				Person currentHolder = basicGetCurrentHolder();
				if (currentHolder != null)
					msgs = ((InternalEObject)currentHolder).eInverseRemove(this, OrgdesignPackage.PERSON__CURRENT_ROLES, Person.class, msgs);
				return basicSetCurrentHolder((Person)otherEnd, msgs);
			case OrgdesignPackage.ROLE__REPORTS_TO:
				Role reportsTo = basicGetReportsTo();
				if (reportsTo != null)
					msgs = ((InternalEObject)reportsTo).eInverseRemove(this, OrgdesignPackage.ROLE__DIRECT_REPORTS, Role.class, msgs);
				return basicSetReportsTo((Role)otherEnd, msgs);
			case OrgdesignPackage.ROLE__DIRECT_REPORTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDirectReports()).basicAdd(otherEnd, msgs);
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
			case OrgdesignPackage.ROLE__UNIT:
				return basicSetUnit(null, msgs);
			case OrgdesignPackage.ROLE__CURRENT_HOLDER:
				return basicSetCurrentHolder(null, msgs);
			case OrgdesignPackage.ROLE__REPORTS_TO:
				return basicSetReportsTo(null, msgs);
			case OrgdesignPackage.ROLE__DIRECT_REPORTS:
				return ((InternalEList<?>)getDirectReports()).basicRemove(otherEnd, msgs);
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
			case OrgdesignPackage.ROLE__UNIT:
				return eInternalContainer().eInverseRemove(this, OrgdesignPackage.ORGANIZATIONAL_UNIT__ROLES, OrganizationalUnit.class, msgs);
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
			case OrgdesignPackage.ROLE__UNIT:
				if (resolve) return getUnit();
				return basicGetUnit();
			case OrgdesignPackage.ROLE__CURRENT_HOLDER:
				if (resolve) return getCurrentHolder();
				return basicGetCurrentHolder();
			case OrgdesignPackage.ROLE__REQUIRED_CAPABILITIES:
				return getRequiredCapabilities();
			case OrgdesignPackage.ROLE__DECISION_RIGHTS:
				return getDecisionRights();
			case OrgdesignPackage.ROLE__REPORTS_TO:
				if (resolve) return getReportsTo();
				return basicGetReportsTo();
			case OrgdesignPackage.ROLE__DIRECT_REPORTS:
				return getDirectReports();
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
			case OrgdesignPackage.ROLE__UNIT:
				setUnit((OrganizationalUnit)newValue);
				return;
			case OrgdesignPackage.ROLE__CURRENT_HOLDER:
				setCurrentHolder((Person)newValue);
				return;
			case OrgdesignPackage.ROLE__REQUIRED_CAPABILITIES:
				getRequiredCapabilities().clear();
				getRequiredCapabilities().addAll((Collection<? extends Capability>)newValue);
				return;
			case OrgdesignPackage.ROLE__DECISION_RIGHTS:
				getDecisionRights().clear();
				getDecisionRights().addAll((Collection<? extends DecisionRight>)newValue);
				return;
			case OrgdesignPackage.ROLE__REPORTS_TO:
				setReportsTo((Role)newValue);
				return;
			case OrgdesignPackage.ROLE__DIRECT_REPORTS:
				getDirectReports().clear();
				getDirectReports().addAll((Collection<? extends Role>)newValue);
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
			case OrgdesignPackage.ROLE__UNIT:
				setUnit((OrganizationalUnit)null);
				return;
			case OrgdesignPackage.ROLE__CURRENT_HOLDER:
				setCurrentHolder((Person)null);
				return;
			case OrgdesignPackage.ROLE__REQUIRED_CAPABILITIES:
				getRequiredCapabilities().clear();
				return;
			case OrgdesignPackage.ROLE__DECISION_RIGHTS:
				getDecisionRights().clear();
				return;
			case OrgdesignPackage.ROLE__REPORTS_TO:
				setReportsTo((Role)null);
				return;
			case OrgdesignPackage.ROLE__DIRECT_REPORTS:
				getDirectReports().clear();
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
			case OrgdesignPackage.ROLE__UNIT:
				return basicGetUnit() != null;
			case OrgdesignPackage.ROLE__CURRENT_HOLDER:
				return basicGetCurrentHolder() != null;
			case OrgdesignPackage.ROLE__REQUIRED_CAPABILITIES:
				return !getRequiredCapabilities().isEmpty();
			case OrgdesignPackage.ROLE__DECISION_RIGHTS:
				return !getDecisionRights().isEmpty();
			case OrgdesignPackage.ROLE__REPORTS_TO:
				return basicGetReportsTo() != null;
			case OrgdesignPackage.ROLE__DIRECT_REPORTS:
				return !getDirectReports().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RoleImpl
