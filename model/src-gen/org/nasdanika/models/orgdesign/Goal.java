/**
 */
package org.nasdanika.models.orgdesign;

import org.nasdanika.models.nxcore.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Goal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A measurable objective within a strategy.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.orgdesign.Goal#getMetric <em>Metric</em>}</li>
 *   <li>{@link org.nasdanika.models.orgdesign.Goal#getTarget <em>Target</em>}</li>
 *   <li>{@link org.nasdanika.models.orgdesign.Goal#getHorizon <em>Horizon</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.orgdesign.OrgdesignPackage#getGoal()
 * @model
 * @generated
 */
public interface Goal extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Metric</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Metric used to measure progress (e.g., 'monthly active users', 'time to onboard a business banking client').
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Metric</em>' attribute.
	 * @see #setMetric(String)
	 * @see org.nasdanika.models.orgdesign.OrgdesignPackage#getGoal_Metric()
	 * @model unique="false"
	 * @generated
	 */
	String getMetric();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.orgdesign.Goal#getMetric <em>Metric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metric</em>' attribute.
	 * @see #getMetric()
	 * @generated
	 */
	void setMetric(String value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Target value or threshold.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target</em>' attribute.
	 * @see #setTarget(String)
	 * @see org.nasdanika.models.orgdesign.OrgdesignPackage#getGoal_Target()
	 * @model unique="false"
	 * @generated
	 */
	String getTarget();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.orgdesign.Goal#getTarget <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' attribute.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(String value);

	/**
	 * Returns the value of the '<em><b>Horizon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When the target should be achieved.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Horizon</em>' attribute.
	 * @see #setHorizon(String)
	 * @see org.nasdanika.models.orgdesign.OrgdesignPackage#getGoal_Horizon()
	 * @model unique="false"
	 * @generated
	 */
	String getHorizon();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.orgdesign.Goal#getHorizon <em>Horizon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Horizon</em>' attribute.
	 * @see #getHorizon()
	 * @generated
	 */
	void setHorizon(String value);

} // Goal
