class Ncr
{  
     public static void main(String args[])
	 {
		 int n = 10;
		 int r = 5;
		 int nCr=fact(n)/(fact(r)*fact(n-r));
		 System.out.println("the ncr value is " +nCr);
	 }
	 
	public static int fact(int num)
		{
			int fact=1;
			for( int i=1 ; i<=num ; i++)
			fact= fact*i;
		{
			return fact;   
		}
			 
		}
		 
}
			 
		 