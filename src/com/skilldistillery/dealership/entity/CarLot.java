package com.skilldistillery.dealership.entity;

public class CarLot {
	private int LOT_SIZE = 10;
	private int numOfCarsInLot; 
	private Car carInfo = new Car();
	private int addCar = 2;
	private int currentInventory = addCar;
	 
	Car fredsCar = new Car("make", "model", "color", 28565);
	Car bernicesCar = new Car("make", "model", "color", 32199); 
	// the above created 2 distinct Car objects on the heap
	// now you can park both distinct cars in the carlot
	
	 
		
	
		
	Car[] carsInLot = new Car [LOT_SIZE]; {
		carsInLot[0] = fredsCar; 
		carsInLot[1] = bernicesCar;
	}
	
	public String Carlot() {
		System.out.println("This is Doogie's car lot");
		System.out.println();
		return""; 
	}
	
	public void addCar(Car addNewCar) {
 
			
				if(addCar < 2) {
					System.out.println("Doogie sold a car!");
					currentInventory--;
				}
				else if (addCar > 2) {
					System.out.println("Doogie got another car!");
					currentInventory++;
				}
	}
}
