package week1.day1;

public class Mobile {
	
	
	String mobileBrand ="Samsung";
	double mobilePrice = 8.5;
	int noContacts = 50;
	long imeNum=23564731356457L;

	public void makeCall() {

		System.out.println("Make Call");

	}

	public void sendMessage() {
		
		/*
		 * String textMessage= "Hello";
		 * 
		 * System.out.println(textMessage);
		 */
		System.out.println("Send Message");

	}


	public void takePicture() {

		System.out.println("Take Picture");

	}
	public static void main(String[] args) {


		Mobile myphone = new Mobile();

		myphone.makeCall();
		myphone.sendMessage();
		myphone.takePicture();
		
		System.out.println(myphone.mobileBrand);
		System.out.println(myphone.mobilePrice);
		System.out.println(myphone.noContacts);
		System.out.println(myphone.imeNum);
	}

}
