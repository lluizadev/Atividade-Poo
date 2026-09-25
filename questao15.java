import java.util.Scanner;

public class questao15 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o horario do seu voo");
        int horario = leitor.nextInt();

        String voo = (horario >= 6 && horario <= 18) ? " Diurno " : " noturno ";
        System.out.print(voo);
    }
}