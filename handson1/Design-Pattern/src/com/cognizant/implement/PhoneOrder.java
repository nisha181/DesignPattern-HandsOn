package com.cognizant.implement;

import com.cognizant.interfaces.IPhoneOrder;

public class PhoneOrder implements IPhoneOrder {

	@Override
	public void ProcessOrder(String modelName) {
		System.out.println(String.format("%s order accepted!", modelName));
		
	}

}
