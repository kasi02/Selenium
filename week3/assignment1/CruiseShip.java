package week3.assignment1;

public class CruiseShip extends Ship {

	public void maxPassengers(int max) {
		
		System.out.println("The Maximum Passengers is: "+max);
		

	}
	
	public void cruiseCategory(String category) {
		System.out.println("The Category of Cruise is: "+category);

	}
	
	
	public static void main(String[] args) {
		
		CruiseShip ship=new CruiseShip();
		
		 ship.shipNam("BIG DADY");
		 ship.shipbuiltYear("2016");
		 ship.cruiseCategory("Luxury");
	}
}
