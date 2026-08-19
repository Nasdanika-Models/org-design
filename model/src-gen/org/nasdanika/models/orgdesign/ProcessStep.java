/**
 */
package org.nasdanika.models.orgdesign;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.models.nxcore.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A step within a process. Predecessor relationships define ordering; RACI-style assignments link steps to roles.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.orgdesign.ProcessStep#getResponsible <em>Responsible</em>}</li>
 *   <li>{@link org.nasdanika.models.orgdesign.ProcessStep#getPerformers <em>Performers</em>}</li>
 *   <li>{@link org.nasdanika.models.orgdesign.ProcessStep#getConsulted <em>Consulted</em>}</li>
 *   <li>{@link org.nasdanika.models.orgdesign.ProcessStep#getInformed <em>Informed</em>}</li>
 *   <li>{@link org.nasdanika.models.orgdesign.ProcessStep#getPredecessors <em>Predecessors</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.orgdesign.OrgdesignPackage#getProcessStep()
 * @model
 * @generated
 */
public interface ProcessStep extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Responsible</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Role accountable for the step's outcome.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Responsible</em>' reference.
	 * @see #setResponsible(Role)
	 * @see org.nasdanika.models.orgdesign.OrgdesignPackage#getProcessStep_Responsible()
	 * @model
	 * @generated
	 */
	Role getResponsible();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.orgdesign.ProcessStep#getResponsible <em>Responsible</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Responsible</em>' reference.
	 * @see #getResponsible()
	 * @generated
	 */
	void setResponsible(Role value);

	/**
	 * Returns the value of the '<em><b>Performers</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.orgdesign.Role}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Roles that perform the work.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Performers</em>' reference list.
	 * @see org.nasdanika.models.orgdesign.OrgdesignPackage#getProcessStep_Performers()
	 * @model
	 * @generated
	 */
	EList<Role> getPerformers();

	/**
	 * Returns the value of the '<em><b>Consulted</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.orgdesign.Role}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Roles consulted before or during the step.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Consulted</em>' reference list.
	 * @see org.nasdanika.models.orgdesign.OrgdesignPackage#getProcessStep_Consulted()
	 * @model
	 * @generated
	 */
	EList<Role> getConsulted();

	/**
	 * Returns the value of the '<em><b>Informed</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.orgdesign.Role}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Roles informed about the outcome.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Informed</em>' reference list.
	 * @see org.nasdanika.models.orgdesign.OrgdesignPackage#getProcessStep_Informed()
	 * @model
	 * @generated
	 */
	EList<Role> getInformed();

	/**
	 * Returns the value of the '<em><b>Predecessors</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.orgdesign.ProcessStep}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Steps that must complete before this one starts.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Predecessors</em>' reference list.
	 * @see org.nasdanika.models.orgdesign.OrgdesignPackage#getProcessStep_Predecessors()
	 * @model
	 * @generated
	 */
	EList<ProcessStep> getPredecessors();

} // ProcessStep
