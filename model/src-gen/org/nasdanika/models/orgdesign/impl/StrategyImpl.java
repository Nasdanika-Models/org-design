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
import org.nasdanika.models.orgdesign.EnvironmentFactor;
import org.nasdanika.models.orgdesign.Goal;
import org.nasdanika.models.orgdesign.OrgdesignPackage;
import org.nasdanika.models.orgdesign.Strategy;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Strategy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.orgdesign.impl.StrategyImpl#getGoals <em>Goals</em>}</li>
 *   <li>{@link org.nasdanika.models.orgdesign.impl.StrategyImpl#getRespondsTo <em>Responds To</em>}</li>
 *   <li>{@link org.nasdanika.models.orgdesign.impl.StrategyImpl#getRequiresCapabilities <em>Requires Capabilities</em>}</li>
 *   <li>{@link org.nasdanika.models.orgdesign.impl.StrategyImpl#getHorizon <em>Horizon</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StrategyImpl extends NamedElementImpl implements Strategy {
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
	protected StrategyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrgdesignPackage.Literals.STRATEGY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Goal> getGoals() {
		return (EList<Goal>)eDynamicGet(OrgdesignPackage.STRATEGY__GOALS, OrgdesignPackage.Literals.STRATEGY__GOALS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<EnvironmentFactor> getRespondsTo() {
		return (EList<EnvironmentFactor>)eDynamicGet(OrgdesignPackage.STRATEGY__RESPONDS_TO, OrgdesignPackage.Literals.STRATEGY__RESPONDS_TO, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Capability> getRequiresCapabilities() {
		return (EList<Capability>)eDynamicGet(OrgdesignPackage.STRATEGY__REQUIRES_CAPABILITIES, OrgdesignPackage.Literals.STRATEGY__REQUIRES_CAPABILITIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHorizon() {
		return (String)eDynamicGet(OrgdesignPackage.STRATEGY__HORIZON, OrgdesignPackage.Literals.STRATEGY__HORIZON, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHorizon(String newHorizon) {
		eDynamicSet(OrgdesignPackage.STRATEGY__HORIZON, OrgdesignPackage.Literals.STRATEGY__HORIZON, newHorizon);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OrgdesignPackage.STRATEGY__GOALS:
				return ((InternalEList<?>)getGoals()).basicRemove(otherEnd, msgs);
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
			case OrgdesignPackage.STRATEGY__GOALS:
				return getGoals();
			case OrgdesignPackage.STRATEGY__RESPONDS_TO:
				return getRespondsTo();
			case OrgdesignPackage.STRATEGY__REQUIRES_CAPABILITIES:
				return getRequiresCapabilities();
			case OrgdesignPackage.STRATEGY__HORIZON:
				return getHorizon();
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
			case OrgdesignPackage.STRATEGY__GOALS:
				getGoals().clear();
				getGoals().addAll((Collection<? extends Goal>)newValue);
				return;
			case OrgdesignPackage.STRATEGY__RESPONDS_TO:
				getRespondsTo().clear();
				getRespondsTo().addAll((Collection<? extends EnvironmentFactor>)newValue);
				return;
			case OrgdesignPackage.STRATEGY__REQUIRES_CAPABILITIES:
				getRequiresCapabilities().clear();
				getRequiresCapabilities().addAll((Collection<? extends Capability>)newValue);
				return;
			case OrgdesignPackage.STRATEGY__HORIZON:
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
			case OrgdesignPackage.STRATEGY__GOALS:
				getGoals().clear();
				return;
			case OrgdesignPackage.STRATEGY__RESPONDS_TO:
				getRespondsTo().clear();
				return;
			case OrgdesignPackage.STRATEGY__REQUIRES_CAPABILITIES:
				getRequiresCapabilities().clear();
				return;
			case OrgdesignPackage.STRATEGY__HORIZON:
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
			case OrgdesignPackage.STRATEGY__GOALS:
				return !getGoals().isEmpty();
			case OrgdesignPackage.STRATEGY__RESPONDS_TO:
				return !getRespondsTo().isEmpty();
			case OrgdesignPackage.STRATEGY__REQUIRES_CAPABILITIES:
				return !getRequiresCapabilities().isEmpty();
			case OrgdesignPackage.STRATEGY__HORIZON:
				return HORIZON_EDEFAULT == null ? getHorizon() != null : !HORIZON_EDEFAULT.equals(getHorizon());
		}
		return super.eIsSet(featureID);
	}

} //StrategyImpl
