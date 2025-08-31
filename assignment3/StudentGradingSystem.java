package assignment3;

import java.util.Scanner;

public class StudentGradingSystem {
	static void main() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to Student Grading System ");
		GraduateStudent student = new GraduateStudent();
		while(true) {
			System.out.print("Enter 's' - Show details 'c' check marks 'exit' - exit: ");
			String input = scan.next().toLowerCase();
			if(input.equals("exit")) {
				break;
			}
			switch(input) {
				case "s": System.out.print("Details are: " );
				student.showDetails();
				break;
				case "c": System.out.print("Studnent is: ");
				student.checkPass();
				break;
				default: System.out.println("invalid input");
			}
		}
	}
}
