package com.cognizant.implement;

import com.cognizant.interfaces.IPhoneRepair;

public class PhoneRepair implements IPhoneRepair {

	@Override
	public void ProcessPhoneRepair(String modelName) {
		System.out.println(String.format("%s repair accepted!",modelName));
		
	}

}
