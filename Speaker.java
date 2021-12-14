class Speaker
{
	 static String name = "Boat";
	 static int minVolume = 0;
	 static int maxVolume = 15;
	 static boolean isConnected = false;
	 static int currentVolume = 0;
	 
	 public static boolean onOrOff()
	 {
		 System.out.println("method started inside onOrOff()");
		 if(isConnected == false)
		 {
			 isConnected = true;
			 System.out.println("Speaker is turned on");
		     return isConnected;
		 }
		 else
		 {
			 isConnected = false;
			 System.out.println("Speaker is turned off");
			 System.out.println("method ended inside onOrOff()");
			 return isConnected;
		 }
	 }
	 
	 public static void increaseVolume()
	 {
		 System.out.println("method started inside increaseVolume()");
		 if(isConnected)
		 {
			 if(currentVolume < maxVolume)
			 {
				 currentVolume = currentVolume + 1;
				 System.out.println("The current Volume is:" +currentVolume);
				 System.out.println("method ended inside increaseVolume()");
			 }
			 else
			 {
				 System.out.println("Max Volume reached.....");
				 
			 }
		 }
	 }
		 
	 public static void decreaseVolume()
	 {
	     System.out.println("Method started inside decreaseVolume()");
		 if(isConnected)
		 {
				 if(currentVolume > minVolume)
				 {
					 currentVolume = currentVolume - 1;
					 System.out.println("The currentVolume is: " +currentVolume);
					 System.out.println("Method ended inside decreaseVolume()");
				 }
				 else
				 {
					 System.out.println("Minimum volume reached....");
				 }
		 }
	 } 
}		