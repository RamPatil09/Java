import java.util.Scanner;

class Average
{
	 public static void main(String a[])
	 {
	     
		 System.out.println("Enter the numbers");
		 Scanner sc= new Scanner(System.in);
		 int total = 0;
		 int average;
		 int grade;
		 int counter = 0;
		 
		 while(counter < 5)
		 {
			 grade = sc.nextInt();
		     
			 total = total + grade;
			 counter ++;
	 }
	 
	 average = total/5;
	 System.out.println("your average is"+ average);
	 }
}	 