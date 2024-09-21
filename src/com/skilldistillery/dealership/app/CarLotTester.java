package com.skilldistillery.dealership.app;
import com.skilldistillery.dealership.entity.*;
public class CarLotTester {

	public static void main(String[] args) {
		
		CarLotTester doogiesCarLot = new CarLotTester();
		doogiesCarLot.carLot();
	}	
	public void carLot() {	
		
		CarLot doogiesCarLot = new CarLot();
		doogiesCarLot.getListOfCarsInInventory(); 
	}
		
}
