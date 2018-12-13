package Garage;

public abstract class Vehicle {

	private String make;
	private String colour;
	private int year;
	private int iD;
	
	public Vehicle(String make, String colour, int year, int iD) {
		super();
		this.setMake(make);
		this.setColour(colour);
		this.setYear(year);
		this.setiD(iD);
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getiD() {
		return iD;
	}

	public void setiD(int iD) {
		this.iD = iD;
	}

}
