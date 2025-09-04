package assignment5.food;
import java.util.Random;

interface FoodDelivery {
	void placeOrder(String item, int qty);
	void  cancelOrder(int orderId);
	void trackOrder(int orderId);
}

class ZomatoDelivery implements FoodDelivery{
	int orderId; 
	String restaurantName;
	boolean status;
	String[] restaurant = {"Koshys","MTR","CTR","Vidyarthi","Karavalli"};
	public ZomatoDelivery() {
		orderId = 0;
		restaurantName = "Empty";
		status = true;
	}
	public ZomatoDelivery(int orderId, String restaurantName, boolean status) {
		this.orderId = orderId;
		this.restaurantName = restaurantName;
		this.status = status;
	}
	public void placeOrder(String item, int qty) {
		Random rand = new Random();
		orderId = rand.nextInt(50);
		int index  = rand.nextInt(4);
		restaurantName = restaurant[index];
		status = true;
	}
	public void cancelOrder(int orderId) {
		status = false;
	}
	public void trackOrder(int orderId) {
		
	}
	
}


class SwiggyDelivery implements FoodDelivery{
	int orderId; 
	String restaurantName;
	boolean status;
	String[] restaurant = {"Barbeque","Tamasha","Toast","Tonic","Windmills"};
	public SwiggyDelivery() {
		orderId = 0;
		restaurantName = "Empty";
		status = true;
	}
	public SwiggyDelivery(int orderId, String restaurantName, boolean status) {
		this.orderId = orderId;
		this.restaurantName = restaurantName;
		this.status = status;
	}
	public void placeOrder(String item, int qty){
		Random rand = new Random();
		orderId = rand.nextInt(50);
		int index  = rand.nextInt(4);
		restaurantName = restaurant[index];
		status = true;
	}
	public void  cancelOrder(int orderId) {
		
	}
	public void trackOrder(int orderId) {
		
	}
	
}