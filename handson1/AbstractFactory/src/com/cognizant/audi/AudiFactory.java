package com.cognizant.audi;

import com.cognizant.abstractclasses.Factory;
import com.cognizant.abstractclasses.Headlight;
import com.cognizant.abstractclasses.Tire;

public class AudiFactory extends Factory {

	@Override
	public Headlight makeHeadlight() {
		return new AudiHeadlight();
	}

	@Override
	public Tire makeTire() {
		return new AudiTire();
	}
       
 }
