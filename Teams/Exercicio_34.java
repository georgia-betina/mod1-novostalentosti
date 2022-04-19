package teams;

import java.util.Scanner;

public class Exercicio_34 {
    public static void main(String[] args) {
        /*
        * Exercício 34) Faça um programa que receba o salário-base de um
        * funcionário, calcule e mostre o salário a receber, sabendo-se
        * que esse funcionário tem gratificação de 5% sobre o salário-
        * base e paga imposto de 7% sobre o salário-base.
        */

        System.out.printf("Informe o valor do seu salário: R$ ");
        Scanner leitor = new Scanner(System.in);
        final float salarioBase = leitor.nextFloat();

        leitor.close();

        final float gratificacao = 0.05f;
        final float imposto = 0.07f;

        double aplicaGratificacao, aplicaImposto, salarioFinal;

        aplicaGratificacao = salarioBase * gratificacao;
        aplicaImposto = salarioBase * imposto;

        salarioFinal = salarioBase + aplicaGratificacao - aplicaImposto;

        System.out.printf("O seu salário será R$ %.2f", salarioFinal);
    }
}
