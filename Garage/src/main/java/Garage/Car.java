package Garage;

public class Car extends Vehicle {

	private int numberOfDoors;

	public Car(String make, String colour, int year, int iD, int numberOfDoors) {

		super(make, colour, year, iD);
		this.numberOfDoors = numberOfDoors;
	}

	public int getNumberOfDoors() {
		return numberOfDoors;
	}

	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "The make of the car is: " + getMake() + "\t The colour is: " + getColour() + "\t year: " + getYear() + "\t The number of doors are: " + numberOfDoors;
	}
	
}
