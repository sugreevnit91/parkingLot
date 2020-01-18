package parkingLot.service;

import parkingLot.Car;
import parkingLot.ParkingLot;

public class ParkingService {
	
	/*method to check lot present or not*/
	public boolean checkSlotAvailable(){
		Car[] cars = ParkingLot.getSlots();
		for(int i = 0; i < cars.length; i++){
			if(cars[i] == null){
				return true;
			}
		}
		return false;
	}
	
	/*method to park car in parking slot*/
	public void parkCar(Car car){
		Car []cars = ParkingLot.getSlots();
		for(int i = 0; i < cars.length; i++){
			if(cars[i] == null){
				cars[i] = car;
				System.out.println("Allocated Slot No "+(i+1));
				break;
			}
		}
	}
	
	/*method to remove car from parking*/
	public void removeCar(int slot){
		Car []cars = ParkingLot.getSlots();
		if(slot > 0){
			cars[slot-1] = null;
			System.out.println("Car Removed");
		}
		else
			System.out.println("Enter valid slot");
	}
	
	/*print slots and regNumber if color is given*/
	public void printRegNumber(String color){
		Car []cars = ParkingLot.getSlots();
		boolean flag = true;
		for(int i = 0; i < cars.length; i++){
			if(cars[i] != null && cars[i].getColor().equalsIgnoreCase(color)){
				System.out.print("Slot is: "+(i+1)+" RegNumber is: "+cars[i].getRegNumber());
				flag = false;
			}
		}
		if(flag)
			System.out.println("Not Found");
	}
	
	/*print slots and color if regNumber is given*/
	public void printColor(String regNumber){
		Car []cars = ParkingLot.getSlots();
		boolean flag = true;
		for(int i = 0; i < cars.length; i++){
			if(cars[i] != null && cars[i].getColor().equalsIgnoreCase(regNumber)){
				System.out.print("Slot is: "+(i+1)+" Color is: "+cars[i].getColor());
				flag = false;
			}
		}
		if(flag)
			System.out.println("Not Found");
	}
	
	/*get status of the parking lot*/
	public void status(){
		Car []cars = ParkingLot.getSlots();
		System.out.printf("Slot No. \t Registration No \t Color");
		for(int i = 0; i < cars.length; i++){
			if(cars[i] != null){
				System.out.printf(i+" \t "+cars[i].getRegNumber()+" \t "+cars[i].getColor());
			}
		}
	}
}