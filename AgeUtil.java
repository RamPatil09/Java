import java.util.Scanner;
 
class AgeUtil
{
	 public static void main(String a[])
	 {
		 
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the Age");
		 String age = sc.next();
		 
		 String generation = Age.generation(Integer.parseInt(age));
		 System.out.println(generation);
		 
	 }
	 
}