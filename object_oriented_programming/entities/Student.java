package object_oriented_programming.entities;

//class student for Exercise35
public class Student {
    
    public String name, situation;
    public double grade1, grade2, grade3;

    public double sumGrades(){

        return grade1 + grade2 + grade3;
    }

    public double missing(){

        return 60.00 - sumGrades();
    }

    public String situation(){

        if (sumGrades() >= 60.00){
            return "PASS";
        }
        else {
            return "FAILED \nMISSING " + String.format("%.2f", missing())  + " POINTS";
        }
    }

    public String toString(){

        return "FINAL GRADE = " + String.format("%.2f", sumGrades())  + "\n" + situation();
    }
}
