package assignment1;

//consider changing the package if its not working

import java.util.Arrays;
import java.util.Scanner;

public class Assignment1Solution {
    public static void main(String[] args){
        long number = 18027753;
        long number2 = 56859888;
        long number3 = 34590325;
            
        System.out.println("Welcome: Want to try out solution ?");
        System.out.println("Want to know what is inside each 1 to 10 case");
        switchEntry();

        switchQuestionSelection();
    }
    public static void switchQuestionSelection(){

        System.out.println("You can comeback to choises type 'Choises' to get there: ");
        Scanner scanInput = new Scanner(System.in);
        while(true){
            System.out.print("Please enter a choice 1 - 10 or exit: ");
            String choiceQuestion = scanInput.next().toLowerCase();
            if (choiceQuestion.equals("exit")){
                System.out.println("Bye");
                break;
            }
            switch(choiceQuestion){
                case "1": System.out.print("Enter the number: ");
                int n = scanInput.nextInt();
                System.out.println("Factorial is: " + findFactorial(n));
                break;
                case "2": System.out.print("Enter the number: ");
                int m = scanInput.nextInt();
                System.out.println("Given Number is: " + classifyNumber(m));
                break;
                case "3": System.out.print("Enter '0' for f-c and '1' for c-f: ");
                byte fc = scanInput.nextByte();
                if(fc==0){
                    System.out.print("Enter Fahrenheit value: ");
                    double f = scanInput.nextDouble();
                    System.out.println(fahrenheitToCelsius(f));
                }
                else{
                    System.out.print("Enter Celsius value: ");
                    double c = scanInput.nextDouble();
                    System.out.println(celsiusToFahrenheit(c));
                }
                break;
                case "4": int marks;
                while(true){
                    System.out.print("Enter the Marks: ");
                    marks = scanInput.nextInt();
                    if(marks<=100){
                        break;
                    }
                    System.out.println("Marks is not valid");
                }
                System.out.println("Student grade is: "+ calculateGrade(marks));
                break;
                case "5": System.out.print("Enter the number to reverse: ");
                int reverse = scanInput.nextInt();
                System.out.println("Reverse number is: "+ reverseDigits(reverse));
                break;
                case "6": System.out.print("Enter the number to reverse: ");
                String reverseString = scanInput.next();
                System.out.println("Reverse String is: "+ reverseString(reverseString));
                break;
                case "7": System.out.print("Enter the P R N by giving space: ");
                double P = scanInput.nextDouble();
                double R = scanInput.nextDouble();
                double T = scanInput.nextDouble();
                System.out.println(calculateSI(P, R, T));
                break;
                case "8": int[] maxArray = createArray();
                System.out.println(findMax(maxArray));
                break;
                case "9": int[] sortArray = createArray();
                sortTheArray(sortArray);
                for(int number: sortArray){
                    System.out.print(number+" ");
                }
                System.out.println();
                break;
                case "10": int[] removeDuplicatesArray = createArray();
                System.out.print("Enter '0' for withsorting '1' for withoutsorting: ");
                byte sorting = scanInput.nextByte();
                if(sorting==0){
                    System.out.println(Arrays.toString(removeDuplicatesWithSorting(removeDuplicatesArray)));
                }
                else{
                    System.out.println(Arrays.toString(removeDuplicatesWithoutSorting(removeDuplicatesArray)));
                }

                break;
                case "choises": switchEntry();
                break;
                default: System.out.println("Invalid choice");
                break;
            }
        }
        //scanInput.close();
    }
    public static int[] removeDuplicatesWithoutSorting(int[] array){
        int count = 0;
        for(int i=0;i<array.length-1;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i]==2147483647){
                    break;
                }
                if(array[i]==array[j]){
                    array[j] = 2147483647;
                    count++;
                }
            }
        }
        int[] removedDuplicateArray = new int[array.length-count];
        int index = 0;
        for(int i=0;i<array.length;i++){
            if(array[i]!=2147483647){
                removedDuplicateArray[index]=array[i];
                index++;
            }
        }

        return removedDuplicateArray;
    }
    public static int[] removeDuplicatesWithSorting(int[] arr){
        sortTheArray(arr);
        int addZero = 0;
        int count = 0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                arr[i] = addZero;
                count++;
            }
        }
        int arrayLength = arr.length-count;
        int[] constructedArray = new int[arrayLength];
        sortTheArray(arr);
        for(int i=count;i<arr.length;i++){
            constructedArray[i-count] = arr[i];
        }
        return constructedArray;
    }
    public static void sortTheArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static int findMax(int[] arr){
        int max = arr[0];
        for(int number: arr){
            if(number>max){
                max = number;
            }
        }
        return max;
    }
    public static int[] createArray(){
        System.out.print("Enter Array length you choosing : ");
        Scanner scanInput = new Scanner(System.in);
        int length = scanInput.nextInt();
        int[] array = new int[length];
        System.out.print("Enter " + length +" Integers by giving space: ");
        for(int i = 0; i < length; i++){
            array[i] = scanInput.nextInt();
        }
        return array;
    }
    public static Double calculateSI(double p, double r, double t){
        return p*r*t;
    }
    public static String reverseString(String str){
        String returnString = "";
        for(int i=str.length()-1;i>=0;i--){
            returnString = returnString+""+str.charAt(i);
        }
        return returnString;
    }
    public static int reverseDigits(int number){
        int outputNumber = 0;
        while(number!=0){
            outputNumber = 10*outputNumber + number % 10;
            number = number / 10;
        }
        return outputNumber;
    }
    public static char calculateGrade(int marks){
        char grade;
        if(marks>=80){
            grade = 'A';
        }
        else if(marks>=60){
            grade = 'B';
        }
        else if(marks>=50){
            grade = 'C';
        }
        else if(marks>=40){
            grade = 'D';
        }
        else{
            grade = 'F';
        }
        return grade;
    }
    public static double celsiusToFahrenheit(double c){
        return (c*9/5) + 32;
    }
    public static double fahrenheitToCelsius(double f){
        return (f-32)*5/9;
    }
    public static int findFactorial(int n){
        if(n == 1) return 1;
        return n*findFactorial(n-1);
    }
    public static String classifyNumber(int n){
        String stringOutput;
        if(n>0){
            stringOutput = "Positive";
        }
        else if(n==0){
            stringOutput = "Zero";
        }
        else{
            stringOutput = "Negative";
        }
        return stringOutput;
    }
    public static void switchEntry(){
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.print("Enter 1 to 10 or Continue: ");
            String choice = scan.next().toLowerCase();
            if(choice.equals("continue")){
                System.out.println("Lets continue with selection of Question");
                break;
            }
            switch(choice){
                case "1": System.out.println("Question 1: Factorial of a Number");
                break;
                case "2": System.out.println("Question 2: Number Classification (Positive, Negative, Zero)");
                break;
                case "3": System.out.println("Question 3: Temperature Converter");
                break;
                case "4": System.out.println("Question 4: Student Grade Calculator");
                break;
                case "5": System.out.println("Question 5: Reverse the Digits of a Number");
                break;
                case "6": System.out.println("Question 6: Reverse a String");
                break;
                case "7": System.out.println("Question 7: Simple Interest Calculator");
                break;
                case "8": System.out.println("Question 8: Array Maximum Finder");
                break;
                case "9": System.out.println("Question 9: Array Sorting");
                break;
                case "10": System.out.println("Question 10: Remove Duplicate Elements from Array");
                break;
                default: System.out.println("Invalid choice");
            }
        }
        //scan.close();
    }
}
