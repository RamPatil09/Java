package com.xworkz.collection.cloneableInterface.stadiums;

public class ChinnaswamyStadiumArrival {

	public static void main(String[] args) throws CloneNotSupportedException {
		ChinnaswamyStadium chinnaswamyStadium = new ChinnaswamyStadium();
		chinnaswamyStadium.setName("M Chinnaswamy Stadium");
		chinnaswamyStadium.setContactNumber(8040154015L);
		chinnaswamyStadium.setCapacity(40000);
		chinnaswamyStadium.setOwner("Government of Karnataka");
		chinnaswamyStadium.setTeam("Royal Challengers Bangalore");
		System.out.println(chinnaswamyStadium.toString());
		
		Object object = chinnaswamyStadium.clone();
		ChinnaswamyStadium chinnaswamyStadium2 = (ChinnaswamyStadium)object;
		System.out.println("After cloneing");
		System.out.println(chinnaswamyStadium2.toString());
	}
}
