package Teams;

import java.util.Scanner;

public class Exercicio_10 {
    public static void main(String[] args) {
        /*
        * Exercício 10) Um funcionário recebe um salário fixo mais
        * 4% de comissão sobre as vendas. Faça um programa que receba
        * o salário fixo do funcionário e o valor de suas vendas,
        * calcule e mostre a comissão e seus salário final.
        */

        // ENTRADAS
        System.out.println("Insira o valor do seu salário:");
        Scanner leitor = new Scanner(System.in);
        final float salario = leitor.nextFloat();

        System.out.println("Insira o valor total das suas vendas:");
        final float vendas = leitor.nextFloat();
        leitor.close();

        // PROCESSAMENTO
        double comissao = vendas * 0.04;
        double salariofinal = salario + comissao;

        // SAÍDA
        System.out.println(String.format("O salário inicial é de R$ %.2f, o valor das comissões é de R$ %.2f e o salário final é R$ %.2f.", salario, comissao, salariofinal));
    }
}
