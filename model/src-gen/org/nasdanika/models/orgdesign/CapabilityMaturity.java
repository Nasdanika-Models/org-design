/**
 */
package org.nasdanika.models.orgdesign;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Capability Maturity</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Maturity levels for capabilities. Adapted from staged maturity models in widespread enterprise use.
 * <!-- end-model-doc -->
 * @see org.nasdanika.models.orgdesign.OrgdesignPackage#getCapabilityMaturity()
 * @model
 * @generated
 */
public enum CapabilityMaturity implements Enumerator {
	/**
	 * The '<em><b>Initial</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INITIAL_VALUE
	 * @generated
	 * @ordered
	 */
	INITIAL(0, "Initial", "Initial"),

	/**
	 * The '<em><b>Repeatable</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REPEATABLE_VALUE
	 * @generated
	 * @ordered
	 */
	REPEATABLE(0, "Repeatable", "Repeatable"),

	/**
	 * The '<em><b>Defined</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEFINED_VALUE
	 * @generated
	 * @ordered
	 */
	DEFINED(0, "Defined", "Defined"),

	/**
	 * The '<em><b>Managed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MANAGED_VALUE
	 * @generated
	 * @ordered
	 */
	MANAGED(0, "Managed", "Managed"),

	/**
	 * The '<em><b>Optimizing</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPTIMIZING_VALUE
	 * @generated
	 * @ordered
	 */
	OPTIMIZING(0, "Optimizing", "Optimizing");

	/**
	 * The '<em><b>Initial</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INITIAL
	 * @model name="Initial"
	 * @generated
	 * @ordered
	 */
	public static final int INITIAL_VALUE = 0;

	/**
	 * The '<em><b>Repeatable</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REPEATABLE
	 * @model name="Repeatable"
	 * @generated
	 * @ordered
	 */
	public static final int REPEATABLE_VALUE = 0;

	/**
	 * The '<em><b>Defined</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEFINED
	 * @model name="Defined"
	 * @generated
	 * @ordered
	 */
	public static final int DEFINED_VALUE = 0;

	/**
	 * The '<em><b>Managed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MANAGED
	 * @model name="Managed"
	 * @generated
	 * @ordered
	 */
	public static final int MANAGED_VALUE = 0;

	/**
	 * The '<em><b>Optimizing</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPTIMIZING
	 * @model name="Optimizing"
	 * @generated
	 * @ordered
	 */
	public static final int OPTIMIZING_VALUE = 0;

	/**
	 * An array of all the '<em><b>Capability Maturity</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CapabilityMaturity[] VALUES_ARRAY =
		new CapabilityMaturity[] {
			INITIAL,
			REPEATABLE,
			DEFINED,
			MANAGED,
			OPTIMIZING,
		};

	/**
	 * A public read-only list of all the '<em><b>Capability Maturity</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CapabilityMaturity> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Capability Maturity</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CapabilityMaturity get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CapabilityMaturity result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Capability Maturity</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CapabilityMaturity getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CapabilityMaturity result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Capability Maturity</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CapabilityMaturity get(int value) {
		switch (value) {
			case INITIAL_VALUE: return INITIAL;
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
	private CapabilityMaturity(int value, String name, String literal) {
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
	
} //CapabilityMaturity
