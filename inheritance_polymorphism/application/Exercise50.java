package inheritance_polymorphism.application;

import inheritance_polymorphism.entities.Account;
import inheritance_polymorphism.entities.BusinessAccount;
import inheritance_polymorphism.entities.SavingsAccount;

//just an inheritance example to learn
public class Exercise50 {
    
    public static void main(String[] args) {

        //------ INHERITANCE TESTS -------
        
        BusinessAccount account = new BusinessAccount();

        account.getBalance();    //just the Account class have the balance attribute, but BusinessAccount
                                 //is an extension from Account, so we can use getBalance()

        //----------------------------------------------

        Account acc = new Account(1001, "Alex", 0.00);
        System.out.println(acc);
        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.00, 500.00);

        //UPCASTING (superclass receives a subclass object)
        //thats normal because the subclass is also an object from the superclass

        Account acc1 = bacc;
        System.out.println(acc1);
        Account acc2 = new BusinessAccount(1003, "Bob", 0.00, 200.00); //Account -> BusinessAcount
        Account acc3 = new SavingsAccount(1004, "Anna", 0.00, 0.01); //Account -> SavingsAccount

        //DOWNCASTING

        // BusinessAccount acc4 = acc2;                  //cannot do it, because the "acc2" type is an Account
        BusinessAccount acc4 = (BusinessAccount) acc2;   //not natural conversion, may have a problem
        acc4.loan(100.00);  //"acc4" is a BusinessAccount type, so he haves the loan method
                                    // acc2.loan(100.00) results an error

        //BusinessAccount acc5 = (BusinessAccount) acc3;   //acc3 isnt a BusinessAccount subclass, so we
                                                //we cannot do this, it will results an error when runs

        if (acc3 instanceof BusinessAccount){
            BusinessAccount acc5 = (BusinessAccount) acc3;   //if acc3 is an instance of something, do it
            acc5.loan(200.00);                        //the compiles doesnt know if the casting is right
            System.out.println("Loan!");
        }

        if (acc3 instanceof SavingsAccount){                    //this one
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("\nUpdate!");
        }


        //------ POLYMORPHISM TESTS -------

        Account x = new Account(5555,"Cano", 1000.0);
        Account y = new SavingsAccount(6000, "Castro", 1000.0, 0.01);
        //Account and SavingsAccount have different ways methods called "overrides"

        x.withdraw(50.0);  //when the withdraw method is called, "x" and "y" have the same type,
        y.withdraw(50.0);  //but different instantiations, so we have two different results

        System.out.println(x.getBalance());
        System.out.println(y.getBalance());
    }
}