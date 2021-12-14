import java.util.Scanner;
class ElectionUtil
{
	 static String[] voterCard = new String[2];
	 
	 static int age =15;
	 
	 public static void main(String a[])
	 {
		 
		 System.out.println("Main method started");
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter the Camdidate Name");
		 String candidateName = sc.next();
		 
		 System.out.println("Enter the age of candidate");
		 String candidateAge = sc.next();
		 
		 voterCard[0] = "candidateName";
		 voterCard[1] = "candidateAge";
		 
		 Election.allow (voterCard);
		 Election.allow (age);
	 }
}