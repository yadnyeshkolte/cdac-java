package assignment5;
import java.util.Scanner;
public class SmartDeviceText {
	public static void main(String[] args) {
		Light l = new Light(1,false);
		Fan f = new Fan(2,false);
		Scanner scan = new Scanner(System.in);
		String input;
		while(true) {
			System.out.print("Enter Light, Fan, get, or exit ");
			input = scan.next().toLowerCase();
			if(input.equals("exit")) {
				break;
			}
			switch(input) {
			case "light":System.out.println("Enter on/off ");
			input = scan.next().toLowerCase();
			if(input.equals("on")) {
				l.turnOn();
			}
			else if(input.equals("off")) {
				l.turnOff();
			}
			else {
				System.out.println("Invalid output");
			}
			break;
			case "fan": System.out.println("Enter on/off ");
			input = scan.next().toLowerCase();
			if(input.equals("on")) {
				f.turnOn();
			}
			else if(input.equals("off")) {
				f.turnOff();
			}
			else {
				System.out.println("Invalid output");
			}
			break;
			case "get": System.out.println("Light is "+onOff(l.getStatus()));
			System.out.println("Fan is "+onOff(f.getStatus()));
			}
		}
	}
	static String onOff(boolean bool) {
		if(bool==true) {
			return "ON";
		}
		else {
			return "OFF";
		}
	}
}
