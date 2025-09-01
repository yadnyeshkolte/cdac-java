package testing;

public class Main {
	public static void main(String[] args) {
		Student[] testDacs = new Student[6];
		StoreStudents st = new StoreStudents();
		
		testDacs = st.intialise();
		
		for(int i=0;i<testDacs.length;i++) {
			System.out.println("Average of "+testDacs[i].name+" is "+((testDacs[i].emarks+testDacs[i].cmarks+testDacs[i].mmarks)/3));
		}
		
	}
}
