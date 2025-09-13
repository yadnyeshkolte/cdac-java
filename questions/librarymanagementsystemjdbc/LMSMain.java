package questions.librarymanagementsystemjdbc;

import java.sql.SQLException;
import java.util.Scanner;

public class LMSMain {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner scan = new Scanner(System.in);
		
		String input = "";
		String inputA = "";
		int inputInt = 0;
		
		Library b;
		System.out.println("Welcome to our LMS");
		
		while(true) {
			System.out.println("'a'-add 'v'-view 'u'-update 'd'-delete");
			System.out.print("Enter the case ");
			input = scan.next();
			if(input.equals("exit")) {
				System.out.println("Bye!");
				break;
			}
			switch(input) {
			case "a": System.out.print("");
			while(true) {
				System.out.print("Enter the id: ");
				inputInt = scan.nextInt();
				if(JDBCConnection.checkId(inputInt)) {
					System.out.println("Already exist");
					continue;
				}
				break;
			}
			//check id present or not
			System.out.print("Enter the Title: ");
			input = scan.next();
			System.out.print("Enter the Author: ");
			inputA = scan.next();
			JDBCConnection.addBook(new Library(inputInt, input, inputA, true));
			break;
			case "v":JDBCConnection.viewAllBooks();
			break;
			case "u":System.out.print("");
			while(true) {
				System.out.print("Enter the id: ");
				inputInt = scan.nextInt();
				if(JDBCConnection.checkId(inputInt)) {
					break;
				}
				System.out.println("Re-enter the id");
			}
			JDBCConnection.updateBook(inputInt);
			break;
			case "d":System.out.print("");
			while(true) {
				System.out.print("Enter the id: ");
				inputInt = scan.nextInt();
				if(JDBCConnection.checkId(inputInt)) {
					break;
				}
				System.out.println("Does not exist, Re-enter the id");
			}
			JDBCConnection.deleteBook(inputInt);
			break;
			default: System.out.print("Invalid Output");
			}
		}
	}
	/*
	 * mysql> select * from library;
+--------+-------+--------+-------------+
| bookId | title | author | isAvailable |
+--------+-------+--------+-------------+
|      1 | Hoax  | John   |           1 |
|      2 | rrrr  | rrrr   |           1 |
+--------+-------+--------+-------------+

	 */
}
