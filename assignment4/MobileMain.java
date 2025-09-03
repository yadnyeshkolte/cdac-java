package assignment4.mobile;

import java.util.Scanner;

public class MobileMain {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Mobile m = new Mobile();
		String[] store = new String[10];
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
			store[index] = m.addContact(name, phoneno);
			index++;
			break;
			
			case "2" : System.out.print("Enter name ");
			name = scan.next();
			System.out.println("Enter Phoneno ");
			phoneNumber = scan.next();
			System.out.println("Enter email ");
			email = scan.next();
			System.out.println("Details added"+m.addContact(name, phoneNumber, email));
			store[index] = m.addContact(name, phoneNumber, email);
			index++;
			break;
			
			case "3" : System.out.print("Enter the radius ");
			double radius = scan.nextDouble();
			System.out.println("Area of the Square is: "+s.area(radius));
			break;
			
			case "4" : System.out.print("Enter the Base ");
			double base = scan.nextDouble();
			System.out.print("Enter the Height ");
			double height = scan.nextDouble();
			boolean isTriangle = true;
			System.out.println("Area of the Triangle is: "+s.area(base,height,isTriangle));
			break;
			
			default: System.out.println("Invalid Output");
			}
			
		}
		
	}
}
