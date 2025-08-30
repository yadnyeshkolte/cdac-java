package basicproblems;
import java.util.Scanner;
public class ThreeNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1  = scan.nextInt();
		int num2  = scan.nextInt();
		int num3  = scan.nextInt();
		if (num1>=num2) {
			if(num3>=num1) {
				System.out.println(num3);
			}
			else {
				System.out.println(num1);
			}
		}
		else {
			if(num3>=num2) {
				System.out.println(num3);
			}
			else {
				System.out.println(num2);
			}
		}
	}
}
