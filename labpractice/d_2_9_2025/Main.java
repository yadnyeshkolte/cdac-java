package labpractice.d_2_9_2025;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		while (true) {
			System.out.println("Want to know the Questions? and what's the related number, Enter 'Questions': ");
			Scanner input = new Scanner(System.in);
			System.out.print("Enter the Q.no to continue 1 - 2 or 'exit': ");

			String inputString = input.next().toLowerCase();
			if (inputString.equals("exit")) {
				System.out.println("Bye!");
				break;
			}
			switch (inputString) {
			case "1":
				Library.main(args);
				break;
			case "2":
				Car.main(args);;
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
			System.out.print("Enter 1 - 2 to check Q.no details or 'exit': ");

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
					Library.main();
				}
				break;
			case "2":
				System.out.print("Vehicle System ");
				System.out.print("Want to try out this question : yes/no: ");
				String switchInput2 = input.next().toLowerCase();
				if (switchInput2.equals("yes")) {
					Car.main();
				}
				break;
			default:
				System.out.println("Invalid input");
			}
		}
	}
}

