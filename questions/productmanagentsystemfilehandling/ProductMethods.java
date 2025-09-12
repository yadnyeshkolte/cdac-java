package questions.productmanagentsystemfilehandling;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ProductMethods {
	public static void addProduct(Product p) throws IOException, ClassNotFoundException {
		 FileInputStream fs = new FileInputStream("products.dat");
		 ObjectInputStream oi = new ObjectInputStream(fs);
		 ArrayList<Product> al = new ArrayList<>();
		 Product pro;
		 try {
			 while((pro = (Product)  oi.readObject())!=null) {
				 al.add(pro);
			 }
		 }
		 catch(EOFException e) {
			 
		 }
		 al.add(p);
		 
		 FileOutputStream fso = new FileOutputStream("products.dat");
		 ObjectOutputStream oio = new ObjectOutputStream(fso);
		 try {
			 for(int i=0;i<al.size();i++) {
				 oio.writeObject(al.get(i));
			 }
		 }
		 catch(EOFException e) {
			
		 }

	}
	
	public static void viewAllProducts() throws IOException, ClassNotFoundException {
		 FileInputStream fs = new FileInputStream("products.dat");
		 ObjectInputStream oi = new ObjectInputStream(fs);
		 Product pro;
		 try {
			 while((pro = (Product)  oi.readObject())!=null) {
				 pro.diplayProductDetails();
			 }
		 }
		 catch(EOFException e) {
			 
		 }

	}
	
	public static void calculateTotalInventoryValue() throws IOException, ClassNotFoundException {
		 FileInputStream fs = new FileInputStream("products.dat");
		 ObjectInputStream oi = new ObjectInputStream(fs);
		 Product pro;
		 double amount = 0.0;
		 try {
			 while((pro = (Product)  oi.readObject())!=null) {
				 amount += pro.price*pro.quantity;
			 }
		 }
		 catch(EOFException e) {
			 
		 }

		 System.out.println("=============================");
		 System.out.println("Total Inventory Price "+amount);
		 System.out.println("=============================");
	}
}
