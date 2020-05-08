package week1.assignment2;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//declared String text as input

		String text = "We learn java basics as part of java sessions in java week1";

		int count=0;

		String words[] = text.split(" ");

		for (int i = 0; i < words.length; i++) {

			count=0;

			//System.out.println("words === "+words[i]);

			for (int j = i+1; j < words.length; j++) {

				if (words[i].equalsIgnoreCase(words[j])) {

					count = count+1;

					//System.out.print("The Duplicate Word is: "+words[i]);
				}
		}

			//if it is available then increase and count by 1.


			if (count>=1) {

				words[i]=words[i].replace(words[i], "");
			}

			System.out.print(words[i]+" ");

		}
	}

}
