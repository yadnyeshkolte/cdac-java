package Hello.java;
import java.util.Scanner;
public class CheckNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		
		if(number>0) {
			System.out.println("It is positive");
		}
		else if(number==0) {
			System.out.println("It is zero");
		}
		else {
			System.out.println("It is negative");
		}
	}

}
