class Temples{

     static String[] templeName={"ISKCON Temple", "Big Bull Temple and Ganesh Temple", "Gavi Gangadhareshwara Temple (Gavipuram Cave Temple)", "Someshwara Temple", "Nageshwara Temple Complex"};
	 static String[]  templeAddress={"Hare Krishna Hill, Chord Rd, 1st R Block, Rajajinagar, Bengaluru, Karnataka 560010, India", "Bull Temple Rd, Basavanagudi, Bengaluru, Karnataka 560004, India", "Gavipuram Extention, Kempegowda Nagar, Bengaluru, Karnataka 560019, India", "VJX5+X84, Anugraha Layout, Ramanashree Enclave, Bilekahalli, Bengaluru, Karnataka 560076, India", "Begur Main Rd, Begur, Bengaluru, Karnataka 560076, India"};
    
	public static void main(String a[]){
		 
		 getTempleName();
		 getTempleAddress();
		 
		 }
		 
		 public static void getTempleName(){
		 System.out.println(templeName[0] + " " + templeName[1] + " " + templeName[2] + " " + templeName[3] + " " + templeName[4]);
		 }
		 
		 public static void getTempleAddress(){
         System.out.println(templeAddress[0] + " " + templeAddress[1] + " " + templeAddress[2] + " " + templeAddress[3] + " " + templeAddress[4]);
		 }
 }