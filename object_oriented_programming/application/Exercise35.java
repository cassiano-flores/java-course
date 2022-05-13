package object_oriented_programming.application;

import java.util.Locale;
import java.util.Scanner;

import object_oriented_programming.entities.Student;

public class Exercise35 {
    
    //inform the 3 grades of a student in the year and return if he passed or not, and with how many points
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        student.name = sc.nextLine();
        student.grade1 = sc.nextDouble();
        student.grade2 = sc.nextDouble();
        student.grade3 = sc.nextDouble();

        System.out.println(student);

        sc.close();
    }
}
