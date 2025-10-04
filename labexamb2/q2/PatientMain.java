package labexamb2.q2;
import java.util.ArrayList;
import java.util.Scanner;
public class PatientMain {
	public static void main(String[] args) {
 		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome!");
		while(true) {
			System.out.println("1 - addPatient, 2-updatePatient 3-searchPatient 0-exit");
			System.out.println("4 - deletePatient, 5 display Patients 6-getCriticalPatients");
			System.out.print("Enter the case: ");
			int input = scan.nextInt();
			if(input==0) {
				System.out.println("Bye!");
				break;
			}
			switch(input) {
			case 1: PatientMethods.addPatient();
			break;
			case 2: PatientMethods.updatePatient();
			break;
			case 3: PatientMethods.searhcPatient();
			break;
			case 4: PatientMethods.deletePatient();
			break;
			case 5: System.out.println("Here are the patient Details");
			for(Patient p: PatientMethods.pam) {
				p.getInfo();
			}
			break;
			case 6: PatientMethods.getCriticalPatients();
			break;
			default: System.out.println("Invalid integer input");
			}
		}
		
	}
}
