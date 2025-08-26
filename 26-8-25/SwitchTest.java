import java.util.Scanner;
public class SwitchTest {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Add or Sub: ");
        System.out.print("Enter number: ");
        int number1 =  scan.nextInt();
        int number2 = scan.nextInt();
        System.out.print("Please enter a for add and s for subtract: ");
        String input = scan.next().toLowerCase();
        switch(input){
            case "a": System.out.println(number1 + number2);
            break;
            case "s": System.out.println(number1 - number2);
            break;
            default: System.out.println("Invalid input");
        }
    }
}
