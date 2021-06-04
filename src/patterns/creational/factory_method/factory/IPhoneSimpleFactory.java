package patterns.creational.factory_method.factory;

import patterns.creational.factory_method.model.IPhone;
import patterns.creational.factory_method.model.IPhone11;
import patterns.creational.factory_method.model.IPhone11Pro;
import patterns.creational.factory_method.model.IPhoneX;
import patterns.creational.factory_method.model.IPhoneXSMax;

public class IPhoneSimpleFactory {
	public static IPhone createIPhone(String generation, String level) {
		IPhone device = null;

		if (generation.equals("X")) {
			if (level.equals("standard")) {
				device = new IPhoneX();
			} else if (level.equals("highEnd")) {
				device = new IPhoneXSMax();
			}
		} else if (generation.equals("11")) {
			if (level.equals("standard")) {
				device = new IPhone11();
			} else if (level.equals("highEnd")) {
				device = new IPhone11Pro();
			}
		}

		device.getHardware();
		device.assemble();
		device.certificates();
		device.pack();

		return device;
	}
}
