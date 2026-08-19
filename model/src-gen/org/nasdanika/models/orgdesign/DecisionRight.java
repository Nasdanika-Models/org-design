/**
 */
package org.nasdanika.models.orgdesign;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.models.nxcore.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decision Right</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A decision right - authority to make a particular kind of decision over a particular scope.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.orgdesign.DecisionRight#getScope <em>Scope</em>}</li>
 *   <li>{@link org.nasdanika.models.orgdesign.DecisionRight#getApplicableUnits <em>Applicable Units</em>}</li>
 *   <li>{@link org.nasdanika.models.orgdesign.DecisionRight#getApplicableCapabilities <em>Applicable Capabilities</em>}</li>
 *   <li>{@link org.nasdanika.models.orgdesign.DecisionRight#getAuthorityLevel <em>Authority Level</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.orgdesign.OrgdesignPackage#getDecisionRight()
 * @model
 * @generated
 */
public interface DecisionRight extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Scope</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.models.orgdesign.DecisionScope}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scope</em>' attribute.
	 * @see org.nasdanika.models.orgdesign.DecisionScope
	 * @see #setScope(DecisionScope)
	 * @see org.nasdanika.models.orgdesign.OrgdesignPackage#getDecisionRight_Scope()
	 * @model unique="false"
	 * @generated
	 */
	DecisionScope getScope();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.orgdesign.DecisionRight#getScope <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope</em>' attribute.
	 * @see org.nasdanika.models.orgdesign.DecisionScope
	 * @see #getScope()
	 * @generated
	 */
	void setScope(DecisionScope value);

	/**
	 * Returns the value of the '<em><b>Applicable Units</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.orgdesign.OrganizationalUnit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Units within which this decision right applies.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Applicable Units</em>' reference list.
	 * @see org.nasdanika.models.orgdesign.OrgdesignPackage#getDecisionRight_ApplicableUnits()
	 * @model
	 * @generated
	 */
	EList<OrganizationalUnit> getApplicableUnits();

	/**
	 * Returns the value of the '<em><b>Applicable Capabilities</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.orgdesign.Capability}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Capabilities this decision right pertains to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Applicable Capabilities</em>' reference list.
	 * @see org.nasdanika.models.orgdesign.OrgdesignPackage#getDecisionRight_ApplicableCapabilities()
	 * @model
	 * @generated
	 */
	EList<Capability> getApplicableCapabilities();

	/**
	 * Returns the value of the '<em><b>Authority Level</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.models.orgdesign.DecisionAuthorityLevel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authority Level</em>' attribute.
	 * @see org.nasdanika.models.orgdesign.DecisionAuthorityLevel
	 * @see #setAuthorityLevel(DecisionAuthorityLevel)
	 * @see org.nasdanika.models.orgdesign.OrgdesignPackage#getDecisionRight_AuthorityLevel()
	 * @model unique="false"
	 * @generated
	 */
	DecisionAuthorityLevel getAuthorityLevel();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.orgdesign.DecisionRight#getAuthorityLevel <em>Authority Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authority Level</em>' attribute.
	 * @see org.nasdanika.models.orgdesign.DecisionAuthorityLevel
	 * @see #getAuthorityLevel()
	 * @generated
	 */
	void setAuthorityLevel(DecisionAuthorityLevel value);

} // DecisionRight
