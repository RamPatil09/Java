class Engineer
{

     static String specializations[] = new String[5];
	 static int enrollmentsPerYear[] = new int[5];
	 
     public static void main(String a[])
	 {
	 
	     
		 specializations[0]="Mechanical Engineering";
		 specializations[1]="Computer Science Engineering";
		 specializations[2]="Electronics Engineering";
		 specializations[3]="Civil Engineering";
		 specializations[4]="Electrical Engineering";
		 getSpecializations();
		 
		 enrollmentsPerYear[0]=880000;
		 enrollmentsPerYear[1]=830000;
		 enrollmentsPerYear[2]=650000;
		 enrollmentsPerYear[3]=590000;
		 enrollmentsPerYear[4]=418000;
		 getEnrollMentsPerYear();
		 
	 } 
	 
	     public static void getSpecializations()
		 {
		     for(int s=0 ; s<specializations.length ; s++)
		     { 
				System.out.println(specializations[s]);
			 }
		 }
        
		 public static void getEnrollMentsPerYear()
		 {
			for(int z=0 ; z<enrollmentsPerYear.length ; z++)
			{ 
				System.out.println(enrollmentsPerYear[z]);
			}
		 }
}
