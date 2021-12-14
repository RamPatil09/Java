package com.xworkz.tasks.objects;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.ArrayBlockingQueue;

public class Ecommerce {

	public static void main(String[] args) {
		Collection collection=new ArrayList<>();
		collection.add("Amazon");
		collection.add("Flipkart");
		collection.add('A');
		collection.add('F');
		
		collection.removeAll(collection);
		System.out.println(collection.size());
		collection.forEach(System.out::println);
	}
}
