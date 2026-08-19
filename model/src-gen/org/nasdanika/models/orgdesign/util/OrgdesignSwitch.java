/**
 */
package org.nasdanika.models.orgdesign.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.nasdanika.models.capability.AbstractCapability;
import org.nasdanika.models.capability.AbstractEvidence;
import org.nasdanika.models.capability.EvidenceDomain;

import org.nasdanika.models.iam.AccessControlled;

import org.nasdanika.models.lifecycle.Staged;

import org.nasdanika.models.nxcore.Documented;
import org.nasdanika.models.nxcore.Marked;
import org.nasdanika.models.nxcore.ModelElement;
import org.nasdanika.models.nxcore.NamedElement;
import org.nasdanika.models.nxcore.NamedPeriod;
import org.nasdanika.models.nxcore.Period;
import org.nasdanika.models.nxcore.Referrable;
import org.nasdanika.models.nxcore.StringIdentity;

import org.nasdanika.models.orgdesign.Capability;
import org.nasdanika.models.orgdesign.CoordinationMechanism;
import org.nasdanika.models.orgdesign.DecisionRight;
import org.nasdanika.models.orgdesign.EnvironmentFactor;
import org.nasdanika.models.orgdesign.FitRule;
import org.nasdanika.models.orgdesign.Goal;
import org.nasdanika.models.orgdesign.Organization;
import org.nasdanika.models.orgdesign.OrganizationalUnit;
import org.nasdanika.models.orgdesign.OrgdesignPackage;
import org.nasdanika.models.orgdesign.Person;
import org.nasdanika.models.orgdesign.ProcessStep;
import org.nasdanika.models.orgdesign.Role;
import org.nasdanika.models.orgdesign.Strategy;

import org.nasdanika.models.seal.SealedElement;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.nasdanika.models.orgdesign.OrgdesignPackage
 * @generated
 */
