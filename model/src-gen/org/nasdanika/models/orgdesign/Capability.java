/**
 */
package org.nasdanika.models.orgdesign;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Capability</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An organizational capability - something the organization claims to be able to do. Capabilities are the bridge between strategy (what we want), structure (who delivers it), and applications (what supports it). Designed to be cross-referenced from product management and application portfolio models.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.orgdesign.Capability#getMaturity <em>Maturity</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.orgdesign.OrgdesignPackage#getCapability()
 * @model
 * @generated
 */
public interface Capability extends org.nasdanika.models.capability.Capability {
	/**
	 * Returns the value of the '<em><b>Maturity</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.models.orgdesign.CapabilityMaturity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Maturity assessment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Maturity</em>' attribute.
	 * @see org.nasdanika.models.orgdesign.CapabilityMaturity
	 * @see #setMaturity(CapabilityMaturity)
	 * @see org.nasdanika.models.orgdesign.OrgdesignPackage#getCapability_Maturity()
	 * @model unique="false"
	 * @generated
	 */
	CapabilityMaturity getMaturity();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.orgdesign.Capability#getMaturity <em>Maturity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maturity</em>' attribute.
	 * @see org.nasdanika.models.orgdesign.CapabilityMaturity
	 * @see #getMaturity()
	 * @generated
	 */
	void setMaturity(CapabilityMaturity value);

} // Capability
