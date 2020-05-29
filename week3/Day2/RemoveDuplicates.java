package week3.Day2;


// import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {

		String input= "PayPal India";

		char[] charArray = input.toCharArray();

		//System.out.println(charArray);

		Set <Character> charSet =new LinkedHashSet<Character>();

		Set <Character> dupCharSet =new LinkedHashSet<Character>();


		for (Character each : charArray) {

			//Iterate character array and add it into charSet
			//charSet.add(each);

			if (!charSet.add(each)) {

				dupCharSet.add(each);
				//System.out.println(dupCharSet);
			}

			


		}

		charSet.removeAll(dupCharSet);

		for (Character distinct : charSet) {

			if (distinct!=' ') {

				System.out.println(distinct);

            }

		}


	} 

}
