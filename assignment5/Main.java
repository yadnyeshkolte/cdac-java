package assignment5;

import java.util.Scanner;

import assignment5.food.FoodDeliveryTest;

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
				VehicleTest.main();
				break;
			case "2":
				OrderTest.main();
				break;
			case "3":
				PaymentTest.main();
				break;
			case "4":
				SmartDeviceText.main();
				break;
			case "5":
				FoodDeliveryTest.main();
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
				System.out.print("Vehicle Rental System ");
				System.out.print("Want to try out this question : yes/no: ");
				String switchInput1 = input.next().toLowerCase();
				if (switchInput1.equals("yes")) {
					VehicleTest.main();
				}
				break;
			case "2":
				System.out.print("E-Commerce Order ");
				System.out.print("Want to try out this question : yes/no: ");
				String switchInput2 = input.next().toLowerCase();
				if (switchInput2.equals("yes")) {
					OrderTest.main();
				}
				break;
			case "3":
				System.out.print("Online Payment System ");
				System.out.print("Want to try out this question : yes/no: ");
				String switchInput3 = input.next().toLowerCase();
				if (switchInput3.equals("yes")) {
					PaymentTest.main();
				}
				break;
			case "4":
				System.out.print("Smart Home Devices ");
				System.out.print("Want to try out this question : yes/no: ");
				String switchInput4 = input.next().toLowerCase();
				if (switchInput4.equals("yes")) {
					SmartDeviceText.main();
				}
				break;
			case "5":
				System.out.print("Online Food Delivery System ");
				System.out.print("Want to try out this question : yes/no: ");
				String switchInput5 = input.next().toLowerCase();
				if (switchInput5.equals("yes")) {
					FoodDeliveryTest.main();
				}
				break;
			default:
				System.out.println("Invalid input");
			}
		}
	}
}
