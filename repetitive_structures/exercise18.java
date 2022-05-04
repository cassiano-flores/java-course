package repetitive_structures;
import java.util.Scanner;

public class exercise18 {
    
    //simulation of a wrong and correct password
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int senha;

        System.out.println("Digite a senha: ");
        senha = sc.nextInt();

        while (senha != 2002){
            System.out.println("Senha Invalida");
            senha = sc.nextInt();
        }

        System.out.println("Acesso Permitido");

        sc.close();
    }
}
