package com.xworkz.collection.listinterface;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class VectorTester {

	public static void main(String[] args) {
		Vector vector = new Vector<>();
		vector.add("Kuvempu");
		vector.add("Bendre");
		vector.add("Gokak");
		vector.add("Ananthamurthy");
		
		Iterator iterator = vector.iterator();
		while(iterator.hasNext()) {
			System.out.println((String)iterator.next());
			System.out.println(System.nanoTime());
		}
		System.out.println("************************************");
		
		Enumeration enumeration = vector.elements();
		while(enumeration.hasMoreElements()) {
			System.out.println((String)enumeration.nextElement());
			System.out.println(System.nanoTime());
		}
	}
}
