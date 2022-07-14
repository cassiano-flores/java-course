package inheritance_polymorphism.entities;

//example class for Exercise50
public class Account {
    
    private Integer number;
    private String holder;
    protected Double balance;  //I have to acess balance attribute in my BusinessAccount subclass, but
                               //I dont want to make a public attribute, so we use protected (access by package and by inheritance)

    public void withdraw(double amount){

        balance = balance - amount;
    }

    public void deposit(double amount){

        balance = balance + amount;
    }

    public Account() {
    }

    public Account(Integer number, String holder, Double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }    
}