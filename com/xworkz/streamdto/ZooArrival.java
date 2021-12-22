package com.xworkz.streamdto;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.xworkz.streamdto.dto.ZooDTO;

public class ZooArrival {

	public static void main(String[] args) {
		
		ZooDTO dto = new ZooDTO(1, "Sri Chamarajendra Zoological Gardens", "karanataka", 100.0);
		ZooDTO dto2 = new ZooDTO(2, "National Zoological Park", "New Delhi", 80.0);
		ZooDTO dto3 = new ZooDTO(3, "Arignar Anna Zoological Park", "Tamil Nadu", 500.0);
		ZooDTO dto4 = new ZooDTO(4, "Nehru Zoological Park", "Hydrabad", 50.0);
		ZooDTO dto5 = new ZooDTO(5, "Nandankanan Zoological Park", "Odisha", 100.0);
		
		Stream<ZooDTO> zoo1 = Stream.of(dto,dto2,dto3,dto4,dto5);
			zoo1.filter((pr)->pr.getTicketPrice()>80).sorted((e1,e2)->e2.getTicketPrice().compareTo(e1.getTicketPrice())).collect(Collectors.toList()).forEach((p)->System.out.println(p));
	}
}