package com.xworkz.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PnrNumberArrival {

	public static void main(String[] args) {
		
		Stream<Long> pnrStram = Stream.of(1035531998L,1943865199L,2083263001L,2002732103L,1912092799L,2023478917L,2032464715L,9765352008L,8771996311l,
			1914449614L,1345521992L,202452205L,2345087902L,2679724001L,1899531299L,20122921809L,2018654512L,2032109730L,1313341999L);
		
		List<Long> tempList = pnrStram.filter((pnr)->pnr>3600000000L).sorted().collect(Collectors.toList());
		tempList.forEach((p)->System.out.println(p));
	}
}
