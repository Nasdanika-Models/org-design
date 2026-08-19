/**
 */
package org.nasdanika.models.orgdesign;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Coordination Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Coordination mechanisms enumerated in the standard literature. Real organizations typically combine several; the choice and balance among them is itself a design decision.
 * <!-- end-model-doc -->
 * @see org.nasdanika.models.orgdesign.OrgdesignPackage#getCoordinationType()
 * @model
 * @generated
 */
public enum CoordinationType implements Enumerator {
	/**
	 * The '<em><b>Direct Supervision</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Coordination via direct hierarchical instruction.
	 * <!-- end-model-doc -->
	 * @see #DIRECT_SUPERVISION_VALUE
	 * @generated
	 * @ordered
	 */
	DIRECT_SUPERVISION(0, "DirectSupervision", "DirectSupervision"),

	/**
	 * The '<em><b>Standardization Of Work</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Coordination by specifying how work is to be performed.
	 * <!-- end-model-doc -->
	 * @see #STANDARDIZATION_OF_WORK_VALUE
	 * @generated
	 * @ordered
	 */
	STANDARDIZATION_OF_WORK(0, "StandardizationOfWork", "StandardizationOfWork"),

	/**
	 * The '<em><b>Standardization Of Outputs</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Coordination by specifying expected outputs while leaving means to performers.
	 * <!-- end-model-doc -->
	 * @see #STANDARDIZATION_OF_OUTPUTS_VALUE
	 * @generated
	 * @ordered
	 */
	STANDARDIZATION_OF_OUTPUTS(0, "StandardizationOfOutputs", "StandardizationOfOutputs"),

	/**
	 * The '<em><b>Standardization Of Skills</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Coordination by training performers in shared methods.
	 * <!-- end-model-doc -->
	 * @see #STANDARDIZATION_OF_SKILLS_VALUE
	 * @generated
	 * @ordered
	 */
	STANDARDIZATION_OF_SKILLS(0, "StandardizationOfSkills", "StandardizationOfSkills"),

	/**
	 * The '<em><b>Standardization Of Norms</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Coordination by shared values, beliefs, and behavioral norms.
	 * <!-- end-model-doc -->
	 * @see #STANDARDIZATION_OF_NORMS_VALUE
	 * @generated
	 * @ordered
	 */
	STANDARDIZATION_OF_NORMS(0, "StandardizationOfNorms", "StandardizationOfNorms"),

	/**
	 * The '<em><b>Mutual Adjustment</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Coordination by informal communication between performers.
	 * <!-- end-model-doc -->
	 * @see #MUTUAL_ADJUSTMENT_VALUE
	 * @generated
	 * @ordered
	 */
	MUTUAL_ADJUSTMENT(0, "MutualAdjustment", "MutualAdjustment");

	/**
	 * The '<em><b>Direct Supervision</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Coordination via direct hierarchical instruction.
	 * <!-- end-model-doc -->
	 * @see #DIRECT_SUPERVISION
	 * @model name="DirectSupervision"
	 * @generated
	 * @ordered
	 */
	public static final int DIRECT_SUPERVISION_VALUE = 0;

	/**
	 * The '<em><b>Standardization Of Work</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Coordination by specifying how work is to be performed.
	 * <!-- end-model-doc -->
	 * @see #STANDARDIZATION_OF_WORK
	 * @model name="StandardizationOfWork"
	 * @generated
	 * @ordered
	 */
	public static final int STANDARDIZATION_OF_WORK_VALUE = 0;

	/**
	 * The '<em><b>Standardization Of Outputs</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Coordination by specifying expected outputs while leaving means to performers.
	 * <!-- end-model-doc -->
	 * @see #STANDARDIZATION_OF_OUTPUTS
	 * @model name="StandardizationOfOutputs"
	 * @generated
	 * @ordered
	 */
	public static final int STANDARDIZATION_OF_OUTPUTS_VALUE = 0;

	/**
	 * The '<em><b>Standardization Of Skills</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Coordination by training performers in shared methods.
	 * <!-- end-model-doc -->
	 * @see #STANDARDIZATION_OF_SKILLS
	 * @model name="StandardizationOfSkills"
	 * @generated
	 * @ordered
	 */
	public static final int STANDARDIZATION_OF_SKILLS_VALUE = 0;

	/**
	 * The '<em><b>Standardization Of Norms</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Coordination by shared values, beliefs, and behavioral norms.
	 * <!-- end-model-doc -->
	 * @see #STANDARDIZATION_OF_NORMS
	 * @model name="StandardizationOfNorms"
	 * @generated
	 * @ordered
	 */
	public static final int STANDARDIZATION_OF_NORMS_VALUE = 0;

	/**
	 * The '<em><b>Mutual Adjustment</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Coordination by informal communication between performers.
	 * <!-- end-model-doc -->
	 * @see #MUTUAL_ADJUSTMENT
	 * @model name="MutualAdjustment"
	 * @generated
	 * @ordered
	 */
	public static final int MUTUAL_ADJUSTMENT_VALUE = 0;

	/**
	 * An array of all the '<em><b>Coordination Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CoordinationType[] VALUES_ARRAY =
		new CoordinationType[] {
			DIRECT_SUPERVISION,
			STANDARDIZATION_OF_WORK,
			STANDARDIZATION_OF_OUTPUTS,
			STANDARDIZATION_OF_SKILLS,
			STANDARDIZATION_OF_NORMS,
			MUTUAL_ADJUSTMENT,
		};

	/**
	 * A public read-only list of all the '<em><b>Coordination Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CoordinationType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Coordination Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CoordinationType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CoordinationType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Coordination Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CoordinationType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CoordinationType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Coordination Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CoordinationType get(int value) {
		switch (value) {
			case DIRECT_SUPERVISION_VALUE: return DIRECT_SUPERVISION;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private CoordinationType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //CoordinationType
