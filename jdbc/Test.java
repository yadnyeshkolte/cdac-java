package jdbc;

import java.sql.DriverManager;

public class Test {
	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		//Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/");
	}
}
