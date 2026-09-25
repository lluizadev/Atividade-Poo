import java.util.Scanner;

public class questao11 {
    public static void main(String[] args) {
      Scanner leitor = new Scanner (System.in);
       
     System.out.println("Qual o saldo do cartão: "); 
     double saldoCartao = leitor.nextDouble();
     
     System.out.println("Saldo antes da recarga: R$ " + saldoCartao);
        
        saldoCartao += 20;
       
     System.out.println("Seu novo saldo é: R$ " + saldoCartao);

        leitor.close();
    }
}