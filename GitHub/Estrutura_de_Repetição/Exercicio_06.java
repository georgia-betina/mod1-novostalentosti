package GitHub.Estrutura_de_Repetição;

import java.util.Scanner;

public class Exercicio_06 {
    public static void main(String[] args) {
        /*
        * Exercício 06) Faça um programa que receba um valor que foi depositado
        * na poupança e exiba o valor com rendimento mês a mês durante o período
        * de um ano. Considere fixo o juros da poupança em 0,5% a. m.
        */
        String listaMeses[] = new String[]{"janeiro", "fevereiro", "março", "abril", "maio", "junho", "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"};
        Scanner leitor = new Scanner(System.in);
        double valorPoupança = 0;
        System.out.printf("Informe o valor depositado na poupança: R$ ");
        valorPoupança = leitor.nextDouble();

        final float jurosDaPoupanca = 0.5f;
        double aplicaJuros;

        for (int i = 0; i < 12; i++) {
            aplicaJuros = valorPoupança * jurosDaPoupanca;
            valorPoupança += aplicaJuros;
            System.out.printf("O rendimento do mês de %s é de R$ %.2f.\n", listaMeses[i], aplicaJuros);
        }

        leitor.close();
    }
}
