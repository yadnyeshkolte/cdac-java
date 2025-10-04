package labexamb2.q2;
import java.util.ArrayList;
import java.util.Scanner;
public class PatientMethods {
	static ArrayList<Patient> pam = PatientArray.getPatientDeatails();
	public static void addPatient() {
		Scanner scan = new Scanner(System.in);
		int pid;
		String pname;
		int page;
		String pdisease;
		boolean coll = true;
		while(true) {
			System.out.print("Enter the Id or 0 to break: ");
			pid = scan.nextInt();
			if(pid==0) {
				break;
			}
			for(Patient p:pam) {
				if(p.patientId==pid) {
					System.out.println("Patient id already exist");
					coll = false;
					break;
				}
			}
			if(coll) {
				break;
			}
		}
		if(pid!=0) {
			System.out.print("Enter the Patient Name: ");
			pname = scan.next();
			System.out.print("Enter the Patient age: ");
			page = scan.nextInt();
			System.out.print("Enter the Patient disease: ");
			pdisease = scan.next();
			
			pam.add(new Patient(pid,pname,page,pdisease,"Low"));
			System.out.println("Patient added");
		}

	}
	public static void updatePatient() {
		Scanner scan = new Scanner(System.in);
		int pid;
		String pname;
		int page;
		String pdisease;
		boolean coll = true;
		int index = 0;
		while(true) {
			System.out.print("Enter the Id or 0 to break: ");
			pid = scan.nextInt();
			if(pid==0) {
				break;
			}
			for(Patient p:pam) {
				if(p.patientId==pid) {
					System.out.println("Lets continue with update");
					p.getInfo();
					coll = false;
					break;
				}
				index++;
			}
			if(coll) {
				System.out.println("Id does not Exist");
			}
			else if(coll==false) {
				break;
			}
		}
		if(pid!=0) {
			System.out.print("Enter the Patient Name: ");
			pname = scan.next();
			System.out.print("Enter the Patient age: ");
			page = scan.nextInt();
			System.out.print("Enter the Patient disease: ");
			pdisease = scan.next();
			System.out.print("Enter the Patient severity: ");
			String pseverity = scan.next();
			
			Patient pu = new Patient(pid,pname,page,pdisease,pseverity);
			pam.set(index, pu);
		}
	}
	public static void searhcPatient() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the patient name to find: ");
		String pname = scan.next();
		boolean b = true;
		for(Patient p :pam) {
			if(p.name.toLowerCase().equals(pname.toLowerCase())) {
				p.getInfo();
				b = false;
				break;
			}
		}
		if(b) {
			System.out.println("Patient donot Exist");
		}
	}
	public static void deletePatient() {
		Scanner scan = new Scanner(System.in);
		int pid;
		boolean coll = true;
		int index = 0;
		while(true) {
			System.out.print("Enter the Id or 0 to break: ");
			pid = scan.nextInt();
			if(pid==0) {
				break;
			}
			for(Patient p:pam) {
				if(p.patientId==pid) {
					pam.remove(index);
					System.out.println("Patient Removed");
					coll = false;
					break;
				}
				index++;
			}
			if(coll==false) {
				break;
			}
		}
	}
	public static void getCriticalPatients() {
		for(Patient p:pam) {
			if(p.severity.toLowerCase().equals("High".toLowerCase())) {
				System.out.print(p.severity+" - ");
				p.getInfo();
			}
		}
	}
}
