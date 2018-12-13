package Garage;

public class Bike extends Vehicle {

	private String helmetColour;

	public Bike(String make, String colour, int year, int iD, String helmetColour) {

		super(make, colour, year, iD);
		this.helmetColour = helmetColour;
	}

	public String getHelmetColour() {
		return helmetColour;
	}

	public void setHelmetColour(String helmetColour) {
		this.helmetColour = helmetColour;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "The make of the bike is: " + getMake() + "\t The colour is: " + getColour() + "\t year: " + getYear() + "\t The colour of the helmet is: " + helmetColour;
	}
	
}
