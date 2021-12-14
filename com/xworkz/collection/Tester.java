package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Tester {

	public static void main(String[] args) {
		Collection collection=new ArrayList<>();
		collection.add("Shiva");
		collection.add(150);
		collection.add(1150.0);
		
	System.out.println(collection.size());
	collection.forEach(System.out::println);
	
	System.out.println("********************************");
	
	Iterator itr=collection.iterator();
	while(itr.hasNext()) {
		Object obj = itr.next();
		System.out.println(obj);
	}
	
	System.out.println("**************************************");
	
	for (Object object : collection) {
		System.out.println(object);
	}
	
	}
}
