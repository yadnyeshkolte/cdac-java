package assignment1;

import java.util.Scanner;

public class Question4_GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Student Grade Calculator ===");
        int marks;
        
        while (true) {
            System.out.print("Enter marks (0-100): ");
            marks = scanner.nextInt();
            
            if (marks >= 0 && marks <= 100) {
                break;
            }
            System.out.println("Invalid marks! Please enter a value between 0 and 100.");
        }
        
        char grade = calculateGrade(marks);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
        
        scanner.close();
    }
    
    public static char calculateGrade(int marks) {
        if (marks >= 80) {
            return 'A';
        } else if (marks >= 60) {
            return 'B';
        } else if (marks >= 50) {
            return 'C';
        } else if (marks >= 40) {
            return 'D';
        } else {
            return 'F';
        }
    }
}