public class OrgdesignSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OrgdesignPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrgdesignSwitch() {
		if (modelPackage == null) {
			modelPackage = OrgdesignPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case OrgdesignPackage.ORGANIZATION: {
				Organization organization = (Organization)theEObject;
				T result = caseOrganization(organization);
				if (result == null) result = caseNamedElement(organization);
				if (result == null) result = caseModelElement(organization);
				if (result == null) result = caseStringIdentity(organization);
				if (result == null) result = caseDocumented(organization);
				if (result == null) result = caseMarked(organization);
				if (result == null) result = caseReferrable(organization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrgdesignPackage.ORGANIZATIONAL_UNIT: {
				OrganizationalUnit organizationalUnit = (OrganizationalUnit)theEObject;
				T result = caseOrganizationalUnit(organizationalUnit);
				if (result == null) result = caseNamedElement(organizationalUnit);
				if (result == null) result = caseModelElement(organizationalUnit);
				if (result == null) result = caseStringIdentity(organizationalUnit);
				if (result == null) result = caseDocumented(organizationalUnit);
				if (result == null) result = caseMarked(organizationalUnit);
				if (result == null) result = caseReferrable(organizationalUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrgdesignPackage.ROLE: {
				Role role = (Role)theEObject;
				T result = caseRole(role);
				if (result == null) result = caseNamedElement(role);
				if (result == null) result = caseModelElement(role);
				if (result == null) result = caseStringIdentity(role);
				if (result == null) result = caseDocumented(role);
				if (result == null) result = caseMarked(role);
				if (result == null) result = caseReferrable(role);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrgdesignPackage.PERSON: {
				Person person = (Person)theEObject;
				T result = casePerson(person);
				if (result == null) result = caseNamedElement(person);
				if (result == null) result = caseModelElement(person);
				if (result == null) result = caseStringIdentity(person);
				if (result == null) result = caseDocumented(person);
				if (result == null) result = caseMarked(person);
				if (result == null) result = caseReferrable(person);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrgdesignPackage.CAPABILITY: {
				Capability capability = (Capability)theEObject;
				T result = caseCapability(capability);
				if (result == null) result = caseCapability_Capability(capability);
				if (result == null) result = caseNamedPeriod(capability);
				if (result == null) result = caseAbstractCapability(capability);
				if (result == null) result = caseEvidenceDomain(capability);
				if (result == null) result = caseStaged(capability);
				if (result == null) result = caseNamedElement(capability);
				if (result == null) result = casePeriod(capability);
				if (result == null) result = caseAbstractEvidence(capability);
				if (result == null) result = caseSealedElement(capability);
				if (result == null) result = caseModelElement(capability);
				if (result == null) result = caseAccessControlled(capability);
				if (result == null) result = caseStringIdentity(capability);
				if (result == null) result = caseDocumented(capability);
				if (result == null) result = caseMarked(capability);
				if (result == null) result = caseReferrable(capability);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrgdesignPackage.STRATEGY: {
				Strategy strategy = (Strategy)theEObject;
				T result = caseStrategy(strategy);
				if (result == null) result = caseNamedElement(strategy);
				if (result == null) result = caseModelElement(strategy);
				if (result == null) result = caseStringIdentity(strategy);
				if (result == null) result = caseDocumented(strategy);
				if (result == null) result = caseMarked(strategy);
				if (result == null) result = caseReferrable(strategy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrgdesignPackage.GOAL: {
				Goal goal = (Goal)theEObject;
				T result = caseGoal(goal);
				if (result == null) result = caseNamedElement(goal);
				if (result == null) result = caseModelElement(goal);
				if (result == null) result = caseStringIdentity(goal);
				if (result == null) result = caseDocumented(goal);
				if (result == null) result = caseMarked(goal);
				if (result == null) result = caseReferrable(goal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrgdesignPackage.ENVIRONMENT_FACTOR: {
				EnvironmentFactor environmentFactor = (EnvironmentFactor)theEObject;
				T result = caseEnvironmentFactor(environmentFactor);
				if (result == null) result = caseNamedElement(environmentFactor);
				if (result == null) result = caseModelElement(environmentFactor);
				if (result == null) result = caseStringIdentity(environmentFactor);
				if (result == null) result = caseDocumented(environmentFactor);
				if (result == null) result = caseMarked(environmentFactor);
				if (result == null) result = caseReferrable(environmentFactor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrgdesignPackage.PROCESS: {
				org.nasdanika.models.orgdesign.Process process = (org.nasdanika.models.orgdesign.Process)theEObject;
				T result = caseProcess(process);
				if (result == null) result = caseNamedElement(process);
				if (result == null) result = caseModelElement(process);
				if (result == null) result = caseStringIdentity(process);
				if (result == null) result = caseDocumented(process);
				if (result == null) result = caseMarked(process);
				if (result == null) result = caseReferrable(process);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrgdesignPackage.PROCESS_STEP: {
				ProcessStep processStep = (ProcessStep)theEObject;
				T result = caseProcessStep(processStep);
				if (result == null) result = caseNamedElement(processStep);
				if (result == null) result = caseModelElement(processStep);
				if (result == null) result = caseStringIdentity(processStep);
				if (result == null) result = caseDocumented(processStep);
				if (result == null) result = caseMarked(processStep);
				if (result == null) result = caseReferrable(processStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrgdesignPackage.DECISION_RIGHT: {
				DecisionRight decisionRight = (DecisionRight)theEObject;
				T result = caseDecisionRight(decisionRight);
				if (result == null) result = caseNamedElement(decisionRight);
				if (result == null) result = caseModelElement(decisionRight);
				if (result == null) result = caseStringIdentity(decisionRight);
				if (result == null) result = caseDocumented(decisionRight);
				if (result == null) result = caseMarked(decisionRight);
				if (result == null) result = caseReferrable(decisionRight);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrgdesignPackage.COORDINATION_MECHANISM: {
				CoordinationMechanism coordinationMechanism = (CoordinationMechanism)theEObject;
				T result = caseCoordinationMechanism(coordinationMechanism);
				if (result == null) result = caseNamedElement(coordinationMechanism);
				if (result == null) result = caseModelElement(coordinationMechanism);
				if (result == null) result = caseStringIdentity(coordinationMechanism);
				if (result == null) result = caseDocumented(coordinationMechanism);
				if (result == null) result = caseMarked(coordinationMechanism);
				if (result == null) result = caseReferrable(coordinationMechanism);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrgdesignPackage.FIT_RULE: {
				FitRule fitRule = (FitRule)theEObject;
				T result = caseFitRule(fitRule);
				if (result == null) result = caseNamedElement(fitRule);
				if (result == null) result = caseModelElement(fitRule);
				if (result == null) result = caseStringIdentity(fitRule);
				if (result == null) result = caseDocumented(fitRule);
				if (result == null) result = caseMarked(fitRule);
				if (result == null) result = caseReferrable(fitRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Organization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Organization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrganization(Organization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Organizational Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Organizational Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrganizationalUnit(OrganizationalUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRole(Role object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Person</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Person</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePerson(Person object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Capability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Capability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCapability(Capability object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Strategy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Strategy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStrategy(Strategy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Goal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Goal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGoal(Goal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Environment Factor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Environment Factor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnvironmentFactor(EnvironmentFactor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcess(org.nasdanika.models.orgdesign.Process object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessStep(ProcessStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decision Right</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decision Right</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDecisionRight(DecisionRight object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coordination Mechanism</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coordination Mechanism</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoordinationMechanism(CoordinationMechanism object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fit Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fit Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFitRule(FitRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Referrable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Referrable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferrable(Referrable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Identity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Identity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringIdentity(StringIdentity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Documented</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Documented</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumented(Documented object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Marked</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Marked</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMarked(Marked object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelElement(ModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Period</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Period</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePeriod(Period object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Period</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Period</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedPeriod(NamedPeriod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Capability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Capability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractCapability(AbstractCapability object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Evidence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Evidence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractEvidence(AbstractEvidence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Evidence Domain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Evidence Domain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvidenceDomain(EvidenceDomain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Access Controlled</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Access Controlled</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccessControlled(AccessControlled object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sealed Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sealed Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSealedElement(SealedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Staged</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Staged</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStaged(Staged object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Capability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Capability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCapability_Capability(org.nasdanika.models.capability.Capability object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //OrgdesignSwitch
