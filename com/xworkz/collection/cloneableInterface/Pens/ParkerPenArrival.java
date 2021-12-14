package com.xworkz.collection.cloneableInterface.Pens;

public class ParkerPenArrival {

	public static void main(String[] args) throws CloneNotSupportedException {
		ParkerPen parkerPen = new ParkerPen();
		parkerPen.setName("Parker");
		parkerPen.setInkColor("Blue");
		parkerPen.setColor("Silver");
		parkerPen.setType("Ball pen");
		parkerPen.setPrice(7500.00);
		System.out.println(parkerPen.toString());
		
		Object object = parkerPen.clone();
		ParkerPen parkerPen2 = (ParkerPen)object;
		System.out.println("After cloneing");
		System.out.println(parkerPen2.toString());
	}
}
