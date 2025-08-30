
public class Employee {
    int empId;
    String name;
    int basicSalary;

    Employee(int empId, String name, int basicSalary){
        this.empId = empId;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    float grossSalary(){
        return (float)(this.basicSalary+0.5* this.basicSalary+0.1* this.basicSalary);
    }
}
