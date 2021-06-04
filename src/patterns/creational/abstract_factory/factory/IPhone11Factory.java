package patterns.creational.abstract_factory.factory;

import patterns.creational.abstract_factory.factory.abstract_factory.CountryRulesAbstractFactory;
import patterns.creational.abstract_factory.model.iphone.*;

public class IPhone11Factory extends IPhoneFactory {

	public IPhone11Factory(CountryRulesAbstractFactory rules) {
		super(rules);
	}

	public IPhone createIPhone(String level) {
		if(level.equals("standard")) {
			return new IPhone11(rules);
		} else if(level.equals("highEnd")) {
			return new IPhone11Pro(rules);
		} else return null;
	}

}
