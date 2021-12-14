package com.xworkz.lightapp;

public class CflBulbImplementation implements ISwitch{

	@Override
	public void sOn() {
		System.out.println("CFL bulb is turned on....");		
	}

	@Override
	public void sOff() {
		System.out.println("CFL bulb is turned off....");

	}

}
