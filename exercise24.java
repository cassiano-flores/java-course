import java.util.Locale;
import java.util.Scanner;

public class exercise24 {
    
    //inform how much times do you want to calculate the weighted average, and informs 3 numbers to the average
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double media, x, y, z;

        int n = sc.nextInt();

        for (int i=0; i<n; i++){

            x = sc.nextDouble();
            y = sc.nextDouble();
            z = sc.nextDouble();

            media = ((x*2.0) + (y*3.0) + (z*5.0)) / 10.0;

            System.out.printf("%.1f\n", media);
        }

        sc.close();
    }
}
