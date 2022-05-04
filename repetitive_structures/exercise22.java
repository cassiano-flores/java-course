package repetitive_structures;
import java.util.Scanner;

public class exercise22 {
    
    //returns all the odd values until the number x
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int x;

        System.out.println("Digite um numero: ");

        x = sc.nextInt();
        System.out.println("Impares: ");

        for (int i=0; i<=x; i++){

            if (i%2 != 0){
                System.out.println(i);
            }
        }

        sc.close();
    }
}
