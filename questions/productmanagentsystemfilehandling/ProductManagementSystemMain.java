package questions.productmanagentsystemfilehandling;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class ProductManagementSystemMain {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		 Scanner scan = new Scanner(System.in);
		 String input;
		 int inputInt;
		 double inputDouble;
		 int intputQuantity;
		 ArrayList<Product> al = ProductArray.getProducts();
		 FileOutputStream fs = new FileOutputStream("products.dat");
		 ObjectOutputStream oi = new ObjectOutputStream(fs);
		 for(int i=0;i<al.size();i++) {
			 oi.writeObject(al.get(i));
		 }
		 
		 
		 while(true) {
			 System.out.print("Enter the case you want to try: ");
			 input = scan.next();
			 if(input.equals("exit")) {
				 System.out.println("Bye!");
				 break;
			 }
			 switch(input) {
			 case "a": System.out.println("Adding the product: ");
			 Product po;
			 while(true) {
				 System.out.println("Product Id: ");
				 inputInt = scan.nextInt();
				 if(checkId(inputInt)==false) {
					 break;
				 }
				 else {
					 System.out.println("Entry already Exist");
				 }
			 }
			 System.out.println("Product name: ");
			 input = scan.next();
			 System.out.println("Product price: ");
			 inputDouble = scan.nextDouble();
			 System.out.println("Product Quantiy: ");
			 intputQuantity = scan.nextInt();
			
			 ProductMethods.addProduct(new Product(inputInt, input, inputDouble, intputQuantity));
			 break;
			 case "v": System.out.println("View all Products");
			 ProductMethods.viewAllProducts();
			 break;
			 case "c": System.out.println("Calculate the total Inventory value");
			 ProductMethods.calculateTotalInventoryValue();
			 break;
			 default: System.out.println("Invalid Output");
			 }
		 }
	}
	
	public static boolean checkId(int id) throws IOException, ClassNotFoundException {
		 FileInputStream fs = new FileInputStream("products.dat");
		 ObjectInputStream oi = new ObjectInputStream(fs);
		 Product pro;
		 boolean bool = false;
		 try {
			 while((pro = (Product)  oi.readObject())!=null) {
				 if(pro.productId==id) {
					 bool = true;
					 break;
				 }
			 }
		 }
		 catch(EOFException e) {
			 
		 }

		 return bool;
	}
}
