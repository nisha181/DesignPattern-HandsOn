package com.cognizant.main;

import java.util.Scanner;

import com.cognizant.implement.AccessoryRepair;
import com.cognizant.implement.PhoneOrder;
import com.cognizant.implement.PhoneRepair;

public class Main {
    
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Welcome to our site. Would you like to order or repair?");
		
		String processOption = sc.nextLine();
		
		PhoneOrder phoneOrder = new PhoneOrder();
		PhoneRepair phoneRepair = new PhoneRepair();
		AccessoryRepair accessoryRepair=new AccessoryRepair();
		
		String productDetail=" ";

		switch (processOption) {
		case "order":
			System.out.println("Please provide the phone model name");
			productDetail = sc.nextLine();
			phoneOrder.ProcessOrder(productDetail);
			break;

		case "repair":
			System.out.println("Is it the phone or the accessory that you want to be repaired?");
			String productType = sc.nextLine();
			if (productType.equals("phone")) {
				System.out.println("Please provide the phone model name");
				productDetail = sc.nextLine();
				phoneRepair.ProcessPhoneRepair(productDetail);
			} else {
				System.out.println("Please provide the accessory detail, like headphone, tempered glass");
				productDetail = sc.nextLine();
				accessoryRepair.ProcessAccessoryRepair(productDetail);
			}
			break;
		default:
			break;
		}
	}

}

