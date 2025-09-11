package questions.productmanagentsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class PMSMain {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Scanner scan = new Scanner(System.in);
		int id;
		String input;
		while(true){
			System.out.println("Enter the case to continue: ");
			System.out.println("a-add Product , u-update Product, d-delete Product ");
			System.out.print("v-view Product , s-search Product, c-calculate total price of Inventory ");
			input = scan.next();
			if(input.equals("exit")) {
				break;
			}
			switch(input) {
			case "a": System.out.println("Lets start to add product: ");
			JDBCProductConnections.addProduct();
			break;
			case "u": System.out.print("Enter the id to Update: ");
			id = scan.nextInt();
			JDBCProductConnections.updateDetails(id);
			break;
			case "d": System.out.print("Enter the id to Delete: ");
			id = scan.nextInt();
			JDBCProductConnections.deleteDetails(id);
			break;
			case "v": System.out.println("view all products: ");
			JDBCProductConnections.viewAllProducts();
			break;
			case "s": System.out.println("Enter name or category to search the product: ");
			input = scan.next();
			JDBCProductConnections.searchProduct(input);
			break;
			case "c": System.out.println("calculate inventory ");
			JDBCProductConnections.calculateTotalInventoryValue();
			break;
			default: System.out.println("Invalid Input");
			}
		}
		
	}

}
