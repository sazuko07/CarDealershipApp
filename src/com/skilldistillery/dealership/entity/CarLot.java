package com.skilldistillery.dealership.entity;
public class CarLot {
	private int LOT_SIZE = 10;
	private int currentInventory;
	
	public CarLot() {
	}
	Car fredsCar;
	Car bernicesCar; // = new Car("owner","make", "model", "color", 32199); 
	Car joeBobsCar;  //= new Car("owner","make", "model", "color",59997.99);
	Car emptySpace;  //= new Car("N/A", "N/A", "model", "color", 0);
	
	Car[] carsInLot = new Car [LOT_SIZE]; {
		carsInLot[0] = fredsCar; 
		carsInLot[1] = bernicesCar;
		carsInLot[2] = joeBobsCar;
		carsInLot[3] = emptySpace;
		carsInLot[4] = emptySpace;
		carsInLot[5] = emptySpace;
		carsInLot[6] = emptySpace;
		carsInLot[7] = emptySpace;
		carsInLot[8] = emptySpace;
		carsInLot[9] = emptySpace;
	}
	public void getListOfCarsInInventory() {
		for (int i=0; i < carsInLot.length; i++) {
			System.out.println(carsInLot[i]);
			
		}
		
	}	
//		public String Carlot() {
//			System.out.println("This is Doogie's car lot");
//			System.out.println();
//			return""; 
//		}
	
	

	
	
	// Check each element of array to see if it is 
	public void checkListofCars() {
		
		for (int i=0; i < carsInLot.length; i++) {
			if (carsInLot[i].equals(emptySpace)) {
				System.out.println("This space in the lot is empty.");
			} else {
				System.out.println("This space is occupied by a car");
			}
		}
		

	}
	
	public void addCar(Car addNewCar) {
				carsInLot[currentInventory] = addNewCar;
				
				if(currentInventory < 3) {
					System.out.println("Doogie sold a car!");
					System.out.println("Current inventory is: " +currentInventory);
					currentInventory--;
				}
				if (currentInventory > 3) {
					System.out.println("Doogie got another car!");
					System.out.println("Current inventory is: " +currentInventory);
					currentInventory++;
				}
				if (currentInventory == 10) {
					System.out.println("The lot is currently full of cars! You cant add anymore!");
					System.out.println("Current inventory is: " +currentInventory);
				}
	}
}




	
