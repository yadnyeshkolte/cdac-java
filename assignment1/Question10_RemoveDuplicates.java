package assignment1;

import java.util.Arrays;
import java.util.Scanner;

public class Question10_RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Remove Duplicate Elements ===");
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        
        int[] array = new int[size];
        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        
        System.out.print("Original array: ");
        System.out.println(Arrays.toString(array));
        
        int[] uniqueArray = removeDuplicates(array);
        System.out.print("Array after removing duplicates: ");
        System.out.println(Arrays.toString(uniqueArray));
        
        scanner.close();
    }
    
    public static int[] removeDuplicates(int[] array) {
        int count = 0;
        
        // Mark duplicates with Integer.MAX_VALUE
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == 2147483647) {
                    break;
                }
                if (array[i] == array[j]) {
                    array[j] = 2147483647;
                    count++;
                }
            }
        }
        
        // Create new array without duplicates
        int[] removedDuplicateArray = new int[array.length - count];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 2147483647) {
                removedDuplicateArray[index] = array[i];
                index++;
            }
        }
        
        return removedDuplicateArray;
    }
}