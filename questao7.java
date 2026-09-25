import java.util.Scanner;

public class questao7 {
    public static void main(String[] args) {
        Scanner T = new Scanner(System.in);
    
        final double taxa = 6.0;
        double valor_Final;
        
        System.out.print("Informe o valor do pedido: ");
        double pedido = T.nextDouble(); 

        valor_Final = taxa + pedido;

        System.out.print("O valor final da sua compra foi de: "+valor_Final);

        T.close();
    }    
}