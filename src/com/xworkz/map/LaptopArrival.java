package com.xworkz.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class LaptopArrival {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("HP", "Pavilion Ryzen 5");
		map.put("Acer", "Aspire 7");
		map.put("Lenovo", "Ideapad Slim 5i");
		map.put("Dell", "Inspiron");
		
		String check = map.get("Dell");
		System.out.println(check);
		
		boolean contain = map.containsKey("HP");
		System.out.println(contain);
		
		contain = map.containsValue("Aspire 7");
		System.out.println(contain);
		
		Set<String> check1 = map.keySet();
		check1.forEach((e)->System.out.println(e));
		
		Set<Entry<String, String>> check2 = map.entrySet();
		check2.forEach((e)->System.out.println(e));
	}
}
