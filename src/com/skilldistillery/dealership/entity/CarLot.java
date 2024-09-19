package com.skilldistillery.dealership.entity;

public class CarLot {
	private int LOT_SIZE = 10;
	private int numOfCarsInLot; 
	private Car carInfo = new Car();
	private int addCar = 2;
	private int currentInventory = addCar;
	 
	
		
	
		
	Car[] carsInLot = new Car [LOT_SIZE]; {
		carsInLot[0] = fredCarTester; 
		carsInLot[1] = berniceCarTester;
	
	
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
