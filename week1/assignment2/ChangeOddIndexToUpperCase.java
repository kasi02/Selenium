package week1.assignment2;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String test = "changeme";
		
	      System.out.println("The output is below: ");
		
		//int value;
		
		//Convert the String to character array
		
		char[] charArray = test.toCharArray();
		
		//Traverse through each character (using loop)
		
		for (int i = 0; i <charArray.length; i++) {
			
			if (i%2!=0) {
				 
				
				// System.out.println(charArray[i]);
				
				System.out.print(Character.toUpperCase(charArray[i]));
			}
			
			else {
				
				System.out.print(charArray[i]);
				
			}
			
		}

	}

}
