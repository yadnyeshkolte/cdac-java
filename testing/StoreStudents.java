package testing;

public class StoreStudents {
	public Student[] intialise() {
		
		Student[] dacs = new Student[6];
		
		dacs[0] = new Student(1,"Rushi",87,79,99);
		dacs[1] = new Student(2,"Yadnyesh",89,79,99);
		dacs[2] = new Student(3,"Anuj",87,79,99);
		dacs[3] = new Student(4,"Deepak",87,79,99);
		dacs[4] = new Student(5,"Aaman",87,79,99);
		dacs[5] = new Student(6,"Sataym",87,79,99);
		
		return dacs;
	}
}
