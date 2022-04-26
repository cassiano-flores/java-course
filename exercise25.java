import java.util.Locale;
import java.util.Scanner;

public class exercise25 {

    //inform a number to repeat and n pairs numbers, to divide the first one for the second
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double x, y;
        
        int n = sc.nextInt();

        for (int i=0; i<n; i++){

            x = sc.nextInt();
            y = sc.nextInt();

            if (y == 0){
                System.out.println("\nDivisao impossivel\n");
            }
            else{
                System.out.println("\n" + x/y + "\n");
            }

        }

        sc.close();
    }
}