package Teams;

import java.util.Scanner;

public class ex6_16 {
    public static void main(String[] args) {
        /* Exercício 6) Construa um programa que calcule a quantidade
        * total de ração consumida por um cachorro por mês. Solicite a
        * quantidade consumida por refeição e o numero de refeições por
        * dia. */

        // ENTRADA
        System.out.println("Olá, querido usuário. Por favor, informe a quantidade de refeições que o seu cão realiza por dia:");
        Scanner leitor = new Scanner(System.in);
        final int qtderefeicoes = leitor.nextInt();

        System.out.println("Agora, informe a quantidade consumida por refeição em gramas:");
        Scanner leitor1 = new Scanner(System.in);
        final float refeicaoemgramas = leitor1.nextFloat();

        leitor.close();
        leitor1.close();

        // PROCESSAMENTO
        final float qtdepordia = qtderefeicoes * refeicaoemgramas;
        final float qtdepormes = qtdepordia * 30;

        // SAÍDA
        System.out.println(String.format("A quantidade de ração consumida por mês, em gramas, é de %.0fg.", qtdepormes));
    }
}
