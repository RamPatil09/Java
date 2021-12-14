import java.util.Scanner;

class MarriageUtil
{
	
	 public static void main(String a[])
	 {
		 Scanner sc = new Scanner(System.in);
		 System.out.println(" Enter the age");
		 String age = sc.next();
		 
		 String permit = Marriage.permit(Integer.parseInt(age));
		 System.out.println(permit);
		 
	 }
}