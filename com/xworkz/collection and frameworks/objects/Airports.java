package com.xworkz.tasks.objects;

import java.util.ArrayList;
import java.util.Collection;

public class Airports {

	public static void main(String[] args) {
		Collection collection=new ArrayList<>();
		collection.add("Domestic");
		collection.add("International");
		
		collection.remove("Domestic");
		System.out.println(collection.size());
		collection.forEach(System.out::println);
	}
}
