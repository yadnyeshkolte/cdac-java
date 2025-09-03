
package assignment4updated;


import java.util.Scanner;

import assignment4updated.vehicle.VehicleMain;
import assignment4updated.appliance.ApplianceMain;
import assignment4updated.bankaccount.BankAccoutMain;
import assignment4updated.employee.EmployeeMain;


public class Main {
	public static void main(String[] args) {

		while (true) {
			System.out.println("Want to know the Questions? and what's the related number, Enter 'Questions': ");
			Scanner input = new Scanner(System.in);
			System.out.print("Enter the Q.no to continue 1 - 4 or 'exit': ");

			String inputString = input.next().toLowerCase();
			if (inputString.equals("exit")) {
				System.out.println("Bye!");
				break;
			}
			switch (inputString) {
			case "1":
				BankAccoutMain.main();
				break;
			case "2":
				EmployeeMain.main();
				break;
			case "3":
				VehicleMain.main();
				break;
			case "4":
				ApplianceMain.main();
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
			System.out.print("Enter 1 - 4 to check Q.no details or 'exit': ");

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
					BankAccoutMain.main();
				}
				break;
			case "2":
				System.out.print("Employee Salary System ");
				System.out.print("Want to try out this question : yes/no: ");
				String switchInput2 = input.next().toLowerCase();
				if (switchInput2.equals("yes")) {
					EmployeeMain.main();
				}
				break;
			case "3":
				System.out.print("Vehicle Speed Calculation ");
				System.out.print("Want to try out this question : yes/no: ");
				String switchInput3 = input.next().toLowerCase();
				if (switchInput3.equals("yes")) {
					VehicleMain.main();
				}
				break;
			case "4":
				System.out.print("Appliance Power Consumption ");
				System.out.print("Want to try out this question : yes/no: ");
				String switchInput4 = input.next().toLowerCase();
				if (switchInput4.equals("yes")) {
					ApplianceMain.main();
				}
				break;
			default:
				System.out.println("Invalid input");
			}
		}
	}
}
