package assignment5;

abstract class Vehicle {
	int vehicleNumber;
	float rentalPrice;
	Vehicle(){
		vehicleNumber = 0;
		rentalPrice = 0.0f;
	}
	Vehicle(int vehicleNumber,float rentalPrice){
		this.vehicleNumber = vehicleNumber;
		this.rentalPrice = rentalPrice;
	}
	abstract void calculateRent(int days);
}


class Car extends Vehicle{
	Car(int vehicleNumber, float rentalPrice){
		super(vehicleNumber, rentalPrice);
		
	}
	void calculateRent(int days) {
		System.out.println(vehicleNumber+" having Total Rent "+rentalPrice*days+rentalPrice*days*0.18);
	}
}

class Bike extends Vehicle{
	Bike(int vehicleNumber, float rentalPrice){
		super(vehicleNumber, rentalPrice);
		
	}
	void calculateRent(int days) {
		System.out.println(vehicleNumber+" having Total Rent "+rentalPrice*days+rentalPrice*days*0.07);
	}
}
