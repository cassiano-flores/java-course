package object_oriented_programming.application;

import java.util.Locale;
import java.util.Scanner;

import object_oriented_programming.entities.BankAccount;

//enter some information for a new bank account, then make a deposit and withdrawal (exercising the encapsulation, constructors, getters and setters)
public class Exercise38 {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int account;
        String name;
        double balance = 0;

        System.out.print("Enter account number: ");
        account = sc.nextInt();

        System.out.print("Enter account holder: ");
        sc.nextLine();
        name = sc.nextLine();

        System.out.print("Is there an initial deposit (y/n)? ");
        String aux = sc.next();
        if (aux.equals("y")){
            
            System.out.print("Enter initial deposit value: ");
            balance = sc.nextDouble();
        }

        BankAccount bankAccount = new BankAccount(account, name, balance);

        System.out.println("\nAccount data: \n" + bankAccount);

        System.out.print("\nEnter a deposit value: ");
        bankAccount.deposit(sc.nextDouble());

        System.out.println("Updated account data: \n" + bankAccount);

        System.out.print("\nEnter a withdraw value: ");
        double aux2 = sc.nextDouble();

        if (bankAccount.getBalance() - 5.00 >= aux2){

            bankAccount.withdraw(aux2);
        }
        else {
            System.out.println("***** Insufficient account balance, operation failed *****\n");
        }
        
        System.out.println("Updated account data: \n" + bankAccount);

        sc.close();
    }
}
