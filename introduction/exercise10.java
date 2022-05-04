package introduction;
import java.util.Scanner;

public class exercise10 {
    
    //tell if a number is even or odd
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.println("Digite um numero: ");
        numero = sc.nextInt();

        if (numero%2 == 0){
            System.out.println("PAR");
        }
        else{
            System.out.println("IMPAR");
        }
        sc.close();
    }
}
