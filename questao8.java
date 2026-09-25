import java.util.Scanner;

public class questao8 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
   
    int limiteVelocidade = 80;
    
    System.out.println("Qual a velocidade do carro: ");
        int velocidadeCarro = leitor.nextInt();
    
    boolean acimaVelocidade = velocidadeCarro > limiteVelocidade;
    
    if (acimaVelocidade) {
        System.out.println("O carro está acima da velocidade permitida, a multa será aplicada");
    } else {
        System.out.println("O carro está dentro da velocidade permitida, não será aplicada multa");
    }
    
        leitor.close();
    
    }
}
