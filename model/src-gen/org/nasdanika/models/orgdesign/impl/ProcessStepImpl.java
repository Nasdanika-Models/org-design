/**
 */
package org.nasdanika.models.orgdesign.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.nxcore.impl.NamedElementImpl;

import org.nasdanika.models.orgdesign.OrgdesignPackage;
import org.nasdanika.models.orgdesign.ProcessStep;
import org.nasdanika.models.orgdesign.Role;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.orgdesign.impl.ProcessStepImpl#getResponsible <em>Responsible</em>}</li>
 *   <li>{@link org.nasdanika.models.orgdesign.impl.ProcessStepImpl#getPerformers <em>Performers</em>}</li>
 *   <li>{@link org.nasdanika.models.orgdesign.impl.ProcessStepImpl#getConsulted <em>Consulted</em>}</li>
 *   <li>{@link org.nasdanika.models.orgdesign.impl.ProcessStepImpl#getInformed <em>Informed</em>}</li>
 *   <li>{@link org.nasdanika.models.orgdesign.impl.ProcessStepImpl#getPredecessors <em>Predecessors</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcessStepImpl extends NamedElementImpl implements ProcessStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessStepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrgdesignPackage.Literals.PROCESS_STEP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Role getResponsible() {
		return (Role)eDynamicGet(OrgdesignPackage.PROCESS_STEP__RESPONSIBLE, OrgdesignPackage.Literals.PROCESS_STEP__RESPONSIBLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role basicGetResponsible() {
		return (Role)eDynamicGet(OrgdesignPackage.PROCESS_STEP__RESPONSIBLE, OrgdesignPackage.Literals.PROCESS_STEP__RESPONSIBLE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResponsible(Role newResponsible) {
		eDynamicSet(OrgdesignPackage.PROCESS_STEP__RESPONSIBLE, OrgdesignPackage.Literals.PROCESS_STEP__RESPONSIBLE, newResponsible);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Role> getPerformers() {
		return (EList<Role>)eDynamicGet(OrgdesignPackage.PROCESS_STEP__PERFORMERS, OrgdesignPackage.Literals.PROCESS_STEP__PERFORMERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Role> getConsulted() {
		return (EList<Role>)eDynamicGet(OrgdesignPackage.PROCESS_STEP__CONSULTED, OrgdesignPackage.Literals.PROCESS_STEP__CONSULTED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Role> getInformed() {
		return (EList<Role>)eDynamicGet(OrgdesignPackage.PROCESS_STEP__INFORMED, OrgdesignPackage.Literals.PROCESS_STEP__INFORMED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ProcessStep> getPredecessors() {
		return (EList<ProcessStep>)eDynamicGet(OrgdesignPackage.PROCESS_STEP__PREDECESSORS, OrgdesignPackage.Literals.PROCESS_STEP__PREDECESSORS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OrgdesignPackage.PROCESS_STEP__RESPONSIBLE:
				if (resolve) return getResponsible();
				return basicGetResponsible();
			case OrgdesignPackage.PROCESS_STEP__PERFORMERS:
				return getPerformers();
			case OrgdesignPackage.PROCESS_STEP__CONSULTED:
				return getConsulted();
			case OrgdesignPackage.PROCESS_STEP__INFORMED:
				return getInformed();
			case OrgdesignPackage.PROCESS_STEP__PREDECESSORS:
				return getPredecessors();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OrgdesignPackage.PROCESS_STEP__RESPONSIBLE:
				setResponsible((Role)newValue);
				return;
			case OrgdesignPackage.PROCESS_STEP__PERFORMERS:
				getPerformers().clear();
				getPerformers().addAll((Collection<? extends Role>)newValue);
				return;
			case OrgdesignPackage.PROCESS_STEP__CONSULTED:
				getConsulted().clear();
				getConsulted().addAll((Collection<? extends Role>)newValue);
				return;
			case OrgdesignPackage.PROCESS_STEP__INFORMED:
				getInformed().clear();
				getInformed().addAll((Collection<? extends Role>)newValue);
				return;
			case OrgdesignPackage.PROCESS_STEP__PREDECESSORS:
				getPredecessors().clear();
				getPredecessors().addAll((Collection<? extends ProcessStep>)newValue);
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
			case OrgdesignPackage.PROCESS_STEP__RESPONSIBLE:
				setResponsible((Role)null);
				return;
			case OrgdesignPackage.PROCESS_STEP__PERFORMERS:
				getPerformers().clear();
				return;
			case OrgdesignPackage.PROCESS_STEP__CONSULTED:
				getConsulted().clear();
				return;
			case OrgdesignPackage.PROCESS_STEP__INFORMED:
				getInformed().clear();
				return;
			case OrgdesignPackage.PROCESS_STEP__PREDECESSORS:
				getPredecessors().clear();
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
			case OrgdesignPackage.PROCESS_STEP__RESPONSIBLE:
				return basicGetResponsible() != null;
			case OrgdesignPackage.PROCESS_STEP__PERFORMERS:
				return !getPerformers().isEmpty();
			case OrgdesignPackage.PROCESS_STEP__CONSULTED:
				return !getConsulted().isEmpty();
			case OrgdesignPackage.PROCESS_STEP__INFORMED:
				return !getInformed().isEmpty();
			case OrgdesignPackage.PROCESS_STEP__PREDECESSORS:
				return !getPredecessors().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProcessStepImpl
