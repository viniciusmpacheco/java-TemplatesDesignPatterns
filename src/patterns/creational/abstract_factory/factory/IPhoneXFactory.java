package patterns.creational.abstract_factory.factory;

import patterns.creational.abstract_factory.factory.abstract_factory.CountryRulesAbstractFactory;
import patterns.creational.abstract_factory.model.iphone.*;

public class IPhoneXFactory extends IPhoneFactory {

	public IPhoneXFactory(CountryRulesAbstractFactory rules) {
		super(rules);
	}

	public IPhone createIPhone(String level) {
		if(level.equals("standard")) {
			return new IPhoneX(rules);
		} else if(level.equals("highEnd")) {
			return new IPhoneXSMax(rules);
		} else return null;
	}

}
