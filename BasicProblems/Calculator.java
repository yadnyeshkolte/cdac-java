package basicproblems;
import java.util.Scanner;
public class Calculator {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number1 = scan.nextInt();
		int number2 = scan.nextInt();
		System.out.println(number1+number2);
		System.out.println(number1-number2);
		System.out.println(number1*number2);
		System.out.println(number1/number2);
	}
}
