package com.xworkz.functionalInterface.email;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.xworkz.functionalInterface.email.functional.Emails;

public class EmailsDAO {

	private Collection<String> emails = new ArrayList<>();
	
	public boolean save(String email) {
		return emails.add(email);
	}
	
	public boolean find(Emails emailsCheck, String arg1) {
		Iterator<String> ite = emails.iterator();
		while (ite.hasNext()) {
			String temp = ite.next();
			if (emailsCheck.expression(temp, arg1)) {
				return true;
			}
		}
				return false;
	}
	
}
