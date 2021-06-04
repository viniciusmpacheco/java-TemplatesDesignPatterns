package patterns.creational.abstract_factory.factory.abstract_factory;

import patterns.creational.abstract_factory.model.certificate.Certificate;
import patterns.creational.abstract_factory.model.packing.Packing;

public interface CountryRulesAbstractFactory {
	Certificate getCertificates();
	Packing getPacking();
}
