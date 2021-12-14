package com.xworkz.tasks.objects;

import java.util.ArrayList;
import java.util.Collection;

public class Footwares {

	public static void main(String[] args) {
		Collection collection=new ArrayList<>();
		collection.add("SparX");
		collection.add("Puma");
		collection.add("Nike");
		collection.add("Paragon");
		
		collection.remove("Nike");
		collection.removeAll(collection);
		System.out.println(collection.size());
		collection.forEach(System.out::println);
	}
}
