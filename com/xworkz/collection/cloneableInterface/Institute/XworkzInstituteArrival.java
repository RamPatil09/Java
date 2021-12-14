package com.xworkz.collection.cloneableInterface.Institute;

public class XworkzInstituteArrival {

	public static void main(String[] args) throws CloneNotSupportedException {
		XworkzInstitute institute = new XworkzInstitute();
		institute.setName("X-workZ");
		institute.setOwner("Omkar");
		institute.setNoOfBranches(2);
		institute.setCourse("Java Full stack Development");
		institute.setContactNumber(9886971483L);
		
		System.out.println(institute.toString());
		
		Object object = institute.clone();
		XworkzInstitute institute2 = (XworkzInstitute)object;
		System.out.println("After cloneing");
		System.out.println(institute2.toString());
	}
}
