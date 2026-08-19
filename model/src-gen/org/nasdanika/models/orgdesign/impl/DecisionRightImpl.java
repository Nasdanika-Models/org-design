/**
 */
package org.nasdanika.models.orgdesign.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.nxcore.impl.NamedElementImpl;

import org.nasdanika.models.orgdesign.Capability;
import org.nasdanika.models.orgdesign.DecisionAuthorityLevel;
import org.nasdanika.models.orgdesign.DecisionRight;
import org.nasdanika.models.orgdesign.DecisionScope;
import org.nasdanika.models.orgdesign.OrganizationalUnit;
import org.nasdanika.models.orgdesign.OrgdesignPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Decision Right</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.orgdesign.impl.DecisionRightImpl#getScope <em>Scope</em>}</li>
 *   <li>{@link org.nasdanika.models.orgdesign.impl.DecisionRightImpl#getApplicableUnits <em>Applicable Units</em>}</li>
 *   <li>{@link org.nasdanika.models.orgdesign.impl.DecisionRightImpl#getApplicableCapabilities <em>Applicable Capabilities</em>}</li>
 *   <li>{@link org.nasdanika.models.orgdesign.impl.DecisionRightImpl#getAuthorityLevel <em>Authority Level</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DecisionRightImpl extends NamedElementImpl implements DecisionRight {
	/**
	 * The default value of the '{@link #getScope() <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScope()
	 * @generated
	 * @ordered
	 */
	protected static final DecisionScope SCOPE_EDEFAULT = DecisionScope.STRATEGIC;

	/**
	 * The default value of the '{@link #getAuthorityLevel() <em>Authority Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorityLevel()
	 * @generated
	 * @ordered
	 */
	protected static final DecisionAuthorityLevel AUTHORITY_LEVEL_EDEFAULT = DecisionAuthorityLevel.DECIDE;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DecisionRightImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrgdesignPackage.Literals.DECISION_RIGHT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DecisionScope getScope() {
		return (DecisionScope)eDynamicGet(OrgdesignPackage.DECISION_RIGHT__SCOPE, OrgdesignPackage.Literals.DECISION_RIGHT__SCOPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScope(DecisionScope newScope) {
		eDynamicSet(OrgdesignPackage.DECISION_RIGHT__SCOPE, OrgdesignPackage.Literals.DECISION_RIGHT__SCOPE, newScope);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<OrganizationalUnit> getApplicableUnits() {
		return (EList<OrganizationalUnit>)eDynamicGet(OrgdesignPackage.DECISION_RIGHT__APPLICABLE_UNITS, OrgdesignPackage.Literals.DECISION_RIGHT__APPLICABLE_UNITS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Capability> getApplicableCapabilities() {
		return (EList<Capability>)eDynamicGet(OrgdesignPackage.DECISION_RIGHT__APPLICABLE_CAPABILITIES, OrgdesignPackage.Literals.DECISION_RIGHT__APPLICABLE_CAPABILITIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DecisionAuthorityLevel getAuthorityLevel() {
		return (DecisionAuthorityLevel)eDynamicGet(OrgdesignPackage.DECISION_RIGHT__AUTHORITY_LEVEL, OrgdesignPackage.Literals.DECISION_RIGHT__AUTHORITY_LEVEL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAuthorityLevel(DecisionAuthorityLevel newAuthorityLevel) {
		eDynamicSet(OrgdesignPackage.DECISION_RIGHT__AUTHORITY_LEVEL, OrgdesignPackage.Literals.DECISION_RIGHT__AUTHORITY_LEVEL, newAuthorityLevel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OrgdesignPackage.DECISION_RIGHT__SCOPE:
				return getScope();
			case OrgdesignPackage.DECISION_RIGHT__APPLICABLE_UNITS:
				return getApplicableUnits();
			case OrgdesignPackage.DECISION_RIGHT__APPLICABLE_CAPABILITIES:
				return getApplicableCapabilities();
			case OrgdesignPackage.DECISION_RIGHT__AUTHORITY_LEVEL:
				return getAuthorityLevel();
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
			case OrgdesignPackage.DECISION_RIGHT__SCOPE:
				setScope((DecisionScope)newValue);
				return;
			case OrgdesignPackage.DECISION_RIGHT__APPLICABLE_UNITS:
				getApplicableUnits().clear();
				getApplicableUnits().addAll((Collection<? extends OrganizationalUnit>)newValue);
				return;
			case OrgdesignPackage.DECISION_RIGHT__APPLICABLE_CAPABILITIES:
				getApplicableCapabilities().clear();
				getApplicableCapabilities().addAll((Collection<? extends Capability>)newValue);
				return;
			case OrgdesignPackage.DECISION_RIGHT__AUTHORITY_LEVEL:
				setAuthorityLevel((DecisionAuthorityLevel)newValue);
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
			case OrgdesignPackage.DECISION_RIGHT__SCOPE:
				setScope(SCOPE_EDEFAULT);
				return;
			case OrgdesignPackage.DECISION_RIGHT__APPLICABLE_UNITS:
				getApplicableUnits().clear();
				return;
			case OrgdesignPackage.DECISION_RIGHT__APPLICABLE_CAPABILITIES:
				getApplicableCapabilities().clear();
				return;
			case OrgdesignPackage.DECISION_RIGHT__AUTHORITY_LEVEL:
				setAuthorityLevel(AUTHORITY_LEVEL_EDEFAULT);
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
			case OrgdesignPackage.DECISION_RIGHT__SCOPE:
				return getScope() != SCOPE_EDEFAULT;
			case OrgdesignPackage.DECISION_RIGHT__APPLICABLE_UNITS:
				return !getApplicableUnits().isEmpty();
			case OrgdesignPackage.DECISION_RIGHT__APPLICABLE_CAPABILITIES:
				return !getApplicableCapabilities().isEmpty();
			case OrgdesignPackage.DECISION_RIGHT__AUTHORITY_LEVEL:
				return getAuthorityLevel() != AUTHORITY_LEVEL_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //DecisionRightImpl
