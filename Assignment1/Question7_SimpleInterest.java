package assignment1;

import java.util.Scanner;

public class Question7_SimpleInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Simple Interest Calculator ===");
        System.out.print("Enter Principal amount: ");
        double principal = scanner.nextDouble();
        
        System.out.print("Enter Rate of interest (in %): ");
        double rate = scanner.nextDouble();
        
        System.out.print("Enter Time period (in years): ");
        double time = scanner.nextDouble();
        
        double simpleInterest = calculateSI(principal, rate, time);
        System.out.println("Principal: $" + principal);
        System.out.println("Rate: " + rate + "%");
        System.out.println("Time: " + time + " years");
        System.out.println("Simple Interest: $" + simpleInterest);
        
        scanner.close();
    }
    
    public static double calculateSI(double p, double r, double t) {
        return (p * r * t) / 100;
    }
}