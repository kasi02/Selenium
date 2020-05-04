package week1.day2;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Here is the input
		String test = "feeling good";

		int index=0;

		// convert the string into char array

		System.out.print("The Reverse order is: ");

		char[] charArray = test.toCharArray();
		//Traverse through each character (using loop in reverse direction)

		for (int i = (charArray.length-1); i>=0; i--) {

			System.out.print(charArray[i]);


		}

		for (int i = (charArray.length-1); i>=0; i--) {

			//System.out.print(charArray[i]);



			if (charArray[i]=='e') {


				System.out.println("\n"+index);

			}

			index=index+1;

		}

	}

}
