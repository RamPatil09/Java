package com.xworkz.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PincodeArrival {

	public static void main(String[] args) {
		
		Stream<Integer> pinCodeStream = Stream.of(587113,587313,560002,560008,591312,587302,586101,	591304,573214,573102,573116,587111,	587201,	586126,	587330,	591102,590001,591129,591143);
		
	List<Integer> temp = pinCodeStream.filter((pin)->pin>585050).sorted().collect(Collectors.toList());
	
	temp.forEach((p)->System.out.println(p));
	}
}
