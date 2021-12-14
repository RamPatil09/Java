class Election
{
	 public static String Lokasabha = "Election";
	 
	 
	 public static void allow(String[] voterCard)
	 {
		 System.out.println(" allow method started with VoterCard");
		 if(voterCard != null)
		 {
			 getVoterCard(voterCard);
		 }
		 else{
			 
			System.out.println("VoterCard is not available");
		 }
		 System.out.println("end of allow method with VoterCard");
	 }
	 
	 public static void allow(int age)
	 {
		 System.out.println("Allow method started with age"); 
		 if(age > 18)
		 {
			 System.out.println("Age is correct you can Vote");
			 
		 }
		 else{
			 System.out.println("Age is not correct !!! come after 17 Age");
		 }
		 System.out.println("Allow method ended with Age");
	 }
	     
		 public static void getVoterCard(String[] voterCard)
		 {
			 for(int i=0; i < voterCard.length ; i++)
			 {
				 System.out.println(voterCard[i]);
			 }
		 }
}
