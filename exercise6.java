import java.util.Locale;
import java.util.Scanner;

public class exercise6 {
 
    // read the hours worked and how much the employee earns each hours, finally returns the employee's salary
    public static void main(String[] args) {
        
            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);

        int numero;
        double horas, valorHora, salario;

        System.out.println("Digite o numero do funcionario: ");
        numero = sc.nextInt();

        System.out.println("Digite o numero de horas trabalhadas do funcionario: ");
        horas = sc.nextDouble();

        System.out.println("Digite o valor que o funcionario recebe por hora: ");
        valorHora = sc.nextDouble();

        salario = horas * valorHora;

        System.out.printf("Funcionario numero: " + numero + "\nSalario: U$ %.2f\n", salario);

            sc.close();
    }
}