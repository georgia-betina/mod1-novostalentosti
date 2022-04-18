package Teams;

import java.util.Scanner;

public class ex24 {
    public static void main(String[] args) {
        /*
        * Exercício 24) Faça um programa que receba o número de horas
        * trabalhadas e o valor do salário mínimo. Calcule e mostre o
        * salário a receber seguindo as regras abaixo: 
        * - A hora trabalhada vale a metade do salário mínimo;
        * - O salário bruto equivale ao número de horas trabalhas
        * multiplicado pelo valor da hora trabalhada; 
        * - O imposto equivale a 3% do salário bruto;
        * - O salário a receber equivale ao salário bruto menos o
        * imposto. 
        */

        // ENTRADAS
        System.out.println("Insira o valor do salário mínimo:");
        Scanner leitor = new Scanner(System.in);
        final float salarioMin = leitor.nextFloat();

        System.out.println("Insira o número de horas trabalhadas:");
        final int horasTrabalhadas = leitor.nextInt();

        leitor.close();

        // PROCESSAMENTO
        // primeira opção
        final double metadeSalario = salarioMin / 2;

        // segunda opção
        final double salarioBruto = (float)horasTrabalhadas * metadeSalario;

        // terceira opção
        final float imposto = 0.03f;
        final double impostoDoSalario = salarioBruto * imposto;

        // quarta opção
        final double salarioFinal = salarioBruto - impostoDoSalario;

        // SAÍDA
        System.out.println(String.format("A hora trabalhada vale a metade do salário mínimo: R$%.2f.%nO salário bruto equivale ao número de horas trabalhas multiplicado pelo valor da hora trabalhada: R$%.2f.%nO imposto equivale a 3%% do salário bruto: R$%.2f.%nO salário a receber equivale ao salário bruto menos o imposto: R$%.2f.", metadeSalario, salarioBruto, impostoDoSalario, salarioFinal));
    }
}
