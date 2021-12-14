package com.xworkz.collection.setinterface;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class BankTester {

	public static void main(String[] args) {
		Set set = new TreeSet<>();
		set.add(new BankDTO(5, "Vishwa", 564689326, "Savings", "SBI"));
		set.add(new BankDTO(2, "Professor", 7340373, "Current", "Kotak"));
		set.add(new BankDTO(8, "Girish", 809234792, "Salary", "BAndhan"));
		
		Iterator iterator = set.iterator();
		while(iterator.hasNext()) {
			Object object = (Object)iterator.next();
			System.out.println(object);
		}
	}
}
