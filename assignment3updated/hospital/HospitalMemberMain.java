package assignment3updated.hospital;
import java.util.Scanner;

public class HospitalMemberMain {
	public static void main() {
		
		Scanner scan = new Scanner(System.in);
		Doctor[] doctors = new Doctor[5];
		Nurse[] nurses = new Nurse[5];
		
		Doctors d = new Doctors();
		Nurses n = new Nurses();
		
		doctors = d.getDoctors();
		nurses = n.getNurses();
		
		int input1;
		int input2;
		double fee;
		for(int i=0;i<doctors.length;i++) {
			System.out.print("Please Enter No. Patients and Fee Per Patient ");
			input1 = scan.nextInt();
			fee = scan.nextDouble();
			System.out.println(doctors[i].name+" Earned "+doctors[i].calculateConsultationFee(input1, fee));
		}
		for(int i=0;i<nurses.length;i++) {
			System.out.print("Please Enter Shifts and Hours Per Shift ");
			input1 = scan.nextInt();
			input2 = scan.nextInt();
			System.out.println(nurses[i].name+" have "+nurses[i].calculateDutyHours(input1, input2)+" Duty Hours");
		}
	}
}
