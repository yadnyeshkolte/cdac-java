package assignment3;

public class Employee {
	String name;
	int salary;
	
	Employee(){
		name = "Adarsh";
		salary = 2000000;
	}
	Employee(String name, int salary){
		this.name = name;
		this.salary = salary;
	}
	void displayDetails() {
		System.out.println("Employee: "+this.name+" Salary is "+this.salary);
	}
}
class Manager extends Employee{
	int teamSize;
	Manager(){
		teamSize = 5;
	}
	Manager(int teamSize){
		this.teamSize = teamSize;
	}
	int calculateBonus() {
		return this.salary*this.teamSize;
	}
}

