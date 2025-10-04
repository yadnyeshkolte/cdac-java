package labexampleb2.q4hash;

public class PatientH {
	int patientId;
	String name;
	int age;
	String disease;
	
	
	public PatientH() {
		this.patientId = 0;
		this.name = "Empty";
		this.age = 0;
		this.disease = "Empty"; //default dela edge cases remove karnya sahti
	}
	
	public PatientH(int patientId, String name, int age, String disease) {
		this.patientId = patientId;
		this.name = name;
		this.age = age;
		this.disease = disease;
	}
	void getInfo() {
		System.out.println("Patient Id: "+this.patientId+" name: "+this.name+" age: "+this.age+" disease: "+this.disease);
	}
}