package com.xworkz.mobileapp;

import java.util.*;

public class MobileTester {

	public static void main(String[] args) {
		Scanner mobile = new Scanner(System.in);
		System.out.println("Enter mobile brand");
		IMobile iMobile = MobileFactory.getMobile(mobile.next());
		if(iMobile != null) {
			iMobile.mTurnOn();
			iMobile.mTurnOff();
		}
		
		IMobile iMobile1 = MobileFactory.getMobile(mobile.next());
		if(iMobile != null) {
			iMobile.mTurnOn();
			iMobile.mTurnOff();
		}
	}
}
