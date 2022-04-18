package teams;

import java.util.Scanner;

public class Exercicio_75 {
    public static void main(String[] args) {
        /* 75) Faça um programa que receba a idade
        de 15 pessoas e que calcule e mostre:

        - A quantidade de pessoas em cada faixa etária
        - A percentagem de pessoas em cada uma das faixas
        etárias, com relação ao total de pessoas, de
        acordo com a tabela abaixo:
        
        --------------+-----------------------------------
        Faixa Etária  | Idade
        --------------+-----------------------------------
        1             | Até 15 anos
        2             | De 16 a 30 anos
        3             | De 31 a 45 anos
        4             | De 46 a 60 anos
        5             | Acima de 61 anos
        --------------+----------------------------------- */

        int idade = 0;
        int contaFaixaEtaria1 = 0;
        int contaFaixaEtaria2 = 0;
        int contaFaixaEtaria3 = 0;
        int contaFaixaEtaria4 = 0;
        int contaFaixaEtaria5 = 0;

        Scanner leitor = new Scanner(System.in);

        for (int i = 1; i <=15; i++) {
            System.out.printf("Pessoa %d, informe a sua idade: ", i);
            idade = leitor.nextInt();

            if (idade == 0) {
                System.out.printf("Valor inválido.");
            } else if (idade <= 15) {
                contaFaixaEtaria1++;
            } else if (idade >= 16 && idade <= 30) {
                contaFaixaEtaria2++;
            } else if (idade >= 31 && idade <= 45) {
                contaFaixaEtaria3++;
            } else if (idade >= 46 && idade <= 60) {
                contaFaixaEtaria4++;
            } else if (idade >= 61) {
                contaFaixaEtaria5++;
            }
        }
        leitor.close();

        float percentualFaixa1 = (contaFaixaEtaria1 * (float)100) / 15;
        float percentualFaixa2 = (contaFaixaEtaria2 * (float)100) / 15;
        float percentualFaixa3 = (contaFaixaEtaria3 * (float)100) / 15;
        float percentualFaixa4 = (contaFaixaEtaria4 * (float)100) / 15;
        float percentualFaixa5 = (contaFaixaEtaria5 * (float)100) / 15;

        System.out.printf("Existem %d pessoas na faixa etária 1;%n%d pessoas na faixa etária 2;%n%d pessoas na faixa etária 3;%n%d pessoas na faixa etária 4%n%d pessoas na faixa etária 5.%n%nO percentual de pessoas na faixa etária 1 é %.1f%%, na faixa 2 %.1f%%, na faixa 3 %.1f%%, na faixa 4 %.1f%% e na faixa 5 %.1f%%.", contaFaixaEtaria1, contaFaixaEtaria2, contaFaixaEtaria3, contaFaixaEtaria4, contaFaixaEtaria5, percentualFaixa1, percentualFaixa2, percentualFaixa3, percentualFaixa4, percentualFaixa5);
    }
}
