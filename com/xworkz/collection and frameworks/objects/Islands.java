package com.xworkz.tasks.objects;

import java.util.ArrayList;
import java.util.Collection;

public class Islands {

	public static void main(String[] args) {
		Collection collection=new ArrayList<>();
		collection.add("Andaman");
		collection.add("Nikobar");
		collection.add("snt mery island");
		
		collection.forEach(System.out::println);
	}
}
