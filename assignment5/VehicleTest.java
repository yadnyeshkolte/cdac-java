package assignment5;

public class VehicleTest {
	public static void main() {
		Car c = new Car(5,1200);
		Bike b = new Bike(4,200);
		c.calculateRent(30);
		b.calculateRent(30);
	}
	
}
