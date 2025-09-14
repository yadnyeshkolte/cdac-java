package questions.librarymanagementsystemarraylist;

import java.util.ArrayList;

public class Library {
	static ArrayList<Book> ab = new ArrayList<>();
	
	public static void getBooks() {
		ArrayList<Book> ah = new ArrayList<>();
		ah.add(new Book("Hero","John","1",56,true));
		ah.add(new Book("Hero1","John1","12",56,true));
		ah.add(new Book("Hero2","John3","13",56,true));
		ah.add(new Book("Hero4","John4","14",56,true));
		ah.add(new Book("Hero5","John5","15",56,true));
		ah.add(new Book("Hero6","John6","16",566,true));
		
		ab = ah;
	}
	
	public static void addBook(Book book){
		ab.add(book);
	}
	
	public static void viewAllBooks() {
		for(Book b:ab) {
			b.displayBookDetails();
		}
	}
	
	public static void searchByTitle(String title) {
		boolean bool = false;
		for(Book b:ab) {
			if(b.title.toLowerCase().equals(title.toLowerCase())) {
				b.displayBookDetails();
				bool = true;
				break;
			}
		}
		if(bool==false) {
			System.out.println("Book is not available");
		}
		
	}
	
	public static void borrowBook(String title) {
		boolean bool = false;
		for(Book b:ab) {
			if(b.title.toLowerCase().equals(title.toLowerCase()) && b.isAvailable==true) {
				b.displayBookDetails();
				System.out.println("Book borrowed");
				b.isAvailable = false;
				bool = true;
				break;
			}
		}
		if(bool==false) {
			System.out.println("Book is not available");
		}
	}
	
	public static void returnBook(String title) {
		boolean bool = false;
		for(Book b:ab) {
			if(b.title.toLowerCase().equals(title.toLowerCase()) && b.isAvailable==false) {
				b.isAvailable = true;
				b.displayBookDetails();
				System.out.println("Book Returned");
				bool = true;
				break;
			}
		}
		if(bool==false) {
			System.out.println("Book is ALready Available in Library asset");
		}
	}
	
	public static void isBookAvailable(String title) {
		boolean bool = false;
		for(Book b:ab) {
			if(b.title.toLowerCase().equals(title.toLowerCase()) && b.isAvailable==true) {
				b.displayBookDetails();
				System.out.println("Book is Available");
				bool = true;
				break;
			}
		}
		if(bool==false) {
			System.out.println("Book is not Available");
		}
	}
}
