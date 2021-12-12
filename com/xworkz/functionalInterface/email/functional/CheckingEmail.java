package com.xworkz.functionalInterface.email.functional;

public class CheckingEmail implements Emails {

	@Override
	public boolean expression(String arg1, String arg2) {
		System.out.println("invoked email checking method");
		if(arg1.equals(arg2)) 
			return true;
		return false;
	}

}
