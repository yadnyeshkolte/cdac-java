package assignment3updated.vehicle;
import java.util.Scanner;

public class VehicleMain {
	public static void main() {
		Scanner scan = new Scanner(System.in);
		
		Bike[] cdacbike = new Bike[5];
		Car [] cdaccar = new Car[5];
		
		Bikes createBikeObjects = new Bikes();
		Cars createCarObjects = new Cars();
		
		cdacbike = createBikeObjects.createObjects();
		cdaccar = createCarObjects.initialize();
		
		System.out.print("Enter the days: ");
		int days = scan.nextInt();
		System.out.println("====================");
		for(int i=0;i<cdacbike.length;i++) {
			cdacbike[i].calculateRental(days);
		}
		System.out.println("====================");
		for(int i=0;i<cdaccar.length;i++) {
			cdaccar[i].calculateRental(days);
		}
	}

}
