package memory_arrays_lists.application;

import java.util.Locale;
import java.util.Scanner;

//introduction to vectors, a program to calculate the average height
public class Exercise39 {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double height = 0.0;
        double[] vect = new double[n];            //way to CREATE a vector

        for (int i=0; i<n; i++){                  //way to READ a vector

            vect[i] = sc.nextDouble();
        }

        for (int i=0; i<n; i++){       //just to calculate the average height

            height = height + vect[i];
        }

        double avg = height/n;

        System.out.printf("Average Height: %.2f\n", avg);

        sc.close();
    }
}