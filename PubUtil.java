import java.util.Scanner;
class PubUtil
{
 
 public static void main(String a[])
 {
   
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the age");
   String age= sc.next();
   
   String allow = Pub.allow(Integer.parseInt(age));
   System.out.println(allow);
   }
   }
   
   