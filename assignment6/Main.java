package assignment6;

import java.util.Scanner;

import assignment6.library.LibraryManagementSystem;
import assignment6.productinventory.ProductInventoryManagementSystem;

public class Main {
	public static void main(String[] args) {
		while (true) {
			System.out.println("Want to know the Questions? and what's the related number, Enter 'Questions': ");
			Scanner input = new Scanner(System.in);
			System.out.print("Enter the Q.no to continue 1 - 5 or 'exit': ");

			String inputString = input.next().toLowerCase();
			if (inputString.equals("exit")) {
				System.out.println("Bye!");
				break;
			}
			switch (inputString) {
			case "1":
				ProductInventoryManagementSystem.main();
				break;
			case "2":
				LibraryManagementSystem.main();
				break;
			case "3":
				StackMain.main();
				break;
			case "4":
				QueueMain.main();
				break;
			case "5":
				LinkedListMain.main();
				break;
			case "questions":
				questionDetails();
				break;
			default:
				System.out.println("Invalid input");
			}
		}
	}
	
	static void questionDetails() {

		while (true) {
			Scanner input = new Scanner(System.in);
			System.out.print("Enter 1 - 5 to check Q.no details or 'exit': ");

			String inputStringDetails = input.next().toLowerCase();
			if (inputStringDetails.equals("exit")) {
				break;
			}
			switch (inputStringDetails) {
			case "1":
				System.out.print("Product Inventory Management System ");
				System.out.print("Want to try out this question : yes/no: ");
				String switchInput1 = input.next().toLowerCase();
				if (switchInput1.equals("yes")) {
					ProductInventoryManagementSystem.main();
				}
				break;
			case "2":
				System.out.print("Library Management System ");
				System.out.print("Want to try out this question : yes/no: ");
				String switchInput2 = input.next().toLowerCase();
				if (switchInput2.equals("yes")) {
					LibraryManagementSystem.main();
				}
				break;
			case "3":
				System.out.print("Stack (with Integer values) ");
				System.out.print("Want to try out this question : yes/no: ");
				String switchInput3 = input.next().toLowerCase();
				if (switchInput3.equals("yes")) {
					StackMain.main();
				}
				break;
			case "4":
				System.out.print("Queue (with Integer values) ");
				System.out.print("Want to try out this question : yes/no: ");
				String switchInput4 = input.next().toLowerCase();
				if (switchInput4.equals("yes")) {
					QueueMain.main();
				}
				break;
			case "5":
				System.out.print("LinkedList (with Integer values) ");
				System.out.print("Want to try out this question : yes/no: ");
				String switchInput5 = input.next().toLowerCase();
				if (switchInput5.equals("yes")) {
					LinkedListMain.main();
				}
				break;
			default:
				System.out.println("Invalid input");
			}
		}
	}
	
}
