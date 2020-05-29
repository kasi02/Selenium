package week3.Day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 //Declare a String array and add the Strings values as (HCL, Wipro,  Aspire Systems, CTS)		
		
		List <String> values = new ArrayList<String>();
		values.add("HCL");
		values.add("Wipro");
		values.add("Aspire Systems");
		values.add("CTS");
		
		System.out.println("The Total values given is: "+values.size());
		
		System.out.println("***********************************");
		Collections.sort(values);
		
		for (int i = values.size()-1; i >=0; i--) {
			
			
			System.out.println(values.get(i));
		}
		
	}

}
