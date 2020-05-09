package com.cognizant.main;

import java.util.Scanner;

import com.cognizant.abstractclasses.Factory;
import com.cognizant.abstractclasses.Headlight;
import com.cognizant.abstractclasses.Tire;
import com.cognizant.audi.AudiFactory;
import com.cognizant.factory.factoryGetter;

public class Client {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the type");
		String type = sc.nextLine();
		if (type.equalsIgnoreCase("Audi")) {
			Factory factory = factoryGetter.getFactory("Audi");
			Headlight headLight=factory.makeHeadlight();
			headLight.showHeadlight();
			Tire tire=factory.makeTire();
			tire.showTire();
		}
		if (type.equalsIgnoreCase("Mercedes")) {
			Factory factory = factoryGetter.getFactory("Mercedes");
			Headlight headLight=factory.makeHeadlight();
			headLight.showHeadlight();
			Tire tire=factory.makeTire();
			tire.showTire();
		}

	}
}
