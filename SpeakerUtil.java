class SpeakerUtil
{
	 public static void main(String a[])
	 {
		 String name = Speaker.name;
		 System.out.println("the Speaker name is:"+name);
		 
		 boolean isConnected = Speaker.onOrOff();
		 System.out.println("the Speaker is connected:"+ isConnected);
		 
		 Speaker.increaseVolume();
		 Speaker.increaseVolume();
		 Speaker.increaseVolume();
		 Speaker.increaseVolume();
		 Speaker.increaseVolume();
		 Speaker.increaseVolume();
		 
		 
		 Speaker.decreaseVolume();
		 Speaker.decreaseVolume();
		 Speaker.decreaseVolume();
		 Speaker.decreaseVolume();
	     Speaker.decreaseVolume();
		 Speaker.decreaseVolume();
		 
		 
		 boolean isConnect = Speaker.onOrOff();
		 System.out.println("the Speaker is connected:"+ isConnect);
	 }
}