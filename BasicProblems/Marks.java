package basicproblems;
import java.util.Scanner;
public class Marks {
	public static void main(String[] arg) {
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		if (num1>=50) {
			System.out.println("PASS");
		}
		else {
			System.out.println("Fail");
		}
	}
}
