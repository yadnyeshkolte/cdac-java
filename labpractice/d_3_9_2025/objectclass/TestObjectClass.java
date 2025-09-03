package labpractice.d_3_9_2025.objectclass;

public class TestObjectClass {
	public static void main(String[] args) {
		Employee e = new Employee(100,"Me",56000.0f);
		Developer d = new Developer(102,"Him",65555.7f,1);
		Employee ed =  new Developer(103,"Them",545333.0f,2);
		e.displayEmp();
		System.out.println(e.hashCode());
		System.out.println(e.toString());
		System.out.println("=====================");
		d.displayDev();
		System.out.println(d.hashCode());
		System.out.println(d.toString());
		System.out.println("=====================");
		d.displayDev();
		d.displayEmp();
		System.out.println(ed.hashCode());
		System.out.println(ed.toString());
		
	}
}
