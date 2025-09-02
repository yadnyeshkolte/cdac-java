package assignment3updated.education;

public class Teachers {
	Teacher[] initializeTeacher() {
		Teacher[] cdacTeachers = new Teacher[5];
		cdacTeachers[0]= new Teacher("Nathan",(byte)56,12,10);
		cdacTeachers[1]= new Teacher("Rishi",(byte)26,13,8);
		cdacTeachers[2]= new Teacher("Kothari",(byte)59,14,4);
		cdacTeachers[3]= new Teacher("DeepGupta",(byte)45,15,3);
		cdacTeachers[4]= new Teacher("Praveen",(byte)32,15,7);
		return cdacTeachers;
	}
	
}
