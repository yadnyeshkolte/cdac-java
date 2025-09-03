package labpractice.d_2_9_2025;

public class Books {
	Book[] getBooks() {
		Book[] b = new Book[5];
		
		b[0] = new Book(1,"C Programming","Armour",900);
		b[1] = new Book(2,"Java Programming","Gosling",1900);
		b[2] = new Book(3,"SQL Database","Bill",700);
		b[3] = new Book(4,"Oracel WorkSpace","Linus",880);
		b[4] = new Book(5,"Eclipse Analysis","Kunal",1000);
		
		return b;
	}
}
