package labpractice.d_2_9_2025;

class Library {
	String libraryName;
	String address;
	Book[] books;
	
	Library(){
		libraryName = "Empty";
		address = "None";
		Books newb = new Books();
		books = newb.getBooks();
	}
	Library(String libraryName, String address, Book[] books){
		this.libraryName = libraryName;
		this.address = address;
		this.books = books;
	}
	void addBook(Book b){
		if(books.length==books) {
			
		}
	}
	
	void removeBook(int bookId){
		
	}
	void showAllBooks(){
		for(int i=0;i<books.length;i++) {
			System.out.println("( "+books[i].bookId+" "+books[i].title+" "+books[i].author+" "+books[i].price+" )");
		}
	}
	
}
