package assignment3updated.hospital;

public class HospitalMember {
	int memberId;
	String name;
	String department;
	HospitalMember(){
		memberId = 0;
		name = "Empty";
		department = "Empty";
	}
	HospitalMember(int memberId, String name, String department){
		this.memberId = memberId;
		this.name = name;
		this.department = department;
	}
}

class Doctor extends HospitalMember{
	
	Doctor(int memberId, String name){
		super(memberId, name, "Ortho");
	}
	
	double calculateConsultationFee(int patients, double feePerPatient) {
		return patients*feePerPatient;
	}
}

class Nurse extends HospitalMember{
	Nurse(int memberId, String name, String department){
		super(memberId, name, department);
	}
	
	int calculateDutyHours(int shifts, int hoursPerShift){
		return shifts*hoursPerShift;
	}
}
