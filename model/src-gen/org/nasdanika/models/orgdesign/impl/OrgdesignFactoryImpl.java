/**
 */
package org.nasdanika.models.orgdesign.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OrgdesignFactoryImpl extends EFactoryImpl implements OrgdesignFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OrgdesignFactory init() {
		try {
			OrgdesignFactory theOrgdesignFactory = (OrgdesignFactory)EPackage.Registry.INSTANCE.getEFactory(OrgdesignPackage.eNS_URI);
			if (theOrgdesignFactory != null) {
				return theOrgdesignFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OrgdesignFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrgdesignFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case OrgdesignPackage.ORGANIZATION: return createOrganization();
			case OrgdesignPackage.ORGANIZATIONAL_UNIT: return createOrganizationalUnit();
			case OrgdesignPackage.ROLE: return createRole();
			case OrgdesignPackage.PERSON: return createPerson();
			case OrgdesignPackage.CAPABILITY: return createCapability();
			case OrgdesignPackage.STRATEGY: return createStrategy();
			case OrgdesignPackage.GOAL: return createGoal();
			case OrgdesignPackage.ENVIRONMENT_FACTOR: return createEnvironmentFactor();
			case OrgdesignPackage.PROCESS: return createProcess();
			case OrgdesignPackage.PROCESS_STEP: return createProcessStep();
			case OrgdesignPackage.DECISION_RIGHT: return createDecisionRight();
			case OrgdesignPackage.COORDINATION_MECHANISM: return createCoordinationMechanism();
			case OrgdesignPackage.FIT_RULE: return createFitRule();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case OrgdesignPackage.UNIT_TYPE:
				return createUnitTypeFromString(eDataType, initialValue);
			case OrgdesignPackage.CAPABILITY_MATURITY:
				return createCapabilityMaturityFromString(eDataType, initialValue);
			case OrgdesignPackage.ENVIRONMENT_DIMENSION:
				return createEnvironmentDimensionFromString(eDataType, initialValue);
			case OrgdesignPackage.UNCERTAINTY:
				return createUncertaintyFromString(eDataType, initialValue);
			case OrgdesignPackage.COMPLEXITY:
				return createComplexityFromString(eDataType, initialValue);
			case OrgdesignPackage.PROCESS_TYPE:
				return createProcessTypeFromString(eDataType, initialValue);
			case OrgdesignPackage.DECISION_SCOPE:
				return createDecisionScopeFromString(eDataType, initialValue);
			case OrgdesignPackage.DECISION_AUTHORITY_LEVEL:
				return createDecisionAuthorityLevelFromString(eDataType, initialValue);
			case OrgdesignPackage.COORDINATION_TYPE:
				return createCoordinationTypeFromString(eDataType, initialValue);
			case OrgdesignPackage.FIT_SEVERITY:
				return createFitSeverityFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case OrgdesignPackage.UNIT_TYPE:
				return convertUnitTypeToString(eDataType, instanceValue);
			case OrgdesignPackage.CAPABILITY_MATURITY:
				return convertCapabilityMaturityToString(eDataType, instanceValue);
			case OrgdesignPackage.ENVIRONMENT_DIMENSION:
				return convertEnvironmentDimensionToString(eDataType, instanceValue);
			case OrgdesignPackage.UNCERTAINTY:
				return convertUncertaintyToString(eDataType, instanceValue);
			case OrgdesignPackage.COMPLEXITY:
				return convertComplexityToString(eDataType, instanceValue);
			case OrgdesignPackage.PROCESS_TYPE:
				return convertProcessTypeToString(eDataType, instanceValue);
			case OrgdesignPackage.DECISION_SCOPE:
				return convertDecisionScopeToString(eDataType, instanceValue);
			case OrgdesignPackage.DECISION_AUTHORITY_LEVEL:
				return convertDecisionAuthorityLevelToString(eDataType, instanceValue);
			case OrgdesignPackage.COORDINATION_TYPE:
				return convertCoordinationTypeToString(eDataType, instanceValue);
			case OrgdesignPackage.FIT_SEVERITY:
				return convertFitSeverityToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Organization createOrganization() {
		OrganizationImpl organization = new OrganizationImpl();
		return organization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrganizationalUnit createOrganizationalUnit() {
		OrganizationalUnitImpl organizationalUnit = new OrganizationalUnitImpl();
		return organizationalUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Role createRole() {
		RoleImpl role = new RoleImpl();
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Person createPerson() {
		PersonImpl person = new PersonImpl();
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Capability createCapability() {
		CapabilityImpl capability = new CapabilityImpl();
		return capability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Strategy createStrategy() {
		StrategyImpl strategy = new StrategyImpl();
		return strategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Goal createGoal() {
		GoalImpl goal = new GoalImpl();
		return goal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnvironmentFactor createEnvironmentFactor() {
		EnvironmentFactorImpl environmentFactor = new EnvironmentFactorImpl();
		return environmentFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.nasdanika.models.orgdesign.Process createProcess() {
		ProcessImpl process = new ProcessImpl();
		return process;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcessStep createProcessStep() {
		ProcessStepImpl processStep = new ProcessStepImpl();
		return processStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DecisionRight createDecisionRight() {
		DecisionRightImpl decisionRight = new DecisionRightImpl();
		return decisionRight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CoordinationMechanism createCoordinationMechanism() {
		CoordinationMechanismImpl coordinationMechanism = new CoordinationMechanismImpl();
		return coordinationMechanism;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FitRule createFitRule() {
		FitRuleImpl fitRule = new FitRuleImpl();
		return fitRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitType createUnitTypeFromString(EDataType eDataType, String initialValue) {
		UnitType result = UnitType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnitTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityMaturity createCapabilityMaturityFromString(EDataType eDataType, String initialValue) {
		CapabilityMaturity result = CapabilityMaturity.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCapabilityMaturityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnvironmentDimension createEnvironmentDimensionFromString(EDataType eDataType, String initialValue) {
		EnvironmentDimension result = EnvironmentDimension.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnvironmentDimensionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uncertainty createUncertaintyFromString(EDataType eDataType, String initialValue) {
		Uncertainty result = Uncertainty.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUncertaintyToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Complexity createComplexityFromString(EDataType eDataType, String initialValue) {
		Complexity result = Complexity.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertComplexityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessType createProcessTypeFromString(EDataType eDataType, String initialValue) {
		ProcessType result = ProcessType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProcessTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecisionScope createDecisionScopeFromString(EDataType eDataType, String initialValue) {
		DecisionScope result = DecisionScope.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDecisionScopeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecisionAuthorityLevel createDecisionAuthorityLevelFromString(EDataType eDataType, String initialValue) {
		DecisionAuthorityLevel result = DecisionAuthorityLevel.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDecisionAuthorityLevelToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoordinationType createCoordinationTypeFromString(EDataType eDataType, String initialValue) {
		CoordinationType result = CoordinationType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCoordinationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FitSeverity createFitSeverityFromString(EDataType eDataType, String initialValue) {
		FitSeverity result = FitSeverity.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFitSeverityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrgdesignPackage getOrgdesignPackage() {
		return (OrgdesignPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OrgdesignPackage getPackage() {
		return OrgdesignPackage.eINSTANCE;
	}

} //OrgdesignFactoryImpl
