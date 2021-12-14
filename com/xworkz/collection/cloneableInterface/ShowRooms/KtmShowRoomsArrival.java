package com.xworkz.collection.cloneableInterface.ShowRooms;

public class KtmShowRoomsArrival {

	public static void main(String[] args) throws CloneNotSupportedException {
		KtmShowRooms ktmShowRooms = new KtmShowRooms();
		ktmShowRooms.setShowRoomName("KTM Showroom");
		ktmShowRooms.setType("Motor Cycle");
		ktmShowRooms.setLocation("Rajajinagar");
		ktmShowRooms.setContactNumber(9036080655L);
		ktmShowRooms.setAddress("Ground Floor, 1st Main Road, 71, Dr Rajkumar Rd, 2nd Block, Rajajinagar, Bengaluru, Karnataka 560010");
		System.out.println(ktmShowRooms.toString());
		
		Object object = ktmShowRooms.clone();
		KtmShowRooms ktmShowRooms2 = (KtmShowRooms)object;
		System.out.println("After cloneing");
		System.out.println(ktmShowRooms2.toString());
	}
}
