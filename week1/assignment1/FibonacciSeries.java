package week1.assignment1;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// initialize 3 int variables (Tip: range & firstNum, secNum in the series)
		
		int input=8;
		int firstNum=0;
		int secNum=1;
		int sum;
		
		System.out.println("The Output is ");
		
		// Iterate from 1 to the range
		
		for (int i = 0; i <input ; i++) {
			
			// Print first number 
			
			System.out.println(firstNum);
			
			// add first and second number
			
			sum=firstNum+secNum;
			
			// System.out.println("The sum is "+sum);
			
			// Assign second nuumber to the first number
			
			firstNum=secNum;
			
			// System.out.println("The current first number "+firstNum);
			
			// Assign sum to the second number
			
			secNum=sum;
			
			//System.out.println("The Updated Second Number "+secNum);
			
			
		}
		
		

	}

}
