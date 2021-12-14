
package com.xworkz.tasks.objects;

import java.util.ArrayList;
import java.util.Collection;

public class DressBrands {

	public static void main(String[] args) {
		Collection collection=new ArrayList<>();
		collection.add("NetPlay");
		collection.add("Denim");
		collection.add("Wrogn");
		
		System.out.println(collection.size());
		collection.forEach(System.out::println);
	}
}
