package labpractice.d_3_9_2025.finalencapsulation;

public class Student {
	private int id;
	private String name;
	private static final String cname = "dac";
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCname() {
		return cname;
	}
}
