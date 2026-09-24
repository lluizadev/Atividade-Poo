import java.util.Scanner;

public class questao2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        final double chocolate = 7.99; // preço do produto
        int quantidade = 0; // quantidade de produtos

        System.out.print("Quantos chocolates você deseja comprar? "); 
        quantidade = leitor.nextInt();

        double total = quantidade * chocolate;

        System.out.println("O total a ser pago é: R$ " + total);
        leitor.close();
    }
}   