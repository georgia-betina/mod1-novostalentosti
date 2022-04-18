package teams;

import java.util.Scanner;

public class Exercicio_51 {
    public static void main(String[] args) {
        /* Faça um programa que receba o número de horas trabalhadas,
        o valor do salário mínimo e o número de horas extras trabalhadas.
        Calcule e mostre o salário a receber seguindo as regras abaixo:
        a) a hora trabalhada vale 1/8 do salário mínimo;
        b) a hora extra vale ¼ do salário mínimo;
        c) o salário bruto equivale ao número de horas trabalhadas
        multiplicado pelo valor da hora trabalha (apresente o valor para o usuário);
        d) a quantia a receber pelas horas extras equivale ao número de horas
        extras trabalhadas multiplicado pelo valor da hora extra(apresente o valor
        para o usuário);
        e) o salário a receber equivale ao salário bruto mais a quantia a receber
        pelas horas extras(apresente o valor para o usuário);
        */

        System.out.printf("Informe o número de horas trabalhadas: ");
        Scanner leitor = new Scanner(System.in);
        final int horasTrabalhadas = leitor.nextInt();

        System.out.printf("Informe o número de horas extras trabalhadas: ");
        final int horasExtras = leitor.nextInt();

        System.out.printf("Informe o valor do salário mínimo: R$ ");
        final float valorSalarioMinimo = leitor.nextFloat();
        leitor.close();

        final double valorHoraTrabalhada = (0.125f * valorSalarioMinimo);
        final double valorHoraExtra = (0.25f * valorSalarioMinimo);

        final double salarioBruto = valorHoraTrabalhada * (float)horasTrabalhadas;
        System.out.printf("O valor do salário bruto é de R$ %.2f.", salarioBruto);

        final double quantiaHorasExtras = valorHoraExtra * (float)horasExtras;
        System.out.printf(" O valor das horas extras equivale a R$ %.2f.", quantiaHorasExtras);

        final double salarioFinal = salarioBruto + quantiaHorasExtras;
        System.out.printf(" O valor do salário final é de R$ %.2f.", salarioFinal);
    }
}
