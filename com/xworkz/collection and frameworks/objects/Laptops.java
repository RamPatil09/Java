package com.xworkz.tasks.objects;

import java.util.ArrayList;
import java.util.Collection;

public class Laptops {

	public static void main(String[] args) {
		
		Collection collection=new ArrayList<>();
		collection.add("HP");
		collection.add("Lenovo");
		
		collection.remove("HP");
		System.out.println(collection.size());
		collection.forEach(System.out::println);
	}
}
