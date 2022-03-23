package Teams.d16_03;

import java.util.Scanner;

public class ex7_16 {
    public static void main(String[] args) {
        // 7) Faça um programa que calcule o valor da multa por atraso de pagamento de um boleto bancário. Solicite o valor do boleto e o percentual de multa.

        // ENTRADA
        System.out.println("Olá, querido usuário. Por favor, informe o valor do boleto em atraso:");
        Scanner leitor = new Scanner(System.in);
        final float valboleto = leitor.nextFloat();

        System.out.println("Agora, informe o percentual da multa:");
        Scanner leitor1 = new Scanner(System.in);
        final int multa = leitor.nextInt();

        leitor.close();
        leitor1.close();

        // PROCESSAMENTO
        final float valmulta = ((float)multa / 100) * valboleto;

        // SAÍDA
        System.out.println(String.format("O valor da multa é R$ %.2f.", valmulta));
    }
}
