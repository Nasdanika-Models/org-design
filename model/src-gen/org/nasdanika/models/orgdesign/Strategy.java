/**
 */
package org.nasdanika.models.orgdesign;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.models.nxcore.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Strategy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A strategic intent - a coherent set of goals responding to environment factors and requiring specific capabilities.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.orgdesign.Strategy#getGoals <em>Goals</em>}</li>
 *   <li>{@link org.nasdanika.models.orgdesign.Strategy#getRespondsTo <em>Responds To</em>}</li>
 *   <li>{@link org.nasdanika.models.orgdesign.Strategy#getRequiresCapabilities <em>Requires Capabilities</em>}</li>
 *   <li>{@link org.nasdanika.models.orgdesign.Strategy#getHorizon <em>Horizon</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.orgdesign.OrgdesignPackage#getStrategy()
 * @model
 * @generated
 */
public interface Strategy extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Goals</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.orgdesign.Goal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goals</em>' containment reference list.
	 * @see org.nasdanika.models.orgdesign.OrgdesignPackage#getStrategy_Goals()
	 * @model containment="true"
	 * @generated
	 */
	EList<Goal> getGoals();

	/**
	 * Returns the value of the '<em><b>Responds To</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.orgdesign.EnvironmentFactor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Environment factors this strategy responds to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Responds To</em>' reference list.
	 * @see org.nasdanika.models.orgdesign.OrgdesignPackage#getStrategy_RespondsTo()
	 * @model
	 * @generated
	 */
	EList<EnvironmentFactor> getRespondsTo();

	/**
	 * Returns the value of the '<em><b>Requires Capabilities</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.orgdesign.Capability}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Capabilities required to execute this strategy.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Requires Capabilities</em>' reference list.
	 * @see org.nasdanika.models.orgdesign.OrgdesignPackage#getStrategy_RequiresCapabilities()
	 * @model
	 * @generated
	 */
	EList<Capability> getRequiresCapabilities();

	/**
	 * Returns the value of the '<em><b>Horizon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Time horizon for this strategy (e.g., '12 months', '3 years').
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Horizon</em>' attribute.
	 * @see #setHorizon(String)
	 * @see org.nasdanika.models.orgdesign.OrgdesignPackage#getStrategy_Horizon()
	 * @model unique="false"
	 * @generated
	 */
	String getHorizon();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.orgdesign.Strategy#getHorizon <em>Horizon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Horizon</em>' attribute.
	 * @see #getHorizon()
	 * @generated
	 */
	void setHorizon(String value);

} // Strategy
