package week1.day2;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Here is the input
				int[] data = {3,2,11,4,6,7};

				Arrays.sort(data);
		/*
		 * for (int i = 0; i < data.length; i++) {
		 * 
		 * //System.out.println(data[i]);
		 * 
		 * }
		 */
				
				System.out.println("The Second Largest Number is "+data[data.length-2]);
				
				
				//System.out.println(data);

	}

}
