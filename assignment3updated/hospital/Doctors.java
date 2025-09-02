package assignment3updated.hospital;

public class Doctors {
	Doctor[] getDoctors() {
		Doctor[] doctors = new Doctor[5];
		doctors[0] = new Doctor(3,"Ashish");
		doctors[1] = new Doctor(4,"Omi");
		doctors[2] = new Doctor(5,"Yash");
		doctors[3] = new Doctor(6,"Shubham");
		doctors[4] = new Doctor(7,"Gambhir");
		
		return doctors;
	}
}
