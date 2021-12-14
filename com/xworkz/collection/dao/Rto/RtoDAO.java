package com.xworkz.collection.dao.Rto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class RtoDAO {

	private Collection<String> vehicalNumberColl = new ArrayList<>();
	
	public boolean save(String vehicalNo) {
		return vehicalNumberColl.add(vehicalNo);
	}
	
	public boolean find(String vehicalNo) {
		return vehicalNumberColl.contains(vehicalNo);
	}
	
	public boolean findByCaseInSensetive(String no) {
		Iterator<String> itr = vehicalNumberColl.iterator();
		while(itr.hasNext()) {
			String tempNo = itr.next();
			if(tempNo.equalsIgnoreCase(no)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean findByCaseInSensetiveAndSpace(String vehicalNum) {
		Iterator<String> itr = vehicalNumberColl.iterator();
		while(itr.hasNext()) {
			String tempNo = itr.next();
			tempNo = tempNo.replace(" ", "");
			if(tempNo.equalsIgnoreCase(vehicalNum.replace(" ", ""))) {
				return true;
			}
		}
		return false;
	}
	
}
