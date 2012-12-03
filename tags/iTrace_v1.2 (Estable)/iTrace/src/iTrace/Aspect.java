/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package iTrace;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Aspect</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see iTrace.ITracePackage#getAspect()
 * @model
 * @generated
 */
public enum Aspect implements Enumerator {
	/**
	 * The '<em><b>Unspecified</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNSPECIFIED_VALUE
	 * @generated
	 * @ordered
	 */
	UNSPECIFIED(0, "Unspecified", "Unspecified"), /**
	 * The '<em><b>Architecture</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARCHITECTURE_VALUE
	 * @generated
	 * @ordered
	 */
	ARCHITECTURE(1, "Architecture", "Architecture"),

	/**
	 * The '<em><b>Behaviour</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BEHAVIOUR_VALUE
	 * @generated
	 * @ordered
	 */
	BEHAVIOUR(2, "Behaviour", "Behaviour"),

	/**
	 * The '<em><b>Content</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTENT_VALUE
	 * @generated
	 * @ordered
	 */
	CONTENT(3, "Content", "Content"),

	/**
	 * The '<em><b>Interface</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERFACE_VALUE
	 * @generated
	 * @ordered
	 */
	INTERFACE(4, "Interface", "Interface"),

	/**
	 * The '<em><b>Quality</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QUALITY_VALUE
	 * @generated
	 * @ordered
	 */
	QUALITY(4, "Quality", "Quality"),

	/**
	 * The '<em><b>Semantics</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEMANTICS_VALUE
	 * @generated
	 * @ordered
	 */
	SEMANTICS(6, "Semantics", "Semantics");

	/**
	 * The '<em><b>Unspecified</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Unspecified</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNSPECIFIED
	 * @model name="Unspecified"
	 * @generated
	 * @ordered
	 */
	public static final int UNSPECIFIED_VALUE = 0;

	/**
	 * The '<em><b>Architecture</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Architecture</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ARCHITECTURE
	 * @model name="Architecture"
	 * @generated
	 * @ordered
	 */
	public static final int ARCHITECTURE_VALUE = 1;

	/**
	 * The '<em><b>Behaviour</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Behaviour</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BEHAVIOUR
	 * @model name="Behaviour"
	 * @generated
	 * @ordered
	 */
	public static final int BEHAVIOUR_VALUE = 2;

	/**
	 * The '<em><b>Content</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Content</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONTENT
	 * @model name="Content"
	 * @generated
	 * @ordered
	 */
	public static final int CONTENT_VALUE = 3;

	/**
	 * The '<em><b>Interface</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Interface</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INTERFACE
	 * @model name="Interface"
	 * @generated
	 * @ordered
	 */
	public static final int INTERFACE_VALUE = 4;

	/**
	 * The '<em><b>Quality</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Quality</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #QUALITY
	 * @model name="Quality"
	 * @generated
	 * @ordered
	 */
	public static final int QUALITY_VALUE = 4;

	/**
	 * The '<em><b>Semantics</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Semantics</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SEMANTICS
	 * @model name="Semantics"
	 * @generated
	 * @ordered
	 */
	public static final int SEMANTICS_VALUE = 6;

	/**
	 * An array of all the '<em><b>Aspect</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Aspect[] VALUES_ARRAY =
		new Aspect[] {
			UNSPECIFIED,
			ARCHITECTURE,
			BEHAVIOUR,
			CONTENT,
			INTERFACE,
			QUALITY,
			SEMANTICS,
		};
	
	
	/**
	 * A public read-only list of all the '<em><b>Aspect</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Aspect> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));
	
	/**
	 * Returns the '<em><b>Aspect</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Aspect get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Aspect result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Aspect</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Aspect getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Aspect result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Aspect</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Aspect get(int value) {
		switch (value) {
			case UNSPECIFIED_VALUE: return UNSPECIFIED;
			case ARCHITECTURE_VALUE: return ARCHITECTURE;
			case BEHAVIOUR_VALUE: return BEHAVIOUR;
			case CONTENT_VALUE: return CONTENT;
			case INTERFACE_VALUE: return INTERFACE;
			case SEMANTICS_VALUE: return SEMANTICS;
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
	private Aspect(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
	
} //Aspect
