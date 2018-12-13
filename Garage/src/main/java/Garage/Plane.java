package Garage;

public class Plane extends Vehicle {

	private int wingSpan;

	public Plane(String make, String colour, int year, int iD, int wingSpan) {

		super(make, colour, year, iD);
		this.wingSpan = wingSpan;
	}

	public int getWingSpan() {
		return wingSpan;
	}

	public void setWingSpan(int wingSpan) {
		this.wingSpan = wingSpan;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "The make of the Plane is: " + getMake() + "\t The colour is: " + getColour() + "\t year: " + getYear() + "\t The wingspan in metres is: " + wingSpan;
	}
	
}
