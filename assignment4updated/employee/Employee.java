package assignment4updated.employee;

public class Employee {
	String name;
	float basicSalary;
	Employee(String name,float basicSalary){
		this.name= name;
		this.basicSalary=basicSalary;
		
	}
	void calculateSalary() {
		System.out.println(" salary of employee is "+ basicSalary);
	}
}
class Manager extends Employee{
	Manager(String name,float basicSalary){
	super(name,basicSalary);	
	}
	@Override
	void calculateSalary() {
		System.out.println(" salary of Manager is "+ (basicSalary+basicSalary*0.2));
	}
}
class SoftwareEngineer  extends Employee{
	SoftwareEngineer (String name,float basicSalary){
	super(name,basicSalary);	
	}
	@Override
	void calculateSalary() {
		System.out.println(" salary of SoftwareEngineer is "+ (basicSalary+basicSalary*0.15));
	}
}
