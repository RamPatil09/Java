package com.xworkz.functionalInterface.rto.functional;

public class RegisterNumSearchIgnoringCaseAndSpace implements RegisterNoSearch{

	@Override
	public boolean proannouncement(String arg1, String arg2) {
		System.out.println("invoked proannouncement method Register Num Search IgnoringCases and spaces");
		arg1 = arg1.replace(" ", "");
		if(arg1.equalsIgnoreCase(arg2.replace(" ", ""))) return true;
		return false;
	}

}
