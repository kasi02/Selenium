package week1.day1;

public class SumOfDidigts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int input=123;
		int sum=0;
		int remainder;
		
		while (input>0)
		{
			
			// Within loop: get the remainder when done by 10 -> Tip: use mod
			remainder = input%10;
			
			System.out.println("\n The remainder values is "+remainder);
			
			
			// Within loop: add that remainder to the sum
			sum=remainder+sum;
			
			System.out.println("The sum is : "+sum);
			
			// Within loop: get quotient of that number (tip: quotient should be same variable of loop condition)
			input = input/10;
			System.out.println("The input value is "+input);	
			
		}
		
System.out.println("The sum of the digit is "+sum);
	}

}
