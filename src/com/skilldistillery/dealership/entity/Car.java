package com.skilldistillery.dealership.entity;

public class Car {
	private String make;
	private String model;
	private String color;
	private double purchasePrice;
	private String getCarInfo;

   
	//display method for car
	public void displayCar() {
      String carData = getCarInfo;
      System.out.println(carData);
   }
	//car constructor with the 4 variables
   public Car(String make, String model, String color, double purchasePrice) {
	   this.make = make;
	   this.model = model;
	   this.color = color;
	   this.purchasePrice = purchasePrice;
   }
   	
   //toString replacement with similar format (reads like a list, instead of just left to right)
   public String getCarInfo() {
	   System.out.println("Here are the specs for the car: ");
	   System.out.println("make: " +make);
	   System.out.println("model: " +model);
	   System.out.println("color: " +color);
	   System.out.println("purchase price: " +purchasePrice);
	  
	   return getCarInfo;
   }
   
   //an example of a car (to set default values)
   public Car() {
   		this.make = "Ford";
   		this.model = "Explorer";
   		this.color = "white";
   		this.purchasePrice = 49995.63;
   		
   //getters and setters to pass private fields
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
