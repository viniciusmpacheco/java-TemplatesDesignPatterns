package patterns.creational.abstract_factory.factory.abstract_factory;

import patterns.creational.abstract_factory.model.certificate.BrazilianCertificate;
import patterns.creational.abstract_factory.model.certificate.Certificate;
import patterns.creational.abstract_factory.model.packing.BrazilianPacking;
import patterns.creational.abstract_factory.model.packing.Packing;

public class BrazilianRulesAbstractFactory implements CountryRulesAbstractFactory {

	public Certificate getCertificates() {
		return new BrazilianCertificate();
	}

	public Packing getPacking() {
		return new BrazilianPacking();
	}

}
