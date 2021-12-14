class Airport{

     static String[] karnatakaInternationalAirports={"Kempegowda International Airport", "  Mangalore International Airport"};
     static String[] karnatakaDefenceAirports={"HAL Airport", "  Yelahanka Air Force Station", "  Chitradurga Aeronautical Test Range"};
	 static String[] karnatakaDomesticAirports={"Belgaum Airport", "  Bellary Airport", "  Jindal Vijaynagar Airport", "  Jakkur Airfield", "  Bidar Airport", "	Hubli Airport", "  Gulbarga Airport", "  Mysore Airport"};
     
	 public static void main(String a[]){
		 
		 getKarnatakaInternationalAirports();
		 getKarnatakaDefenceAirports();
		 getKarnatakaDomesticAirports();
		 
	 }
	 
	 public static String[] getKarnatakaInternationalAirports(){
		 for(int r=0 ; r<karnatakaInternationalAirports.length ; r++){
	     System.out.println(karnatakaInternationalAirports[r]);
		 
		 }
		 return karnatakaInternationalAirports;
	 }
		 
	 public static String[] getKarnatakaDefenceAirports(){
		 for(int b=0 ; b<karnatakaDefenceAirports.length ; b++){
		 System.out.println(karnatakaDefenceAirports[b]);
		 
		 }
		 return karnatakaDefenceAirports;
	 }
	 
	 public static String[] getKarnatakaDomesticAirports(){
	     for(int c=0 ; c<karnatakaDomesticAirports.length ; c++){
	     System.out.println(karnatakaDomesticAirports[c]);
		 
		 }
		 return karnatakaDomesticAirports;
		 
	 }

}