import java.util.Scanner;

public class questao6 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

    System.out.println("Qual a capaciade do tanque de combustivel: ");
        int capacidadeCombustivel = leitor.nextInt();
    
    System.out.println("Qual a quantidade de combustivel no tanque: ");
        int quantidadeCombustivel = leitor.nextInt();

        int quantidadeCombustivelPrecisa = capacidadeCombustivel - quantidadeCombustivel;

    System.out.println("A quantidade de combustivel que precisa ser abastecida é: " + quantidadeCombustivelPrecisa + " litros");
    
        leitor.close();
        
       }
    }