package com.xworkz.equality;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

import com.xworkz.equality.dto.ProductDTO;

public class ProductArrival {

	public static void main(String[] args) {
		
		ProductDTO dto = new ProductDTO(1, "Realme", "Mobile", 19999.00, 1);
		ProductDTO dto1 = new ProductDTO(2, "Dell", "Laptop", 49999.00, 2);
		ProductDTO dto2 = new ProductDTO(3, "Boat", "Audio", 2999.00, 10);
		ProductDTO dto3 = new ProductDTO(4, "Philips", "Home Appliances", 1449.00, 4);
		ProductDTO dto4 = new ProductDTO(5, "Samsung", "Home Entertainment", 17499.00, 1);
		ProductDTO dto5 = new ProductDTO(6, "Asus", "Computers", 24999.00, 3);
		
		Set<ProductDTO> dtos = new LinkedHashSet<ProductDTO>();
		dtos.add(dto5);
		dtos.add(dto3);
		dtos.add(dto2);
		dtos.add(dto4);
		dtos.add(dto);
		dtos.add(dto1);
		
		boolean b = dto.equals(dto1);
		System.out.println(b);
		
		Optional<ProductDTO> optional = dtos.stream().filter((d)->d.getPrice()>10000.0).findFirst();
		System.out.println(dtos.size());
		System.out.println(optional);
	}
}
