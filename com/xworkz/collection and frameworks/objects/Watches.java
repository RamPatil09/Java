package com.xworkz.tasks.objects;

import java.util.ArrayList;
import java.util.Collection;

public class Watches {

	public static void main(String[] args) {
		Collection collection=new ArrayList<>();
		collection.add("Titan");
		collection.add(5000.00);
		
		System.out.println(collection.size());
		collection.forEach(System.out::println);
	}
}
