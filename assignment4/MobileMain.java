package assignment4.mobile;

import java.util.Scanner;

public class MobileMain {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Mobile m = new Mobile();
		String[] store = new String[10];
		String[] names = new String[10];
		String[] numbers = new String[10];
		int index = 0;
		String name;
		String phoneNumber;
		String email;
		String address;
	
		while(true) {
			
			System.out.print("Want to experience method overloading yes/no ");
			if(scan.next().toLowerCase().equals("no")){
				break;
			}
			
			System.out.print("Enter 1, 2, 3 or 4 ");
			switch(scan.next().toLowerCase()) {
			
			case "1" : System.out.print("Enter name ");
			name = scan.next();
			System.out.println("Enter Phoneno ");
			phoneNumber = scan.next();
			System.out.println("Details added"+m.addContact(name, phoneNumber));
			store[index] = m.addContact(name, phoneNumber);
			names [index] = name;
			numbers [index] = phoneNumber;
			index++;
			break;
			
			case "2" : System.out.print("Enter name ");
			name = scan.next();
			System.out.println("Enter Phoneno ");
			phoneNumber = scan.next();
			System.out.println("Enter email ");
			email = scan.next();
			System.out.println("Details added "+m.addContact(name, phoneNumber, email));
			store[index] = m.addContact(name, phoneNumber, email);
			names [index] = name;
			numbers [index] = phoneNumber;
			index++;
			break;
			
			case "3" : System.out.print("Enter name ");
			name = scan.next();
			System.out.println("Enter Phoneno ");
			phoneNumber = scan.next();
			System.out.println("Enter email ");
			email = scan.next();
			System.out.println("Enter Address ");
			address = scan.next();
			System.out.println("Details added"+m.addContact(name, phoneNumber, email, address));
			store[index] = m.addContact(name, phoneNumber, email, address);
			names [index] = name;
			numbers [index] = phoneNumber;
			index++;
			break;
			case "4" : System.out.println("Here are the details ");
			m.addContact(names, numbers);
			break;
			default: System.out.println("Invalid Output");
			}
			
		}
		
	}
}
