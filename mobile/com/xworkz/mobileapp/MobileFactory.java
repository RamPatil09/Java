package com.xworkz.mobileapp;

public class MobileFactory {

	public static IMobile getMobile(String type) {
		if (type.equals("SAMSUNG")) {
			return new SamsungImpl();
		} else if (type.equals("Realme")) {
			return new RealmeImpl();
		} else {
			System.out.println("No mobile found");
		}
		return null;
	}
}
