package com.xworkz.collection.listinterface;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;

public class LinkedTester {

	public static void main(String[] args) {
		List list = new LinkedList<>();
		list.add("KGF");
		list.add("Huliya");
		list.add("Sakat");
		
		System.out.println("Iterator op is below");
		
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			String str = (String) itr.next();
			System.out.println(str);
		}
		System.out.println("****************************************");
		
		System.out.println("ListInterface hasPrevious() op is below");
		ListIterator iterator=list.listIterator();
		while(iterator.hasPrevious()) {
			Object object=iterator.next();
			System.out.println(object);
		}
		System.out.println("****************************************");
		
		System.out.println("ListInterface hasNext() op is below");
		ListIterator iterator2=list.listIterator();
		while(iterator2.hasNext()) {
			Object object2 = iterator2.next();
			System.out.println(object2);
		}
		System.out.println("****************************************");
		System.out.println("Forward direction data");
		
		ListIterator iterator3 = list.listIterator();
		while(iterator3.hasNext()) {
			Object object3 = iterator3.next();
			System.out.println(object3);
		}
		System.out.println("****************************************");
		System.out.println("Backward direction data");
		
		while(iterator3.hasPrevious()) {
			System.out.println(iterator3.previous());
		}
	}
}
