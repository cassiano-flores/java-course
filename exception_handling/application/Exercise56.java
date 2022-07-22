package exception_handling.application;

import java.util.Locale;
import java.util.Scanner;

import exception_handling.model.entities.Account;
import exception_handling.model.exceptions.WithdrawException;

//final exercise with exception handling, try catch and personalized exceptions
public class Exercise56 {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        try {  //try to do all this code
            System.out.println("Enter account data");
            System.out.print("Number: ");
            int number = sc.nextInt();

            System.out.print("Holder: ");
            sc.nextLine();
            String holder = sc.nextLine();

            System.out.print("Initial balance: ");
            double balance = sc.nextDouble();

            System.out.print("Withdraw limit: ");
            double withdrawLimit = sc.nextDouble();

            Account account = new Account(number, holder, balance, withdrawLimit);  //instance one account

            System.out.print("\nEnter amount for withdraw: ");
            double amount = sc.nextDouble();
            account.withdraw(amount);  //call the withdraw method (it has all the if-else errors tests)

            System.out.println("New balance: " + String.format("%.2f", account.getBalance()));
            //if doesnt have an error, print the new balance
        }
        catch (WithdrawException e){  //catch the error 1 and 2 of "withdraw" method
            System.out.println("Withdraw error: " + e.getMessage());
        }
        catch (RuntimeException e){  //an random unexpected error
            System.out.println("Unexpected error");
        }

        sc.close();
    }
}