package com.skilldistillery.dealership.entity;

public class Car {
	private String owner; 
	private String make;
	private String model;
	private String color;
	private double purchasePrice;
	
	   public String toString() {
		      String output = "make=" + make + ", model=" + model + ", color=" + color + ", purchasePrice=" + purchasePrice;
		      return output;
	   }   
   
	//display method for car
	 public void displayCar() {
	      String carData = getCarInfo();
	      System.out.println(carData);
	 }
	//car constructor with the 5 variables
   public Car(String owner, String make, String model, String color, double purchasePrice) {
	   this.owner = owner;
	   this.make = make;
	   this.model = model;
	   this.color = color;
	   this.purchasePrice = purchasePrice;
   }
   //no-arg ctor for default values
   public Car() {
	   this.owner = "owner";
	   this.make = "make";
	   this.model = "model";
	   this.color = "color";
	   this.purchasePrice = 0;
	   
   }

//method for populating car data (reads like a list, instead of just left to right)
   public String getCarInfo() {
	   
	   System.out.println("Here are the specs for this car: ");
	   System.out.println("owner: " +owner);
	   System.out.println("make: " +make);
	   System.out.println("model: " +model);
	   System.out.println("color: " +color);
	   System.out.println("purchase price: " +purchasePrice);
	  
	return("");   
   }
   

   		
   //getters and setters to pass private fields
   public String getOwner (String owner) {
	   return this.owner;
   }
   public void setOwner (String owner) {
	   this.owner = owner;
   }
   public String getMake (String make) {
	   return this.make;
   }
   public void setMake (String make) {
	   this.make = make;
   }
   public String getModel (String model) {
	   return this.model;
   }
   public void setModel (String model) {
	   this.model = model;
   }
   public String getColor (String color) {
	   return this.color;
   }
   public void setColor (String color) {
	   this.color = color;  
   }
   public double getuPrchasePrice (double purchasePrice) {
	   return this.purchasePrice;
   }
   public void setPurchasePrice (double purchasePrice) {
	   this.purchasePrice = purchasePrice; 
   }


	
}
   
  
