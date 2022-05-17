package object_oriented_programming.entities;

//class for BankAccount for Exercise38
public class BankAccount {

    private int account;
    private String name;
    private double balance; 

    public BankAccount(int account, String name) {
        this.account = account;
        this.name = name;
    }

    public BankAccount(int account, String name, double initialDeposit) {
        this.account = account;
        this.name = name;
        deposit(initialDeposit);;
    }

    public int getAccount() {
        return account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount){

        balance = balance + amount;
    }
    
    public void withdraw(double amount){

        balance = balance - amount - 5.00;
    }

    public String toString(){

        return "Account "
                + getAccount()
                + ", Holder: "
                + getName()
                + ", Balance: $ "
                + String.format("%.2f", getBalance());
    }
}
