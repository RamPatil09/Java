package com.xworkz.tasks.dto;

import java.util.ArrayList;
import java.util.Collection;

public class GoldTester {

	public static void main(String[] args) {
		Collection collection=new ArrayList<>();
		GoldDTO dto = 	 new GoldDTO("Tanishq", 24,47620.00,10);
		GoldDTO dto1 = 		new GoldDTO("Malabar", 24,4789.00,11);
		collection.add(dto);
		collection.add(dto1);
		/*
		 * for (Object object : collection) { GoldDTO gold= (GoldDTO)object;
		 * if(gold.getShopName().equals("Tanishq")) collection.remove(dto1); }
		 */
		
		System.out.println(collection.size());
		collection.forEach(System.out::println);
	}
}
