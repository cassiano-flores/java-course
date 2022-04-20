import java.util.Scanner;

public class exercise13 {
    
    //with a menu, returns the value of 'x' items
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int codigo, quantidade;
        double total, preco = 0;

        System.out.println("CODIGO     ESPECIFICACAO       PRECO \n" +
                              "1          Cachorro Quente     R$ 4,00 \n" +
                              "2          X-Salada            R$ 4,50 \n" +
                              "3          X-Bacon             R$ 5,00 \n" +
                              "4          Torrada Simples     R$ 2,00 \n" +
                              "5          Refrigerante        R$ 1,50 \n");
        
        System.out.println("Digite o codigo: ");
        codigo = sc.nextInt();

        System.out.println("Digite a quantidade: ");
        quantidade = sc.nextInt();

        if (codigo == 1){
            preco = 4.00;
        }
        else if (codigo == 2){
            preco = 4.50;
        }
        else if (codigo == 3){
            preco = 5.00;
        }
        else if (codigo == 4){
            preco = 2.00;
        }
        else if (codigo == 5){
            preco = 1.50;
        }
        else{
            System.out.println("Sem estoque");
        }

        total = preco * quantidade;

        System.out.printf("Total: R$ %.2f\n", total);

        sc.close();
    }
}
