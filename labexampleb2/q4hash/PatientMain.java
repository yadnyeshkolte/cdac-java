package labexampleb2.q4hash;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class PatientMain {	
	public static void main(String[] args) {
 		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome!");
		while(true) {
			System.out.println("1 - addPatient, 2-searchPatient 3-updatePatient 0-exit");
			System.out.println("4 - deletePatient, 5 display Patients 6-getPatientsByDisease");
			System.out.print("Enter the case: ");
			int input = scan.nextInt();
			if(input==0) {
				System.out.println("Bye!");
				break;
			}
			switch(input) {
			case 1: PatientMethodsHash.addPatient();
			break;
			case 2: PatientMethodsHash.searhcPatient();
			break;
			case 3: PatientMethodsHash.updatePatient();
			break;
			case 4: PatientMethodsHash.deletePatient();
			break;
			case 5: System.out.println("Here are the patient Details");
			for(Entry<Integer, PatientH> p: PatientMethodsHash.hph.entrySet()) {
				p.getValue().getInfo();
			}
			break;
			case 6: System.out.print("Enter the disease: ");
			String dis = scan.next();
			PatientMethodsHash.getPatientsByDisease(dis);
			break;
			default: System.out.println("Invalid integer input");
			}
		}
	}
}
