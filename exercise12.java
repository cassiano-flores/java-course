import java.util.Scanner;

public class exercise12 {
    
    //returns the duration of a game
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int horaIncial, horaFinal, duracao;

        System.out.println("Digite a hora inicial");
        horaIncial = sc.nextInt();

        System.out.println("Digite a hora final");
        horaFinal = sc.nextInt();

        if (horaIncial<horaFinal){
            duracao = horaFinal - horaIncial;
        }
        else{
            duracao = (24 - horaIncial) + horaFinal;
        }
        
        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

        sc.close();
    }
}
