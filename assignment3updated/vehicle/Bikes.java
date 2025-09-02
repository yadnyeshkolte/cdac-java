package assignment3updated.vehicle;

public class Bikes {
	Bike[] b = new Bike[5];
	
	Bike[] createObjects() {
		
		b[0] = new Bike(1,"Yamaha",500);
		b[1] = new Bike(2,"BMW",900);
		b[2] = new Bike(3,"Bajaj",200);
		b[3] = new Bike(4,"Honda",600);
		b[4] = new Bike(5,"Suzuki",800);
		
		return b;
	}
	
}
