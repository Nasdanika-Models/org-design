/**
 */
package org.nasdanika.models.orgdesign;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.models.nxcore.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coordination Mechanism</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A mechanism that coordinates work across units. The enumeration draws on Mintzberg's six basic coordination mechanisms - the elementary ways organizations achieve unity of effort.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.orgdesign.CoordinationMechanism#getType <em>Type</em>}</li>
 *   <li>{@link org.nasdanika.models.orgdesign.CoordinationMechanism#getLinkedUnits <em>Linked Units</em>}</li>
 *   <li>{@link org.nasdanika.models.orgdesign.CoordinationMechanism#getCadence <em>Cadence</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.orgdesign.OrgdesignPackage#getCoordinationMechanism()
 * @model
 * @generated
 */
public interface CoordinationMechanism extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.models.orgdesign.CoordinationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.nasdanika.models.orgdesign.CoordinationType
	 * @see #setType(CoordinationType)
	 * @see org.nasdanika.models.orgdesign.OrgdesignPackage#getCoordinationMechanism_Type()
	 * @model unique="false"
	 * @generated
	 */
	CoordinationType getType();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.orgdesign.CoordinationMechanism#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.nasdanika.models.orgdesign.CoordinationType
	 * @see #getType()
	 * @generated
	 */
	void setType(CoordinationType value);

	/**
	 * Returns the value of the '<em><b>Linked Units</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.orgdesign.OrganizationalUnit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Units this mechanism coordinates between.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Linked Units</em>' reference list.
	 * @see org.nasdanika.models.orgdesign.OrgdesignPackage#getCoordinationMechanism_LinkedUnits()
	 * @model
	 * @generated
	 */
	EList<OrganizationalUnit> getLinkedUnits();

	/**
	 * Returns the value of the '<em><b>Cadence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * How frequently this mechanism operates (e.g., 'daily standup', 'quarterly review', 'continuous').
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cadence</em>' attribute.
	 * @see #setCadence(String)
	 * @see org.nasdanika.models.orgdesign.OrgdesignPackage#getCoordinationMechanism_Cadence()
	 * @model unique="false"
	 * @generated
	 */
	String getCadence();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.orgdesign.CoordinationMechanism#getCadence <em>Cadence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cadence</em>' attribute.
	 * @see #getCadence()
	 * @generated
	 */
	void setCadence(String value);

} // CoordinationMechanism
