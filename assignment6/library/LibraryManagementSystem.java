package assignment6.library;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class LibraryManagementSystem {

	public static void main(String[] args) {
		HashMap<Integer, Book> hash = LibraryBooks.getBooks();
		Scanner scan = new Scanner(System.in);
		String input = "";
		int inputInt = 0;
		//This imported hash map was in order but it will be changed cause of some hashmap storing system.
		while(true) {
			//'c' one checkout it once
			System.out.println("call-'Clear all Books' e-'It's cleard or not' c-'Check if a particular Book object exists'");
			System.out.println("a-'Add Books' g-'get Details' ci-Check if ID exist");
			System.out.println("dt-'Display no of books' up-'Update Price' r-'Remove Book'");
			System.out.print("Enter the method to try out or 'exit': ");
			input = scan.next();
			if(input.equals("exit")) {
				System.out.print("Bye!");
				break;
			}
			switch(input) {
			case "a": System.out.print("How many books you want to add ");
			inputInt = scan.nextInt();
			addBooks(hash, inputInt);
			//printHashMap(hash);
			break;
			case "g": getBookDetails(hash);
			break;
			case "ci": while(true) {
				System.out.print("Enter ID to check or 'exit': ");
				input = scan.next();
				if(input.equals("exit")) {
					break;
				}
				if(hash.containsKey(Integer.parseInt(input))) {
					System.out.println("It Does Exit");
					System.out.print("Want to checkout Details yes/no: ");
					String checkInput = scan.next().toLowerCase();
					if(checkInput.equals("yes")) {
						printBookDetails(Integer.parseInt(input),hash);
					}
					else {
						System.out.println("Ok let's continue");
					}
				}
				else {
					System.out.println("It Doesn't Exit");
				}
			}
			break;
			case "dt": System.out.println("==============");
			System.out.println(hash.size()+" No of Books");
			System.out.println("==============");
			break;
			case "up": updatePrice(hash);
			break;
			case "r": removeBook(hash);
			break;
			case "c": System.out.println("==============");
			break;
			case "call": System.out.print("You Sure want to clear all Books ? yes/no: ");
			input = scan.next();
			if(input.equals("yes")) {
				System.out.print("We're deleting whole data 'ok' to continue ");
				input = scan.next();
				if(input.equals("ok")) {
					hash.clear();
				}
			}
			else {
				System.out.println("That's a Relief");
			}
			break;
			case "e": boolean bool = hash.isEmpty();
			if(bool) {
				System.out.println("==============");
				System.out.println("It's Empty :( ");
				System.out.println("==============");
				System.out.print("Want to refill? yes/no ");
				input = scan.next();
				if(input.equals("yes")) {
					hash = LibraryBooks.getBooks();
				}
				else {
					System.out.println("Ok! Bye");
				}
			}
			else {
				System.out.println("==============");
				System.out.println("It's Live :) ");
				System.out.println("==============");
			}
			break;
			case "4": System.out.println("add");
			break;
			default: System.out.println("Invalid Output");
			}
		}
	}
	static void checkBookObject() {
		
	}
	static void removeBook(HashMap<Integer, Book> hash) {
		Scanner scan = new Scanner(System.in);
		int inputInt;
		while(true) {
			System.out.print("Enter the Book ID to remove ");
			inputInt = scan.nextInt();
			if(hash.containsKey(inputInt)) {
				hash.remove(inputInt);
				printBookDetails(inputInt, hash);
				break;
			}
			else {
				System.out.println("ID not present");
			}
		}
	}
	static void updatePrice(HashMap<Integer, Book> hash) {
		Scanner scan = new Scanner(System.in);
		int inputInt;
		float inputPrice;

		while(true) {
			System.out.print("Enter the Book ID to update ");
			inputInt = scan.nextInt();
			if(hash.containsKey(inputInt)) {
				System.out.print("Enter the price to update: Current is "+hash.get(inputInt).price+": ");
				inputPrice = scan.nextFloat();
				Book b = new Book(inputInt,hash.get(inputInt).title,hash.get(inputInt).author,inputPrice);
				hash.replace(inputInt, hash.get(inputInt), b);
				//hash.get(inputInt).price = inputPrice;
				printBookDetails(inputInt, hash);
				break;
			}
			else {
				System.out.println("ID not present");
			}
		}
	}
	static void printBookDetails(int id,HashMap<Integer, Book> hash) {
		if(hash.containsKey(id)) {
			System.out.println("==============");
			System.out.println("BookId: "+hash.get(id).bookId+"\nBook's title: "+hash.get(id).title+"\nAuthor: "+hash.get(id).author+"\nPrice: "+hash.get(id).price);
			System.out.println("==============");
		}
		else {
			System.out.println("Book is removed or Please Enter the correct ID");
		}
	}
	static void getBookDetails(HashMap<Integer, Book> hash) {
		Scanner scan = new Scanner(System.in);
		int inputInt;
		while(true) {
			System.out.print("Enter the id to get the book Details ");
			inputInt = scan.nextInt();
			if(hash.containsKey(inputInt)) {
				System.out.println("==============");
				System.out.println("BookId: "+hash.get(inputInt).bookId+"\nBook's title: "+hash.get(inputInt).title+"\nAuthor: "+hash.get(inputInt).author+"\nPrice: "+hash.get(inputInt).price);
				System.out.println("==============");
				break;
			}
			else {
				System.out.println("Please Enter the correct ID");
			}
		}
		
	}
	static void addBooks(HashMap<Integer, Book> hash, int countInt) {
		Scanner scan = new Scanner(System.in);
		int inputInt;
		String inputName;
		String inputAuthor;
		float inputPrice;
		int count = countInt;
		while(count>0) {
			while(true) {
				System.out.print("Enter the new ID ");
				inputInt = scan.nextInt();
				if(hash.containsKey(inputInt)) {
					System.out.println("ID already present");
					continue;
				}
				else {
					System.out.print("Enter Book name ");
					inputName = scan.next();
					System.out.print("Enter Book's Author name ");
					inputAuthor = scan.next();
					System.out.print("Enter Book's Price ");
					inputPrice = scan.nextFloat();
					hash.put(inputInt, new Book(inputInt,inputName,inputAuthor,inputPrice));
					System.out.println("==============");
					break;
				}
				
			}

			count--;
		}
	}
	static void printHashMap(HashMap<Integer, Book> hash) {
		for(Entry<Integer, Book> m:hash.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue().bookId+" "+m.getValue().title+" "+m.getValue().author+" "+m.getValue().price);
		}
	}
}
