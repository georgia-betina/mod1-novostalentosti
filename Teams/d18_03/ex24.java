package exercícios.Teams.d18_03;

import java.util.Scanner;

public class ex24 {
    public static void main(String[] args) {
        System.out.println("Insira o valor do salário mínimo:");
        Scanner leitor = new Scanner(System.in);
        final float salarioMin = leitor.nextFloat();

        System.out.println("Insira o número de horas trabalhadas:");
        Scanner leitor1 = new Scanner(System.in);
        final int horasTrabalhadas = leitor1.nextInt();

        leitor.close();
        leitor1.close();

        // PRIMEIRA OPÇÃO
        final double metadeSalario = salarioMin / 2;

        // SEGUNDA OPÇÃO
        final double salarioBruto = (float)horasTrabalhadas * metadeSalario;

        // TERCEIRA OPÇÃO
        final float imposto = 0.03f;
        final double impostoDoSalario = salarioBruto * imposto;

        // QUARTA OPÇÃO
        final double salarioFinal = salarioBruto - impostoDoSalario;

        System.out.println(String.format("A hora trabalhada vale a metade do salário mínimo: R$%.2f.%nO salário bruto equivale ao número de horas trabalhas multiplicado pelo valor da hora trabalhada: R$%.2f.%nO imposto equivale a 3%% do salário bruto: R$%.2f.%nO salário a receber equivale ao salário bruto menos o imposto: R$%.2f.", metadeSalario, salarioBruto, impostoDoSalario, salarioFinal));
    }
}
