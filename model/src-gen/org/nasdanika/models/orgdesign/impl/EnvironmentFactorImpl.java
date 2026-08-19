/**
 */
package org.nasdanika.models.orgdesign.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.nxcore.impl.NamedElementImpl;

import org.nasdanika.models.orgdesign.Complexity;
import org.nasdanika.models.orgdesign.EnvironmentDimension;
import org.nasdanika.models.orgdesign.EnvironmentFactor;
import org.nasdanika.models.orgdesign.OrgdesignPackage;
import org.nasdanika.models.orgdesign.Uncertainty;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Environment Factor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.orgdesign.impl.EnvironmentFactorImpl#getDimension <em>Dimension</em>}</li>
 *   <li>{@link org.nasdanika.models.orgdesign.impl.EnvironmentFactorImpl#getUncertainty <em>Uncertainty</em>}</li>
 *   <li>{@link org.nasdanika.models.orgdesign.impl.EnvironmentFactorImpl#getComplexity <em>Complexity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnvironmentFactorImpl extends NamedElementImpl implements EnvironmentFactor {
	/**
	 * The default value of the '{@link #getDimension() <em>Dimension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDimension()
	 * @generated
	 * @ordered
	 */
	protected static final EnvironmentDimension DIMENSION_EDEFAULT = EnvironmentDimension.MARKET;

	/**
	 * The default value of the '{@link #getUncertainty() <em>Uncertainty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUncertainty()
	 * @generated
	 * @ordered
	 */
	protected static final Uncertainty UNCERTAINTY_EDEFAULT = Uncertainty.LOW;

	/**
	 * The default value of the '{@link #getComplexity() <em>Complexity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplexity()
	 * @generated
	 * @ordered
	 */
	protected static final Complexity COMPLEXITY_EDEFAULT = Complexity.SIMPLE;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnvironmentFactorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrgdesignPackage.Literals.ENVIRONMENT_FACTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnvironmentDimension getDimension() {
		return (EnvironmentDimension)eDynamicGet(OrgdesignPackage.ENVIRONMENT_FACTOR__DIMENSION, OrgdesignPackage.Literals.ENVIRONMENT_FACTOR__DIMENSION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDimension(EnvironmentDimension newDimension) {
		eDynamicSet(OrgdesignPackage.ENVIRONMENT_FACTOR__DIMENSION, OrgdesignPackage.Literals.ENVIRONMENT_FACTOR__DIMENSION, newDimension);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uncertainty getUncertainty() {
		return (Uncertainty)eDynamicGet(OrgdesignPackage.ENVIRONMENT_FACTOR__UNCERTAINTY, OrgdesignPackage.Literals.ENVIRONMENT_FACTOR__UNCERTAINTY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUncertainty(Uncertainty newUncertainty) {
		eDynamicSet(OrgdesignPackage.ENVIRONMENT_FACTOR__UNCERTAINTY, OrgdesignPackage.Literals.ENVIRONMENT_FACTOR__UNCERTAINTY, newUncertainty);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Complexity getComplexity() {
		return (Complexity)eDynamicGet(OrgdesignPackage.ENVIRONMENT_FACTOR__COMPLEXITY, OrgdesignPackage.Literals.ENVIRONMENT_FACTOR__COMPLEXITY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComplexity(Complexity newComplexity) {
		eDynamicSet(OrgdesignPackage.ENVIRONMENT_FACTOR__COMPLEXITY, OrgdesignPackage.Literals.ENVIRONMENT_FACTOR__COMPLEXITY, newComplexity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OrgdesignPackage.ENVIRONMENT_FACTOR__DIMENSION:
				return getDimension();
			case OrgdesignPackage.ENVIRONMENT_FACTOR__UNCERTAINTY:
				return getUncertainty();
			case OrgdesignPackage.ENVIRONMENT_FACTOR__COMPLEXITY:
				return getComplexity();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OrgdesignPackage.ENVIRONMENT_FACTOR__DIMENSION:
				setDimension((EnvironmentDimension)newValue);
				return;
			case OrgdesignPackage.ENVIRONMENT_FACTOR__UNCERTAINTY:
				setUncertainty((Uncertainty)newValue);
				return;
			case OrgdesignPackage.ENVIRONMENT_FACTOR__COMPLEXITY:
				setComplexity((Complexity)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case OrgdesignPackage.ENVIRONMENT_FACTOR__DIMENSION:
				setDimension(DIMENSION_EDEFAULT);
				return;
			case OrgdesignPackage.ENVIRONMENT_FACTOR__UNCERTAINTY:
				setUncertainty(UNCERTAINTY_EDEFAULT);
				return;
			case OrgdesignPackage.ENVIRONMENT_FACTOR__COMPLEXITY:
				setComplexity(COMPLEXITY_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case OrgdesignPackage.ENVIRONMENT_FACTOR__DIMENSION:
				return getDimension() != DIMENSION_EDEFAULT;
			case OrgdesignPackage.ENVIRONMENT_FACTOR__UNCERTAINTY:
				return getUncertainty() != UNCERTAINTY_EDEFAULT;
			case OrgdesignPackage.ENVIRONMENT_FACTOR__COMPLEXITY:
				return getComplexity() != COMPLEXITY_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //EnvironmentFactorImpl
