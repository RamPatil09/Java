package com.xworkz.collection.cloneableInterface.Malls;

public class ShoppingMallsArrival {

	public static void main(String[] args) throws CloneNotSupportedException {
		ShoppingMalls shoppingMalls = new ShoppingMalls();
		shoppingMalls.setName("Orion Mall");
		shoppingMalls.setLocation("Dr Rajkumar Rd, Rajajinagar, Bengaluru, Karnataka");
		shoppingMalls.setContactNo(8067282222L);
		shoppingMalls.setNoOfShops(110);
		shoppingMalls.setTotalGates(4);
		System.out.println(shoppingMalls.toString());
		
		Object object = shoppingMalls.clone();
		ShoppingMalls shoppingMalls2 = (ShoppingMalls)object;
		System.out.println("After cloneing");
		System.out.println(shoppingMalls2.toString());
	}
}
