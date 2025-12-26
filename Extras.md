---

## JDBC (Java Database Connectivity)

### Basic JDBC Steps

```java
package jdbc;

import java.sql.*;

public class Employee {
    // JDBC Steps:
    // 1. Load the driver
    // 2. Establish connection
    // 3. Create statement
    // 4. Execute query
    // 5. Process result
    // 6. Close connections
    
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/company";
        String username = "root";
        String password = "password";
        
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        
        try {
            // 1. Load driver (optional in JDBC 4.0+)
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // 2. Establish connection
            conn = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to database");
            
            // 3. Create statement
            stmt = conn.createStatement();
            
            // 4. Execute query
            String query = "SELECT * FROM employees";
            rs = stmt.executeQuery(query);
            
            // 5. Process result
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                double salary = rs.getDouble("salary");
                
                System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
            }
            
        } catch (ClassNotFoundException e) {
            System.out.println("Driver not found");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Database error");
            e.printStackTrace();
        } finally {
            // 6. Close connections (in reverse order)
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

// Using PreparedStatement (prevents SQL injection)
public class PreparedStatementExample {
    public static void insertEmployee(int id, String name, double salary) {
        String url = "jdbc:mysql://localhost:3306/company";
        String username = "root";
        String password = "password";
        
        String query = "INSERT INTO employees (id, name, salary) VALUES (?, ?, ?)";
        
        try (Connection conn = DriverManager.getConnection(url, username, password);
             PreparedStatement pstmt = conn.prepareStatement(query)) {
            
            pstmt.setInt(1, id);
            pstmt.setString(2, name);
            pstmt.setDouble(3, salary);
            
            int rowsAffected = pstmt.executeUpdate();
            System.out.println(rowsAffected + " row(s) inserted");
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
```
