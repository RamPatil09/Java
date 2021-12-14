class Telecommunication
{

     public static String simCard="Telecommunication";
	 public static String[] aadharCard={"Xavier", "21xx xxxx xx81", "0x 0x 199x"};
	 public static int age=21;
	 
	 public static boolean allow(String [] aadharCard)
	 {
	 
	 boolean allowedToProvied=false;
	     System.out.println("Inside allow method");
	 if(age > 18)
	 {
		 System.out.println("age is correct show me the aadharCard");
	  
	  if(aadharCard != null)
	  {
	     
		 allowedToProvied=true;
		 getaadharCard(aadharCard);
		 return allowedToProvied;
		 
		 
	  }
	  
	 else{
		  
		  System.out.println("No aadharCard !!! cannot allowed to Provied");
		  
	     }
	  
	 }
	  
	 else{
		  
		  System.out.println("Abey saale... chal nikal yahaan se");
		  
	 }
	     System.out.println("end of allow method");
		 
	     return allowedToProvied;
	  
	 }
	 
	 public static void getaadharCard(String[] aadharCard)
	 {
		 
		 System.out.println("allow method started");
		 
		 for(int i=0 ; i < aadharCard.length ; i++)
		 {
			 System.out.println(aadharCard[i]);
		 }
		 
		  System.out.println("allow method ended");
	 }
}
	  