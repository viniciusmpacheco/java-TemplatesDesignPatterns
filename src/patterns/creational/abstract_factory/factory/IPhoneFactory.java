package patterns.creational.abstract_factory.factory;

import patterns.creational.abstract_factory.factory.abstract_factory.CountryRulesAbstractFactory;
import patterns.creational.abstract_factory.model.iphone.IPhone;

public abstract class IPhoneFactory {
	CountryRulesAbstractFactory rules;
	
	public IPhoneFactory(CountryRulesAbstractFactory rules) {
		this.rules = rules;
	}

	public IPhone orderIPhone(String level) {
		IPhone device = null;
		
		device = createIPhone(level);
		
		device.getHardware();
		device.assemble();
		device.certificates();
		device.pack();
		
		return device;
	}
	
	protected abstract IPhone createIPhone(String level);
}
