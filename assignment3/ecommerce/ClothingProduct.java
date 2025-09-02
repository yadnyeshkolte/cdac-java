package assignment3.ecommerce;

public class ClothingProduct {
	Clothing[] getClothing() {
		Clothing[] cProducts = new Clothing[5];
		cProducts[0] = new Clothing(1,"Jeans",11000);
		cProducts[1] = new Clothing(2,"Shirt",300);
		cProducts[2] = new Clothing(4,"T-shirt",90000);
		cProducts[3] = new Clothing(5,"Sports-Pant",500);
		cProducts[4] = new Clothing(6,"Socks",7000);
		
		return cProducts;
	}
}
