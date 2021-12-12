package com.xworkz.functionalInterface.president;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import com.xworkz.functionalInterface.president.dto.PresidentDTO;
import com.xworkz.functionalInterface.president.functional.*;

public class PresidentDAO {

	private Collection president = new ArrayList<>();
	
	public boolean add(PresidentDTO dto) {
		return president.add(dto);
	}
	
	public boolean find(PresidentSearch pre, String name) {
		int i=0;
		Iterator ite = president.iterator();
		while(ite.hasNext()) {
			PresidentDTO dto = (PresidentDTO) ite.next();
			if(pre.proannouncement(dto, name)){
				System.out.println(dto);
				i++;
			}
		}
		if(i>0) {
			System.out.println(i);
			return true;
		}
		return false;
		
	}
	

}
