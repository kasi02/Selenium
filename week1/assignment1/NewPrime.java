package week1.assignment1;

public class NewPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input=13;
		int count=0;

		for (int i = 1; i <=13; i++) {

			if (input%i==0) {

				count=count+1;


			}


		}
		if (count==2) {

			System.out.println("Given input is  primenumber");

		}
		else {

			System.out.println("Given input is NOT- primenumber");

		}

	}

}
