package repetitive_structures;
import java.util.Scanner;

public class exercise28 {
    
    //returns the double and triple of n numbers
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i=1; i<=n; i++){

            System.out.print(i + " ");
            System.out.print(i*i + " ");
            System.out.println(i*i*i + " ");

            //System.out.print(Math.pow(i, 2) + " ");
            //System.out.println(Math.pow(i, 3) + " ");
        }

        sc.close();
    }
}
