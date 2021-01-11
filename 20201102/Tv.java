
public class Tv {
 private boolean power;
 private int channel;
 private int volume;
 private boolean mute;
 
 
   public Tv() {
	   channel =23;
	   volume = 15;
	   
 }
 
 //전원 On/Off true -> TV on, false -> TV off
 public void powerOnOff() {
	 power = !power;
	   if(power)
		 System.out.println("TV On");
	   else
	     System.out.println("TV Off");
 }
 
 //음소거 On/Off
 public void volumeMute() {
	 mute = !mute;
	 if (mute)
		 System.out.println("음소거 활성화");
	 else 
		 System.out.println("음소거 비활성화");
	 
 }
 
 //채널 Up
 public void channelUp() {
	 channel++;
	 if (channel<500)
		 channel =1;
	 System.out.println("현재 채널 : "+ channel);
	 
 }
 
 //채널 Down
 public void channelDown(){
	 channel--;
	 if (channel>1);
	 else 
		 channel = 500;
	 System.out.println("현재 채널:"+channel);

 }
 
 //음량 Up
 public void volumeUp() {
	 volume ++;
	 if (volume < 40)
		 volume =1;
	 System.out.println("현재 볼륨:"+volume);
 }
 
 //음량 Down
 public void volumeDown() {
	 volume--;
	 if(volume >0);
	 else 
		 volume = 40;
	 System.out.println("현재 볼륨:"+volume);
		 
 }
 
 //
}
