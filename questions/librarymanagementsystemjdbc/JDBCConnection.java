package questions.librarymanagementsystemjdbc;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import java.beans.Statement;
import java.sql.Connection;

public class JDBCConnection {
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/lms","root","982223");
		
		return con;
	}
	public static boolean checkId(int id) throws ClassNotFoundException, SQLException {
		String query = "select * from library";
		PreparedStatement pmt = getConnection().prepareStatement(query);
		ResultSet rs = pmt.executeQuery();
		boolean bool = false;
		while(rs.next()) {
			if(rs.getInt(1)==id) {
				bool = true;
				break;
			}
		}
		
		return bool;
	}
	public static void addBook(Library b) throws ClassNotFoundException, SQLException {
		String query = "insert into library value (?,?,?,?)";
		PreparedStatement pmt = getConnection().prepareStatement(query);
		pmt.setInt(1, b.bookId);
		pmt.setString(2, b.title);
		pmt.setString(3, b.author);
		pmt.setInt(4, returnBooltoInt(b.isAvailable));
		int no = pmt.executeUpdate();
		System.out.print(no+" updated");
	}
	public static void viewAllBooks() throws ClassNotFoundException, SQLException {
		String query = "select * from library";
		PreparedStatement pmt = getConnection().prepareStatement(query);
		ResultSet rs = pmt.executeQuery();
		Library l;
		while(rs.next()) {
			System.out.println("Book id: "+rs.getInt(1)+" Title "+rs.getString(2)+" Author "+rs.getString(3)+" is it available: "+getYesOrNo(rs.getInt(4)));
		}
	}
	public static void updateBook(int bookId) throws ClassNotFoundException, SQLException {
		Scanner scan = new Scanner(System.in);
		int inputInt = bookId;
		String inputBool;
		String input;
		String inputA;
		System.out.print("Enter the Name: ");
		input = scan.next();
		System.out.print("Enter the Author: ");
		inputA = scan.next();
		System.out.print("IS it will be available? yes/no: ");
		inputBool = scan.next();
		
		String query = "update library set title=?,author=?,isAvailable=? where bookId=?";
		PreparedStatement pmt = getConnection().prepareStatement(query);
		pmt.setInt(4, inputInt);
		pmt.setString(1, input);
		pmt.setString(2, inputA);
		pmt.setInt(3, getNo(inputBool));
		
		int no = pmt.executeUpdate();
		
		System.out.println(no+" update");
	}
	public static void deleteBook(int bookId) throws SQLException, ClassNotFoundException {
		String query = "delete from library where bookId=?";
		PreparedStatement pmt = getConnection().prepareStatement(query);
		pmt.setInt(1, bookId);
		
		int no = pmt.executeUpdate();
		
		System.out.println(no+" update");
	}
	public static int getNo(String yesno) {
		if(yesno.toLowerCase().equals("yes")) {
			return 1;
		}
		else {
			return 0;
		}
	}
	public static String getYesOrNo(int number) {
		if(number==1) {
			return "Yes";
		}
		else {
			return "No";
		}
	}
	public static int returnBooltoInt(boolean bool) {
		if(bool) {
			return 1;
		}
		else {
			return 0;
		}
	}
}
