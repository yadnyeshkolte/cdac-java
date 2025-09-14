package questions.librarymanagementsystemarraylist;

import java.util.Scanner;

public class LMSMain {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Library.getBooks();
		String input = "";
		String input1 = "";
		String input2 = "";
		int inputInt = 0;
		boolean inputBool = false;
		while(true) {
			System.out.println("a-add, v-view, s-search, b-borrow");
			System.out.println("r-return, is-isavailable");
			System.out.print("Enter the case to continue: ");
			input = scan.next();
			if(input.equals("exit")) {
				System.out.print("Bye!");
				break;
			}
			switch(input) {
			case "a": System.out.print("");
			boolean bool = false;
			///remember to check this is the primery key
			while(true) {
				System.out.print("Enter the book title: ");
				input = scan.next();
				for(Book b: Library.ab) {
					if(b.title.toLowerCase().equals(input.toLowerCase())) {
						bool = true;
						break;
					}
				}
				if(bool==false) {
					break;
				}
				System.out.println("Book already exist");
			}
			
			System.out.print("Enter the author: ");
			input1 = scan.next();
			System.out.print("Enter the Isbn: ");
			input2 = scan.next();
			System.out.print("Enter the no of pages: ");
			inputInt = scan.nextInt();
			
			Library.addBook(new Book(input,input1,input2,inputInt,true));
			
			break;
			case "v": System.out.print("");
			Library.viewAllBooks();
			break;
			case "s": System.out.print("");
			System.out.print("Enter the book title: ");
			input = scan.next();
			Library.searchByTitle(input);
			break;
			case "b": System.out.print("");
			System.out.print("Enter the book title: ");
			input = scan.next();
			Library.borrowBook(input);
			break;
			case "r": System.out.print("");
			System.out.print("Enter the book title: ");
			input = scan.next();
			Library.returnBook(input);
			break;
			case "is": System.out.print("");
			System.out.print("Enter the book title: ");
			input = scan.next();
			Library.isBookAvailable(input);
			break;
			default: System.out.print("Invalid Input");
			}
		}
	}
}
