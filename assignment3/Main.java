package assignment3;


import java.util.Scanner;

import assignment3updated.banking.BankingMain;
import assignment3updated.education.EducationMain;
import assignment3updated.vehicle.VehicleMain;
import assignment3updated.ecommerce.ProductMain;
import assignment3updated.hospital.HospitalMemberMain;

public class Main {
	public static void main(String[] args) {

		while (true) {
			System.out.println("Want to know the Questions? and what's the related number, Enter 'Questions' 'Updated': ");
			Scanner input = new Scanner(System.in);
			System.out.print("Enter the Q.no to continue 1 - 5 or 'exit': ");

			String inputString = input.next().toLowerCase();
			if (inputString.equals("exit")) {
				System.out.println("Bye!");
				break;
			}
			switch (inputString) {
			case "1":
				BankAccountSystem.main();
				break;
			case "2":
				VehicleSystem.main();
				break;
			case "3":
				EmployeeManagementSystem.main();
				break;
			case "4":
				StudentGradingSystem.main();
				break;
			case "5":
				ProductBillingSystem.main();
				break;
			case "questions":
				questionDetails();
				break;
			case "updated":
				updatedQuestions();
				break;
			default:
				System.out.println("Invalid input");
			}
		}
	}

	static void updatedQuestions() {

		while (true) {
			Scanner input = new Scanner(System.in);
			System.out.print("Enter 1 - 5 to check Updated Q.no details or 'exit': ");

			String inputStringDetails = input.next().toLowerCase();
			if (inputStringDetails.equals("exit")) {
				break;
			}
			switch (inputStringDetails) {
			case "1":
				System.out.print("Vehicle Rental System ");
				System.out.print("Want to try out this question : yes/no: ");
				String switchInput1 = input.next().toLowerCase();
				if (switchInput1.equals("yes")) {
					VehicleMain.main();
				}
				break;
			case "2":
				System.out.print("Educational Institute ");
				System.out.print("Want to try out this question : yes/no: ");
				String switchInput2 = input.next().toLowerCase();
				if (switchInput2.equals("yes")) {
					EducationMain.main();
				}
				break;
			case "3":
				System.out.print("Banking System ");
				System.out.print("Want to try out this question : yes/no: ");
				String switchInput3 = input.next().toLowerCase();
				if (switchInput3.equals("yes")) {
					BankingMain.main();
				}
				break;
			case "4":
				System.out.print("E-commerce Store ");
				System.out.print("Want to try out this question : yes/no: ");
				String switchInput4 = input.next().toLowerCase();
				if (switchInput4.equals("yes")) {
					ProductMain.main();
				}
				break;
			case "5":
				System.out.print("Hospital Management ");
				System.out.print("Want to try out this question : yes/no: ");
				String switchInput5 = input.next().toLowerCase();
				if (switchInput5.equals("yes")) {
					HospitalMemberMain.main();
				}
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
				System.out.print("Bank Account System ");
				System.out.print("Want to try out this question : yes/no: ");
				String switchInput1 = input.next().toLowerCase();
				if (switchInput1.equals("yes")) {
					BankAccountSystem.main();
				}
				break;
			case "2":
				System.out.print("Vehicle System ");
				System.out.print("Want to try out this question : yes/no: ");
				String switchInput2 = input.next().toLowerCase();
				if (switchInput2.equals("yes")) {
					VehicleSystem.main();
				}
				break;
			case "3":
				System.out.print("Employee Management ");
				System.out.print("Want to try out this question : yes/no: ");
				String switchInput3 = input.next().toLowerCase();
				if (switchInput3.equals("yes")) {
					EmployeeManagementSystem.main();
				}
				break;
			case "4":
				System.out.print("Student Grading System ");
				System.out.print("Want to try out this question : yes/no: ");
				String switchInput4 = input.next().toLowerCase();
				if (switchInput4.equals("yes")) {
					StudentGradingSystem.main();
				}
				break;
			case "5":
				System.out.print("Product Billing System ");
				System.out.print("Want to try out this question : yes/no: ");
				String switchInput5 = input.next().toLowerCase();
				if (switchInput5.equals("yes")) {
					ProductBillingSystem.main();
				}
				break;
			default:
				System.out.println("Invalid input");
			}
		}
	}
}
