package assignment1;

import java.util.Scanner;

public class Question6_ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== String Reverser ===");
        System.out.print("Enter a string to reverse: ");
        String inputString = scanner.nextLine();
        
        String reversedString = reverseString(inputString);
        System.out.println("Original string: " + inputString);
        System.out.println("Reversed string: " + reversedString);
        
        scanner.close();
    }
    
    public static String reverseString(String str) {
        String returnString = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            returnString = returnString + str.charAt(i);
        }
        return returnString;
    }
}