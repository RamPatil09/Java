class Bank
{
	
	public static String createAccount(int depositedAmount)
	{
		if(depositedAmount >= 1000)
		{
			return "Eligible to createAccount";
			
		}
		
		else{
			return "please deposite minimum 1000";
		}
	}
}