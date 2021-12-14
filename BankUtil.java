import java.util.Scanner;

	class BankUtil
{
	public static void main(String a[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the deposited amount");
		String depositedAmount = sc.next();
		
		String value = Bank.createAccount(Integer.parseInt(depositedAmount));
		System.out.println(value);
		
	}

}