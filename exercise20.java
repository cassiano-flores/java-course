import java.util.Scanner;

public class exercise20 {
    
    //algorithm to count which fuel is most requested at a gas station
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int codigo, alcool = 0, gasolina = 0, diesel = 0;

        codigo = sc.nextInt();
    
        while (codigo != 4){
            if (codigo == 1){
                alcool++;
            }
            else if (codigo == 2){
                gasolina++;
            }
            else if (codigo == 3){
                diesel++;
            }

            codigo = sc.nextInt();
        }

        System.out.println("MUITO OBRIGADO \nAlcool: " + alcool + "\nGasolina: " + gasolina + "\nDiesel: " + diesel);

        sc.close();
    }
}
