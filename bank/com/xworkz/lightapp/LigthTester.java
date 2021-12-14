package com.xworkz.lightapp;

import java.util.*;

public class LigthTester {
	public static void main(String[] args) {
		// Abstraction
		Scanner type = new Scanner(System.in);
		System.out.println("Enter the light");

		// Consumer logic or utilization logic
		ISwitch iSwitch = LightFactory.getLight(type.next());
		if (iSwitch != null) {
			iSwitch.sOn();
			iSwitch.sOff();
		}
	}
}
