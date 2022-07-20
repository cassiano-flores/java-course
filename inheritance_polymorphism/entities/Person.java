package inheritance_polymorphism.entities;

//abstract class Person for Exercise54
public abstract class Person {
    
    private String name;
    private Double annualIncome;

    //abstract method
    public abstract Double tax();

    public Person() {
    }

    public Person(String name, Double annualIncome) {
        this.name = name;
        this.annualIncome = annualIncome;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAnnualIncome() {
        return annualIncome;
    }

    public void setAnnualIncome(Double annualIncome) {
        this.annualIncome = annualIncome;
    }
}