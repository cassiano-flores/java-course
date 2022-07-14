package enumeration.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import enumeration.entities.Client;
import enumeration.entities.Order;
import enumeration.entities.OrderItem;
import enumeration.entities.Product;
import enumeration.entities.enums.OrderStatus;

//final exercise for associations and compositions utilizing enum
public class Exercise49 {

    public static void main(String[] args) throws ParseException {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        //----------Client----------
        System.out.println("Enter client data: ");
        System.out.print("Name: ");
        String nameClient = sc.nextLine();   //sc.nexLine() accept blank spaces, names can be spaces

        System.out.print("Email: ");
        String emailClient = sc.next();   //sc.next() doesnt accept blank spaces and an email dont have one

        System.out.print("Birth date (DD/MM/YYYY): ");
        Date birthDateClient = sdf.parse(sc.next());     //no blank spaces

        Client client = new Client(nameClient, emailClient, birthDateClient);  //Client instantiation

        //----------Order----------
        System.out.println("\nEnter order data: ");
        System.out.print("Status: ");
        String status = sc.next();    //no options with blank space

        Date moment = new Date();    //actual hour date

        Order order = new Order(moment, OrderStatus.valueOf(status), client);  //Order instantiation

        System.out.print("How many items to this order? ");
        int n = sc.nextInt();

        //----------OrderItem and Product----------
        for (int i=1; i<=n; i++){

            System.out.println("\nEnter #" + i + " item data: ");
            System.out.print("Product name: ");
            sc.nextLine();                     //below have a nextLine(), and above (before) have a nextInt()
                                               //so, needs to clean the buffer with another nextLine()
            String nameProduct = sc.nextLine();

            System.out.print("Product price: ");
            double priceProduct = sc.nextDouble();

            System.out.print("Quantity: ");
            int quantityProduct = sc.nextInt();

            Product product = new Product(nameProduct, priceProduct);  //Product instantiation for OrderItem instantiation
            OrderItem orderItem = new OrderItem(quantityProduct, priceProduct, product);  //OrderItem instantiation
            order.addItem(orderItem);
        }

        //----------Print everything----------
        System.out.println("\nORDER SUMMARY:");
        System.out.println(order);             //order contains a StringBuilder (toString()) personalized,                                          
                                               //so, all I need is print the instance order
        sc.close();
    }                                          
}