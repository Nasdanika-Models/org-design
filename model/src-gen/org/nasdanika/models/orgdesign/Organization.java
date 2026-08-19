/**
 */
package org.nasdanika.models.orgdesign;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.models.nxcore.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Organization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Root container for an organizational design model. Aggregates all top-level elements: units, people, strategy, capabilities, processes, coordination mechanisms, decision rights, environment factors, and fit rules.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.orgdesign.Organization#getTopLevelUnits <em>Top Level Units</em>}</li>
 *   <li>{@link org.nasdanika.models.orgdesign.Organization#getPeople <em>People</em>}</li>
 *   <li>{@link org.nasdanika.models.orgdesign.Organization#getStrategies <em>Strategies</em>}</li>
 *   <li>{@link org.nasdanika.models.orgdesign.Organization#getEnvironmentFactors <em>Environment Factors</em>}</li>
 *   <li>{@link org.nasdanika.models.orgdesign.Organization#getCapabilities <em>Capabilities</em>}</li>
 *   <li>{@link org.nasdanika.models.orgdesign.Organization#getProcesses <em>Processes</em>}</li>
 *   <li>{@link org.nasdanika.models.orgdesign.Organization#getCoordinationMechanisms <em>Coordination Mechanisms</em>}</li>
 *   <li>{@link org.nasdanika.models.orgdesign.Organization#getDecisionRights <em>Decision Rights</em>}</li>
 *   <li>{@link org.nasdanika.models.orgdesign.Organization#getFitRules <em>Fit Rules</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.orgdesign.OrgdesignPackage#getOrganization()
 * @model
 * @generated
 */
public interface Organization extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Top Level Units</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.orgdesign.OrganizationalUnit}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.orgdesign.OrganizationalUnit#getOrganization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Top-level organizational units. Sub-units are nested via OrganizationalUnit.subUnits.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Top Level Units</em>' containment reference list.
	 * @see org.nasdanika.models.orgdesign.OrgdesignPackage#getOrganization_TopLevelUnits()
	 * @see org.nasdanika.models.orgdesign.OrganizationalUnit#getOrganization
	 * @model opposite="organization" containment="true"
	 * @generated
	 */
	EList<OrganizationalUnit> getTopLevelUnits();

	/**
	 * Returns the value of the '<em><b>People</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.orgdesign.Person}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * People associated with the organization. People may fill multiple roles over time.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>People</em>' containment reference list.
	 * @see org.nasdanika.models.orgdesign.OrgdesignPackage#getOrganization_People()
	 * @model containment="true"
	 * @generated
	 */
	EList<Person> getPeople();

	/**
	 * Returns the value of the '<em><b>Strategies</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.orgdesign.Strategy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Strategic intent - coherent goal sets responding to environment factors.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Strategies</em>' containment reference list.
	 * @see org.nasdanika.models.orgdesign.OrgdesignPackage#getOrganization_Strategies()
	 * @model containment="true"
	 * @generated
	 */
	EList<Strategy> getStrategies();

	/**
	 * Returns the value of the '<em><b>Environment Factors</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.orgdesign.EnvironmentFactor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * External factors shaping design choices: market dynamics, regulatory pressure, technological change, competitive intensity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Environment Factors</em>' containment reference list.
	 * @see org.nasdanika.models.orgdesign.OrgdesignPackage#getOrganization_EnvironmentFactors()
	 * @model containment="true"
	 * @generated
	 */
	EList<EnvironmentFactor> getEnvironmentFactors();

	/**
	 * Returns the value of the '<em><b>Capabilities</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.orgdesign.Capability}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Capabilities the organization claims to deliver. Cross-references from product management or application portfolio models typically resolve here.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Capabilities</em>' containment reference list.
	 * @see org.nasdanika.models.orgdesign.OrgdesignPackage#getOrganization_Capabilities()
	 * @model containment="true"
	 * @generated
	 */
	EList<Capability> getCapabilities();

	/**
	 * Returns the value of the '<em><b>Processes</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.orgdesign.Process}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Business and operational processes that span units.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Processes</em>' containment reference list.
	 * @see org.nasdanika.models.orgdesign.OrgdesignPackage#getOrganization_Processes()
	 * @model containment="true"
	 * @generated
	 */
	EList<org.nasdanika.models.orgdesign.Process> getProcesses();

	/**
	 * Returns the value of the '<em><b>Coordination Mechanisms</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.orgdesign.CoordinationMechanism}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Mechanisms that coordinate work across units.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Coordination Mechanisms</em>' containment reference list.
	 * @see org.nasdanika.models.orgdesign.OrgdesignPackage#getOrganization_CoordinationMechanisms()
	 * @model containment="true"
	 * @generated
	 */
	EList<CoordinationMechanism> getCoordinationMechanisms();

	/**
	 * Returns the value of the '<em><b>Decision Rights</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.orgdesign.DecisionRight}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Decision rights - what is decided, by whom, with what scope.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Decision Rights</em>' containment reference list.
	 * @see org.nasdanika.models.orgdesign.OrgdesignPackage#getOrganization_DecisionRights()
	 * @model containment="true"
	 * @generated
	 */
	EList<DecisionRight> getDecisionRights();

	/**
	 * Returns the value of the '<em><b>Fit Rules</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.orgdesign.FitRule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Rules expressing expected fit between design dimensions. Validation tooling can surface misalignments.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fit Rules</em>' containment reference list.
	 * @see org.nasdanika.models.orgdesign.OrgdesignPackage#getOrganization_FitRules()
	 * @model containment="true"
	 * @generated
	 */
	EList<FitRule> getFitRules();

} // Organization
