package labexampleb2.q4hash;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map.Entry;


public class PatientMethodsHash {
	static HashMap<Integer, PatientH> hph = PatientHashMap.getPatientDeatails();
	
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
			if(hph.containsKey(pid)) {
				System.out.println("Patient id already exist");
				coll = false;
				break;
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
			
			hph.put(pid, new PatientH(pid,pname,page,pdisease));
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
			if(hph.containsKey(pid)) {
				System.out.println("Lets continue with update");
				hph.get(pid).getInfo();
				coll = false;
				break;
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
			
			PatientH pu = new PatientH(pid,pname,page,pdisease);
			hph.replace(pid, pu);
			System.out.println("Patient details updated");
		}
	}
	
	public static void searhcPatient() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the patient name to find: ");
		String pname = scan.next();
		boolean b = true;
		for(Entry<Integer, PatientH> p: PatientMethodsHash.hph.entrySet()) {
			if(pname.toLowerCase().equals(p.getValue().name.toLowerCase())) {
				p.getValue().getInfo();
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
			if(hph.containsKey(pid)) {
				hph.remove(pid);
				System.out.println("Patient Removed");
				coll = false;
				break;
			}

			if(coll==false) {
				break;
			}
		}
	}
	
	public static void getPatientsByDisease(String disease) {
		for(Entry<Integer, PatientH> p: PatientMethodsHash.hph.entrySet()) {
			if(disease.toLowerCase().equals(p.getValue().disease.toLowerCase())) {
				p.getValue().getInfo();
			}
		}
	}
	
}
