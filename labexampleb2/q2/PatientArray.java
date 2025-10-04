package labexampleb2.q2;

import java.util.ArrayList;

public class PatientArray {
	public static ArrayList<Patient> getPatientDeatails() {
		ArrayList<Patient> pa = new ArrayList<>();

		pa.add(new Patient(1,"Aarav", 34, "Diabetes","High"));
		pa.add(new Patient(2, "Sneha", 28, "Asthma","Low"));
		pa.add(new Patient(3, "Rohan", 45, "Hypertension","Mid"));
		pa.add(new Patient(4, "Meera", 52, "Arthritis","High"));
		pa.add(new Patient(5, "Kabir", 39, "Migraine","Low"));
		
		return pa;
	}
}
