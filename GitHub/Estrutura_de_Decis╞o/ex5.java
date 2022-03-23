package exercícios.GitHub.Estrutura_de_Decisão;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        System.out.println("Informe o valor do empréstimo:");
        Scanner leitor1 = new Scanner(System.in);
        final float valorEmprestimo = leitor1.nextFloat();

        System.out.println("Informe o número de parcelas:");
        Scanner leitor2 = new Scanner(System.in);
        final float numeroParcelas = leitor2.nextFloat();

        System.out.println("Informe o valor do seu salário:");
        Scanner leitor3 = new Scanner(System.in);
        final float valorSalario = leitor3.nextFloat();

        leitor1.close();
        leitor2.close();
        leitor3.close();

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
