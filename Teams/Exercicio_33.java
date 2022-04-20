package teams;

import java.util.Scanner;

public class Exercicio_33 {
    public static void main(String[] args) {
        /*
        * Exercício 33) Faça um programa que receba:
        * - o código de um produto comprado, supondo que a digitação
        * do código do produto seja sempre válida, isso é, um número
        * inteiro entre 1 e 10;
        * - o peso do produto em quilos;
        * - o código do país de origem, supondo que a digitação do
        * código seja sempre válida, isso é, um número inteiro entre
        * 1 e 3.
        */

        // ENTRADAS
        System.out.println("Digite o código do produto:");
        Scanner leitor = new Scanner(System.in);
        final int codigoProduto = leitor.nextInt();

        System.out.println("Digite o peso do produto (em kg):");
        final float peso = leitor.nextFloat();

        System.out.println("Digite o código do país de origem:");
        final int codigoPais = leitor.nextInt();

        final int gramas = 1000;
        final double pesoGramas = peso * (float)gramas;
        System.out.printf("O peso do seu produto em gramas é %.0fg%n", pesoGramas);

        leitor.close();

        // PROCESSAMENTO
        double precoGramaFinal1 = 0, precoGramaFinal2 = 0, precoGramaFinal3 = 0;
        double novoPreco1 = 0, novoPreco2 = 0, novoPreco3 = 0, novoPreco = 0, novoPrecoTotal = 0;
        double valorcImposto1 = 0, valorcImposto2 = 0;

        switch (codigoProduto) {
            case 1:
            case 2:
            case 3:
            case 4:
                final int precopGrama1 = 10;
                precoGramaFinal1 = pesoGramas * (float)precopGrama1;
                // SAÍDA
                System.out.printf("O preço do produto é R$%.2f%n", precoGramaFinal1);
                novoPreco1 = precoGramaFinal1;
                break;
            case 5:
            case 6:
            case 7:
                final int precopGrama2 = 25;
                precoGramaFinal2 = pesoGramas * precopGrama2;
                // SAÍDA
                System.out.printf("O preço do produto é R$%.2f%n", precoGramaFinal2);
                novoPreco2 = precoGramaFinal2;
                break;
            case 8:
            case 9:
            case 10:
                final int precopGrama3 = 35;
                precoGramaFinal3 = pesoGramas * precopGrama3;
                // SAÍDA
                System.out.printf("O preço do produto é R$%.2f%n", precoGramaFinal3);
                novoPreco3 = precoGramaFinal3;
                break;
            default:
                break;
        }

        if (novoPreco1 != 0) {
            novoPreco = novoPreco1;
        } else if (novoPreco2 != 0) {
            novoPreco = novoPreco2;
        } else if (novoPreco3 != 0){
            novoPreco = novoPreco3;
        }

        switch (codigoPais) {
            case 1:
                // SAÍDA
                System.out.println("O valor do imposto é R$0,00");
                novoPrecoTotal = novoPreco;
                break;
            case 2:
                final float imposto1 = 0.15f;
                valorcImposto1 = novoPreco * imposto1;
                // SAÍDA
                System.out.printf("O valor do imposto é R$%.2f%n", valorcImposto1);
                valorcImposto1 = novoPreco + valorcImposto1;
                novoPrecoTotal = valorcImposto1;
                break;
            case 3:
                final float imposto2 = 0.25f;
                valorcImposto2 = novoPreco * imposto2;
                // SAÍDA
                System.out.printf("O valor do imposto é R$%.2f%n", valorcImposto2);
                valorcImposto2 = novoPreco + valorcImposto2;
                novoPrecoTotal = valorcImposto2;
                break;
        }

        // SAÍDA
        System.out.printf("O valor do produto é R$ %.2f e o preço total é R$ %.2f.", novoPreco, novoPrecoTotal);
    }
}
