package introduction;
import java.util.Locale;
import java.util.Scanner;

public class exercise4 {

    //gives the radius and returns the area of a circle
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double raio, area;

        System.out.println("Digite o raio do circulo: ");
        raio = sc.nextDouble();

        area = 3.14159 * Math.pow(raio,2);

        System.out.printf("Area do circulo: %.4f ", area);

        sc.close();
    }
}