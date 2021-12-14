package com.xworkz.lightapp;

//Factory class - object creation logic
public class LightFactory {
//factory method
	public static ISwitch getLight(String type) {
		if (type.equalsIgnoreCase("tubelight")) {
			return new TubeLightImplementation();
		} else if (type.equalsIgnoreCase("cflbulb")) {
			return new CflBulbImplementation();
		} else {
			System.out.println("Light not found");
		}
		return null;
	}
}
