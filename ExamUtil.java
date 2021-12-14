import java.util.Scanner;
class ExamUtil
{
	 
     static String[] hallTicket = new String[3];
	 
	 static int fees = 1350;
     
	 public static void main(String a[])
	 {
		 System.out.println("main method started");
		 Scanner sc = new Scanner(System.in);
		  
		 System.out.println("Enter the candidate Name");
		 String CandidateName = sc.next();
		  
		 System.out.println("Enter the candidate USN");
		 String CandidateUsn = sc.next();
		  
		 System.out.println("Enter the candidate Subject");
		 String CandidateSubject = sc.next();
		  
		  hallTicket[0] = CandidateName;
		  hallTicket[1] = CandidateUsn;
		  hallTicket[2] = CandidateSubject;
		  
		  Exam.allow(hallTicket);
		  Exam.allow(fees);
		  
		  System.out.println("Main method ended");
		  
	 }
	 
}