package inheritance_polymorphism.entities;

//class LegalPerson extended from Person (abstract) for Exercise54
public class LegalPerson extends Person{

    private Integer employeesNumber;

    @Override
    public Double tax() {

        double tax = 0.16;

        if (employeesNumber > 10){
            tax = 0.14;
        }

        return getAnnualIncome() * tax;
    }

    public LegalPerson() {
    }

    public LegalPerson(String name, Double annualIncome, Integer employeesNumber) {
        super(name, annualIncome);
        this.employeesNumber = employeesNumber;
    }

    public Integer getEmployeesNumber() {
        return employeesNumber;
    }

    public void setEmployeesNumber(Integer employeesNumber) {
        this.employeesNumber = employeesNumber;
    }
}