package assignment3updated.hospital;

public class Nurses {
	Nurse[] getNurses() {
		Nurse[] nurses = new Nurse[5];
		nurses[0] = new Nurse(2,"Sakshi","Ortho");
		nurses[1] = new Nurse(5,"Mrunali","Eye");
		nurses[2] = new Nurse(7,"Yashswi","Ears");
		nurses[3] = new Nurse(8,"Gunjan","Legs");
		nurses[4] = new Nurse(9,"Sammy","Hands");
		
		return nurses;
	}
}
