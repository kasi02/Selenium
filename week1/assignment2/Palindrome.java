package week1.assignment2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "madam";
		String s2 = "";
		
		for (int i =s1.length()-1; i>=0; i--) {
			
			s2+=s1.charAt(i);
			
					
		}
		if (s2.equals(s1)) {
			
			System.out.println(s2+ " : is Palindrome");
			
		}
		
		else {
			System.out.println("Its not Palindrome");
		}

		
		// System.out.println(s2);
	}

}
