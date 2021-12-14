class AmazonPrime
{
     static String movies[] = {"Roberrt", "Yuvaratna", "JaatiRatnalu", "RakthaCharitra", "Shershaha", "KGF", "Phir Hera Pheri", "Master", "Cindrella"};
	 static String seriess[] = {"Mirzapur", "Mumbai Dairies", "The Family Man", "Four More Shots", "Vampire Dairies"};
	 static String movie = "Dia";
	 static String series= "Viking";

     public static void main (String a[])
     {	 
	 
	     System.out.println("main method started");
		 getMovies(movies);
		 String movies = getMovies(movie);
		 System.out.println(movies);
		 System.out.println("get Movies method ended");
		 
		 getSeriess(seriess);
		 String seriess = getSeriess(series);
		 System.out.println(seriess);
		 System.out.println("get Seriess method ended");
		 
	 } 
	 
	 public static void getMovies(String[] Movies)
	 {
		 
		 System.out.println("inside get Movies method started with String array parameters");
		 
		 for (int i=0;i<movies.length;i++)
		 {
			 
			 System.out.println(movies[i]);
		 
		 }
		
	 }
	 
	 public static String getMovies(String movies)
	 {
		 
		 System.out.println("inside getMovies method");
		 return movies;
		 
	 }
	 
	 public static void  getSeriess(String[] Seriess)
	 {
		 
		 System.out.println(" inside get Seriess method started with String array parameters");
		 
		 for(int a=0;a<seriess.length;a++)
		 {
			
			System.out.println(seriess[a]);
		 
		 }
	 }
	 
	 public static String getSeriess(String series)
	 {
		 
		 System.out.println("inside get Series method");
		 return series;
	
	}
	
}