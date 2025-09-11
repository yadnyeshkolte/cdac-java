package questions.productmanagentsystem;


public class Products {
	int productId;
	String productName;
	String category;
	double price;
	int quantity;
	
	public Products() {

		this.productId = 0;
		this.productName = "Empty";
		this.category = "Empty";
		this.price = 0;
		this.quantity =0;
	}
	public Products(int productId, String productName, String category, double price, int quantity) {

		this.productId = productId;
		this.productName = productName;
		this.category = category;
		this.price = price;
		this.quantity = quantity;
	}
	
	
	
}
