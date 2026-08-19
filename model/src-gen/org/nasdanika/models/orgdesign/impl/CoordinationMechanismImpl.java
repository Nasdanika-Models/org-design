/**
 */
package org.nasdanika.models.orgdesign.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.nxcore.impl.NamedElementImpl;

import org.nasdanika.models.orgdesign.CoordinationMechanism;
import org.nasdanika.models.orgdesign.CoordinationType;
import org.nasdanika.models.orgdesign.OrganizationalUnit;
import org.nasdanika.models.orgdesign.OrgdesignPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Coordination Mechanism</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.orgdesign.impl.CoordinationMechanismImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.nasdanika.models.orgdesign.impl.CoordinationMechanismImpl#getLinkedUnits <em>Linked Units</em>}</li>
 *   <li>{@link org.nasdanika.models.orgdesign.impl.CoordinationMechanismImpl#getCadence <em>Cadence</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CoordinationMechanismImpl extends NamedElementImpl implements CoordinationMechanism {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final CoordinationType TYPE_EDEFAULT = CoordinationType.DIRECT_SUPERVISION;

	/**
	 * The default value of the '{@link #getCadence() <em>Cadence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCadence()
	 * @generated
	 * @ordered
	 */
	protected static final String CADENCE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoordinationMechanismImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrgdesignPackage.Literals.COORDINATION_MECHANISM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CoordinationType getType() {
		return (CoordinationType)eDynamicGet(OrgdesignPackage.COORDINATION_MECHANISM__TYPE, OrgdesignPackage.Literals.COORDINATION_MECHANISM__TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(CoordinationType newType) {
		eDynamicSet(OrgdesignPackage.COORDINATION_MECHANISM__TYPE, OrgdesignPackage.Literals.COORDINATION_MECHANISM__TYPE, newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<OrganizationalUnit> getLinkedUnits() {
		return (EList<OrganizationalUnit>)eDynamicGet(OrgdesignPackage.COORDINATION_MECHANISM__LINKED_UNITS, OrgdesignPackage.Literals.COORDINATION_MECHANISM__LINKED_UNITS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCadence() {
		return (String)eDynamicGet(OrgdesignPackage.COORDINATION_MECHANISM__CADENCE, OrgdesignPackage.Literals.COORDINATION_MECHANISM__CADENCE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCadence(String newCadence) {
		eDynamicSet(OrgdesignPackage.COORDINATION_MECHANISM__CADENCE, OrgdesignPackage.Literals.COORDINATION_MECHANISM__CADENCE, newCadence);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OrgdesignPackage.COORDINATION_MECHANISM__TYPE:
				return getType();
			case OrgdesignPackage.COORDINATION_MECHANISM__LINKED_UNITS:
				return getLinkedUnits();
			case OrgdesignPackage.COORDINATION_MECHANISM__CADENCE:
				return getCadence();
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
			case OrgdesignPackage.COORDINATION_MECHANISM__TYPE:
				setType((CoordinationType)newValue);
				return;
			case OrgdesignPackage.COORDINATION_MECHANISM__LINKED_UNITS:
				getLinkedUnits().clear();
				getLinkedUnits().addAll((Collection<? extends OrganizationalUnit>)newValue);
				return;
			case OrgdesignPackage.COORDINATION_MECHANISM__CADENCE:
				setCadence((String)newValue);
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
			case OrgdesignPackage.COORDINATION_MECHANISM__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case OrgdesignPackage.COORDINATION_MECHANISM__LINKED_UNITS:
				getLinkedUnits().clear();
				return;
			case OrgdesignPackage.COORDINATION_MECHANISM__CADENCE:
				setCadence(CADENCE_EDEFAULT);
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
			case OrgdesignPackage.COORDINATION_MECHANISM__TYPE:
				return getType() != TYPE_EDEFAULT;
			case OrgdesignPackage.COORDINATION_MECHANISM__LINKED_UNITS:
				return !getLinkedUnits().isEmpty();
			case OrgdesignPackage.COORDINATION_MECHANISM__CADENCE:
				return CADENCE_EDEFAULT == null ? getCadence() != null : !CADENCE_EDEFAULT.equals(getCadence());
		}
		return super.eIsSet(featureID);
	}

} //CoordinationMechanismImpl
