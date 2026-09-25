  import java.util.Scanner; //import do Scanner

public class questao16 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        
        System.out.println("Digite o valor de sua renda do mes: ");
        double renda = leitor.nextDouble();

        if(renda >= 2500){
            System.out.println("Financiamento Aprovado!");
        }else{
            System.out.println("Financiamento Negado");
        }
        leitor.close();
    }
}