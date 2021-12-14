package com.xworkz.collection.cloneableInterface.hospitals;

public class ManipalHospitalsArrival {

	public static void main(String[] args) throws CloneNotSupportedException {
		ManipalHospitals manipalHospitals = new ManipalHospitals();
		manipalHospitals.setOrganization("Manipal Hospitals");
		manipalHospitals.setCareSystem("Public multi-specialty hospitals");
		manipalHospitals.setCareSystem("Specialist");
		manipalHospitals.setPatron("H. Sudarshan Ballal");
		manipalHospitals.setOpened(1953);
		System.out.println(manipalHospitals.toString());
		
		Object object = manipalHospitals.clone();
		ManipalHospitals manipalHospitals2 = (ManipalHospitals)object;
		System.out.println("After cloneing");
		System.out.println(manipalHospitals2.toString());
	}
}
