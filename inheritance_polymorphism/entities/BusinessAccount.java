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

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount);
        balance = balance - 2.00;      //uses the same logic and adds an additional detail,
                                       //discounting $2.00 more

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