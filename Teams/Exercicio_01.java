package Teams;
import java.util.Scanner;

public class Exercicio_01 {
    public static void main(String[] args) {
        /*
        Exercício 1) Faça um programa que solicite o número de horas
        * que um trabalhador realiza por dia, solicite o número de dias
        * trabalhados em um mês e apresente o número total de horas
        * trabalhadas no mês.
        */

        // ENTRADAS
        System.out.println("Olá, querido usuário. Por favor, digite o número de horas que você trabalha por dia:");
        Scanner leitor = new Scanner(System.in);
        final int numhoras = leitor.nextInt();

        System.out.println("Agora, digite o número de dias trabalhados por mês:");
        Scanner leitor1 = new Scanner(System.in);
        final int numdias = leitor1.nextInt();

        leitor.close();
        leitor1.close();

        // PROCESSAMENTO
        final int numtotal = numhoras * numdias;

        // SAÍDA
        System.out.println(String.format("O número total de horas trabalhadas no mês é %dh.", numtotal));
    }
}
