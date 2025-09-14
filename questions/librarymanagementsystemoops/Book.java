package questions.librarymanagementsystemoops;

public class Book {
	int bookId;
	String title;
	String author;
	boolean isAvailable;
	public Book() {
		bookId = 0;
		title = "Empty";
		author = "Empty";
		isAvailable = false;
	}
	public Book(int bookId, String title, String author, boolean isAvailable) {
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.isAvailable = isAvailable;
	}
	void displayBookDetails() {
		System.out.println("Boook Id: "+bookId+" Book Title: "+title+" Author: "+author+" Availability: "+isAvailable);
	}
}

class AcademicBook extends Book implements FineCalculable{
	String subject;
	public AcademicBook() {
		subject = "Empty";
	}
	public AcademicBook(int bookId, String title, String author, boolean isAvailable, String subject) {
		super(bookId, title, author, isAvailable);
		this.subject = subject;
	}
	@Override
	void displayBookDetails(){
		System.out.println("Boook Id: "+bookId+" Book Title: "+title+" Author: "+author+" Availability: "+isAvailable+" SUbject "+subject);
	}
	@Override
	public
	double calculateFine(int daysLate){
		return daysLate*5;
	}
	@Override
	public String toString() {
		return "bookId: "+bookId+" Title: "+title+" Author: "+author+" Is Avaiable: "+isAvailable+" Subject: "+subject;
	}
} 
class FictionBook extends Book implements FineCalculable{
	String genre;
	
	public FictionBook() {
		genre = "null";
	}

	public FictionBook(int bookId, String title, String author, boolean isAvailable, String genre) {
		super(bookId, title, author, isAvailable);
		this.genre = genre;
	}
	@Override
	void displayBookDetails(){
		System.out.println("Boook Id: "+bookId+" Book Title: "+title+" Author: "+author+" Availability: "+isAvailable+" Genre "+genre);
	}
	@Override
	public double calculateFine(int daysLate){
		return daysLate*3;
	}
	@Override
	public String toString() {
		return "bookId: "+bookId+" Title: "+title+" Author: "+author+" Is Avaiable: "+isAvailable+" Genre: "+genre;
	}
} 
class NonFictionBook extends Book implements FineCalculable{
	String topic;
	public NonFictionBook() {
		topic = "null";
	}
	public NonFictionBook(int bookId, String title, String author, boolean isAvailable, String topic) {
		super(bookId, title, author, isAvailable);
		this.topic = topic;
	}
	@Override
	void displayBookDetails(){
		System.out.println("Boook Id: "+bookId+" Book Title: "+title+" Author: "+author+" Availability: "+isAvailable+" Topic "+topic);
	}
	@Override
	public double calculateFine(int daysLate){
		return daysLate*4;
	}
	@Override
	public String toString() {
		return "bookId: "+bookId+" Title: "+title+" Author: "+author+" Is Avaiable: "+isAvailable+" Topic: "+topic;
	}
} 