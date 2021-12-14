class Age
{

     public static String generation(int age)
	 {
		 
		 if (age > 60)
		 {
			 return "You are Senior Citizen";
		 }
		 
		 else if (age > 45)
		 {
			 return "You are a Old Adults";
		 }
		 
		 else if (age > 31)
		 {
			 return "You are a Middle aged Adults";
		 }
		 
		 else if (age > 17)
		 {
			 return "You are a Young Adult";
		 }
		 
		 else if (age > 3)
		 {
			 return "You are a Childern";
		 }
		 
		 else
		 { 
	         return "You are a Baby";
		 }
		 
	 }
}