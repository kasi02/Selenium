package week1.assignment1;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Declare your input :153
		
		int input=153;
		
		// Declare 3 more int variables as calculated, remainder, original (Tip: Initialize calculated alone)
		
		int calculated=0;
		int remainder;
		int original;
		
		// Assign input into variable original 
		
		original = input;
		
		// Use loop to calculate: which loop to use until the number greater than 0??
		
		System.out.println("While Loop Starting\n");
		
		while (input>0){
			
			// Within loop: get the remainder when done by 10 (Tip: Use Mod operator)
			
			remainder=input%10;
			
			System.out.println("The remainder values is "+remainder);
			
			// Within loop: get the quotient when done by 10 (Tip: Assign the result to input)
			
			input=input/10;
			
			System.out.println( "The input values is "+input);
			
			// Within loop: Add calculated with the cube of remainder & assign it to calculated
			
			calculated=calculated + (remainder*remainder*remainder);
			System.out.println( "The Calculated values is "+calculated+"\n");
			
		}
		
		System.out.println("While Loop Ending \n");
		
		// Check whether calculated and original are same
		 if (calculated == original) {
			
			//When it matches print it as Armstrong number
			 
			 System.out.println("The Given No is Amstrong " + calculated);
		}
		

	}

}
