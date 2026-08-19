/**
 */
package org.nasdanika.models.orgdesign.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.nasdanika.models.capability.CapabilityPackage;

import org.nasdanika.models.iam.IamPackage;

import org.nasdanika.models.lifecycle.LifecyclePackage;

import org.nasdanika.models.nxcore.NxcorePackage;

import org.nasdanika.models.orgdesign.Capability;
import org.nasdanika.models.orgdesign.CapabilityMaturity;
import org.nasdanika.models.orgdesign.Complexity;
import org.nasdanika.models.orgdesign.CoordinationMechanism;
import org.nasdanika.models.orgdesign.CoordinationType;
import org.nasdanika.models.orgdesign.DecisionAuthorityLevel;
import org.nasdanika.models.orgdesign.DecisionRight;
import org.nasdanika.models.orgdesign.DecisionScope;
import org.nasdanika.models.orgdesign.EnvironmentDimension;
import org.nasdanika.models.orgdesign.EnvironmentFactor;
import org.nasdanika.models.orgdesign.FitRule;
import org.nasdanika.models.orgdesign.FitSeverity;
import org.nasdanika.models.orgdesign.Goal;
import org.nasdanika.models.orgdesign.Organization;
import org.nasdanika.models.orgdesign.OrganizationalUnit;
import org.nasdanika.models.orgdesign.OrgdesignFactory;
import org.nasdanika.models.orgdesign.OrgdesignPackage;
import org.nasdanika.models.orgdesign.Person;
import org.nasdanika.models.orgdesign.ProcessStep;
import org.nasdanika.models.orgdesign.ProcessType;
import org.nasdanika.models.orgdesign.Role;
import org.nasdanika.models.orgdesign.Strategy;
import org.nasdanika.models.orgdesign.Uncertainty;
import org.nasdanika.models.orgdesign.UnitType;

import org.nasdanika.models.role.RolePackage;

