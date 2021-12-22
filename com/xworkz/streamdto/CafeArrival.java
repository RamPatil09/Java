package com.xworkz.streamdto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.xworkz.streamdto.dto.CafeDTO;

public class CafeArrival {

	public static void main(String[] args) {
		 CafeDTO dto1 = new CafeDTO(1, "Onesta", "IndiraNagar", "veg", 4.1);
		 CafeDTO dto2 = new CafeDTO(2, "Starbucks", "Koramangala", "Both", 4.2);
		 CafeDTO dto3 = new CafeDTO(3, "McDonald's", "Marathahalli", "Non", 4.4);
		 CafeDTO dto4 = new CafeDTO(4, "Maddy's Katti Cafe", "Rajajinagar", "Veg", 3.9);
		 CafeDTO dto5 = new CafeDTO(5, "TLP Cafe", "Malleswara", "Non", 3.7);
		 
		 Stream<CafeDTO> cafe = Stream.of(dto1,dto2,dto3,dto4,dto5);
		 cafe.filter((rating)->rating.getRatings()>3).sorted((e1,e2)->e2.getRatings().compareTo(e1.getRatings())).map((v)->v.getName()).collect(Collectors.toList())
		 .forEach((n)->System.out.println(n));
	}
}