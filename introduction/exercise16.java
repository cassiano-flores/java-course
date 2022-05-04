package introduction;
import java.util.Locale;
import java.util.Scanner;

public class exercise16 {
    
    //inform the salary and returns how much tax you have to pay (tax by ranges)
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double salario, imposto;

        System.out.println("Digite o salario para saber o imposto a pagar: ");
        salario = sc.nextDouble();

        if (salario < 0.00){
            System.out.println("Valor invalido");
        }
        else if (salario <= 2000.00){
            System.out.println("Isento");
        }
        else if (salario <= 3000.00){
            imposto = (salario - 2000.00) * 0.08;
            System.out.printf("R$ %.2f", imposto);
        }
        else if (salario <= 4500.00){
            imposto = ((salario - 2000.00 - 1000.00) * 0.18) + (1000.00 * 0.08);
            System.out.printf("R$ %.2f", salario);
        }
        else {
            imposto = ((salario - 2000.00 - 1000.00 - 1500) * 0.28) + (1000.00 * 0.08) + (1500.00 * 0.18);
            System.out.printf("R$ %.2f", imposto);
        }

        sc.close();
    }
}
