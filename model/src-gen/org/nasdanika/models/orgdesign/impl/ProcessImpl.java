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
import org.nasdanika.models.orgdesign.OrganizationalUnit;
import org.nasdanika.models.orgdesign.OrgdesignPackage;
import org.nasdanika.models.orgdesign.ProcessStep;
import org.nasdanika.models.orgdesign.ProcessType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.orgdesign.impl.ProcessImpl#getParticipatingUnits <em>Participating Units</em>}</li>
 *   <li>{@link org.nasdanika.models.orgdesign.impl.ProcessImpl#getEnabledCapabilities <em>Enabled Capabilities</em>}</li>
 *   <li>{@link org.nasdanika.models.orgdesign.impl.ProcessImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.nasdanika.models.orgdesign.impl.ProcessImpl#getSteps <em>Steps</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcessImpl extends NamedElementImpl implements org.nasdanika.models.orgdesign.Process {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final ProcessType TYPE_EDEFAULT = ProcessType.OPERATIONAL;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrgdesignPackage.Literals.PROCESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<OrganizationalUnit> getParticipatingUnits() {
		return (EList<OrganizationalUnit>)eDynamicGet(OrgdesignPackage.PROCESS__PARTICIPATING_UNITS, OrgdesignPackage.Literals.PROCESS__PARTICIPATING_UNITS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Capability> getEnabledCapabilities() {
		return (EList<Capability>)eDynamicGet(OrgdesignPackage.PROCESS__ENABLED_CAPABILITIES, OrgdesignPackage.Literals.PROCESS__ENABLED_CAPABILITIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcessType getType() {
		return (ProcessType)eDynamicGet(OrgdesignPackage.PROCESS__TYPE, OrgdesignPackage.Literals.PROCESS__TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(ProcessType newType) {
		eDynamicSet(OrgdesignPackage.PROCESS__TYPE, OrgdesignPackage.Literals.PROCESS__TYPE, newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ProcessStep> getSteps() {
		return (EList<ProcessStep>)eDynamicGet(OrgdesignPackage.PROCESS__STEPS, OrgdesignPackage.Literals.PROCESS__STEPS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OrgdesignPackage.PROCESS__STEPS:
				return ((InternalEList<?>)getSteps()).basicRemove(otherEnd, msgs);
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
			case OrgdesignPackage.PROCESS__PARTICIPATING_UNITS:
				return getParticipatingUnits();
			case OrgdesignPackage.PROCESS__ENABLED_CAPABILITIES:
				return getEnabledCapabilities();
			case OrgdesignPackage.PROCESS__TYPE:
				return getType();
			case OrgdesignPackage.PROCESS__STEPS:
				return getSteps();
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
			case OrgdesignPackage.PROCESS__PARTICIPATING_UNITS:
				getParticipatingUnits().clear();
				getParticipatingUnits().addAll((Collection<? extends OrganizationalUnit>)newValue);
				return;
			case OrgdesignPackage.PROCESS__ENABLED_CAPABILITIES:
				getEnabledCapabilities().clear();
				getEnabledCapabilities().addAll((Collection<? extends Capability>)newValue);
				return;
			case OrgdesignPackage.PROCESS__TYPE:
				setType((ProcessType)newValue);
				return;
			case OrgdesignPackage.PROCESS__STEPS:
				getSteps().clear();
				getSteps().addAll((Collection<? extends ProcessStep>)newValue);
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
			case OrgdesignPackage.PROCESS__PARTICIPATING_UNITS:
				getParticipatingUnits().clear();
				return;
			case OrgdesignPackage.PROCESS__ENABLED_CAPABILITIES:
				getEnabledCapabilities().clear();
				return;
			case OrgdesignPackage.PROCESS__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case OrgdesignPackage.PROCESS__STEPS:
				getSteps().clear();
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
			case OrgdesignPackage.PROCESS__PARTICIPATING_UNITS:
				return !getParticipatingUnits().isEmpty();
			case OrgdesignPackage.PROCESS__ENABLED_CAPABILITIES:
				return !getEnabledCapabilities().isEmpty();
			case OrgdesignPackage.PROCESS__TYPE:
				return getType() != TYPE_EDEFAULT;
			case OrgdesignPackage.PROCESS__STEPS:
				return !getSteps().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProcessImpl
