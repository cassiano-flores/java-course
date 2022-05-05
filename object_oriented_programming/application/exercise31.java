package object_oriented_programming.application;
import java.util.Locale;
import java.util.Scanner;

public class exercise31 {

    //class without methods, the exercise32 is with methods
    public static void main(String[] args) {
    
       Locale.setDefault(Locale.US);
       Scanner sc = new Scanner(System.in);
       double ladoX1, ladoX2, ladoX3, ladoY1, ladoY2, ladoY3, p1, p2, areaX, areaY;
       String larger;

       System.out.println("Digite as medidas do triangulo X: ");
       ladoX1 = sc.nextDouble();
       ladoX2 = sc.nextDouble();
       ladoX3 = sc.nextDouble();

       System.out.println("Digite as medidas do triangulo Y: ");
       ladoY1 = sc.nextDouble();
       ladoY2 = sc.nextDouble();
       ladoY3 = sc.nextDouble();

       p1 = (ladoX1 + ladoX2 + ladoX3) / 2;
       p2 = (ladoY1 + ladoY2 + ladoY3) / 2;

       areaX = Math.sqrt(p1*(p1 - ladoX1)*(p1 - ladoX2)*(p1 - ladoX3));
       areaY = Math.sqrt(p2*(p2 - ladoY1)*(p2 - ladoY2)*(p2 - ladoY3));

       if (areaX > areaY){
           larger = "X";
       }
       else if (areaY > areaX){
           larger = "Y";
       }
       else{
           larger = "Medidas iguais";
       }

       System.out.printf("Area triangulo X: %.4f\n", areaX);
       System.out.printf("Area triangulo Y: %.4f\n", areaY);
       System.out.println("Maior area: " + larger);

       sc.close();
    }
}
