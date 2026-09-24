import java.util.Scanner;

public class questao4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
    
    System.out.println("Qual o valor da compra: ");
    double valorCompra = leitor.nextDouble();

    System.out.println("Qual o valor dado pelo cliente: ");
    double valorPago = leitor.nextDouble();

    double troco = valorPago - valorCompra;

    System.out.println("O troco a ser devolvido é R$ " + troco);
        leitor.close();

    }
}
