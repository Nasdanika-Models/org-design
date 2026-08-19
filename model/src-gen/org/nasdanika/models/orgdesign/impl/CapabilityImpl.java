/**
 */
package org.nasdanika.models.orgdesign.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.orgdesign.Capability;
import org.nasdanika.models.orgdesign.CapabilityMaturity;
import org.nasdanika.models.orgdesign.OrgdesignPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Capability</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.orgdesign.impl.CapabilityImpl#getMaturity <em>Maturity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CapabilityImpl extends org.nasdanika.models.capability.impl.CapabilityImpl implements Capability {
	/**
	 * The default value of the '{@link #getMaturity() <em>Maturity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaturity()
	 * @generated
	 * @ordered
	 */
	protected static final CapabilityMaturity MATURITY_EDEFAULT = CapabilityMaturity.INITIAL;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CapabilityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrgdesignPackage.Literals.CAPABILITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CapabilityMaturity getMaturity() {
		return (CapabilityMaturity)eDynamicGet(OrgdesignPackage.CAPABILITY__MATURITY, OrgdesignPackage.Literals.CAPABILITY__MATURITY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaturity(CapabilityMaturity newMaturity) {
		eDynamicSet(OrgdesignPackage.CAPABILITY__MATURITY, OrgdesignPackage.Literals.CAPABILITY__MATURITY, newMaturity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OrgdesignPackage.CAPABILITY__MATURITY:
				return getMaturity();
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
			case OrgdesignPackage.CAPABILITY__MATURITY:
				setMaturity((CapabilityMaturity)newValue);
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
			case OrgdesignPackage.CAPABILITY__MATURITY:
				setMaturity(MATURITY_EDEFAULT);
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
			case OrgdesignPackage.CAPABILITY__MATURITY:
				return getMaturity() != MATURITY_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //CapabilityImpl
