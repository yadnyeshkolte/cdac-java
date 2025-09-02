package assignment3updated.education;

public class Person {
	String name = "Empty";
	byte age = 0;
	int id = 0;

	Person() {
	}

	Person(String name, byte age, int id) {
		this.name = name;
		this.age = age;
		this.id = id;

	}

}

class Student extends Person {
	int marks;

	Student(String name, byte age, int id, int marks) {
		super(name, age, id);
		this.marks = marks;
	}

	char calculateGrade(int marks) {
		if (marks > 80) {
			return 'A';
		} else if (marks > 60) {
			return 'B';
		} else if (marks > 50) {
			return 'C';
		} else if (marks > 40) {
			return 'D';
		} else {
			return 'F';
		}
	}
}

class Teacher extends Person {
	int hoursWorked;
	Teacher(String name, byte age, int id, int hoursWorked) {
		super(name, age, id);
		this.hoursWorked = hoursWorked;
	}

	int calculateSalary(int hoursWorked, int ratePerHour) {
		return (hoursWorked * ratePerHour);
	}
}
