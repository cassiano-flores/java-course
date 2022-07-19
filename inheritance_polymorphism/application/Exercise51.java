package inheritance_polymorphism.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import inheritance_polymorphism.entities.Employee;
import inheritance_polymorphism.entities.OutsourcedEmployee;

//learning polymorphism, the "list" type is Employee,
//but each object instance can be Employee or OutsourcedEmployee, and the comportment will be different
public class Exercise51 {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();  //a Employee list for add employees


        System.out.print("Enter the number of employees: ");
        int func = sc.nextInt();

        for (int i=1; i<=func; i++){

            System.out.println("\nEmployee #" + i + " data: ");
            System.out.print("Outsourced (y/n)? ");  //if yes, we have a different payment
            sc.nextLine();
            String outsourced = sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Hours: ");
            int hours = sc.nextInt();

            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();

            if (outsourced.charAt(0) == 'y'){  //if is a Outsourced employee
                
                System.out.print("Additional charge: ");
                double additionalCharge = sc.nextDouble();

                Employee employee = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
                //employee type is Employee, but I create a new OutsourcedEmployee instance,
                //because this one haves the additionalCharge attribute
                list.add(employee);
                //add to list
            }
            else{

            Employee employee = new Employee(name, hours, valuePerHour);
            //employee type is Employee, and creates a new Employee instance
            list.add(employee);
            //add to list
            }
        }

        System.out.println("\nPAYMENTS: ");

        for (Employee employee : list) {  //for each employee element from list, do this:
            
            System.out.println(employee.getName() + " - $ " + String.format("%.2f", employee.payment()));
        }

        /*
        different way to print, with normal "for"

        for (int i=0; i<func; i++){

            System.out.println(list.get(i).getName() + " - $ " + String.format("%.2f", list.get(i).payment()));
        }
        */
        
        sc.close();
    }
}