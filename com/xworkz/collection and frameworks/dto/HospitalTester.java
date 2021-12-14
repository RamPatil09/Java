package com.xworkz.tasks.dto;

import java.util.ArrayList;
import java.util.Collection;

public class HospitalTester {

	public static void main(String[] args) {
		Collection collection=new ArrayList<>();
		collection.add(new PatientsDTO(1,"Shiva"));
		
		System.out.println(collection.size());
		collection.forEach(System.out::println);
	}
}
