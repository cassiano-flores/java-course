package testes;
import java.util.Scanner;

public class exercise30 {

    //enter three numbers and returns the max value with methods
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a, b, c, higher;

        System.out.println("Enter three numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        higher = max(a, b, c);
        showResult(higher);

        sc.close();
    }

    public static int max(int x, int y, int z){      // int because returns a value
        int aux;                                     // just for this method

        if (x > y && x > z){
            aux = x;
        }
        else if (y > z){
            aux = y;
        }
        else{
            aux = z;
        }

        return aux;
    }

    public static void showResult(int print){       // void because just returns a sysout

        System.out.println("Higher = " + print);
    }
}
