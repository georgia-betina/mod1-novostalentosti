package teams;

import java.util.Scanner;

public class Exercicio_35 {
    public static void main(String[] args) {
        System.out.printf("Informe o valor de fábrica do automóvel: R$ ");
        Scanner leitor = new Scanner(System.in);
        final float valorFabrica = leitor.nextFloat();

        System.out.printf("Informe o percentual do lucro: ");
        final int percentualLucro = leitor.nextInt();

        System.out.printf("Informe o percentual de impostos: ");
        final int percentualImpostos = leitor.nextInt();

        final int porcentagem = 100;
        double aplicaLucro = percentualLucro / (float)porcentagem;
        double aplicaImpostos = percentualImpostos / (float)porcentagem;
        double valorFinal;

        aplicaLucro = valorFabrica * aplicaLucro;
        aplicaImpostos = valorFabrica * aplicaImpostos;

        valorFinal = valorFabrica + aplicaImpostos + aplicaLucro;

        System.out.printf("%nO valor correspondente ao lucro é R$ %.2f%nO valor correspondente aos impostos é R$ %.2f%nO valor final do carro é R$ %.2f", aplicaLucro, aplicaImpostos, valorFinal);

        leitor.close();
    }
}
