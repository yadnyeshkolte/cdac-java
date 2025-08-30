package basicproblems;
import java.util.Scanner;

public class CheckCharacter {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char character = scan.next().charAt(0);
		int ascii = (int) character;
		if(ascii>=33 && ascii<=47) {
			System.out.println("Special Charater");
		}
		else if(ascii>=48 && ascii<=57) {
			System.out.println("Digit");
		}
		else if(ascii>=65 && ascii<=90 || ascii>=97 && ascii<=122) {
			if(ascii==65 || ascii==69 || ascii==73 || ascii==79 || ascii==85 
					|| ascii==97 || ascii==101 || ascii==105 
					|| ascii==111 || ascii==117) {
				System.out.println("It is a vowel");
			}
			else {
				System.out.println("It is Consonent");
			}
		}
		scan.close();
	}
}
