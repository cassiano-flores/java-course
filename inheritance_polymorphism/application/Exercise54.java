package inheritance_polymorphism.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import inheritance_polymorphism.entities.LegalPerson;
import inheritance_polymorphism.entities.Person;
import inheritance_polymorphism.entities.PhysicalPerson;

//final exercise with abstract and polymorphism, different methods with an abstract superclass Person
public class Exercise54 {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Person> list = new ArrayList<>();  //new Person list to store all the person types

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for (int i = 1; i<=n; i++){

            System.out.println("\nTax payer #" + i + " data: ");
            System.out.print("Individual or Company (i/c)? ");
            char optPerson = sc.next().charAt(0);

            //-------------------  just to check
            while (optPerson != 'i' && optPerson != 'c'){
                System.out.println("Unknown option, please try again");
                System.out.print("Individual or Company (i/c)? ");
                optPerson = sc.next().charAt(0);
            }
            //-------------------

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Annual income: ");
            double annualIncome = sc.nextDouble();

            if (optPerson == 'i'){

                System.out.print("Health expenditures: ");
                double healthSpending = sc.nextDouble();

                Person person = new PhysicalPerson(name, annualIncome, healthSpending);
                list.add(person);  //if the optPerson is "i", then instance a PhysicalPerson
            }
            else {

                System.out.print("Number of employees: ");
                int employeesNumber = sc.nextInt();

                Person person = new LegalPerson(name, annualIncome, employeesNumber);
                list.add(person);  //if the optPerson is "i", then instance a LegalPerson
            }
        }

        System.out.println("\nTAXES PAID: ");

        for (Person person : list) {
            System.out.println(person.getName() + ": $ " + String.format("%.2f", person.tax()));
        }       //print all the Persons on the list

        double sum = 0.00;
        for (Person person : list) {
            
            sum = sum + person.tax();   //sum all the taxes on the list
        }

        System.out.println("\nTOTAL TAXES: $ " + String.format("%.2f", sum));  //print the sum

        sc.close();
    }
}