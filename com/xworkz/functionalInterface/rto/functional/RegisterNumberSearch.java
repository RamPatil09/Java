package com.xworkz.functionalInterface.rto.functional;

public class RegisterNumberSearch implements RegisterNoSearch{

	@Override
	public boolean proannouncement(String arg1, String arg2) {
		System.out.println("Invoked proannouncement method");
		if(arg1.equals(arg2)) {
			return true;
		}
		return false;
	}
	
}
