package com.xworkz.equality;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import com.xworkz.equality.dto.HockyDTO;

public class HockyArrival {

	public static void main(String[] args) {
		
		HockyDTO dto = new HockyDTO("Bharat Army", 81, 12, "India");
		HockyDTO dto1 = new HockyDTO("The Kookaburras", 69, 19, "Australia");
		HockyDTO dto2 = new HockyDTO("Kenya Hockey Union", 10, 4, "Kenya");
		HockyDTO dto3 = new HockyDTO("Oranje", 59, 21, "Netherland");
		HockyDTO dto4 = new HockyDTO("Redsticks", 19, 8, "Spain");
		HockyDTO dto5 = new HockyDTO("Green Shirts", 60, 22, "Pakistan");
		
		Set<HockyDTO> dtos = new LinkedHashSet<HockyDTO>();
		dtos.add(dto5);
		dtos.add(dto3);
		dtos.add(dto1);
		dtos.add(dto);
		dtos.add(dto4);
		dtos.add(dto2);
		boolean b = dto5.equals(dto2);
		System.out.println(b);
		Optional<HockyDTO> optional =  dtos.stream().filter((e)->e.getWins()>30).sorted((e1,e2)->e2.getTeamName().compareTo(e1.getTeamName())).findFirst();
		System.out.println(dtos.size());
		System.out.println(optional);
	}
}
