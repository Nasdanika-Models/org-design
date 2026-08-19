/**
 */
package org.nasdanika.models.orgdesign.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.nxcore.impl.NamedElementImpl;

import org.nasdanika.models.orgdesign.Goal;
import org.nasdanika.models.orgdesign.OrgdesignPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Goal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.orgdesign.impl.GoalImpl#getMetric <em>Metric</em>}</li>
 *   <li>{@link org.nasdanika.models.orgdesign.impl.GoalImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.nasdanika.models.orgdesign.impl.GoalImpl#getHorizon <em>Horizon</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GoalImpl extends NamedElementImpl implements Goal {
	/**
	 * The default value of the '{@link #getMetric() <em>Metric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetric()
	 * @generated
	 * @ordered
	 */
	protected static final String METRIC_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getTarget() <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getHorizon() <em>Horizon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorizon()
	 * @generated
	 * @ordered
	 */
	protected static final String HORIZON_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GoalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrgdesignPackage.Literals.GOAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMetric() {
		return (String)eDynamicGet(OrgdesignPackage.GOAL__METRIC, OrgdesignPackage.Literals.GOAL__METRIC, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMetric(String newMetric) {
		eDynamicSet(OrgdesignPackage.GOAL__METRIC, OrgdesignPackage.Literals.GOAL__METRIC, newMetric);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTarget() {
		return (String)eDynamicGet(OrgdesignPackage.GOAL__TARGET, OrgdesignPackage.Literals.GOAL__TARGET, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTarget(String newTarget) {
		eDynamicSet(OrgdesignPackage.GOAL__TARGET, OrgdesignPackage.Literals.GOAL__TARGET, newTarget);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHorizon() {
		return (String)eDynamicGet(OrgdesignPackage.GOAL__HORIZON, OrgdesignPackage.Literals.GOAL__HORIZON, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHorizon(String newHorizon) {
		eDynamicSet(OrgdesignPackage.GOAL__HORIZON, OrgdesignPackage.Literals.GOAL__HORIZON, newHorizon);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OrgdesignPackage.GOAL__METRIC:
				return getMetric();
			case OrgdesignPackage.GOAL__TARGET:
				return getTarget();
			case OrgdesignPackage.GOAL__HORIZON:
				return getHorizon();
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
			case OrgdesignPackage.GOAL__METRIC:
				setMetric((String)newValue);
				return;
			case OrgdesignPackage.GOAL__TARGET:
				setTarget((String)newValue);
				return;
			case OrgdesignPackage.GOAL__HORIZON:
				setHorizon((String)newValue);
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
			case OrgdesignPackage.GOAL__METRIC:
				setMetric(METRIC_EDEFAULT);
				return;
			case OrgdesignPackage.GOAL__TARGET:
				setTarget(TARGET_EDEFAULT);
				return;
			case OrgdesignPackage.GOAL__HORIZON:
				setHorizon(HORIZON_EDEFAULT);
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
			case OrgdesignPackage.GOAL__METRIC:
				return METRIC_EDEFAULT == null ? getMetric() != null : !METRIC_EDEFAULT.equals(getMetric());
			case OrgdesignPackage.GOAL__TARGET:
				return TARGET_EDEFAULT == null ? getTarget() != null : !TARGET_EDEFAULT.equals(getTarget());
			case OrgdesignPackage.GOAL__HORIZON:
				return HORIZON_EDEFAULT == null ? getHorizon() != null : !HORIZON_EDEFAULT.equals(getHorizon());
		}
		return super.eIsSet(featureID);
	}

} //GoalImpl
