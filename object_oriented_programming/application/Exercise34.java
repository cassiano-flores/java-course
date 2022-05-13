package object_oriented_programming.application;

import java.util.Locale;
import java.util.Scanner;

import object_oriented_programming.entities.Employee;

public class Exercise34 {
    
    //calculates the gross and net salary of a employee, and simulates a increase salary
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee employee = new Employee();

        System.out.print("Name: ");
        employee.name = sc.nextLine();

        System.out.print("Gross Salary: ");
        employee.grossSalary = sc.nextDouble();
        
        System.out.print("Tax: ");
        employee.tax = sc.nextDouble();

        System.out.print("\nEmployee: " + employee);

        System.out.print("\n\nWhich percentage to increase salary? ");
        employee.increaseSalary(sc.nextDouble());

        System.out.print("\nUpdated data: " + employee);

        sc.close();
    }
}
