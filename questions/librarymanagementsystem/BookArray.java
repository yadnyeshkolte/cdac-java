package questions.librarymanagementsystem;

import java.util.ArrayList;

public class BookArray {
	static ArrayList<Book> getBooks(){
		
		ArrayList<Book> ab = new ArrayList<>();
		ab.add(new Book("Void","Husky","1",89,true));
		ab.add(new Book("Null","Striveing","2",890,false));
		ab.add(new Book("How","Player","3",19,true));
		ab.add(new Book("Void","John","4",49,true));
		ab.add(new Book("Void","Nivru","5",89,true));
		
		
		return ab;
	}
}
