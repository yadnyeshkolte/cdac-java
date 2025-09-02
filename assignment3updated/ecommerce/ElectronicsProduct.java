package assignment3updated.ecommerce;

public class ElectronicsProduct {
	Electronics[] getElectronics() {
		Electronics[] eProducts = new Electronics[5];
		eProducts[0] = new Electronics(1,"Mobile",11000);
		eProducts[1] = new Electronics(2,"Charger",300);
		eProducts[2] = new Electronics(4,"Laptop",90000);
		eProducts[3] = new Electronics(5,"Extention",500);
		eProducts[4] = new Electronics(6,"SSD",7000);
		
		return eProducts;
	}
}
