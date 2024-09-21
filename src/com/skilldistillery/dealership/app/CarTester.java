package com.skilldistillery.dealership.app;

import com.skilldistillery.dealership.entity.*;

public class CarTester {
	
  public static void main(String[] args) {
	// Create Cars and assign fields 
	Car emptySpace = new Car();
	emptySpace.setOwner("N/A");
	emptySpace.setMake("N/A");
	emptySpace.setModel("N/A");
	emptySpace.setModel("N/A");
	emptySpace.setPurchasePrice(0);
			
	Car joeBobsCar = new Car();
	joeBobsCar.setOwner("Joe Bob");
	joeBobsCar.setMake("Ford");
	joeBobsCar.setModel("Explorer - Platinum");
	joeBobsCar.setColor("White");
	joeBobsCar.setPurchasePrice(59997.99);
	System.out.println();
  
    Car fredsCar = new Car();
    fredsCar.setOwner("Fred");
    fredsCar.setMake("Kia");
    fredsCar.setModel("Sportage");
    fredsCar.setColor("Hot Pink");
    fredsCar.setPurchasePrice(28565);
    System.out.println();

    Car bernicesCar = new Car();
    bernicesCar.setOwner("Bernice");
    bernicesCar.setMake("Toyota");
    bernicesCar.setModel("Prius");
    bernicesCar.setColor("Neon");
    bernicesCar.setPurchasePrice(32199);
    System.out.println();

    // Have the cars display themselves
    fredsCar.displayCar();
    bernicesCar.displayCar();
    joeBobsCar.displayCar();
    System.out.println();



}
}
