package com.xworkz.collection.cloneableInterface.Mobiles;

public class NokiaMobileArrival {

	public static void main(String[] args) throws CloneNotSupportedException {
		NokiaMobiles nokiaMobiles = new NokiaMobiles();
		nokiaMobiles.setName("Nokia");
		nokiaMobiles.setModel("C 30");
		nokiaMobiles.setColor("Green");
		nokiaMobiles.setOperatingSystem("Android 11");
		nokiaMobiles.setPrice(11600.00);
		System.out.println(nokiaMobiles.toString());
		
		Object object = nokiaMobiles.clone();
		NokiaMobiles nokiaMobiles2 = (NokiaMobiles)object;
		System.out.println("After cloneing");
		System.out.println(nokiaMobiles2.toString());
	}
}
