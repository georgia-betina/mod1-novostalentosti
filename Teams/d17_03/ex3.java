package exercícios.Teams.d17_03;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        System.out.println("Insira o valor do seu salário:");
        Scanner leitor = new Scanner(System.in);
        final float salario = leitor.nextFloat();

        System.out.println("Insira o valor total das suas vendas:");
        Scanner leitor1 = new Scanner(System.in);
        final float vendas = leitor1.nextFloat();
        leitor.close();
        leitor1.close();

        double comissao = vendas * 0.04;

        double salariofinal = salario + comissao;

        System.out.println(String.format("O salário inicial é de R$ %.2f, o valor das comissões é de R$ %.2f e o salário final é R$ %.2f.", salario, comissao, salariofinal));
    }
}
