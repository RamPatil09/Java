package com.xworkz.streamdto;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.xworkz.streamdto.dto.HeadPhoneDTO;

public class HeadPhoneArrival {

	public static void main(String[] args) {
		
		HeadPhoneDTO dto = new HeadPhoneDTO(1, "Boat", "Wireless", "235v2", 999.0);
		HeadPhoneDTO dto2 = new HeadPhoneDTO(2, "Realme", "Wireless", "Buds Q2", 1299.0);
		HeadPhoneDTO dto3 = new HeadPhoneDTO(3, "MAONO", "Wired", "AU-MH501", 2404.0);
		HeadPhoneDTO dto4 = new HeadPhoneDTO(4, "ZEBRONICS", "Wired", "Zeb-Iron", 2699.0);
		HeadPhoneDTO dto5 = new HeadPhoneDTO(5, "Noise", "Wireless", "Air Buds", 2271.0);
		
		Stream<HeadPhoneDTO> headPhone = Stream.of(dto,dto2,dto3,dto4,dto5);
		headPhone.filter((mod)->mod.getType().equals("Wireless")).sorted((e1,e2)->e1.getId().compareTo(e2.getId())).map((h)->h.getModel()).collect(Collectors.toList()).forEach((p)->System.out.println(p));
		System.out.println(System.lineSeparator());
		Stream<HeadPhoneDTO> headPhone1 = Stream.of(dto,dto2,dto3,dto4,dto5);
		headPhone1.filter((mod)->mod.getType().equals("Wired")).sorted((e1,e2)->e1.getBrand().compareTo(e2.getBrand())).collect(Collectors.toList()).forEach((p)->System.out.println(p));
	}
}
