package com.xworkz.mobileapp;

public class SamsungImpl implements IMobile{

	@Override
	public void mTurnOn() {
		System.out.println("Samsung mobile turned on......");
		
	}

	@Override
	public void mTurnOff() {
		System.out.println("Samsung mobile turned off......");
	}

}
