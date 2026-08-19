/**
 */
package org.nasdanika.models.orgdesign;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Unit Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Common structural patterns for organizational units, drawn from the standard configurations literature.
 * <!-- end-model-doc -->
 * @see org.nasdanika.models.orgdesign.OrgdesignPackage#getUnitType()
 * @model
 * @generated
 */
public enum UnitType implements Enumerator {
	/**
	 * The '<em><b>Functional</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Organized around functional specialty - engineering, marketing, finance.
	 * <!-- end-model-doc -->
	 * @see #FUNCTIONAL_VALUE
	 * @generated
	 * @ordered
	 */
	FUNCTIONAL(0, "Functional", "Functional"),

	/**
	 * The '<em><b>Divisional</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Organized around output - product line, market segment, geography.
	 * <!-- end-model-doc -->
	 * @see #DIVISIONAL_VALUE
	 * @generated
	 * @ordered
	 */
	DIVISIONAL(0, "Divisional", "Divisional"),

	/**
	 * The '<em><b>Matrix</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Two reporting axes (e.g., function and product) intersect.
	 * <!-- end-model-doc -->
	 * @see #MATRIX_VALUE
	 * @generated
	 * @ordered
	 */
	MATRIX(0, "Matrix", "Matrix"),

	/**
	 * The '<em><b>Network</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Loose federation of relatively autonomous units coordinating through standards or mutual adjustment.
	 * <!-- end-model-doc -->
	 * @see #NETWORK_VALUE
	 * @generated
	 * @ordered
	 */
	NETWORK(0, "Network", "Network"),

	/**
	 * The '<em><b>Project</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Time-bound unit assembled around a specific deliverable.
	 * <!-- end-model-doc -->
	 * @see #PROJECT_VALUE
	 * @generated
	 * @ordered
	 */
	PROJECT(0, "Project", "Project"),

	/**
	 * The '<em><b>Team</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Small, persistent group with shared work.
	 * <!-- end-model-doc -->
	 * @see #TEAM_VALUE
	 * @generated
	 * @ordered
	 */
	TEAM(0, "Team", "Team"),

	/**
	 * The '<em><b>Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Other or hybrid pattern.
	 * <!-- end-model-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(0, "Other", "Other");

	/**
	 * The '<em><b>Functional</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Organized around functional specialty - engineering, marketing, finance.
	 * <!-- end-model-doc -->
	 * @see #FUNCTIONAL
	 * @model name="Functional"
	 * @generated
	 * @ordered
	 */
	public static final int FUNCTIONAL_VALUE = 0;

	/**
	 * The '<em><b>Divisional</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Organized around output - product line, market segment, geography.
	 * <!-- end-model-doc -->
	 * @see #DIVISIONAL
	 * @model name="Divisional"
	 * @generated
	 * @ordered
	 */
	public static final int DIVISIONAL_VALUE = 0;

	/**
	 * The '<em><b>Matrix</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Two reporting axes (e.g., function and product) intersect.
	 * <!-- end-model-doc -->
	 * @see #MATRIX
	 * @model name="Matrix"
	 * @generated
	 * @ordered
	 */
	public static final int MATRIX_VALUE = 0;

	/**
	 * The '<em><b>Network</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Loose federation of relatively autonomous units coordinating through standards or mutual adjustment.
	 * <!-- end-model-doc -->
	 * @see #NETWORK
	 * @model name="Network"
	 * @generated
	 * @ordered
	 */
	public static final int NETWORK_VALUE = 0;

	/**
	 * The '<em><b>Project</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Time-bound unit assembled around a specific deliverable.
	 * <!-- end-model-doc -->
	 * @see #PROJECT
	 * @model name="Project"
	 * @generated
	 * @ordered
	 */
	public static final int PROJECT_VALUE = 0;

	/**
	 * The '<em><b>Team</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Small, persistent group with shared work.
	 * <!-- end-model-doc -->
	 * @see #TEAM
	 * @model name="Team"
	 * @generated
	 * @ordered
	 */
	public static final int TEAM_VALUE = 0;

	/**
	 * The '<em><b>Other</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Other or hybrid pattern.
	 * <!-- end-model-doc -->
	 * @see #OTHER
	 * @model name="Other"
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_VALUE = 0;

	/**
	 * An array of all the '<em><b>Unit Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final UnitType[] VALUES_ARRAY =
		new UnitType[] {
			FUNCTIONAL,
			DIVISIONAL,
			MATRIX,
			NETWORK,
			PROJECT,
			TEAM,
			OTHER,
		};

	/**
	 * A public read-only list of all the '<em><b>Unit Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<UnitType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Unit Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static UnitType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			UnitType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Unit Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static UnitType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			UnitType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Unit Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static UnitType get(int value) {
		switch (value) {
			case FUNCTIONAL_VALUE: return FUNCTIONAL;
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
	private UnitType(int value, String name, String literal) {
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
	
} //UnitType
