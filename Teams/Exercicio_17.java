package Teams;

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        /*
        * Exercício 17) João recebeu seu salário e precisa pagar duas
        * contas atrasadas. Em razão do seu atraso, ele deverá pagar
        * multa de 2% sobre cada conta. Faça um programa que calcule
        * e mostre quanto restará do salário de João.
        */

        // ENTRADAS 
        System.out.println("Informe o valor do seu salário:");
        Scanner leitor = new Scanner(System.in);
        final float salario = leitor.nextFloat();

        System.out.println("Informe o valor da primeira conta atrasada:");
        final float conta1 = leitor.nextFloat();

        System.out.println("Informe o valor da segunda conta atrasada:");
        final float conta2 = leitor.nextFloat();

        leitor.close();

        // PROCESSAMENTO
        final float multa = 0.02f;
        double atrasoconta1 = conta1 * multa;
        atrasoconta1 = conta1 + atrasoconta1;

        double atrasoconta2 = conta2 * multa;
        atrasoconta2 = conta2 + atrasoconta2;

        final double resto = salario - atrasoconta1 - atrasoconta2;

        // SAÍDA
        System.out.println(String.format("O resto será R$ %.2f.", resto));
    }
}
