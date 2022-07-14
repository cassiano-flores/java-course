package inheritance_polymorphism.entities;

//BusinessAccount extends Account example for Exercise50 (this is inheritance)
//BusinessAccount is a Account subclass
public class BusinessAccount extends Account{

    private Double loanLimit;    //just the new attribute

    public void loan(double amount){

        if (amount <= loanLimit){
            balance = balance + amount - 10.00;   //10.00 is like a tax paid by client to use a loan
        }
    }

    public BusinessAccount() {
    }

    public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance);     //super executes base class constructor logic
        this.loanLimit = loanLimit;         //normal attribution
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }
}