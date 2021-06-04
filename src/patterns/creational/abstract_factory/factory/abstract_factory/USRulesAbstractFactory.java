package patterns.creational.abstract_factory.factory.abstract_factory;

import patterns.creational.abstract_factory.model.certificate.Certificate;
import patterns.creational.abstract_factory.model.certificate.USCertificate;
import patterns.creational.abstract_factory.model.packing.Packing;
import patterns.creational.abstract_factory.model.packing.USPacking;

public class USRulesAbstractFactory implements CountryRulesAbstractFactory {

	public Certificate getCertificates() {
		return new USCertificate();
	}

	public Packing getPacking() {
		return new USPacking();
	}

}
