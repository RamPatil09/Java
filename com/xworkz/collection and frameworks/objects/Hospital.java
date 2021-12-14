package com.xworkz.tasks.objects;

import java.util.ArrayList;
import java.util.Collection;

public class Hospital {

	public static void main(String[] args) {
		Collection collection=new ArrayList<>();
		collection.add("Sidlinga");
		collection.add(25);
		collection.add(1500.00);
		
		collection.remove(1500.00);
		System.out.println(collection.size());
		collection.forEach(System.out::println);
	}
}
