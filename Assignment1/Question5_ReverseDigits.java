package assignment1;

import java.util.Scanner;

public class Question5_ReverseDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Reverse Digits of a Number ===");
        System.out.print("Enter a number to reverse: ");
        int number = scanner.nextInt();
        
        int reversedNumber = reverseDigits(number);
        System.out.println("Original number: " + number);
        System.out.println("Reversed number: " + reversedNumber);
        
        scanner.close();
    }
    
    public static int reverseDigits(int number) {
        int outputNumber = 0;
        int originalNumber = number;
        
        // Handle negative numbers
        boolean isNegative = number < 0;
        if (isNegative) {
            number = Math.abs(number);
        }
        
        while (number != 0) {
            outputNumber = 10 * outputNumber + number % 10;
            number = number / 10;
        }
        
        return isNegative ? -outputNumber : outputNumber;
    }
}