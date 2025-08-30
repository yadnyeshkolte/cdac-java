

public class Book {
    int bookId;
    String title;
    String author;
    boolean isIssued;

    Book(int bookId, String title, String author, boolean isIssued){
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.isIssued = isIssued;
    }
    void displayBookStatus(){
        System.out.println("Book ID: " + this.bookId+" Isssued: " + this.isIssued+" Title: " + this.title+" Author: " + this.author);
    }
    boolean isIssued(){
        return this.isIssued;
    }
    int getBookId(){
        return this.bookId;
    }
    void setIsIssued(boolean issued){
        this.isIssued = issued;
    }
    String getTitle(){
        return this.title;
    }
}
