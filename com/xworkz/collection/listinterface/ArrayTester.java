package com.xworkz.collection.listinterface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayTester {

	public static void main(String[] args) {
		List list = new ArrayList<>();
		list.add("Sri Sai");
		list.add("Durgamba");
		list.add("VRL");
		list.add(1, "SRS");
	
		List list2 = new ArrayList<>();
		list2.add("DhanLaxmi");
		list2.addAll(1, list);
		
		List list3 = new ArrayList<>();
		list3.add("Arasu");
		list3.addAll(list2);
		
		Iterator iterator = list.iterator();
		while (iterator.hasNext()) {
			String data = (String) iterator.next();
			System.out.println(data);
		}
		
		System.out.println("*******************************************");
		list2.forEach(System.out::println);
		
		System.out.println("*******************************************");
		list3.forEach(System.out::println);
		
		System.out.println("*******************************************");
		System.out.println(list3.isEmpty());
		System.out.println(list3.size());
		
		System.out.println("*******************************************");
		System.out.println(list3.remove(1));
		
		System.out.println("*******************************************");
		System.out.println("After removing index 1 value");
		list3.forEach(System.out::println);
		System.out.println(list3.size());
		
		System.out.println("*******************************************");
		System.out.println(list2.size());
		System.out.println(list2.removeAll(list2));
		
		System.out.println("*******************************************");
		System.out.println("After removing all");
		list2.forEach(System.out::println);
		System.out.println(list2.size());
	    list3.forEach(System.out::println);
	    System.out.println("*******************************************");
	    System.out.println(list3.contains("SRS"));
	    System.out.println(list2.containsAll(list2));
	}
}