package patterns.creational.abstract_factory;

import patterns.creational.abstract_factory.factory.*;
import patterns.creational.abstract_factory.factory.abstract_factory.*;
import patterns.creational.abstract_factory.model.iphone.IPhone;

public class AbstractyFactoryClient {
	public static void run() {
		CountryRulesAbstractFactory rules = new BrazilianRulesAbstractFactory();
		IPhoneFactory genXFactory = new IPhoneXFactory(rules);
		IPhoneFactory gen11Factory = new IPhone11Factory(rules);
		
		System.out.println("### Ordering an iPhone X");
		IPhone iphone = genXFactory.orderIPhone("standard");
		System.out.println(iphone);
		
		System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
		IPhone iphone2 = gen11Factory.orderIPhone("highEnd");
		System.out.println(iphone2);
	}
}
