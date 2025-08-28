package Hello.Assingment2.src;

public class Student {
    int rollNo;
    String name;
    byte marksEnglish;
    byte marksMaths;
    byte marksComputer;

    Student(int rollNo, String name, byte marksEnglish,  byte marksMaths, byte marksComputer) {
        this.rollNo = rollNo;
        this.name = name;
        this.marksEnglish = marksEnglish;
        this.marksMaths = marksMaths;
        this.marksComputer = marksComputer;
    }
    int getRollNo() {
        return rollNo;
    }
    float averageMarks(){
        return (float)((this.marksEnglish + this.marksMaths + this.marksComputer)/3);
    }
    String getDetails(){
        return "Roll no:- "+ this.rollNo+" Name:- "+ this.name+" English Marks:- "+ this.marksEnglish+" Maths Marks:- "+ this.marksMaths+" Computer Marks:- "+ this.marksComputer;
    }
    char reciveGrade(float marks){
        if(marks>80){
            return 'A';
        }
        else if(marks>60){
            return 'B';
        }
        else if(marks>50){
            return 'C';
        }
        else if(marks>40){
            return 'D';
        }
        else{
            return 'F';
        }
    }
}
