class IPL{
	
	 static String[] teamName={"Royal Challengers Bangalore", "Chennai Super Kings", "Delhi Capitals", "Kolkata Knight Riders", "Mumbai Indians", "Punjab Kings", "Rajasthan Royals", "Sunrisers Hyderabad"};
	 static String[] owner={"Royal Challengers Sports Private Ltd","Chennai Super Kings Cricket ltd.", "GMR Sports Pvt .Ltd & JSW Sports Pvt Ltd", "Knight Riders Sports Private Ltd", " Indiawin Sports Pvt. Ltd", "KPH Dream Cricket Private Limited", "Royal Multisport Pvt. Ltd", "SUN TV Network"};
     static String[] captain={"Virat Kohli","MS Dhoni", "Rishabh Pant", "Eoin Morgan", "Rohit Sharma", "KL Rahul", "Sanju Samson", "Kane Williamson"};
	 static String[] venue={"M. Chinnaswamy Stadium","M. A. Chidambaram Stadium", "Arun Jaitley Stadium", "Eden Gardens", "Wankhede Stadium", "IS Bindra Stadium", "Sawai Mansingh Stadium", "Rajiv Gandhi Intl. Cricket Stadium"};
	 static int[] homeVenueCapacity={40000,50000,41820,68000,33108,26001,30000,55000};
	 static byte[] noOfVictory={0,3,0,2,5,0,1,1};
	 
	 public static void main(String a[]){
		 
		 getTeamName();
		 getOwner();
		 getCaptain();
		 getVenue();
		 getHomeVenueCapacity();
		 getNoOfVictory();
		 
		 
		 }
		     
	     public static void getTeamName(){
		     for(int p=0 ; p<teamName.length ; p++){
			     System.out.print(teamName[p] + "  " );
			     }
				
			 }
		 
		 public static void getOwner(){
		     for(int q=0 ; q<owner.length ; q++){
	             System.out.print(owner[q] + "  " );
		         }
				
		 }
		 
		 public static void getCaptain(){
		     for(int r=0 ; r<captain.length ; r++){
                 System.out.print(captain[r] + "  " );
		         }
				 
		 }
		 
		 public static void getVenue(){
		     for(int s=0 ; s<venue.length ; s++){
                 System.out.print(venue[s] + "  ");
		         }
				
		  }
		 
		 public static void getHomeVenueCapacity(){
		     for(int t=0 ; t<homeVenueCapacity.length ; t++){
		         System.out.print(homeVenueCapacity[0] + "  ");
		         }
				
		  }
		         
		 public static void getNoOfVictory(){
		     for(int u=0 ; u<noOfVictory.length ; u++){
		         System.out.print(noOfVictory[u] + "  " );
		         }
				 
		 
		 }
	
	 }