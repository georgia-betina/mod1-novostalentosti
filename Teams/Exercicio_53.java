package teams;

import java.util.Scanner;

public class Exercicio_53 {
    public static void main(String[] args) {
        /* Faça um UNICO programa em que receba o nome, o salário-base
        e o tempo de serviço de um funcionário. 
 
        Calcule e mostre TODOS os item abaixo em um UNICO PROGRAMA:
        a. O imposto que esta na tabela a seguir:
 
        Salário Base                                         |   % de imposto sobre Salário Base
        -----------------------------------------------------+----------------------------------------
        Menor R$200,00 (inclusive)                           |             Isento
        Maior que R$200,00 até R$ 450,00 (inclusive)         |             3%
        Entre R$450,00 e R$ 700,00                           |             8%
        Igual a R$ 700,00                                    |             10%
        Maior que R$ 700,00                                  |             12%
        */

        /* 
        b. A Gratificação conforme a tabela a seguir:
        Salário Base                    |Tempo de Serviço                   |Gratificação
        --------------------------------+-----------------------------------+-----------------------------------------
        Superior a R$500,00             |Até 3 anos (inclusive)             |2% do salário base mais R$ R$ 50,00 reais
                                        +-----------------------------------+-----------------------------------------
                                        |Mais de 3 anos                     |3% do salário base mais R$ 60,00 reais
        --------------------------------+-----------------------------------+-----------------------------------------
        Até R$ 500,00 (inclusive)       |Até 3 anos (inclusive)             |5% do salário base mais R$ 23 reais
                                        +-----------------------------------+-----------------------------------------
                                        |Entre 3 e 6 anos                   |6% do salário base mais R$ 35,00 reais
                                        +-----------------------------------+-----------------------------------------
                                        |De 6 anos para cima (inclusive)    |10% do salário base mais R$ 33 reais
        */

        /*
        c. Calcule o valor do auxilio alimentação:
        Tempo de Serviço             |Valor do auxilio alimentação
        -----------------------------+----------------------------
        Até 10 anos (inclusive)      |4% salário Base
        -----------------------------+----------------------------
        Mais de 10 anos              |6% salário Base
        */

        /*
        d. Calcule o salário líquido, subtraindo o imposto e somando a gratificação, o auxilio alimentação ao salário base.
        */

        System.out.printf("Informe o seu nome: ");
        Scanner leitor = new Scanner(System.in);
        final String nomeUsuario = leitor.nextLine();

        System.out.printf("Informe o seu salário-base: R$ ");
        final float salarioBase = leitor.nextFloat();

        System.out.printf("Informe o seu tempo de serviço na empresa: ");
        final int tempoServico = leitor.nextInt();
        leitor.close();

        final float imposto3 = 0.03f;
        final float imposto8 = 0.08f;
        final float imposto10 = 0.1f;
        final float imposto12 = 0.12f;

        final float gratificacao2 = 0.02f;
        final int gratificacao50 = 50;

        final float gratificacao3 = 0.03f;
        final int gratificacao60 = 60;

        final float gratificacao5 = 0.05f;
        final int gratificacao23 = 23;

        final float gratificacao6 = 0.06f;
        final int gratificacao35 = 35;

        final float gratificacao10 = 0.1f;
        final int gratificacao33 = 33;

        final float alimentacaoAte10anos = 0.04f;
        final float alimentacaoMaiorQue10anos = 0.06f;

        double imposto = 0, gratificacao = 0, auxilioAlimentacao = 0;

        if (salarioBase <= 200) { // Calcula o imposto
            imposto = 0;
        } else if (salarioBase > 200 && salarioBase <= 450) {
            imposto = salarioBase * imposto3;
        } else if (salarioBase > 450 && salarioBase < 700) {
            imposto = salarioBase * imposto8;
        } else if (salarioBase == 700) {
            imposto = salarioBase * imposto10;
        } else if (salarioBase > 700) {
            imposto = salarioBase * imposto12;
        } else {
            System.out.printf("Valor inválido. Encerrando operação...");
        }

        if (salarioBase > 500) { // Calcula a gratificação
            if (tempoServico <= 3) {
                gratificacao = salarioBase * gratificacao2;
                gratificacao = gratificacao + (float)gratificacao50;
            } else if (tempoServico > 3) {
                gratificacao = salarioBase * gratificacao3;
                gratificacao = gratificacao + (float)gratificacao60;
            }
        } else if (salarioBase <= 500) {
            if (tempoServico <= 3) {
                gratificacao = salarioBase * gratificacao5;
                gratificacao = gratificacao + (float)gratificacao23;
            } else if (tempoServico > 3 && tempoServico < 6) {
                gratificacao = salarioBase * gratificacao6;
                gratificacao = gratificacao + (float)gratificacao35;
            } else if (tempoServico >= 6) {
                gratificacao = salarioBase * gratificacao10;
                gratificacao = gratificacao + (float)gratificacao33;
            } else {
                System.out.printf("Valor inválido. Encerrando operação...");
            }
        }
        
        if (tempoServico <= 10) { // Calcula o auxílio alimentação
            auxilioAlimentacao = salarioBase * alimentacaoAte10anos;
        } else if (tempoServico > 10) {
            auxilioAlimentacao = salarioBase * alimentacaoMaiorQue10anos;
        } else {
            System.out.printf("Valor inválido. Encerrando operação...");
        }

        final double salarioLiquido = salarioBase - imposto + gratificacao + auxilioAlimentacao;
        System.out.printf("Olá, %s, seu salário líquido é de R$ %.2f.", nomeUsuario, salarioLiquido);
    }
}
