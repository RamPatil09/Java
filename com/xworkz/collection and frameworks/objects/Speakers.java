package com.xworkz.tasks.objects;

import java.util.ArrayList;
import java.util.Collection;

public class Speakers {

	public static void main(String[] args) {
		
		Collection collection=new ArrayList<>();
		collection.add("Boat");
		collection.add("235v2");
		
		collection.removeAll(collection);
		System.out.println(collection.size());
		collection.forEach(System.out::println);
	}
}
