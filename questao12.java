import java.util.Scanner;

public class questao12 {
    public static void main(String[] args) {
      Scanner leitor = new Scanner (System.in);
       
     System.out.println("Qual o valor da compra: "); 
     double valorCompra = leitor.nextDouble();
     
        valorCompra -= valorCompra * 0.10;
       
     System.out.println("O valor da compra com desconto: R$ " + valorCompra);

        leitor.close();
    }
}