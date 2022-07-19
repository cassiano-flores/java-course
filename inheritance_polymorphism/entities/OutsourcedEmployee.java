package inheritance_polymorphism.entities;

//class OutsourcedEmployee extend from Employee for Exercise51
public class OutsourcedEmployee extends Employee{

    //additional attribute
    private Double additionalCharge;

    //different way to calc the payment, so we need a @Override
    @Override
    public double payment() {

        return super.payment() + (1.1 * additionalCharge);
    }

    public OutsourcedEmployee() {
    }

    public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
        super(name, hours, valuePerHour);    //the same constructor with just one additional attribute
        this.additionalCharge = additionalCharge;
    }

    public Double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(Double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }
}
