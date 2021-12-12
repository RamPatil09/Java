package com.xworkz.functionalInterface.rto.functional;

public class CheckingKaNumbers implements RegisterNoSearch{

	@Override
	public boolean proannouncement(String arg1, String arg2) {
		System.out.println("Checking first two characters");
		String firstTwoChar = arg2.substring(0, 2);
		if (firstTwoChar.equalsIgnoreCase("ka")) return true;
		return false;
	}
}
