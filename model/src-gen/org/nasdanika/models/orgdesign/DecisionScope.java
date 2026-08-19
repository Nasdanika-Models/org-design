/**
 */
package org.nasdanika.models.orgdesign;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Decision Scope</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Strategic decisions concern direction; tactical concern means; operational concern execution.
 * <!-- end-model-doc -->
 * @see org.nasdanika.models.orgdesign.OrgdesignPackage#getDecisionScope()
 * @model
 * @generated
 */
public enum DecisionScope implements Enumerator {
	/**
	 * The '<em><b>Strategic</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRATEGIC_VALUE
	 * @generated
	 * @ordered
	 */
	STRATEGIC(0, "Strategic", "Strategic"),

	/**
	 * The '<em><b>Tactical</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TACTICAL_VALUE
	 * @generated
	 * @ordered
	 */
	TACTICAL(0, "Tactical", "Tactical"),

	/**
	 * The '<em><b>Operational</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPERATIONAL_VALUE
	 * @generated
	 * @ordered
	 */
	OPERATIONAL(0, "Operational", "Operational");

	/**
	 * The '<em><b>Strategic</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRATEGIC
	 * @model name="Strategic"
	 * @generated
	 * @ordered
	 */
	public static final int STRATEGIC_VALUE = 0;

	/**
	 * The '<em><b>Tactical</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TACTICAL
	 * @model name="Tactical"
	 * @generated
	 * @ordered
	 */
	public static final int TACTICAL_VALUE = 0;

	/**
	 * The '<em><b>Operational</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPERATIONAL
	 * @model name="Operational"
	 * @generated
	 * @ordered
	 */
	public static final int OPERATIONAL_VALUE = 0;

	/**
	 * An array of all the '<em><b>Decision Scope</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DecisionScope[] VALUES_ARRAY =
		new DecisionScope[] {
			STRATEGIC,
			TACTICAL,
			OPERATIONAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Decision Scope</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DecisionScope> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Decision Scope</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DecisionScope get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DecisionScope result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Decision Scope</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DecisionScope getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DecisionScope result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Decision Scope</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DecisionScope get(int value) {
		switch (value) {
			case STRATEGIC_VALUE: return STRATEGIC;
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
	private DecisionScope(int value, String name, String literal) {
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
	
} //DecisionScope
