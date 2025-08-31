package assignment3;

import java.util.Scanner;

public class VehicleSystem {
	static void main() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to Vehicle System");
		Car volkswagen = new Car();
		while(true) {
			System.out.print("Enter 'l' - add fuel in l 'd' distance will travellng 'exit' - exit: ");
			String input = scan.next().toLowerCase();
			if(input.equals("exit")) {
				break;
			}
			switch(input) {
				case "l": System.out.print("How many liters: ");
				float liters = scan.nextFloat();
				volkswagen.refuel(liters);
				System.out.println("Fuel car having: "+volkswagen.fuel+" ");
				break;
				case "d": System.out.print("It will be covering: ");
				System.out.println(volkswagen.calculateTravelDistance()+"km distance");
				break;
				default: System.out.println("invalid input");
			}
		}
	}
}
