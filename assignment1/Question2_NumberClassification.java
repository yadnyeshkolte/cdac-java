package assignment1;

import java.util.Scanner;

public class Question2_NumberClassification {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Number Classification ===");
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        String classification = classifyNumber(number);
        System.out.println("The number " + number + " is: " + classification);
        
        scanner.close();
    }
    
    public static String classifyNumber(int number) {
        if (number > 0) {
            return "Positive";
        } else if (number == 0) {
            return "Zero";
        } else {
            return "Negative";
        }
    }
}