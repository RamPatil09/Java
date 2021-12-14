package com.xworkz.collection.cloneableInterface.travels;

public class VrlTravelsArrival {

	public static void main(String[] args) throws CloneNotSupportedException {
		VrlTravels travels = new VrlTravels();
		travels.setTravels("VRL");
		travels.setOwner("Vijay Sankeshwar");
		travels.setHeadQuaters("Hubli");
		travels.setFounded(1976);
		travels.setFoundedPlace("Gadag");
		System.out.println(travels.toString());
		
		Object object = travels.clone();
		VrlTravels travels2 = (VrlTravels)object;
		System.out.println("After cloneing");
		System.out.println(travels2.toString());
	}
}
