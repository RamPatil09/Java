package com.xworkz.map;

import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class 	ContinentArrival {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("Asia",49);
		map.put("Europe", 48);
		map.put("North and Central America", 21);
		map.put("South America", 15);
		map.put("Oceania", 14);
		map.put("Antarctica", 1);
		map.put("Africa", 56);
		
		Integer check = map.get("Asia");
		System.out.println(check);
		
		check = map.get("Oceania");
		System.out.println(check);
		
		boolean contain = map.containsKey("Africa");
		System.out.println(contain);
		
		contain = map.containsValue(15);
		System.out.println(contain);
		
		Set<String> value= map.keySet();
		value.forEach((e)-> System.out.println(e));
		
		Set<Entry<String, Integer>> value1 = map.entrySet();
		value1.forEach((e)-> System.out.println(e));
	}
}
