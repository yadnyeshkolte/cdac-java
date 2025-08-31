package assignment1;

import java.util.Scanner;

public class Question8_ArrayMaximum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Array Maximum Finder ===");
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        
        int[] array = new int[size];
        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        
        int maximum = findMax(array);
        System.out.print("Array elements: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("Maximum element: " + maximum);
        
        scanner.close();
    }
    
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int number : arr) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }
}