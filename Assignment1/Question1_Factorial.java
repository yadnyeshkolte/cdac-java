
package assignment1;

import java.util.Scanner;

public class Question1_Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Factorial Calculator ===");
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        
        int result = findFactorial(n);
        System.out.println("Factorial of " + n + " is: " + result);
        
        scanner.close();
    }
    
    public static int findFactorial(int n) {
        if (n == 0 || n == 1) return 1;
        return n * findFactorial(n - 1);
    }
}