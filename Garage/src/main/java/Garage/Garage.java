package Garage;
import java.util.ArrayList;
import java.util.stream.Collectors;

public  class Garage {

	private ArrayList<Vehicle> vehicleList = new ArrayList<>();
	int bill;
	
	public void listOfVehiclesInGarage() {

		vehicleList.stream().forEach(System.out::println);
		
	}
	
	public void addVehicleToList(Vehicle vehicle) {
		
		vehicleList.add(vehicle);
		
	}
	
	public void removeAllVehiclesFromList () {
		vehicleList.removeAll(vehicleList);
	}
	
	public void removeVehicleByID (int iD) {
		this.vehicleList.removeAll(vehicleList.stream().filter(vehicle -> vehicle.getiD() == iD).collect(Collectors.toList()));
	}
	
	public void removeByType(Class<?> clazz) {
		this.vehicleList.removeAll(this.vehicleList.stream().filter(vehicle -> vehicle.getClass().equals(clazz)).collect(Collectors.toList()));
	}
	
	public void billVehicles() {
		
		for (Vehicle vehicle : vehicleList) {
			bill = 0;
			if (vehicle instanceof Car) {
				bill += 20;
				if (((Car) vehicle).getNumberOfDoors()==5) {
					bill += 40;
				}
			}
			else if (vehicle instanceof Bike) {
				bill += 10;
				if (((Bike) vehicle).getHelmetColour()=="Blue") {
					bill += 20;
				}
			}
			else if (vehicle instanceof Plane) {
				bill += 100;
				if (((Plane) vehicle).getWingSpan()>=10) {
					bill += 200;	
				}
			}
			System.out.println("For your vehicle:" + vehicle.getMake() + "\t\t The bill is £:" + bill);
		}
	
	}
		
}

