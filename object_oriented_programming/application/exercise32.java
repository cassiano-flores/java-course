package object_oriented_programming.application;
import java.util.Locale;
import java.util.Scanner;

import object_oriented_programming.entities.Triangle;

public class exercise32 {

    //class with methods, the same exercise of exercise31
    public static void main(String[] args) {
    
       Locale.setDefault(Locale.US);
       Scanner sc = new Scanner(System.in);
       double p1, p2, areaX, areaY;
       String larger;

       Triangle x, y;       // Triangle is a declared class in another package (entities), so we use this like int, double, etc.
       x = new Triangle();  // instantiate the object x
       y = new Triangle();  // instantiate the object y

       System.out.println("Digite as medidas do triangulo X: ");
       x.a = sc.nextDouble();    // inside the Triangle class, have three attributes: a, b, c, so we type the object (x) + " . " + the attribute (a) = (x.a)
       x.b = sc.nextDouble();
       x.c = sc.nextDouble();

       System.out.println("Digite as medidas do triangulo Y: ");
       y.a = sc.nextDouble();   // inside the Triangle class, have three attributes: a, b, c, so we type the object (y) + " . " + the attribute (a) = (y.a)
       y.b = sc.nextDouble();
       y.c = sc.nextDouble();

       areaX = x.area(); // triangle area formulas
       areaY = y.area();

       if (areaX > areaY){
           larger = "X";
       }
       else if (areaY > areaX){
           larger = "Y";
       }
       else{
           larger = "Medidas iguais";
       }

       System.out.printf("Area triangulo X: %.4f\n", areaX);
       System.out.printf("Area triangulo Y: %.4f\n", areaY);
       System.out.println("Maior area: " + larger);

       sc.close();
    }
}
