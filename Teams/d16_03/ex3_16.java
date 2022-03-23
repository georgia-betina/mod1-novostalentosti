package Teams.d16_03;

import java.util.Scanner;

public class ex3_16 {
    public static void main(String[] args) {
        // 3) Faça um programa que calcule o valor de reembolso de despesas de combustível de um funcionário. Considere que o carro tem o consumo de 1 litro de gasolina a cada 13km rodado. E o preço do litro de gasolina é de R$ 2,20.

        // ENTRADA
        System.out.println("Olá, querido usuário. Por favor, insira o número de km rodados neste mês:");
        Scanner leitor = new Scanner(System.in);
        final float numkm = leitor.nextFloat();
        leitor.close();

        // PROCESSAMENTO
        final double valreembolso = ((numkm / 13) * 2.2);

        // SAÍDA
        System.out.println(String.format("O valor do reembolso do mês atual será de R$ %.2f.", valreembolso));
    }
}
