package week1.assignment2;

import java.util.Arrays;

public class Anagram {
	
	public static void main(String[] args) {
		String t1 = "stops";
		String t2 = "potss";
		
		char[] c1= t1.toCharArray();
		char[] c2= t2.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		if(Arrays.equals(c1,c2))
			System.out.println("Strings are Anagram");
		else
			System.out.println("Strings not Anagram");
		}
		
	}	


