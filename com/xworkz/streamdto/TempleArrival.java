package com.xworkz.streamdto;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.xworkz.streamdto.dto.TempleDTO;

public class TempleArrival {

	public static void main(String[] args) {
		
		TempleDTO dto = new TempleDTO(1, "Venkateshwar", "Tirumala", 40000);
		TempleDTO dto2 = new TempleDTO(2, "Manjunatha swami", "Dharmasthala", 10000);
		TempleDTO dto3 = new TempleDTO(3, "Krishna", "Udupi", 8000);
		TempleDTO dto4 = new TempleDTO(4, "Mahalaxmi", "Kolhapur", 20000);
		TempleDTO dto5 = new TempleDTO(5, "Shiva", "Kedarnath", 30000);
		
		Stream<TempleDTO> temple = Stream.of(dto,dto2,dto3,dto4,dto5);
		
		temple.filter((visit)->visit.getVisitorsPerday()>10000).sorted((e1,e2)->e2.getVisitorsPerday().compareTo(e1.getVisitorsPerday())).collect(Collectors.toList()).forEach((f)->System.out.println(f));
	}
}
