/**
 */
package org.nasdanika.models.orgdesign.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.nxcore.impl.NamedElementImpl;

import org.nasdanika.models.orgdesign.FitRule;
import org.nasdanika.models.orgdesign.FitSeverity;
import org.nasdanika.models.orgdesign.OrgdesignPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fit Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.orgdesign.impl.FitRuleImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.nasdanika.models.orgdesign.impl.FitRuleImpl#getExpectedOutcome <em>Expected Outcome</em>}</li>
 *   <li>{@link org.nasdanika.models.orgdesign.impl.FitRuleImpl#getSeverity <em>Severity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FitRuleImpl extends NamedElementImpl implements FitRule {
	/**
	 * The default value of the '{@link #getCondition() <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected static final String CONDITION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getExpectedOutcome() <em>Expected Outcome</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpectedOutcome()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPECTED_OUTCOME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getSeverity() <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeverity()
	 * @generated
	 * @ordered
	 */
	protected static final FitSeverity SEVERITY_EDEFAULT = FitSeverity.RECOMMENDED;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FitRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrgdesignPackage.Literals.FIT_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCondition() {
		return (String)eDynamicGet(OrgdesignPackage.FIT_RULE__CONDITION, OrgdesignPackage.Literals.FIT_RULE__CONDITION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCondition(String newCondition) {
		eDynamicSet(OrgdesignPackage.FIT_RULE__CONDITION, OrgdesignPackage.Literals.FIT_RULE__CONDITION, newCondition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExpectedOutcome() {
		return (String)eDynamicGet(OrgdesignPackage.FIT_RULE__EXPECTED_OUTCOME, OrgdesignPackage.Literals.FIT_RULE__EXPECTED_OUTCOME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExpectedOutcome(String newExpectedOutcome) {
		eDynamicSet(OrgdesignPackage.FIT_RULE__EXPECTED_OUTCOME, OrgdesignPackage.Literals.FIT_RULE__EXPECTED_OUTCOME, newExpectedOutcome);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FitSeverity getSeverity() {
		return (FitSeverity)eDynamicGet(OrgdesignPackage.FIT_RULE__SEVERITY, OrgdesignPackage.Literals.FIT_RULE__SEVERITY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSeverity(FitSeverity newSeverity) {
		eDynamicSet(OrgdesignPackage.FIT_RULE__SEVERITY, OrgdesignPackage.Literals.FIT_RULE__SEVERITY, newSeverity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OrgdesignPackage.FIT_RULE__CONDITION:
				return getCondition();
			case OrgdesignPackage.FIT_RULE__EXPECTED_OUTCOME:
				return getExpectedOutcome();
			case OrgdesignPackage.FIT_RULE__SEVERITY:
				return getSeverity();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OrgdesignPackage.FIT_RULE__CONDITION:
				setCondition((String)newValue);
				return;
			case OrgdesignPackage.FIT_RULE__EXPECTED_OUTCOME:
				setExpectedOutcome((String)newValue);
				return;
			case OrgdesignPackage.FIT_RULE__SEVERITY:
				setSeverity((FitSeverity)newValue);
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
			case OrgdesignPackage.FIT_RULE__CONDITION:
				setCondition(CONDITION_EDEFAULT);
				return;
			case OrgdesignPackage.FIT_RULE__EXPECTED_OUTCOME:
				setExpectedOutcome(EXPECTED_OUTCOME_EDEFAULT);
				return;
			case OrgdesignPackage.FIT_RULE__SEVERITY:
				setSeverity(SEVERITY_EDEFAULT);
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
			case OrgdesignPackage.FIT_RULE__CONDITION:
				return CONDITION_EDEFAULT == null ? getCondition() != null : !CONDITION_EDEFAULT.equals(getCondition());
			case OrgdesignPackage.FIT_RULE__EXPECTED_OUTCOME:
				return EXPECTED_OUTCOME_EDEFAULT == null ? getExpectedOutcome() != null : !EXPECTED_OUTCOME_EDEFAULT.equals(getExpectedOutcome());
			case OrgdesignPackage.FIT_RULE__SEVERITY:
				return getSeverity() != SEVERITY_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //FitRuleImpl
