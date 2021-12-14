class ShoppingMalls{

     static String[] mallsName={"UB City", "Phoenix Marketcity", "Orion Mall", "Bangalore Central Mall", "Mantri Square"};
	 static String[] owner={"Vijay Mallya", "The Phoenix Mills Co. Ltd.", "Brigade Group", "Future Lifestyle Fashion of Future Group", "Sushil Mantri"};
    
	 public static void main(String a[]){
		 
		 getMallsName();
		 getOwner();
	 }
	 
	 public static void getMallsName(){
		 for(int p=0 ; p<mallsName.length ; p++){
		     System.out.println(mallsName[p]);
		     }
	 }
		 
	 public static void getOwner(){	 
		 for(int q=0 ; q<owner.length ; q++){
		     System.out.println(owner[q]);
		     }
	 }
		 
}
	 