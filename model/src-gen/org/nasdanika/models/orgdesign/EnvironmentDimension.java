/**
 */
package org.nasdanika.models.orgdesign;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Environment Dimension</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Categories of environment factors.
 * <!-- end-model-doc -->
 * @see org.nasdanika.models.orgdesign.OrgdesignPackage#getEnvironmentDimension()
 * @model
 * @generated
 */
public enum EnvironmentDimension implements Enumerator {
	/**
	 * The '<em><b>Market</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MARKET_VALUE
	 * @generated
	 * @ordered
	 */
	MARKET(0, "Market", "Market"),

	/**
	 * The '<em><b>Regulatory</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REGULATORY_VALUE
	 * @generated
	 * @ordered
	 */
	REGULATORY(0, "Regulatory", "Regulatory"),

	/**
	 * The '<em><b>Technological</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TECHNOLOGICAL_VALUE
	 * @generated
	 * @ordered
	 */
	TECHNOLOGICAL(0, "Technological", "Technological"),

	/**
	 * The '<em><b>Competitive</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPETITIVE_VALUE
	 * @generated
	 * @ordered
	 */
	COMPETITIVE(0, "Competitive", "Competitive"),

	/**
	 * The '<em><b>Social</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOCIAL_VALUE
	 * @generated
	 * @ordered
	 */
	SOCIAL(0, "Social", "Social"),

	/**
	 * The '<em><b>Economic</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ECONOMIC_VALUE
	 * @generated
	 * @ordered
	 */
	ECONOMIC(0, "Economic", "Economic");

	/**
	 * The '<em><b>Market</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MARKET
	 * @model name="Market"
	 * @generated
	 * @ordered
	 */
	public static final int MARKET_VALUE = 0;

	/**
	 * The '<em><b>Regulatory</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REGULATORY
	 * @model name="Regulatory"
	 * @generated
	 * @ordered
	 */
	public static final int REGULATORY_VALUE = 0;

	/**
	 * The '<em><b>Technological</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TECHNOLOGICAL
	 * @model name="Technological"
	 * @generated
	 * @ordered
	 */
	public static final int TECHNOLOGICAL_VALUE = 0;

	/**
	 * The '<em><b>Competitive</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPETITIVE
	 * @model name="Competitive"
	 * @generated
	 * @ordered
	 */
	public static final int COMPETITIVE_VALUE = 0;

	/**
	 * The '<em><b>Social</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOCIAL
	 * @model name="Social"
	 * @generated
	 * @ordered
	 */
	public static final int SOCIAL_VALUE = 0;

	/**
	 * The '<em><b>Economic</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ECONOMIC
	 * @model name="Economic"
	 * @generated
	 * @ordered
	 */
	public static final int ECONOMIC_VALUE = 0;

	/**
	 * An array of all the '<em><b>Environment Dimension</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EnvironmentDimension[] VALUES_ARRAY =
		new EnvironmentDimension[] {
			MARKET,
			REGULATORY,
			TECHNOLOGICAL,
			COMPETITIVE,
			SOCIAL,
			ECONOMIC,
		};

	/**
	 * A public read-only list of all the '<em><b>Environment Dimension</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EnvironmentDimension> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Environment Dimension</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EnvironmentDimension get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EnvironmentDimension result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Environment Dimension</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EnvironmentDimension getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EnvironmentDimension result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Environment Dimension</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EnvironmentDimension get(int value) {
		switch (value) {
			case MARKET_VALUE: return MARKET;
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
	private EnvironmentDimension(int value, String name, String literal) {
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
	
} //EnvironmentDimension
