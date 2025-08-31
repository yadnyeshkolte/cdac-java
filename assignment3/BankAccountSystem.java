package assignment3;
import java.util.Scanner;

public class BankAccountSystem {
	static void main() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to Bank Account System");
		SavingsAccount account = new SavingsAccount();
		while(true) {
			System.out.print("Enter 'd' - deposite 'c' calcuate intrest 'exit' - exit: ");
			String input = scan.next().toLowerCase();
			if(input.equals("exit")) {
				break;
			}
			switch(input) {
				case "d": System.out.print("Enter amount: ");
				int amount = scan.nextInt();
				account.deposit(amount);
				System.out.println("Total Balance is: "+account.balance+" ");
				break;
				case "c": System.out.print("Here is yor Intrest: ");
				System.out.println(account.calculateInterest());
				break;
				default: System.out.println("invalid input");
			}
		}
	}
}
