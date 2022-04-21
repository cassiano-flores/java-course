import java.util.Scanner;

public class exercise19 {
    
    //while x or y are not equal to 0, the program informs which quadrant they belong
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int x, y;

        System.out.println("Digite a coordenada X: ");
        x = sc.nextInt();
        System.out.println("Digite a coordenada Y: ");
        y = sc.nextInt();

        while (x != 0 && y != 0){
            if (x > 0 && y > 0){
                System.out.println("Primeiro quadrante");
            }
            else if (x > 0 && y < 0){
                System.out.println("Quarto quadrante");
            }
            else if (x < 0 && y > 0){
                System.out.println("Segundo quadrante");
            }
            else{
                System.out.println("Terceiro quadrante");
            }

            System.out.println("Digite outra coordenada X: ");
            x = sc.nextInt();
            System.out.println("Digite outra coordenada Y: ");
            y = sc.nextInt();
        }

        sc.close();
    }
}
