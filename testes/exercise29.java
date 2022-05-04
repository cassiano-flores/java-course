package testes;
import java.util.Scanner;

public class exercise29 {
    
    //testing bitwise
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int mask = 32;
        int n = sc.nextInt();

        if ((mask & n) != 0){
            System.out.println("6th bit is true! ( = 1)");
        }
        else{
            System.out.println("6th bit is false! ( = 0)");
        }

        sc.close();
    }
}
