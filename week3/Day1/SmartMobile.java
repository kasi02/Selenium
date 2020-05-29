package week3.Day1;

public class SmartMobile extends Mobile {
	
	public void connectWatsapp() {
		
		System.out.println("To connect WatsApp");

	}
	//override method
	//@Override
	/*
	 * public void takeVideo() {
	 * 
	 * System.out.println("To Take Video using smartphone"); }
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SmartMobile obj = new SmartMobile();
		
		
		  obj.sendMsg(); obj.makeCall(); obj.savContact(); obj.connectWatsapp();
		 
		//obj.takeVideo();
		
	}

}
