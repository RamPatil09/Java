package com.xworkz.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class AadharArrival {

	public static void main(String[] args) {
		Map<Long, String> map = new HashMap<Long, String>();
		map.put(219333582741L, "Ramangoud");
		map.put(412157336884L, "Hanamantu");
		map.put(564258736412L, "Xavier");
		map.put(421422208423L, "Xoxo");

		String check = map.get(421422208423L);
		System.out.println(check);

		boolean contain = map.containsKey(421422208423L);
		System.out.println(contain); 

		contain = map.containsValue("Xavier");
		System.out.println(contain);
		System.out.println(System.lineSeparator());
		
		Set<Long> check1 = map.keySet();
		check1.forEach((e) -> System.out.println(e));
		System.out.println(System.lineSeparator());
		
		Set<Entry<Long, String>> check2 = map.entrySet();
		check2.forEach((e) -> System.out.println(e));
	}
}
