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
import org.nasdanika.models.orgdesign.OrgdesignPackage;
import org.nasdanika.models.orgdesign.Person;
import org.nasdanika.models.orgdesign.Role;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.orgdesign.impl.PersonImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link org.nasdanika.models.orgdesign.impl.PersonImpl#getCapabilities <em>Capabilities</em>}</li>
 *   <li>{@link org.nasdanika.models.orgdesign.impl.PersonImpl#getCurrentRoles <em>Current Roles</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PersonImpl extends NamedElementImpl implements Person {
	/**
	 * The default value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrgdesignPackage.Literals.PERSON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEmail() {
		return (String)eDynamicGet(OrgdesignPackage.PERSON__EMAIL, OrgdesignPackage.Literals.PERSON__EMAIL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmail(String newEmail) {
		eDynamicSet(OrgdesignPackage.PERSON__EMAIL, OrgdesignPackage.Literals.PERSON__EMAIL, newEmail);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Capability> getCapabilities() {
		return (EList<Capability>)eDynamicGet(OrgdesignPackage.PERSON__CAPABILITIES, OrgdesignPackage.Literals.PERSON__CAPABILITIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Role> getCurrentRoles() {
		return (EList<Role>)eDynamicGet(OrgdesignPackage.PERSON__CURRENT_ROLES, OrgdesignPackage.Literals.PERSON__CURRENT_ROLES, true, true);
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
			case OrgdesignPackage.PERSON__CURRENT_ROLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCurrentRoles()).basicAdd(otherEnd, msgs);
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
			case OrgdesignPackage.PERSON__CURRENT_ROLES:
				return ((InternalEList<?>)getCurrentRoles()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OrgdesignPackage.PERSON__EMAIL:
				return getEmail();
			case OrgdesignPackage.PERSON__CAPABILITIES:
				return getCapabilities();
			case OrgdesignPackage.PERSON__CURRENT_ROLES:
				return getCurrentRoles();
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
			case OrgdesignPackage.PERSON__EMAIL:
				setEmail((String)newValue);
				return;
			case OrgdesignPackage.PERSON__CAPABILITIES:
				getCapabilities().clear();
				getCapabilities().addAll((Collection<? extends Capability>)newValue);
				return;
			case OrgdesignPackage.PERSON__CURRENT_ROLES:
				getCurrentRoles().clear();
				getCurrentRoles().addAll((Collection<? extends Role>)newValue);
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
			case OrgdesignPackage.PERSON__EMAIL:
				setEmail(EMAIL_EDEFAULT);
				return;
			case OrgdesignPackage.PERSON__CAPABILITIES:
				getCapabilities().clear();
				return;
			case OrgdesignPackage.PERSON__CURRENT_ROLES:
				getCurrentRoles().clear();
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
			case OrgdesignPackage.PERSON__EMAIL:
				return EMAIL_EDEFAULT == null ? getEmail() != null : !EMAIL_EDEFAULT.equals(getEmail());
			case OrgdesignPackage.PERSON__CAPABILITIES:
				return !getCapabilities().isEmpty();
			case OrgdesignPackage.PERSON__CURRENT_ROLES:
				return !getCurrentRoles().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PersonImpl
