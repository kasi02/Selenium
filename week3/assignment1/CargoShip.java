package week3.assignment1;

public class CargoShip extends Ship{
	
	public void cargoCapacityinTons(int capacity) {
		
		System.out.println("The Capacity in Tons is: "+capacity);
		
	}
	
	public static void main(String[] args) {
		
		CargoShip obj=new CargoShip();
		
		obj.shipNam("The Indian Cargo");
		obj.shipbuiltYear("2018");
		obj.cargoCapacityinTons(1000);
		
		
	}

}
