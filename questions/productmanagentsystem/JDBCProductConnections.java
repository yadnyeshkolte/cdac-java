package questions.productmanagentsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;
import java.sql.Statement;

//import com.mysql.cj.xdevapi.Statement;

public class JDBCProductConnections {
	
	public static Connection gotConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/productsystem","root","982223");
		return con;
	}
	public static void updateJDBCData(int id, String name, String category, double price, int quantity, String query) throws ClassNotFoundException, SQLException {

		PreparedStatement pmt = gotConnection().prepareStatement(query);
		pmt.setInt(1,id);
		pmt.setString(2,name);
		pmt.setString(3,category);
		pmt.setDouble(4,(double) price);
		pmt.setInt(5,quantity);
		
		int no = pmt.executeUpdate();

		System.out.println("It is updated "+no);
		pmt.close();
	}
	public static void addProduct() throws ClassNotFoundException, SQLException{
		int id;
		String name;
		String category;
		double price;
		int quantity;
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the id: ");
		id = scan.nextInt();
		System.out.print("Enter the name: ");
		name = scan.next();
		System.out.print("Enter the category: ");
		category = scan.next();
		System.out.print("Enter the price: ");
		price = scan.nextDouble();
		System.out.print("Enter the quantity: ");
		quantity = scan.nextInt();
		
		String qadd = "insert into Products values (?,?,?,?,?)";

		updateJDBCData(id,name,category,price,quantity,qadd);
		
	}
	public static void updateDetails(int idnumber) throws ClassNotFoundException, SQLException {
		Scanner scan = new Scanner(System.in);
		Products po = getDetails(idnumber);
		String input;
		//int inputInt;
		//double inputdouble;
		//name
		while(true) {
			System.out.print("Want to edit name yes/no");
			input = scan.next();
			if(input.equals("no")) {
				break;
			}
			System.out.print("Please enter the name ");
			input = scan.next();
			po.productName = input;
			break;
		}
		//category
		while(true) {
			System.out.print("Want to edit category yes/no");
			input = scan.next();
			if(input.equals("no")) {
				break;
			}
			System.out.print("Please enter the category ");
			input = scan.next();
			po.category = input;
			break;
		}
		//price
		while(true) {
			System.out.print("Want to edit price yes/no");
			input = scan.next();
			if(input.equals("no")) {
				break;
			}
			System.out.print("Please enter the price ");
			input = scan.next();
			po.price = Double.parseDouble(input);
			break;
		}
		//quantity
		while(true) {
			System.out.print("Want to edit quantity yes/no");
			input = scan.next();
			if(input.equals("no")) {
				break;
			}
			System.out.print("Please enter the quantity ");
			input = scan.next();
			po.quantity = Integer.parseInt(input);
			break;
		}
		
		String updateQuery = "insert into Products values (?,?,?,?,?)";
		updateJDBCData(po.productId, po.productName, po.category, po.price, po.quantity, updateQuery);
		
	}
	public static Products getDetails(int productid) throws SQLException, ClassNotFoundException {
		String query = "select * from Products where productId="+productid+"";
		PreparedStatement pmt = gotConnection().prepareStatement(query);
		Products pi = new Products();
		ResultSet rs = pmt.executeQuery();
		while(rs.next()) {
			pi.productId = rs.getInt(1);
			pi.productName = rs.getString(2);
			pi.category = rs.getString(3);
			pi.price = rs.getDouble(4);
			pi.quantity = rs.getInt(5);
		}
		return pi;
		
	}
	public static void viewAllProducts() throws ClassNotFoundException, SQLException {
		String query = "select * from Products";
		
		Statement smt = gotConnection().createStatement();
		
		ResultSet rs = smt.executeQuery(query);
		
		while(rs.next()) {
			System.out.println("Product ID: "+rs.getInt(1)+" Product Name: "+rs.getString(2)+" Product Category: "+rs.getString(3)+" Product Price: "+rs.getDouble(4)+" Product Quantity: "+rs.getInt(5));
		}
		
	}
	public static void calculateTotalInventoryValue() throws ClassNotFoundException, SQLException {
		String query = "select * from Products";
		
		Statement smt = gotConnection().createStatement();
		
		ResultSet rs = smt.executeQuery(query);
		
		Double amount = 0.0;
		
		while(rs.next()) {
			amount += rs.getDouble(4)*rs.getInt(5);
		}
		System.out.println(amount);
		
	}
	
	public static void deleteDetails(int idnumber) throws ClassNotFoundException, SQLException {
		Scanner scan = new Scanner(System.in);
		Products po = getDetails(idnumber);
		String input;
		//int inputInt;
		//double inputdouble;
		//name
		
		String deleteQuery = "delete from Products where productId="+idnumber+"";
		
		PreparedStatement pmt = gotConnection().prepareStatement(deleteQuery);
		
		int no = pmt.executeUpdate();
		
		System.out.println(no+" deleted");

	}
	public static void searchProduct(String keyword) throws ClassNotFoundException, SQLException {
		ArrayList<Integer> al = new ArrayList<>();
		String query = "select * from Products";
		Statement smt = gotConnection().createStatement();
		ResultSet rs = smt.executeQuery(query);
		
		while(rs.next()) {
			if(rs.getString(2).equals(keyword)) {
				al.add(rs.getInt(1));
			}
			
			else if(rs.getString(3).equals(keyword)) {
				al.add(rs.getInt(1));
			}
			
		}
		Products poi;
		for(int i=0;i<al.size();i++) {
			poi = getDetails(al.get(i));
			System.out.println("Product ID: "+poi.productId+" Product Name: "+poi.productName+" Product Category: "+poi.category+" Product Price: "+poi.price+" Product Quantity: "+poi.quantity);
		}
		
	}
	
}
