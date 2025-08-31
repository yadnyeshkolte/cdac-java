package assignment3;

public class Product {
	String productName;
	int price;
	Product(){
		productName = "Eclipse IDE";
		price = 3000;
	}
	Product(String productName, int price){
		this.productName = productName;
		this.price = price;
	}
	void showProduct() {
		System.out.println("Product Name - "+this.productName+" :Price - "+this.price);
	}
}

class DiscountedProduct extends Product{
	float discountRate;
	DiscountedProduct(){
		discountRate = 0.3f;
	}
	DiscountedProduct(float discountRate){
		this.discountRate = discountRate;
	}
	void calculateFinalPrice() {
		System.out.println(price - price*discountRate);
	}
}
