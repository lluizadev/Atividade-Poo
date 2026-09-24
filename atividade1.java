import java.util.Scanner; //import da blioteca para captura os imputs

public class atividade1 { //nome tem que ser o msm nome do arquivo
    public static void main(String[]args){ //funcao principal do java 

       // System.out.println("Hello World");

        //Deve Iniciar a chamada da scanner para que ele possa caputar os dados do teclado
        Scanner leitor = new Scanner(System.in); //funcao importada da biblioteca, para captura a leitura 

        //Executa a caputa dos dados
        System.out.print("Digite seu nome: ");
    
        String nome = leitor.nextLine(); //nextLine lê textos 

        System.out.print("Digite a sua idade: "); 
        
        int idade = leitor.nextInt();

        //Em java a concatenaçao e feito por meio de + 
        System.out.println("Bem vindo(a), " + nome + " Voçê tem: " + idade + " Anos");

        leitor.close(); //Lembrar de fechar o Scanner no final

    }
}