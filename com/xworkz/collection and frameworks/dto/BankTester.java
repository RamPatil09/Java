package com.xworkz.tasks.dto;

import java.util.ArrayList;
import java.util.Collection;

public class BankTester {

	public static void main(String[] args) {
		Collection collection=new ArrayList<>();
		collection.add(new BankDTO("SBI","Rajajinagar"));
		
		
		System.out.println(collection.size());
		collection.forEach(System.out::println);
	}
}
