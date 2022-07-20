package inheritance_polymorphism.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import inheritance_polymorphism.entities.ImportedProduct;
import inheritance_polymorphism.entities.Product;
import inheritance_polymorphism.entities.UsedProduct;

public class Exercise52 {

    public static void main(String[] args) throws ParseException {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); //set date format

        List<Product> list = new ArrayList<>();  //new Product list

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++) {

            System.out.println("\nProduct #" + i + " data: ");
            System.out.print("Common, used or imported (c/u/i)? ");
            char option = sc.next().charAt(0);   //the option will be the first letter

            while (option != 'c' && option != 'u' && option != 'i'){
                //if the user types anything other than c/u/i, this phrase repeat

                System.out.println("\nOption not found, please try again ");
                System.out.print("Common, used or imported (c/u/i)? ");
                option = sc.next().charAt(0);
                //charAt is considered a non-alphanumeric type, so in the next "next()" or "nextLine()",
                //we have to use a "sc.nextLine()" before to consumes the break line
            }
            
            System.out.print("Name: ");
            sc.nextLine();    //consume break line
            String name = sc.nextLine();

            System.out.print("Price: ");
            double price = sc.nextDouble();

            if (option == 'i'){

                System.out.print("Customs fee: ");
                double customsFee = sc.nextDouble();

                Product product = new ImportedProduct(name, price, customsFee);
                list.add(product);  //instantiates an "ImportedProduct" product of type "Product"
            }
            else if (option == 'u'){

                System.out.print("Manufacture date (DD/MM/YYYY): ");
                sc.nextLine();
                Date manufactureDate = sdf.parse(sc.next());   //uses just "next()" because a date dont have any blank spaces

                Product product = new UsedProduct(name, price, manufactureDate); //
                list.add(product);  //instantiates an "UsedProduct" product of type "Product"
            }
            else {

                Product product = new Product(name, price);
                list.add(product);  //instantiates an product of type "Product"
            }
        }

        System.out.println("\nPRICE TAGS: ");

        for (Product product : list) {  //for each product element from list, do this:
            
            System.out.println(product.priceTag());  //just print
        }

        sc.close();
    }   
}