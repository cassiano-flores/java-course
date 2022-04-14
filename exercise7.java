import java.util.Locale;
import java.util.Scanner;

public class exercise7 {

    //read informations of two products and returns the total amount to pay
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codigo1, numeroPecas1, codigo2, numeroPecas2;
        double valorUnitario1, valorUnitario2, total;

        System.out.println("Digite o codigo da primeira peca: ");
        codigo1 = sc.nextInt();

        System.out.println("Digite o numero de pecas da primeira peca: ");
        numeroPecas1 = sc.nextInt();

        System.out.println("Digite o valor unitario da primeira peca: ");
        valorUnitario1 = sc.nextDouble();

        System.out.println("Digite o codigo da segunda peca: ");
        codigo2 = sc.nextInt();

        System.out.println("Digite o numero de pecas da segunda peca: ");
        numeroPecas2 = sc.nextInt();

        System.out.println("Digite o valor unitario da segunda peca: ");
        valorUnitario2 = sc.nextDouble();

        total = ((numeroPecas1*valorUnitario1) + (numeroPecas2*valorUnitario2));

        System.out.printf("Valor a pagar: R$ %.2f\n", total);

        sc.close();
    }
}