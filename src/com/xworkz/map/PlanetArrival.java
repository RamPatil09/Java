package com.xworkz.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class PlanetArrival {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("Earth", 1);
		map.put("Mercury", 0);
		map.put("Venus", 0);
		map.put("Mars", 2);
		map.put("Jupiter", 53);
		map.put("Saturn", 53);
		map.put("Uranus", 27);
		map.put("Neptune", 14);

		Integer check = map.get("Earth");
		System.out.println(check);

		boolean value = map.containsKey("Saturn");
		System.out.println(value);

		value = map.containsKey("Mars");
		System.out.println(value);

		boolean check1 = map.containsValue(14);
		System.out.println(check1);

		check1 = map.containsValue(0);
		System.out.println(check1);

		Set<String> check2 = map.keySet();
		check2.forEach((e) -> System.out.println(e));

		Set<Entry<String, Integer>> check3 = map.entrySet();
		check3.forEach((e) -> System.out.println(e));
	}
}
