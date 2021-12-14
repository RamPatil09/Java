class Country{
	
	 static String[] countryName=new String[7];
	 static int[] noOfStates=new int[7];
     static String[] listOfCapitals=new String[7];
	 
         public static void main(String a[]){
		 
		  countryName[0]="India";
		  countryName[1]="Sri Lanka";
		  countryName[2]="England";
		  countryName[3]="South Africa";
		  countryName[4]="Pakistan";
		  countryName[5]="USA";
		  countryName[6]="china";
		  
		   getCountryName();
		
		 noOfStates[0]=29;
		 noOfStates[1]=11;
		 noOfStates[2]=25;
		 noOfStates[3]=21;
		 noOfStates[4]=19;
		 noOfStates[5]=35;
		 noOfStates[6]=32;
		 
		 getNoOFStates();
		
		  listOfCapitals[0]="NewDelhi";
          listOfCapitals[1]="Colombo";
          listOfCapitals[2]="London";
          listOfCapitals[3]="CapeTown";
          listOfCapitals[4]="Lahor";
          listOfCapitals[5]="Washington";
          listOfCapitals[6]="Beijing";	
		  
		  getListOfCapitals();

		 }
		 
		     public static void getCountryName()
			 {			 
				for(int p=0; p<countryName.length ; p++){
					System.out.println(countryName[p]);
			 }
			 }
			 
			 public static void getNoOFStates()
			 {
				for(int q=0 ; q<noOfStates.length ; q++){
					System.out.println(noOfStates[q]);
			 }
			 }
			 
			 public static void getListOfCapitals()
			 {
				for(int r=0 ; r<listOfCapitals.length ; r++){
					System.out.println(listOfCapitals[r]);
			 }
	}
}