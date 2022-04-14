import java.util.Scanner;

public class exercise3 {

    //sum of two integer values
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int x, y, soma;

        System.out.println("Digite o primeiro valor inteiro: ");
    
        x = sc.nextInt();

        System.out.println("Digite o segundo valor inteiro: ");
        y = sc.nextInt();
        
        soma = x + y;

        System.out.println("Soma dos dois valores: " + soma);

        sc.close();
    }
}