package com.xworkz.collection.cloneableInterface.Bottles;

public class BottlesArrival {

	public static void main(String[] args) throws CloneNotSupportedException {
		Bottles bottles = new Bottles();
		bottles.setName("Black Dog Scotch Whisky");
		bottles.setAlcoholByVolume(42.8);
		bottles.setManufacturer("United Spirits");
		bottles.setColor("Amber");
		bottles.setIntroduced(1883);
		System.out.println(bottles.toString());
		
		Object object = bottles.clone();
		Bottles bottles2 = (Bottles)object;
		System.out.println("After cloneing");
		System.out.println(bottles2.toString());
	}
}
