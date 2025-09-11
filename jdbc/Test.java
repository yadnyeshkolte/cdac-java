package jdbc;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
public class Test {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		int update; 
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","982223");
		
		Statement smt = con.createStatement();
		
		String s = "select * from manager";
		
		String s1 = "insert into manager value (6,'Anu',5353)";
		
		update = smt.executeUpdate(s1);
		
		ResultSet rs = smt.executeQuery(s);
		while(rs.next()) {
			
			System.out.println("Employee ID: "+rs.getInt(1)+" Employee Name: "+rs.getString(2)+" Salary: "+rs.getInt(3));
		}
		
		System.out.println("===================================================");
		
		String s2 = "update manager set emp_sal=4556 where emp_id=6";
		
		smt.executeUpdate(s2);
		
		rs = smt.executeQuery(s);
		while(rs.next()) {
			
			System.out.println("Employee ID: "+rs.getInt(1)+" Employee Name: "+rs.getString(2)+" Salary: "+rs.getInt(3));
		}
		
		System.out.println("===================================================");
		
		String s3 = "delete from manager where emp_id=6";
		
		update = smt.executeUpdate(s3);
		
		rs = smt.executeQuery(s);
		while(rs.next()) {
			
			System.out.println("Employee ID: "+rs.getInt(1)+" Employee Name: "+rs.getString(2)+" Salary: "+rs.getInt(3));
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	/*
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","982223");
	Statement smt = con.createStatement();
	String s = "select * from manager";
	ResultSet rs = smt.executeQuery(s);
	while(rs.next()) {
		System.out.println("Employee ID: "+rs.getInt(1)+" Employee Name: "+rs.getString(2)+" Salary: "+rs.getInt(3));
	}*/
}
