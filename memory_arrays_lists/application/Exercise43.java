package memory_arrays_lists.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import memory_arrays_lists.entities.Employee;

//exercising List, informs some employees and increase the salary of one
//managing indices and IDs
public class Exercise43 {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();

        List<Employee> employees = new ArrayList<>();     //new list with "Employee" type, a class that I created

        for (int i=0; i<n; i++){      //read and write all the employees

            System.out.println("\nEmployee #" + (i+1));

            System.out.print("Id: ");
            int id = sc.nextInt();

            for (int j=0; j<employees.size(); j++){       //this condition makes the id dont repeat

                while (true){

                    if (employees.get(j).getId() == id){   //if the employee "j" ID is equal to new id registered, so you cant do that
                        System.out.println("This ID is already in use, try another ");
                        id = sc.nextInt();
                    }
                    else{
                        break;     //if its new id, its ok
                    }
                }
            }

            sc.nextLine();                      //just a break line

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Salary: ");
            double salary = sc.nextDouble();

            Employee employee = new Employee(id, name, salary);     //instance a new employee with this data
            employees.add(i, employee);                             //add to the List this new employee
        }

        System.out.print("\nEnter the employee id that will have salary increase: ");
        int salaryIncreaseID = sc.nextInt();   //the employee ID that will receive a salary increase
        boolean aux = false;     //just a auxiliary variable

        for (int i=0; i<employees.size(); i++){   //verify if the informed ID for receive a salary increase exist

            if (employees.get(i).getId() != salaryIncreaseID){

            }
            else{
                aux = true;   //if getID = salaryIncreaseID, exists
                break;
            }
        }

        if (aux != true){     //auxiliary variable
            System.out.println("This ID doesnt exist!");
        }
        else{
            System.out.print("Enter the percentage: ");
            double percentage = sc.nextDouble();
            for (int i=0; i < employees.size(); i++){             //checks which index is in the vector 
                                                                  //the ID employee to be increased the salary
                if (employees.get(i).getId() == salaryIncreaseID){
                    employees.get(i).salaryIncrease(percentage);
                }
            }
        }

        System.out.println("\nList of employees: ");   
        for (int i=0; i < employees.size(); i++){           //final print
            System.out.print(employees.get(i));
        }

        sc.close();
    }
}