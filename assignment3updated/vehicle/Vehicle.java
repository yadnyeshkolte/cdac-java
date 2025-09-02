package assignment3updated.vehicle;

public class Vehicle {
	int vehicleId;
	String brand;
	int rentPerDay;
	Vehicle(){
		vehicleId = 0;
		brand = "Empty";
		rentPerDay = 0;
	}
	Vehicle(int vehicleId, String brand, int rentPerDay){
		this.vehicleId = vehicleId;
		this.brand = brand;
		this.rentPerDay = rentPerDay;
	}
}
class Car extends Vehicle{
	Car(int vehicleId, String brand, int rentPerDay){
		super(vehicleId, brand, rentPerDay);
	}
	void calculateRental(int days) {
		System.out.println("Rent for the "+brand+": "+rentPerDay*days);
	}
}
class Bike extends Vehicle{
	Bike(int vehicleId, String brand, int rentPerDay){
		super(vehicleId, brand, rentPerDay);
	}
	void calculateRental(int days){
		System.out.println("Rent for the "+brand+": "+rentPerDay*days);
		
	}
}


