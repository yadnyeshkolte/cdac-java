package Hello.java;
import java.util.Scanner;

public class SimpleIntrest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter: ");
		int p = scan.nextInt();
		int r = scan.nextInt();
		int t = scan.nextInt();
		int simple_intrest = p*r*t;
		
		System.out.println(simple_intrest);
	}

}
