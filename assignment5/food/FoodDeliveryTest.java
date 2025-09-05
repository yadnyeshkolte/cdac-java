package assignment5.food;
import java.util.ArrayList;
import java.util.Scanner;
//placeOrderZomato placeOrderSwiggy cant able to over load why ? 
public class FoodDeliveryTest extends Object{
	public static void main(String[] args) {
		System.out.println("Welcome to Food Delivery");
		Scanner scan = new Scanner(System.in);
		ArrayList<ZomatoDelivery> zd = new ArrayList<>();
		ArrayList<SwiggyDelivery> sd = new ArrayList<>();
		String input =  "";
		while(true) {
			System.out.print("Enter 'Z'-Zomato 'S'-Swiggy 'exit' :");
			input = scan.next().toLowerCase();
			if(input.equals("exit")) {
				System.out.println("Bye");
				break;
			}
			switch(input) {
			case "z": zomato(zd);
			break;
			case "s": swiggy(sd);
			break;
			default: System.out.println("Invalid Output");
			}
		}
	}
	static void zomato(ArrayList<ZomatoDelivery> zd) {
		Scanner scan = new Scanner(System.in);
		String input = "";
		while(true) {
			System.out.print("'f'-Food list 'p'-Plase Order 'c'-Cancel Order 'd'-Display Cart 't'-Track Order 'exit' :");
			input = scan.next().toLowerCase();
			if(input.equals("exit")) {
				break;
			}
			switch(input) {
			case "f": getFoodList();
			break;
			case "p": placeOrder(zd);
			break;
			case "c": cancelOrder(zd);
			break;
			case "t": trackOrder(zd);
			break;
			case "d": displayCart(zd);
			break;
			default: System.out.println("Invalid Output");
			}
		}
	}
	static void swiggy(ArrayList<SwiggyDelivery> sd) {
		String input = "";
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.print("'d'-Food list 'p'-Plase Order 'c'-Cancel Order 't'-Track Order 'exit' :");
			input = scan.next().toLowerCase();
			if(input.equals("exit")) {
				break;
			}
			switch(input) {
			case "f": getFoodList();
			break;
			case "p": placeOrder(sd,0);
			break;
			case "c": cancelOrder(sd,0);
			break;
			case "t": trackOrder(sd,0);
			break;
			case "d": displayCart(sd,0);
			break;
			default: System.out.println("Invalid Output");
			}
		}
	}
	static void displayCart(ArrayList<ZomatoDelivery> zd) {
		for(ZomatoDelivery d: zd) {
			System.out.println(d.orderId+" "+d.restaurantName+" "+d.status);
		}
	}
	static void displayCart(ArrayList<SwiggyDelivery> sd, int dummy) {
		for(SwiggyDelivery d: sd) {
			System.out.println(d.orderId+" "+d.restaurantName+" "+d.status);
		}
	}
	static void getFoodList() {
		FoodItemArray fa = new FoodItemArray();
		System.out.println(fa.getItemsList());
	}
	static void placeOrder(ArrayList<ZomatoDelivery> cart) {
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
				z.getPayment();
				z.placeOrder(input, 1);
				cart.add(z);
				
				//comment
				/*for(ZomatoDelivery zitem: cart) {
					System.out.println(zitem.orderId+" "+zitem.restaurantName+" "+z.status);
				}
				*/

			}
			else {
				System.out.println("Item is not present");
			}
		}
	}
	static void placeOrder(ArrayList<SwiggyDelivery> cart, int dummy) {
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
				s.getPayment();
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
	static void cancelOrder(ArrayList<ZomatoDelivery> cart) {
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
					d.sendRefund();
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
	static void cancelOrder(ArrayList<SwiggyDelivery> cart, int dummy) {
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
					d.sendRefund();
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
	static void trackOrder(ArrayList<ZomatoDelivery> cart) {
		Scanner scan = new Scanner(System.in);
		String input;
		int id;
		while(true) {
			boolean b = false;
			boolean status = false;
			System.out.print("Enter the id to track 'exit' :");
			input = scan.next();
			if(input.toLowerCase().equals("exit")) {
				break;
			}
			id = Integer.parseInt(input);
			for(ZomatoDelivery d: cart) {
				if(d.orderId==id) {
					b = true;
					status = d.trackOrder(id);
					System.out.println(d.orderId+" is "+activeNotActive(status));
					break;
				}
			}
			if(b) {
				
			}
			else {
				System.out.println("Id not present");
			}	
		}
		
	}
	static void trackOrder(ArrayList<SwiggyDelivery> cart, int dummy) {
		Scanner scan = new Scanner(System.in);
		String input;
		int id;
		while(true) {
			boolean b = false;
			boolean status = false;
			System.out.print("Enter the id to track 'exit' :");
			input = scan.next();
			if(input.toLowerCase().equals("exit")) {
				break;
			}
			id = Integer.parseInt(input);
			for(SwiggyDelivery d: cart) {
				if(d.orderId==id) {
					b = true;
					status = d.trackOrder(id);
					System.out.println(d.orderId+" is "+activeNotActive(status));
					break;
				}
			}
			if(b) {
				
			}
			else {
				System.out.println("Id not present");
			}	
		}
	}
	
	static String activeNotActive(boolean status) {
		if(status) {
			return "Active";
		}
		else {
			return "Not Active";
		}
	}
}
