package exercícios.GitHub.Estrutura_de_Decisão;

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        final int salarioMinimo2022 = 1212;
        System.out.println("Insira o valor do seu salário atual:");
        Scanner leitor = new Scanner(System.in);
        final float salario = leitor.nextFloat();

        final int n20 = 20;
        final int n10 = 10;
        final int n3 = 3;
        final double acimaSalarios20 = salarioMinimo2022 * (float)n20;
        final double acimaSalarios10 = salarioMinimo2022 * (float)n10;
        final double acimaSalarios3 = salarioMinimo2022 * (float)n3;

        final float reajusta50 = 0.5f; // menor que três salários mínimos
        final float reajusta20 = 0.2f; // entre três e dez salários mínimos
        final float reajusta15 = 0.15f; // entre dez a vinte salários mínimos
        final float reajusta10 = 0.1f; // demais
        double novoSalario = 0;

        if (salario < acimaSalarios3) {
            novoSalario = (salario * reajusta50);
            novoSalario = novoSalario + salario;
            System.out.printf("Você recebeu um reajuste de 50%%. Seu novo salário é R$ %.2f", novoSalario);
        } else if (salario > acimaSalarios3 & salario < acimaSalarios10) {
            novoSalario = (salario * reajusta20);
            novoSalario = novoSalario + salario;
            System.out.printf("Você recebeu um reajuste de 20%%. Seu novo salário é R$ %.2f", novoSalario);
        } else if (salario > acimaSalarios10 & salario < acimaSalarios20) {
            novoSalario = (salario * reajusta15);
            novoSalario = novoSalario + salario;
            System.out.printf("Você recebeu um reajuste de 15%%. Seu novo salário é R$ %.2f", novoSalario);
        } else {
            novoSalario = (salario * reajusta10);
            novoSalario = novoSalario + salario;
            System.out.printf("Você recebeu um reajuste de 10%%. Seu novo salário é R$ %.2f", novoSalario);
        }

        leitor.close();
    }
}
