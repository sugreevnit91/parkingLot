package parkingLot;

public class Car {
	private String color;
	private String regNumber;
	
	public Car(String color, String regNumber) {
		this.color = color;
		this.regNumber = regNumber;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getRegNumber() {
		return regNumber;
	}

	public void setRegNumber(String regNumber) {
		this.regNumber = regNumber;
	}
}
