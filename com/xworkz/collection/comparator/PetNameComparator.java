package com.xworkz.collection.comparator;

import java.util.Comparator;
import com.xworkz.collection.setinterface.PetDTO;

public class PetNameComparator implements Comparator<PetDTO>{

	@Override
	public int compare(PetDTO o1, PetDTO o2) {
		// TODO Auto-generated method stub
		return Integer.parseInt(o1.getName()) - Integer.parseInt(o2.getName());
	}

	

}
