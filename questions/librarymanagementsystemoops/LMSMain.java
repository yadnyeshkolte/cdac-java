package questions.librarymanagementsystemoops;

import java.util.Scanner;


public class LMSMain {
	public static void main(String[] args) {
		LibraryMethods.getBooks();
		String input = "";
		int inputInt = 0;
		int inputInt1 = 0;
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.print("Enter the case to continue: ");
			input = scan.next();
			switch(input.toLowerCase()) {
			case "a": LibraryMethods.addBook();
			break;
			case "v": LibraryMethods.viewAllBooks();
			break;
			case "b": boolean boolb = false;
			while(true) {
				System.out.print("Enter the id to borrow: ");
				input = scan.next();
				if(input.equals("exit")) {
					boolb = true;
					break;
				}
				inputInt = Integer.parseInt(input);
				if(LibraryMethods.checkId(inputInt) && LibraryMethods.bookPresent(inputInt)) {
					System.out.println("Does exist");
					break;
				}
				System.out.println("Doesn't exist or It must be Borrowed");
			}
			if(boolb = true) {
				break;
			}
			LibraryMethods.borrowBook(inputInt);
			break;
			case "r": boolean boolr = false;
			while(true) {
				System.out.print("Enter the id to return: ");
				input = scan.next();
				if(input.equals("exit")) {
					boolr = true;
					break;
				}
				inputInt = Integer.parseInt(input);
				if(LibraryMethods.checkId(inputInt) && LibraryMethods.bookPresent(inputInt)==false) {
					System.out.println("Lets start With return");
					break;
				}
				System.out.println("It is already present in our Library");
			}
			if(boolr = true) {
				break;
			}
			System.out.print("Enter the late dues: ");
			inputInt1 = scan.nextInt();
			LibraryMethods.returnBook(inputInt, inputInt1);
			break;
			default: System.out.println("Invalid Input");
			}
		}
	}
}
