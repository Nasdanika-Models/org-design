import org.nasdanika.capability.CapabilityFactory;
import org.nasdanika.models.orgdesign.capability.OrgdesignEPackageResourceSetCapabilityFactory;

module org.nasdanika.models.orgdesign {
	
	exports org.nasdanika.models.orgdesign;
	exports org.nasdanika.models.orgdesign.impl;
	exports org.nasdanika.models.orgdesign.util;
	
	requires transitive org.eclipse.emf.ecore;
	requires transitive org.eclipse.emf.common;
	requires transitive org.nasdanika.models.productmanagement;
	
	provides CapabilityFactory with 
		OrgdesignEPackageResourceSetCapabilityFactory;
	
}