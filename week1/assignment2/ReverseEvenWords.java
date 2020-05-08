package week1.assignment2;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String test="I am a software tester";

		String words[] = test.split(" ");

		System.out.print("The Output is:");

		for (int i = 0; i < words.length; i++) {

			if (i%2!=0) {

				// System.out.println(i);

				char[] charArray = words[i].toCharArray();

				for (int j = (charArray.length-1); j >=0; j--) {



					System.out.print(charArray[j]);

				}

			}
			else {
				System.out.print(" "+words[i]+" ");
			}

		}



	}

}
