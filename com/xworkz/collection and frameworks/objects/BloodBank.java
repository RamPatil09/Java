package com.xworkz.tasks.objects;

import java.util.ArrayList;
import java.util.Collection;

public class BloodBank {

	public static void main(String[] args) {
		Collection collection = new ArrayList<>();
		collection.add("Shri shakti blood bank");
		collection.add(25);
		
		System.out.println(collection.size());
		collection.forEach(System.out::println);
	}
}
