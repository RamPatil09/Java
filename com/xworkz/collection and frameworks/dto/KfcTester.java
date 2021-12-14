package com.xworkz.tasks.dto;

import java.util.ArrayList;
import java.util.Collection;

public class KfcTester {

	public static void main(String[] args) {
		Collection collection=new ArrayList<>();
		collection.add(new KfcDTO("Colonel Harland Sanders",1930,"Restuarent","9 Billion"));
		
		System.out.println(collection.size());
		collection.forEach(System.out::println);
	}
}
