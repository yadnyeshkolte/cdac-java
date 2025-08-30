
import java.util.Scanner;

class InBook {
    static void main(){
        Book[] book = new Book[10];
        book[0] = new Book(1, "Hello", "Author A", false);
        book[1] = new Book(2, "Java Basics", "Author B", true);
        book[2] = new Book(3, "Data Structures", "Author C", false);
        book[3] = new Book(4, "Algorithms", "Author D", true);
        book[4] = new Book(5, "Operating Systems", "Author E", false);
        book[5] = new Book(6, "Computer Networks", "Author F", true);
        book[6] = new Book(7, "Database Systems", "Author G", false);
        book[7] = new Book(8, "Design Patterns", "Author H", true);
        book[8] = new Book(9, "Artificial Intelligence", "Author I", false);
        book[9] = new Book(10, "Machine Learning", "Author J", true);
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Library Management System");
        while(true){
            System.out.print("Want to try ot some Methods yes/no: ");
            String input = scan.nextLine();
            if(input.equals("yes")){
                System.out.print("'dab' - Display ALl Books 'i' - issue book 'r' - Return Book: ");
                switch(scan.nextLine()){
                    case "i": System.out.print("Enter Id of book to Issue: ");
                    int bookIdNumber = Integer.parseInt(scan.nextLine());
                    for(int a = 0; a < book.length; a++){
                        if(book[a].getBookId()==bookIdNumber && !book[a].isIssued()){
                            book[a].setIsIssued(true);
                            System.out.println("Book Issued Successfully: "+book[a].getTitle());
                        }
                        else if(book[a].getBookId()==bookIdNumber && book[a].isIssued()){
                            System.out.println("Book Not Available: "+book[a].getTitle());
                        }
                    }
                    break;
                    case "r": System.out.print("Enter Id of book to return: ");
                    int bookId = Integer.parseInt(scan.nextLine());
                    for(int a = 0; a < book.length; a++){
                        if(book[a].getBookId()==bookId && book[a].isIssued()){
                            book[a].setIsIssued(false);
                            System.out.println("Thanks for Return: "+book[a].getTitle());
                        }
                        else if(book[a].getBookId()==bookId && !book[a].isIssued()){
                            System.out.println("Currently Available: "+book[a].getTitle());
                        }
                    }
                    break;
                    case "dab": System.out.println("Here are the details");
                        for(int i=0;i<book.length;i++){
                            book[i].displayBookStatus();
                        }
                        break;
                    default: System.out.println("Invalid Input");
                }
            }
            else if(input.equals("no")){
                break;
            }
        }

    }
}
