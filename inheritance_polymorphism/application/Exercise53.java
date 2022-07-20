package inheritance_polymorphism.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import inheritance_polymorphism.entities.Circle;
import inheritance_polymorphism.entities.Rectangle;
import inheritance_polymorphism.entities.Shape;
import inheritance_polymorphism.entities.enums.Color;

//final exercise with polymorphism and abstract classes
public class Exercise53 {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Shape> list = new ArrayList<>();   //Shape type list

        System.out.print("Enter the number of shapes: ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++){

            System.out.println("\nShape #" + i + " data: ");
            System.out.print("Rectangle or Circle (r/c)? ");
            char optShape = sc.next().charAt(0);   //optShape will be only the first letter

            /* these exercises is just for learn, so dont need to predict errors at every user write (me)

            while (option != 'r' && option != 'c'){
                System.out.println("Unknown shape, please try again");
                System.out.print("Rectangle or Circle (r/c)? ");
                option = sc.next().charAt(0);
            }
            */

            System.out.print("\nCOLORS \n1 - BLACK \n2 - BLUE \n3 - RED \nWhat color is? ");
            int optColor = sc.nextInt();        //a table with the colors,
            Color color = Color.BLACK;          //so the user dont need to write correctly the color

            //defines the color based on the write option (optColor)
            switch (optColor) {
                case 1:
                    color = Color.BLACK;
                    break;
            
                case 2:
                    color = Color.BLUE;
                    break;

                case 3:
                    color = Color.RED;
                    break;
            }

            if (optShape == 'r'){

                System.out.print("Width: ");
                double width = sc.nextDouble();

                System.out.print("Height: ");
                double height = sc.nextDouble();

                Shape shape = new Rectangle(color, width, height);//instances a Rectangle on a "Shape" variable
                list.add(shape);
                //list.add(new Rectangle(color, width, height));
            }
            else{

                System.out.print("Radius: ");
                double radius = sc.nextDouble();

                Shape shape = new Circle(color, radius);  //instances a Circle on a "Shape" variable
                list.add(shape);
                //list.add(new Circle(color, radius));
            }
        }

        System.out.println("\nSHAPE AREAS:");

        for (Shape shape : list) {
            System.out.println(String.format("%.2f", shape.area())); //print all the area measurements
        }

        sc.close();
    }
}