package memory_arrays_lists.entities;

//class Employee for Exercise43
public class Employee {
    
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void salaryIncrease(double percentage){

        salary = salary + (salary * percentage/100.00);
    }

    public String toString(){

        return id 
               + ", " 
               + name 
               + ", " 
               + String.format("%.2f\n", salary);
    }
}