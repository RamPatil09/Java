package com.xworkz.functionalInterface.rto;

import com.xworkz.functionalInterface.rto.functional.CheckingKaNumbers;
import com.xworkz.functionalInterface.rto.functional.RegisterNoSearch;
import com.xworkz.functionalInterface.rto.functional.RegisterNumSearchIgnoringCaseAndSpace;
import com.xworkz.functionalInterface.rto.functional.RegisterNumSearchIgnoringCases;
import com.xworkz.functionalInterface.rto.functional.RegisterNumberSearch;

public class RtoArrival {

	public static void main(String[] args) {
		RtoDAO rtoDAO = new RtoDAO();
		rtoDAO.save("KA 48 D 8055");
		rtoDAO.save("KA 49 J 6735");
		rtoDAO.save("KA 29 B 4775");
		rtoDAO.save("KA 28 M 0080");
		rtoDAO.save("KA 06 K 5648");
		
		RegisterNoSearch noSearch = new RegisterNumberSearch();
		RegisterNoSearch noSearch2 = new RegisterNumSearchIgnoringCases();
		RegisterNoSearch noSearch3 = new RegisterNumSearchIgnoringCaseAndSpace();
		RegisterNoSearch noSearch4 = new CheckingKaNumbers();
		
		boolean b = rtoDAO.find(noSearch, "KA 49 J 6735");
		System.out.println(b);
	
		System.out.println("***************************************************");
		
		boolean c = rtoDAO.find(noSearch2, "KA 48 d 8055");
		System.out.println(c);

		System.out.println("***************************************************");
		
		boolean found = rtoDAO.find(noSearch3,"KA06 K 5648");
		System.out.println(found);

		System.out.println("***************************************************");
		
		boolean  d = rtoDAO.find(noSearch4, "KA 29 B 4775");
		System.out.println(d);
		
		boolean e = rtoDAO.find(noSearch4, "Tn 45 j 4548");
		System.out.println(e);
		
		boolean f = rtoDAO.find(noSearch4, "mh 45 j 4548");
		System.out.println(f);
		
	}
}
