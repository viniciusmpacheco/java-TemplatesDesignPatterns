package patterns.creational.factory_method;

import patterns.creational.factory_method.factory.IPhoneSimpleFactory;
import patterns.creational.factory_method.model.IPhone;

public class FactoryMethodClient {
	public static void run() {
		System.out.println("\n### Ordering an iPhone X");
		IPhone iphone = IPhoneSimpleFactory.createIPhone("X", "standard");
		System.out.println(iphone);
		
		System.out.println("\n### Ordering an iPhone 11 HighEnd");
		IPhone iphone2 = IPhoneSimpleFactory.createIPhone("11", "highEnd");
		System.out.println(iphone2);
	}
}
