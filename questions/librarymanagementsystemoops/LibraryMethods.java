package questions.librarymanagementsystemoops;

import java.util.ArrayList;

import java.util.Scanner;

public class LibraryMethods{
	static ArrayList<Object> ab = new ArrayList<>();
	static void getBooks() {
		ab.add(new FictionBook(1,"Hero","Thor",true,"End"));
		ab.add(new FictionBook(2,"Hero1","IronMan",true,"Forma"));
		ab.add(new AcademicBook(3,"Biography","John",true,"science"));
		ab.add(new AcademicBook(4,"Gerography","Me",false,"Geo"));
		ab.add(new FictionBook(5,"Hero","Thor1",true,"Marval"));
		ab.add(new NonFictionBook(6,"Hero2","Thor2",true,"Endgame"));
		ab.add(new NonFictionBook(7,"Hero3","Thor3",true,"NewWorld"));
	}
	static void addBook() {
		Book b;
		Scanner scan = new Scanner(System.in);
		String input = "";
		String input1 = "";
		String input2 = "";
		int inputInt = 0;
		//boolean inputBool = false;
		while(true) {
			System.out.print("Enter the type of book you want to add: a,f,n: ");
			input = scan.next();
			if(input.equals("a")) {
				System.out.print("Enter Subject: ");
				input2 = scan.next();
				b = new AcademicBook(0,"Empty","Empty",true,input2);
				//b.displayBookDetails();
				break;
			}
			else if(input.equals("f")) {
				System.out.print("Enter Genre: ");
				input2 = scan.next();
				b = new FictionBook(0,"Empty","Empty",true,input2);
				break;
			}
			else if(input.equals("n")) {
				System.out.print("Enter Topic: ");
				input2 = scan.next();
				b = new NonFictionBook(0,"Empty","Empty",true,input2);
				break;
			}
			System.out.println("Case Does not exist");
		}
		System.out.print("Enter the id: ");
		inputInt = scan.nextInt();
		//add check ones
		System.out.print("Enter the Title: ");
		input = scan.next();
		System.out.print("Enter the Author: ");
		input1 = scan.next();	
		b.bookId = inputInt;
		b.author = input1;
		b.isAvailable = true;
		b.title = input;
		ab.add(b);
		System.out.println("Book added Successfully");
	}
	static void viewAllBooks() {
		for(int i=0;i<ab.size();i++) {
			System.out.println(ab.get(i).toString());
		}
	}
	static void borrowBook(int bookId) {
		Book b;
		b = getObject(bookId);
		b.isAvailable = false;
		System.out.println("-----------> Its Borrowed");
	}
	static void returnBook(int bookId, int daysLate) {
		Book b;
		b = getObject(bookId);
		b.isAvailable = true;
		double ruppes = 0.0;
		if(daysLate>0) {
			if(objectName(bookId).equals("AcademicBook")) {
				AcademicBook a = (AcademicBook) b;
				ruppes = a.calculateFine(daysLate);
			}
			else if(objectName(bookId).equals("FictionBook")) {
				FictionBook a = (FictionBook) b;
				ruppes = a.calculateFine(daysLate);
			}
			else if(objectName(bookId).equals("NonFictionBook")) {
				NonFictionBook a = (NonFictionBook) b;
				ruppes = a.calculateFine(daysLate);
			}
			System.out.println("Pay the late dues of: "+ruppes+" Ruppes");
		}
		System.out.println("-----------> Its Returned");
	}
	static String objectName(int bookId) {
		Book b;
		for(int i=0;i<ab.size();i++) {
			String s = ab.get(i).getClass().getSimpleName();
			b = (Book) ab.get(i);
			if(bookId==b.bookId) {
				//System.out.print(s);
				return s;
			}
		}
		return "";
	}
	static Book getObject(int bookId) {
		Book b = null;
		for(int i=0;i<ab.size();i++) {
			b = (Book) ab.get(i);
			if(bookId==b.bookId) {
				break;
			}
		}
		
		return b;
	}
	static boolean bookPresent(int bookId) {
		Book b;
		boolean bool = false;
		for(int i=0;i<ab.size();i++) {
			b = (Book) ab.get(i);
			if(bookId==b.bookId && b.isAvailable==true) {
				bool = true;
				break;
			}
		}
		return bool;
	}
	static boolean checkId(int bookId) {
		Book b;
		boolean bool = false;
		for(int i=0;i<ab.size();i++) {
			b = (Book) ab.get(i);
			if(bookId==b.bookId) {
				bool = true;
				break;
			}
		}
		return bool;
	}
}
