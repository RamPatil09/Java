package com.xworkz.collection.dao.Rto;

public class RtoArrival {

	public static void main(String[] args) {
		RtoDAO dao = new RtoDAO();
		dao.save("KA 48 D 8055");
		dao.save("KA 49 J 6735");
		dao.save("KA 29 B 4775");
		dao.save("KA 28 M 0080");
		dao.save("KA 06 K 5648");
		
		System.out.println("Comparing values");
		boolean found = dao.find("Ka 48 D 8055");
		boolean found1 = dao.find("KA 29 B 4775");
		System.out.println(found);
		System.out.println(found1);
		
		System.out.println("Comparing values and neglating cases");
		found = dao.findByCaseInSensetive("kA48 d 8055");
		found1 = dao.findByCaseInSensetive("Ka 29 B 4775");
		System.out.println(found);
		System.out.println(found1);
		
		System.out.println("Comparing values, neglating cases and spaces");
		found = dao.findByCaseInSensetiveAndSpace("Ka48D 8055");
		found1 = dao.findByCaseInSensetiveAndSpace("ka 29b 4775");
		System.out.println(found);
		System.out.println(found1);
	}
}
