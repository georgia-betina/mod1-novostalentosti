package teams;

import java.util.Scanner;

public class Exercicio_48 {
    public static void main(String[] args) {
        /* Escreva o algoritmo em FLUXOGRAMA que calcule o valor total de
        aluguel e taxas a serem cobrados de um morador. Solicite o valor do
        aluguel, o valor do condomínio, considere que o valor do metro cubico
        do gas é de R$ 1,80 e o valor da taxa de consumo de agua é de R$ 0,60
        por metro cubico de agua consumida. Apresente também o valor de 5% do
        valor total do aluguel que pode ser dado como desconto caso seja pago
        5 dias antes do vencimento. */

        System.out.printf("Insira o valor do aluguel: R$ ");
        Scanner leitor = new Scanner(System.in);
        final float valorAluguel = leitor.nextFloat();

        System.out.printf("Insira o valor do condomínio: R$ ");
        final float valorCondominio = leitor.nextFloat();

        System.out.printf("Insira a quantidade de m³ consumida de gás: ");
        final float qtdeGasConsumido = leitor.nextFloat();

        System.out.printf("Insira a quantidade de m³ consumida de água: ");
        final float qtdeAguaConsumida = leitor.nextFloat();

        leitor.close();

        final float desconta5 = 0.05f;
        double aplicaDesconto;

        final float precoM3Gas = 1.8f;
        final float precoM3Agua = 0.6f;

        double valorGastoM3Gas, valorGastoM3Agua, valorAPagar, valorComDesconto;
        valorGastoM3Gas = qtdeGasConsumido * precoM3Gas;
        valorGastoM3Agua = qtdeAguaConsumida * precoM3Agua;

        valorAPagar = valorAluguel + valorCondominio + valorGastoM3Agua + valorGastoM3Gas;
        aplicaDesconto = valorAPagar * desconta5;
        valorComDesconto = valorAPagar - aplicaDesconto;

        System.out.printf("O valor a pagar é de R$ %.2f e, caso seja pago 5 dias antes do vencimento, com 5%% de desconto será de R$ %.2f.", valorAPagar, valorComDesconto);

    }
}
