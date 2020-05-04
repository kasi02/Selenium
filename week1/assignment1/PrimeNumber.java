package week1.assignment1;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declare an int Input and assign a value
		int input=8;
		int remainder;
		
		boolean flag=false;
		
		
		
		// Iterate from 1 to half of the input
		
		for (int i =1; i <=input/2; i++) {
			
			// Divide the input with each for loop variable and check the remainder
			
			remainder=input%i;
			
			// Set the flag as true when there is no remainder
			
			// System.out.println("remainder is "+remainder);
			
			
			if (remainder==0) {
				
				flag=true;
				
				break;
					
			}		
			
			
		}
            if (flag==true) {
			
			System.out.println("Given input is primenumber");
			
		}
            else {
				
            	System.out.println("Given input is NOT- primenumber");
			}
		
		
	}

}
