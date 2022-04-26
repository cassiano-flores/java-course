import java.util.Scanner;

public class exercise26 {
 
    //returns the factorial of a number
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n, fatorial=1;

        n = sc.nextInt();

        for (int i=0; i<n; i++){

            fatorial = fatorial * (n-i);
        }

        if (n<0){
            System.out.println("Nao existe");
        }
        else{
           System.out.println(fatorial);
        }
        
        sc.close();
    }
}
