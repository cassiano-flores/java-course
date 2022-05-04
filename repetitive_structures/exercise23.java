package repetitive_structures;
import java.util.Scanner;

public class exercise23 {
    
    //how much values are in the interval of [10, 20]
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n, x, in=0, out=0;

        n = sc.nextInt();

        for (int i=0; i<n; i++){

            x = sc.nextInt();
            if (x >= 10 && x <= 20){
                in++;
            }
            else {
                out++;
            }
        }

        System.out.println(in + " in\n" + out + " out\n");

        sc.close();
    }
}
