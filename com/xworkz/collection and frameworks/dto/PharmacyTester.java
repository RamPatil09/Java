package com.xworkz.tasks.dto;

import java.util.ArrayList;
import java.util.Collection;

public class PharmacyTester {

	public static void main(String[] args) {
		Collection collection=new ArrayList<>();
		collection.add(new PharmacyDTO("Ananya pharmacy","Kadugondanahalli Bengaluru",9731333704l));
		
		System.out.println(collection.size());
		collection.forEach(System.out::println);
	}
}
