package teams;

import java.util.Scanner;

public class Exercicio_22 {
    public static void main(String[] args) {
        /*
        * Exercício 22) Faça um programa que receba o salário-base de
        * um funcionário, calcule e mostre o seu salário a receber,
        * sabendo-se que esse funcionário tem gratificação de R$ 50,00
        * e paga imposto de 10% sobre o salário-base. 
        */

        // ENTRADA
        System.out.println("Informe o seu salário-base:");
        Scanner leitor = new Scanner(System.in);
        final float salario = leitor.nextFloat();
        leitor.close();

        // PROCESSAMENTO
        final int gratificacao = 50;
        final float imposto = 0.1f;

        double impostoRetira = (salario * imposto);
        impostoRetira = salario - impostoRetira;

        final double salarioFinal = impostoRetira + (float)gratificacao;

        // SAÍDA
        System.out.println(String.format("O valor do salário final será R$ %.2f.", salarioFinal));
    }
}
