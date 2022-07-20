package inheritance_polymorphism.entities;

//class PhysicalPerson extended from Person (abstract) for Exercise54
public class PhysicalPerson extends Person {

    private Double healthSpending;

    @Override
    public Double tax() {

        double tax = 0.15;

        if (getAnnualIncome() >= 20000.00) {
            tax = 0.25;
        }

        return (getAnnualIncome() * tax) - (healthSpending * 0.50);
    }

    public PhysicalPerson() {
    }

    public PhysicalPerson(String name, Double annualIncome, Double healthSpending) {
        super(name, annualIncome);
        this.healthSpending = healthSpending;
    }

    public Double getHealthSpending() {
        return healthSpending;
    }

    public void setHealthSpending(Double healthSpending) {
        this.healthSpending = healthSpending;
    }
}