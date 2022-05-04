package introduction;
import java.util.Scanner;

public class exercise9 {
    
    //tell if a number is negative or not
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.println("Digite um numero: ");
        numero = sc.nextInt();

        if (numero<0) {
            System.out.println("NEGATIVO");
        }
        else {
            System.out.println("NAO NEGATIVO");
        }

        sc.close();
    }
}