package com.xworkz.functionalInterface.email;

import com.xworkz.functionalInterface.email.functional.CheckingEmail;
import com.xworkz.functionalInterface.email.functional.CheckingItContainsCom;
import com.xworkz.functionalInterface.email.functional.CheckingItContainsIn;
import com.xworkz.functionalInterface.email.functional.Emails;
import com.xworkz.functionalInterface.rto.RtoArrival;

public class EmailArrival {

	public static void main(String[] args) {
		EmailsDAO emailsDAO = new EmailsDAO();
		emailsDAO.save("ramp051346@gmail.in");
		emailsDAO.save("ramangoudp43@gmail.com");
		emailsDAO.save("ramangoudpatil.xworkz@gmail.in");
		emailsDAO.save("2LB17ME009@gmail.com");
		
		Emails search = new CheckingEmail();
		Emails search2 = new CheckingItContainsCom();
		Emails search3 = new CheckingItContainsIn();
		
		
		boolean b = emailsDAO.find(search, "ramangoudp43@gmail.com");
		System.out.println(b);
		boolean c = emailsDAO.find(search, "2LB17ME009@gmail.com");
		System.out.println(c);
		
		System.out.println("****************************************************");
		
		boolean d = emailsDAO.find(search2, "ramangoudp43@gmail.com");
		System.out.println(d);
		boolean e = emailsDAO.find(search2, "2LB17ME009@gmail.com");
		System.out.println(e);
		boolean f = emailsDAO.find(search2, "2CS17ME009@gmail.com");
		System.out.println(f);

		System.out.println("****************************************************");
		
		boolean g = emailsDAO.find(search3, "ramangoudpatil.xworkz@gmail.in");
		System.out.println(g);
	boolean h = emailsDAO.find(search3, "ramangoudpatil.xwokz@gmail.in");
		System.out.println(h);
		
	
		
	}
}
