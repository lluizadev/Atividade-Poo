import java.util.Scanner;

public class questao3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
    
    System.out.println("Quanto foi o consumo de energia em kWh?");
    int consumo = leitor.nextInt();
    
    System.out.println("Qual é o valor da tarifa de energia em R$/kWh?");
    double tarifa = leitor.nextDouble();

        double total = consumo * tarifa;

    System.out.println("O total a ser pago é: R$ " + total);
        leitor.close();
    
    }

}
 