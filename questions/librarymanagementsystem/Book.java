package questions.librarymanagementsystem;

import java.io.Serializable;

public class Book implements Serializable{
	String title;
	String author; 
	String ISBN;
	int numberOfPages;
	boolean isAvailable;
	
	
	public Book() {
		title = "Empty";
		author = "Empty";
		ISBN = "0";
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
	
	void displayBookDetails() {
		System.out.println("Product Title: "+title+" Author: "+author+" ISBN: "+ISBN+" NO of pages: "+numberOfPages+" Is it available: "+isAvailable);
	}

	
	
	
	
}
