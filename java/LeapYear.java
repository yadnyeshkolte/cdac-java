package Hello.java;
import java.util.Scanner;

public class LeapYear {
	public static void main(String[] arg) {
		Scanner rushikesh = new Scanner(System.in);
		int year = rushikesh.nextInt();
		
		
		if (year%4==0) {
			System.out.println("it is leap year");
		}
		
		
		else {
			System.out.println("it is not leap year");
		}
		
		
		
	}
}
