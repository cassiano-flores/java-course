package enumeration.entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import enumeration.entities.enums.WorkerLevel;

//class Worker for Exercise47
public class Worker {
    
    //attributes
    private String name;
    private WorkerLevel level;
    private Double baseSalary;

    //associations (composition)
    private Department department;    //just one department ( 1 )
    private List<HourContract> contracts = new ArrayList<>();  //have to be instantiated in the declaration
                                        //initialize like a List because these association is a HAVE-MANY

    //methods responsible for do or undo a CONTRACT ASSOCIATION
    //in the diagram UML (astah), these association is a HAVE-MANY ( * )
    public void addContract(HourContract contract){
        contracts.add(contract);
    }

    public void removeContract(HourContract contract){
        contracts.remove(contract);
    }

    public double income(Integer year, Integer month){

        double sum = baseSalary;
        //Calendar is for calculate the year and month
        Calendar cal = Calendar.getInstance();

        //go through the entire contracts list
        for(int i=0; i<contracts.size(); i++){   //could be a foreach ->  for (HourContract c : contracts)
                                                 //so it wouldnt be necessary to use .get(i)

            cal.setTime(contracts.get(i).getDate());
            int contract_year = cal.get(Calendar.YEAR);        //contract_year receives the year of this contract.get(i)
            int contract_month = 1 + cal.get(Calendar.MONTH);  //contract_year receives the year of this contract.get(i)

            if (year == contract_year && month == contract_month){
                
                sum = sum + contracts.get(i).totalValue();
            }
        }

        return sum; //baseSalary + totalValue contract
    }

    public Worker(){
    }

    //construct with the attributes and associations (Lists arent declares on a constructor)
    public Worker(String name, WorkerLevel level, double baseSalary, Department department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }

    //contract doesnt have a setContract because we dont change the List Contract, only the contracts by the addContract and removeContract
}
