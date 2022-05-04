package introduction;
import java.util.Locale;
import java.util.Scanner;

public class exercise8 {
 
    //inform 3 values and returns the area of the right triangle, circle, trapezoid, square and rectangle
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double a, b, c, triangulo, circulo, trapezio, quadrado, retangulo;

        System.out.println("Digite o valor de A: ");
        a = sc.nextDouble();

        System.out.println("Digite o valor de B: ");
        b = sc.nextDouble();

        System.out.println("Digite o valor de C: ");
        c = sc.nextDouble();

        triangulo = (a*c)/2.0;
        circulo = 3.14159 * c*c;
        trapezio = ((a+b)*c)/2.0;
        quadrado = b*b;
        retangulo = a*b;

        System.out.printf("\nAreas: \nTriangulo: %.3f \nCirculo: %.3f \nTrapezio: %.3f \nQuadrado: %.3f \nRetangulo: %.3f\n", triangulo, circulo, trapezio, quadrado, retangulo);

        sc.close();
    }
}