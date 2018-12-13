package Garage;

public class Runner {

	public static void main(String[] args) {

		Car car1 = new Car("Audi", "Red", 2018, 0000, 5);
		Car car2 = new Car("Mercedes", "White", 2016, 0003, 3);
		Bike bike1 = new Bike("Suzuki", "Blue", 2015, 0001, "Red");
		Bike bike2 = new Bike("Kawasaki", "Black", 2012, 0004, "Blue");
		Plane plane1 = new Plane("Honda", "Green", 2017, 0002, 10);
		Plane plane2 = new Plane("Cessna", "Purple", 2018, 0005, 8);
		
		Garage g1 = new Garage();
		
		g1.addVehicleToList(car1);
		g1.addVehicleToList(bike1);
		g1.addVehicleToList(plane1);
		g1.addVehicleToList(car2);
		g1.addVehicleToList(bike2);
		g1.addVehicleToList(plane2);
		g1.removeVehicleByID(0000);
		g1.removeByType(Car.class);
		g1.listOfVehiclesInGarage();
		g1.billVehicles();
	}

}
