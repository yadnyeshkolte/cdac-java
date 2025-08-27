package Hello.problemstatement1;
import java.util.Scanner;

public class Student {
    int rollNo;
    String name;
    String cname;
    String subject;
    int marks;


    public static void main(String[] args){
        Student yadnyesh = new Student();
        Student rushikesh = new Student();
        Student deepak = new Student();
        Student aman = new Student();
        Student satyam = new Student();

        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome Students: ");

        while(true){
            System.out.print("Enter S1,S2,S3,S4 or S5 to start 'exit' to exit: ");
            switch(scan.next().toLowerCase()){
                case "s1": yadnyesh.methodSelection();
                break;
                case "s2": rushikesh.methodSelection();
                break;
                case "s3": deepak.methodSelection();
                break;
                case "s4": aman.methodSelection();
                break;
                case "s5": satyam.methodSelection();
                break;
                default: System.out.println("Invalid Input");
            }
            String input = scan.next().toLowerCase();
            if(input.equals("exit")){
                break;
            }
        }
    }
    public void methodSelection(){
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.println("'a' for acceptDetails()");
            System.out.println("'d' for displayStudentInfo");
            System.out.println("'f' for findResult");
            System.out.print("Enter method to select: ");

            switch(scan.next().toLowerCase()){
                case "a": acceptDetails();
                break;
                case "d": displayStudentInfo();
                break;
                case "f": findResult();
                break;
                default: System.out.println("Invalid Input");
            }
            System.out.print("Want to exit ? type exit or else type anything: ");
            String input = scan.next().toLowerCase();
            if(input.equals("exit")){
                break;
            }
        }
    }
    public void acceptDetails(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Roll No: ");
        rollNo = scan.nextInt();
        System.out.println("Enter Name: ");
        name = scan.next();
        System.out.println("Enter College name: ");
        cname = scan.next();
        System.out.println("Enter Subject: ");
        subject = scan.next();
        System.out.println("Enter marks: ");
        marks = scan.nextInt();

    }
    public void displayStudentInfo(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Want to see student information: ");
        System.out.print("Enter Roll No: ");
        int inputRollNo = scan.nextInt();
        if(inputRollNo==rollNo){}
    }
    public void findResult(){

    }
}
