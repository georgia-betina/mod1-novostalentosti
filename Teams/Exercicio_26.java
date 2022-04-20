package teams;

import java.util.Scanner;

public class Exercicio_26 {
    public static void main(String[] args) {
        /*
        * Exercício 26) Sabe-se que o quilowatt de energia custa um quinto do
        * salário mínimo. Faça um programa que receba o valor do salário mínimo
        * e a quantidade de quilowatts consumida por uma residência. Calcule e
        * mostre:
        * - O valor em reais de cada quilowatt
        * - O valor em reais a ser pago por essa residência
        * - O valor em reais a ser pago com desconto de 15%
        */

        // ENTRADAS
        System.out.println("Informe o valor do salário mínimo:");
        Scanner leitor = new Scanner(System.in);
        final float salarioMin = leitor.nextFloat();

        System.out.println("Informe o consumo em quilowatts:");
        final float consumo = leitor.nextFloat();

        leitor.close();

        // PROCESSAMENTO
        final double valordQw = salarioMin / 5;
        final double valorpPagar = valordQw * consumo;
        final float desconto = 0.15f;
        double valorcDesconto = valorpPagar * desconto;
        valorcDesconto = valorpPagar - valorcDesconto;

        // SAÍDA
        System.out.println(String.format("O valor de cada quilowatt é R$%.2f;%nO valor em reais a ser pago é R$%.2f;%nO valor em reais a ser pago com desconto de 15%% é R$%.2f.", valordQw, valorpPagar, valorcDesconto));

    }
}
