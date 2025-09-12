package questions.librarymanagementsystem;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class LibraryManagementSystemMain {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Scanner scan = new Scanner(System.in);
		String input;
		String input1;
		String input2;
		String input3;
		int inputInt;
		boolean inputBool;
		ArrayList<Book> ab = BookArray.getBooks();
		FileOutputStream fs = new FileOutputStream("bookdata.txt");
		ObjectOutputStream oi = new ObjectOutputStream(fs);
		for(int i=0;i<ab.size();i++) {
			oi.writeObject(ab.get(i));
		}
		
		while(true) {
			System.out.print("Enter the case to continue: ");
			input = scan.next();
			if(input.equals("exit")) {
				break;
			}
			switch(input) {
			case "a": System.out.println("");
			System.out.println("Enter the name: ");
			input = scan.next();
			System.out.println("Enter the author: ");
			input1 = scan.next();
			System.out.println("Enter the ISBN: ");
			input2 = scan.next();
			System.out.println("Enter the no of pages: ");
			inputInt = scan.nextInt();
			Book b = new Book(input, input1, input2, inputInt, true);
			//implement the uniqueness
			LibraryMethods.addBook(b);
			break;
			case "v": System.out.println("");
			LibraryMethods.viewAllBooks();
			break;
			case "s": System.out.println("");
			System.out.println("Enter the title: ");
			input = scan.next();
			LibraryMethods.searchByTitle(input);
			break;
			case "c": System.out.println("");
			System.out.println("Enter the title: ");
			input = scan.next();
			LibraryMethods.isBookAvailable(input);
			break;
			default: System.out.println("Invalid Input");
			}
		}
	}
}
