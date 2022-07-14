package inheritance_polymorphism.entities;

public class SavingsAccount extends Account {

    private Double interestRate;

    public void updateBalance(){

        balance = balance + (balance * interestRate);
    }

    public SavingsAccount() {
    }

    public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }
}
