package introduction;
import java.util.Locale;
import java.util.Scanner;

public class exercise14 {

    // returns the interval of a number
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double valor;

        System.out.println("Digite um valor: ");
        valor = sc.nextDouble();

        if (0.00 <= valor && valor <= 25.00) {
            System.out.println("Intervalo [0,25]");
        }
        else if (25.00 < valor && valor <= 50.00) {
            System.out.println("Intervalo (25,50]");
        }
        else if (50.00 < valor && valor <= 75.00) {
            System.out.println("Intervalo (50,75]");
        }
        else if (75.00 < valor && valor <= 100.00) {
            System.out.println("Intervalo (75,100]");
        }
        else {
            System.out.println("Fora de intervalo");
        }

        sc.close();
    }
}
