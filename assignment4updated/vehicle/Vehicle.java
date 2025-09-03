package assignment4updated.vehicle;

public class Vehicle {
	String brand;
	short maxSpeed;
	Vehicle(){
		brand = "Empty";
		maxSpeed = 0;
	}
	Vehicle(String brand, short maxSpeed){
		this.brand = brand;
		this.maxSpeed = maxSpeed;
	}
}
class Car extends Vehicle {
	Car(String brand, short maxSpeed){
		super(brand, maxSpeed);
	}
	void showTopSpeed() {
		System.out.println(brand+" has to speed "+maxSpeed);
	}
}
class Bike extends Vehicle {
	Bike(String brand, short maxSpeed){
		super(brand, maxSpeed);
	}
	void showTopSpeed() {
		System.out.println(brand+" has to speed "+maxSpeed);
	}
}
class Truck extends Vehicle {
	Truck(String brand, short maxSpeed){
		super(brand, maxSpeed);
	}
	void showTopSpeed() {
		System.out.println(brand+" has to speed "+maxSpeed);
	}
}
