package assignment3;

public class Vehicle {
	String brand;
	float fuel;
	
	Vehicle(){
		brand = "Empty";
		fuel = 0f;
	}
	Vehicle(String brand, float fuel){
		this.brand = brand;
		this.fuel = fuel;
	}
	float refuel(float liters) {
		return fuel+=liters;
	}
}

class Car extends Vehicle{
	float milage;
	Car(){
		milage = 7;
	}
	Car(float milage){
		this.milage = milage;
	}
	int calculateTravelDistance() {
		return (int)(milage*fuel);
	}
	
}






