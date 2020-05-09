package com.cognizant.mercedes;

import com.cognizant.abstractclasses.Factory;
import com.cognizant.abstractclasses.Headlight;
import com.cognizant.abstractclasses.Tire;

public class MercedesFactory extends Factory {

	@Override
	public Headlight makeHeadlight() {
		return new MercedesHeadlight();
	}

	@Override
	public Tire makeTire() {
		return new MercedesTire();
	}

}
