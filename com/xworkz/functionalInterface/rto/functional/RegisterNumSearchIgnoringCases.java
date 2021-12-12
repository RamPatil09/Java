package com.xworkz.functionalInterface.rto.functional;

public class RegisterNumSearchIgnoringCases implements RegisterNoSearch{

	@Override
	public boolean proannouncement(String arg1, String arg2) {
		System.out.println("invoked proannouncement method Register Num Search IgnoringCases");
		if(arg1.equalsIgnoreCase(arg2)) return true;
		return false;
	}

}
