package parkingLot;

public class ParkingLot {
	
	private static Car []cars = new Car[10];
	
	public static void setParkingLotSize(int size){
		cars = new Car[size];
	}
	
	public static Car[] getSlots(){
		return cars;
	}
}
