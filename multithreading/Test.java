package multithreading;

public class Test {
	public static void main(String[] args) {
		EmployeeCount e1 = new EmployeeCount();
		EmployeeCount e2 = new EmployeeCount();
		EmployeeCount e3 = new EmployeeCount();
		EmployeeCount e4 = new EmployeeCount();
		EmployeeCount e11 = new EmployeeCount();
		EmployeeCount e21 = new EmployeeCount();
		EmployeeCount e31 = new EmployeeCount();
		EmployeeCount e41 = new EmployeeCount();
		EmployeeCount eec = new EmployeeCount();
		EmployeeCount eex = new EmployeeCount();
		
		e1.start();
		e2.start();
		e3.start();
		e4.start();
		e11.start();
		e21.start();
		e31.start();
		e41.start();
		
		eec.start();
		eex.start();
		
		
		System.out.println("main is ended");
		
	}
}
