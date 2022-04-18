package Teams.d28_03;

import java.util.Scanner;

public class Exercicio_47 {
    public static void main(String[] args) {
        /* Escreva um algoritmo que calcule o valor de Imposto
        de Renda que uma Pessoa Física deve pagar de acordo com
        o valor total de seu rendimento anual: abaixo de R$19.200
        isento, acima deste valor e até R$30.000 8%. Mais que
        R$30.000 anuais 11%. */

        System.out.printf("Informe o valor do seu rendimento anual: R$ ");
        Scanner leitor = new Scanner(System.in);
        final float valorRendimento = leitor.nextFloat();
        leitor.close();

        final float taxa8 = 0.08f;
        final float taxa11 = 0.11f;
        double aplicaTaxa;

        if (valorRendimento < 19200) {
            System.out.printf("Você está isento de declarar o Imposto de Renda.");
        } else if (valorRendimento >= 19200 && valorRendimento <= 30000) {
            aplicaTaxa = valorRendimento * taxa8;
            System.out.printf("Você precisa pagar R$ %.2f.", aplicaTaxa);
        } else if (valorRendimento > 30000) {
            aplicaTaxa = valorRendimento * taxa11;
            System.out.printf("Você precisa pagar R$ %.2f.", aplicaTaxa);
        }
    }
}
