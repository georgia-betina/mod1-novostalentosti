package exercícios.GitHub.Estrutura_de_Decisão;

import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        System.out.println("Informe o número de horas trabalhadas no mês:");
        Scanner leitor = new Scanner(System.in);
        final int horasTrabalhadas = leitor.nextInt();

        System.out.println("Informe o valor ganhado por hora trabalhada:");
        final float valorHora = leitor.nextFloat();

        final int horasRegular = 160; // 40h por semana, 4 semanas
        final double valorHorasRegular = valorHora * horasRegular;
        double salario = 0;

        if (horasTrabalhadas > horasRegular) {
            final float acrescimo = 0.5f;
            int horasExtras = horasTrabalhadas - horasRegular;
            double valorHorasExtras = (valorHora * acrescimo) + valorHora;

            valorHorasExtras = horasExtras * valorHorasExtras;
            salario = valorHorasRegular + valorHorasExtras;

            System.out.printf("O valor do salário será de R$ %.2f, devido ao acréscimo de R$ %.2f pelas horas extras trabalhadas.", salario, valorHorasExtras);
        } else if (horasTrabalhadas <= horasRegular) {
            salario = valorHorasRegular;
            System.out.printf("O valor do salário será de R$ %.2f.", salario);
        }

        leitor.close();
    }
}
