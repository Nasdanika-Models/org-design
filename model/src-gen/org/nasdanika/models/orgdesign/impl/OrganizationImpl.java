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
import org.nasdanika.models.orgdesign.CoordinationMechanism;
import org.nasdanika.models.orgdesign.DecisionRight;
import org.nasdanika.models.orgdesign.EnvironmentFactor;
import org.nasdanika.models.orgdesign.FitRule;
import org.nasdanika.models.orgdesign.Organization;
import org.nasdanika.models.orgdesign.OrganizationalUnit;
import org.nasdanika.models.orgdesign.OrgdesignPackage;
import org.nasdanika.models.orgdesign.Person;
import org.nasdanika.models.orgdesign.Strategy;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Organization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.orgdesign.impl.OrganizationImpl#getTopLevelUnits <em>Top Level Units</em>}</li>
 *   <li>{@link org.nasdanika.models.orgdesign.impl.OrganizationImpl#getPeople <em>People</em>}</li>
 *   <li>{@link org.nasdanika.models.orgdesign.impl.OrganizationImpl#getStrategies <em>Strategies</em>}</li>
 *   <li>{@link org.nasdanika.models.orgdesign.impl.OrganizationImpl#getEnvironmentFactors <em>Environment Factors</em>}</li>
 *   <li>{@link org.nasdanika.models.orgdesign.impl.OrganizationImpl#getCapabilities <em>Capabilities</em>}</li>
 *   <li>{@link org.nasdanika.models.orgdesign.impl.OrganizationImpl#getProcesses <em>Processes</em>}</li>
 *   <li>{@link org.nasdanika.models.orgdesign.impl.OrganizationImpl#getCoordinationMechanisms <em>Coordination Mechanisms</em>}</li>
 *   <li>{@link org.nasdanika.models.orgdesign.impl.OrganizationImpl#getDecisionRights <em>Decision Rights</em>}</li>
 *   <li>{@link org.nasdanika.models.orgdesign.impl.OrganizationImpl#getFitRules <em>Fit Rules</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrganizationImpl extends NamedElementImpl implements Organization {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrganizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrgdesignPackage.Literals.ORGANIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<OrganizationalUnit> getTopLevelUnits() {
		return (EList<OrganizationalUnit>)eDynamicGet(OrgdesignPackage.ORGANIZATION__TOP_LEVEL_UNITS, OrgdesignPackage.Literals.ORGANIZATION__TOP_LEVEL_UNITS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Person> getPeople() {
		return (EList<Person>)eDynamicGet(OrgdesignPackage.ORGANIZATION__PEOPLE, OrgdesignPackage.Literals.ORGANIZATION__PEOPLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Strategy> getStrategies() {
		return (EList<Strategy>)eDynamicGet(OrgdesignPackage.ORGANIZATION__STRATEGIES, OrgdesignPackage.Literals.ORGANIZATION__STRATEGIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<EnvironmentFactor> getEnvironmentFactors() {
		return (EList<EnvironmentFactor>)eDynamicGet(OrgdesignPackage.ORGANIZATION__ENVIRONMENT_FACTORS, OrgdesignPackage.Literals.ORGANIZATION__ENVIRONMENT_FACTORS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Capability> getCapabilities() {
		return (EList<Capability>)eDynamicGet(OrgdesignPackage.ORGANIZATION__CAPABILITIES, OrgdesignPackage.Literals.ORGANIZATION__CAPABILITIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<org.nasdanika.models.orgdesign.Process> getProcesses() {
		return (EList<org.nasdanika.models.orgdesign.Process>)eDynamicGet(OrgdesignPackage.ORGANIZATION__PROCESSES, OrgdesignPackage.Literals.ORGANIZATION__PROCESSES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<CoordinationMechanism> getCoordinationMechanisms() {
		return (EList<CoordinationMechanism>)eDynamicGet(OrgdesignPackage.ORGANIZATION__COORDINATION_MECHANISMS, OrgdesignPackage.Literals.ORGANIZATION__COORDINATION_MECHANISMS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<DecisionRight> getDecisionRights() {
		return (EList<DecisionRight>)eDynamicGet(OrgdesignPackage.ORGANIZATION__DECISION_RIGHTS, OrgdesignPackage.Literals.ORGANIZATION__DECISION_RIGHTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<FitRule> getFitRules() {
		return (EList<FitRule>)eDynamicGet(OrgdesignPackage.ORGANIZATION__FIT_RULES, OrgdesignPackage.Literals.ORGANIZATION__FIT_RULES, true, true);
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
			case OrgdesignPackage.ORGANIZATION__TOP_LEVEL_UNITS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTopLevelUnits()).basicAdd(otherEnd, msgs);
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
			case OrgdesignPackage.ORGANIZATION__TOP_LEVEL_UNITS:
				return ((InternalEList<?>)getTopLevelUnits()).basicRemove(otherEnd, msgs);
			case OrgdesignPackage.ORGANIZATION__PEOPLE:
				return ((InternalEList<?>)getPeople()).basicRemove(otherEnd, msgs);
			case OrgdesignPackage.ORGANIZATION__STRATEGIES:
				return ((InternalEList<?>)getStrategies()).basicRemove(otherEnd, msgs);
			case OrgdesignPackage.ORGANIZATION__ENVIRONMENT_FACTORS:
				return ((InternalEList<?>)getEnvironmentFactors()).basicRemove(otherEnd, msgs);
			case OrgdesignPackage.ORGANIZATION__CAPABILITIES:
				return ((InternalEList<?>)getCapabilities()).basicRemove(otherEnd, msgs);
			case OrgdesignPackage.ORGANIZATION__PROCESSES:
				return ((InternalEList<?>)getProcesses()).basicRemove(otherEnd, msgs);
			case OrgdesignPackage.ORGANIZATION__COORDINATION_MECHANISMS:
				return ((InternalEList<?>)getCoordinationMechanisms()).basicRemove(otherEnd, msgs);
			case OrgdesignPackage.ORGANIZATION__DECISION_RIGHTS:
				return ((InternalEList<?>)getDecisionRights()).basicRemove(otherEnd, msgs);
			case OrgdesignPackage.ORGANIZATION__FIT_RULES:
				return ((InternalEList<?>)getFitRules()).basicRemove(otherEnd, msgs);
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
			case OrgdesignPackage.ORGANIZATION__TOP_LEVEL_UNITS:
				return getTopLevelUnits();
			case OrgdesignPackage.ORGANIZATION__PEOPLE:
				return getPeople();
			case OrgdesignPackage.ORGANIZATION__STRATEGIES:
				return getStrategies();
			case OrgdesignPackage.ORGANIZATION__ENVIRONMENT_FACTORS:
				return getEnvironmentFactors();
			case OrgdesignPackage.ORGANIZATION__CAPABILITIES:
				return getCapabilities();
			case OrgdesignPackage.ORGANIZATION__PROCESSES:
				return getProcesses();
			case OrgdesignPackage.ORGANIZATION__COORDINATION_MECHANISMS:
				return getCoordinationMechanisms();
			case OrgdesignPackage.ORGANIZATION__DECISION_RIGHTS:
				return getDecisionRights();
			case OrgdesignPackage.ORGANIZATION__FIT_RULES:
				return getFitRules();
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
			case OrgdesignPackage.ORGANIZATION__TOP_LEVEL_UNITS:
				getTopLevelUnits().clear();
				getTopLevelUnits().addAll((Collection<? extends OrganizationalUnit>)newValue);
				return;
			case OrgdesignPackage.ORGANIZATION__PEOPLE:
				getPeople().clear();
				getPeople().addAll((Collection<? extends Person>)newValue);
				return;
			case OrgdesignPackage.ORGANIZATION__STRATEGIES:
				getStrategies().clear();
				getStrategies().addAll((Collection<? extends Strategy>)newValue);
				return;
			case OrgdesignPackage.ORGANIZATION__ENVIRONMENT_FACTORS:
				getEnvironmentFactors().clear();
				getEnvironmentFactors().addAll((Collection<? extends EnvironmentFactor>)newValue);
				return;
			case OrgdesignPackage.ORGANIZATION__CAPABILITIES:
				getCapabilities().clear();
				getCapabilities().addAll((Collection<? extends Capability>)newValue);
				return;
			case OrgdesignPackage.ORGANIZATION__PROCESSES:
				getProcesses().clear();
				getProcesses().addAll((Collection<? extends org.nasdanika.models.orgdesign.Process>)newValue);
				return;
			case OrgdesignPackage.ORGANIZATION__COORDINATION_MECHANISMS:
				getCoordinationMechanisms().clear();
				getCoordinationMechanisms().addAll((Collection<? extends CoordinationMechanism>)newValue);
				return;
			case OrgdesignPackage.ORGANIZATION__DECISION_RIGHTS:
				getDecisionRights().clear();
				getDecisionRights().addAll((Collection<? extends DecisionRight>)newValue);
				return;
			case OrgdesignPackage.ORGANIZATION__FIT_RULES:
				getFitRules().clear();
				getFitRules().addAll((Collection<? extends FitRule>)newValue);
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
			case OrgdesignPackage.ORGANIZATION__TOP_LEVEL_UNITS:
				getTopLevelUnits().clear();
				return;
			case OrgdesignPackage.ORGANIZATION__PEOPLE:
				getPeople().clear();
				return;
			case OrgdesignPackage.ORGANIZATION__STRATEGIES:
				getStrategies().clear();
				return;
			case OrgdesignPackage.ORGANIZATION__ENVIRONMENT_FACTORS:
				getEnvironmentFactors().clear();
				return;
			case OrgdesignPackage.ORGANIZATION__CAPABILITIES:
				getCapabilities().clear();
				return;
			case OrgdesignPackage.ORGANIZATION__PROCESSES:
				getProcesses().clear();
				return;
			case OrgdesignPackage.ORGANIZATION__COORDINATION_MECHANISMS:
				getCoordinationMechanisms().clear();
				return;
			case OrgdesignPackage.ORGANIZATION__DECISION_RIGHTS:
				getDecisionRights().clear();
				return;
			case OrgdesignPackage.ORGANIZATION__FIT_RULES:
				getFitRules().clear();
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
			case OrgdesignPackage.ORGANIZATION__TOP_LEVEL_UNITS:
				return !getTopLevelUnits().isEmpty();
			case OrgdesignPackage.ORGANIZATION__PEOPLE:
				return !getPeople().isEmpty();
			case OrgdesignPackage.ORGANIZATION__STRATEGIES:
				return !getStrategies().isEmpty();
			case OrgdesignPackage.ORGANIZATION__ENVIRONMENT_FACTORS:
				return !getEnvironmentFactors().isEmpty();
			case OrgdesignPackage.ORGANIZATION__CAPABILITIES:
				return !getCapabilities().isEmpty();
			case OrgdesignPackage.ORGANIZATION__PROCESSES:
				return !getProcesses().isEmpty();
			case OrgdesignPackage.ORGANIZATION__COORDINATION_MECHANISMS:
				return !getCoordinationMechanisms().isEmpty();
			case OrgdesignPackage.ORGANIZATION__DECISION_RIGHTS:
				return !getDecisionRights().isEmpty();
			case OrgdesignPackage.ORGANIZATION__FIT_RULES:
				return !getFitRules().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OrganizationImpl
