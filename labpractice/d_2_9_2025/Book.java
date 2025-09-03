package labpractice.d_2_9_2025;

class Book {
	int bookId;
	String title;
	String author;
	float price;
	
	Book(){
		bookId = 0;
		title = "Empty";
		author = "None";
		price = 0.0f;
	}
	Book(int bookId, String title, String author, float price){
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	void displayBookDetails(){
		System.out.println("( "+bookId+" "+title+" "+author+" "+price+" )");
	}
}
