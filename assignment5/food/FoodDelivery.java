package assignment5.food;
import java.util.Random;
import java.util.Scanner;

interface FoodDelivery {
	void placeOrder(String item, int qty);
	void  cancelOrder(int orderId);
	boolean trackOrder(int orderId);
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
	public boolean trackOrder(int orderId) {
		return status;
	}
	public void getPayment() {
		Scanner scan = new Scanner(System.in);
		String paymentInput = "";
		Random rand = new Random();
		int payment  = rand.nextInt(200,400);
		while(true) {
			System.out.println("Please Pay: "+payment);
			System.out.print("Enter payment here :");
			paymentInput = scan.next();
			int paymentInt = Integer.parseInt(paymentInput);
			if(payment==paymentInt) {
				System.out.println("Order Successful");
				break;
			}
			else {
				System.out.println("Invalid Input");
			}
		}
	}
	public void sendRefund() {
		System.out.println("Refunded Amount");
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
		status = false;
	}
	public boolean trackOrder(int orderId) {
		return status;
	}
	public void getPayment() {
		Scanner scan = new Scanner(System.in);
		String paymentInput = "";
		Random rand = new Random();
		int payment  = rand.nextInt(200,400);
		while(true) {
			System.out.println("Please Pay: "+payment);
			System.out.print("Enter payment here :");
			paymentInput = scan.next();
			int paymentInt = Integer.parseInt(paymentInput);
			if(payment==paymentInt) {
				System.out.println("Order Successful");
				break;
			}
			else {
				System.out.println("Invalid Input");
			}
		}
	}
	public void sendRefund() {
		System.out.println("Refunded Amount");
	}
	
	
}