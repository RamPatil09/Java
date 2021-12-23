package com.xworkz.equality;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

import com.xworkz.equality.dto.CompanyDTO;

public class CompanyArrival {

	public static void main(String[] args) {
		
		CompanyDTO dto = new CompanyDTO(1, "Wipro", "Thierry Delaporte", 201508995550.00);
		CompanyDTO dto1 = new CompanyDTO(2, "Capgemini", "Aiman Ezzat", 1344166560000.00);
		CompanyDTO dto2 = new CompanyDTO(3, "Cognizant", "Brian Humphries", 1389589575000.00);
		CompanyDTO dto3 = new CompanyDTO(4, "Accenture", "Julie Sweet ", 3793203975000.00);
		CompanyDTO dto4 = new CompanyDTO(5, "Eurofins", "Gilles G. Martin", 458303400000.00);
		CompanyDTO dto5 = new CompanyDTO(6, "Oracle", "Shailender Kumar", 728620350000.00);
		CompanyDTO dto6 = new CompanyDTO(6, "Oracle", "Shailender Kumar", 728620350000.00);
		
		Set<CompanyDTO> dtos = new LinkedHashSet<CompanyDTO>(); 
		dtos.add(dto5);
		dtos.add(dto3);
		dtos.add(dto1);
		dtos.add(dto4);
		dtos.add(dto);
		dtos.add(dto2);
		dtos.add(dto6);
		
		boolean b = dto5.equals(dto6);
		System.out.println(b);
	
		Optional<CompanyDTO> optional = dtos.stream().filter((w)->w.getTurnOver()>140000000000.00).findFirst();
		System.out.println(dtos.size());
		System.out.println(optional);
	}
}
