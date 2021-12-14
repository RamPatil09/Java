class WatchBrands
{

     static String watchBrands[]=new String[5];
		 
		 
     public static void main(String a[])
	 {
		  watchBrands[0]="Rolex";
		  watchBrands[1]="Titan";
		  watchBrands[2]="Sonata";
		  watchBrands[3]="Fossil";
		  watchBrands[4]="Omega";
		  getWatchBrands();
	 }
		  
		 public static void getWatchBrands()
         {	
		     for(int z=0 ; z < watchBrands.length ; z++ )
			 {
			 System.out.println(watchBrands[z]);
		     }
	    }
}