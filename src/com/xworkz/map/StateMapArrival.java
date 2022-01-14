package com.xworkz.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class StateMapArrival {

	public static void main(String[] args) {

		Map<String, Integer> stateMap = new HashMap<String, Integer>();
		stateMap.put("KARANATAKA", 1);
		stateMap.put("ANDAMAN AND NICOBAR ISLANDS", 3);
		stateMap.put("ANDHRA PRADESH", 13);
		stateMap.put("ARUNACHAL PRADESH", 25);
		stateMap.put("ASSAM", 33);
		stateMap.put("BIHAR", 38);
		stateMap.put("DELHI", 11);
		stateMap.put("GOA", 2);
		stateMap.put("CHANDIGARH", 1);
		stateMap.put("CHHATTISGARH", 28);
		stateMap.put("WEST BENGAL", 23);
		stateMap.put("TRIPURA", 8);
		stateMap.put("UTTARAKHAND", 13);
		stateMap.put("PUDUCHERRY", 4);
		stateMap.put("UTTAR PRADESH", 75);
		stateMap.put("TELANGANA", 33);
		stateMap.put("SIKKIM", 4);
		stateMap.put("PUNJAB", 23);
		stateMap.put("RAJASTHAN", 33);
		stateMap.put("TAMIL NADU", 38);
		stateMap.put("NAGALAND", 12);

		Set<String> keys = stateMap.keySet();
		Iterator<String> itr = keys.iterator();
		while (itr.hasNext()) {
			String map = itr.next();
			System.out.println(map);
		}
		System.out.println("\n");
		Collection<Integer> values = stateMap.values();
		Iterator<Integer> itrr = values.iterator();
		while (itrr.hasNext()) {
			Integer maps = itrr.next();
			System.out.println(maps);
		}
		System.out.println("\n");
		Set<Map.Entry<String, Integer>> both = stateMap.entrySet();
		Iterator<Map.Entry<String, Integer>> both1 = both.iterator();
		while (both1.hasNext()) {
			Map.Entry<String, Integer> entry = both1.next();
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

		System.out.println("\n");
		System.out.println("After Asending");
		System.out.println("=============================================================");

		Map<String, Integer> state = new TreeMap<String, Integer>((ele1, ele2) -> ele1.compareTo(ele2));

		state.putAll(stateMap);

		Set<String> key = state.keySet();
		Iterator<String> i = key.iterator();
		while (i.hasNext()) {
			String map = i.next();
			System.out.println(map);
		}
		System.out.println("\n");
		Collection<Integer> value = state.values();
		Iterator<Integer> it = value.iterator();
		while (it.hasNext()) {
			Integer ma = it.next();
			System.out.println(ma);
		}
		System.out.println("\n");
		Set<Map.Entry<String, Integer>> both2 = state.entrySet();
		Iterator<Map.Entry<String, Integer>> both3 = both2.iterator();
		while (both3.hasNext()) {
			Map.Entry<String, Integer> entr = both3.next();
			System.out.println(entr.getKey() + " " + entr.getValue());
		}

		System.out.println("\n");
		System.out.println("After Desending");
		System.out.println("=============================================================");

		Map<String, Integer> sta = new TreeMap<String, Integer>((ele1, ele2) -> ele2.compareTo(ele1));

		sta.putAll(stateMap);

		Set<String> keyss = sta.keySet();
		Iterator<String> ii = keyss.iterator();
		while (ii.hasNext()) {
			String mapy = ii.next();
			System.out.println(mapy);
		}
		System.out.println("\n");
		Collection<Integer> valuess = sta.values();
		Iterator<Integer> itt = valuess.iterator();
		while (itt.hasNext()) {
			Integer m = itt.next();
			System.out.println(m);
		}
		System.out.println("\n");
		Set<Map.Entry<String, Integer>> bot = sta.entrySet();
		Iterator<Map.Entry<String, Integer>> bo = bot.iterator();
		while (bo.hasNext()) {
			Map.Entry<String, Integer> ent = bo.next();
			System.out.println(ent.getKey() + " " + ent.getValue());
		}
	}
}
