package assignment3;

import java.util.Scanner;


public class Main {
	public static void main(String[] args) {

        while(true){
            System.out.println("Want to know the Questions? and what's the related number, Enter 'Questions': ");
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the Q.no to continue 1 - 5 or 'exit': ");

            String inputString = input.next().toLowerCase();
            if(inputString.equals("exit")){
                System.out.println("Bye!");
                break;
            }
            switch(inputString){
                case "1": BankAccountSystem.main();
                break;
                case "2": VehicleSystem.main();
                break;
                case "3": EmployeeManagementSystem.main();
                break;
                case "4": StudentGradingSystem.main();
                break;
                case "5": ProductBillingSystem.main();
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
            System.out.print("Enter 1 - 5 to check Q.no details or 'exit': ");

            String inputStringDetails = input.next().toLowerCase();
            if(inputStringDetails.equals("exit")){
                break;
            }
            switch(inputStringDetails){
                case "1": System.out.print("Bank Account System ");
                System.out.print("Want to try out this question : yes/no: ");
                String switchInput1 = input.next().toLowerCase();
                if(switchInput1.equals("yes")){
                	BankAccountSystem.main();
                }
                break;
                case "2": System.out.print("Vehicle System ");
                System.out.print("Want to try out this question : yes/no: ");
                String switchInput2 = input.next().toLowerCase();
                if(switchInput2.equals("yes")){
                	VehicleSystem.main();
                }
                break;
                case "3": System.out.print("Employee Management ");
                System.out.print("Want to try out this question : yes/no: ");
                String switchInput3 = input.next().toLowerCase();
                if(switchInput3.equals("yes")){
                	EmployeeManagementSystem.main();
                }
                break;
                case "4": System.out.print("Student Grading System ");
                System.out.print("Want to try out this question : yes/no: ");
                String switchInput4 = input.next().toLowerCase();
                if(switchInput4.equals("yes")){
                	StudentGradingSystem.main();
                }
                break;
                case "5": System.out.print("Product Billing System ");
                System.out.print("Want to try out this question : yes/no: ");
                String switchInput5 = input.next().toLowerCase();
                if(switchInput5.equals("yes")){
                	ProductBillingSystem.main();
                }
                break;
                default: System.out.println("Invalid input");
            }
        }
	}
}
