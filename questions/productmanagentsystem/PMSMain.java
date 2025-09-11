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
		//JDBCProductConnections.addProduct();
		//System.out.print("Enter the id");
		//id = scan.nextInt();
		System.out.print("Enter the name");
		input = scan.next();
		//JDBCProductConnections.updateDetails(id);
		
		/*JDBCProductConnections.viewAllProducts();
		
		JDBCProductConnections.calculateTotalInventoryValue();
		
		JDBCProductConnections.deleteDetails(id);*/
		
		JDBCProductConnections.searchProduct(input);
		
		
		
	}

}
