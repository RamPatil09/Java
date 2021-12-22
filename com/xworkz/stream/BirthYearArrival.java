package com.xworkz.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BirthYearArrival {

	public static void main(String[] args) {
		
		Stream<Integer> birthYear = Stream.of(1999,1998,2000,1997,1999,1996,1994,2000,2001,2000,1999,2002,1999,2003,2004,1998,1994,1964,1978,1999,1998);
		List<Integer> temp = birthYear.filter((year)->year>1998).sorted().collect(Collectors.toList());
		temp.forEach((birth)->System.out.println(birth));
	}
}
