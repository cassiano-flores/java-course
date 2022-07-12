package enumeration.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import enumeration.entities.Department;
import enumeration.entities.HourContract;
import enumeration.entities.Worker;
import enumeration.entities.enums.WorkerLevel;

//learning association and composition
//this class store data for a worker, through Department, HourContract and Worker instances
public class Exercise47 {
    
    public static void main(String[] args) throws ParseException {
        
        Locale.setDefault(Locale.US);   //always before everything
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");  //a data format

        //first data: Worker

        System.out.print("Enter department's name: ");
        String departmentName = sc.nextLine();

        System.out.println("\nEnter worker data:");
        System.out.print("Name: ");
        String workerName = sc.nextLine();

        System.out.print("Level: ");
        String workerLevel = sc.nextLine();

        System.out.print("Base salary: ");
        double workerBaseSalary = sc.nextDouble();

        Department department = new Department(departmentName);  //need instance Department for Worker
        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), workerBaseSalary, department);  //instance a Worker
                            //WorkerLevel.valueOf(workerLevel) converts the typed String to enum, and check
        //--------------------------------------------------------------------------

        //second data: HourContract

        System.out.print("\nHow many contracts to this worker? ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++){
            
            //runs through each contract
            System.out.println("\nEnter contract #" + i + " data: ");
            System.out.print("Date (DD/MM/YYYY): ");
            Date contractDate = sdf.parse(sc.next());  //use the date format

            System.out.print("Value per hour: ");
            double contractValuePerHour = sc.nextDouble();

            System.out.print("Duration (hours): ");
            int contractHours = sc.nextInt();

            //instance a contract (HourContract)
            HourContract contract = new HourContract(contractDate, contractValuePerHour, contractHours);
            worker.addContract(contract);  //add to contract
        }

        //--------------------------------------------------------------------------

        System.out.print("\nEnter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = sc.next();  //store the date in a String

        //creates two substrings, one with the month, and another with the year
        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));

        //final print
        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartment());
        System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));

        sc.close();
    }
}