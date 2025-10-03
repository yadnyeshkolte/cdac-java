package assignment2;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        while(true){
            System.out.println("Want to know the Questions? and what's the related number, Enter 'Questions': ");
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the Q.no to continue 1 - 6 or 'exit': ");

            String inputString = input.next().toLowerCase();
            if(inputString.equals("exit")){
                System.out.println("Bye!");
                break;
            }
            switch(inputString){
                case "1": InEmployee.main();
                break;
                case "2": InBankAccount.main();
                break;
                case "3": InStudent.main();
                break;
                case "4": InProduct.main();
                break;
                case "5": InBook.main();
                break;
                case "6": InCartItem.main();
                break;
                case "questions": questionDetails();
                break;
                default: System.out.println("Invalid input");
            }
        }
    }
    static void questionDetails(){

        while(true){
            Scanner input = new Scanner(System.in);
            System.out.print("Enter 1 - 6 to check Q.no details or 'exit': ");

            String inputStringDetails = input.next().toLowerCase();
            if(inputStringDetails.equals("exit")){
                break;
            }
            switch(inputStringDetails){
                case "1": System.out.print("Employee Payroll System ");
                System.out.print("Want to try out this question : yes/no: ");
                String switchInput1 = input.next().toLowerCase();
                if(switchInput1.equals("yes")){
                    InEmployee.main();
                }
                break;
                case "2": System.out.print("Bank Account Management ");
                System.out.print("Want to try out this question : yes/no: ");
                String switchInput2 = input.next().toLowerCase();
                if(switchInput2.equals("yes")){
                    InBankAccount.main();
                }
                break;
                case "3": System.out.print("Student Result Calculator (Array of objects) ");
                System.out.print("Want to try out this question : yes/no: ");
                String switchInput3 = input.next().toLowerCase();
                if(switchInput3.equals("yes")){
                    InStudent.main();
                }
                break;
                case "4": System.out.print("Product Billing System (Array of objects) ");
                System.out.print("Want to try out this question : yes/no: ");
                String switchInput4 = input.next().toLowerCase();
                if(switchInput4.equals("yes")){
                    InProduct.main();
                }
                break;
                case "5": System.out.print("Library Book Management ");
                System.out.print("Want to try out this question : yes/no: ");
                String switchInput5 = input.next().toLowerCase();
                if(switchInput5.equals("yes")){
                    InBook.main();
                }
                break;
                case "6": System.out.print("Online Shopping Cart (Business Logic Example) ");
                System.out.print("Want to try out this question : yes/no: ");
                String switchInput6 = input.next().toLowerCase();
                if(switchInput6.equals("yes")){
                    InCartItem.main();
                }
                break;
                default: System.out.println("Invalid input");
            }
        }
    }

}