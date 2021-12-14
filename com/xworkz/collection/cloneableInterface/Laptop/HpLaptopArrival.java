package com.xworkz.collection.cloneableInterface.Laptop;

public class HpLaptopArrival {

	public static void main(String[] args) throws CloneNotSupportedException {
		HpLaptop hpLaptop = new HpLaptop();
		hpLaptop.setName("HP");
		hpLaptop.setRam(8);
		hpLaptop.setProcessor("Ryzen 5");
		hpLaptop.setType("Gaming");
		hpLaptop.setScreenInInch(15.6);
		System.out.println(hpLaptop.toString());
		
		Object object=hpLaptop.clone();
		HpLaptop hpLaptop2 = (HpLaptop)object;
		System.out.println("After cloneing");
		System.out.println(hpLaptop2.toString());
	}
}
