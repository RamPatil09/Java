package com.xworkz.functionalInterface.watches;

import com.xworkz.functionalInterface.watches.functional.WatchSearch;

public class WatchesArrival {

	public static void main(String[] args) {
		WatchesDAO dao = new WatchesDAO();
		dao.add("Titan");
		dao.add("Realme");
		dao.add("Fast Track");
		dao.add("Rolex");
		dao.add("Omega");
		dao.add("Blancpain");
		
		WatchSearch search = new WatchSearch() {
			
			@Override
			public boolean proannouncement(String arg1, String arg2) {
				System.out.println("Invoked equals method");
				if(arg1.equalsIgnoreCase(arg2)) return true;
				return false;
			}
		}; 
		
		boolean searched = dao.find(search, "Fast Track");
		System.out.println(searched);
		
		searched = dao.find((a,b)->a.startsWith(b), "R");
		System.out.println("Start with is present?");
		System.out.println(searched);
		
		//lambda expression
		searched = dao.find((f, b)->f.endsWith(b), "e");
		System.out.println("Ends with is present?");
		System.out.println(searched);
		
		searched = dao.find((r,t)->(r.substring(0, 2)).equalsIgnoreCase(t), "RO");
		System.out.println("Matching starting chars");
		System.out.println(searched);
		
		
	}
}
