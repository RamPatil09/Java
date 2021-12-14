class Factorial
{  

     public static void main(String a[])
	 {
		 System.out.println("main method started");
		 factorial(8);
		 factorial(9);
		 factorial(4);
		 
		 System.out.println("main method ended"); 
	 }
	 
	     public static void factorial(int num)
		 {
			 System.out.println("factorial method started");
			 
			 int fact=1;
			 for( int i=1 ; i<=num ; i++)
				 fact= fact*i;
			 { 
				System.out.println(fact);
				System.out.println("factorial method ended");  
			 }
			 
		 } 
}	 