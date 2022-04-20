import java.util.Scanner;

public class exercise11 {
    
    //tell if two numbers are multiples or not
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a, b;

        System.out.println("Digite dois numeros: ");
        a = sc.nextInt();
        b = sc.nextInt();

        if (a%b == 0 || b%a == 0){
            System.out.println("Sao Multiplos");
        }
        else{
            System.out.println("Nao sao Multiplos");
        }

        sc.close();
    }
}
