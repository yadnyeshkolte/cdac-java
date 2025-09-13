package questions.librarymanagementsystem;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class LibraryMethods {
	public static void addBook(Book book) throws IOException, ClassNotFoundException {
		FileInputStream fs = new FileInputStream("bookdata.txt");
		ObjectInputStream oi = new ObjectInputStream(fs);
		ArrayList<Book> ab = new ArrayList<>();
		Book bk;
		try {
			while((bk = (Book) oi.readObject())!=null) {
				ab.add(bk);
			}
		}
		catch(EOFException e) {
			
		}
		//remember to put it outside
		ab.add(book);
		FileOutputStream fso = new FileOutputStream("bookdata.txt");
		ObjectOutputStream oio = new ObjectOutputStream(fso);
		
		for(int i=0;i<ab.size();i++) {
			oio.writeObject(ab.get(i));
		}
		

	}
	
	public static void viewAllBooks() throws ClassNotFoundException, IOException {
		FileInputStream fs = new FileInputStream("bookdata.txt");
		ObjectInputStream oi = new ObjectInputStream(fs);
		ArrayList<Book> ab = new ArrayList<>();
		Book bk;

		
		try {
			while((bk = (Book) oi.readObject())!=null) {
				bk.displayBookDetails();
			}
		}
		catch(EOFException e) {
			
		}
	}
	
	public static void searchByTitle(String title) throws IOException, ClassNotFoundException {
		FileInputStream fs = new FileInputStream("bookdata.txt");
		ObjectInputStream oi = new ObjectInputStream(fs);
		Book bk;

		try {
			while((bk = (Book) oi.readObject())!=null) {
				if(bk.title.toLowerCase().equals(title.toLowerCase())){
					System.out.println("=================");
					bk.displayBookDetails();
					System.out.println("=================");
					break;
				}
				//System.out.println("Not available");
			}
		}
		catch(EOFException e) {
			
		}
		
	}
	
	public static void isBookAvailable(String title) throws IOException, ClassNotFoundException {
		FileInputStream fs = new FileInputStream("bookdata.txt");
		ObjectInputStream oi = new ObjectInputStream(fs);
		Book bk;

		try {
			while((bk = (Book) oi.readObject())!=null) {
				if(bk.title.toLowerCase().equals(title) && bk.isAvailable==true){
					System.out.println("=================");
					System.out.println("Book is available");
					System.out.println("=================");
					break;
				}
				else if(bk.title.toLowerCase().equals(title) && bk.isAvailable==false) {
					System.out.println("=================");
					System.out.println("Book is not available");
					System.out.println("=================");
					break;
				}
				System.out.println("Not available");
			}
		}
		catch(EOFException e) {
			
		}
	}
	
}
