import java.util.Scanner;

public class questao17 {
    public static void main(String[] args) {
        Scanner leitorScanner = new Scanner(System.in);

        String [] mes = {"janeiro","fevereiro","março","abril","maio","junho","julho","agosto","setembro","outubro","novembro","dezembro"};
        int opc;

        for (int idx = 0; idx < mes.length; idx++) {

            System.out.println("Digite um valor de 1 ate 12 referente ao mes");
            int mes_Escolhido = leitorScanner.nextInt();

            switch (mes_Escolhido) {
                case 1:
                    System.out.print(mes[0]);
                    break;
                case 2:
                    System.out.print(mes[1]);
                    break;
                case 3:
                    System.out.print(mes[2]);
                    break;
                case 4:
                    System.out.print(mes[3]);
                    break;
                case 5:
                    System.out.print(mes[4]);
                    break;
                case 6:
                    System.out.print(mes[5]);
                    break;
                case 7:
                    System.out.print(mes[6]);
                    break;
                case 8:
                    System.out.print(mes[7]);
                    break;
                case 9:
                    System.out.print(mes[8]);
                    break;
                case 10:
                    System.out.print(mes[9]);
                    break;
                case 11:
                   System.out.print(mes[10]); 
                    break;
                case 12:
                    System.out.print(mes[11]);
                    break;
                default:
                    System.out.print("Numero digitado invalido");
            }
            leitorScanner.close();
break;
        }
    }
}