package com.xworkz.functionalInterface.email.functional;

public class CheckingItContainsIn implements Emails{

	@Override
	public boolean expression(String arg1, String arg2) {
		System.out.println("Invoking checking it contains com method");
		String temp = arg2.substring(arg2.length()-2, arg2.length());
		if(arg1.equals(arg2)) {
		if(temp.equalsIgnoreCase(".in")) {
			return true;
			}
		return true;
		}
		return false;
	}
}
