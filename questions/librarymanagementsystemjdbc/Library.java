package questions.librarymanagementsystemjdbc;

public class Library {
		int bookId; 
		String title;
		String author; 
		boolean isAvailable;
		
		public Library() {
			this.bookId = 0;
			this.title = "Empty";
			this.author = "Empty";
			this.isAvailable = true;
		}
		public Library(int bookId, String title, String author, boolean isAvailable) {
			this.bookId = bookId;
			this.title = title;
			this.author = author;
			this.isAvailable = isAvailable;
		}
		
		public void displayBook() {
			System.out.println("Book Id: "+bookId+" Title: "+title+" Author: "+author+" Is it available: "+isAvailable);
		}
		public int getBookId() {
			return bookId;
		}
		public void setBookId(int bookId) {
			this.bookId = bookId;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getAuthor() {
			return author;
		}
		public void setAuthor(String author) {
			this.author = author;
		}
		public boolean isAvailable() {
			return isAvailable;
		}
		public void setAvailable(boolean isAvailable) {
			this.isAvailable = isAvailable;
		}
		
		
}
