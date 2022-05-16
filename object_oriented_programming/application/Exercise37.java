package object_oriented_programming.application;

import java.util.Locale;
import java.util.Scanner;

import object_oriented_programming.entities.Product;

public class Exercise37 {
    
    //enters data for a product, and then performs addition and subtraction operations on the quantity in stock
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String name;      //temporary attributes to later serve in the object's instantiation
        double price;
        int quantity;

        System.out.println("Enter product data:");
        System.out.print("Name: ");
        name = sc.nextLine();

        System.out.print("Price: ");
        price = sc.nextDouble();

        System.out.print("Quantity in stock: ");
        quantity = sc.nextInt();

        Product product = new Product(name, price, quantity);     //product instantiated with values ​​for name, price and quantity defined

        System.out.println("Product data: " + product);
        System.out.print("\nEnter the number of products to be added in stock: ");
        product.addProducts(sc.nextInt());

        System.out.println("Updated data: " + product);
        System.out.print("\nEnter the number of products to be removed from stock: ");
        product.removeProducts(sc.nextInt());

        System.out.println("Updated data: " + product);

        sc.close();
    }
}
