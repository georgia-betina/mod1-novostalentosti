package Teams;

import java.util.Scanner;

public class Exercicio_07 {
    public static void main(String[] args) {
        /*
        * Exercício 7) Faça um programa que calcule o valor da multa
        * por atraso de pagamento de um boleto bancário. Solicite o
        * valor do boleto e o percentual de multa.
        */

        // ENTRADAS
        System.out.println("Olá, querido usuário. Por favor, informe o valor do boleto em atraso:");
        Scanner leitor = new Scanner(System.in);
        final float valboleto = leitor.nextFloat();

        System.out.println("Agora, informe o percentual da multa:");
        final int multa = leitor.nextInt();

        leitor.close();

        // PROCESSAMENTO
        final float valmulta = ((float)multa / 100) * valboleto;

        // SAÍDA
        System.out.println(String.format("O valor da multa é R$ %.2f.", valmulta));
    }
}
