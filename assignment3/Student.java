package assignment3;

class Student {
	String name;
	int marks;
	Student(){
		name = "Gaurav";
		marks = 78;
	}
	Student(String name, int marks){
		this.name = name;
		this.marks = marks;
	}
	void showDetails() {
		System.out.println("Student name "+this.name+" Marks is "+this.marks);
	}
}

class GraduateStudent extends Student{
	String specialization;
	GraduateStudent(){
		specialization = "EEE";
	}
	GraduateStudent(String specialization){
		this.specialization = specialization;
	}
	void checkPass() {
		if(this.marks>=50) {
			System.out.println("Passed");
		}
		else {
			System.out.println("Failed");
		}
	}
}