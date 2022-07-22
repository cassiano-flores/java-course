package exception_handling.model.entities;

import exception_handling.model.exceptions.WithdrawException;

//class Account for Exercise56
public class Account {
    
    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public void deposit(Double amount){

        balance = balance + amount;
    }

    public void withdraw(Double amount) throws WithdrawException{ //throws the new personalized WithdrawException made

        if (amount > withdrawLimit){

            throw new WithdrawException("The amount exceeds withdraw limit"); //error 1
        }

        if (amount > balance){

            throw new WithdrawException("Not enough balance"); //error 2
        }

        balance = balance - amount;  //if everything goes well, show this message
    }

    public Account() {
    }

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
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

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }
}