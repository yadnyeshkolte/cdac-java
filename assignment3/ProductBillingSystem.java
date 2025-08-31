package assignment3;

import java.util.Scanner;

public class ProductBillingSystem {
	static void main() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to Product Billing System ");
		DiscountedProduct product = new DiscountedProduct();
		while(true) {
			System.out.print("Enter 's' - Show product details 'c' check final discounted price 'exit' - exit: ");
			String input = scan.next().toLowerCase();
			if(input.equals("exit")) {
				break;
			}
			switch(input) {
				case "s": System.out.print("Details are: ");
				product.showProduct();
				break;
				case "c": System.out.print("Final Price is: ");
				product.calculateFinalPrice();
				break;
				default: System.out.println("invalid input");
			}
		}
	}
}
