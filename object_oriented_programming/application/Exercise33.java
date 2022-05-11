package object_oriented_programming.application;

import java.util.Locale;
import java.util.Scanner;

import object_oriented_programming.entities.Rectangle;

public class Exercise33 {

    //enter the width and height of a rectangle and returns the area, perimeter and diagonal
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();  //instantiates only one rectangle, because it calculates just one at a time

        System.out.println("Enter rectangle width and height: ");
        rectangle.width = sc.nextDouble();   //width of the rectangle
        rectangle.height = sc.nextDouble();  //height of the rectangle

        System.out.printf("AREA = %.2f\n", rectangle.area());
        System.out.printf("PERIMETER = %.2f\n", rectangle.perimeter());
        System.out.printf("DIAGONAL = %.2f\n", rectangle.diagonal());

        sc.close();
    }
}
