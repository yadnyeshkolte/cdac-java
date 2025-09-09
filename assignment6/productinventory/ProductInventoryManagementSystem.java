package assignment6.productinventory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ProductInventoryManagementSystem {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input;
		ArrayList<Product> products = ProductData.getProductItems();
		while(true) {
			System.out.print("Want to try CRUD & t-total operations ");
			input = scan.next().toLowerCase();
			if(input.equals("exit")) {
				System.out.println("Bye");
				break;
			}
			if(input.equals("c")) {
				System.out.println("==============");
				addProduct(products);
				System.out.println("==============");
			}
			else if(input.equals("u")) {
				System.out.println("==============");
				updateProductDetails(products);
				System.out.println("==============");
			}
			else if(input.equals("r")){
				System.out.println("==============");
				for(Product p:products) {
					System.out.println("Product Id: "+p.id+" Product Name: "+p.name+" Product Price: "+p.price+" Product Quantity: "+p.quantity);
				}
				System.out.println("==============");
			}
			else if(input.equals("t")) {
				System.out.println("==============");
				float totalPrice = 0;
				for(Product prod: products) {
					totalPrice = (totalPrice+prod.price*prod.quantity);
				}
				System.out.println(totalPrice);
				System.out.println("==============");
			}
			else if(input.equals("d")) {
				System.out.println("==============");
				deleteProduct(products);
				System.out.println("==============");
			}
			else {
				System.out.println("invalid Output");
			}
		}
		
	}
	static void deleteProduct(ArrayList<Product> items) {
		Scanner scan = new Scanner(System.in);
		int inputId;
		int index = 0;
		while(true) {
			boolean bool = false;
			System.out.print("Enter id ");
			inputId = scan.nextInt();
			for(Product p:items) {
				if(p.id==inputId) {
					bool = true;
					break;
				}
				index++;
			}
			if(bool==true) {
				break;
			}
			System.out.println("ID not exit");
		}
		items.remove(index);
		System.out.print("Deleted");
	}
	
	static void updateProductDetails(ArrayList<Product> items) {
		Scanner scan = new Scanner(System.in);
		int inputId;
		float inputPrice;
		int inputQuantity;
		int index = 0;
		while(true) {
			boolean bool = false;
			System.out.print("Enter id ");
			inputId = scan.nextInt();
			for(Product p:items) {
				if(p.id==inputId) {
					bool = true;
					break;
				}
				index++;

			}
			if(bool==true) {
				break;
			}
			System.out.println("ID not exit");
		}
		char c;
		System.out.print("Enter p - price or q - quantity: ");
		c = scan.next().toLowerCase().charAt(0);
		switch(c) {
		case 'p': System.out.print("Enter the Price ");
		inputPrice = scan.nextFloat();
		Product p = items.get(index);
		items.set(index, new Product(p.id,p.name,inputPrice,p.quantity));
		break;
		case 'q': System.out.print("Enter Quantity ");
		inputQuantity = scan.nextInt();
		Product q = items.get(index);
		items.set(index, new Product(q.id,q.name,q.price,inputQuantity));
		break;
		default: System.out.println("Invalid Choice");
		}
		
	}
	static void addProduct(ArrayList<Product> items) {
		Scanner scan = new Scanner(System.in);
		int inputId;
		String inputName;
		float inputPrice;
		int inputQuantity;
		while(true) {
			boolean bool = false;
			System.out.print("Enter new id ");
			inputId = scan.nextInt();
			for(Product p:items) {
				if(p.id==inputId) {
					bool = true;
					System.out.println("Already Exists");
					break;
				}
			}
			if(bool==false) {
				break;
			}
		}
		System.out.print("Enter Name ");
		inputName = scan.next();
		System.out.print("Enter Price ");
		inputPrice = scan.nextFloat();
		System.out.print("Enter Quantity ");
		inputQuantity = scan.nextInt();
		items.add(new Product(inputId, inputName, inputPrice, inputQuantity));
	}
}
