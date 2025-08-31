package assignment3;

import java.util.Scanner;

public class EmployeeManagementSystem {
	static void main() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to EMployee Management System ");
		Manager person = new Manager();
		while(true) {
			System.out.print("Enter 'd' - display bonue 'c' calcuate bonus 'exit' - exit: ");
			String input = scan.next().toLowerCase();
			if(input.equals("exit")) {
				break;
			}
			switch(input) {
				case "d": System.out.print("Details are: " );
				person.displayDetails();
				break;
				case "c": System.out.print("Calculatd Bonus: ");
				System.out.println(person.calculateBonus());
				break;
				default: System.out.println("invalid input");
			}
		}
	}
}
