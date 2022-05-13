package object_oriented_programming.application;

import java.util.Locale;
import java.util.Scanner;

import object_oriented_programming.entities.CurrencyConverter;

public class Exercise36 {
    
    //with the current dollar price and quantity you want to buy, shows the conversion in reais
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double price, bought;

        System.out.print("What is the dollar price? ");
        price = sc.nextDouble();

        System.out.print("\nHow many dollars will be bought? ");
        bought = sc.nextDouble();

        System.out.printf("\nAmount to be paid in reais = %.2f", CurrencyConverter.converter(price, bought));

        sc.close();
    }
}
