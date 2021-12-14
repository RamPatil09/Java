package com.xworkz.tasks.dto;

import java.util.ArrayList;
import java.util.Collection;

public class ContactTester {

	public static void main(String[] args) {
		Collection collection = new ArrayList<>();
		collection.add(new ContactsDTO(1,"Brhamaiyya"));
		
		collection.removeAll(collection);
		System.out.println(collection.size());
		collection.forEach(System.out::println);
	}
}
