import java.util.Scanner;

class EvenOdd
{ 
     public static void main(String a[])
	 {
		 
		 int number,remainder;
		 System.out.println("Enter an Integer Number.");
		 Scanner sc = new Scanner(System.in);
		 number = sc.nextInt();
		 
		 
		 remainder = number % 2;
		 
		 if(remainder == 0)
		 {
			 System.out.println("The entered number is Even.");
		 }
		 
		 else
		 {
			 System.out.println("The entered number is odd.");
		 }
	 }
}