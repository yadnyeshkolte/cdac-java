package questions.productmanagentsystemfilehandling;

import java.io.Serializable;

public class Product implements Serializable {
	int productId; 
	String productName; 
	double price; 
	int quantity;
	
	public Product() {
		this.productId = 0;
		this.productName = "Empty";
		this.price = 0.0;
		this.quantity = 0;
	}
	

	public Product(int productId, String productName, double price, int quantity) {
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
	}
	
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	void diplayProductDetails(){
		System.out.println("Product Id: "+productId+" Product Name: "+productName+" Price "+price+" Quantity: "+quantity);
	}
}
