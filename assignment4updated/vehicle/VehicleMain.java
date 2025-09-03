package assignment4updated.vehicle;


public class VehicleMain {
	public static void main() {
		String brand = "Mahindra";
		short maxSpeed = 80;
		Car c = new Car("Ford GT",(short)315);
		Bike b = new Bike("Bajaj RS200",(short)150);
		Truck t = new Truck("Tata XLS",(short)200);
		c.showTopSpeed();
		b.showTopSpeed();
		t.showTopSpeed();
		
	}
}
