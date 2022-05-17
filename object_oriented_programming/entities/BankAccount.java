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

    public BankAccount(int account, String name, double balance) {
        this.account = account;
        this.name = name;
        this.balance = balance;
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

    public double deposit(double deposit){

        return balance = balance + deposit;
    }
    
    public double withdraw(double withdrawl){

        return balance = balance - withdrawl - 5.00;
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
