/**
 */
package org.nasdanika.models.orgdesign;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.models.nxcore.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A business or operational process spanning one or more units.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.orgdesign.Process#getParticipatingUnits <em>Participating Units</em>}</li>
 *   <li>{@link org.nasdanika.models.orgdesign.Process#getEnabledCapabilities <em>Enabled Capabilities</em>}</li>
 *   <li>{@link org.nasdanika.models.orgdesign.Process#getType <em>Type</em>}</li>
 *   <li>{@link org.nasdanika.models.orgdesign.Process#getSteps <em>Steps</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.orgdesign.OrgdesignPackage#getProcess()
 * @model
 * @generated
 */
public interface Process extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Participating Units</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.orgdesign.OrganizationalUnit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Units that participate in executing this process.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Participating Units</em>' reference list.
	 * @see org.nasdanika.models.orgdesign.OrgdesignPackage#getProcess_ParticipatingUnits()
	 * @model
	 * @generated
	 */
	EList<OrganizationalUnit> getParticipatingUnits();

	/**
	 * Returns the value of the '<em><b>Enabled Capabilities</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.orgdesign.Capability}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Capabilities this process enables or contributes to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Enabled Capabilities</em>' reference list.
	 * @see org.nasdanika.models.orgdesign.OrgdesignPackage#getProcess_EnabledCapabilities()
	 * @model
	 * @generated
	 */
	EList<Capability> getEnabledCapabilities();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.models.orgdesign.ProcessType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.nasdanika.models.orgdesign.ProcessType
	 * @see #setType(ProcessType)
	 * @see org.nasdanika.models.orgdesign.OrgdesignPackage#getProcess_Type()
	 * @model unique="false"
	 * @generated
	 */
	ProcessType getType();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.orgdesign.Process#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.nasdanika.models.orgdesign.ProcessType
	 * @see #getType()
	 * @generated
	 */
	void setType(ProcessType value);

	/**
	 * Returns the value of the '<em><b>Steps</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.orgdesign.ProcessStep}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Steps</em>' containment reference list.
	 * @see org.nasdanika.models.orgdesign.OrgdesignPackage#getProcess_Steps()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProcessStep> getSteps();

} // Process
