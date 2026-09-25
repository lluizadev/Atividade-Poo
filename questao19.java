import java.util.Scanner;

public class questao19 {
    public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    
    double soma = 0;
    double temperatura = 0;
    
    while(temperatura != -100){
        
        System.out.print("Digite a temperatura atual (ou - 100 para sair)");
        temperatura = leitor.nextDouble();

        if(temperatura != -100){
            soma += temperatura; 
        }
       
    }

    System.out.print("A soam das temperaturas e de: "+ soma);

    leitor.close();
    }
}