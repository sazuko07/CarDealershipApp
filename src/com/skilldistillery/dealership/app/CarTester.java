package com.skilldistillery.dealership.app;

import com.skilldistillery.dealership.entity.*;

public class CarTester {

  public static void main(String[] args) {
	// Create two Cars and assign fields  
  
    Car fredsCar = new Car();
    fredsCar.setMake("Kia");
    fredsCar.setModel("Sportage");
    fredsCar.setColor("Hot Pink");
    fredsCar.setPurchasePrice(28565);
    System.out.println();

    Car bernicesCar = new Car();

    bernicesCar.setMake("Toyota");
    bernicesCar.setModel("Prius");
    bernicesCar.setColor("Neon");
    bernicesCar.setPurchasePrice(32199);
    System.out.println();

    // Have the cars display themselves
    fredsCar.displayCar();
    bernicesCar.displayCar();
    System.out.println();

    String fredCarData = fredsCar.getCarInfo();
    String bernicesCarData = bernicesCar.getCarInfo();

    // Get the cars' data and display that
    System.out.println("Fred car data: " + fredCarData);
    System.out.println("Bernices Car data: " + bernicesCarData);
  }
    //methods to pass fred/bernice car information to CarLot
  	public Car fredCarTester(Car fredsCar) {
    	Car output = fredsCar;
    	return output; 
    }
    public Car berniceCarTester(Car bernicesCar) {
    	Car output = bernicesCar; 
    	return output; 
  }

}
