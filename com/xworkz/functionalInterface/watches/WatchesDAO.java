package com.xworkz.functionalInterface.watches;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.xworkz.functionalInterface.watches.functional.WatchSearch;

public class WatchesDAO {

	private Collection<String> watchesName = new ArrayList<>();
	
	public boolean add(String name) {
		return watchesName.add(name);
	}
	
	public boolean find(WatchSearch search, String name) {
		for (String watch : watchesName) {
			if(search.proannouncement(watch, name)) {
				return true;
			}
		}
		return false;
	}
	
}
