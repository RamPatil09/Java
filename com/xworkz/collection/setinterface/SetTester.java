package com.xworkz.collection.setinterface;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTester {

	public static void main(String[] args) {
		Set set = new HashSet<>();
		System.out.println("Set HashSet");
		set.add("Darshan");
		set.add("Yash");
		set.add("Appu");
		
		set.forEach(System.out::println);
		
		System.out.println("****************************************");
		System.out.println("Set LinkedHashSet");
		Set set2 = new LinkedHashSet<>();
		set2.add("Lamborgini");
		set2.add("Ferrari");
		set2.add("BMW");
		
		set2.forEach(System.out::println);
		
		System.out.println("****************************************");
		System.out.println("Set TreeSet");
		Set set3 = new TreeSet<>();
		set3.add("Honda");
		set3.add("KTM");
		set3.add("Pulsar");
		
		set3.forEach(System.out::println);
	}
}
