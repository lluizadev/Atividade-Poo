import java.util.Scanner;

public class questao5 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

    System.out.println("Qual o valor do aluguel: ");
        double valorAluguel = leitor.nextDouble();

    System.out.println("Qual o numero de colegas que compartilham o aluguel: ");
        int numeroColegas = leitor.nextInt();

    double valorPorColega = valorAluguel / numeroColegas;

    System.out.println("Cada colega deve pagar R$ " + valorPorColega);
    
        leitor.close();
    
      }
 }
