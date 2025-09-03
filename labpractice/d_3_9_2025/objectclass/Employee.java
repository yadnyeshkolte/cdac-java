package labpractice.d_3_9_2025.objectclass;

public class Employee extends Object{
	int empId;
	String name;
	float salary;
	public Employee(int empId, String name, float salary) {
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}
	void displayEmp() {
		System.out.println("This is an Employee "+empId+" "+name+" "+salary);
	}
	@Override
	public String toString() {
		return "( "+empId+" "+name+" "+salary+")";
	}
}

class Developer extends Employee{
	int githubId;
	Developer(int empId,String name,float salary, int githubId){
		super(empId, name, salary);
		this.githubId = githubId;
	}
	void displayDev() {
		System.out.println("This is a Developer "+empId+" "+name+" "+salary+" "+githubId);
	}
	@Override
	public String toString() {
		return "( "+empId+" "+name+" "+salary+" "+githubId+" )";
	}
}
