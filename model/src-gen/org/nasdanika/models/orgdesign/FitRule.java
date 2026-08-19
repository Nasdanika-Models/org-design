/**
 */
package org.nasdanika.models.orgdesign;

import org.nasdanika.models.nxcore.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fit Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A rule expressing expected fit between design dimensions. Fit rules support the central insight from contingency-based design literature: there is no universally optimal organization, only better and worse fits between context, strategy, and structure. Validation tooling can use these to surface misalignments.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.orgdesign.FitRule#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.nasdanika.models.orgdesign.FitRule#getExpectedOutcome <em>Expected Outcome</em>}</li>
 *   <li>{@link org.nasdanika.models.orgdesign.FitRule#getSeverity <em>Severity</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.orgdesign.OrgdesignPackage#getFitRule()
 * @model
 * @generated
 */
public interface FitRule extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Condition expression. Implementation-defined; could be OCL, Xtend, or plain prose for documentation purposes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Condition</em>' attribute.
	 * @see #setCondition(String)
	 * @see org.nasdanika.models.orgdesign.OrgdesignPackage#getFitRule_Condition()
	 * @model unique="false"
	 * @generated
	 */
	String getCondition();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.orgdesign.FitRule#getCondition <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' attribute.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(String value);

	/**
	 * Returns the value of the '<em><b>Expected Outcome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * What is expected when the condition holds.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Expected Outcome</em>' attribute.
	 * @see #setExpectedOutcome(String)
	 * @see org.nasdanika.models.orgdesign.OrgdesignPackage#getFitRule_ExpectedOutcome()
	 * @model unique="false"
	 * @generated
	 */
	String getExpectedOutcome();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.orgdesign.FitRule#getExpectedOutcome <em>Expected Outcome</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expected Outcome</em>' attribute.
	 * @see #getExpectedOutcome()
	 * @generated
	 */
	void setExpectedOutcome(String value);

	/**
	 * Returns the value of the '<em><b>Severity</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.models.orgdesign.FitSeverity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Severity</em>' attribute.
	 * @see org.nasdanika.models.orgdesign.FitSeverity
	 * @see #setSeverity(FitSeverity)
	 * @see org.nasdanika.models.orgdesign.OrgdesignPackage#getFitRule_Severity()
	 * @model unique="false"
	 * @generated
	 */
	FitSeverity getSeverity();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.orgdesign.FitRule#getSeverity <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Severity</em>' attribute.
	 * @see org.nasdanika.models.orgdesign.FitSeverity
	 * @see #getSeverity()
	 * @generated
	 */
	void setSeverity(FitSeverity value);

} // FitRule
