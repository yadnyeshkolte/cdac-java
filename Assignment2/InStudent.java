package assignment2;
import java.util.Scanner;

class InStudent {
    static void main(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of students class have: ");
        int classStrength =  Integer.parseInt(scan.nextLine());
        Student[] student = new Student[classStrength];
        System.out.println("Please Enter the details");
        for(int i = 0; i < student.length; i++){
            System.out.println("Student " + (i+1) + ": ");
            System.out.print("Roll No: ");
            int rollNo = Integer.parseInt(scan.nextLine());
            System.out.print("Name: ");
            String name = scan.nextLine();
            System.out.print("Marks English: ");
            byte marksEnglish = Byte.parseByte(scan.nextLine());
            System.out.print("Marks Maths: ");
            byte marksMaths = Byte.parseByte(scan.nextLine());
            System.out.print("Marks Computer: ");
            byte marksComputer = Byte.parseByte(scan.nextLine());
            student[i] = new Student(rollNo,name,marksEnglish,marksMaths,marksComputer);
        }
        while(true){
            System.out.print("Want to try ot some Methods yes/no: ");
            String input = scan.nextLine();
            if(input.equals("yes")){
                System.out.print("'a' - Average marks 'g' - Grade 'asd' - All Student Details: ");
                switch(scan.nextLine()){
                    case "a": System.out.print("Enter Roll no of Std: ");
                    int rollNumber = Integer.parseInt(scan.nextLine());
                    for(int a = 0; a < student.length; a++){
                        if(student[a].getRollNo()==rollNumber){
                            System.out.println("Average is: "+student[a].averageMarks());
                        }
                    }
                    break;
                    case "g": System.out.print("Enter Roll no to get grade: ");
                    int rollNumber1 = Integer.parseInt(scan.nextLine());
                    for(int a = 0; a < student.length; a++){
                        if(student[a].getRollNo()==rollNumber1){
                            System.out.println("Grade is: "+student[a].reciveGrade(student[a].averageMarks()));
                        }
                    }
                    break;
                    case "asd": System.out.println("Here are the details");
                    for(int a = 0; a < student.length; a++){
                        System.out.println(student[a].getDetails());
                    }
                    break;
                    default: System.out.println("Invalid Input");
                }
            }
            else if(input.equals("no")){
                break;
            }
        }
    }
}
