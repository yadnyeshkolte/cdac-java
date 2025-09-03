package assignment4.mobile;

public class Mobile {
	 String addContact(String name, String phoneNumber) {
		 return name + " has "+ phoneNumber;
	 }
	String addContact(String name, String phoneNumber, String email) {
		return name + " has "+ phoneNumber+ " has "+ email;
	}
	String addContact(String name, String phoneNumber, String email, String address) {
		return name+" has " + phoneNumber+" has " + email+" has " + address;
	}
	void addContact(String[] names, String[] numbers){
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i]+" "+numbers[i]);
		}
	}
}
