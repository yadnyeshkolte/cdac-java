package assignment3updated.education;

public class EducationMain {
	public static void main(String[] args) {
		
		Student[] students = new Student[5];
		Teacher[] teachers = new Teacher[5];
		
		Students cdacStudents = new Students();
		Teachers cdacTeachers = new Teachers();
		
		students = cdacStudents.initializeStudent();
		teachers =  cdacTeachers.initializeTeacher();
		
		for(int i=0;i<students.length;i++) {
			System.out.println("Student "+students[i].name+" has grade "+students[i].calculateGrade(students[i].marks));
		}
		
		System.out.println("=====================");
		
		for(int i=0;i<teachers.length;i++) {
			System.out.println("Teacher "+teachers[i].name+" has salary "+teachers[i].calculateSalary(teachers[i].hoursWorked, 700));
		}
		
	}
}
