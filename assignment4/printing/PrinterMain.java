package assignment4.printing;

import java.util.Scanner;

public class PrinterMain {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Printer p = new Printer();
		String[] s = {"Apple","Microsoft","Amazon","Meta"};
		Object b = new Object();
		while (true) {
			System.out.print("Want to experience method overloading yes/no ");
			if (scan.next().equals("no")) {
				break;
			}
			System.out.print("Enter String, Integer, Double, Array or Object ");
			switch (scan.next().toLowerCase()) {
			case "integer":
				p.print(5);
				break;
			case "string":
				p.print("Yadnyesh");
				break;
			case "double":
				p.print(8.6);
				break;
			case "array":
				p.print(s);
				break;
			case "object":
				p.print(b);
				break;
			default: System.out.println("Invalid Output");
			}
		}
	}
}
