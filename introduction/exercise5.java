package introduction;
import java.util.Scanner;

public class exercise5 {
    
    public static void main(String[] args) {
        
        //read four variables (A, B, C, D) and returns the difference of AB and CD
        Scanner sc = new Scanner(System.in);

        int a, b, c, d, diferenca;

        System.out.println("Digite o valor de A:");
        a = sc.nextInt();

        System.out.println("Digite o valor de B:");
        b = sc.nextInt();

        System.out.println("Digite o valor de C:");
        c = sc.nextInt();

        System.out.println("Digite o valor de D:");
        d = sc.nextInt();

        diferenca = ((a*b) - (c*d));

        System.out.println("Diferença dos produtos entre AB e CD: " + diferenca);

        sc.close();
    }
}