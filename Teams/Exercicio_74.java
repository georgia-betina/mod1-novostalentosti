package Teams.d04_04;

import java.util.Scanner;

public class Exercicio_74 {
    public static void main(String[] args) {
        /*
         * 74)Faça um programa que receba o valor do
         * salário mínimo e uma lista contendo a quantidade
         * de quilowatts gasta por consumidor e o tipo do
         * consumidor (1-Residencial, 2-Comercial, 3-Industrial).
         * Calcule e mostre:
         * - O valor de cada quilowatt, sabendo que o quilowatt
         * custa 1/8 do salário mínimo;
         * - O valor a ser pago por cada consumidor (conta final
         * mais acréscimos), considerando que o acréscimo é o mesmo
         * da tabela a seguir:
         * 
         * ------------+-----------------------------------
         * Tipo | % de acréscimo sobre o valor gasto
         * ------------+-----------------------------------
         * 1 | 5
         * 2 | 10
         * 3 | 15
         * ------------+-----------------------------------
         * - O faturamento geral da empresa
         * - a quantidade de consumidores que pagam entre R$ 500,00
         * e R$ 1000,00
         * Termine a entrada de dados quando a quantidade de quilowatts
         * digitada for igual a zero.
         */

        float eSalarioMinimo = 0;
        float eQuilowattsGasto = 0;
        double faturamentoEmpresa = 0;
        int eCodigo = 0;
        int contador = 0;
        Scanner leitor = new Scanner(System.in);

        do {

            /* System.out.println("Olá! Informe seu nome: ");
            String eNomeUsuario = leitor.nextLine(); */

            System.out.printf("Informe o valor do salário mínimo: R$ ");
            eSalarioMinimo = leitor.nextFloat();

            System.out.printf("Informe a quantidade de quilowatts gasta: ");
            eQuilowattsGasto = leitor.nextFloat();

            if (eQuilowattsGasto != 0) {

                System.out.printf("Informe o dígito de acordo com o tipo:%n%n1 - Residencial%n2 - Comercial%n3 - Industrial%n%nCódigo: ");
                eCodigo = leitor.nextInt();

                final float pAcrescimo5 = 0.05f;
                final float pAcrescimo10 = 0.1f;
                final float pAcrescimo15 = 0.15f;

                final float pUmDivididoPorOito = 0.125f;
                double pValorQuilowatt = pUmDivididoPorOito * eSalarioMinimo;
                System.out.printf("O valor do quilowatt é R$ %.2f.%n", pValorQuilowatt);

                double pValorFinal = 0, pAplicaAcrescimo;

                switch (eCodigo) {
                    case 1:
                        pValorFinal = pValorQuilowatt * eQuilowattsGasto;
                        pAplicaAcrescimo = pValorFinal * pAcrescimo5;
                        pValorFinal = pValorFinal + pAplicaAcrescimo;
                        System.out.printf("Você deve pagar R$ %.2f%n%n", pValorFinal);
                        break;
                    case 2:
                        pValorFinal = pValorQuilowatt * eQuilowattsGasto;
                        pAplicaAcrescimo = pValorFinal * pAcrescimo10;
                        pValorFinal = pValorFinal + pAplicaAcrescimo;
                        System.out.printf("Você deve pagar R$ %.2f%n%n", pValorFinal);
                        break;
                    case 3:
                        pValorFinal = pValorQuilowatt * eQuilowattsGasto;
                        pAplicaAcrescimo = pValorFinal * pAcrescimo15;
                        pValorFinal = pValorFinal + pAplicaAcrescimo;
                        System.out.printf("Você deve pagar R$ %.2f%n%n", pValorFinal);
                        break;
                    default:
                        System.out.printf("Valor inválido.");
                }

                if (pValorFinal > 500 && pValorFinal < 1000) {
                    contador++;
                }
                faturamentoEmpresa += pValorFinal;
            }
        } while (eQuilowattsGasto != 0);
        leitor.close();

        System.out.printf("O faturamento geral da empresa é R$ %.2f e a quantidade de consumidores que pagam entre R$ 500 e R$ 1000 é %d", faturamentoEmpresa, contador);
    }
}
