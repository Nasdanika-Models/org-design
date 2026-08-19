/**
 */
package org.nasdanika.models.orgdesign;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Decision Authority Level</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Levels of decision authority - closely related to RACI but more granular for governance modeling.
 * <!-- end-model-doc -->
 * @see org.nasdanika.models.orgdesign.OrgdesignPackage#getDecisionAuthorityLevel()
 * @model
 * @generated
 */
public enum DecisionAuthorityLevel implements Enumerator {
	/**
	 * The '<em><b>Decide</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DECIDE_VALUE
	 * @generated
	 * @ordered
	 */
	DECIDE(0, "Decide", "Decide"),

	/**
	 * The '<em><b>Recommend</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RECOMMEND_VALUE
	 * @generated
	 * @ordered
	 */
	RECOMMEND(0, "Recommend", "Recommend"),

	/**
	 * The '<em><b>Consult</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONSULT_VALUE
	 * @generated
	 * @ordered
	 */
	CONSULT(0, "Consult", "Consult"),

	/**
	 * The '<em><b>Inform</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INFORM_VALUE
	 * @generated
	 * @ordered
	 */
	INFORM(0, "Inform", "Inform"),

	/**
	 * The '<em><b>Veto</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VETO_VALUE
	 * @generated
	 * @ordered
	 */
	VETO(0, "Veto", "Veto");

	/**
	 * The '<em><b>Decide</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DECIDE
	 * @model name="Decide"
	 * @generated
	 * @ordered
	 */
	public static final int DECIDE_VALUE = 0;

	/**
	 * The '<em><b>Recommend</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RECOMMEND
	 * @model name="Recommend"
	 * @generated
	 * @ordered
	 */
	public static final int RECOMMEND_VALUE = 0;

	/**
	 * The '<em><b>Consult</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONSULT
	 * @model name="Consult"
	 * @generated
	 * @ordered
	 */
	public static final int CONSULT_VALUE = 0;

	/**
	 * The '<em><b>Inform</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INFORM
	 * @model name="Inform"
	 * @generated
	 * @ordered
	 */
	public static final int INFORM_VALUE = 0;

	/**
	 * The '<em><b>Veto</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VETO
	 * @model name="Veto"
	 * @generated
	 * @ordered
	 */
	public static final int VETO_VALUE = 0;

	/**
	 * An array of all the '<em><b>Decision Authority Level</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DecisionAuthorityLevel[] VALUES_ARRAY =
		new DecisionAuthorityLevel[] {
			DECIDE,
			RECOMMEND,
			CONSULT,
			INFORM,
			VETO,
		};

	/**
	 * A public read-only list of all the '<em><b>Decision Authority Level</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DecisionAuthorityLevel> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Decision Authority Level</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DecisionAuthorityLevel get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DecisionAuthorityLevel result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Decision Authority Level</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DecisionAuthorityLevel getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DecisionAuthorityLevel result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Decision Authority Level</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DecisionAuthorityLevel get(int value) {
		switch (value) {
			case DECIDE_VALUE: return DECIDE;
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
	private DecisionAuthorityLevel(int value, String name, String literal) {
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
	
} //DecisionAuthorityLevel
