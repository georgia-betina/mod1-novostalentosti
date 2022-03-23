package exercícios.GitHub.Estrutura_de_Decisão;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        System.out.println("Informe o valor do empréstimo:");
        Scanner leitor = new Scanner(System.in);
        final float valorEmprestimo = leitor.nextFloat();

        System.out.println("Informe o número de parcelas:");
        final float numeroParcelas = leitor.nextFloat();

        System.out.println("Informe o valor do seu salário:");
        final float valorSalario = leitor.nextFloat();

        leitor.close();

        final double valorDasParcelas = valorEmprestimo / numeroParcelas;
        final float porcentagem = 0.3f;

        final double regraDos30 = valorSalario * porcentagem;

        if (valorDasParcelas > regraDos30) {
            System.out.printf("O seu empréstimo foi REPROVADO devido ao valor das parcelas (R$ %.2f) ser maior que 30%% do seu salário (R$ %.2f)", valorDasParcelas, regraDos30);
        } else if (valorDasParcelas < regraDos30) {
            System.out.printf("O seu empréstimo foi APROVADO devido ao valor das parcelas (R$ %.2f) ser menor que 30%% do seu salário (R$ %.2f)", valorDasParcelas, regraDos30);
        }
    }
}
