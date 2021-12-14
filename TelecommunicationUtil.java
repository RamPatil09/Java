class TelecommunicationUtil
{

     static String[] aadharCard={"Xavier", "21xx xxxx xx81", "0x 0x 199x"};
	 
	 public static void main(String a[])
	 {
	 
	 boolean allowed=Telecommunication.allow(aadharCard);
	 System.out.println(allowed);
	 }

}