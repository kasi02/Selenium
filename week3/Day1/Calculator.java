package week3.Day1;

public class Calculator {
	
	public void add(int num1, int num2) {
		
		System.out.println("The addition for two: "+num1+" "+num2);
		
	}

	public void add(int num1, int num2, int num3) {
		
		System.out.println("The addition for three: "+num1+" "+num2+" "+num3);
		

	}
	
	public void multiply(int num1, double num2) {
		System.out.println("The Multiplication: "+num1+" "+num2);

	}
	
	public void multiply(int num1, int num2) {
		System.out.println("The Multiplication: "+num1+" "+num2);

	}
	
	public void divide(int num1, int num2) {
		System.out.println("The Division of : "+num1+" "+num2);

	}
	
	
	public void divide(int num1, double num2) {
		System.out.println("The Division of : "+num1+" "+num2);

	}
	
	
	public static void main(String[] args) {
		
		Calculator obj = new Calculator();
		
		obj.add(2, 2);
		obj.add(2, 2, 2);
		obj.multiply(2, 10.20);
		obj.multiply(3, 5);
		obj.divide(2, 20.20);
		obj.divide(4, 8);
	}
	
}
