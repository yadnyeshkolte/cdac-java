package questions.librarymanagementsystemarraylist;

public class Book {
	String title;
	String author;
	String ISBN;
	int numberOfPages;
	boolean isAvailable;
	public Book() {
		super();
		title = "Empty";
		author = "Empty";
		ISBN = "Empty";
		numberOfPages = 0;
		isAvailable = false;
	}
	
	public Book(String title, String author, String iSBN, int numberOfPages, boolean isAvailable) {
		this.title = title;
		this.author = author;
		this.ISBN = iSBN;
		this.numberOfPages = numberOfPages;
		this.isAvailable = isAvailable;
	}
	
	public void displayBookDetails(){
		System.out.println("Book Title: "+title+" Author: "+author+" ISBN: "+ISBN+" No of pages: "+numberOfPages+" Available: "+isAvailable);
	}
	
	
}
