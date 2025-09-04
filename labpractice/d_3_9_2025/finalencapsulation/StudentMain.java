package labpractice.d_3_9_2025.finalencapsulation;

public class StudentMain {
	public static void main(String[] args) {
		Student s = new Student();
		System.out.println("Predefined: "+s.getId());
		System.out.println("Predefined: "+s.getName());
		System.out.println("Final: "+s.getCname());
		s.setId(9);
		s.setName("Dee");
		//s.setCname("DBDA"); not possible cause it is final
		System.out.println("Setted: "+s.getId());
		System.out.println("Setted: "+s.getName());
	}
}
