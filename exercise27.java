import java.util.Scanner;

public class exercise27 {

    //returns all the divisors of a number
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i=1; i<=n; i++){

            if (n%i == 0){
                System.out.println(i);
            }
        }

        sc.close();
    }
}