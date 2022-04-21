import java.util.Locale;
import java.util.Scanner;

public class exercise15 {
    
    //returns the quadrant of the position in a cartesian plane
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double x, y;

        System.out.println("Digite a coordenada X: ");
        x = sc.nextDouble();
        System.out.println("Digite a coordenada Y: ");
        y = sc.nextDouble();

        if (x > 0 && y > 0) {
            System.out.println("Q1");
        }
        else if (x > 0 && y < 0) {
            System.out.println("Q4");
        }
        else if (x < 0 && y > 0) {
            System.out.println("Q2");
        }
        else if (x < 0 && y < 0) {
            System.out.println("Q3");
        }
        else {
            System.out.println("Origem");
        }

        sc.close();
    }
}
