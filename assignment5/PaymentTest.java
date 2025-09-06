package assignment5;
import java.util.Scanner;
public class PaymentTest {
	public static void main() {
		CreditCardPayment c = new CreditCardPayment(123456987l,65481258946l);
		UPIPayment u = new UPIPayment(123456987l,65481258946l);
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the amount you want to add ");
		c.processPayment(scan.nextDouble());
		System.out.print("Enter the amount you want to refund ");
		c.refund(scan.nextDouble());
		System.out.print("Enter the amount you want to add ");
		u.processPayment(scan.nextDouble());
		System.out.print("Enter the amount you want to refund ");
		c.refund(scan.nextDouble());
	}
}
