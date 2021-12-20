package com.xworkz.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AtmPinArrival {

	public static void main(String[] args) {
		Stream<Integer> atmStream = Stream.of(1346,7277,8642,8967,5320,8934,8736,7653,7532,8654,8454,2345,5754,8954,3233,5345,5675,4234,6875,7567,2545,9853,5342);
		List<Integer> temp = atmStream.filter((atm)->atm>1400).sorted().collect(Collectors.toList());
		temp.forEach((p)->System.out.println(p));
		 
	}
}
