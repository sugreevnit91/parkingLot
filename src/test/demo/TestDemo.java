package test.demo;

import java.util.Scanner;

import parkingLot.Car;
import parkingLot.ParkingLot;
import parkingLot.service.ParkingService;

public class TestDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter size of parking lot");
		int size = scan.nextInt();
		ParkingLot.setParkingLotSize(size);
		ParkingService service = new ParkingService();
		System.out.println("Enter total car to park");
		int numberOfCars = scan.nextInt();
		scan.nextLine();
		for(int i = 0; i < numberOfCars; i++){
			System.out.println("Enter Color");
			String color = scan.nextLine();
			System.out.println("Enter RegNumber");
			String regNumber = scan.nextLine();
			Car car = new Car(color, regNumber);
			if(service.checkSlotAvailable()){
				service.parkCar(car);
			}else{
				System.out.println("Parking is Full");
				break;
			}
		}
		System.out.println("Enter slot numbet to remove car");
		int slot = scan.nextInt();
		scan.nextLine();
		service.removeCar(slot);
		System.out.println("Enter color to check slots");
		String color = scan.nextLine();
		service.printRegNumber(color);
		
		System.out.println("Enter color to check regNumber");
		String regNumber = scan.nextLine();
		service.printColor(regNumber);
		
		scan.close();
	}
}
