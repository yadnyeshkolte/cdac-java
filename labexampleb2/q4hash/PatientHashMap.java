package labexampleb2.q4hash;

import java.util.ArrayList;
import java.util.HashMap;

public class PatientHashMap {
	public static HashMap<Integer, PatientH> getPatientDeatails() {
		HashMap<Integer,PatientH> ph = new HashMap<>();

		ph.put(1, new PatientH(1,"Aarav", 34, "Diabetes"));
		ph.put(2, new PatientH(2, "Sneha", 28, "Asthma"));
		ph.put(3, new PatientH(3, "Rohan", 45, "Hypertension"));
		ph.put(4, new PatientH(4, "Meera", 52, "Arthritis"));
		ph.put(5, new PatientH(5, "Kabir", 39, "Migraine"));
		
		return ph;
	}
}
