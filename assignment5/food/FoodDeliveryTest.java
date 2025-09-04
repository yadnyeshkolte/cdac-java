package assignment5.food;
import java.util.ArrayList;
import java.util.Scanner;
//placeOrderZomato placeOrderSwiggy cant able to over load why ? 
public class FoodDeliveryTest extends Object{
	public static void main(String[] args) {
		System.out.println("Welcome to Food Delivery");
		Scanner scan = new Scanner(System.in);
		String input =  "";
		while(true) {
			System.out.print("Enter 'Z'-Zomato 'S'-Swiggy 'exit' :");
			input = scan.next().toLowerCase();
			if(input.equals("exit")) {
				System.out.println("Bye");
				break;
			}
			switch(input) {
			case "z": zomato();
			break;
			case "s": swiggy();
			break;
			default: System.out.println("Invalid Output");
			}
		}
	}
	static void zomato() {
		Scanner scan = new Scanner(System.in);
		String input = "";
		ArrayList<ZomatoDelivery> zd = new ArrayList<>();
		while(true) {
			System.out.print("'f'-Food list 'p'-Plase Order 'c'-Cancel Order 'd'-Display Cart 't'-Track Order 'exit' :");
			input = scan.next().toLowerCase();
			if(input.equals("exit")) {
				break;
			}
			switch(input) {
			case "f": getFoodList();
			break;
			case "p": placeOrderZomato(zd);
			break;
			case "c": cancelOrderZomato(zd);
			break;
			case "t": trackOrder();
			break;
			case "d": displayCart();
			break;
			default: System.out.println("Invalid Output");
			}
		}
	}
	static void swiggy() {
		String input = "";
		Scanner scan = new Scanner(System.in);
		ArrayList<SwiggyDelivery> sd = new ArrayList<>();
		while(true) {
			System.out.print("'d'-Food list 'p'-Plase Order 'c'-Cancel Order 't'-Track Order 'exit' :");
			input = scan.next().toLowerCase();
			if(input.equals("exit")) {
				break;
			}
			switch(input) {
			case "f": getFoodList();
			break;
			case "p": placeOrderSwiggy(sd);
			break;
			case "c": cancelOrderSwiggy(sd);
			break;
			case "t": trackOrder();
			break;
			case "d": displayCart();
			break;
			default: System.out.println("Invalid Output");
			}
		}
	}
	static void displayCart() {
		
	}
	static void getFoodList() {
		FoodItemArray fa = new FoodItemArray();
		System.out.println(fa.getItemsList());
	}
	static void placeOrderZomato(ArrayList<ZomatoDelivery> cart) {
		Scanner scan = new Scanner(System.in);
		String input = "";
		FoodItemArray fa = new FoodItemArray();
		ArrayList<FoodItems> f = fa.getItems();
		while(true) {
			boolean b = false;
			System.out.print("Enter the food item or 'exit' :");
			input = scan.next().toLowerCase();
			if(input.equals("exit")) {
				break;
			}
			for(FoodItems fi: f) {
				if(input.equals(fi.foodItem.toLowerCase())) {
					b = true;
					break;
				}
			}
			if(b) {
				ZomatoDelivery z = new ZomatoDelivery();
				z.placeOrder(input, 1);
				cart.add(z);
				//comment
				for(ZomatoDelivery zitem: cart) {
					System.out.println(zitem.orderId+" "+zitem.restaurantName+" "+z.status);
				}

			}
			else {
				System.out.println("Item is not present");
			}
		}
	}
	static void placeOrderSwiggy(ArrayList<SwiggyDelivery> cart) {
		Scanner scan = new Scanner(System.in);
		String input = "";
		FoodItemArray fa = new FoodItemArray();
		ArrayList<FoodItems> f = fa.getItems();
		while(true) {
			boolean b = false;
			System.out.print("Enter the food item or 'exit' :");
			input = scan.next().toLowerCase();
			if(input.equals("exit")) {
				break;
			}
			for(FoodItems fi: f) {
				if(input.equals(fi.foodItem.toLowerCase())) {
					b = true;
					break;
				}
			}
			if(b) {
				SwiggyDelivery s = new SwiggyDelivery();
				s.placeOrder(input, 1);
				cart.add(s);
				for(SwiggyDelivery sitem: cart) {
					System.out.println(sitem.orderId+" "+sitem.restaurantName+" "+s.status);
				}
			}
			else {
				System.out.println("Item is not present");
			}
		}
	}
	static void cancelOrderZomato(ArrayList<ZomatoDelivery> cart) {
		Scanner scan = new Scanner(System.in);
		String input;
		int id;
		while(true) {
			boolean b = false;
			int index = 0;
			System.out.print("Enter the id to delete form Cart or 'exit' :");
			input = scan.next();
			if(input.toLowerCase().equals("exit")) {
				break;
			}
			id = Integer.parseInt(input);
			for(ZomatoDelivery d: cart) {
				if(d.orderId==id) {
					b = true;
					d.cancelOrder(id);
					break;
				}
			}
			if(b) {
				for(ZomatoDelivery zitem: cart) {
					System.out.println(zitem.orderId+" "+zitem.restaurantName+" "+zitem.status);
				}
			}
			else {
				System.out.println("Id not present");
			}	
		}
	}
	static void cancelOrderSwiggy(ArrayList<SwiggyDelivery> cart) {
		Scanner scan = new Scanner(System.in);
		String input;
		int id;
		while(true) {
			boolean b = false;
			int index = 0;
			System.out.print("Enter the id to delete form Cart or 'exit' :");
			input = scan.next();
			if(input.toLowerCase().equals("exit")) {
				break;
			}
			id = Integer.parseInt(input);
			for(SwiggyDelivery d: cart) {
				if(d.orderId==id) {
					b = true;
					d.cancelOrder(id);
					break;
				}
			}
			if(b) {
				for(SwiggyDelivery sitem: cart) {
					System.out.println(sitem.orderId+" "+sitem.restaurantName+" "+sitem.status);
				}
			}
			else {
				System.out.println("Id not present");
			}	
		}
	}
	static void trackOrder() {
		
	}
	
	
}
