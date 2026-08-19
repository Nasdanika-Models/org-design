/**
 */
package org.nasdanika.models.orgdesign;

import org.nasdanika.models.nxcore.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Environment Factor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An external factor that shapes design choices. Environmental complexity and uncertainty are major contingency factors in classic organizational design literature.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.orgdesign.EnvironmentFactor#getDimension <em>Dimension</em>}</li>
 *   <li>{@link org.nasdanika.models.orgdesign.EnvironmentFactor#getUncertainty <em>Uncertainty</em>}</li>
 *   <li>{@link org.nasdanika.models.orgdesign.EnvironmentFactor#getComplexity <em>Complexity</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.orgdesign.OrgdesignPackage#getEnvironmentFactor()
 * @model
 * @generated
 */
public interface EnvironmentFactor extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Dimension</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.models.orgdesign.EnvironmentDimension}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Category of environment factor.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dimension</em>' attribute.
	 * @see org.nasdanika.models.orgdesign.EnvironmentDimension
	 * @see #setDimension(EnvironmentDimension)
	 * @see org.nasdanika.models.orgdesign.OrgdesignPackage#getEnvironmentFactor_Dimension()
	 * @model unique="false"
	 * @generated
	 */
	EnvironmentDimension getDimension();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.orgdesign.EnvironmentFactor#getDimension <em>Dimension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dimension</em>' attribute.
	 * @see org.nasdanika.models.orgdesign.EnvironmentDimension
	 * @see #getDimension()
	 * @generated
	 */
	void setDimension(EnvironmentDimension value);

	/**
	 * Returns the value of the '<em><b>Uncertainty</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.models.orgdesign.Uncertainty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Degree of unpredictability.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Uncertainty</em>' attribute.
	 * @see org.nasdanika.models.orgdesign.Uncertainty
	 * @see #setUncertainty(Uncertainty)
	 * @see org.nasdanika.models.orgdesign.OrgdesignPackage#getEnvironmentFactor_Uncertainty()
	 * @model unique="false"
	 * @generated
	 */
	Uncertainty getUncertainty();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.orgdesign.EnvironmentFactor#getUncertainty <em>Uncertainty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uncertainty</em>' attribute.
	 * @see org.nasdanika.models.orgdesign.Uncertainty
	 * @see #getUncertainty()
	 * @generated
	 */
	void setUncertainty(Uncertainty value);

	/**
	 * Returns the value of the '<em><b>Complexity</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.models.orgdesign.Complexity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Cynefin-inspired complexity classification.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Complexity</em>' attribute.
	 * @see org.nasdanika.models.orgdesign.Complexity
	 * @see #setComplexity(Complexity)
	 * @see org.nasdanika.models.orgdesign.OrgdesignPackage#getEnvironmentFactor_Complexity()
	 * @model unique="false"
	 * @generated
	 */
	Complexity getComplexity();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.orgdesign.EnvironmentFactor#getComplexity <em>Complexity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Complexity</em>' attribute.
	 * @see org.nasdanika.models.orgdesign.Complexity
	 * @see #getComplexity()
	 * @generated
	 */
	void setComplexity(Complexity value);

} // EnvironmentFactor