import org.nasdanika.models.seal.SealPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OrgdesignPackageImpl extends EPackageImpl implements OrgdesignPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass organizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass organizationalUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass capabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass strategyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass goalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass environmentFactorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decisionRightEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coordinationMechanismEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fitRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum unitTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum capabilityMaturityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum environmentDimensionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum uncertaintyEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum complexityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum processTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum decisionScopeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum decisionAuthorityLevelEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum coordinationTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum fitSeverityEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.nasdanika.models.orgdesign.OrgdesignPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OrgdesignPackageImpl() {
		super(eNS_URI, OrgdesignFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link OrgdesignPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static OrgdesignPackage init() {
		if (isInited) return (OrgdesignPackage)EPackage.Registry.INSTANCE.getEPackage(OrgdesignPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredOrgdesignPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		OrgdesignPackageImpl theOrgdesignPackage = registeredOrgdesignPackage instanceof OrgdesignPackageImpl ? (OrgdesignPackageImpl)registeredOrgdesignPackage : new OrgdesignPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		NxcorePackage.eINSTANCE.eClass();
		EcorePackage.eINSTANCE.eClass();
		CapabilityPackage.eINSTANCE.eClass();
		IamPackage.eINSTANCE.eClass();
		SealPackage.eINSTANCE.eClass();
		LifecyclePackage.eINSTANCE.eClass();
		RolePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theOrgdesignPackage.createPackageContents();

		// Initialize created meta-data
		theOrgdesignPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theOrgdesignPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(OrgdesignPackage.eNS_URI, theOrgdesignPackage);
		return theOrgdesignPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrganization() {
		return organizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrganization_TopLevelUnits() {
		return (EReference)organizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrganization_People() {
		return (EReference)organizationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrganization_Strategies() {
		return (EReference)organizationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrganization_EnvironmentFactors() {
		return (EReference)organizationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrganization_Capabilities() {
		return (EReference)organizationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrganization_Processes() {
		return (EReference)organizationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrganization_CoordinationMechanisms() {
		return (EReference)organizationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrganization_DecisionRights() {
		return (EReference)organizationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrganization_FitRules() {
		return (EReference)organizationEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrganizationalUnit() {
		return organizationalUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrganizationalUnit_Organization() {
		return (EReference)organizationalUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrganizationalUnit_Parent() {
		return (EReference)organizationalUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrganizationalUnit_SubUnits() {
		return (EReference)organizationalUnitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrganizationalUnit_Roles() {
		return (EReference)organizationalUnitEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrganizationalUnit_DeliveredCapabilities() {
		return (EReference)organizationalUnitEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrganizationalUnit_UnitType() {
		return (EAttribute)organizationalUnitEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRole() {
		return roleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRole_Unit() {
		return (EReference)roleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRole_CurrentHolder() {
		return (EReference)roleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRole_RequiredCapabilities() {
		return (EReference)roleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRole_DecisionRights() {
		return (EReference)roleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRole_ReportsTo() {
		return (EReference)roleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRole_DirectReports() {
		return (EReference)roleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPerson() {
		return personEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPerson_Email() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPerson_Capabilities() {
		return (EReference)personEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPerson_CurrentRoles() {
		return (EReference)personEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCapability() {
		return capabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCapability_Maturity() {
		return (EAttribute)capabilityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStrategy() {
		return strategyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStrategy_Goals() {
		return (EReference)strategyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStrategy_RespondsTo() {
		return (EReference)strategyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStrategy_RequiresCapabilities() {
		return (EReference)strategyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStrategy_Horizon() {
		return (EAttribute)strategyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGoal() {
		return goalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGoal_Metric() {
		return (EAttribute)goalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGoal_Target() {
		return (EAttribute)goalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGoal_Horizon() {
		return (EAttribute)goalEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnvironmentFactor() {
		return environmentFactorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnvironmentFactor_Dimension() {
		return (EAttribute)environmentFactorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnvironmentFactor_Uncertainty() {
		return (EAttribute)environmentFactorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnvironmentFactor_Complexity() {
		return (EAttribute)environmentFactorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProcess() {
		return processEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcess_ParticipatingUnits() {
		return (EReference)processEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcess_EnabledCapabilities() {
		return (EReference)processEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProcess_Type() {
		return (EAttribute)processEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcess_Steps() {
		return (EReference)processEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProcessStep() {
		return processStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessStep_Responsible() {
		return (EReference)processStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessStep_Performers() {
		return (EReference)processStepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessStep_Consulted() {
		return (EReference)processStepEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessStep_Informed() {
		return (EReference)processStepEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessStep_Predecessors() {
		return (EReference)processStepEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDecisionRight() {
		return decisionRightEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDecisionRight_Scope() {
		return (EAttribute)decisionRightEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDecisionRight_ApplicableUnits() {
		return (EReference)decisionRightEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDecisionRight_ApplicableCapabilities() {
		return (EReference)decisionRightEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDecisionRight_AuthorityLevel() {
		return (EAttribute)decisionRightEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCoordinationMechanism() {
		return coordinationMechanismEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCoordinationMechanism_Type() {
		return (EAttribute)coordinationMechanismEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCoordinationMechanism_LinkedUnits() {
		return (EReference)coordinationMechanismEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCoordinationMechanism_Cadence() {
		return (EAttribute)coordinationMechanismEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFitRule() {
		return fitRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFitRule_Condition() {
		return (EAttribute)fitRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFitRule_ExpectedOutcome() {
		return (EAttribute)fitRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFitRule_Severity() {
		return (EAttribute)fitRuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getUnitType() {
		return unitTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCapabilityMaturity() {
		return capabilityMaturityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getEnvironmentDimension() {
		return environmentDimensionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getUncertainty() {
		return uncertaintyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getComplexity() {
		return complexityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getProcessType() {
		return processTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDecisionScope() {
		return decisionScopeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDecisionAuthorityLevel() {
		return decisionAuthorityLevelEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCoordinationType() {
		return coordinationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getFitSeverity() {
		return fitSeverityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrgdesignFactory getOrgdesignFactory() {
		return (OrgdesignFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		organizationEClass = createEClass(ORGANIZATION);
		createEReference(organizationEClass, ORGANIZATION__TOP_LEVEL_UNITS);
		createEReference(organizationEClass, ORGANIZATION__PEOPLE);
		createEReference(organizationEClass, ORGANIZATION__STRATEGIES);
		createEReference(organizationEClass, ORGANIZATION__ENVIRONMENT_FACTORS);
		createEReference(organizationEClass, ORGANIZATION__CAPABILITIES);
		createEReference(organizationEClass, ORGANIZATION__PROCESSES);
		createEReference(organizationEClass, ORGANIZATION__COORDINATION_MECHANISMS);
		createEReference(organizationEClass, ORGANIZATION__DECISION_RIGHTS);
		createEReference(organizationEClass, ORGANIZATION__FIT_RULES);

		organizationalUnitEClass = createEClass(ORGANIZATIONAL_UNIT);
		createEReference(organizationalUnitEClass, ORGANIZATIONAL_UNIT__ORGANIZATION);
		createEReference(organizationalUnitEClass, ORGANIZATIONAL_UNIT__PARENT);
		createEReference(organizationalUnitEClass, ORGANIZATIONAL_UNIT__SUB_UNITS);
		createEReference(organizationalUnitEClass, ORGANIZATIONAL_UNIT__ROLES);
		createEReference(organizationalUnitEClass, ORGANIZATIONAL_UNIT__DELIVERED_CAPABILITIES);
		createEAttribute(organizationalUnitEClass, ORGANIZATIONAL_UNIT__UNIT_TYPE);

		roleEClass = createEClass(ROLE);
		createEReference(roleEClass, ROLE__UNIT);
		createEReference(roleEClass, ROLE__CURRENT_HOLDER);
		createEReference(roleEClass, ROLE__REQUIRED_CAPABILITIES);
		createEReference(roleEClass, ROLE__DECISION_RIGHTS);
		createEReference(roleEClass, ROLE__REPORTS_TO);
		createEReference(roleEClass, ROLE__DIRECT_REPORTS);

		personEClass = createEClass(PERSON);
		createEAttribute(personEClass, PERSON__EMAIL);
		createEReference(personEClass, PERSON__CAPABILITIES);
		createEReference(personEClass, PERSON__CURRENT_ROLES);

		capabilityEClass = createEClass(CAPABILITY);
		createEAttribute(capabilityEClass, CAPABILITY__MATURITY);

		strategyEClass = createEClass(STRATEGY);
		createEReference(strategyEClass, STRATEGY__GOALS);
		createEReference(strategyEClass, STRATEGY__RESPONDS_TO);
		createEReference(strategyEClass, STRATEGY__REQUIRES_CAPABILITIES);
		createEAttribute(strategyEClass, STRATEGY__HORIZON);

		goalEClass = createEClass(GOAL);
		createEAttribute(goalEClass, GOAL__METRIC);
		createEAttribute(goalEClass, GOAL__TARGET);
		createEAttribute(goalEClass, GOAL__HORIZON);

		environmentFactorEClass = createEClass(ENVIRONMENT_FACTOR);
		createEAttribute(environmentFactorEClass, ENVIRONMENT_FACTOR__DIMENSION);
		createEAttribute(environmentFactorEClass, ENVIRONMENT_FACTOR__UNCERTAINTY);
		createEAttribute(environmentFactorEClass, ENVIRONMENT_FACTOR__COMPLEXITY);

		processEClass = createEClass(PROCESS);
		createEReference(processEClass, PROCESS__PARTICIPATING_UNITS);
		createEReference(processEClass, PROCESS__ENABLED_CAPABILITIES);
		createEAttribute(processEClass, PROCESS__TYPE);
		createEReference(processEClass, PROCESS__STEPS);

		processStepEClass = createEClass(PROCESS_STEP);
		createEReference(processStepEClass, PROCESS_STEP__RESPONSIBLE);
		createEReference(processStepEClass, PROCESS_STEP__PERFORMERS);
		createEReference(processStepEClass, PROCESS_STEP__CONSULTED);
		createEReference(processStepEClass, PROCESS_STEP__INFORMED);
		createEReference(processStepEClass, PROCESS_STEP__PREDECESSORS);

		decisionRightEClass = createEClass(DECISION_RIGHT);
		createEAttribute(decisionRightEClass, DECISION_RIGHT__SCOPE);
		createEReference(decisionRightEClass, DECISION_RIGHT__APPLICABLE_UNITS);
		createEReference(decisionRightEClass, DECISION_RIGHT__APPLICABLE_CAPABILITIES);
		createEAttribute(decisionRightEClass, DECISION_RIGHT__AUTHORITY_LEVEL);

		coordinationMechanismEClass = createEClass(COORDINATION_MECHANISM);
		createEAttribute(coordinationMechanismEClass, COORDINATION_MECHANISM__TYPE);
		createEReference(coordinationMechanismEClass, COORDINATION_MECHANISM__LINKED_UNITS);
		createEAttribute(coordinationMechanismEClass, COORDINATION_MECHANISM__CADENCE);

		fitRuleEClass = createEClass(FIT_RULE);
		createEAttribute(fitRuleEClass, FIT_RULE__CONDITION);
		createEAttribute(fitRuleEClass, FIT_RULE__EXPECTED_OUTCOME);
		createEAttribute(fitRuleEClass, FIT_RULE__SEVERITY);

		// Create enums
		unitTypeEEnum = createEEnum(UNIT_TYPE);
		capabilityMaturityEEnum = createEEnum(CAPABILITY_MATURITY);
		environmentDimensionEEnum = createEEnum(ENVIRONMENT_DIMENSION);
		uncertaintyEEnum = createEEnum(UNCERTAINTY);
		complexityEEnum = createEEnum(COMPLEXITY);
		processTypeEEnum = createEEnum(PROCESS_TYPE);
		decisionScopeEEnum = createEEnum(DECISION_SCOPE);
		decisionAuthorityLevelEEnum = createEEnum(DECISION_AUTHORITY_LEVEL);
		coordinationTypeEEnum = createEEnum(COORDINATION_TYPE);
		fitSeverityEEnum = createEEnum(FIT_SEVERITY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		NxcorePackage theNxcorePackage = (NxcorePackage)EPackage.Registry.INSTANCE.getEPackage(NxcorePackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		CapabilityPackage theCapabilityPackage = (CapabilityPackage)EPackage.Registry.INSTANCE.getEPackage(CapabilityPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		organizationEClass.getESuperTypes().add(theNxcorePackage.getNamedElement());
		organizationalUnitEClass.getESuperTypes().add(theNxcorePackage.getNamedElement());
		roleEClass.getESuperTypes().add(theNxcorePackage.getNamedElement());
		personEClass.getESuperTypes().add(theNxcorePackage.getNamedElement());
		capabilityEClass.getESuperTypes().add(theCapabilityPackage.getCapability());
		strategyEClass.getESuperTypes().add(theNxcorePackage.getNamedElement());
		goalEClass.getESuperTypes().add(theNxcorePackage.getNamedElement());
		environmentFactorEClass.getESuperTypes().add(theNxcorePackage.getNamedElement());
		processEClass.getESuperTypes().add(theNxcorePackage.getNamedElement());
		processStepEClass.getESuperTypes().add(theNxcorePackage.getNamedElement());
		decisionRightEClass.getESuperTypes().add(theNxcorePackage.getNamedElement());
		coordinationMechanismEClass.getESuperTypes().add(theNxcorePackage.getNamedElement());
		fitRuleEClass.getESuperTypes().add(theNxcorePackage.getNamedElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(organizationEClass, Organization.class, "Organization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOrganization_TopLevelUnits(), this.getOrganizationalUnit(), this.getOrganizationalUnit_Organization(), "topLevelUnits", null, 0, -1, Organization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrganization_People(), this.getPerson(), null, "people", null, 0, -1, Organization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrganization_Strategies(), this.getStrategy(), null, "strategies", null, 0, -1, Organization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrganization_EnvironmentFactors(), this.getEnvironmentFactor(), null, "environmentFactors", null, 0, -1, Organization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrganization_Capabilities(), this.getCapability(), null, "capabilities", null, 0, -1, Organization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrganization_Processes(), this.getProcess(), null, "processes", null, 0, -1, Organization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrganization_CoordinationMechanisms(), this.getCoordinationMechanism(), null, "coordinationMechanisms", null, 0, -1, Organization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrganization_DecisionRights(), this.getDecisionRight(), null, "decisionRights", null, 0, -1, Organization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrganization_FitRules(), this.getFitRule(), null, "fitRules", null, 0, -1, Organization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(organizationalUnitEClass, OrganizationalUnit.class, "OrganizationalUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOrganizationalUnit_Organization(), this.getOrganization(), this.getOrganization_TopLevelUnits(), "organization", null, 0, 1, OrganizationalUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrganizationalUnit_Parent(), this.getOrganizationalUnit(), this.getOrganizationalUnit_SubUnits(), "parent", null, 0, 1, OrganizationalUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrganizationalUnit_SubUnits(), this.getOrganizationalUnit(), this.getOrganizationalUnit_Parent(), "subUnits", null, 0, -1, OrganizationalUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrganizationalUnit_Roles(), this.getRole(), this.getRole_Unit(), "roles", null, 0, -1, OrganizationalUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrganizationalUnit_DeliveredCapabilities(), this.getCapability(), null, "deliveredCapabilities", null, 0, -1, OrganizationalUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrganizationalUnit_UnitType(), this.getUnitType(), "unitType", null, 0, 1, OrganizationalUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roleEClass, Role.class, "Role", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRole_Unit(), this.getOrganizationalUnit(), this.getOrganizationalUnit_Roles(), "unit", null, 0, 1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRole_CurrentHolder(), this.getPerson(), this.getPerson_CurrentRoles(), "currentHolder", null, 0, 1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRole_RequiredCapabilities(), this.getCapability(), null, "requiredCapabilities", null, 0, -1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRole_DecisionRights(), this.getDecisionRight(), null, "decisionRights", null, 0, -1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRole_ReportsTo(), this.getRole(), this.getRole_DirectReports(), "reportsTo", null, 0, 1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRole_DirectReports(), this.getRole(), this.getRole_ReportsTo(), "directReports", null, 0, -1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(personEClass, Person.class, "Person", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPerson_Email(), theEcorePackage.getEString(), "email", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPerson_Capabilities(), this.getCapability(), null, "capabilities", null, 0, -1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPerson_CurrentRoles(), this.getRole(), this.getRole_CurrentHolder(), "currentRoles", null, 0, -1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(capabilityEClass, Capability.class, "Capability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCapability_Maturity(), this.getCapabilityMaturity(), "maturity", null, 0, 1, Capability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(strategyEClass, Strategy.class, "Strategy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStrategy_Goals(), this.getGoal(), null, "goals", null, 0, -1, Strategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStrategy_RespondsTo(), this.getEnvironmentFactor(), null, "respondsTo", null, 0, -1, Strategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStrategy_RequiresCapabilities(), this.getCapability(), null, "requiresCapabilities", null, 0, -1, Strategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStrategy_Horizon(), theEcorePackage.getEString(), "horizon", null, 0, 1, Strategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(goalEClass, Goal.class, "Goal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGoal_Metric(), theEcorePackage.getEString(), "metric", null, 0, 1, Goal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGoal_Target(), theEcorePackage.getEString(), "target", null, 0, 1, Goal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGoal_Horizon(), theEcorePackage.getEString(), "horizon", null, 0, 1, Goal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(environmentFactorEClass, EnvironmentFactor.class, "EnvironmentFactor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnvironmentFactor_Dimension(), this.getEnvironmentDimension(), "dimension", null, 0, 1, EnvironmentFactor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnvironmentFactor_Uncertainty(), this.getUncertainty(), "uncertainty", null, 0, 1, EnvironmentFactor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnvironmentFactor_Complexity(), this.getComplexity(), "complexity", null, 0, 1, EnvironmentFactor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processEClass, org.nasdanika.models.orgdesign.Process.class, "Process", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProcess_ParticipatingUnits(), this.getOrganizationalUnit(), null, "participatingUnits", null, 0, -1, org.nasdanika.models.orgdesign.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcess_EnabledCapabilities(), this.getCapability(), null, "enabledCapabilities", null, 0, -1, org.nasdanika.models.orgdesign.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcess_Type(), this.getProcessType(), "type", null, 0, 1, org.nasdanika.models.orgdesign.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcess_Steps(), this.getProcessStep(), null, "steps", null, 0, -1, org.nasdanika.models.orgdesign.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processStepEClass, ProcessStep.class, "ProcessStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProcessStep_Responsible(), this.getRole(), null, "responsible", null, 0, 1, ProcessStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessStep_Performers(), this.getRole(), null, "performers", null, 0, -1, ProcessStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessStep_Consulted(), this.getRole(), null, "consulted", null, 0, -1, ProcessStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessStep_Informed(), this.getRole(), null, "informed", null, 0, -1, ProcessStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessStep_Predecessors(), this.getProcessStep(), null, "predecessors", null, 0, -1, ProcessStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(decisionRightEClass, DecisionRight.class, "DecisionRight", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDecisionRight_Scope(), this.getDecisionScope(), "scope", null, 0, 1, DecisionRight.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDecisionRight_ApplicableUnits(), this.getOrganizationalUnit(), null, "applicableUnits", null, 0, -1, DecisionRight.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDecisionRight_ApplicableCapabilities(), this.getCapability(), null, "applicableCapabilities", null, 0, -1, DecisionRight.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDecisionRight_AuthorityLevel(), this.getDecisionAuthorityLevel(), "authorityLevel", null, 0, 1, DecisionRight.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(coordinationMechanismEClass, CoordinationMechanism.class, "CoordinationMechanism", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCoordinationMechanism_Type(), this.getCoordinationType(), "type", null, 0, 1, CoordinationMechanism.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCoordinationMechanism_LinkedUnits(), this.getOrganizationalUnit(), null, "linkedUnits", null, 0, -1, CoordinationMechanism.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCoordinationMechanism_Cadence(), theEcorePackage.getEString(), "cadence", null, 0, 1, CoordinationMechanism.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fitRuleEClass, FitRule.class, "FitRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFitRule_Condition(), theEcorePackage.getEString(), "condition", null, 0, 1, FitRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFitRule_ExpectedOutcome(), theEcorePackage.getEString(), "expectedOutcome", null, 0, 1, FitRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFitRule_Severity(), this.getFitSeverity(), "severity", null, 0, 1, FitRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(unitTypeEEnum, UnitType.class, "UnitType");
		addEEnumLiteral(unitTypeEEnum, UnitType.FUNCTIONAL);
		addEEnumLiteral(unitTypeEEnum, UnitType.DIVISIONAL);
		addEEnumLiteral(unitTypeEEnum, UnitType.MATRIX);
		addEEnumLiteral(unitTypeEEnum, UnitType.NETWORK);
		addEEnumLiteral(unitTypeEEnum, UnitType.PROJECT);
		addEEnumLiteral(unitTypeEEnum, UnitType.TEAM);
		addEEnumLiteral(unitTypeEEnum, UnitType.OTHER);

		initEEnum(capabilityMaturityEEnum, CapabilityMaturity.class, "CapabilityMaturity");
		addEEnumLiteral(capabilityMaturityEEnum, CapabilityMaturity.INITIAL);
		addEEnumLiteral(capabilityMaturityEEnum, CapabilityMaturity.REPEATABLE);
		addEEnumLiteral(capabilityMaturityEEnum, CapabilityMaturity.DEFINED);
		addEEnumLiteral(capabilityMaturityEEnum, CapabilityMaturity.MANAGED);
		addEEnumLiteral(capabilityMaturityEEnum, CapabilityMaturity.OPTIMIZING);

		initEEnum(environmentDimensionEEnum, EnvironmentDimension.class, "EnvironmentDimension");
		addEEnumLiteral(environmentDimensionEEnum, EnvironmentDimension.MARKET);
		addEEnumLiteral(environmentDimensionEEnum, EnvironmentDimension.REGULATORY);
		addEEnumLiteral(environmentDimensionEEnum, EnvironmentDimension.TECHNOLOGICAL);
		addEEnumLiteral(environmentDimensionEEnum, EnvironmentDimension.COMPETITIVE);
		addEEnumLiteral(environmentDimensionEEnum, EnvironmentDimension.SOCIAL);
		addEEnumLiteral(environmentDimensionEEnum, EnvironmentDimension.ECONOMIC);

		initEEnum(uncertaintyEEnum, Uncertainty.class, "Uncertainty");
		addEEnumLiteral(uncertaintyEEnum, Uncertainty.LOW);
		addEEnumLiteral(uncertaintyEEnum, Uncertainty.MEDIUM);
		addEEnumLiteral(uncertaintyEEnum, Uncertainty.HIGH);

		initEEnum(complexityEEnum, Complexity.class, "Complexity");
		addEEnumLiteral(complexityEEnum, Complexity.SIMPLE);
		addEEnumLiteral(complexityEEnum, Complexity.COMPLICATED);
		addEEnumLiteral(complexityEEnum, Complexity.COMPLEX);
		addEEnumLiteral(complexityEEnum, Complexity.CHAOTIC);

		initEEnum(processTypeEEnum, ProcessType.class, "ProcessType");
		addEEnumLiteral(processTypeEEnum, ProcessType.OPERATIONAL);
		addEEnumLiteral(processTypeEEnum, ProcessType.MANAGEMENT);
		addEEnumLiteral(processTypeEEnum, ProcessType.SUPPORTING);

		initEEnum(decisionScopeEEnum, DecisionScope.class, "DecisionScope");
		addEEnumLiteral(decisionScopeEEnum, DecisionScope.STRATEGIC);
		addEEnumLiteral(decisionScopeEEnum, DecisionScope.TACTICAL);
		addEEnumLiteral(decisionScopeEEnum, DecisionScope.OPERATIONAL);

		initEEnum(decisionAuthorityLevelEEnum, DecisionAuthorityLevel.class, "DecisionAuthorityLevel");
		addEEnumLiteral(decisionAuthorityLevelEEnum, DecisionAuthorityLevel.DECIDE);
		addEEnumLiteral(decisionAuthorityLevelEEnum, DecisionAuthorityLevel.RECOMMEND);
		addEEnumLiteral(decisionAuthorityLevelEEnum, DecisionAuthorityLevel.CONSULT);
		addEEnumLiteral(decisionAuthorityLevelEEnum, DecisionAuthorityLevel.INFORM);
		addEEnumLiteral(decisionAuthorityLevelEEnum, DecisionAuthorityLevel.VETO);

		initEEnum(coordinationTypeEEnum, CoordinationType.class, "CoordinationType");
		addEEnumLiteral(coordinationTypeEEnum, CoordinationType.DIRECT_SUPERVISION);
		addEEnumLiteral(coordinationTypeEEnum, CoordinationType.STANDARDIZATION_OF_WORK);
		addEEnumLiteral(coordinationTypeEEnum, CoordinationType.STANDARDIZATION_OF_OUTPUTS);
		addEEnumLiteral(coordinationTypeEEnum, CoordinationType.STANDARDIZATION_OF_SKILLS);
		addEEnumLiteral(coordinationTypeEEnum, CoordinationType.STANDARDIZATION_OF_NORMS);
		addEEnumLiteral(coordinationTypeEEnum, CoordinationType.MUTUAL_ADJUSTMENT);

		initEEnum(fitSeverityEEnum, FitSeverity.class, "FitSeverity");
		addEEnumLiteral(fitSeverityEEnum, FitSeverity.RECOMMENDED);
		addEEnumLiteral(fitSeverityEEnum, FitSeverity.REQUIRED);
		addEEnumLiteral(fitSeverityEEnum, FitSeverity.FORBIDDEN);
		addEEnumLiteral(fitSeverityEEnum, FitSeverity.WARNING);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
		// http://www.eclipse.org/emf/2011/Xcore
		createXcoreAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/GenModel";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "featureDelegation", "Dynamic",
			   "complianceLevel", "21.0",
			   "suppressGenModelAnnotations", "false",
			   "copyrightFields", "false",
			   "operationReflection", "true",
			   "importOrganizing", "true",
			   "basePackage", "org.nasdanika.models"
		   });
		addAnnotation
		  (organizationEClass,
		   source,
		   new String[] {
			   "documentation", "Root container for an organizational design model. Aggregates all top-level elements: units, people, strategy, capabilities, processes, coordination mechanisms, decision rights, environment factors, and fit rules."
		   });
		addAnnotation
		  (getOrganization_TopLevelUnits(),
		   source,
		   new String[] {
			   "documentation", "Top-level organizational units. Sub-units are nested via OrganizationalUnit.subUnits."
		   });
		addAnnotation
		  (getOrganization_People(),
		   source,
		   new String[] {
			   "documentation", "People associated with the organization. People may fill multiple roles over time."
		   });
		addAnnotation
		  (getOrganization_Strategies(),
		   source,
		   new String[] {
			   "documentation", "Strategic intent - coherent goal sets responding to environment factors."
		   });
		addAnnotation
		  (getOrganization_EnvironmentFactors(),
		   source,
		   new String[] {
			   "documentation", "External factors shaping design choices: market dynamics, regulatory pressure, technological change, competitive intensity."
		   });
		addAnnotation
		  (getOrganization_Capabilities(),
		   source,
		   new String[] {
			   "documentation", "Capabilities the organization claims to deliver. Cross-references from product management or application portfolio models typically resolve here."
		   });
		addAnnotation
		  (getOrganization_Processes(),
		   source,
		   new String[] {
			   "documentation", "Business and operational processes that span units."
		   });
		addAnnotation
		  (getOrganization_CoordinationMechanisms(),
		   source,
		   new String[] {
			   "documentation", "Mechanisms that coordinate work across units."
		   });
		addAnnotation
		  (getOrganization_DecisionRights(),
		   source,
		   new String[] {
			   "documentation", "Decision rights - what is decided, by whom, with what scope."
		   });
		addAnnotation
		  (getOrganization_FitRules(),
		   source,
		   new String[] {
			   "documentation", "Rules expressing expected fit between design dimensions. Validation tooling can surface misalignments."
		   });
		addAnnotation
		  (organizationalUnitEClass,
		   source,
		   new String[] {
			   "documentation", "A unit of organization - division, department, team, working group, project, or any structural grouping. Units form a hierarchy."
		   });
		addAnnotation
		  (getOrganizationalUnit_Organization(),
		   source,
		   new String[] {
			   "documentation", "The organization this unit belongs to. Set on top-level units; null for sub-units, which inherit through their parent."
		   });
		addAnnotation
		  (getOrganizationalUnit_Parent(),
		   source,
		   new String[] {
			   "documentation", "Parent unit, if this is a sub-unit."
		   });
		addAnnotation
		  (getOrganizationalUnit_SubUnits(),
		   source,
		   new String[] {
			   "documentation", "Sub-units of this unit."
		   });
		addAnnotation
		  (getOrganizationalUnit_Roles(),
		   source,
		   new String[] {
			   "documentation", "Roles defined within this unit."
		   });
		addAnnotation
		  (getOrganizationalUnit_DeliveredCapabilities(),
		   source,
		   new String[] {
			   "documentation", "Capabilities this unit delivers. Capability overlap across units is often the structural signature of duplicated effort."
		   });
		addAnnotation
		  (getOrganizationalUnit_UnitType(),
		   source,
		   new String[] {
			   "documentation", "Structural pattern this unit follows."
		   });
		addAnnotation
		  (unitTypeEEnum,
		   source,
		   new String[] {
			   "documentation", "Common structural patterns for organizational units, drawn from the standard configurations literature."
		   });
		addAnnotation
		  (unitTypeEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "documentation", "Organized around functional specialty - engineering, marketing, finance."
		   });
		addAnnotation
		  (unitTypeEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "documentation", "Organized around output - product line, market segment, geography."
		   });
		addAnnotation
		  (unitTypeEEnum.getELiterals().get(2),
		   source,
		   new String[] {
			   "documentation", "Two reporting axes (e.g., function and product) intersect."
		   });
		addAnnotation
		  (unitTypeEEnum.getELiterals().get(3),
		   source,
		   new String[] {
			   "documentation", "Loose federation of relatively autonomous units coordinating through standards or mutual adjustment."
		   });
		addAnnotation
		  (unitTypeEEnum.getELiterals().get(4),
		   source,
		   new String[] {
			   "documentation", "Time-bound unit assembled around a specific deliverable."
		   });
		addAnnotation
		  (unitTypeEEnum.getELiterals().get(5),
		   source,
		   new String[] {
			   "documentation", "Small, persistent group with shared work."
		   });
		addAnnotation
		  (unitTypeEEnum.getELiterals().get(6),
		   source,
		   new String[] {
			   "documentation", "Other or hybrid pattern."
		   });
		addAnnotation
		  (roleEClass,
		   source,
		   new String[] {
			   "documentation", "A position defined within an organizational unit. Roles abstract from people - they describe what someone in this position is responsible for and decides on."
		   });
		addAnnotation
		  (getRole_CurrentHolder(),
		   source,
		   new String[] {
			   "documentation", "Person currently filling this role. Null if vacant."
		   });
		addAnnotation
		  (getRole_RequiredCapabilities(),
		   source,
		   new String[] {
			   "documentation", "Capabilities required to fill this role effectively."
		   });
		addAnnotation
		  (getRole_DecisionRights(),
		   source,
		   new String[] {
			   "documentation", "Decision rights this role holds."
		   });
		addAnnotation
		  (getRole_ReportsTo(),
		   source,
		   new String[] {
			   "documentation", "Reporting line - the role this role reports to."
		   });
		addAnnotation
		  (getRole_DirectReports(),
		   source,
		   new String[] {
			   "documentation", "Roles that report to this one."
		   });
		addAnnotation
		  (personEClass,
		   source,
		   new String[] {
			   "documentation", "A person associated with the organization. People are referenced by roles; the same person may fill multiple roles or transition over time."
		   });
		addAnnotation
		  (getPerson_Email(),
		   source,
		   new String[] {
			   "documentation", "Email address used as a secondary identifier and for documentation links."
		   });
		addAnnotation
		  (getPerson_Capabilities(),
		   source,
		   new String[] {
			   "documentation", "Capabilities this person possesses. Comparing to required capabilities of the held roles surfaces gaps and overqualification."
		   });
		addAnnotation
		  (getPerson_CurrentRoles(),
		   source,
		   new String[] {
			   "documentation", "Roles this person currently holds."
		   });
		addAnnotation
		  (capabilityEClass,
		   source,
		   new String[] {
			   "documentation", "An organizational capability - something the organization claims to be able to do. Capabilities are the bridge between strategy (what we want), structure (who delivers it), and applications (what supports it). Designed to be cross-referenced from product management and application portfolio models."
		   });
		addAnnotation
		  (getCapability_Maturity(),
		   source,
		   new String[] {
			   "documentation", "Maturity assessment."
		   });
		addAnnotation
		  (capabilityMaturityEEnum,
		   source,
		   new String[] {
			   "documentation", "Maturity levels for capabilities. Adapted from staged maturity models in widespread enterprise use."
		   });
		addAnnotation
		  (strategyEClass,
		   source,
		   new String[] {
			   "documentation", "A strategic intent - a coherent set of goals responding to environment factors and requiring specific capabilities."
		   });
		addAnnotation
		  (getStrategy_RespondsTo(),
		   source,
		   new String[] {
			   "documentation", "Environment factors this strategy responds to."
		   });
		addAnnotation
		  (getStrategy_RequiresCapabilities(),
		   source,
		   new String[] {
			   "documentation", "Capabilities required to execute this strategy."
		   });
		addAnnotation
		  (getStrategy_Horizon(),
		   source,
		   new String[] {
			   "documentation", "Time horizon for this strategy (e.g., \'12 months\', \'3 years\')."
		   });
		addAnnotation
		  (goalEClass,
		   source,
		   new String[] {
			   "documentation", "A measurable objective within a strategy."
		   });
		addAnnotation
		  (getGoal_Metric(),
		   source,
		   new String[] {
			   "documentation", "Metric used to measure progress (e.g., \'monthly active users\', \'time to onboard a business banking client\')."
		   });
		addAnnotation
		  (getGoal_Target(),
		   source,
		   new String[] {
			   "documentation", "Target value or threshold."
		   });
		addAnnotation
		  (getGoal_Horizon(),
		   source,
		   new String[] {
			   "documentation", "When the target should be achieved."
		   });
		addAnnotation
		  (environmentFactorEClass,
		   source,
		   new String[] {
			   "documentation", "An external factor that shapes design choices. Environmental complexity and uncertainty are major contingency factors in classic organizational design literature."
		   });
		addAnnotation
		  (getEnvironmentFactor_Dimension(),
		   source,
		   new String[] {
			   "documentation", "Category of environment factor."
		   });
		addAnnotation
		  (getEnvironmentFactor_Uncertainty(),
		   source,
		   new String[] {
			   "documentation", "Degree of unpredictability."
		   });
		addAnnotation
		  (getEnvironmentFactor_Complexity(),
		   source,
		   new String[] {
			   "documentation", "Cynefin-inspired complexity classification."
		   });
		addAnnotation
		  (environmentDimensionEEnum,
		   source,
		   new String[] {
			   "documentation", "Categories of environment factors."
		   });
		addAnnotation
		  (uncertaintyEEnum,
		   source,
		   new String[] {
			   "documentation", "Degree of unpredictability in an environment factor."
		   });
		addAnnotation
		  (complexityEEnum,
		   source,
		   new String[] {
			   "documentation", "Complexity classification, in the Cynefin sense."
		   });
		addAnnotation
		  (processEClass,
		   source,
		   new String[] {
			   "documentation", "A business or operational process spanning one or more units."
		   });
		addAnnotation
		  (getProcess_ParticipatingUnits(),
		   source,
		   new String[] {
			   "documentation", "Units that participate in executing this process."
		   });
		addAnnotation
		  (getProcess_EnabledCapabilities(),
		   source,
		   new String[] {
			   "documentation", "Capabilities this process enables or contributes to."
		   });
		addAnnotation
		  (processTypeEEnum,
		   source,
		   new String[] {
			   "documentation", "Process category. Operational processes deliver value to customers; management processes govern the organization; supporting processes provide infrastructure."
		   });
		addAnnotation
		  (processStepEClass,
		   source,
		   new String[] {
			   "documentation", "A step within a process. Predecessor relationships define ordering; RACI-style assignments link steps to roles."
		   });
		addAnnotation
		  (getProcessStep_Responsible(),
		   source,
		   new String[] {
			   "documentation", "Role accountable for the step\'s outcome."
		   });
		addAnnotation
		  (getProcessStep_Performers(),
		   source,
		   new String[] {
			   "documentation", "Roles that perform the work."
		   });
		addAnnotation
		  (getProcessStep_Consulted(),
		   source,
		   new String[] {
			   "documentation", "Roles consulted before or during the step."
		   });
		addAnnotation
		  (getProcessStep_Informed(),
		   source,
		   new String[] {
			   "documentation", "Roles informed about the outcome."
		   });
		addAnnotation
		  (getProcessStep_Predecessors(),
		   source,
		   new String[] {
			   "documentation", "Steps that must complete before this one starts."
		   });
		addAnnotation
		  (decisionRightEClass,
		   source,
		   new String[] {
			   "documentation", "A decision right - authority to make a particular kind of decision over a particular scope."
		   });
		addAnnotation
		  (getDecisionRight_ApplicableUnits(),
		   source,
		   new String[] {
			   "documentation", "Units within which this decision right applies."
		   });
		addAnnotation
		  (getDecisionRight_ApplicableCapabilities(),
		   source,
		   new String[] {
			   "documentation", "Capabilities this decision right pertains to."
		   });
		addAnnotation
		  (decisionScopeEEnum,
		   source,
		   new String[] {
			   "documentation", "Strategic decisions concern direction; tactical concern means; operational concern execution."
		   });
		addAnnotation
		  (decisionAuthorityLevelEEnum,
		   source,
		   new String[] {
			   "documentation", "Levels of decision authority - closely related to RACI but more granular for governance modeling."
		   });
		addAnnotation
		  (coordinationMechanismEClass,
		   source,
		   new String[] {
			   "documentation", "A mechanism that coordinates work across units. The enumeration draws on Mintzberg\'s six basic coordination mechanisms - the elementary ways organizations achieve unity of effort."
		   });
		addAnnotation
		  (getCoordinationMechanism_LinkedUnits(),
		   source,
		   new String[] {
			   "documentation", "Units this mechanism coordinates between."
		   });
		addAnnotation
		  (getCoordinationMechanism_Cadence(),
		   source,
		   new String[] {
			   "documentation", "How frequently this mechanism operates (e.g., \'daily standup\', \'quarterly review\', \'continuous\')."
		   });
		addAnnotation
		  (coordinationTypeEEnum,
		   source,
		   new String[] {
			   "documentation", "Coordination mechanisms enumerated in the standard literature. Real organizations typically combine several; the choice and balance among them is itself a design decision."
		   });
		addAnnotation
		  (coordinationTypeEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "documentation", "Coordination via direct hierarchical instruction."
		   });
		addAnnotation
		  (coordinationTypeEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "documentation", "Coordination by specifying how work is to be performed."
		   });
		addAnnotation
		  (coordinationTypeEEnum.getELiterals().get(2),
		   source,
		   new String[] {
			   "documentation", "Coordination by specifying expected outputs while leaving means to performers."
		   });
		addAnnotation
		  (coordinationTypeEEnum.getELiterals().get(3),
		   source,
		   new String[] {
			   "documentation", "Coordination by training performers in shared methods."
		   });
		addAnnotation
		  (coordinationTypeEEnum.getELiterals().get(4),
		   source,
		   new String[] {
			   "documentation", "Coordination by shared values, beliefs, and behavioral norms."
		   });
		addAnnotation
		  (coordinationTypeEEnum.getELiterals().get(5),
		   source,
		   new String[] {
			   "documentation", "Coordination by informal communication between performers."
		   });
		addAnnotation
		  (fitRuleEClass,
		   source,
		   new String[] {
			   "documentation", "A rule expressing expected fit between design dimensions. Fit rules support the central insight from contingency-based design literature: there is no universally optimal organization, only better and worse fits between context, strategy, and structure. Validation tooling can use these to surface misalignments."
		   });
		addAnnotation
		  (getFitRule_Condition(),
		   source,
		   new String[] {
			   "documentation", "Condition expression. Implementation-defined; could be OCL, Xtend, or plain prose for documentation purposes."
		   });
		addAnnotation
		  (getFitRule_ExpectedOutcome(),
		   source,
		   new String[] {
			   "documentation", "What is expected when the condition holds."
		   });
		addAnnotation
		  (fitSeverityEEnum,
		   source,
		   new String[] {
			   "documentation", "Severity of a fit rule."
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2011/Xcore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createXcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2011/Xcore";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "Ecore", "http://www.eclipse.org/emf/2002/Ecore",
			   "GenModel", "http://www.eclipse.org/emf/2002/GenModel",
			   "Nasdanika", "urn:org.nasdanika"
		   });
	}

} //OrgdesignPackageImpl
