import java.util.Scanner;

public class questao9 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

    System.out.println("Qual a sua idade: ");
        int idade = leitor.nextInt();

    System.out.println("Possui o cartão de sócio do cinema? (true/false): ");
        boolean cartao = leitor.nextBoolean();

    if (idade >= 60 || cartao == true) {
        System.out.println("Você tem direito a desconto no cinema!");
    } else {
        System.out.println("Você não tem direito a desconto no cinema.");
    }

        leitor.close();
    }
}