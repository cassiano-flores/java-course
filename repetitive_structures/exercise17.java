package repetitive_structures;
import java.util.Locale;
import java.util.Scanner;

public class exercise17 {
    
    //sum all numbers until the number 0
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double x, soma = 0.0;

        System.out.println("Digite um valor: ");
        x = sc.nextDouble();

        while (x != 0) {
            soma = soma + x;
            x = sc.nextDouble();
        }

        System.out.println(soma);

        sc.close();
    }
}
