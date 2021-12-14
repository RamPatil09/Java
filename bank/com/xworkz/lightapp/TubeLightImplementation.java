package com.xworkz.lightapp;

//Implementation class - Implementation logic
public class TubeLightImplementation implements ISwitch {
	@Override
	public void sOn() {
		System.out.println("Tube light turned on....");
	}

	@Override
	public void sOff() {
		System.out.println("Tube light turned off.....");
	}
}
