package com.xworkz.collection.setinterface;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class PetTester {

	public static void main(String[] args) {
		Set set = new TreeSet<>();
		set.add(new PetDTO(3, "Chintu", 5, "Brown"));
		set.add(new PetDTO(1, "pummy", 2, "Cream"));
		set.add(new PetDTO(4, "Gowri", 20, "White"));
		set.add(new PetDTO(2, "Bruno", 6, "Reditch"));
		
//		Iterator iterator = set.iterator();
//		while(iterator.hasNext()) {
//			Object object=(Object)iterator.next();
//			System.out.println(object);
//		}
		System.out.println("*****************************************");
		Iterator iterator2 = set.iterator();
		while(iterator2.hasNext()) {
			Object object2 = (Object)iterator2.next();
			System.out.println(object2);
		}
	}
}
