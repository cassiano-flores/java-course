package memory_arrays_lists.application;

import java.util.Locale;
import java.util.Scanner;

import memory_arrays_lists.entities.Product;

//testing vector with reference, returns the average price of n products
public class Exercise40 {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double sum = 0.0;
        Product[] vect = new Product[n];   //now the class isn't DOUBLE, it's Product

        for (int i=0; i<vect.length; i++){   //LENGTH to vector size!!

            sc.nextLine();                  //consume the line break
            String name = sc.nextLine();
            double price = sc.nextDouble();

            vect[i] = new Product(name, price);   //vector at position i creates an INSTANCE for a new product
        }

        for (int i = 0; i<vect.length; i++){

            sum = sum + vect[i].getPrice();   //access the vector at position i, and get ONLY the price with getPrice
        }

        double avg = sum/vect.length;

        System.out.printf("Average Price = %.2f\n", avg);

        sc.close();
    }
}
