package assignment2;

import java.util.Scanner;

class InEmployee {

    static void main(){
        Scanner scanEmployee = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        int employeeID = Integer.parseInt(scanEmployee.nextLine());
        System.out.print("Enter Employee Name: ");
        String employeeName = scanEmployee.nextLine();
        System.out.print("Enter Employee Salary: ");
        int employeeSalary = Integer.parseInt(scanEmployee.nextLine());
        Employee e = new Employee(employeeID, employeeName, employeeSalary);
        System.out.print("Want to know Gross Salary? yes/no: ");
        String input = scanEmployee.nextLine();
        if(input.equals("yes")){
            System.out.println(e.grossSalary());
        }
    }
}
