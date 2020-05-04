package week1.assignment2;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Declare An array for {3,2,11,4,6,7};
		
		 int[] num1= {3,2,11,4,6,7};
		 int[] num2= {1,2,8,4,9,7};
		 
		  // Declare for loop iterator from 0 to array length
		 
		 for (int i = 0; i < num1.length; i++) {
			 
			 for (int j = 0; j < num2.length; j++) {
				 
				 if (num1[i]==num2[j]) {
					 
					 System.out.println(num1[i]);
					
				}
				
			}
			
		}
		 
		/*
		 * for (int i : num1) {
		 * 
		 * // System.out.print(i);
		 * 
		 * for (int j : num2) {
		 * 
		 * //System.out.print(j);
		 * 
		 * if (i==j) {
		 * 
		 * System.out.println(i);
		 * 
		 * }
		 * 
		 * 
		 * }
		 * 
		 * }
		 */
	}

}
