package com.xworkz.tasks.dto;

import java.util.ArrayList;
import java.util.Collection;

public class LibraryTester {

	public static void main(String[] args) {
		
		Collection collection=new ArrayList<>();
		collection.add(new BooksDTO("Java",1250.0,5));
		
		collection.removeAll(collection);
		System.out.println(collection.size());
		collection.forEach(System.out::println);
	}
}
