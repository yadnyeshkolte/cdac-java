package fileio;
import java.io.Serializable;
class YadnyeshObject implements Serializable{
	int id;
	String surname;
	byte years;
	float skills;
	public YadnyeshObject(int id, String surname, byte years, float skills) {
		this.id = id;
		this.surname = surname;
		this.years = years;
		this.skills = skills;
	}
	
	void getExperience() {
		System.out.println("Total Years of Experience: "+years*skills);
	}
	void displayObject() {
		System.out.println(id+" "+surname+" "+years+" "+skills);
	}
	
}
