package assignment3updated.vehicle;

public class Cars {
	Car[] c = new Car[5];
	
	Car[] initialize() {
		
		c[0] = new Car(1,"Volkswagan",1500);
		c[1] = new Car(2,"Benz",1900);
		c[2] = new Car(3,"Audi",1200);
		c[3] = new Car(4,"Ford",1600);
		c[4] = new Car(5,"Mazda",1800);
		
		return c;
	}
}
