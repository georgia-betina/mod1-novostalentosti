package teams;

import java.util.Scanner;

public class Exercicio_21 {
    public static void main(String[] args) {
        /*
        * Exercício 21) Faça um programa que receba o salário de
        * um funcionário e o percentual de aumento, calcule e
        * mostre o valor do aumento e o novo salário. 
        */

        // ENTRADAS
        System.out.println("Insira o valor do salário:");
        Scanner leitor = new Scanner(System.in);
        final float salario = leitor.nextFloat();

        System.out.println("Insira o percentual de aumento (número inteiro):");
        final int percAumento = leitor.nextInt();
        leitor.close();

        // PROCESSAMENTO
        final float percTransforma = (float)percAumento / 100;
        final double salarioAumento = percTransforma * salario;

        final double salarioFinal = salario + salarioAumento;

        // SAÍDA
        System.out.println(String.format("O valor do aumento é R$ %.2f.%nO novo salário é R$ %.2f.", salarioAumento, salarioFinal));

    }
}
