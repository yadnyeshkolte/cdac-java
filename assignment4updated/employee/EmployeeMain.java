package assignment4updated.employee;



public class EmployeeMain {
	public static void main(String[] args) {
		String name = "yadynesh";
		float basicSalary = 90000.0f;
		Employee e = new Employee(name,basicSalary);
		Manager m = new Manager(name,basicSalary);
		SoftwareEngineer s = new SoftwareEngineer(name,basicSalary);
		
		e.calculateSalary();
		m.calculateSalary();
		s.calculateSalary();
	}
}
