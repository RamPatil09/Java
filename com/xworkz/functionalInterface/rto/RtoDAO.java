package com.xworkz.functionalInterface.rto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.xworkz.functionalInterface.rto.functional.RegisterNoSearch;


public class RtoDAO {

	private Collection<String> vehicalNumber = new ArrayList<>();
	
	public boolean save(String vehicalNum) {
		return vehicalNumber.add(vehicalNum);
	}
	
	public boolean find(RegisterNoSearch search, String arg) {
		Iterator<String> ite = vehicalNumber.iterator();
		while (ite.hasNext()) {
			String temp = ite.next();
			if( search.proannouncement(temp, arg)) {
				return true;
			}
		}
		return false;
	}
}
