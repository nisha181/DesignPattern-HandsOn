package com.cognizant.factory;

import com.cognizant.abstractclasses.Factory;
import com.cognizant.audi.AudiFactory;
import com.cognizant.mercedes.MercedesFactory;

public class factoryGetter {

	public static Factory getFactory(String factory) {
		if (factory.equalsIgnoreCase("Audi"))
			return new AudiFactory();
		if (factory.equalsIgnoreCase("Mercedes"))
			return new MercedesFactory();
		return null;

	}
}
