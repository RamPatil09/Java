class Exam
{
	 public static String universityName = "VTU";
	 
	 
	 public static void allow(String[] hallTicket)
	 {
		 System.out.println("Start of allow method with hallTicket");
		 if(hallTicket!= null)
		 {
			 getHallTicket(hallTicket);
		 }
		 else{
			 System.out.println("Your Hall Ticket is correct, you can erite exam");
		 }
		 System.out.println("end of allow method with hallTicket");
	 }
	 
	 public static void allow(int fees)
	 {
		 System.out.println(" Start of allow method with fees");
		 if(fees > 1295)
		 {
			 System.out.println("Fees is paid allow for exam" );
		 }
		 else{
			 System.out.println(" please pay the fees first");
		 }
		 System.out.println("end of allow method with fees");
	 }
	 
	 public static void getHallTicket(String[] hallTicket){
		 
		 for(int i=0; i<hallTicket.length ; i++){
			 
			 System.out.println(hallTicket[i]);
		 }
	 }
}