package inheritance_polymorphism.application;

import inheritance_polymorphism.entities.BusinessAccount;

//just an inheritance example to learn
public class Exercise50 {
    
    public static void main(String[] args) {
        
        BusinessAccount account = new BusinessAccount();

        account.getBalance();    //just the Account class have the balance attribute, but BusinessAccount
                                 //is an extension from Account, so we can use getBalance()
    }
}