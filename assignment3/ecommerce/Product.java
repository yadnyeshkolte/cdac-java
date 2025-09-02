package assignment3.ecommerce;

public class Product {
	int productId;
	String name;
	float price;
	Product(){
		productId = 0;
		name = "Empty";
		price = 0.0f;
	}
	Product(int productId, String name, float price){
		this.productId = productId;
		this.name = name;
		this.price = price;
	}
}
class Electronics extends Product{
	int warranty;
	Electronics(){
		warranty = 0;
	}
	Electronics(int productId, String name, float price){
		super(productId,name,price);
	}
	Electronics(int productId, String name, float price, int warranty){
		super(productId,name,price);
		this.warranty = warranty;
	}
	void applyWarranty(int years){
		System.out.println("Product: "+name+" warranty is: "+years);
	}
}

class Clothing extends Product{
	
	Clothing(int productId, String name, float price){
		super(productId,name,price);
	}
	double applyDiscount(double percentage){
		return price-price*(percentage/100);
	}
}
