/**
 */
package org.nasdanika.models.orgdesign;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.nasdanika.models.capability.CapabilityPackage;

import org.nasdanika.models.nxcore.NxcorePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.nasdanika.models.orgdesign.OrgdesignFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel featureDelegation='Dynamic' complianceLevel='21.0' suppressGenModelAnnotations='false' copyrightFields='false' operationReflection='true' importOrganizing='true' basePackage='org.nasdanika.models'"
 *        annotation="http://www.eclipse.org/emf/2011/Xcore Ecore='http://www.eclipse.org/emf/2002/Ecore' GenModel='http://www.eclipse.org/emf/2002/GenModel' Nasdanika='urn:org.nasdanika'"
 * @generated
 */
public interface OrgdesignPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "orgdesign";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://orgdesign.models.nasdanika.org";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.nasdanika.models.orgdesign";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OrgdesignPackage eINSTANCE = org.nasdanika.models.orgdesign.impl.OrgdesignPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.nasdanika.models.orgdesign.impl.OrganizationImpl <em>Organization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.orgdesign.impl.OrganizationImpl
	 * @see org.nasdanika.models.orgdesign.impl.OrgdesignPackageImpl#getOrganization()
	 * @generated
	 */
	int ORGANIZATION = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__ID = NxcorePackage.NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__DOCUMENTATION = NxcorePackage.NAMED_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__DOC_REF = NxcorePackage.NAMED_ELEMENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__DOC_FORMAT = NxcorePackage.NAMED_ELEMENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__DOC_CONTENTS = NxcorePackage.NAMED_ELEMENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__DOC_SECTIONS = NxcorePackage.NAMED_ELEMENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__MARKERS = NxcorePackage.NAMED_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__ICON = NxcorePackage.NAMED_ELEMENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__URIS = NxcorePackage.NAMED_ELEMENT__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__NAME = NxcorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Top Level Units</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__TOP_LEVEL_UNITS = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>People</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__PEOPLE = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Strategies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__STRATEGIES = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Environment Factors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__ENVIRONMENT_FACTORS = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__CAPABILITIES = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Processes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__PROCESSES = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Coordination Mechanisms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__COORDINATION_MECHANISMS = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Decision Rights</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__DECISION_RIGHTS = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Fit Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__FIT_RULES = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Organization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_FEATURE_COUNT = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION___COLLECT__OBJECT_EREFERENCE_ELIST = NxcorePackage.NAMED_ELEMENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION___GET_REFERRERS__EREFERENCE = NxcorePackage.NAMED_ELEMENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Organization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_OPERATION_COUNT = NxcorePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.orgdesign.impl.OrganizationalUnitImpl <em>Organizational Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.orgdesign.impl.OrganizationalUnitImpl
	 * @see org.nasdanika.models.orgdesign.impl.OrgdesignPackageImpl#getOrganizationalUnit()
	 * @generated
	 */
	int ORGANIZATIONAL_UNIT = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATIONAL_UNIT__ID = NxcorePackage.NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATIONAL_UNIT__DOCUMENTATION = NxcorePackage.NAMED_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATIONAL_UNIT__DOC_REF = NxcorePackage.NAMED_ELEMENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATIONAL_UNIT__DOC_FORMAT = NxcorePackage.NAMED_ELEMENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATIONAL_UNIT__DOC_CONTENTS = NxcorePackage.NAMED_ELEMENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATIONAL_UNIT__DOC_SECTIONS = NxcorePackage.NAMED_ELEMENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATIONAL_UNIT__MARKERS = NxcorePackage.NAMED_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATIONAL_UNIT__ICON = NxcorePackage.NAMED_ELEMENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATIONAL_UNIT__URIS = NxcorePackage.NAMED_ELEMENT__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATIONAL_UNIT__NAME = NxcorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Organization</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATIONAL_UNIT__ORGANIZATION = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATIONAL_UNIT__PARENT = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sub Units</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATIONAL_UNIT__SUB_UNITS = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATIONAL_UNIT__ROLES = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Delivered Capabilities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATIONAL_UNIT__DELIVERED_CAPABILITIES = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Unit Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATIONAL_UNIT__UNIT_TYPE = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Organizational Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATIONAL_UNIT_FEATURE_COUNT = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATIONAL_UNIT___COLLECT__OBJECT_EREFERENCE_ELIST = NxcorePackage.NAMED_ELEMENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATIONAL_UNIT___GET_REFERRERS__EREFERENCE = NxcorePackage.NAMED_ELEMENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Organizational Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATIONAL_UNIT_OPERATION_COUNT = NxcorePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.orgdesign.impl.RoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.orgdesign.impl.RoleImpl
	 * @see org.nasdanika.models.orgdesign.impl.OrgdesignPackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__ID = NxcorePackage.NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__DOCUMENTATION = NxcorePackage.NAMED_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__DOC_REF = NxcorePackage.NAMED_ELEMENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__DOC_FORMAT = NxcorePackage.NAMED_ELEMENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__DOC_CONTENTS = NxcorePackage.NAMED_ELEMENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__DOC_SECTIONS = NxcorePackage.NAMED_ELEMENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__MARKERS = NxcorePackage.NAMED_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__ICON = NxcorePackage.NAMED_ELEMENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__URIS = NxcorePackage.NAMED_ELEMENT__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__NAME = NxcorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__UNIT = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Current Holder</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__CURRENT_HOLDER = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Required Capabilities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__REQUIRED_CAPABILITIES = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Decision Rights</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__DECISION_RIGHTS = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Reports To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__REPORTS_TO = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Direct Reports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__DIRECT_REPORTS = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FEATURE_COUNT = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___COLLECT__OBJECT_EREFERENCE_ELIST = NxcorePackage.NAMED_ELEMENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___GET_REFERRERS__EREFERENCE = NxcorePackage.NAMED_ELEMENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_OPERATION_COUNT = NxcorePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.orgdesign.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.orgdesign.impl.PersonImpl
	 * @see org.nasdanika.models.orgdesign.impl.OrgdesignPackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__ID = NxcorePackage.NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__DOCUMENTATION = NxcorePackage.NAMED_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__DOC_REF = NxcorePackage.NAMED_ELEMENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__DOC_FORMAT = NxcorePackage.NAMED_ELEMENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__DOC_CONTENTS = NxcorePackage.NAMED_ELEMENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__DOC_SECTIONS = NxcorePackage.NAMED_ELEMENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__MARKERS = NxcorePackage.NAMED_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__ICON = NxcorePackage.NAMED_ELEMENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__URIS = NxcorePackage.NAMED_ELEMENT__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__NAME = NxcorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__EMAIL = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Capabilities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__CAPABILITIES = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Current Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__CURRENT_ROLES = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___COLLECT__OBJECT_EREFERENCE_ELIST = NxcorePackage.NAMED_ELEMENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___GET_REFERRERS__EREFERENCE = NxcorePackage.NAMED_ELEMENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_OPERATION_COUNT = NxcorePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.orgdesign.impl.CapabilityImpl <em>Capability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.orgdesign.impl.CapabilityImpl
	 * @see org.nasdanika.models.orgdesign.impl.OrgdesignPackageImpl#getCapability()
	 * @generated
	 */
	int CAPABILITY = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__ID = CapabilityPackage.CAPABILITY__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__DOCUMENTATION = CapabilityPackage.CAPABILITY__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__DOC_REF = CapabilityPackage.CAPABILITY__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__DOC_FORMAT = CapabilityPackage.CAPABILITY__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__DOC_CONTENTS = CapabilityPackage.CAPABILITY__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__DOC_SECTIONS = CapabilityPackage.CAPABILITY__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__MARKERS = CapabilityPackage.CAPABILITY__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__ICON = CapabilityPackage.CAPABILITY__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__URIS = CapabilityPackage.CAPABILITY__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__NAME = CapabilityPackage.CAPABILITY__NAME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__DURATION = CapabilityPackage.CAPABILITY__DURATION;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__START = CapabilityPackage.CAPABILITY__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__END = CapabilityPackage.CAPABILITY__END;

	/**
	 * The feature id for the '<em><b>Evidence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__EVIDENCE = CapabilityPackage.CAPABILITY__EVIDENCE;

	/**
	 * The feature id for the '<em><b>Access Control</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__ACCESS_CONTROL = CapabilityPackage.CAPABILITY__ACCESS_CONTROL;

	/**
	 * The feature id for the '<em><b>Encrypted Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__ENCRYPTED_FEATURES = CapabilityPackage.CAPABILITY__ENCRYPTED_FEATURES;

	/**
	 * The feature id for the '<em><b>Variant Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__VARIANT_FEATURES = CapabilityPackage.CAPABILITY__VARIANT_FEATURES;

	/**
	 * The feature id for the '<em><b>Signatures</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__SIGNATURES = CapabilityPackage.CAPABILITY__SIGNATURES;

	/**
	 * The feature id for the '<em><b>Lifecycles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__LIFECYCLES = CapabilityPackage.CAPABILITY__LIFECYCLES;

	/**
	 * The feature id for the '<em><b>Sojourns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__SOJOURNS = CapabilityPackage.CAPABILITY__SOJOURNS;

	/**
	 * The feature id for the '<em><b>Current</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__CURRENT = CapabilityPackage.CAPABILITY__CURRENT;

	/**
	 * The feature id for the '<em><b>Dependencies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__DEPENDENCIES = CapabilityPackage.CAPABILITY__DEPENDENCIES;

	/**
	 * The feature id for the '<em><b>Dependents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__DEPENDENTS = CapabilityPackage.CAPABILITY__DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Maturity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__MATURITY = CapabilityPackage.CAPABILITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_FEATURE_COUNT = CapabilityPackage.CAPABILITY_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY___COLLECT__OBJECT_EREFERENCE_ELIST = CapabilityPackage.CAPABILITY___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY___GET_REFERRERS__EREFERENCE = CapabilityPackage.CAPABILITY___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_OPERATION_COUNT = CapabilityPackage.CAPABILITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.orgdesign.impl.StrategyImpl <em>Strategy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.orgdesign.impl.StrategyImpl
	 * @see org.nasdanika.models.orgdesign.impl.OrgdesignPackageImpl#getStrategy()
	 * @generated
	 */
	int STRATEGY = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__ID = NxcorePackage.NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__DOCUMENTATION = NxcorePackage.NAMED_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__DOC_REF = NxcorePackage.NAMED_ELEMENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__DOC_FORMAT = NxcorePackage.NAMED_ELEMENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__DOC_CONTENTS = NxcorePackage.NAMED_ELEMENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__DOC_SECTIONS = NxcorePackage.NAMED_ELEMENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__MARKERS = NxcorePackage.NAMED_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__ICON = NxcorePackage.NAMED_ELEMENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__URIS = NxcorePackage.NAMED_ELEMENT__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__NAME = NxcorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Goals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__GOALS = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Responds To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__RESPONDS_TO = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Requires Capabilities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__REQUIRES_CAPABILITIES = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Horizon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__HORIZON = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY_FEATURE_COUNT = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY___COLLECT__OBJECT_EREFERENCE_ELIST = NxcorePackage.NAMED_ELEMENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY___GET_REFERRERS__EREFERENCE = NxcorePackage.NAMED_ELEMENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY_OPERATION_COUNT = NxcorePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.orgdesign.impl.GoalImpl <em>Goal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.orgdesign.impl.GoalImpl
	 * @see org.nasdanika.models.orgdesign.impl.OrgdesignPackageImpl#getGoal()
	 * @generated
	 */
	int GOAL = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__ID = NxcorePackage.NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__DOCUMENTATION = NxcorePackage.NAMED_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__DOC_REF = NxcorePackage.NAMED_ELEMENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__DOC_FORMAT = NxcorePackage.NAMED_ELEMENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__DOC_CONTENTS = NxcorePackage.NAMED_ELEMENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__DOC_SECTIONS = NxcorePackage.NAMED_ELEMENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__MARKERS = NxcorePackage.NAMED_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__ICON = NxcorePackage.NAMED_ELEMENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__URIS = NxcorePackage.NAMED_ELEMENT__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__NAME = NxcorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__METRIC = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__TARGET = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Horizon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__HORIZON = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_FEATURE_COUNT = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL___COLLECT__OBJECT_EREFERENCE_ELIST = NxcorePackage.NAMED_ELEMENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL___GET_REFERRERS__EREFERENCE = NxcorePackage.NAMED_ELEMENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_OPERATION_COUNT = NxcorePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.orgdesign.impl.EnvironmentFactorImpl <em>Environment Factor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.orgdesign.impl.EnvironmentFactorImpl
	 * @see org.nasdanika.models.orgdesign.impl.OrgdesignPackageImpl#getEnvironmentFactor()
	 * @generated
	 */
	int ENVIRONMENT_FACTOR = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_FACTOR__ID = NxcorePackage.NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_FACTOR__DOCUMENTATION = NxcorePackage.NAMED_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_FACTOR__DOC_REF = NxcorePackage.NAMED_ELEMENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_FACTOR__DOC_FORMAT = NxcorePackage.NAMED_ELEMENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_FACTOR__DOC_CONTENTS = NxcorePackage.NAMED_ELEMENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_FACTOR__DOC_SECTIONS = NxcorePackage.NAMED_ELEMENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_FACTOR__MARKERS = NxcorePackage.NAMED_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_FACTOR__ICON = NxcorePackage.NAMED_ELEMENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_FACTOR__URIS = NxcorePackage.NAMED_ELEMENT__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_FACTOR__NAME = NxcorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_FACTOR__DIMENSION = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Uncertainty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_FACTOR__UNCERTAINTY = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Complexity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_FACTOR__COMPLEXITY = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Environment Factor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_FACTOR_FEATURE_COUNT = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_FACTOR___COLLECT__OBJECT_EREFERENCE_ELIST = NxcorePackage.NAMED_ELEMENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_FACTOR___GET_REFERRERS__EREFERENCE = NxcorePackage.NAMED_ELEMENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Environment Factor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_FACTOR_OPERATION_COUNT = NxcorePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.orgdesign.impl.ProcessImpl <em>Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.orgdesign.impl.ProcessImpl
	 * @see org.nasdanika.models.orgdesign.impl.OrgdesignPackageImpl#getProcess()
	 * @generated
	 */
	int PROCESS = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__ID = NxcorePackage.NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__DOCUMENTATION = NxcorePackage.NAMED_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__DOC_REF = NxcorePackage.NAMED_ELEMENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__DOC_FORMAT = NxcorePackage.NAMED_ELEMENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__DOC_CONTENTS = NxcorePackage.NAMED_ELEMENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__DOC_SECTIONS = NxcorePackage.NAMED_ELEMENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__MARKERS = NxcorePackage.NAMED_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__ICON = NxcorePackage.NAMED_ELEMENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__URIS = NxcorePackage.NAMED_ELEMENT__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__NAME = NxcorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Participating Units</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__PARTICIPATING_UNITS = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Enabled Capabilities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__ENABLED_CAPABILITIES = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__TYPE = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__STEPS = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_FEATURE_COUNT = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS___COLLECT__OBJECT_EREFERENCE_ELIST = NxcorePackage.NAMED_ELEMENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS___GET_REFERRERS__EREFERENCE = NxcorePackage.NAMED_ELEMENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_OPERATION_COUNT = NxcorePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.orgdesign.impl.ProcessStepImpl <em>Process Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.orgdesign.impl.ProcessStepImpl
	 * @see org.nasdanika.models.orgdesign.impl.OrgdesignPackageImpl#getProcessStep()
	 * @generated
	 */
	int PROCESS_STEP = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_STEP__ID = NxcorePackage.NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_STEP__DOCUMENTATION = NxcorePackage.NAMED_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_STEP__DOC_REF = NxcorePackage.NAMED_ELEMENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_STEP__DOC_FORMAT = NxcorePackage.NAMED_ELEMENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_STEP__DOC_CONTENTS = NxcorePackage.NAMED_ELEMENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_STEP__DOC_SECTIONS = NxcorePackage.NAMED_ELEMENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_STEP__MARKERS = NxcorePackage.NAMED_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_STEP__ICON = NxcorePackage.NAMED_ELEMENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_STEP__URIS = NxcorePackage.NAMED_ELEMENT__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_STEP__NAME = NxcorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Responsible</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_STEP__RESPONSIBLE = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Performers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_STEP__PERFORMERS = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Consulted</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_STEP__CONSULTED = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Informed</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_STEP__INFORMED = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Predecessors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_STEP__PREDECESSORS = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Process Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_STEP_FEATURE_COUNT = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_STEP___COLLECT__OBJECT_EREFERENCE_ELIST = NxcorePackage.NAMED_ELEMENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_STEP___GET_REFERRERS__EREFERENCE = NxcorePackage.NAMED_ELEMENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Process Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_STEP_OPERATION_COUNT = NxcorePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.orgdesign.impl.DecisionRightImpl <em>Decision Right</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.orgdesign.impl.DecisionRightImpl
	 * @see org.nasdanika.models.orgdesign.impl.OrgdesignPackageImpl#getDecisionRight()
	 * @generated
	 */
	int DECISION_RIGHT = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_RIGHT__ID = NxcorePackage.NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_RIGHT__DOCUMENTATION = NxcorePackage.NAMED_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_RIGHT__DOC_REF = NxcorePackage.NAMED_ELEMENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_RIGHT__DOC_FORMAT = NxcorePackage.NAMED_ELEMENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_RIGHT__DOC_CONTENTS = NxcorePackage.NAMED_ELEMENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_RIGHT__DOC_SECTIONS = NxcorePackage.NAMED_ELEMENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_RIGHT__MARKERS = NxcorePackage.NAMED_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_RIGHT__ICON = NxcorePackage.NAMED_ELEMENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_RIGHT__URIS = NxcorePackage.NAMED_ELEMENT__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_RIGHT__NAME = NxcorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_RIGHT__SCOPE = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Applicable Units</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_RIGHT__APPLICABLE_UNITS = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Applicable Capabilities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_RIGHT__APPLICABLE_CAPABILITIES = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Authority Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_RIGHT__AUTHORITY_LEVEL = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Decision Right</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_RIGHT_FEATURE_COUNT = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_RIGHT___COLLECT__OBJECT_EREFERENCE_ELIST = NxcorePackage.NAMED_ELEMENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_RIGHT___GET_REFERRERS__EREFERENCE = NxcorePackage.NAMED_ELEMENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Decision Right</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_RIGHT_OPERATION_COUNT = NxcorePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.orgdesign.impl.CoordinationMechanismImpl <em>Coordination Mechanism</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.orgdesign.impl.CoordinationMechanismImpl
	 * @see org.nasdanika.models.orgdesign.impl.OrgdesignPackageImpl#getCoordinationMechanism()
	 * @generated
	 */
	int COORDINATION_MECHANISM = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_MECHANISM__ID = NxcorePackage.NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_MECHANISM__DOCUMENTATION = NxcorePackage.NAMED_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_MECHANISM__DOC_REF = NxcorePackage.NAMED_ELEMENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_MECHANISM__DOC_FORMAT = NxcorePackage.NAMED_ELEMENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_MECHANISM__DOC_CONTENTS = NxcorePackage.NAMED_ELEMENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_MECHANISM__DOC_SECTIONS = NxcorePackage.NAMED_ELEMENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_MECHANISM__MARKERS = NxcorePackage.NAMED_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_MECHANISM__ICON = NxcorePackage.NAMED_ELEMENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_MECHANISM__URIS = NxcorePackage.NAMED_ELEMENT__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_MECHANISM__NAME = NxcorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_MECHANISM__TYPE = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Linked Units</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_MECHANISM__LINKED_UNITS = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cadence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_MECHANISM__CADENCE = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Coordination Mechanism</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_MECHANISM_FEATURE_COUNT = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_MECHANISM___COLLECT__OBJECT_EREFERENCE_ELIST = NxcorePackage.NAMED_ELEMENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_MECHANISM___GET_REFERRERS__EREFERENCE = NxcorePackage.NAMED_ELEMENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Coordination Mechanism</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_MECHANISM_OPERATION_COUNT = NxcorePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.orgdesign.impl.FitRuleImpl <em>Fit Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.orgdesign.impl.FitRuleImpl
	 * @see org.nasdanika.models.orgdesign.impl.OrgdesignPackageImpl#getFitRule()
	 * @generated
	 */
	int FIT_RULE = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIT_RULE__ID = NxcorePackage.NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIT_RULE__DOCUMENTATION = NxcorePackage.NAMED_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIT_RULE__DOC_REF = NxcorePackage.NAMED_ELEMENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIT_RULE__DOC_FORMAT = NxcorePackage.NAMED_ELEMENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIT_RULE__DOC_CONTENTS = NxcorePackage.NAMED_ELEMENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIT_RULE__DOC_SECTIONS = NxcorePackage.NAMED_ELEMENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIT_RULE__MARKERS = NxcorePackage.NAMED_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIT_RULE__ICON = NxcorePackage.NAMED_ELEMENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIT_RULE__URIS = NxcorePackage.NAMED_ELEMENT__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIT_RULE__NAME = NxcorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIT_RULE__CONDITION = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expected Outcome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIT_RULE__EXPECTED_OUTCOME = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIT_RULE__SEVERITY = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Fit Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIT_RULE_FEATURE_COUNT = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIT_RULE___COLLECT__OBJECT_EREFERENCE_ELIST = NxcorePackage.NAMED_ELEMENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIT_RULE___GET_REFERRERS__EREFERENCE = NxcorePackage.NAMED_ELEMENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Fit Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIT_RULE_OPERATION_COUNT = NxcorePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.orgdesign.UnitType <em>Unit Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.orgdesign.UnitType
	 * @see org.nasdanika.models.orgdesign.impl.OrgdesignPackageImpl#getUnitType()
	 * @generated
	 */
	int UNIT_TYPE = 13;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.orgdesign.CapabilityMaturity <em>Capability Maturity</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.orgdesign.CapabilityMaturity
	 * @see org.nasdanika.models.orgdesign.impl.OrgdesignPackageImpl#getCapabilityMaturity()
	 * @generated
	 */
	int CAPABILITY_MATURITY = 14;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.orgdesign.EnvironmentDimension <em>Environment Dimension</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.orgdesign.EnvironmentDimension
	 * @see org.nasdanika.models.orgdesign.impl.OrgdesignPackageImpl#getEnvironmentDimension()
	 * @generated
	 */
	int ENVIRONMENT_DIMENSION = 15;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.orgdesign.Uncertainty <em>Uncertainty</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.orgdesign.Uncertainty
	 * @see org.nasdanika.models.orgdesign.impl.OrgdesignPackageImpl#getUncertainty()
	 * @generated
	 */
	int UNCERTAINTY = 16;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.orgdesign.Complexity <em>Complexity</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.orgdesign.Complexity
	 * @see org.nasdanika.models.orgdesign.impl.OrgdesignPackageImpl#getComplexity()
	 * @generated
	 */
	int COMPLEXITY = 17;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.orgdesign.ProcessType <em>Process Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.orgdesign.ProcessType
	 * @see org.nasdanika.models.orgdesign.impl.OrgdesignPackageImpl#getProcessType()
	 * @generated
	 */
	int PROCESS_TYPE = 18;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.orgdesign.DecisionScope <em>Decision Scope</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.orgdesign.DecisionScope
	 * @see org.nasdanika.models.orgdesign.impl.OrgdesignPackageImpl#getDecisionScope()
	 * @generated
	 */
	int DECISION_SCOPE = 19;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.orgdesign.DecisionAuthorityLevel <em>Decision Authority Level</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.orgdesign.DecisionAuthorityLevel
	 * @see org.nasdanika.models.orgdesign.impl.OrgdesignPackageImpl#getDecisionAuthorityLevel()
	 * @generated
	 */
	int DECISION_AUTHORITY_LEVEL = 20;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.orgdesign.CoordinationType <em>Coordination Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.orgdesign.CoordinationType
	 * @see org.nasdanika.models.orgdesign.impl.OrgdesignPackageImpl#getCoordinationType()
	 * @generated
	 */
	int COORDINATION_TYPE = 21;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.orgdesign.FitSeverity <em>Fit Severity</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.orgdesign.FitSeverity
	 * @see org.nasdanika.models.orgdesign.impl.OrgdesignPackageImpl#getFitSeverity()
	 * @generated
	 */
	int FIT_SEVERITY = 22;


	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.orgdesign.Organization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Organization</em>'.
	 * @see org.nasdanika.models.orgdesign.Organization
	 * @generated
	 */
	EClass getOrganization();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.orgdesign.Organization#getTopLevelUnits <em>Top Level Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Top Level Units</em>'.
	 * @see org.nasdanika.models.orgdesign.Organization#getTopLevelUnits()
	 * @see #getOrganization()
	 * @generated
	 */
	EReference getOrganization_TopLevelUnits();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.orgdesign.Organization#getPeople <em>People</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>People</em>'.
	 * @see org.nasdanika.models.orgdesign.Organization#getPeople()
	 * @see #getOrganization()
	 * @generated
	 */
	EReference getOrganization_People();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.orgdesign.Organization#getStrategies <em>Strategies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Strategies</em>'.
	 * @see org.nasdanika.models.orgdesign.Organization#getStrategies()
	 * @see #getOrganization()
	 * @generated
	 */
	EReference getOrganization_Strategies();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.orgdesign.Organization#getEnvironmentFactors <em>Environment Factors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Environment Factors</em>'.
	 * @see org.nasdanika.models.orgdesign.Organization#getEnvironmentFactors()
	 * @see #getOrganization()
	 * @generated
	 */
	EReference getOrganization_EnvironmentFactors();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.orgdesign.Organization#getCapabilities <em>Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Capabilities</em>'.
	 * @see org.nasdanika.models.orgdesign.Organization#getCapabilities()
	 * @see #getOrganization()
	 * @generated
	 */
	EReference getOrganization_Capabilities();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.orgdesign.Organization#getProcesses <em>Processes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Processes</em>'.
	 * @see org.nasdanika.models.orgdesign.Organization#getProcesses()
	 * @see #getOrganization()
	 * @generated
	 */
	EReference getOrganization_Processes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.orgdesign.Organization#getCoordinationMechanisms <em>Coordination Mechanisms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Coordination Mechanisms</em>'.
	 * @see org.nasdanika.models.orgdesign.Organization#getCoordinationMechanisms()
	 * @see #getOrganization()
	 * @generated
	 */
	EReference getOrganization_CoordinationMechanisms();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.orgdesign.Organization#getDecisionRights <em>Decision Rights</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Decision Rights</em>'.
	 * @see org.nasdanika.models.orgdesign.Organization#getDecisionRights()
	 * @see #getOrganization()
	 * @generated
	 */
	EReference getOrganization_DecisionRights();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.orgdesign.Organization#getFitRules <em>Fit Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fit Rules</em>'.
	 * @see org.nasdanika.models.orgdesign.Organization#getFitRules()
	 * @see #getOrganization()
	 * @generated
	 */
	EReference getOrganization_FitRules();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.orgdesign.OrganizationalUnit <em>Organizational Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Organizational Unit</em>'.
	 * @see org.nasdanika.models.orgdesign.OrganizationalUnit
	 * @generated
	 */
	EClass getOrganizationalUnit();

	/**
	 * Returns the meta object for the container reference '{@link org.nasdanika.models.orgdesign.OrganizationalUnit#getOrganization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Organization</em>'.
	 * @see org.nasdanika.models.orgdesign.OrganizationalUnit#getOrganization()
	 * @see #getOrganizationalUnit()
	 * @generated
	 */
	EReference getOrganizationalUnit_Organization();

	/**
	 * Returns the meta object for the container reference '{@link org.nasdanika.models.orgdesign.OrganizationalUnit#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see org.nasdanika.models.orgdesign.OrganizationalUnit#getParent()
	 * @see #getOrganizationalUnit()
	 * @generated
	 */
	EReference getOrganizationalUnit_Parent();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.orgdesign.OrganizationalUnit#getSubUnits <em>Sub Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Units</em>'.
	 * @see org.nasdanika.models.orgdesign.OrganizationalUnit#getSubUnits()
	 * @see #getOrganizationalUnit()
	 * @generated
	 */
	EReference getOrganizationalUnit_SubUnits();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.orgdesign.OrganizationalUnit#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Roles</em>'.
	 * @see org.nasdanika.models.orgdesign.OrganizationalUnit#getRoles()
	 * @see #getOrganizationalUnit()
	 * @generated
	 */
	EReference getOrganizationalUnit_Roles();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.orgdesign.OrganizationalUnit#getDeliveredCapabilities <em>Delivered Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Delivered Capabilities</em>'.
	 * @see org.nasdanika.models.orgdesign.OrganizationalUnit#getDeliveredCapabilities()
	 * @see #getOrganizationalUnit()
	 * @generated
	 */
	EReference getOrganizationalUnit_DeliveredCapabilities();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.orgdesign.OrganizationalUnit#getUnitType <em>Unit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit Type</em>'.
	 * @see org.nasdanika.models.orgdesign.OrganizationalUnit#getUnitType()
	 * @see #getOrganizationalUnit()
	 * @generated
	 */
	EAttribute getOrganizationalUnit_UnitType();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.orgdesign.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see org.nasdanika.models.orgdesign.Role
	 * @generated
	 */
	EClass getRole();

	/**
	 * Returns the meta object for the container reference '{@link org.nasdanika.models.orgdesign.Role#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Unit</em>'.
	 * @see org.nasdanika.models.orgdesign.Role#getUnit()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_Unit();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.orgdesign.Role#getCurrentHolder <em>Current Holder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Current Holder</em>'.
	 * @see org.nasdanika.models.orgdesign.Role#getCurrentHolder()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_CurrentHolder();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.orgdesign.Role#getRequiredCapabilities <em>Required Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Required Capabilities</em>'.
	 * @see org.nasdanika.models.orgdesign.Role#getRequiredCapabilities()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_RequiredCapabilities();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.orgdesign.Role#getDecisionRights <em>Decision Rights</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Decision Rights</em>'.
	 * @see org.nasdanika.models.orgdesign.Role#getDecisionRights()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_DecisionRights();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.orgdesign.Role#getReportsTo <em>Reports To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reports To</em>'.
	 * @see org.nasdanika.models.orgdesign.Role#getReportsTo()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_ReportsTo();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.orgdesign.Role#getDirectReports <em>Direct Reports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Direct Reports</em>'.
	 * @see org.nasdanika.models.orgdesign.Role#getDirectReports()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_DirectReports();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.orgdesign.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see org.nasdanika.models.orgdesign.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.orgdesign.Person#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see org.nasdanika.models.orgdesign.Person#getEmail()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Email();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.orgdesign.Person#getCapabilities <em>Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Capabilities</em>'.
	 * @see org.nasdanika.models.orgdesign.Person#getCapabilities()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Capabilities();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.orgdesign.Person#getCurrentRoles <em>Current Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Current Roles</em>'.
	 * @see org.nasdanika.models.orgdesign.Person#getCurrentRoles()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_CurrentRoles();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.orgdesign.Capability <em>Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Capability</em>'.
	 * @see org.nasdanika.models.orgdesign.Capability
	 * @generated
	 */
	EClass getCapability();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.orgdesign.Capability#getMaturity <em>Maturity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maturity</em>'.
	 * @see org.nasdanika.models.orgdesign.Capability#getMaturity()
	 * @see #getCapability()
	 * @generated
	 */
	EAttribute getCapability_Maturity();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.orgdesign.Strategy <em>Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Strategy</em>'.
	 * @see org.nasdanika.models.orgdesign.Strategy
	 * @generated
	 */
	EClass getStrategy();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.orgdesign.Strategy#getGoals <em>Goals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Goals</em>'.
	 * @see org.nasdanika.models.orgdesign.Strategy#getGoals()
	 * @see #getStrategy()
	 * @generated
	 */
	EReference getStrategy_Goals();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.orgdesign.Strategy#getRespondsTo <em>Responds To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Responds To</em>'.
	 * @see org.nasdanika.models.orgdesign.Strategy#getRespondsTo()
	 * @see #getStrategy()
	 * @generated
	 */
	EReference getStrategy_RespondsTo();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.orgdesign.Strategy#getRequiresCapabilities <em>Requires Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Requires Capabilities</em>'.
	 * @see org.nasdanika.models.orgdesign.Strategy#getRequiresCapabilities()
	 * @see #getStrategy()
	 * @generated
	 */
	EReference getStrategy_RequiresCapabilities();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.orgdesign.Strategy#getHorizon <em>Horizon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Horizon</em>'.
	 * @see org.nasdanika.models.orgdesign.Strategy#getHorizon()
	 * @see #getStrategy()
	 * @generated
	 */
	EAttribute getStrategy_Horizon();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.orgdesign.Goal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Goal</em>'.
	 * @see org.nasdanika.models.orgdesign.Goal
	 * @generated
	 */
	EClass getGoal();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.orgdesign.Goal#getMetric <em>Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metric</em>'.
	 * @see org.nasdanika.models.orgdesign.Goal#getMetric()
	 * @see #getGoal()
	 * @generated
	 */
	EAttribute getGoal_Metric();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.orgdesign.Goal#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target</em>'.
	 * @see org.nasdanika.models.orgdesign.Goal#getTarget()
	 * @see #getGoal()
	 * @generated
	 */
	EAttribute getGoal_Target();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.orgdesign.Goal#getHorizon <em>Horizon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Horizon</em>'.
	 * @see org.nasdanika.models.orgdesign.Goal#getHorizon()
	 * @see #getGoal()
	 * @generated
	 */
	EAttribute getGoal_Horizon();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.orgdesign.EnvironmentFactor <em>Environment Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Environment Factor</em>'.
	 * @see org.nasdanika.models.orgdesign.EnvironmentFactor
	 * @generated
	 */
	EClass getEnvironmentFactor();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.orgdesign.EnvironmentFactor#getDimension <em>Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dimension</em>'.
	 * @see org.nasdanika.models.orgdesign.EnvironmentFactor#getDimension()
	 * @see #getEnvironmentFactor()
	 * @generated
	 */
	EAttribute getEnvironmentFactor_Dimension();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.orgdesign.EnvironmentFactor#getUncertainty <em>Uncertainty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uncertainty</em>'.
	 * @see org.nasdanika.models.orgdesign.EnvironmentFactor#getUncertainty()
	 * @see #getEnvironmentFactor()
	 * @generated
	 */
	EAttribute getEnvironmentFactor_Uncertainty();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.orgdesign.EnvironmentFactor#getComplexity <em>Complexity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Complexity</em>'.
	 * @see org.nasdanika.models.orgdesign.EnvironmentFactor#getComplexity()
	 * @see #getEnvironmentFactor()
	 * @generated
	 */
	EAttribute getEnvironmentFactor_Complexity();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.orgdesign.Process <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process</em>'.
	 * @see org.nasdanika.models.orgdesign.Process
	 * @generated
	 */
	EClass getProcess();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.orgdesign.Process#getParticipatingUnits <em>Participating Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Participating Units</em>'.
	 * @see org.nasdanika.models.orgdesign.Process#getParticipatingUnits()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_ParticipatingUnits();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.orgdesign.Process#getEnabledCapabilities <em>Enabled Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Enabled Capabilities</em>'.
	 * @see org.nasdanika.models.orgdesign.Process#getEnabledCapabilities()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_EnabledCapabilities();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.orgdesign.Process#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.nasdanika.models.orgdesign.Process#getType()
	 * @see #getProcess()
	 * @generated
	 */
	EAttribute getProcess_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.orgdesign.Process#getSteps <em>Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Steps</em>'.
	 * @see org.nasdanika.models.orgdesign.Process#getSteps()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_Steps();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.orgdesign.ProcessStep <em>Process Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process Step</em>'.
	 * @see org.nasdanika.models.orgdesign.ProcessStep
	 * @generated
	 */
	EClass getProcessStep();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.orgdesign.ProcessStep#getResponsible <em>Responsible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Responsible</em>'.
	 * @see org.nasdanika.models.orgdesign.ProcessStep#getResponsible()
	 * @see #getProcessStep()
	 * @generated
	 */
	EReference getProcessStep_Responsible();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.orgdesign.ProcessStep#getPerformers <em>Performers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Performers</em>'.
	 * @see org.nasdanika.models.orgdesign.ProcessStep#getPerformers()
	 * @see #getProcessStep()
	 * @generated
	 */
	EReference getProcessStep_Performers();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.orgdesign.ProcessStep#getConsulted <em>Consulted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Consulted</em>'.
	 * @see org.nasdanika.models.orgdesign.ProcessStep#getConsulted()
	 * @see #getProcessStep()
	 * @generated
	 */
	EReference getProcessStep_Consulted();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.orgdesign.ProcessStep#getInformed <em>Informed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Informed</em>'.
	 * @see org.nasdanika.models.orgdesign.ProcessStep#getInformed()
	 * @see #getProcessStep()
	 * @generated
	 */
	EReference getProcessStep_Informed();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.orgdesign.ProcessStep#getPredecessors <em>Predecessors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Predecessors</em>'.
	 * @see org.nasdanika.models.orgdesign.ProcessStep#getPredecessors()
	 * @see #getProcessStep()
	 * @generated
	 */
	EReference getProcessStep_Predecessors();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.orgdesign.DecisionRight <em>Decision Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decision Right</em>'.
	 * @see org.nasdanika.models.orgdesign.DecisionRight
	 * @generated
	 */
	EClass getDecisionRight();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.orgdesign.DecisionRight#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scope</em>'.
	 * @see org.nasdanika.models.orgdesign.DecisionRight#getScope()
	 * @see #getDecisionRight()
	 * @generated
	 */
	EAttribute getDecisionRight_Scope();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.orgdesign.DecisionRight#getApplicableUnits <em>Applicable Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Applicable Units</em>'.
	 * @see org.nasdanika.models.orgdesign.DecisionRight#getApplicableUnits()
	 * @see #getDecisionRight()
	 * @generated
	 */
	EReference getDecisionRight_ApplicableUnits();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.orgdesign.DecisionRight#getApplicableCapabilities <em>Applicable Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Applicable Capabilities</em>'.
	 * @see org.nasdanika.models.orgdesign.DecisionRight#getApplicableCapabilities()
	 * @see #getDecisionRight()
	 * @generated
	 */
	EReference getDecisionRight_ApplicableCapabilities();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.orgdesign.DecisionRight#getAuthorityLevel <em>Authority Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Authority Level</em>'.
	 * @see org.nasdanika.models.orgdesign.DecisionRight#getAuthorityLevel()
	 * @see #getDecisionRight()
	 * @generated
	 */
	EAttribute getDecisionRight_AuthorityLevel();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.orgdesign.CoordinationMechanism <em>Coordination Mechanism</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coordination Mechanism</em>'.
	 * @see org.nasdanika.models.orgdesign.CoordinationMechanism
	 * @generated
	 */
	EClass getCoordinationMechanism();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.orgdesign.CoordinationMechanism#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.nasdanika.models.orgdesign.CoordinationMechanism#getType()
	 * @see #getCoordinationMechanism()
	 * @generated
	 */
	EAttribute getCoordinationMechanism_Type();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.orgdesign.CoordinationMechanism#getLinkedUnits <em>Linked Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Linked Units</em>'.
	 * @see org.nasdanika.models.orgdesign.CoordinationMechanism#getLinkedUnits()
	 * @see #getCoordinationMechanism()
	 * @generated
	 */
	EReference getCoordinationMechanism_LinkedUnits();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.orgdesign.CoordinationMechanism#getCadence <em>Cadence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cadence</em>'.
	 * @see org.nasdanika.models.orgdesign.CoordinationMechanism#getCadence()
	 * @see #getCoordinationMechanism()
	 * @generated
	 */
	EAttribute getCoordinationMechanism_Cadence();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.orgdesign.FitRule <em>Fit Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fit Rule</em>'.
	 * @see org.nasdanika.models.orgdesign.FitRule
	 * @generated
	 */
	EClass getFitRule();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.orgdesign.FitRule#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see org.nasdanika.models.orgdesign.FitRule#getCondition()
	 * @see #getFitRule()
	 * @generated
	 */
	EAttribute getFitRule_Condition();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.orgdesign.FitRule#getExpectedOutcome <em>Expected Outcome</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expected Outcome</em>'.
	 * @see org.nasdanika.models.orgdesign.FitRule#getExpectedOutcome()
	 * @see #getFitRule()
	 * @generated
	 */
	EAttribute getFitRule_ExpectedOutcome();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.orgdesign.FitRule#getSeverity <em>Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Severity</em>'.
	 * @see org.nasdanika.models.orgdesign.FitRule#getSeverity()
	 * @see #getFitRule()
	 * @generated
	 */
	EAttribute getFitRule_Severity();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.models.orgdesign.UnitType <em>Unit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Unit Type</em>'.
	 * @see org.nasdanika.models.orgdesign.UnitType
	 * @generated
	 */
	EEnum getUnitType();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.models.orgdesign.CapabilityMaturity <em>Capability Maturity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Capability Maturity</em>'.
	 * @see org.nasdanika.models.orgdesign.CapabilityMaturity
	 * @generated
	 */
	EEnum getCapabilityMaturity();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.models.orgdesign.EnvironmentDimension <em>Environment Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Environment Dimension</em>'.
	 * @see org.nasdanika.models.orgdesign.EnvironmentDimension
	 * @generated
	 */
	EEnum getEnvironmentDimension();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.models.orgdesign.Uncertainty <em>Uncertainty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Uncertainty</em>'.
	 * @see org.nasdanika.models.orgdesign.Uncertainty
	 * @generated
	 */
	EEnum getUncertainty();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.models.orgdesign.Complexity <em>Complexity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Complexity</em>'.
	 * @see org.nasdanika.models.orgdesign.Complexity
	 * @generated
	 */
	EEnum getComplexity();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.models.orgdesign.ProcessType <em>Process Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Process Type</em>'.
	 * @see org.nasdanika.models.orgdesign.ProcessType
	 * @generated
	 */
	EEnum getProcessType();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.models.orgdesign.DecisionScope <em>Decision Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Decision Scope</em>'.
	 * @see org.nasdanika.models.orgdesign.DecisionScope
	 * @generated
	 */
	EEnum getDecisionScope();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.models.orgdesign.DecisionAuthorityLevel <em>Decision Authority Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Decision Authority Level</em>'.
	 * @see org.nasdanika.models.orgdesign.DecisionAuthorityLevel
	 * @generated
	 */
	EEnum getDecisionAuthorityLevel();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.models.orgdesign.CoordinationType <em>Coordination Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Coordination Type</em>'.
	 * @see org.nasdanika.models.orgdesign.CoordinationType
	 * @generated
	 */
	EEnum getCoordinationType();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.models.orgdesign.FitSeverity <em>Fit Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Fit Severity</em>'.
	 * @see org.nasdanika.models.orgdesign.FitSeverity
	 * @generated
	 */
	EEnum getFitSeverity();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OrgdesignFactory getOrgdesignFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.orgdesign.impl.OrganizationImpl <em>Organization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.orgdesign.impl.OrganizationImpl
		 * @see org.nasdanika.models.orgdesign.impl.OrgdesignPackageImpl#getOrganization()
		 * @generated
		 */
		EClass ORGANIZATION = eINSTANCE.getOrganization();

		/**
		 * The meta object literal for the '<em><b>Top Level Units</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANIZATION__TOP_LEVEL_UNITS = eINSTANCE.getOrganization_TopLevelUnits();

		/**
		 * The meta object literal for the '<em><b>People</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANIZATION__PEOPLE = eINSTANCE.getOrganization_People();

		/**
		 * The meta object literal for the '<em><b>Strategies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANIZATION__STRATEGIES = eINSTANCE.getOrganization_Strategies();

		/**
		 * The meta object literal for the '<em><b>Environment Factors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANIZATION__ENVIRONMENT_FACTORS = eINSTANCE.getOrganization_EnvironmentFactors();

		/**
		 * The meta object literal for the '<em><b>Capabilities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANIZATION__CAPABILITIES = eINSTANCE.getOrganization_Capabilities();

		/**
		 * The meta object literal for the '<em><b>Processes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANIZATION__PROCESSES = eINSTANCE.getOrganization_Processes();

		/**
		 * The meta object literal for the '<em><b>Coordination Mechanisms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANIZATION__COORDINATION_MECHANISMS = eINSTANCE.getOrganization_CoordinationMechanisms();

		/**
		 * The meta object literal for the '<em><b>Decision Rights</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANIZATION__DECISION_RIGHTS = eINSTANCE.getOrganization_DecisionRights();

		/**
		 * The meta object literal for the '<em><b>Fit Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANIZATION__FIT_RULES = eINSTANCE.getOrganization_FitRules();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.orgdesign.impl.OrganizationalUnitImpl <em>Organizational Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.orgdesign.impl.OrganizationalUnitImpl
		 * @see org.nasdanika.models.orgdesign.impl.OrgdesignPackageImpl#getOrganizationalUnit()
		 * @generated
		 */
		EClass ORGANIZATIONAL_UNIT = eINSTANCE.getOrganizationalUnit();

		/**
		 * The meta object literal for the '<em><b>Organization</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANIZATIONAL_UNIT__ORGANIZATION = eINSTANCE.getOrganizationalUnit_Organization();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANIZATIONAL_UNIT__PARENT = eINSTANCE.getOrganizationalUnit_Parent();

		/**
		 * The meta object literal for the '<em><b>Sub Units</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANIZATIONAL_UNIT__SUB_UNITS = eINSTANCE.getOrganizationalUnit_SubUnits();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANIZATIONAL_UNIT__ROLES = eINSTANCE.getOrganizationalUnit_Roles();

		/**
		 * The meta object literal for the '<em><b>Delivered Capabilities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANIZATIONAL_UNIT__DELIVERED_CAPABILITIES = eINSTANCE.getOrganizationalUnit_DeliveredCapabilities();

		/**
		 * The meta object literal for the '<em><b>Unit Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORGANIZATIONAL_UNIT__UNIT_TYPE = eINSTANCE.getOrganizationalUnit_UnitType();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.orgdesign.impl.RoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.orgdesign.impl.RoleImpl
		 * @see org.nasdanika.models.orgdesign.impl.OrgdesignPackageImpl#getRole()
		 * @generated
		 */
		EClass ROLE = eINSTANCE.getRole();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__UNIT = eINSTANCE.getRole_Unit();

		/**
		 * The meta object literal for the '<em><b>Current Holder</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__CURRENT_HOLDER = eINSTANCE.getRole_CurrentHolder();

		/**
		 * The meta object literal for the '<em><b>Required Capabilities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__REQUIRED_CAPABILITIES = eINSTANCE.getRole_RequiredCapabilities();

		/**
		 * The meta object literal for the '<em><b>Decision Rights</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__DECISION_RIGHTS = eINSTANCE.getRole_DecisionRights();

		/**
		 * The meta object literal for the '<em><b>Reports To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__REPORTS_TO = eINSTANCE.getRole_ReportsTo();

		/**
		 * The meta object literal for the '<em><b>Direct Reports</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__DIRECT_REPORTS = eINSTANCE.getRole_DirectReports();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.orgdesign.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.orgdesign.impl.PersonImpl
		 * @see org.nasdanika.models.orgdesign.impl.OrgdesignPackageImpl#getPerson()
		 * @generated
		 */
		EClass PERSON = eINSTANCE.getPerson();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__EMAIL = eINSTANCE.getPerson_Email();

		/**
		 * The meta object literal for the '<em><b>Capabilities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__CAPABILITIES = eINSTANCE.getPerson_Capabilities();

		/**
		 * The meta object literal for the '<em><b>Current Roles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__CURRENT_ROLES = eINSTANCE.getPerson_CurrentRoles();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.orgdesign.impl.CapabilityImpl <em>Capability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.orgdesign.impl.CapabilityImpl
		 * @see org.nasdanika.models.orgdesign.impl.OrgdesignPackageImpl#getCapability()
		 * @generated
		 */
		EClass CAPABILITY = eINSTANCE.getCapability();

		/**
		 * The meta object literal for the '<em><b>Maturity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAPABILITY__MATURITY = eINSTANCE.getCapability_Maturity();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.orgdesign.impl.StrategyImpl <em>Strategy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.orgdesign.impl.StrategyImpl
		 * @see org.nasdanika.models.orgdesign.impl.OrgdesignPackageImpl#getStrategy()
		 * @generated
		 */
		EClass STRATEGY = eINSTANCE.getStrategy();

		/**
		 * The meta object literal for the '<em><b>Goals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRATEGY__GOALS = eINSTANCE.getStrategy_Goals();

		/**
		 * The meta object literal for the '<em><b>Responds To</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRATEGY__RESPONDS_TO = eINSTANCE.getStrategy_RespondsTo();

		/**
		 * The meta object literal for the '<em><b>Requires Capabilities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRATEGY__REQUIRES_CAPABILITIES = eINSTANCE.getStrategy_RequiresCapabilities();

		/**
		 * The meta object literal for the '<em><b>Horizon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRATEGY__HORIZON = eINSTANCE.getStrategy_Horizon();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.orgdesign.impl.GoalImpl <em>Goal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.orgdesign.impl.GoalImpl
		 * @see org.nasdanika.models.orgdesign.impl.OrgdesignPackageImpl#getGoal()
		 * @generated
		 */
		EClass GOAL = eINSTANCE.getGoal();

		/**
		 * The meta object literal for the '<em><b>Metric</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GOAL__METRIC = eINSTANCE.getGoal_Metric();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GOAL__TARGET = eINSTANCE.getGoal_Target();

		/**
		 * The meta object literal for the '<em><b>Horizon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GOAL__HORIZON = eINSTANCE.getGoal_Horizon();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.orgdesign.impl.EnvironmentFactorImpl <em>Environment Factor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.orgdesign.impl.EnvironmentFactorImpl
		 * @see org.nasdanika.models.orgdesign.impl.OrgdesignPackageImpl#getEnvironmentFactor()
		 * @generated
		 */
		EClass ENVIRONMENT_FACTOR = eINSTANCE.getEnvironmentFactor();

		/**
		 * The meta object literal for the '<em><b>Dimension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENVIRONMENT_FACTOR__DIMENSION = eINSTANCE.getEnvironmentFactor_Dimension();

		/**
		 * The meta object literal for the '<em><b>Uncertainty</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENVIRONMENT_FACTOR__UNCERTAINTY = eINSTANCE.getEnvironmentFactor_Uncertainty();

		/**
		 * The meta object literal for the '<em><b>Complexity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENVIRONMENT_FACTOR__COMPLEXITY = eINSTANCE.getEnvironmentFactor_Complexity();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.orgdesign.impl.ProcessImpl <em>Process</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.orgdesign.impl.ProcessImpl
		 * @see org.nasdanika.models.orgdesign.impl.OrgdesignPackageImpl#getProcess()
		 * @generated
		 */
		EClass PROCESS = eINSTANCE.getProcess();

		/**
		 * The meta object literal for the '<em><b>Participating Units</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__PARTICIPATING_UNITS = eINSTANCE.getProcess_ParticipatingUnits();

		/**
		 * The meta object literal for the '<em><b>Enabled Capabilities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__ENABLED_CAPABILITIES = eINSTANCE.getProcess_EnabledCapabilities();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS__TYPE = eINSTANCE.getProcess_Type();

		/**
		 * The meta object literal for the '<em><b>Steps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__STEPS = eINSTANCE.getProcess_Steps();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.orgdesign.impl.ProcessStepImpl <em>Process Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.orgdesign.impl.ProcessStepImpl
		 * @see org.nasdanika.models.orgdesign.impl.OrgdesignPackageImpl#getProcessStep()
		 * @generated
		 */
		EClass PROCESS_STEP = eINSTANCE.getProcessStep();

		/**
		 * The meta object literal for the '<em><b>Responsible</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_STEP__RESPONSIBLE = eINSTANCE.getProcessStep_Responsible();

		/**
		 * The meta object literal for the '<em><b>Performers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_STEP__PERFORMERS = eINSTANCE.getProcessStep_Performers();

		/**
		 * The meta object literal for the '<em><b>Consulted</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_STEP__CONSULTED = eINSTANCE.getProcessStep_Consulted();

		/**
		 * The meta object literal for the '<em><b>Informed</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_STEP__INFORMED = eINSTANCE.getProcessStep_Informed();

		/**
		 * The meta object literal for the '<em><b>Predecessors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_STEP__PREDECESSORS = eINSTANCE.getProcessStep_Predecessors();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.orgdesign.impl.DecisionRightImpl <em>Decision Right</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.orgdesign.impl.DecisionRightImpl
		 * @see org.nasdanika.models.orgdesign.impl.OrgdesignPackageImpl#getDecisionRight()
		 * @generated
		 */
		EClass DECISION_RIGHT = eINSTANCE.getDecisionRight();

		/**
		 * The meta object literal for the '<em><b>Scope</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECISION_RIGHT__SCOPE = eINSTANCE.getDecisionRight_Scope();

		/**
		 * The meta object literal for the '<em><b>Applicable Units</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECISION_RIGHT__APPLICABLE_UNITS = eINSTANCE.getDecisionRight_ApplicableUnits();

		/**
		 * The meta object literal for the '<em><b>Applicable Capabilities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECISION_RIGHT__APPLICABLE_CAPABILITIES = eINSTANCE.getDecisionRight_ApplicableCapabilities();

		/**
		 * The meta object literal for the '<em><b>Authority Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECISION_RIGHT__AUTHORITY_LEVEL = eINSTANCE.getDecisionRight_AuthorityLevel();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.orgdesign.impl.CoordinationMechanismImpl <em>Coordination Mechanism</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.orgdesign.impl.CoordinationMechanismImpl
		 * @see org.nasdanika.models.orgdesign.impl.OrgdesignPackageImpl#getCoordinationMechanism()
		 * @generated
		 */
		EClass COORDINATION_MECHANISM = eINSTANCE.getCoordinationMechanism();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COORDINATION_MECHANISM__TYPE = eINSTANCE.getCoordinationMechanism_Type();

		/**
		 * The meta object literal for the '<em><b>Linked Units</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COORDINATION_MECHANISM__LINKED_UNITS = eINSTANCE.getCoordinationMechanism_LinkedUnits();

		/**
		 * The meta object literal for the '<em><b>Cadence</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COORDINATION_MECHANISM__CADENCE = eINSTANCE.getCoordinationMechanism_Cadence();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.orgdesign.impl.FitRuleImpl <em>Fit Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.orgdesign.impl.FitRuleImpl
		 * @see org.nasdanika.models.orgdesign.impl.OrgdesignPackageImpl#getFitRule()
		 * @generated
		 */
		EClass FIT_RULE = eINSTANCE.getFitRule();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIT_RULE__CONDITION = eINSTANCE.getFitRule_Condition();

		/**
		 * The meta object literal for the '<em><b>Expected Outcome</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIT_RULE__EXPECTED_OUTCOME = eINSTANCE.getFitRule_ExpectedOutcome();

		/**
		 * The meta object literal for the '<em><b>Severity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIT_RULE__SEVERITY = eINSTANCE.getFitRule_Severity();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.orgdesign.UnitType <em>Unit Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.orgdesign.UnitType
		 * @see org.nasdanika.models.orgdesign.impl.OrgdesignPackageImpl#getUnitType()
		 * @generated
		 */
		EEnum UNIT_TYPE = eINSTANCE.getUnitType();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.orgdesign.CapabilityMaturity <em>Capability Maturity</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.orgdesign.CapabilityMaturity
		 * @see org.nasdanika.models.orgdesign.impl.OrgdesignPackageImpl#getCapabilityMaturity()
		 * @generated
		 */
		EEnum CAPABILITY_MATURITY = eINSTANCE.getCapabilityMaturity();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.orgdesign.EnvironmentDimension <em>Environment Dimension</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.orgdesign.EnvironmentDimension
		 * @see org.nasdanika.models.orgdesign.impl.OrgdesignPackageImpl#getEnvironmentDimension()
		 * @generated
		 */
		EEnum ENVIRONMENT_DIMENSION = eINSTANCE.getEnvironmentDimension();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.orgdesign.Uncertainty <em>Uncertainty</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.orgdesign.Uncertainty
		 * @see org.nasdanika.models.orgdesign.impl.OrgdesignPackageImpl#getUncertainty()
		 * @generated
		 */
		EEnum UNCERTAINTY = eINSTANCE.getUncertainty();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.orgdesign.Complexity <em>Complexity</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.orgdesign.Complexity
		 * @see org.nasdanika.models.orgdesign.impl.OrgdesignPackageImpl#getComplexity()
		 * @generated
		 */
		EEnum COMPLEXITY = eINSTANCE.getComplexity();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.orgdesign.ProcessType <em>Process Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.orgdesign.ProcessType
		 * @see org.nasdanika.models.orgdesign.impl.OrgdesignPackageImpl#getProcessType()
		 * @generated
		 */
		EEnum PROCESS_TYPE = eINSTANCE.getProcessType();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.orgdesign.DecisionScope <em>Decision Scope</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.orgdesign.DecisionScope
		 * @see org.nasdanika.models.orgdesign.impl.OrgdesignPackageImpl#getDecisionScope()
		 * @generated
		 */
		EEnum DECISION_SCOPE = eINSTANCE.getDecisionScope();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.orgdesign.DecisionAuthorityLevel <em>Decision Authority Level</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.orgdesign.DecisionAuthorityLevel
		 * @see org.nasdanika.models.orgdesign.impl.OrgdesignPackageImpl#getDecisionAuthorityLevel()
		 * @generated
		 */
		EEnum DECISION_AUTHORITY_LEVEL = eINSTANCE.getDecisionAuthorityLevel();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.orgdesign.CoordinationType <em>Coordination Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.orgdesign.CoordinationType
		 * @see org.nasdanika.models.orgdesign.impl.OrgdesignPackageImpl#getCoordinationType()
		 * @generated
		 */
		EEnum COORDINATION_TYPE = eINSTANCE.getCoordinationType();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.orgdesign.FitSeverity <em>Fit Severity</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.orgdesign.FitSeverity
		 * @see org.nasdanika.models.orgdesign.impl.OrgdesignPackageImpl#getFitSeverity()
		 * @generated
		 */
		EEnum FIT_SEVERITY = eINSTANCE.getFitSeverity();

	}

} //OrgdesignPackage
