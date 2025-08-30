package basicproblems;
import java.util.Scanner;
public class Grade {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		float percentage = scan.nextFloat();
		if(percentage>=80) {
			System.out.println("A grade");
		}
		else if(percentage>=60) {
			System.out.println("B grade");
		}
		else if(percentage>=50) {
			System.out.println("C grade");
		}
		else if(percentage>=40) {
			System.out.println("D grade");
		}
		else {
			System.out.println("Failed");
		}
	}
	

}
