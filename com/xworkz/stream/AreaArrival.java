package com.xworkz.stream;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AreaArrival {

	public static void main(String[] args) {
		
		Stream<String> areaStream = Stream.of("Jayanagar","Basavanagudi","JP Nagar","Padmanabhanagar","Banashankari","Uttarahalli","Kumaraswamy","Girinagar","Rajajinagar","BTM","Mejastic","Kengeri");
		List<String> temp = areaStream.map(String::toLowerCase).sorted().collect(Collectors.toList());
		temp.forEach((n)->System.out.println(n));
		System.out.println("**************************************************");
		Stream<String> areaStream1 = Stream.of("Jayanagar","Basavanagudi","JP Nagar","Padmanabhanagar","Banashankari","Uttarahalli","Kumaraswamy","Girinagar","Rajajinagar","BTM","Mejastic","Kengeri");
		List<String> temp1 = areaStream1.map(String::toUpperCase).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		temp1.forEach((m)->System.out.println(m));
	}
}
