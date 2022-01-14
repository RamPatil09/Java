package com.xworkz.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MonthMapArrival {

	public static void main(String[] args) {

		Map<String, Integer> monthMap = new HashMap<String, Integer>();
		monthMap.put("January", 31);
		monthMap.put("February", 28);
		monthMap.put("March", 31);
		monthMap.put("April", 30);
		monthMap.put("May", 31);
		monthMap.put("June", 30);
		monthMap.put("July", 31);
		monthMap.put("August", 30);
		monthMap.put("Septmber", 31);
		monthMap.put("October", 30);
		monthMap.put("November", 31);
		monthMap.put("December", 30);

		Set<String> set = monthMap.keySet();
		set.forEach((e) -> System.out.println(e));
		System.out.println("\n");

		Collection<Integer> collection = monthMap.values();
		collection.forEach((e) -> System.out.println(e));
		System.out.println("\n");

		Set<Map.Entry<String, Integer>> entries = monthMap.entrySet();
		Iterator<Entry<String, Integer>> iterator = entries.iterator();
		while (iterator.hasNext()) {
			Map.Entry<String, Integer> entry = iterator.next();
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

		System.out.println("\n");
		System.out.println("After Asending");
		System.out.println("=============================================================");

		Map<String, Integer> monthMa = new TreeMap<String, Integer>((e, e1) -> e.compareTo(e1));
		monthMa.putAll(monthMap);

		Set<String> set2 = monthMa.keySet();
		set2.forEach((e) -> System.out.println(e));
		System.out.println("\n");

		Collection<Integer> collection2 = monthMa.values();
		collection2.forEach((e) -> System.out.println(e));
		System.out.println("\n");

		Set<Map.Entry<String, Integer>> entries2 = monthMa.entrySet();
		Iterator<Entry<String, Integer>> iterator2 = entries2.iterator();
		while (iterator2.hasNext()) {
			Map.Entry<String, Integer> entry = iterator2.next();
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

		System.out.println("\n");
		System.out.println("After Descending");
		System.out.println("=============================================================");

		Map<String, Integer> month = new TreeMap<String, Integer>((e, e1) -> e1.compareTo(e));
		month.putAll(monthMap);

		Set<String> set3 = month.keySet();
		set3.forEach((e) -> System.out.println(e));
		System.out.println("\n");

		Collection<Integer> collection3 = month.values();
		collection3.forEach((e) -> System.out.println(e));
		System.out.println("\n");

		Set<Map.Entry<String, Integer>> entries3 = month.entrySet();
		Iterator<Entry<String, Integer>> iterator3 = entries3.iterator();
		while (iterator3.hasNext()) {
			Map.Entry<String, Integer> entry = iterator3.next();
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

	}
}
