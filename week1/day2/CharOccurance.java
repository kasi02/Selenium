package week1.day2;

public class CharOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Check number of occurrences of a char (eg 'e') in a String
		
		String str = "welcome to chennai";
		
		// declare and initialize a variable count to store the number of occurrences
		
		int count=0;
		// convert the string into char array
		
		char[] charArray = str.toCharArray();
		
		//get the length of the array
		
		// System.out.println(charArray.length);
		
		for (int i = 0; i < charArray.length; i++){
			
			
			if (charArray[i]== 'w') {
				
				count=count+1;
				
				if (count>1) {
					System.out.println("The repeated charcter is "+charArray[i]);
					break;
					
				}
				else {
					System.out.println("There is no repeated charcter "+charArray[i]);
				}
				
			}
			
		
			
		}
	}

}
